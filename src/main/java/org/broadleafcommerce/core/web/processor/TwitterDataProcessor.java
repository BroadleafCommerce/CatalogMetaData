/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.web.processor;

import org.broadleafcommerce.seo.domain.catalog.TwitterDataImpl;
import org.springframework.stereotype.Component;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;
import org.thymeleaf.standard.expression.StandardExpressionProcessor;

/**
 * Processor that creates meta-tags with Twitter Data.
 *
 * This processor is to be used within <head></head> context.
 *
 * <ul>
 *  <li><b>twitterSite</b> - Optional, @username for the website used in the card footer..</li>
 *  <li><b>twitterCreator</b> - Optional, @username for the content creator / author.</li>
 *  <li><b>twitterCard</b> - Optional, If no twitter:card value is set, we will default to a summary card.</li>
 *  <li><b>twitterUrl</b> - Canonical URL of the card content.</li>
 *  <li><b>twitterTitle</b> - Title should be concise and will be truncated at 70 characters.</li>
 *  <li><b>twitterDescription</b> - A description that concisely summarizes the content of the page, as appropriate for presentation within a Tweet.</li>
 *  <li><b>twitterImage</b> - Optional, URL to a unique image representing the content of the page.</li>
 * </ul>
 *
 * @author Jerry Ocanas (jocanas)
 */
@Component("blTwitterDataProcessor")
public class TwitterDataProcessor extends AbstractElementProcessor {

    /**
     * Sets the name of this processor to be used in Thymeleaf template
     */
    public TwitterDataProcessor() {
        super("twitterdata");
    }

    @Override
    public int getPrecedence() {
        return 10000;
    }

    @Override
    protected ProcessorResult processElement(Arguments arguments, Element element) {

        String twitterDataAttribute = element.getAttributeValue("twitterData");
        String twitterCard = null;
        String twitterUrl = null;
        String twitterTitle = null;
        String twitterDescription = null;
        String twitterImage = null;
        String twitterSite = null;
        String twitterCreator = null;

        try {
            if(twitterDataAttribute != null){
                TwitterDataImpl twitterData = (TwitterDataImpl) StandardExpressionProcessor.processExpression(arguments, twitterDataAttribute);
                twitterCard = twitterData.getTwitterCard();
                twitterUrl = twitterData.getTwitterUrl();
                twitterTitle = twitterData.getTwitterTitle();
                twitterDescription = twitterData.getTwitterDescription();
                twitterImage = twitterData.getTwitterImage();
                twitterSite = twitterData.getTwitterSite();
                twitterCreator = twitterData.getTwitterCreator();
            }
        } catch (TemplateProcessingException e) {
            // Do nothing.
        }

        // Replace the <blc:twittercard> node with <meta> tags; include only if not null
        if(twitterCreator != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:creator", twitterCreator));
        }
        if(twitterSite != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:site", twitterSite));
        }
        if(twitterImage != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:image", twitterImage));
        }
        if(twitterDescription != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:description", twitterDescription));
        }
        if(twitterTitle != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:title", twitterTitle));
        }
        if(twitterUrl != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:url", twitterUrl));
        }
        if(twitterCard != null){
            element.getParent().insertAfter(element, createMetaTagElement("twitter:card", twitterCard));
        }
        element.getParent().removeChild(element);
        return ProcessorResult.OK;
    }

    protected Element createMetaTagElement(String name, String content){
        Element element = new Element("meta");
        element.setAttribute("name", name);
        element.setAttribute("content", content);
        element.setRecomputeProcessorsImmediately(true);
        return element;
    }

}
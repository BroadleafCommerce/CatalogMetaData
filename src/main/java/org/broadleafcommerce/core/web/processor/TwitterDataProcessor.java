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

import org.springframework.stereotype.Component;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.processor.ProcessorResult;
import org.thymeleaf.processor.element.AbstractElementProcessor;
import org.thymeleaf.standard.expression.StandardExpressionProcessor;

/**
 * Processor that creates meta-tags for a Twitter Card.
 *
 * This processor is to be used within <head></head> context.
 *
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

        String twitterCard = element.getAttributeValue("twitterCard");
        String twitterUrl = element.getAttributeValue("twitterUrl");
        String twitterTitle = element.getAttributeValue("twitterTitle");
        String twitterDescription = element.getAttributeValue("twitterDescription");
        String twitterImage = element.getAttributeValue("twitterImage");

        try {
            if(twitterCard != null){
                twitterCard = (String) StandardExpressionProcessor.processExpression(arguments, twitterCard);
            }
            if(twitterUrl != null){
                twitterUrl = (String) StandardExpressionProcessor.processExpression(arguments, twitterUrl);
            }
            if(twitterTitle != null){
                twitterTitle = (String) StandardExpressionProcessor.processExpression(arguments, twitterTitle);
            }
            if(twitterDescription != null){
                twitterDescription = (String) StandardExpressionProcessor.processExpression(arguments, twitterDescription);
            }
            if(twitterImage != null){
                twitterImage = (String) StandardExpressionProcessor.processExpression(arguments, twitterImage);
            }
        } catch (TemplateProcessingException e) {
            // Do nothing.
        }

        // Replace the <blc:twittercard> node with <meta> tags
        element.getParent().insertAfter(element, createMetaTagElement("twitter:image", twitterImage));
        element.getParent().insertAfter(element, createMetaTagElement("twitter:description", twitterDescription));
        element.getParent().insertAfter(element, createMetaTagElement("twitter:title", twitterTitle));
        element.getParent().insertAfter(element, createMetaTagElement("twitter:url", twitterUrl));
        element.getParent().insertAfter(element, createMetaTagElement("twitter:card", twitterCard));
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
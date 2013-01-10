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

package org.broadleafcommerce.seo.web.processor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.broadleafcommerce.seo.domain.catalog.SeoMetaData;
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
 *  <li><b>metaDescription</b> - Optional, Content for the Meta-Description tag</li>
 *  <li><b>metaKeywords</b> - Optional, Content for the Meta-Keywords tag</li>
 *  <li><b>metaRobot</b> - Optional, Content for the Meta-Robots tag</li>
 * </ul>
 *
 * @author Jerry Ocanas (jocanas)
 */
@Component("blSeoMetaDataProcessor")
public class SeoMetaDataProcessor extends AbstractElementProcessor {
    private static final Log LOG = LogFactory.getLog(SeoMetaDataProcessor.class);

    /**
     * Sets the name of this processor to be used in Thymeleaf template
     */
    public SeoMetaDataProcessor() {
        super("seometadata");
    }

    @Override
    public int getPrecedence() {
        return 10000;
    }

    @Override
    protected ProcessorResult processElement(Arguments arguments, Element element) {

        String seoMetaDataAttribute = element.getAttributeValue("seoMetaData");
        String metaDescription = null;
        String metaKeywords = null;
        String metaRobot = null;

        try {
            if (seoMetaDataAttribute != null) {
                SeoMetaData seoMetaData = (SeoMetaData) StandardExpressionProcessor.processExpression(arguments, seoMetaDataAttribute);
                if (seoMetaData != null) {
                    metaDescription = seoMetaData.getMetaDescription();
                    metaKeywords = seoMetaData.getMetaKeywords();
                    metaRobot = seoMetaData.getMetaRobot();
                }
            }
        } catch (TemplateProcessingException e) {
            LOG.error("Error processing expression", e);
        }

        // Replace the <blc:seometadata> node with <meta> tags; include only if not null
        if (metaRobot != null) {
            element.getParent().insertAfter(element, createMetaTagElement("robot", metaRobot));
        }
        if (metaKeywords != null) {
            element.getParent().insertAfter(element, createMetaTagElement("keywords", metaKeywords));
        }
        if (metaDescription != null) {
            element.getParent().insertAfter(element, createMetaTagElement("description", metaDescription));
        }
        element.getParent().removeChild(element);
        return ProcessorResult.OK;
    }

    protected Element createMetaTagElement(String name, String content) {
        Element element = new Element("meta");
        element.setAttribute("name", name);
        element.setAttribute("content", content);
        element.setRecomputeProcessorsImmediately(true);
        return element;
    }

}
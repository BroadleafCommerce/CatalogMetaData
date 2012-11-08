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

import org.broadleafcommerce.core.web.processor.extension.HeadProcessorExtensionListener;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.standard.expression.StandardExpressionProcessor;

import java.util.Map;

/**
 * An extension of the head processor that will add the Seo Meta Data fields to the head.
 * 
 * <ul>
 * 	<li><b>twitterCard</b> - Optional, If no twitter:card value is set, we will default to a summary card.</li>
 * 	<li><b>twitterUrl</b> - Canonical URL of the card content.</li>
 * 	<li><b>twitterTitle</b> - Title should be concise and will be truncated at 70 characters.</li>
 * 	<li><b>twitterDescription</b> - A description that concisely summarizes the content of the page, as appropriate for presentation within a Tweet.</li>
 * 	<li><b>twitterImage</b> - Optional, URL to a unique image representing the content of the page.</li>
 * </ul>
 * 
 * @author Jerry Ocanas (jocanas)
 */
public class TwitterCardHeadProcessorExtensionListener implements HeadProcessorExtensionListener {

    public void processAttributeValues(Arguments arguments, Element element) {

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

        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterCard", twitterCard);
        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterUrl", twitterUrl);
        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterTitle", twitterTitle);
        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterDescription", twitterDescription);
        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterImage", twitterImage);
    }

}

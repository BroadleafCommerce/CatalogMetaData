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
 * 	<li><b>metaDescription</b> - Optional, Content for the Meta-Description tag</li>
 * 	<li><b>metaKeywords</b> - Optional, Content for the Meta-Keywords tag</li>
 * 	<li><b>metaRobot</b> - Optional, Content for the Meta-Robots tag</li>
 * </ul>
 * 
 * @author Jerry Ocanas (jocanas)
 */
public class SeoMetaDataHeadProcessorExtensionListener implements HeadProcessorExtensionListener  {

    public void processAttributeValues(Arguments arguments, Element element) {
		String metaDescription = element.getAttributeValue("metaDescription");
		String metaKeywords = element.getAttributeValue("metaKeywords");
		String metaRobot = element.getAttributeValue("metaRobot");
		try {
            if(metaDescription != null){
                metaDescription = (String) StandardExpressionProcessor.processExpression(arguments, metaDescription);
            }
            if(metaKeywords != null){
                metaKeywords = (String) StandardExpressionProcessor.processExpression(arguments, metaKeywords);
            }
            if(metaRobot != null){
                metaRobot = (String) StandardExpressionProcessor.processExpression(arguments, metaRobot);
            }
		} catch (TemplateProcessingException e) {
			// Do nothing.
		}

        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("metaDescription", metaDescription);
		((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("metaKeywords", metaKeywords);
		((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("metaRobot", metaRobot);

    }

}

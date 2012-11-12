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
import org.broadleafcommerce.seo.domain.catalog.TwitterDataImpl;
import org.thymeleaf.Arguments;
import org.thymeleaf.dom.Element;
import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.standard.expression.StandardExpressionProcessor;

import java.util.Map;

/**
 * An extension of the head processor that will add the Twitter Data to the head context.
 * 
 * @author Jerry Ocanas (jocanas)
 */
public class TwitterDataHeadProcessorExtensionListener implements HeadProcessorExtensionListener {

    public void processAttributeValues(Arguments arguments, Element element) {

        String twitterDataAttribute = element.getAttributeValue("twitterData");
        TwitterDataImpl twitterData = null;

		try {
            if(twitterDataAttribute != null){
                twitterData = (TwitterDataImpl) StandardExpressionProcessor.processExpression(arguments, twitterDataAttribute);
            }
		} catch (TemplateProcessingException e) {
			// Do nothing.
		}

        ((Map<String, Object>) arguments.getExpressionEvaluationRoot()).put("twitterData", twitterData);

    }

}

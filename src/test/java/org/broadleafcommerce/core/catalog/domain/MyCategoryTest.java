/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.core.catalog.domain;

import junit.framework.TestCase;

/**
 * @author Jerry Ocanas (jocanas)
 */
public class MyCategoryTest extends TestCase {

    private MyCategoryImpl myCategory;

    private String metaDescription = "Meta Test Description";
    private String metaKeywords = "Meta, Keywords, Test";
    private String metaRobot = "NOINDEX, NOFOLLOW";
    private String titleFragment = "Test Title Fragment";

    private String twitterCard = "summary";
    private String twitterUrl = "http\\\\:www.test.com\\";
    private String twitterTitle = "Twitter Title Test";
    private String twitterDescription = "This is the brief description for the twitter card.";
    private String twitterImage = "http\\\\:www.someImage.com\\image.png";

    @Override
    protected void setUp() throws Exception {
        myCategory = new MyCategoryImpl();

        myCategory.setMetaDescription(metaDescription);
        myCategory.setMetaKeywords(metaKeywords);
        myCategory.setMetaRobot(metaRobot);
        myCategory.setTitleFragment(titleFragment);

        myCategory.setTwitterCard(twitterCard);
        myCategory.setTwitterUrl(twitterUrl);
        myCategory.setTwitterTitle(twitterTitle);
        myCategory.setTwitterDescription(twitterDescription);
        myCategory.setTwitterImage(twitterImage);

    }

    public void testSeoMetaFields() throws Exception{
        String testField;

        testField = myCategory.getMetaDescription();
        assertEquals(metaDescription, testField);

        testField = myCategory.getMetaKeywords();
        assertEquals(metaKeywords, testField);

        testField = myCategory.getMetaRobot();
        assertEquals(metaRobot, testField);

        testField = myCategory.getTitleFragment();
        assertEquals(titleFragment, testField);

    }

    public void testTwitterCardFields() throws Exception{
        String testField;

        testField = myCategory.getTwitterCard();
        assertEquals(twitterCard, testField);

        testField = myCategory.getTwitterUrl();
        assertEquals(twitterUrl, testField);

        testField = myCategory.getTwitterTitle();
        assertEquals(twitterTitle, testField);

        testField = myCategory.getTwitterDescription();
        assertEquals(twitterDescription, testField);

        testField = myCategory.getTwitterImage();
        assertEquals(twitterImage, testField);

    }
}

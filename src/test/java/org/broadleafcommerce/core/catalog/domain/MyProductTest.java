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
public class MyProductTest extends TestCase {

    private MyProductImpl myProduct;

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
        myProduct = new MyProductImpl();

        myProduct.setMetaDescription(metaDescription);
        myProduct.setMetaKeywords(metaKeywords);
        myProduct.setMetaRobot(metaRobot);
        myProduct.setTitleFragment(titleFragment);

        myProduct.setTwitterCard(twitterCard);
        myProduct.setTwitterUrl(twitterUrl);
        myProduct.setTwitterTitle(twitterTitle);
        myProduct.setTwitterDescription(twitterDescription);
        myProduct.setTwitterImage(twitterImage);

    }

    public void testSeoMetaFields() throws Exception{
        String testField;

        testField = myProduct.getMetaDescription();
        assertEquals(metaDescription, testField);

        testField = myProduct.getMetaKeywords();
        assertEquals(metaKeywords, testField);

        testField = myProduct.getMetaRobot();
        assertEquals(metaRobot, testField);

        testField = myProduct.getTitleFragment();
        assertEquals(titleFragment, testField);

    }

    public void testTwitterCardFields() throws Exception{
        String testField;

        testField = myProduct.getTwitterCard();
        assertEquals(twitterCard, testField);

        testField = myProduct.getTwitterUrl();
        assertEquals(twitterUrl, testField);

        testField = myProduct.getTwitterTitle();
        assertEquals(twitterTitle, testField);

        testField = myProduct.getTwitterDescription();
        assertEquals(twitterDescription, testField);

        testField = myProduct.getTwitterImage();
        assertEquals(twitterImage, testField);

    }

}

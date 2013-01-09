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


import org.broadleafcommerce.seo.domain.catalog.SeoMetaData;
import org.broadleafcommerce.seo.domain.catalog.TwitterData;
import org.broadleafcommerce.test.BaseTest;
import org.testng.annotations.Test;

/**
 * This test suite ensures that the JPA transformations are successfully performed
 * 
 * @author Andre Azzolini (apazzolini)
 */
public class ClassTransformationTest extends BaseTest {

    static {
        getModuleContexts().add("bl-seo-applicationContext.xml");
    }

    @Test(groups = { "testTransformations" })
    public void testSeoTransformations() {
        String metaDesc = "TestMetaDesc";
        String metaKeywords = "TestMetaKeywords";
        String metaRobot = "TestMetaRobot";
        String titleFragment = "TestTitleFragment";

        Product p = new ProductImpl();

        ((SeoMetaData) p).setMetaDescription(metaDesc);
        assert ((SeoMetaData) p).getMetaDescription().equals(metaDesc);

        ((SeoMetaData) p).setMetaKeywords(metaKeywords);
        assert ((SeoMetaData) p).getMetaKeywords().equals(metaKeywords);

        ((SeoMetaData) p).setMetaRobot(metaRobot);
        assert ((SeoMetaData) p).getMetaRobot().equals(metaRobot);

        ((SeoMetaData) p).setTitleFragment(titleFragment);
        assert ((SeoMetaData) p).getTitleFragment().equals(titleFragment);

        Category c = new CategoryImpl();

        ((SeoMetaData) c).setMetaDescription(metaDesc);
        assert ((SeoMetaData) c).getMetaDescription().equals(metaDesc);

        ((SeoMetaData) c).setMetaKeywords(metaKeywords);
        assert ((SeoMetaData) c).getMetaKeywords().equals(metaKeywords);

        ((SeoMetaData) c).setMetaRobot(metaRobot);
        assert ((SeoMetaData) c).getMetaRobot().equals(metaRobot);

        ((SeoMetaData) c).setTitleFragment(titleFragment);
        assert ((SeoMetaData) c).getTitleFragment().equals(titleFragment);
    }

    @Test(groups = { "testTransformations" })
    public void testTwitterTransformations() {
        String site = "TestSite";
        String creator = "TestCreator";
        String card = "TestCard";
        String url = "TestUrl";
        String title = "TestTitle";
        String description = "TestDescription";
        String image = "TestImage";

        Product p = new ProductImpl();

        ((TwitterData) p).setTwitterSite(site);
        assert ((TwitterData) p).getTwitterSite().equals(site);
        ((TwitterData) p).setTwitterCreator(creator);
        assert ((TwitterData) p).getTwitterCreator().equals(creator);
        ((TwitterData) p).setTwitterCard(card);
        assert ((TwitterData) p).getTwitterCard().equals(card);
        ((TwitterData) p).setTwitterUrl(url);
        assert ((TwitterData) p).getTwitterUrl().equals(url);
        ((TwitterData) p).setTwitterTitle(title);
        assert ((TwitterData) p).getTwitterTitle().equals(title);
        ((TwitterData) p).setTwitterDescription(description);
        assert ((TwitterData) p).getTwitterDescription().equals(description);
        ((TwitterData) p).setTwitterImage(image);
        assert ((TwitterData) p).getTwitterImage().equals(image);

        Category c = new CategoryImpl();

        ((TwitterData) c).setTwitterSite(site);
        assert ((TwitterData) c).getTwitterSite().equals(site);
        ((TwitterData) c).setTwitterCreator(creator);
        assert ((TwitterData) c).getTwitterCreator().equals(creator);
        ((TwitterData) c).setTwitterCard(card);
        assert ((TwitterData) c).getTwitterCard().equals(card);
        ((TwitterData) c).setTwitterUrl(url);
        assert ((TwitterData) c).getTwitterUrl().equals(url);
        ((TwitterData) c).setTwitterTitle(title);
        assert ((TwitterData) c).getTwitterTitle().equals(title);
        ((TwitterData) c).setTwitterDescription(description);
        assert ((TwitterData) c).getTwitterDescription().equals(description);
        ((TwitterData) c).setTwitterImage(image);
        assert ((TwitterData) c).getTwitterImage().equals(image);
    }

}

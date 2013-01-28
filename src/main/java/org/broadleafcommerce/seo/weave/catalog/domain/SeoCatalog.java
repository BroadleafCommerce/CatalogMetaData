package org.broadleafcommerce.seo.weave.catalog.domain;

import org.broadleafcommerce.seo.domain.catalog.SeoMetaData;
import org.broadleafcommerce.seo.domain.catalog.SeoMetaDataImpl;

import javax.annotation.Nullable;
import javax.persistence.Embedded;

/**
 * The template class that will be weaved in via JPA class transformation at runtime.
 * 
 * @author Andre Azzolini (apazzolini)
 */
public class SeoCatalog implements SeoMetaData {

    @Embedded
    protected SeoMetaDataImpl embeddableSeoMetaData = new SeoMetaDataImpl();

    @Override
    @Nullable
    public String getMetaDescription() {
        return embeddableSeoMetaData.getMetaDescription();
    }

    @Override
    public void setMetaDescription(@Nullable String metaDescription) {
        embeddableSeoMetaData.setMetaDescription(metaDescription);
    }

    @Override
    @Nullable
    public String getMetaKeywords() {
        return embeddableSeoMetaData.getMetaKeywords();
    }

    @Override
    public void setMetaKeywords(@Nullable String metaKeywords) {
        embeddableSeoMetaData.setMetaKeywords(metaKeywords);
    }

    @Override
    @Nullable
    public String getMetaRobot() {
        return embeddableSeoMetaData.getMetaRobot();
    }

    @Override
    public void setMetaRobot(@Nullable String metaRobot) {
        embeddableSeoMetaData.setMetaRobot(metaRobot);
    }

    @Override
    @Nullable
    public String getTitleFragment() {
        return embeddableSeoMetaData.getTitleFragment();
    }

    @Override
    public void setTitleFragment(@Nullable String titleFragment) {
        embeddableSeoMetaData.setTitleFragment(titleFragment);
    }

}

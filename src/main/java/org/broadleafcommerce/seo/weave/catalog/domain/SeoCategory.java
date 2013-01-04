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
public class SeoCategory implements SeoMetaData {

    @Embedded
    protected SeoMetaDataImpl embeddableSeoMetaData;

    @Override
    @Nullable
    public String getMetaDescription() {
        setSeoCategoryInitialValues();
        return embeddableSeoMetaData.getMetaDescription();
    }

    @Override
    public void setMetaDescription(@Nullable String metaDescription) {
        setSeoCategoryInitialValues();
        embeddableSeoMetaData.setMetaDescription(metaDescription);
    }

    @Override
    @Nullable
    public String getMetaKeywords() {
        setSeoCategoryInitialValues();
        return embeddableSeoMetaData.getMetaKeywords();
    }

    @Override
    public void setMetaKeywords(@Nullable String metaKeywords) {
        setSeoCategoryInitialValues();
        embeddableSeoMetaData.setMetaKeywords(metaKeywords);
    }

    @Override
    @Nullable
    public String getMetaRobot() {
        setSeoCategoryInitialValues();
        return embeddableSeoMetaData.getMetaRobot();
    }

    @Override
    public void setMetaRobot(@Nullable String metaRobot) {
        setSeoCategoryInitialValues();
        embeddableSeoMetaData.setMetaRobot(metaRobot);
    }

    @Override
    @Nullable
    public String getTitleFragment() {
        setSeoCategoryInitialValues();
        return embeddableSeoMetaData.getTitleFragment();
    }

    @Override
    public void setTitleFragment(@Nullable String titleFragment) {
        setSeoCategoryInitialValues();
        embeddableSeoMetaData.setTitleFragment(titleFragment);
    }

    protected void setSeoCategoryInitialValues() {
        if (embeddableSeoMetaData == null) {
            embeddableSeoMetaData = new SeoMetaDataImpl();
        }
    }

}

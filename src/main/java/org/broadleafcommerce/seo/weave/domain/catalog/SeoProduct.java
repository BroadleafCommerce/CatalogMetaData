package org.broadleafcommerce.seo.weave.domain.catalog;

import org.broadleafcommerce.seo.domain.catalog.SeoMetaData;
import org.broadleafcommerce.seo.domain.catalog.SeoMetaDataImpl;

import javax.annotation.Nullable;
import javax.persistence.Embedded;

/**
 * @author Jerry Ocanas (jocanas)
 */
public class SeoProduct implements SeoMetaData {

    @Embedded
    protected SeoMetaDataImpl embeddableSeoMetaData;

    @Override
    @Nullable
    public String getMetaDescription() {
        setSeoProductInitialValues();
        return embeddableSeoMetaData.getMetaDescription();
    }

    @Override
    public void setMetaDescription(@Nullable String metaDescription) {
        setSeoProductInitialValues();
        embeddableSeoMetaData.setMetaDescription(metaDescription);
    }

    @Override
    @Nullable
    public String getMetaKeywords() {
        setSeoProductInitialValues();
        return embeddableSeoMetaData.getMetaKeywords();
    }

    @Override
    public void setMetaKeywords(@Nullable String metaKeywords) {
        setSeoProductInitialValues();
        embeddableSeoMetaData.setMetaKeywords(metaKeywords);
    }

    @Override
    @Nullable
    public String getMetaRobot() {
        setSeoProductInitialValues();
        return embeddableSeoMetaData.getMetaRobot();
    }

    @Override
    public void setMetaRobot(@Nullable String metaRobot) {
        setSeoProductInitialValues();
        embeddableSeoMetaData.setMetaRobot(metaRobot);
    }

    @Override
    @Nullable
    public String getTitleFragment() {
        setSeoProductInitialValues();
        return embeddableSeoMetaData.getTitleFragment();
    }

    @Override
    public void setTitleFragment(@Nullable String titleFragment) {
        setSeoProductInitialValues();
        embeddableSeoMetaData.setTitleFragment(titleFragment);
    }
    
    protected void setSeoProductInitialValues() {
        if (embeddableSeoMetaData == null) {
            embeddableSeoMetaData = new SeoMetaDataImpl();
        }
    }

}

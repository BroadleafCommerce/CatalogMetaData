
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

    protected SeoMetaData getEmbeddableSeoMetaData() {
        if (embeddableSeoMetaData == null) {
            embeddableSeoMetaData = new SeoMetaDataImpl();
        }
        return embeddableSeoMetaData;
    }

    @Override
    @Nullable
    public String getMetaDescription() {
        return getEmbeddableSeoMetaData().getMetaDescription();
    }

    @Override
    public void setMetaDescription(@Nullable String metaDescription) {
        getEmbeddableSeoMetaData().setMetaDescription(metaDescription);
    }

    @Override
    @Nullable
    public String getMetaKeywords() {
        return getEmbeddableSeoMetaData().getMetaKeywords();
    }

    @Override
    public void setMetaKeywords(@Nullable String metaKeywords) {
        getEmbeddableSeoMetaData().setMetaKeywords(metaKeywords);
    }

    @Override
    @Nullable
    public String getMetaRobot() {
        return getEmbeddableSeoMetaData().getMetaRobot();
    }

    @Override
    public void setMetaRobot(@Nullable String metaRobot) {
        getEmbeddableSeoMetaData().setMetaRobot(metaRobot);
    }

    @Override
    @Nullable
    public String getTitleFragment() {
        return getEmbeddableSeoMetaData().getTitleFragment();
    }

    @Override
    public void setTitleFragment(@Nullable String titleFragment) {
        getEmbeddableSeoMetaData().setTitleFragment(titleFragment);
    }

}

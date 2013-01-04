package org.broadleafcommerce.seo.weave.catalog.domain;

import org.broadleafcommerce.seo.domain.catalog.TwitterData;
import org.broadleafcommerce.seo.domain.catalog.TwitterDataImpl;

import javax.annotation.Nullable;
import javax.persistence.Embedded;

/**
 * The template class that will be weaved in via JPA class transformation at runtime.
 * 
 * @author Andre Azzolini (apazzolini)
 */
public class TwitterProduct implements TwitterData {

    @Embedded
    protected TwitterData embeddableTwitterData;

    @Override
    public String getTwitterSite() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterSite();
    }

    @Override
    public void setTwitterSite(@Nullable String twitterSite) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterSite(twitterSite);
    }

    @Override
    public String getTwitterCreator() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterCreator();
    }

    @Override
    public void setTwitterCreator(@Nullable String twitterCreator) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterCreator(twitterCreator);
    }

    @Override
    @Nullable
    public String getTwitterCard() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterCard();
    }

    @Override
    public void setTwitterCard(@Nullable String twitterCard) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterCard(twitterCard);
    }

    @Override
    @Nullable
    public String getTwitterUrl() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterUrl();
    }

    @Override
    public void setTwitterUrl(@Nullable String twitterUrl) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterUrl(twitterUrl);
    }

    @Override
    @Nullable
    public String getTwitterTitle() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterTitle();
    }

    @Override
    public void setTwitterTitle(@Nullable String twitterTitle) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterTitle(twitterTitle);
    }

    @Override
    @Nullable
    public String getTwitterDescription() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterDescription();
    }

    @Override
    public void setTwitterDescription(@Nullable String twitterDescription) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterDescription(twitterDescription);
    }

    @Override
    @Nullable
    public String getTwitterImage() {
        setTwitterProductInitialValues();
        return embeddableTwitterData.getTwitterImage();
    }

    @Override
    public void setTwitterImage(@Nullable String twitterImage) {
        setTwitterProductInitialValues();
        embeddableTwitterData.setTwitterImage(twitterImage);
    }
    
    protected void setTwitterProductInitialValues() {
        if (embeddableTwitterData == null) {
            embeddableTwitterData = new TwitterDataImpl();
        }
    }

}

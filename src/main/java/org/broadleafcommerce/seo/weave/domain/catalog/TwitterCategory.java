package org.broadleafcommerce.seo.weave.domain.catalog;

import org.broadleafcommerce.seo.domain.catalog.TwitterData;
import org.broadleafcommerce.seo.domain.catalog.TwitterDataImpl;

import javax.annotation.Nullable;
import javax.persistence.Embedded;

/**
 * @author Jerry Ocanas (jocanas)
 */
public class TwitterCategory implements TwitterData {

    @Embedded
    protected TwitterDataImpl embeddableTwitterData;

    @Override
    public String getTwitterSite() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterSite();
    }

    @Override
    public void setTwitterSite(@Nullable String twitterSite) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterSite(twitterSite);
    }

    @Override
    public String getTwitterCreator() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterCreator();
    }

    @Override
    public void setTwitterCreator(@Nullable String twitterCreator) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterCreator(twitterCreator);
    }

    @Override
    @Nullable
    public String getTwitterCard() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterCard();
    }

    @Override
    public void setTwitterCard(@Nullable String twitterCard) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterCard(twitterCard);
    }

    @Override
    @Nullable
    public String getTwitterUrl() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterUrl();
    }

    @Override
    public void setTwitterUrl(@Nullable String twitterUrl) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterUrl(twitterUrl);
    }

    @Override
    @Nullable
    public String getTwitterTitle() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterTitle();
    }

    @Override
    public void setTwitterTitle(@Nullable String twitterTitle) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterTitle(twitterTitle);
    }

    @Override
    @Nullable
    public String getTwitterDescription() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterDescription();
    }

    @Override
    public void setTwitterDescription(@Nullable String twitterDescription) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterDescription(twitterDescription);
    }

    @Override
    @Nullable
    public String getTwitterImage() {
        setTwitterCategoryInitialValues();
        return embeddableTwitterData.getTwitterImage();
    }

    @Override
    public void setTwitterImage(@Nullable String twitterImage) {
        setTwitterCategoryInitialValues();
        embeddableTwitterData.setTwitterImage(twitterImage);
    }
    
    protected void setTwitterCategoryInitialValues() {
        if (embeddableTwitterData == null) {
            embeddableTwitterData = new TwitterDataImpl();
        }
    }
}

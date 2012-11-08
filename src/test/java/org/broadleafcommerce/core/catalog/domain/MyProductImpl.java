package org.broadleafcommerce.core.catalog.domain;

import org.broadleafcommerce.seo.domain.catalog.SeoMetaData;
import org.broadleafcommerce.seo.domain.catalog.SeoMetaDataImpl;
import org.broadleafcommerce.seo.domain.catalog.TwitterCard;
import org.broadleafcommerce.seo.domain.catalog.TwitterCardImpl;
import org.hibernate.annotations.Entity;

import javax.annotation.Nullable;
import javax.persistence.Embedded;

/**
 * @author Jerry Ocanas (jocanas)
 */
@Entity
public class MyProductImpl extends ProductImpl implements Product, SeoMetaData, TwitterCard {

    @Embedded
    protected SeoMetaData embeddableSeoMetaData = new SeoMetaDataImpl();

    @Embedded
    protected TwitterCard embeddableTwitterCard = new TwitterCardImpl();

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

    @Override
    @Nullable
    public String getTwitterCard() {
        return embeddableTwitterCard.getTwitterCard();
    }

    @Override
    public void setTwitterCard(@Nullable String twitterCard) {
        embeddableTwitterCard.setTwitterCard(twitterCard);
    }

    @Override
    @Nullable
    public String getTwitterUrl() {
        return embeddableTwitterCard.getTwitterUrl();
    }

    @Override
    public void setTwitterUrl(@Nullable String twitterUrl) {
        embeddableTwitterCard.setTwitterUrl(twitterUrl);
    }

    @Override
    @Nullable
    public String getTwitterTitle() {
        return embeddableTwitterCard.getTwitterTitle();
    }

    @Override
    public void setTwitterTitle(@Nullable String twitterTitle) {
        embeddableTwitterCard.setTwitterTitle(twitterTitle);
    }

    @Override
    @Nullable
    public String getTwitterDescription() {
        return embeddableTwitterCard.getTwitterDescription();
    }

    @Override
    public void setTwitterDescription(@Nullable String twitterDescription) {
        embeddableTwitterCard.setTwitterDescription(twitterDescription);
    }

    @Override
    @Nullable
    public String getTwitterImage() {
        return embeddableTwitterCard.getTwitterImage();
    }

    @Override
    public void setTwitterImage(@Nullable String twitterImage) {
        embeddableTwitterCard.setTwitterImage(twitterImage);
    }
}

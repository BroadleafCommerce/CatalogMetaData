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
public class TwitterCatalog implements TwitterData {

    @Embedded
    protected TwitterDataImpl embeddableTwitterData = new TwitterDataImpl();
    
    protected TwitterData getEmbeddableTwitterData() {
    	if (embeddableTwitterData == null) {
    		embeddableTwitterData = new TwitterDataImpl();
    	}
    	return embeddableTwitterData;
    }

    @Override
    public String getTwitterSite() {
        return getEmbeddableTwitterData().getTwitterSite();
    }

    @Override
    public void setTwitterSite(@Nullable String twitterSite) {
    	getEmbeddableTwitterData().setTwitterSite(twitterSite);
    }

    @Override
    public String getTwitterCreator() {
        return getEmbeddableTwitterData().getTwitterCreator();
    }

    @Override
    public void setTwitterCreator(@Nullable String twitterCreator) {
    	getEmbeddableTwitterData().setTwitterCreator(twitterCreator);
    }

    @Override
    @Nullable
    public String getTwitterCard() {
        return getEmbeddableTwitterData().getTwitterCard();
    }

    @Override
    public void setTwitterCard(@Nullable String twitterCard) {
    	getEmbeddableTwitterData().setTwitterCard(twitterCard);
    }

    @Override
    @Nullable
    public String getTwitterUrl() {
        return getEmbeddableTwitterData().getTwitterUrl();
    }

    @Override
    public void setTwitterUrl(@Nullable String twitterUrl) {
    	getEmbeddableTwitterData().setTwitterUrl(twitterUrl);
    }

    @Override
    @Nullable
    public String getTwitterTitle() {
        return getEmbeddableTwitterData().getTwitterTitle();
    }

    @Override
    public void setTwitterTitle(@Nullable String twitterTitle) {
    	getEmbeddableTwitterData().setTwitterTitle(twitterTitle);
    }

    @Override
    @Nullable
    public String getTwitterDescription() {
        return getEmbeddableTwitterData().getTwitterDescription();
    }

    @Override
    public void setTwitterDescription(@Nullable String twitterDescription) {
    	getEmbeddableTwitterData().setTwitterDescription(twitterDescription);
    }

    @Override
    @Nullable
    public String getTwitterImage() {
        return getEmbeddableTwitterData().getTwitterImage();
    }

    @Override
    public void setTwitterImage(@Nullable String twitterImage) {
    	getEmbeddableTwitterData().setTwitterImage(twitterImage);
    }
    
}

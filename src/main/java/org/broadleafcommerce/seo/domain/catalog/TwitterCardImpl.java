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

package org.broadleafcommerce.seo.domain.catalog;

import org.broadleafcommerce.common.presentation.AdminPresentation;

import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Jerry Ocanas (jocanas)
 */
@Embeddable
public class TwitterCardImpl implements TwitterCard {

    @Column(name = "TWITTER_CARD")
    @AdminPresentation(friendlyName = "TwitterCardImpl_TwitterCard", order=21, group = "Seo_Properties")
    protected String twitterCard;

    @Column(name = "TWITTER_URL")
    @AdminPresentation(friendlyName = "TwitterCardImpl_TwitterUrl", order=22, group = "Seo_Properties")
    protected String twitterUrl;

    @Column(name = "TWITTER_TITLE")
    @AdminPresentation(friendlyName = "TwitterCardImpl_TwitterTitle", order=23, group = "Seo_Properties")
    protected String twitterTitle;

    @Column(name = "TWITTER_DESCRIPTION")
    @AdminPresentation(friendlyName = "TwitterCardImpl_TwitterDescription", order=24, group = "Seo_Properties")
    protected String twitterDescription;

    @Column(name = "TWITTER_IMAGE")
    @AdminPresentation(friendlyName = "TwitterCardImpl_TwitterImage", order=25, group = "Seo_Properties")
    protected String twitterImage;

    @Override
    @Nullable
    public String getTwitterCard() {
        return twitterCard;
    }

    @Override
    public void setTwitterCard(@Nullable String twitterCard) {
        this.twitterCard = twitterCard;
    }

    @Override
    @Nullable
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @Override
    public void setTwitterUrl(@Nullable String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @Override
    @Nullable
    public String getTwitterTitle() {
        return twitterTitle;
    }

    @Override
    public void setTwitterTitle(@Nullable String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    @Override
    @Nullable
    public String getTwitterDescription() {
        return twitterDescription;
    }

    @Override
    public void setTwitterDescription(@Nullable String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    @Override
    @Nullable
    public String getTwitterImage() {
        return twitterImage;
    }

    @Override
    public void setTwitterImage(@Nullable String twitterImage) {
        this.twitterImage = twitterImage;
    }
}

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

import java.io.Serializable;

import javax.annotation.Nullable;

/**
 * @author Jerry Ocanas (jocanas)
 */
public interface TwitterData extends Serializable {

    /**
     * Gets the twitter:site content.
     *
     * @return twitterSite
     */
    @Nullable
    public String getTwitterSite();

    /**
     * Sets the twitter:site content.
     *
     * @param twitterSite
     */
    public void setTwitterSite(@Nullable String twitterSite);

    /**
     * Gets the twitter:creator content.
     *
     * @return twitterCreator
     */
    @Nullable
    public String getTwitterCreator();

    /**
     * Sets the twitter:creator content.
     *
     * @param twitterCreator
     */
    public void setTwitterCreator(@Nullable String twitterCreator);

    /**
     * Gets the twitter:card content.
     *
     * @return twitterCard
     */
    @Nullable
    public String getTwitterCard();

    /**
     * Sets the twitter:card content.
     *
     * @param twitterCard
     */
    public void setTwitterCard(@Nullable String twitterCard);

    /**
     * Gets the twitter:url content.
     *
     * @return twitterUrl
     */
    @Nullable
    public String getTwitterUrl();

    /**
     * Sets the twitter:url content.
     *
     * @param twitterUrl
     */
    public void setTwitterUrl(@Nullable String twitterUrl);

    /**
     * Gets the twitter:title content.
     *
     * @return twitterTitle
     */
    @Nullable
    public String getTwitterTitle();

    /**
     * Sets the twitter:url content.
     *
     * @param twitterTitle
     */
    public void setTwitterTitle(@Nullable String twitterTitle);

    /**
     * Gets the twitter:description content.
     *
     * @return twitterDescription
     */
    @Nullable
    public String getTwitterDescription();

    /**
     * Sets the twitter:description content.
     *
     * @param twitterDescription
     */
    public void setTwitterDescription(@Nullable String twitterDescription);

    /**
     * Gets the twitter:image content.
     *
     * @return twitterImage
     */
    @Nullable
    public String getTwitterImage();

    /**
     * Sets the twitter:image content.
     *
     * @param twitterImage
     */
    public void setTwitterImage(@Nullable String twitterImage);
}

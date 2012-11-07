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

import javax.annotation.Nullable;

/**
 * @author Jerry Ocanas (jocanas)
 */
public interface TwitterCard {

    @Nullable
    public String getTwitterCard();

    public void setTwitterCard(@Nullable String twitterCard);

    @Nullable
    public String getTwitterUrl();

    public void setTwitterUrl(@Nullable String twitterUrl);

    @Nullable
    public String getTwitterTitle();

    public void setTwitterTitle(@Nullable String twitterTitle);

    @Nullable
    public String getTwitterDescription();

    public void setTwitterDescription(@Nullable String twitterDescription);

    @Nullable
    public String getTwitterImage();

    public void setTwitterImage(@Nullable String twitterImage);
}

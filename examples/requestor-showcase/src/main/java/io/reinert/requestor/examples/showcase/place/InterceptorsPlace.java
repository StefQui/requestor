/*
 * Copyright 2014 Danilo Reinert
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.reinert.requestor.examples.showcase.place;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.Place;

import io.reinert.requestor.examples.showcase.HasActivity;
import io.reinert.requestor.examples.showcase.HasToken;
import io.reinert.requestor.examples.showcase.MenuOption;
import io.reinert.requestor.examples.showcase.Showcase;
import io.reinert.requestor.examples.showcase.activity.InterceptorsActivity;

public class InterceptorsPlace extends Place implements HasActivity, HasToken {

    public static InterceptorsPlace INSTANCE = new InterceptorsPlace();

    @Override
    public Activity getActivity() {
        return new InterceptorsActivity(Showcase.SHOWCASE_CLIENT_FACTORY.getInterceptors(),
                Showcase.SHOWCASE_CLIENT_FACTORY.getRequestor());
    }

    @Override
    public String getToken() {
        return MenuOption.Tokens.INTERCEPTORS_TOKEN;
    }
}

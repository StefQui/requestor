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
package io.reinert.requestor.header;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * @author Danilo Reinert
 */
public class QualityFactorHeaderTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "io.reinert.requestor.RequestorApiTest";
    }

    public void testGetValue() {
        final String expected = "a/b, x/y+z; 0.2, k/l, n/m; 0.6";
        final QualityFactorHeader header = new QualityFactorHeader("ign", "a/b", 1, "x/y+z", 0.2, "k/l", 1, "n/m", 0.6);
        assertEquals(expected, header.getValue());
    }
}

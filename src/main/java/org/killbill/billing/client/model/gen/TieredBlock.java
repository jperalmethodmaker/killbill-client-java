/*
 * Copyright 2010-2014 Ning, Inc.
 * Copyright 2014-2020 Groupon, Inc
 * Copyright 2020-2021 Equinix, Inc
 * Copyright 2014-2021 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */


package org.killbill.billing.client.model.gen;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.killbill.billing.client.model.gen.Price;

/**
 *           DO NOT EDIT !!!
 *
 * This code has been generated by the Kill Bill swagger generator.
 *  @See https://github.com/killbill/killbill-swagger-coden
 */
import org.killbill.billing.client.model.KillBillObject;

public class TieredBlock {

    private String unit = null;

    private String size = null;

    private String max = null;

    private List<Price> prices = null;


    public TieredBlock() {
    }

    public TieredBlock(final String unit,
                     final String size,
                     final String max,
                     final List<Price> prices) {
        this.unit = unit;
        this.size = size;
        this.max = max;
        this.prices = prices;

    }


    public TieredBlock setUnit(final String unit) {
        this.unit = unit;
        return this;
    }

    public String getUnit() {
        return unit;
    }

    public TieredBlock setSize(final String size) {
        this.size = size;
        return this;
    }

    public String getSize() {
        return size;
    }

    public TieredBlock setMax(final String max) {
        this.max = max;
        return this;
    }

    public String getMax() {
        return max;
    }

    public TieredBlock setPrices(final List<Price> prices) {
        this.prices = prices;
        return this;
    }

    public TieredBlock addPricesItem(final Price pricesItem) {
        if (this.prices == null) {
            this.prices = new ArrayList<Price>();
        }
        this.prices.add(pricesItem);
        return this;
    }

    public List<Price> getPrices() {
        return prices;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TieredBlock tieredBlock = (TieredBlock) o;
        return Objects.equals(this.unit, tieredBlock.unit) &&
            Objects.equals(this.size, tieredBlock.size) &&
            Objects.equals(this.max, tieredBlock.max) &&
            Objects.equals(this.prices, tieredBlock.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit,
            size,
            max,
            prices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TieredBlock {\n");
        
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    max: ").append(toIndentedString(max)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


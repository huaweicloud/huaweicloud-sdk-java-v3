package com.huaweicloud.sdk.aos.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aos.v1.model.ItemsResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class EstimateExecutionPlanPriceResponse extends SdkResponse {

    /**
     * 币种，枚举值   CNY  元，中国站返回的币种   USD 美元，国际站返回的币种
     */
    public static final class CurrencyEnum {

        
        /**
         * Enum CNY for value: "CNY"
         */
        public static final CurrencyEnum CNY = new CurrencyEnum("CNY");
        
        /**
         * Enum USD for value: "USD"
         */
        public static final CurrencyEnum USD = new CurrencyEnum("USD");
        

        private static final Map<String, CurrencyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CurrencyEnum> createStaticFields() {
            Map<String, CurrencyEnum> map = new HashMap<>();
            map.put("CNY", CNY);
            map.put("USD", USD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CurrencyEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CurrencyEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CurrencyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CurrencyEnum(value);
            }
            return result;
        }

        public static CurrencyEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CurrencyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CurrencyEnum) {
                return this.value.equals(((CurrencyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    
    private CurrencyEnum currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    
    private List<ItemsResponse> items = null;
    
    public EstimateExecutionPlanPriceResponse withCurrency(CurrencyEnum currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * 币种，枚举值   CNY  元，中国站返回的币种   USD 美元，国际站返回的币种
     * @return currency
     */
    public CurrencyEnum getCurrency() {
        return currency;
    }

    public void setCurrency(CurrencyEnum currency) {
        this.currency = currency;
    }

    

    public EstimateExecutionPlanPriceResponse withItems(List<ItemsResponse> items) {
        this.items = items;
        return this;
    }

    
    public EstimateExecutionPlanPriceResponse addItemsItem(ItemsResponse itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public EstimateExecutionPlanPriceResponse withItems(Consumer<List<ItemsResponse>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 执行计划中所有资源的询价结果
     * @return items
     */
    public List<ItemsResponse> getItems() {
        return items;
    }

    public void setItems(List<ItemsResponse> items) {
        this.items = items;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EstimateExecutionPlanPriceResponse estimateExecutionPlanPriceResponse = (EstimateExecutionPlanPriceResponse) o;
        return Objects.equals(this.currency, estimateExecutionPlanPriceResponse.currency) &&
            Objects.equals(this.items, estimateExecutionPlanPriceResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currency, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EstimateExecutionPlanPriceResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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


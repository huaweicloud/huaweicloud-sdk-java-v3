package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSummaryRequest  {

    /**
     * Gets or Sets range
     */
    public static class RangeEnum {

        
        /**
         * Enum WEEK for value: "week"
         */
        public static final RangeEnum WEEK = new RangeEnum("week");
        
        /**
         * Enum MONTH for value: "month"
         */
        public static final RangeEnum MONTH = new RangeEnum("month");
        

        public static final Map<String, RangeEnum> staticFields = new HashMap<String, RangeEnum>() {
            { 
                put("week", WEEK);
                put("month", MONTH);
            }
        };

        private String value;

        RangeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RangeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RangeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new RangeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static RangeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RangeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RangeEnum) {
                return this.value.equals(((RangeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="range")
    
    private RangeEnum range;

    public ListSummaryRequest withRange(RangeEnum range) {
        this.range = range;
        return this;
    }

    


    /**
     * Get range
     * @return range
     */
    public RangeEnum getRange() {
        return range;
    }

    public void setRange(RangeEnum range) {
        this.range = range;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSummaryRequest listSummaryRequest = (ListSummaryRequest) o;
        return Objects.equals(this.range, listSummaryRequest.range);
    }
    @Override
    public int hashCode() {
        return Objects.hash(range);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSummaryRequest {\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
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


package com.huaweicloud.sdk.cdn.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * RangeStatusRequest
 */
public class RangeStatusRequest  {

    /**
     * range状态（\"off\"/\"on\"）
     */
    public static final class RangeStatusEnum {

        
        /**
         * Enum OFF for value: "off"
         */
        public static final RangeStatusEnum OFF = new RangeStatusEnum("off");
        
        /**
         * Enum ON for value: "on"
         */
        public static final RangeStatusEnum ON = new RangeStatusEnum("on");
        

        private static final Map<String, RangeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RangeStatusEnum> createStaticFields() {
            Map<String, RangeStatusEnum> map = new HashMap<>();
            map.put("off", OFF);
            map.put("on", ON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RangeStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RangeStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RangeStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RangeStatusEnum(value);
            }
            return result;
        }

        public static RangeStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RangeStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RangeStatusEnum) {
                return this.value.equals(((RangeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="range_status")
    
    private RangeStatusEnum rangeStatus;

    public RangeStatusRequest withRangeStatus(RangeStatusEnum rangeStatus) {
        this.rangeStatus = rangeStatus;
        return this;
    }

    


    /**
     * range状态（\"off\"/\"on\"）
     * @return rangeStatus
     */
    public RangeStatusEnum getRangeStatus() {
        return rangeStatus;
    }

    public void setRangeStatus(RangeStatusEnum rangeStatus) {
        this.rangeStatus = rangeStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RangeStatusRequest rangeStatusRequest = (RangeStatusRequest) o;
        return Objects.equals(this.rangeStatus, rangeStatusRequest.rangeStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rangeStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RangeStatusRequest {\n");
        sb.append("    rangeStatus: ").append(toIndentedString(rangeStatus)).append("\n");
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


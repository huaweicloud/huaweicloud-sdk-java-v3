package com.huaweicloud.sdk.cbr.v1.model;




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
 * BillingUpdate
 */
public class BillingUpdate  {

    /**
     * 存储库规格
     */
    public static final class ConsistentLevelEnum {

        
        /**
         * Enum APP_CONSISTENT for value: "app_consistent"
         */
        public static final ConsistentLevelEnum APP_CONSISTENT = new ConsistentLevelEnum("app_consistent");
        
        /**
         * Enum CRASH_CONSISTENT for value: "crash_consistent"
         */
        public static final ConsistentLevelEnum CRASH_CONSISTENT = new ConsistentLevelEnum("crash_consistent");
        

        private static final Map<String, ConsistentLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistentLevelEnum> createStaticFields() {
            Map<String, ConsistentLevelEnum> map = new HashMap<>();
            map.put("app_consistent", APP_CONSISTENT);
            map.put("crash_consistent", CRASH_CONSISTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistentLevelEnum(String value) {
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
        public static ConsistentLevelEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ConsistentLevelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConsistentLevelEnum(value);
            }
            return result;
        }

        public static ConsistentLevelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ConsistentLevelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ConsistentLevelEnum) {
                return this.value.equals(((ConsistentLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consistent_level")
    
    private ConsistentLevelEnum consistentLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public BillingUpdate withConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
        return this;
    }

    


    /**
     * 存储库规格
     * @return consistentLevel
     */
    public ConsistentLevelEnum getConsistentLevel() {
        return consistentLevel;
    }

    public void setConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
    }

    public BillingUpdate withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 存储库大小，单位为GB
     * minimum: 1
     * maximum: 10485760
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUpdate billingUpdate = (BillingUpdate) o;
        return Objects.equals(this.consistentLevel, billingUpdate.consistentLevel) &&
            Objects.equals(this.size, billingUpdate.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(consistentLevel, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUpdate {\n");
        sb.append("    consistentLevel: ").append(toIndentedString(consistentLevel)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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


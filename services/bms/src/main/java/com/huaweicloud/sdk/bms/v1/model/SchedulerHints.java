package com.huaweicloud.sdk.bms.v1.model;




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
 * schedulerHints字段数据结构说明
 */
public class SchedulerHints  {

    /**
     * 是否在专属云中创建裸金属服务器，参数值为share或dedicate。约束：该值不传时默认为share。在专属云中创建裸金属服务器时，必须指定该字段为dedicate。
     */
    public static final class DecBaremetalEnum {

        
        /**
         * Enum SHARE for value: "share"
         */
        public static final DecBaremetalEnum SHARE = new DecBaremetalEnum("share");
        
        /**
         * Enum DEDICATE for value: "dedicate"
         */
        public static final DecBaremetalEnum DEDICATE = new DecBaremetalEnum("dedicate");
        

        private static final Map<String, DecBaremetalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DecBaremetalEnum> createStaticFields() {
            Map<String, DecBaremetalEnum> map = new HashMap<>();
            map.put("share", SHARE);
            map.put("dedicate", DEDICATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DecBaremetalEnum(String value) {
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
        public static DecBaremetalEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            DecBaremetalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DecBaremetalEnum(value);
            }
            return result;
        }

        public static DecBaremetalEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DecBaremetalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DecBaremetalEnum) {
                return this.value.equals(((DecBaremetalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dec_baremetal")
    
    private DecBaremetalEnum decBaremetal;

    public SchedulerHints withDecBaremetal(DecBaremetalEnum decBaremetal) {
        this.decBaremetal = decBaremetal;
        return this;
    }

    


    /**
     * 是否在专属云中创建裸金属服务器，参数值为share或dedicate。约束：该值不传时默认为share。在专属云中创建裸金属服务器时，必须指定该字段为dedicate。
     * @return decBaremetal
     */
    public DecBaremetalEnum getDecBaremetal() {
        return decBaremetal;
    }

    public void setDecBaremetal(DecBaremetalEnum decBaremetal) {
        this.decBaremetal = decBaremetal;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SchedulerHints schedulerHints = (SchedulerHints) o;
        return Objects.equals(this.decBaremetal, schedulerHints.decBaremetal);
    }
    @Override
    public int hashCode() {
        return Objects.hash(decBaremetal);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulerHints {\n");
        sb.append("    decBaremetal: ").append(toIndentedString(decBaremetal)).append("\n");
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


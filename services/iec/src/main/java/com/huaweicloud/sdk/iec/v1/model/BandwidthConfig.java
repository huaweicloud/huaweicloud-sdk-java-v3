package com.huaweicloud.sdk.iec.v1.model;




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
 * 带宽配置
 */
public class BandwidthConfig  {

    /**
     * 带宽类型，现支持WHOLE类型，即共享带宽，其他类型不支持。
     */
    public static final class SharetypeEnum {

        
        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final SharetypeEnum WHOLE = new SharetypeEnum("WHOLE");
        

        private static final Map<String, SharetypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SharetypeEnum> createStaticFields() {
            Map<String, SharetypeEnum> map = new HashMap<>();
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SharetypeEnum(String value) {
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
        public static SharetypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SharetypeEnum(value);
            }
            return result;
        }

        public static SharetypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SharetypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SharetypeEnum) {
                return this.value.equals(((SharetypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sharetype")
    
    private SharetypeEnum sharetype;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public BandwidthConfig withSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
        return this;
    }

    


    /**
     * 带宽类型，现支持WHOLE类型，即共享带宽，其他类型不支持。
     * @return sharetype
     */
    public SharetypeEnum getSharetype() {
        return sharetype;
    }

    public void setSharetype(SharetypeEnum sharetype) {
        this.sharetype = sharetype;
    }

    

    public BandwidthConfig withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 带宽（Mbit/s）。 
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
        BandwidthConfig bandwidthConfig = (BandwidthConfig) o;
        return Objects.equals(this.sharetype, bandwidthConfig.sharetype) &&
            Objects.equals(this.size, bandwidthConfig.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sharetype, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthConfig {\n");
        sb.append("    sharetype: ").append(toIndentedString(sharetype)).append("\n");
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


package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;

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
 * 带宽信息
 */
public class BandwidthResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 带宽的共享类型。共享类型枚举：PER，表示独享。目前只支持独享。
     */
    public static final class ShareTypeEnum {

        
        /**
         * Enum PER for value: "PER"
         */
        public static final ShareTypeEnum PER = new ShareTypeEnum("PER");
        
        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");
        

        private static final Map<String, ShareTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ShareTypeEnum> createStaticFields() {
            Map<String, ShareTypeEnum> map = new HashMap<>();
            map.put("PER", PER);
            map.put("WHOLE", WHOLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ShareTypeEnum(String value) {
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
        public static ShareTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ShareTypeEnum(value);
            }
            return result;
        }

        public static ShareTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ShareTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ShareTypeEnum) {
                return this.value.equals(((ShareTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="share_type")
    
    private ShareTypeEnum shareType;
    /**
     * 带宽的计费类型。字段值为“bandwidth”，表示按带宽计费。字段值为“traffic”，表示按流量计费。
     */
    public static final class ChargingModeEnum {

        
        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargingModeEnum BANDWIDTH = new ChargingModeEnum("bandwidth");
        
        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargingModeEnum TRAFFIC = new ChargingModeEnum("traffic");
        

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("bandwidth", BANDWIDTH);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ChargingModeEnum(value);
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private ChargingModeEnum chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;

    public BandwidthResult withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 带宽（Mbit/s）。
     * minimum: 1
     * maximum: 300
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public BandwidthResult withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 带宽的共享类型。共享类型枚举：PER，表示独享。目前只支持独享。
     * @return shareType
     */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    

    public BandwidthResult withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 带宽的计费类型。字段值为“bandwidth”，表示按带宽计费。字段值为“traffic”，表示按流量计费。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public BandwidthResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 带宽ID，创建WHOLE类型带宽的弹性IP时指定的共享带宽。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BandwidthResult bandwidthResult = (BandwidthResult) o;
        return Objects.equals(this.size, bandwidthResult.size) &&
            Objects.equals(this.shareType, bandwidthResult.shareType) &&
            Objects.equals(this.chargingMode, bandwidthResult.chargingMode) &&
            Objects.equals(this.id, bandwidthResult.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, shareType, chargingMode, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BandwidthResult {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


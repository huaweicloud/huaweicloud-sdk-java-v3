package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 带宽信息
 */
public class Bandwidth  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;
    /**
     * 带宽的共享类型。共享类型枚举：PER：独享型。WHOLE：共享型。
     */
    public static class ShareTypeEnum {

        
        /**
         * Enum PER for value: "PER"
         */
        public static final ShareTypeEnum PER = new ShareTypeEnum("PER");

        
        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");

        

        public static Map<String, ShareTypeEnum> staticFields =
                new HashMap<String, ShareTypeEnum>() {
                    { 
                        put("PER", PER);
                        put("WHOLE", WHOLE);
                    }
                };

        private String value;

        ShareTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ShareTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ShareTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ShareTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ShareTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ShareTypeEnum result = staticFields.get(value);
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
     * 带宽的计费类型。字段值为“bandwidth”，表示按带宽计费。字段值为“traffic”，表示按流量计费。字段为其它值，会导致创建云服务器失败。如果share_type是PER，该参数为必选项。如果share_type是WHOLE，会忽略该参数。
     */
    public static class ChargingModeEnum {

        
        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargingModeEnum BANDWIDTH = new ChargingModeEnum("bandwidth");

        
        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargingModeEnum TRAFFIC = new ChargingModeEnum("traffic");

        

        public static Map<String, ChargingModeEnum> staticFields =
                new HashMap<String, ChargingModeEnum>() {
                    { 
                        put("bandwidth", BANDWIDTH);
                        put("traffic", TRAFFIC);
                    }
                };

        private String value;

        ChargingModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargingModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargingModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargingModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargingModeEnum result = staticFields.get(value);
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

    public Bandwidth withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 带宽（Mbit/s），取值范围为[1,300]。
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

    public Bandwidth withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 带宽的共享类型。共享类型枚举：PER：独享型。WHOLE：共享型。
     * @return shareType
     */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    public Bandwidth withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 带宽的计费类型。字段值为“bandwidth”，表示按带宽计费。字段值为“traffic”，表示按流量计费。字段为其它值，会导致创建云服务器失败。如果share_type是PER，该参数为必选项。如果share_type是WHOLE，会忽略该参数。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public Bandwidth withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 带宽ID，使用共享型带宽时，可以选择之前创建的共享带宽来创建弹性IP。如果share_type是PER，会忽略该参数。如果share_type是WHOLE，该参数为必选项。
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
        Bandwidth bandwidth = (Bandwidth) o;
        return Objects.equals(this.size, bandwidth.size) &&
            Objects.equals(this.shareType, bandwidth.shareType) &&
            Objects.equals(this.chargingMode, bandwidth.chargingMode) &&
            Objects.equals(this.id, bandwidth.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, shareType, chargingMode, id);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Bandwidth {\n");
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


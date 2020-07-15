package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建弹性公网IP时，携带的待绑定带宽信息
 */
public class PubicipBandwidthDict  {

    /**
     * 功能说明：按流量计费还是按带宽计费。  其中IPv6国外默认是bandwidth，国内默认是traffic。取值为traffic，表示流量计费。
     */
    public static class ChargeModeEnum {

        
        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");
        
        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");
        

        public static final Map<String, ChargeModeEnum> staticFields = new HashMap<String, ChargeModeEnum>() {
            { 
                put("bandwidth", BANDWIDTH);
                put("traffic", TRAFFIC);
            }
        };

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargeModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private ChargeModeEnum chargeMode = ChargeModeEnum.BANDWIDTH;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 功能说明：带宽类型 取值范围：PER，WHOLE。 约束：其中IPv6暂不支持WHOLE类型带宽，该字段为WHOLE时，必须指定带宽ID。
     */
    public static class ShareTypeEnum {

        
        /**
         * Enum WHOLE for value: "WHOLE"
         */
        public static final ShareTypeEnum WHOLE = new ShareTypeEnum("WHOLE");
        
        /**
         * Enum PER for value: "PER"
         */
        public static final ShareTypeEnum PER = new ShareTypeEnum("PER");
        

        public static final Map<String, ShareTypeEnum> staticFields = new HashMap<String, ShareTypeEnum>() {
            { 
                put("WHOLE", WHOLE);
                put("PER", PER);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public PubicipBandwidthDict withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 功能说明：按流量计费还是按带宽计费。  其中IPv6国外默认是bandwidth，国内默认是traffic。取值为traffic，表示流量计费。
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public PubicipBandwidthDict withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 功能说明：带宽ID  创建WHOLE类型带宽的弹性公网IP时可以指定之前的共享带宽创建  取值范围：WHOLE类型的带宽ID 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PubicipBandwidthDict withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：带宽名称  取值范围：1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）  如果share_type是PER，该参数必须带,如果share_type是WHOLE并且id有值，该参数会忽略。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PubicipBandwidthDict withShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 功能说明：带宽类型 取值范围：PER，WHOLE。 约束：其中IPv6暂不支持WHOLE类型带宽，该字段为WHOLE时，必须指定带宽ID。
     * @return shareType
     */
    public ShareTypeEnum getShareType() {
        return shareType;
    }

    public void setShareType(ShareTypeEnum shareType) {
        this.shareType = shareType;
    }

    public PubicipBandwidthDict withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 功能说明：带宽大小  取值范围：默认1Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。  约束：share_type是PER，该参数必须带，如果share_type是WHOLE并且id有值，该参数会忽略。  注意：调整带宽时的最小单位会根据带宽范围不同存在差异。  小于等于300Mbit/s：默认最小单位为1Mbit/s。  300Mbit/s~1000Mbit/s：默认最小单位为50Mbit/s。  大于1000Mbit/s：默认最小单位为500Mbit/s。
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
        PubicipBandwidthDict pubicipBandwidthDict = (PubicipBandwidthDict) o;
        return Objects.equals(this.chargeMode, pubicipBandwidthDict.chargeMode) &&
            Objects.equals(this.id, pubicipBandwidthDict.id) &&
            Objects.equals(this.name, pubicipBandwidthDict.name) &&
            Objects.equals(this.shareType, pubicipBandwidthDict.shareType) &&
            Objects.equals(this.size, pubicipBandwidthDict.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, id, name, shareType, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PubicipBandwidthDict {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
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


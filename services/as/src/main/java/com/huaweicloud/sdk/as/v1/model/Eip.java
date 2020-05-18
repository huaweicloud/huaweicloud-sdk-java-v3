package com.huaweicloud.sdk.as.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.Bandwidth;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 配置云服务器的弹性IP信息
 */
public class Eip  {

    /**
     * 弹性IP地址类型。类型枚举值：5_bgp：全动态BGP;5_sbgp：静态BGP;5_telcom：中国电信;5_union：中国联通;详情请参见《虚拟私有云接口参考》“申请弹性公网IP”章节的“publicip”字段说明。
     */
    public static class IpTypeEnum {

        
        /**
         * Enum _5_BGP for value: "5_bgp"
         */
        public static final IpTypeEnum _5_BGP = new IpTypeEnum("5_bgp");

        
        /**
         * Enum _5_SBGP for value: "5_sbgp"
         */
        public static final IpTypeEnum _5_SBGP = new IpTypeEnum("5_sbgp");

        
        /**
         * Enum _5_TELCOM for value: "5_telcom"
         */
        public static final IpTypeEnum _5_TELCOM = new IpTypeEnum("5_telcom");

        
        /**
         * Enum _5_UNION for value: "5_union"
         */
        public static final IpTypeEnum _5_UNION = new IpTypeEnum("5_union");

        

        public static Map<String, IpTypeEnum> staticFields =
                new HashMap<String, IpTypeEnum>() {
                    { 
                        put("5_bgp", _5_BGP);
                        put("5_sbgp", _5_SBGP);
                        put("5_telcom", _5_TELCOM);
                        put("5_union", _5_UNION);
                    }
                };

        private String value;

        IpTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            IpTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IpTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IpTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IpTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IpTypeEnum) {
                return this.value.equals(((IpTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_type")
    
    private IpTypeEnum ipType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bandwidth")
    
    private Bandwidth bandwidth = null;

    public Eip withIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
        return this;
    }

    


    /**
     * 弹性IP地址类型。类型枚举值：5_bgp：全动态BGP;5_sbgp：静态BGP;5_telcom：中国电信;5_union：中国联通;详情请参见《虚拟私有云接口参考》“申请弹性公网IP”章节的“publicip”字段说明。
     * @return ipType
     */
    public IpTypeEnum getIpType() {
        return ipType;
    }

    public void setIpType(IpTypeEnum ipType) {
        this.ipType = ipType;
    }

    public Eip withBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public Eip withBandwidth(Consumer<Bandwidth> bandwidthSetter) {
        if(this.bandwidth == null ){
            this.bandwidth = new Bandwidth();
        }
        bandwidthSetter.accept(this.bandwidth);
        return this;
    }


    /**
     * Get bandwidth
     * @return bandwidth
     */
    public Bandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Bandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Eip eip = (Eip) o;
        return Objects.equals(this.ipType, eip.ipType) &&
            Objects.equals(this.bandwidth, eip.bandwidth);
    }
    @Override
    public int hashCode() {
        return Objects.hash(ipType, bandwidth);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Eip {\n");
            sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
            sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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


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
 * 申请包周期弹性公网IP的publicip对象
 */
public class CreatePrePaidPublicipOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;
    /**
     * 功能说明：弹性公网IP的版本  取值范围：4、6，分别表示创建ipv4和ipv6  约束：必须是系统具体支持的类型  不填或空字符串时，默认创建ipv4
     */
    public static class IpVersionEnum {

        
        /**
         * Enum _4 for value: "4"
         */
        public static final IpVersionEnum _4 = new IpVersionEnum("4");
        
        /**
         * Enum _6 for value: "6"
         */
        public static final IpVersionEnum _6 = new IpVersionEnum("6");
        

        public static final Map<String, IpVersionEnum> staticFields = new HashMap<String, IpVersionEnum>() {
            { 
                put("4", _4);
                put("6", _6);
            }
        };

        private String value;

        IpVersionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static IpVersionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            IpVersionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new IpVersionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static IpVersionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            IpVersionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof IpVersionEnum) {
                return this.value.equals(((IpVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip_version")
    
    private IpVersionEnum ipVersion = IpVersionEnum._4;

    public CreatePrePaidPublicipOption withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 功能说明：弹性公网IP的类型  取值范围：5_telcom（电信），5_union（联通），5_bgp（全动态BGP），5_sbgp（静态BGP），5_ipv6  东北-大连：5_telcom、5_union  华南-广州：5_bgp、5_sbgp  华东-上海二：5_bgp、5_sbgp  华北-北京一：5_bgp、5_sbgp、5_ipv6  亚太-香港：5_bgp  亚太-曼谷：5_bgp  亚太-新加坡：5_bgp  非洲-约翰内斯堡：5_bgp  西南-贵阳一：5_bgp、5_sbgp  华北-北京四：5_bgp、5_sbgp  约束：必须是系统具体支持的类型publicip_id为IPv4端口，所以\"publicip_type\"字段未给定时，默认为5_bgp。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreatePrePaidPublicipOption withIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    


    /**
     * 功能说明：弹性公网IP的版本  取值范围：4、6，分别表示创建ipv4和ipv6  约束：必须是系统具体支持的类型  不填或空字符串时，默认创建ipv4
     * @return ipVersion
     */
    public IpVersionEnum getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(IpVersionEnum ipVersion) {
        this.ipVersion = ipVersion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrePaidPublicipOption createPrePaidPublicipOption = (CreatePrePaidPublicipOption) o;
        return Objects.equals(this.type, createPrePaidPublicipOption.type) &&
            Objects.equals(this.ipVersion, createPrePaidPublicipOption.ipVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, ipVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrePaidPublicipOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
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


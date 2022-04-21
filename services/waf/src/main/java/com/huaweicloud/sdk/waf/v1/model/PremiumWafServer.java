package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 服务器配置
 */
public class PremiumWafServer {

    /**
     * 对外协议
     */
    public static final class FrontProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final FrontProtocolEnum HTTP = new FrontProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final FrontProtocolEnum HTTPS = new FrontProtocolEnum("HTTPS");

        private static final Map<String, FrontProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrontProtocolEnum> createStaticFields() {
            Map<String, FrontProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrontProtocolEnum(String value) {
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
        public static FrontProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FrontProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FrontProtocolEnum(value);
            }
            return result;
        }

        public static FrontProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FrontProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrontProtocolEnum) {
                return this.value.equals(((FrontProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_protocol")

    private FrontProtocolEnum frontProtocol;

    /**
     * 源站协议
     */
    public static final class BackProtocolEnum {

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final BackProtocolEnum HTTP = new BackProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final BackProtocolEnum HTTPS = new BackProtocolEnum("HTTPS");

        private static final Map<String, BackProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BackProtocolEnum> createStaticFields() {
            Map<String, BackProtocolEnum> map = new HashMap<>();
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BackProtocolEnum(String value) {
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
        public static BackProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            BackProtocolEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BackProtocolEnum(value);
            }
            return result;
        }

        public static BackProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            BackProtocolEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BackProtocolEnum) {
                return this.value.equals(((BackProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_protocol")

    private BackProtocolEnum backProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * 源站地址为ipv4或ipv6
     */
    public static final class TypeEnum {

        /**
         * Enum IPV4 for value: "ipv4"
         */
        public static final TypeEnum IPV4 = new TypeEnum("ipv4");

        /**
         * Enum IPV6 for value: "ipv6"
         */
        public static final TypeEnum IPV6 = new TypeEnum("ipv6");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ipv4", IPV4);
            map.put("ipv6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    public PremiumWafServer withFrontProtocol(FrontProtocolEnum frontProtocol) {
        this.frontProtocol = frontProtocol;
        return this;
    }

    /**
     * 对外协议
     * @return frontProtocol
     */
    public FrontProtocolEnum getFrontProtocol() {
        return frontProtocol;
    }

    public void setFrontProtocol(FrontProtocolEnum frontProtocol) {
        this.frontProtocol = frontProtocol;
    }

    public PremiumWafServer withBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
        return this;
    }

    /**
     * 源站协议
     * @return backProtocol
     */
    public BackProtocolEnum getBackProtocol() {
        return backProtocol;
    }

    public void setBackProtocol(BackProtocolEnum backProtocol) {
        this.backProtocol = backProtocol;
    }

    public PremiumWafServer withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 源站地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PremiumWafServer withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 源站端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public PremiumWafServer withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 源站地址为ipv4或ipv6
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PremiumWafServer withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * VPC id,通过以下步骤获取VPC id： \\n 1.找到独享引擎所在的虚拟私有云名称，VPC\\子网这一列就是VPC的名称：登录WAF的控制台->单击系统管理->独享引擎->VPC\\子网 \\n 2.登录虚拟私有云 VPC控制台->虚拟私有云->单击虚拟私有云的名称->基本信息的ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PremiumWafServer premiumWafServer = (PremiumWafServer) o;
        return Objects.equals(this.frontProtocol, premiumWafServer.frontProtocol)
            && Objects.equals(this.backProtocol, premiumWafServer.backProtocol)
            && Objects.equals(this.address, premiumWafServer.address)
            && Objects.equals(this.port, premiumWafServer.port) && Objects.equals(this.type, premiumWafServer.type)
            && Objects.equals(this.vpcId, premiumWafServer.vpcId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(frontProtocol, backProtocol, address, port, type, vpcId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PremiumWafServer {\n");
        sb.append("    frontProtocol: ").append(toIndentedString(frontProtocol)).append("\n");
        sb.append("    backProtocol: ").append(toIndentedString(backProtocol)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
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

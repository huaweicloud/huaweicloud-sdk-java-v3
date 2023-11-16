package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 更新全量防护对象的请求体
 */
public class UpdateProtectedIpInPolicyBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    /**
     * 类型。VPN：VPN；NAT：NAT；VIP：VIP；CCI：CCI；EIP：弹性公网IP；ELB：弹性负载均衡；REROUTING_IP：REROUTING_IP；SubEni：SubEni；NetInterFace：NetInterFace；
     */
    public static final class TypeEnum {

        /**
         * Enum VPN for value: "VPN"
         */
        public static final TypeEnum VPN = new TypeEnum("VPN");

        /**
         * Enum NAT for value: "NAT"
         */
        public static final TypeEnum NAT = new TypeEnum("NAT");

        /**
         * Enum VIP for value: "VIP"
         */
        public static final TypeEnum VIP = new TypeEnum("VIP");

        /**
         * Enum CCI for value: "CCI"
         */
        public static final TypeEnum CCI = new TypeEnum("CCI");

        /**
         * Enum EIP for value: "EIP"
         */
        public static final TypeEnum EIP = new TypeEnum("EIP");

        /**
         * Enum ELB for value: "ELB"
         */
        public static final TypeEnum ELB = new TypeEnum("ELB");

        /**
         * Enum REROUTING_IP for value: "REROUTING_IP"
         */
        public static final TypeEnum REROUTING_IP = new TypeEnum("REROUTING_IP");

        /**
         * Enum SUBENI for value: "SubEni"
         */
        public static final TypeEnum SUBENI = new TypeEnum("SubEni");

        /**
         * Enum NETINTERFACE for value: "NetInterFace"
         */
        public static final TypeEnum NETINTERFACE = new TypeEnum("NetInterFace");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("VPN", VPN);
            map.put("NAT", NAT);
            map.put("VIP", VIP);
            map.put("CCI", CCI);
            map.put("EIP", EIP);
            map.put("ELB", ELB);
            map.put("REROUTING_IP", REROUTING_IP);
            map.put("SubEni", SUBENI);
            map.put("NetInterFace", NETINTERFACE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "name")

    private String name;

    public UpdateProtectedIpInPolicyBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 防护ip的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateProtectedIpInPolicyBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 防护ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpdateProtectedIpInPolicyBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型。VPN：VPN；NAT：NAT；VIP：VIP；CCI：CCI；EIP：弹性公网IP；ELB：弹性负载均衡；REROUTING_IP：REROUTING_IP；SubEni：SubEni；NetInterFace：NetInterFace；
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public UpdateProtectedIpInPolicyBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateProtectedIpInPolicyBody that = (UpdateProtectedIpInPolicyBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.type, that.type) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, type, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateProtectedIpInPolicyBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

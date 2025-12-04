package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DDM绑定的弹性公网IP信息
 */
public class PublicIpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 弹性公网IP的类型。
     */
    public static final class TypeEnum {

        /**
         * Enum _5_BGP_BGP_ for value: "5_bgp（全动态BGP）"
         */
        public static final TypeEnum _5_BGP_BGP_ = new TypeEnum("5_bgp（全动态BGP）");

        /**
         * Enum _5_SBGP_BGP_ for value: "5_sbgp（静态BGP）"
         */
        public static final TypeEnum _5_SBGP_BGP_ = new TypeEnum("5_sbgp（静态BGP）");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("5_bgp（全动态BGP）", _5_BGP_BGP_);
            map.put("5_sbgp（静态BGP）", _5_SBGP_BGP_);
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
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_entity_id")

    private String bindingEntityId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_entity_name")

    private String bindingEntityName;

    /**
     * 绑定弹性公网IP的实体类型（目前只支持绑定node）。
     */
    public static final class BindingEntityTypeEnum {

        /**
         * Enum NODE_ for value: "node（节点）"
         */
        public static final BindingEntityTypeEnum NODE_ = new BindingEntityTypeEnum("node（节点）");

        /**
         * Enum NODE_GROUP_ for value: "node_group（节点组）"
         */
        public static final BindingEntityTypeEnum NODE_GROUP_ = new BindingEntityTypeEnum("node_group（节点组）");

        private static final Map<String, BindingEntityTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BindingEntityTypeEnum> createStaticFields() {
            Map<String, BindingEntityTypeEnum> map = new HashMap<>();
            map.put("node（节点）", NODE_);
            map.put("node_group（节点组）", NODE_GROUP_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BindingEntityTypeEnum(String value) {
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
        public static BindingEntityTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BindingEntityTypeEnum(value));
        }

        public static BindingEntityTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BindingEntityTypeEnum) {
                return this.value.equals(((BindingEntityTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_entity_type")

    private BindingEntityTypeEnum bindingEntityType;

    public PublicIpInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网IP唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicIpInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP的类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PublicIpInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性公网IP的地址。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PublicIpInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 绑定弹性公网IP的私有IP地址。
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public PublicIpInfo withBindingEntityId(String bindingEntityId) {
        this.bindingEntityId = bindingEntityId;
        return this;
    }

    /**
     * 绑定弹性公网IP的实体ID。
     * @return bindingEntityId
     */
    public String getBindingEntityId() {
        return bindingEntityId;
    }

    public void setBindingEntityId(String bindingEntityId) {
        this.bindingEntityId = bindingEntityId;
    }

    public PublicIpInfo withBindingEntityName(String bindingEntityName) {
        this.bindingEntityName = bindingEntityName;
        return this;
    }

    /**
     * 绑定弹性公网IP的实体名称。
     * @return bindingEntityName
     */
    public String getBindingEntityName() {
        return bindingEntityName;
    }

    public void setBindingEntityName(String bindingEntityName) {
        this.bindingEntityName = bindingEntityName;
    }

    public PublicIpInfo withBindingEntityType(BindingEntityTypeEnum bindingEntityType) {
        this.bindingEntityType = bindingEntityType;
        return this;
    }

    /**
     * 绑定弹性公网IP的实体类型（目前只支持绑定node）。
     * @return bindingEntityType
     */
    public BindingEntityTypeEnum getBindingEntityType() {
        return bindingEntityType;
    }

    public void setBindingEntityType(BindingEntityTypeEnum bindingEntityType) {
        this.bindingEntityType = bindingEntityType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIpInfo that = (PublicIpInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.bindingEntityId, that.bindingEntityId)
            && Objects.equals(this.bindingEntityName, that.bindingEntityName)
            && Objects.equals(this.bindingEntityType, that.bindingEntityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, publicIp, privateIp, bindingEntityId, bindingEntityName, bindingEntityType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIpInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    bindingEntityId: ").append(toIndentedString(bindingEntityId)).append("\n");
        sb.append("    bindingEntityName: ").append(toIndentedString(bindingEntityName)).append("\n");
        sb.append("    bindingEntityType: ").append(toIndentedString(bindingEntityType)).append("\n");
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

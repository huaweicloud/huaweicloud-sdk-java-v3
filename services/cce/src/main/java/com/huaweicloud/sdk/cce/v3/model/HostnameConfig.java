package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * HostnameConfig
 */
public class HostnameConfig {

    /**
     * K8S节点名称配置类型, 默认为“privateIp”。  -  privateIp: 将节点私有IP作为K8S节点名称 -  cceNodeName: 将CCE节点名称作为K8S节点名称  > - 配置为cceNodeName的节点, 其节点名称、K8S节点名称以及虚机名称相同。节点名称不支持修改, 并且在ECS侧修改了虚机名称，同步云服务器时，不会将修改后的虚机名称同步到节点。 > - 配置为cceNodeName的节点，为了避免K8S节点名称冲突，系统会自动在节点名称后添加后缀，后缀的格式为中划线(-)+五位随机字符，随机字符的取值为[a-z0-9]。 
     */
    public static final class TypeEnum {

        /**
         * Enum PRIVATEIP for value: "privateIp"
         */
        public static final TypeEnum PRIVATEIP = new TypeEnum("privateIp");

        /**
         * Enum CCENODENAME for value: "cceNodeName"
         */
        public static final TypeEnum CCENODENAME = new TypeEnum("cceNodeName");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("privateIp", PRIVATEIP);
            map.put("cceNodeName", CCENODENAME);
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

    public HostnameConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * K8S节点名称配置类型, 默认为“privateIp”。  -  privateIp: 将节点私有IP作为K8S节点名称 -  cceNodeName: 将CCE节点名称作为K8S节点名称  > - 配置为cceNodeName的节点, 其节点名称、K8S节点名称以及虚机名称相同。节点名称不支持修改, 并且在ECS侧修改了虚机名称，同步云服务器时，不会将修改后的虚机名称同步到节点。 > - 配置为cceNodeName的节点，为了避免K8S节点名称冲突，系统会自动在节点名称后添加后缀，后缀的格式为中划线(-)+五位随机字符，随机字符的取值为[a-z0-9]。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostnameConfig that = (HostnameConfig) obj;
        return Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostnameConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

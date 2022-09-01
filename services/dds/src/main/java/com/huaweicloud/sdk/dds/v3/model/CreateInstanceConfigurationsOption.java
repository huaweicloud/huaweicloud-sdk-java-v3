package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 参数组配置信息。
 */
public class CreateInstanceConfigurationsOption {

    /**
     * 节点类型。 取值：   - 集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 副本集实例下该参数取值为“replica”。   - 单节点实例下该参数取值为“single”。
     */
    public static final class TypeEnum {

        /**
         * Enum MONGOS for value: "mongos"
         */
        public static final TypeEnum MONGOS = new TypeEnum("mongos");

        /**
         * Enum SHARD for value: "shard"
         */
        public static final TypeEnum SHARD = new TypeEnum("shard");

        /**
         * Enum CONFIG for value: "config"
         */
        public static final TypeEnum CONFIG = new TypeEnum("config");

        /**
         * Enum REPLICA for value: "replica"
         */
        public static final TypeEnum REPLICA = new TypeEnum("replica");

        /**
         * Enum SINGLE for value: "single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("single");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("mongos", MONGOS);
            map.put("shard", SHARD);
            map.put("config", CONFIG);
            map.put("replica", REPLICA);
            map.put("single", SINGLE);
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    @JacksonXmlProperty(localName = "configuration_id")

    private String configurationId;

    public CreateInstanceConfigurationsOption withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型。 取值：   - 集群实例包含mongos、shard和config节点，各节点下该参数取值分别为“mongos”、“shard”和“config”。   - 副本集实例下该参数取值为“replica”。   - 单节点实例下该参数取值为“single”。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateInstanceConfigurationsOption withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数组id。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceConfigurationsOption createInstanceConfigurationsOption = (CreateInstanceConfigurationsOption) o;
        return Objects.equals(this.type, createInstanceConfigurationsOption.type)
            && Objects.equals(this.configurationId, createInstanceConfigurationsOption.configurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, configurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceConfigurationsOption {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
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

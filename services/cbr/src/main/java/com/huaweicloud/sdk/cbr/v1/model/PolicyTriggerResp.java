package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PolicyTriggerResp
 */
public class PolicyTriggerResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    @JacksonXmlProperty(localName = "properties")

    private PolicyTriggerPropertiesResp properties;

    /**
     * 调度器类型,目前只支持 time: 定时调度。
     */
    public static final class TypeEnum {

        /**
         * Enum TIME for value: "time"
         */
        public static final TypeEnum TIME = new TypeEnum("time");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("time", TIME);
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

    public PolicyTriggerResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 调度器id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PolicyTriggerResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 调度器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyTriggerResp withProperties(PolicyTriggerPropertiesResp properties) {
        this.properties = properties;
        return this;
    }

    public PolicyTriggerResp withProperties(Consumer<PolicyTriggerPropertiesResp> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new PolicyTriggerPropertiesResp();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public PolicyTriggerPropertiesResp getProperties() {
        return properties;
    }

    public void setProperties(PolicyTriggerPropertiesResp properties) {
        this.properties = properties;
    }

    public PolicyTriggerResp withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 调度器类型,目前只支持 time: 定时调度。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyTriggerResp policyTriggerResp = (PolicyTriggerResp) o;
        return Objects.equals(this.id, policyTriggerResp.id) && Objects.equals(this.name, policyTriggerResp.name)
            && Objects.equals(this.properties, policyTriggerResp.properties)
            && Objects.equals(this.type, policyTriggerResp.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, properties, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTriggerResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

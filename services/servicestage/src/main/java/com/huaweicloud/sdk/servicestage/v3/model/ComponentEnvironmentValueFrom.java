package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ComponentEnvironmentValueFrom
 */
public class ComponentEnvironmentValueFrom {

    /**
     * Gets or Sets referenceType
     */
    public static final class ReferenceTypeEnum {

        /**
         * Enum CONFIGMAPKEY for value: "configMapKey"
         */
        public static final ReferenceTypeEnum CONFIGMAPKEY = new ReferenceTypeEnum("configMapKey");

        /**
         * Enum SECRETKEY for value: "secretKey"
         */
        public static final ReferenceTypeEnum SECRETKEY = new ReferenceTypeEnum("secretKey");

        private static final Map<String, ReferenceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReferenceTypeEnum> createStaticFields() {
            Map<String, ReferenceTypeEnum> map = new HashMap<>();
            map.put("configMapKey", CONFIGMAPKEY);
            map.put("secretKey", SECRETKEY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReferenceTypeEnum(String value) {
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
        public static ReferenceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReferenceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReferenceTypeEnum(value);
            }
            return result;
        }

        public static ReferenceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReferenceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReferenceTypeEnum) {
                return this.value.equals(((ReferenceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_type")

    private ReferenceTypeEnum referenceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional")

    private Boolean optional;

    public ComponentEnvironmentValueFrom withReferenceType(ReferenceTypeEnum referenceType) {
        this.referenceType = referenceType;
        return this;
    }

    /**
     * Get referenceType
     * @return referenceType
     */
    public ReferenceTypeEnum getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(ReferenceTypeEnum referenceType) {
        this.referenceType = referenceType;
    }

    public ComponentEnvironmentValueFrom withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * configmap或者secret的名字
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentEnvironmentValueFrom withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * configmap或者secret的key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ComponentEnvironmentValueFrom withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

    /**
     * configmap或者secret或者他们的key是否必须存在
     * @return optional
     */
    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ComponentEnvironmentValueFrom componentEnvironmentValueFrom = (ComponentEnvironmentValueFrom) o;
        return Objects.equals(this.referenceType, componentEnvironmentValueFrom.referenceType)
            && Objects.equals(this.name, componentEnvironmentValueFrom.name)
            && Objects.equals(this.key, componentEnvironmentValueFrom.key)
            && Objects.equals(this.optional, componentEnvironmentValueFrom.optional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceType, name, key, optional);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentEnvironmentValueFrom {\n");
        sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

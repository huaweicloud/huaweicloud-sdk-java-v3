package com.huaweicloud.sdk.roma.v2.model;

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
 * Request Object
 */
public class ListMqsInstanceRequest {

    /**
     * 是否包含内部的实例。include_internal参数必须为true。
     */
    public static final class IncludeInternalEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IncludeInternalEnum TRUE = new IncludeInternalEnum("true");

        private static final Map<String, IncludeInternalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncludeInternalEnum> createStaticFields() {
            Map<String, IncludeInternalEnum> map = new HashMap<>();
            map.put("true", TRUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IncludeInternalEnum(String value) {
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
        public static IncludeInternalEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            IncludeInternalEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new IncludeInternalEnum(value);
            }
            return result;
        }

        public static IncludeInternalEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            IncludeInternalEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IncludeInternalEnum) {
                return this.value.equals(((IncludeInternalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_internal")

    @JacksonXmlProperty(localName = "include_internal")

    private IncludeInternalEnum includeInternal;

    public ListMqsInstanceRequest withIncludeInternal(IncludeInternalEnum includeInternal) {
        this.includeInternal = includeInternal;
        return this;
    }

    /**
     * 是否包含内部的实例。include_internal参数必须为true。
     * @return includeInternal
     */
    public IncludeInternalEnum getIncludeInternal() {
        return includeInternal;
    }

    public void setIncludeInternal(IncludeInternalEnum includeInternal) {
        this.includeInternal = includeInternal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMqsInstanceRequest listMqsInstanceRequest = (ListMqsInstanceRequest) o;
        return Objects.equals(this.includeInternal, listMqsInstanceRequest.includeInternal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(includeInternal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMqsInstanceRequest {\n");
        sb.append("    includeInternal: ").append(toIndentedString(includeInternal)).append("\n");
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

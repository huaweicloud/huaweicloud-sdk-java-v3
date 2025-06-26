package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NamespaceMetadata
 */
public class NamespaceMetadata {

    /**
     * 是否公开，可选true、false
     */
    public static final class PublicEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final PublicEnum TRUE = new PublicEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final PublicEnum FALSE = new PublicEnum("false");

        private static final Map<String, PublicEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublicEnum> createStaticFields() {
            Map<String, PublicEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublicEnum(String value) {
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
        public static PublicEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PublicEnum(value));
        }

        public static PublicEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PublicEnum) {
                return this.value.equals(((PublicEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public")

    private PublicEnum _public;

    public NamespaceMetadata withPublic(PublicEnum _public) {
        this._public = _public;
        return this;
    }

    /**
     * 是否公开，可选true、false
     * @return _public
     */
    public PublicEnum getPublic() {
        return _public;
    }

    public void setPublic(PublicEnum _public) {
        this._public = _public;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NamespaceMetadata that = (NamespaceMetadata) obj;
        return Objects.equals(this._public, that._public);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_public);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NamespaceMetadata {\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
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

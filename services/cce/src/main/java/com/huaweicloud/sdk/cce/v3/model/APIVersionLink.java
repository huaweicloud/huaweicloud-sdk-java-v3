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
 * API版本的URL链接信息。
 */
public class APIVersionLink {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "href")

    private String href;

    /**
     * 链接属性。self：自助链接包含版本链接的资源。立即链接后使用这些链接。
     */
    public static final class RelEnum {

        /**
         * Enum SELF for value: "self"
         */
        public static final RelEnum SELF = new RelEnum("self");

        private static final Map<String, RelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelEnum> createStaticFields() {
            Map<String, RelEnum> map = new HashMap<>();
            map.put("self", SELF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelEnum(String value) {
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
        public static RelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RelEnum(value);
            }
            return result;
        }

        public static RelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RelEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelEnum) {
                return this.value.equals(((RelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rel")

    private RelEnum rel;

    public APIVersionLink withHref(String href) {
        this.href = href;
        return this;
    }

    /**
     * API版本信息的链接。
     * @return href
     */
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public APIVersionLink withRel(RelEnum rel) {
        this.rel = rel;
        return this;
    }

    /**
     * 链接属性。self：自助链接包含版本链接的资源。立即链接后使用这些链接。
     * @return rel
     */
    public RelEnum getRel() {
        return rel;
    }

    public void setRel(RelEnum rel) {
        this.rel = rel;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        APIVersionLink apIVersionLink = (APIVersionLink) o;
        return Objects.equals(this.href, apIVersionLink.href) && Objects.equals(this.rel, apIVersionLink.rel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, rel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIVersionLink {\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
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

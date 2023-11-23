package com.huaweicloud.sdk.obs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 记录用户信息 
 */
@JacksonXmlRootElement(localName = "Grantee")
public class Grantee {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ID")

    @JacksonXmlProperty(localName = "ID")

    private String id;

    /**
     * 向所有人授予权限。 
     */
    public static final class CannedEnum {

        /**
         * Enum EVERYONE for value: "Everyone"
         */
        public static final CannedEnum EVERYONE = new CannedEnum("Everyone");

        private static final Map<String, CannedEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CannedEnum> createStaticFields() {
            Map<String, CannedEnum> map = new HashMap<>();
            map.put("Everyone", EVERYONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CannedEnum(String value) {
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
        public static CannedEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CannedEnum(value));
        }

        public static CannedEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CannedEnum) {
                return this.value.equals(((CannedEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Canned")

    @JacksonXmlProperty(localName = "Canned")

    private CannedEnum canned;

    public Grantee withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 被授权用户的租户Id 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Grantee withCanned(CannedEnum canned) {
        this.canned = canned;
        return this;
    }

    /**
     * 向所有人授予权限。 
     * @return canned
     */
    public CannedEnum getCanned() {
        return canned;
    }

    public void setCanned(CannedEnum canned) {
        this.canned = canned;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grantee that = (Grantee) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.canned, that.canned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, canned);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Grantee {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    canned: ").append(toIndentedString(canned)).append("\n");
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

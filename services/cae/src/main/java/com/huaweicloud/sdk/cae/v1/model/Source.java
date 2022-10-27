package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Source
 */
public class Source {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private Repo code;

    /**
     * 代码源类型。
     */
    public static final class TypeEnum {

        /**
         * Enum IMAGE for value: "image"
         */
        public static final TypeEnum IMAGE = new TypeEnum("image");

        /**
         * Enum CODE for value: "code"
         */
        public static final TypeEnum CODE = new TypeEnum("code");

        /**
         * Enum SOFTWAREPACKAGE for value: "softwarePackage"
         */
        public static final TypeEnum SOFTWAREPACKAGE = new TypeEnum("softwarePackage");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("image", IMAGE);
            map.put("code", CODE);
            map.put("softwarePackage", SOFTWAREPACKAGE);
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

    private TypeEnum type;

    /**
     * 代码源管理平台。
     */
    public static final class SubTypeEnum {

        /**
         * Enum BINOBS for value: "BinObs"
         */
        public static final SubTypeEnum BINOBS = new SubTypeEnum("BinObs");

        /**
         * Enum BINDEVCLOUD for value: "BinDevCloud"
         */
        public static final SubTypeEnum BINDEVCLOUD = new SubTypeEnum("BinDevCloud");

        /**
         * Enum GITLAB for value: "GitLab"
         */
        public static final SubTypeEnum GITLAB = new SubTypeEnum("GitLab");

        /**
         * Enum GITHUB for value: "GitHub"
         */
        public static final SubTypeEnum GITHUB = new SubTypeEnum("GitHub");

        /**
         * Enum DEVCLOUD for value: "DevCloud"
         */
        public static final SubTypeEnum DEVCLOUD = new SubTypeEnum("DevCloud");

        /**
         * Enum GITEE for value: "Gitee"
         */
        public static final SubTypeEnum GITEE = new SubTypeEnum("Gitee");

        /**
         * Enum BITBUCKET for value: "Bitbucket"
         */
        public static final SubTypeEnum BITBUCKET = new SubTypeEnum("Bitbucket");

        private static final Map<String, SubTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubTypeEnum> createStaticFields() {
            Map<String, SubTypeEnum> map = new HashMap<>();
            map.put("BinObs", BINOBS);
            map.put("BinDevCloud", BINDEVCLOUD);
            map.put("GitLab", GITLAB);
            map.put("GitHub", GITHUB);
            map.put("DevCloud", DEVCLOUD);
            map.put("Gitee", GITEE);
            map.put("Bitbucket", BITBUCKET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubTypeEnum(String value) {
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
        public static SubTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SubTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SubTypeEnum(value);
            }
            return result;
        }

        public static SubTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SubTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubTypeEnum) {
                return this.value.equals(((SubTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_type")

    private SubTypeEnum subType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public Source withCode(Repo code) {
        this.code = code;
        return this;
    }

    public Source withCode(Consumer<Repo> codeSetter) {
        if (this.code == null) {
            this.code = new Repo();
            codeSetter.accept(this.code);
        }

        return this;
    }

    /**
     * Get code
     * @return code
     */
    public Repo getCode() {
        return code;
    }

    public void setCode(Repo code) {
        this.code = code;
    }

    public Source withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 代码源类型。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Source withSubType(SubTypeEnum subType) {
        this.subType = subType;
        return this;
    }

    /**
     * 代码源管理平台。
     * @return subType
     */
    public SubTypeEnum getSubType() {
        return subType;
    }

    public void setSubType(SubTypeEnum subType) {
        this.subType = subType;
    }

    public Source withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url代码地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Source source = (Source) o;
        return Objects.equals(this.code, source.code) && Objects.equals(this.type, source.type)
            && Objects.equals(this.subType, source.subType) && Objects.equals(this.url, source.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, type, subType, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

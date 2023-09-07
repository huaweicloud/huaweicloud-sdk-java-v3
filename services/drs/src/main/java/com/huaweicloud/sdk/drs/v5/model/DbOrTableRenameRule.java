package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 库表更名规则  可以在名称添加前后缀， 填写前缀名，会给库表名称前面添加对前缀名，填写后缀名，会给库表名称后面添加对后缀名； 当前缀名和后缀名都写时，会给库表名称前后面添加对字符；
 */
public class DbOrTableRenameRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix_name")

    private String prefixName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix_name")

    private String suffixName;

    /**
     * 库表映射类型 prefixAndSuffix:前缀、后缀或者前后缀
     */
    public static final class TypeEnum {

        /**
         * Enum PREFIXANDSUFFIX for value: "prefixAndSuffix"
         */
        public static final TypeEnum PREFIXANDSUFFIX = new TypeEnum("prefixAndSuffix");

        /**
         * Enum MANYTOONE for value: "manyToOne"
         */
        public static final TypeEnum MANYTOONE = new TypeEnum("manyToOne");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("prefixAndSuffix", PREFIXANDSUFFIX);
            map.put("manyToOne", MANYTOONE);
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

    public DbOrTableRenameRule withPrefixName(String prefixName) {
        this.prefixName = prefixName;
        return this;
    }

    /**
     * 前缀名称 当type为prefixAndSuffix， 填写prefix_name，库表名称仅增加前缀，若同时也填写suffix_name, 库表名称增加前后缀
     * @return prefixName
     */
    public String getPrefixName() {
        return prefixName;
    }

    public void setPrefixName(String prefixName) {
        this.prefixName = prefixName;
    }

    public DbOrTableRenameRule withSuffixName(String suffixName) {
        this.suffixName = suffixName;
        return this;
    }

    /**
     * 后缀名称 当type为prefixAndSuffix， 填写suffix_name，库表名称仅增加后缀，若同时也填写prefix_name, 库表名称同时增加前后缀
     * @return suffixName
     */
    public String getSuffixName() {
        return suffixName;
    }

    public void setSuffixName(String suffixName) {
        this.suffixName = suffixName;
    }

    public DbOrTableRenameRule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 库表映射类型 prefixAndSuffix:前缀、后缀或者前后缀
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
        DbOrTableRenameRule that = (DbOrTableRenameRule) obj;
        return Objects.equals(this.prefixName, that.prefixName) && Objects.equals(this.suffixName, that.suffixName)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefixName, suffixName, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbOrTableRenameRule {\n");
        sb.append("    prefixName: ").append(toIndentedString(prefixName)).append("\n");
        sb.append("    suffixName: ").append(toIndentedString(suffixName)).append("\n");
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

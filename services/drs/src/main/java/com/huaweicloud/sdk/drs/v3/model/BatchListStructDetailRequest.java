package com.huaweicloud.sdk.drs.v3.model;

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
 * Request Object
 */
public class BatchListStructDetailRequest {

    /**
     * 数据库支持迁移对象类型
     */
    public static final class TypeEnum {

        /**
         * Enum DATABASE for value: "database"
         */
        public static final TypeEnum DATABASE = new TypeEnum("database");

        /**
         * Enum SCHEMA for value: "schema"
         */
        public static final TypeEnum SCHEMA = new TypeEnum("schema");

        /**
         * Enum TABLE for value: "table"
         */
        public static final TypeEnum TABLE = new TypeEnum("table");

        /**
         * Enum VIEW for value: "view"
         */
        public static final TypeEnum VIEW = new TypeEnum("view");

        /**
         * Enum PROCEDURE for value: "procedure"
         */
        public static final TypeEnum PROCEDURE = new TypeEnum("procedure");

        /**
         * Enum TRIGGER for value: "trigger"
         */
        public static final TypeEnum TRIGGER = new TypeEnum("trigger");

        /**
         * Enum INDEX for value: "index"
         */
        public static final TypeEnum INDEX = new TypeEnum("index");

        /**
         * Enum TABLE_INDEXS for value: "table_indexs"
         */
        public static final TypeEnum TABLE_INDEXS = new TypeEnum("table_indexs");

        /**
         * Enum TABLE_STRUCTURE for value: "table_structure"
         */
        public static final TypeEnum TABLE_STRUCTURE = new TypeEnum("table_structure");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("database", DATABASE);
            map.put("schema", SCHEMA);
            map.put("table", TABLE);
            map.put("view", VIEW);
            map.put("procedure", PROCEDURE);
            map.put("trigger", TRIGGER);
            map.put("index", INDEX);
            map.put("table_indexs", TABLE_INDEXS);
            map.put("table_structure", TABLE_STRUCTURE);
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

    /**
     * 请求语言类型
     */
    public static final class XLanguageEnum {

        /**
         * Enum EN_US for value: "en-us"
         */
        public static final XLanguageEnum EN_US = new XLanguageEnum("en-us");

        /**
         * Enum ZH_CN for value: "zh-cn"
         */
        public static final XLanguageEnum ZH_CN = new XLanguageEnum("zh-cn");

        private static final Map<String, XLanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XLanguageEnum> createStaticFields() {
            Map<String, XLanguageEnum> map = new HashMap<>();
            map.put("en-us", EN_US);
            map.put("zh-cn", ZH_CN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XLanguageEnum(String value) {
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
        public static XLanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new XLanguageEnum(value));
        }

        public static XLanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XLanguageEnum) {
                return this.value.equals(((XLanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private XLanguageEnum xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private BatchQueryJobReqPage body;

    public BatchListStructDetailRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据库支持迁移对象类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public BatchListStructDetailRequest withXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public XLanguageEnum getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(XLanguageEnum xLanguage) {
        this.xLanguage = xLanguage;
    }

    public BatchListStructDetailRequest withBody(BatchQueryJobReqPage body) {
        this.body = body;
        return this;
    }

    public BatchListStructDetailRequest withBody(Consumer<BatchQueryJobReqPage> bodySetter) {
        if (this.body == null) {
            this.body = new BatchQueryJobReqPage();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public BatchQueryJobReqPage getBody() {
        return body;
    }

    public void setBody(BatchQueryJobReqPage body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListStructDetailRequest that = (BatchListStructDetailRequest) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, xLanguage, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListStructDetailRequest {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

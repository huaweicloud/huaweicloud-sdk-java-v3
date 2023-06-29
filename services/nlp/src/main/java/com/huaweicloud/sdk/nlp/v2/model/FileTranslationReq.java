package com.huaweicloud.sdk.nlp.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class FileTranslationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * 翻译原语言，文档翻译服务当前仅支持中英互译。
     */
    public static final class FromEnum {

        /**
         * Enum ZH for value: "zh"
         */
        public static final FromEnum ZH = new FromEnum("zh");

        /**
         * Enum EN for value: "en"
         */
        public static final FromEnum EN = new FromEnum("en");

        private static final Map<String, FromEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FromEnum> createStaticFields() {
            Map<String, FromEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FromEnum(String value) {
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
        public static FromEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FromEnum(value));
        }

        public static FromEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FromEnum) {
                return this.value.equals(((FromEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private FromEnum from;

    /**
     * 翻译目标语言，文档翻译服务当前仅支持中英互译。
     */
    public static final class ToEnum {

        /**
         * Enum ZH for value: "zh"
         */
        public static final ToEnum ZH = new ToEnum("zh");

        /**
         * Enum EN for value: "en"
         */
        public static final ToEnum EN = new ToEnum("en");

        private static final Map<String, ToEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ToEnum> createStaticFields() {
            Map<String, ToEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ToEnum(String value) {
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
        public static ToEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ToEnum(value));
        }

        public static ToEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ToEnum) {
                return this.value.equals(((ToEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private ToEnum to;

    /**
     * 文档格式，当前仅支持翻译“docx”、“pptx”和“txt”格式的文档。
     */
    public static final class TypeEnum {

        /**
         * Enum DOCX for value: "docx"
         */
        public static final TypeEnum DOCX = new TypeEnum("docx");

        /**
         * Enum PPTX for value: "pptx"
         */
        public static final TypeEnum PPTX = new TypeEnum("pptx");

        /**
         * Enum TXT for value: "txt"
         */
        public static final TypeEnum TXT = new TypeEnum("txt");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("docx", DOCX);
            map.put("pptx", PPTX);
            map.put("txt", TXT);
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

    public FileTranslationReq withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 存放在OBS的文档文件路径，私密文件推荐使用临时授权URL调用服务，如何获取OBS文件URL和临时授权URL请参见配置OBS访问权限（https://support.huaweicloud.com/api-nlp/nlp_03_0080.html）。OBS的region要和请求服务的region保持一致，region不一致则OBS不可用，即使obs是公开访问权限。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileTranslationReq withFrom(FromEnum from) {
        this.from = from;
        return this;
    }

    /**
     * 翻译原语言，文档翻译服务当前仅支持中英互译。
     * @return from
     */
    public FromEnum getFrom() {
        return from;
    }

    public void setFrom(FromEnum from) {
        this.from = from;
    }

    public FileTranslationReq withTo(ToEnum to) {
        this.to = to;
        return this;
    }

    /**
     * 翻译目标语言，文档翻译服务当前仅支持中英互译。
     * @return to
     */
    public ToEnum getTo() {
        return to;
    }

    public void setTo(ToEnum to) {
        this.to = to;
    }

    public FileTranslationReq withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 文档格式，当前仅支持翻译“docx”、“pptx”和“txt”格式的文档。
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
        FileTranslationReq that = (FileTranslationReq) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.from, that.from)
            && Objects.equals(this.to, that.to) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, from, to, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileTranslationReq {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

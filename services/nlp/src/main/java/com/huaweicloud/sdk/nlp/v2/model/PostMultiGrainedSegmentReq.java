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
public class PostMultiGrainedSegmentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    /**
     * 支持的文本语言类型，目前只支持中文，默认为zh。
     */
    public static final class LangEnum {

        /**
         * Enum ZH for value: "zh"
         */
        public static final LangEnum ZH = new LangEnum("zh");

        private static final Map<String, LangEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LangEnum> createStaticFields() {
            Map<String, LangEnum> map = new HashMap<>();
            map.put("zh", ZH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LangEnum(String value) {
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
        public static LangEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LangEnum(value));
        }

        public static LangEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LangEnum) {
                return this.value.equals(((LangEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private LangEnum lang;

    /**
     * 分词粒度，1为最细粒度，2为最粗粒度，其它情况默认返回全部粒度分词树结果。
     */
    public static final class GranularityEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final GranularityEnum NUMBER_1 = new GranularityEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final GranularityEnum NUMBER_2 = new GranularityEnum(2);

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final GranularityEnum NUMBER_0 = new GranularityEnum(0);

        private static final Map<Integer, GranularityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, GranularityEnum> createStaticFields() {
            Map<Integer, GranularityEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            map.put(0, NUMBER_0);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        GranularityEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static GranularityEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GranularityEnum(value));
        }

        public static GranularityEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GranularityEnum) {
                return this.value.equals(((GranularityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granularity")

    private GranularityEnum granularity;

    public PostMultiGrainedSegmentReq withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 待分词文本，长度为1~64，文本编码为UTF-8。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PostMultiGrainedSegmentReq withLang(LangEnum lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 支持的文本语言类型，目前只支持中文，默认为zh。
     * @return lang
     */
    public LangEnum getLang() {
        return lang;
    }

    public void setLang(LangEnum lang) {
        this.lang = lang;
    }

    public PostMultiGrainedSegmentReq withGranularity(GranularityEnum granularity) {
        this.granularity = granularity;
        return this;
    }

    /**
     * 分词粒度，1为最细粒度，2为最粗粒度，其它情况默认返回全部粒度分词树结果。
     * @return granularity
     */
    public GranularityEnum getGranularity() {
        return granularity;
    }

    public void setGranularity(GranularityEnum granularity) {
        this.granularity = granularity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostMultiGrainedSegmentReq that = (PostMultiGrainedSegmentReq) obj;
        return Objects.equals(this.text, that.text) && Objects.equals(this.lang, that.lang)
            && Objects.equals(this.granularity, that.granularity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, lang, granularity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostMultiGrainedSegmentReq {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
        sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
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

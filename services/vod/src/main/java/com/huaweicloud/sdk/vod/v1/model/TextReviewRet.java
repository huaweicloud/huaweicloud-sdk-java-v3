package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 文本检测结果 */
public class TextReviewRet {

    /** 检测结果是否通过。 取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。 */
    public static final class SuggestionEnum {

        /** Enum BLOCK for value: "block" */
        public static final SuggestionEnum BLOCK = new SuggestionEnum("block");

        /** Enum PASS for value: "pass" */
        public static final SuggestionEnum PASS = new SuggestionEnum("pass");

        /** Enum REVIEW for value: "review" */
        public static final SuggestionEnum REVIEW = new SuggestionEnum("review");

        private static final Map<String, SuggestionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SuggestionEnum> createStaticFields() {
            Map<String, SuggestionEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("pass", PASS);
            map.put("review", REVIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SuggestionEnum(String value) {
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
        public static SuggestionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SuggestionEnum(value);
            }
            return result;
        }

        public static SuggestionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SuggestionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SuggestionEnum) {
                return this.value.equals(((SuggestionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private SuggestionEnum suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "politics")

    private String politics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "porn")

    private String porn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abuse")

    private String abuse;

    public TextReviewRet withSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /** 检测结果是否通过。 取值如下： - block：包含敏感信息，不通过。 - pass：不包含敏感信息，通过。 - review：需要人工复检。
     * 
     * @return suggestion */
    public SuggestionEnum getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(SuggestionEnum suggestion) {
        this.suggestion = suggestion;
    }

    public TextReviewRet withPolitics(String politics) {
        this.politics = politics;
        return this;
    }

    /** 涉政敏感词列表
     * 
     * @return politics */
    public String getPolitics() {
        return politics;
    }

    public void setPolitics(String politics) {
        this.politics = politics;
    }

    public TextReviewRet withPorn(String porn) {
        this.porn = porn;
        return this;
    }

    /** 涉黄敏感词列表
     * 
     * @return porn */
    public String getPorn() {
        return porn;
    }

    public void setPorn(String porn) {
        this.porn = porn;
    }

    public TextReviewRet withAbuse(String abuse) {
        this.abuse = abuse;
        return this;
    }

    /** 辱骂敏感词列表
     * 
     * @return abuse */
    public String getAbuse() {
        return abuse;
    }

    public void setAbuse(String abuse) {
        this.abuse = abuse;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextReviewRet textReviewRet = (TextReviewRet) o;
        return Objects.equals(this.suggestion, textReviewRet.suggestion)
            && Objects.equals(this.politics, textReviewRet.politics) && Objects.equals(this.porn, textReviewRet.porn)
            && Objects.equals(this.abuse, textReviewRet.abuse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, politics, porn, abuse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextReviewRet {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    politics: ").append(toIndentedString(politics)).append("\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
        sb.append("    abuse: ").append(toIndentedString(abuse)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

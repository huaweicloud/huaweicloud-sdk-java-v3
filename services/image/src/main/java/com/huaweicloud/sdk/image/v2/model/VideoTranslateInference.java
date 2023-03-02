package com.huaweicloud.sdk.image.v2.model;

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
 * VideoTranslateInference
 */
public class VideoTranslateInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_language")

    private String targetLanguage;

    /**
     * 是否回写
     */
    public static final class RewriteEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final RewriteEnum TRUE = new RewriteEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final RewriteEnum FALSE = new RewriteEnum("false");

        private static final Map<String, RewriteEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RewriteEnum> createStaticFields() {
            Map<String, RewriteEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RewriteEnum(String value) {
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
        public static RewriteEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RewriteEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RewriteEnum(value);
            }
            return result;
        }

        public static RewriteEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RewriteEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RewriteEnum) {
                return this.value.equals(((RewriteEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite")

    private RewriteEnum rewrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_config")

    private VideoTranslateInferenceRewriteConfig rewriteConfig;

    public VideoTranslateInference withTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }

    /**
     * 字幕翻译目标语言
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public VideoTranslateInference withRewrite(RewriteEnum rewrite) {
        this.rewrite = rewrite;
        return this;
    }

    /**
     * 是否回写
     * @return rewrite
     */
    public RewriteEnum getRewrite() {
        return rewrite;
    }

    public void setRewrite(RewriteEnum rewrite) {
        this.rewrite = rewrite;
    }

    public VideoTranslateInference withRewriteConfig(VideoTranslateInferenceRewriteConfig rewriteConfig) {
        this.rewriteConfig = rewriteConfig;
        return this;
    }

    public VideoTranslateInference withRewriteConfig(
        Consumer<VideoTranslateInferenceRewriteConfig> rewriteConfigSetter) {
        if (this.rewriteConfig == null) {
            this.rewriteConfig = new VideoTranslateInferenceRewriteConfig();
            rewriteConfigSetter.accept(this.rewriteConfig);
        }

        return this;
    }

    /**
     * Get rewriteConfig
     * @return rewriteConfig
     */
    public VideoTranslateInferenceRewriteConfig getRewriteConfig() {
        return rewriteConfig;
    }

    public void setRewriteConfig(VideoTranslateInferenceRewriteConfig rewriteConfig) {
        this.rewriteConfig = rewriteConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTranslateInference videoTranslateInference = (VideoTranslateInference) o;
        return Objects.equals(this.targetLanguage, videoTranslateInference.targetLanguage)
            && Objects.equals(this.rewrite, videoTranslateInference.rewrite)
            && Objects.equals(this.rewriteConfig, videoTranslateInference.rewriteConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetLanguage, rewrite, rewriteConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTranslateInference {\n");
        sb.append("    targetLanguage: ").append(toIndentedString(targetLanguage)).append("\n");
        sb.append("    rewrite: ").append(toIndentedString(rewrite)).append("\n");
        sb.append("    rewriteConfig: ").append(toIndentedString(rewriteConfig)).append("\n");
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

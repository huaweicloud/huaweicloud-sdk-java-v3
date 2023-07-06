package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 视频数据输入
 */
public class VideoCreateRequestData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_interval")

    private Integer frameInterval;

    /**
     * 支持的语言，默认为zh zh：中文
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH for value: "zh"
         */
        public static final LanguageEnum ZH = new LanguageEnum("zh");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh", ZH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageEnum(value));
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    public VideoCreateRequestData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 视频url地址
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoCreateRequestData withFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
        return this;
    }

    /**
     * 截帧频率间隔，单位为秒，取值范围为1~60s；若不传递默认5s截帧一次
     * @return frameInterval
     */
    public Integer getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
    }

    public VideoCreateRequestData withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 支持的语言，默认为zh zh：中文
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoCreateRequestData that = (VideoCreateRequestData) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.frameInterval, that.frameInterval)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, frameInterval, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCreateRequestData {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    frameInterval: ").append(toIndentedString(frameInterval)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

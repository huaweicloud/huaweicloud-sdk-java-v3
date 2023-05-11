package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VideoTagginginference
 */
public class VideoTagginginference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_title")

    private String videoTitle;

    /**
     * 标签语种
     */
    public static final class LanguageEnum {

        /**
         * Enum ZH for value: "zh"
         */
        public static final LanguageEnum ZH = new LanguageEnum("zh");

        /**
         * Enum EN for value: "en"
         */
        public static final LanguageEnum EN = new LanguageEnum("en");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("zh", ZH);
            map.put("en", EN);
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
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_celebrity")

    private String useCelebrity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_landmark")

    private String useLandmark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_logo")

    private String useLogo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ocr")

    private String useOcr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_sis")

    private String useSis;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_tagging")

    private String useTagging;

    public VideoTagginginference withVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
        return this;
    }

    /**
     * 视频标题
     * @return videoTitle
     */
    public String getVideoTitle() {
        return videoTitle;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public VideoTagginginference withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 标签语种
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public VideoTagginginference withUseCelebrity(String useCelebrity) {
        this.useCelebrity = useCelebrity;
        return this;
    }

    /**
     * 名人识别使用开关
     * @return useCelebrity
     */
    public String getUseCelebrity() {
        return useCelebrity;
    }

    public void setUseCelebrity(String useCelebrity) {
        this.useCelebrity = useCelebrity;
    }

    public VideoTagginginference withUseLandmark(String useLandmark) {
        this.useLandmark = useLandmark;
        return this;
    }

    /**
     * 地标识别使用开关
     * @return useLandmark
     */
    public String getUseLandmark() {
        return useLandmark;
    }

    public void setUseLandmark(String useLandmark) {
        this.useLandmark = useLandmark;
    }

    public VideoTagginginference withUseLogo(String useLogo) {
        this.useLogo = useLogo;
        return this;
    }

    /**
     * LOGO识别使用开关
     * @return useLogo
     */
    public String getUseLogo() {
        return useLogo;
    }

    public void setUseLogo(String useLogo) {
        this.useLogo = useLogo;
    }

    public VideoTagginginference withUseOcr(String useOcr) {
        this.useOcr = useOcr;
        return this;
    }

    /**
     * OCR识别使用开关
     * @return useOcr
     */
    public String getUseOcr() {
        return useOcr;
    }

    public void setUseOcr(String useOcr) {
        this.useOcr = useOcr;
    }

    public VideoTagginginference withUseSis(String useSis) {
        this.useSis = useSis;
        return this;
    }

    /**
     * 视频语音识别开关
     * @return useSis
     */
    public String getUseSis() {
        return useSis;
    }

    public void setUseSis(String useSis) {
        this.useSis = useSis;
    }

    public VideoTagginginference withUseTagging(String useTagging) {
        this.useTagging = useTagging;
        return this;
    }

    /**
     * 图像标签识别开关
     * @return useTagging
     */
    public String getUseTagging() {
        return useTagging;
    }

    public void setUseTagging(String useTagging) {
        this.useTagging = useTagging;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoTagginginference videoTagginginference = (VideoTagginginference) o;
        return Objects.equals(this.videoTitle, videoTagginginference.videoTitle)
            && Objects.equals(this.language, videoTagginginference.language)
            && Objects.equals(this.useCelebrity, videoTagginginference.useCelebrity)
            && Objects.equals(this.useLandmark, videoTagginginference.useLandmark)
            && Objects.equals(this.useLogo, videoTagginginference.useLogo)
            && Objects.equals(this.useOcr, videoTagginginference.useOcr)
            && Objects.equals(this.useSis, videoTagginginference.useSis)
            && Objects.equals(this.useTagging, videoTagginginference.useTagging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoTitle, language, useCelebrity, useLandmark, useLogo, useOcr, useSis, useTagging);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoTagginginference {\n");
        sb.append("    videoTitle: ").append(toIndentedString(videoTitle)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    useCelebrity: ").append(toIndentedString(useCelebrity)).append("\n");
        sb.append("    useLandmark: ").append(toIndentedString(useLandmark)).append("\n");
        sb.append("    useLogo: ").append(toIndentedString(useLogo)).append("\n");
        sb.append("    useOcr: ").append(toIndentedString(useOcr)).append("\n");
        sb.append("    useSis: ").append(toIndentedString(useSis)).append("\n");
        sb.append("    useTagging: ").append(toIndentedString(useTagging)).append("\n");
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

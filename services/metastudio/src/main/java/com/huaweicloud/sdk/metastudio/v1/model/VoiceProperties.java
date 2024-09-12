package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 声音配置信息
 */
public class VoiceProperties {

    /**
     * 任务标签。   * ECOMMERCE: 电商   * NEWS: 新闻   * MARKETING: 营销
     */
    public static final class JobTagEnum {

        /**
         * Enum ECOMMERCE for value: "ECOMMERCE"
         */
        public static final JobTagEnum ECOMMERCE = new JobTagEnum("ECOMMERCE");

        /**
         * Enum NEWS for value: "NEWS"
         */
        public static final JobTagEnum NEWS = new JobTagEnum("NEWS");

        /**
         * Enum MARKETING for value: "MARKETING"
         */
        public static final JobTagEnum MARKETING = new JobTagEnum("MARKETING");

        private static final Map<String, JobTagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTagEnum> createStaticFields() {
            Map<String, JobTagEnum> map = new HashMap<>();
            map.put("ECOMMERCE", ECOMMERCE);
            map.put("NEWS", NEWS);
            map.put("MARKETING", MARKETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTagEnum(String value) {
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
        public static JobTagEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTagEnum(value));
        }

        public static JobTagEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTagEnum) {
                return this.value.equals(((JobTagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_tag")

    private JobTagEnum jobTag;

    /**
     * 语音性别,是男性声音还是女性声音。 * FEMALE: 女性 * MALE: 男性
     */
    public static final class SexEnum {

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final SexEnum FEMALE = new SexEnum("FEMALE");

        /**
         * Enum MALE for value: "MALE"
         */
        public static final SexEnum MALE = new SexEnum("MALE");

        private static final Map<String, SexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SexEnum> createStaticFields() {
            Map<String, SexEnum> map = new HashMap<>();
            map.put("FEMALE", FEMALE);
            map.put("MALE", MALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SexEnum(String value) {
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
        public static SexEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SexEnum(value));
        }

        public static SexEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SexEnum) {
                return this.value.equals(((SexEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private SexEnum sex;

    /**
     * 训练语言,当前仅支持中文。 * CN: 中文 * EN: 英文
     */
    public static final class LanguageEnum {

        /**
         * Enum CN for value: "CN"
         */
        public static final LanguageEnum CN = new LanguageEnum("CN");

        /**
         * Enum EN for value: "EN"
         */
        public static final LanguageEnum EN = new LanguageEnum("EN");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("CN", CN);
            map.put("EN", EN);
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

    public VoiceProperties withJobTag(JobTagEnum jobTag) {
        this.jobTag = jobTag;
        return this;
    }

    /**
     * 任务标签。   * ECOMMERCE: 电商   * NEWS: 新闻   * MARKETING: 营销
     * @return jobTag
     */
    public JobTagEnum getJobTag() {
        return jobTag;
    }

    public void setJobTag(JobTagEnum jobTag) {
        this.jobTag = jobTag;
    }

    public VoiceProperties withSex(SexEnum sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 语音性别,是男性声音还是女性声音。 * FEMALE: 女性 * MALE: 男性
     * @return sex
     */
    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public VoiceProperties withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 训练语言,当前仅支持中文。 * CN: 中文 * EN: 英文
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
        VoiceProperties that = (VoiceProperties) obj;
        return Objects.equals(this.jobTag, that.jobTag) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.language, that.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTag, sex, language);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceProperties {\n");
        sb.append("    jobTag: ").append(toIndentedString(jobTag)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
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

package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDigitalHumanBusinessCardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info")

    private DigitalHumanBusinessCardJobInfo jobInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_templet_asset_id")

    private String cardTempletAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_text_config")

    private BusinessCardTextConfig cardTextConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "card_image_url")

    private BusinessCardImageUrl cardImageUrl;

    /**
     * 自我介绍驱动方式。 * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动，需要在资产库中先上传语音资产
     */
    public static final class IntroductionTypeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final IntroductionTypeEnum TEXT = new IntroductionTypeEnum("TEXT");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final IntroductionTypeEnum AUDIO = new IntroductionTypeEnum("AUDIO");

        private static final Map<String, IntroductionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IntroductionTypeEnum> createStaticFields() {
            Map<String, IntroductionTypeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IntroductionTypeEnum(String value) {
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
        public static IntroductionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IntroductionTypeEnum(value));
        }

        public static IntroductionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IntroductionTypeEnum) {
                return this.value.equals(((IntroductionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "introduction_type")

    private IntroductionTypeEnum introductionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "introduction_text")

    private String introductionText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_asset_id")

    private String voiceAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "introduction_audio_asset_id")

    private String introductionAudioAssetId;

    /**
     * 性别。 * MALE：男性 * FEMALE：女性
     */
    public static final class GenderEnum {

        /**
         * Enum MALE for value: "MALE"
         */
        public static final GenderEnum MALE = new GenderEnum("MALE");

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final GenderEnum FEMALE = new GenderEnum("FEMALE");

        private static final Map<String, GenderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GenderEnum> createStaticFields() {
            Map<String, GenderEnum> map = new HashMap<>();
            map.put("MALE", MALE);
            map.put("FEMALE", FEMALE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GenderEnum(String value) {
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
        public static GenderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GenderEnum(value));
        }

        public static GenderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GenderEnum) {
                return this.value.equals(((GenderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gender")

    private GenderEnum gender;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowDigitalHumanBusinessCardResponse withJobInfo(DigitalHumanBusinessCardJobInfo jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }

    public ShowDigitalHumanBusinessCardResponse withJobInfo(Consumer<DigitalHumanBusinessCardJobInfo> jobInfoSetter) {
        if (this.jobInfo == null) {
            this.jobInfo = new DigitalHumanBusinessCardJobInfo();
            jobInfoSetter.accept(this.jobInfo);
        }

        return this;
    }

    /**
     * Get jobInfo
     * @return jobInfo
     */
    public DigitalHumanBusinessCardJobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(DigitalHumanBusinessCardJobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public ShowDigitalHumanBusinessCardResponse withCardTempletAssetId(String cardTempletAssetId) {
        this.cardTempletAssetId = cardTempletAssetId;
        return this;
    }

    /**
     * 数字人名片模板资产ID。
     * @return cardTempletAssetId
     */
    public String getCardTempletAssetId() {
        return cardTempletAssetId;
    }

    public void setCardTempletAssetId(String cardTempletAssetId) {
        this.cardTempletAssetId = cardTempletAssetId;
    }

    public ShowDigitalHumanBusinessCardResponse withCardTextConfig(BusinessCardTextConfig cardTextConfig) {
        this.cardTextConfig = cardTextConfig;
        return this;
    }

    public ShowDigitalHumanBusinessCardResponse withCardTextConfig(
        Consumer<BusinessCardTextConfig> cardTextConfigSetter) {
        if (this.cardTextConfig == null) {
            this.cardTextConfig = new BusinessCardTextConfig();
            cardTextConfigSetter.accept(this.cardTextConfig);
        }

        return this;
    }

    /**
     * Get cardTextConfig
     * @return cardTextConfig
     */
    public BusinessCardTextConfig getCardTextConfig() {
        return cardTextConfig;
    }

    public void setCardTextConfig(BusinessCardTextConfig cardTextConfig) {
        this.cardTextConfig = cardTextConfig;
    }

    public ShowDigitalHumanBusinessCardResponse withCardImageUrl(BusinessCardImageUrl cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
        return this;
    }

    public ShowDigitalHumanBusinessCardResponse withCardImageUrl(Consumer<BusinessCardImageUrl> cardImageUrlSetter) {
        if (this.cardImageUrl == null) {
            this.cardImageUrl = new BusinessCardImageUrl();
            cardImageUrlSetter.accept(this.cardImageUrl);
        }

        return this;
    }

    /**
     * Get cardImageUrl
     * @return cardImageUrl
     */
    public BusinessCardImageUrl getCardImageUrl() {
        return cardImageUrl;
    }

    public void setCardImageUrl(BusinessCardImageUrl cardImageUrl) {
        this.cardImageUrl = cardImageUrl;
    }

    public ShowDigitalHumanBusinessCardResponse withIntroductionType(IntroductionTypeEnum introductionType) {
        this.introductionType = introductionType;
        return this;
    }

    /**
     * 自我介绍驱动方式。 * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动，需要在资产库中先上传语音资产
     * @return introductionType
     */
    public IntroductionTypeEnum getIntroductionType() {
        return introductionType;
    }

    public void setIntroductionType(IntroductionTypeEnum introductionType) {
        this.introductionType = introductionType;
    }

    public ShowDigitalHumanBusinessCardResponse withIntroductionText(String introductionText) {
        this.introductionText = introductionText;
        return this;
    }

    /**
     * 自我介绍文本，用于驱动数字人口型。
     * @return introductionText
     */
    public String getIntroductionText() {
        return introductionText;
    }

    public void setIntroductionText(String introductionText) {
        this.introductionText = introductionText;
    }

    public ShowDigitalHumanBusinessCardResponse withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 音色资产ID。
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public ShowDigitalHumanBusinessCardResponse withIntroductionAudioAssetId(String introductionAudioAssetId) {
        this.introductionAudioAssetId = introductionAudioAssetId;
        return this;
    }

    /**
     * 自我介绍语音资产ID，用于驱动数字人口型。 > * 介绍语音需要作为asset_type=AUDIO资产先上传至资产库。
     * @return introductionAudioAssetId
     */
    public String getIntroductionAudioAssetId() {
        return introductionAudioAssetId;
    }

    public void setIntroductionAudioAssetId(String introductionAudioAssetId) {
        this.introductionAudioAssetId = introductionAudioAssetId;
    }

    public ShowDigitalHumanBusinessCardResponse withGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    /**
     * 性别。 * MALE：男性 * FEMALE：女性
     * @return gender
     */
    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public ShowDigitalHumanBusinessCardResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDigitalHumanBusinessCardResponse that = (ShowDigitalHumanBusinessCardResponse) obj;
        return Objects.equals(this.jobInfo, that.jobInfo)
            && Objects.equals(this.cardTempletAssetId, that.cardTempletAssetId)
            && Objects.equals(this.cardTextConfig, that.cardTextConfig)
            && Objects.equals(this.cardImageUrl, that.cardImageUrl)
            && Objects.equals(this.introductionType, that.introductionType)
            && Objects.equals(this.introductionText, that.introductionText)
            && Objects.equals(this.voiceAssetId, that.voiceAssetId)
            && Objects.equals(this.introductionAudioAssetId, that.introductionAudioAssetId)
            && Objects.equals(this.gender, that.gender) && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobInfo,
            cardTempletAssetId,
            cardTextConfig,
            cardImageUrl,
            introductionType,
            introductionText,
            voiceAssetId,
            introductionAudioAssetId,
            gender,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDigitalHumanBusinessCardResponse {\n");
        sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
        sb.append("    cardTempletAssetId: ").append(toIndentedString(cardTempletAssetId)).append("\n");
        sb.append("    cardTextConfig: ").append(toIndentedString(cardTextConfig)).append("\n");
        sb.append("    cardImageUrl: ").append(toIndentedString(cardImageUrl)).append("\n");
        sb.append("    introductionType: ").append(toIndentedString(introductionType)).append("\n");
        sb.append("    introductionText: ").append(toIndentedString(introductionText)).append("\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    introductionAudioAssetId: ").append(toIndentedString(introductionAudioAssetId)).append("\n");
        sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

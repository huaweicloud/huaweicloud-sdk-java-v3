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
 * 语音配置参数
 */
public class VoiceConfigRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_asset_id")

    private String voiceAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Integer speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pitch")

    private Integer pitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume")

    private Integer volume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    /**
     * 语言类型。默认值CN。 * CN：简体中文。 * EN：英语。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
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

        /**
         * Enum ESP for value: "ESP"
         */
        public static final LanguageEnum ESP = new LanguageEnum("ESP");

        /**
         * Enum POR for value: "por"
         */
        public static final LanguageEnum POR = new LanguageEnum("por");

        /**
         * Enum ARABIC for value: "Arabic"
         */
        public static final LanguageEnum ARABIC = new LanguageEnum("Arabic");

        /**
         * Enum THAI for value: "Thai"
         */
        public static final LanguageEnum THAI = new LanguageEnum("Thai");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("CN", CN);
            map.put("EN", EN);
            map.put("ESP", ESP);
            map.put("por", POR);
            map.put("Arabic", ARABIC);
            map.put("Thai", THAI);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_desc")

    private String languageDesc;

    public VoiceConfigRsp withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * 语音合成特征字符串
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public VoiceConfigRsp withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速。默认值100，最小值50，最大值200。 > 当取值为“100”时，表示一个成年人正常的语速，约为250字/分钟。
     * minimum: 50
     * maximum: 200
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public VoiceConfigRsp withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 音高。默认值100，最小值50，最大值200。
     * minimum: 50
     * maximum: 200
     * @return pitch
     */
    public Integer getPitch() {
        return pitch;
    }

    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    public VoiceConfigRsp withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量。默认值140，最小值90，最大值240。
     * minimum: 90
     * maximum: 240
     * @return volume
     */
    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public VoiceConfigRsp withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 第三方TTS供应商类型。 * XIMALAYA：喜马拉雅TTS * HUAWEI_EI：EI TTS * MOBVOI：出门问问TTS
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public VoiceConfigRsp withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 语言类型。默认值CN。 * CN：简体中文。 * EN：英语。 * ESP：西班牙语（仅海外站点支持） * por：葡萄牙语（仅海外站点支持） * Arabic：阿拉伯语（仅海外站点支持） * Thai：泰语（仅海外站点支持）
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public VoiceConfigRsp withLanguageDesc(String languageDesc) {
        this.languageDesc = languageDesc;
        return this;
    }

    /**
     * 语言描述
     * @return languageDesc
     */
    public String getLanguageDesc() {
        return languageDesc;
    }

    public void setLanguageDesc(String languageDesc) {
        this.languageDesc = languageDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceConfigRsp that = (VoiceConfigRsp) obj;
        return Objects.equals(this.voiceAssetId, that.voiceAssetId) && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.volume, that.volume)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.language, that.language)
            && Objects.equals(this.languageDesc, that.languageDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceAssetId, speed, pitch, volume, provider, language, languageDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceConfigRsp {\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    languageDesc: ").append(toIndentedString(languageDesc)).append("\n");
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

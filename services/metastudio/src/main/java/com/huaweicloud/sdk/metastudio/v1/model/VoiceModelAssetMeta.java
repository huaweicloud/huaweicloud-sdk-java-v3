package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音色模型元数据。
 */
public class VoiceModelAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private Integer order;

    /**
     * **参数解释**： 声音资产类型。 **约束限制**： 不涉及。 **取值范围**： * COMMON：通用情感模型 * CLONE：语音克隆模型
     */
    public static final class ModelTypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final ModelTypeEnum COMMON = new ModelTypeEnum("COMMON");

        /**
         * Enum CLONE for value: "CLONE"
         */
        public static final ModelTypeEnum CLONE = new ModelTypeEnum("CLONE");

        private static final Map<String, ModelTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelTypeEnum> createStaticFields() {
            Map<String, ModelTypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("CLONE", CLONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelTypeEnum(String value) {
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
        public static ModelTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelTypeEnum(value));
        }

        public static ModelTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelTypeEnum) {
                return this.value.equals(((ModelTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private ModelTypeEnum modelType;

    /**
     * **参数解释**： 声音性别。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知性别声音 * MALE：男性声音 * FEMALE：女性声音
     */
    public static final class SexEnum {

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final SexEnum UNKNOW = new SexEnum("UNKNOW");

        /**
         * Enum MALE for value: "MALE"
         */
        public static final SexEnum MALE = new SexEnum("MALE");

        /**
         * Enum FEMALE for value: "FEMALE"
         */
        public static final SexEnum FEMALE = new SexEnum("FEMALE");

        private static final Map<String, SexEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SexEnum> createStaticFields() {
            Map<String, SexEnum> map = new HashMap<>();
            map.put("UNKNOW", UNKNOW);
            map.put("MALE", MALE);
            map.put("FEMALE", FEMALE);
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
     * **参数解释**： 声音语言。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知 * CN：中文 * EN：英文 * GER：德语 * fr：法语 * Kr：韩语 * por：葡萄牙语 * JPN：日语 * Ita：意大利语 * ESP：西班牙语 * DBH：东北话 * GT：港台 * GXH：广西话 * HBH：湖北话 * SXH：陕西话 * SCH：四川话 * YY：粤语 * Russian: 俄罗斯语 * Filipino: 菲律宾语 * Dutch: 荷兰语 * Indonesian: 印尼语 * Vietnamese: 越南语 * Arabic: 阿拉伯语 * Turkish: 土耳其语 * Malay: 马来语 * Thai: 泰语 * Finnish: 芬兰语
     */
    public static final class LanguageEnum {

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final LanguageEnum UNKNOW = new LanguageEnum("UNKNOW");

        /**
         * Enum CN for value: "CN"
         */
        public static final LanguageEnum CN = new LanguageEnum("CN");

        /**
         * Enum EN for value: "EN"
         */
        public static final LanguageEnum EN = new LanguageEnum("EN");

        /**
         * Enum GER for value: "GER"
         */
        public static final LanguageEnum GER = new LanguageEnum("GER");

        /**
         * Enum FR for value: "fr"
         */
        public static final LanguageEnum FR = new LanguageEnum("fr");

        /**
         * Enum KR for value: "Kr"
         */
        public static final LanguageEnum KR = new LanguageEnum("Kr");

        /**
         * Enum POR for value: "por"
         */
        public static final LanguageEnum POR = new LanguageEnum("por");

        /**
         * Enum JPN for value: "JPN"
         */
        public static final LanguageEnum JPN = new LanguageEnum("JPN");

        /**
         * Enum ITA for value: "Ita"
         */
        public static final LanguageEnum ITA = new LanguageEnum("Ita");

        /**
         * Enum ESP for value: "ESP"
         */
        public static final LanguageEnum ESP = new LanguageEnum("ESP");

        /**
         * Enum DBH for value: "DBH"
         */
        public static final LanguageEnum DBH = new LanguageEnum("DBH");

        /**
         * Enum GT for value: "GT"
         */
        public static final LanguageEnum GT = new LanguageEnum("GT");

        /**
         * Enum GXH for value: "GXH"
         */
        public static final LanguageEnum GXH = new LanguageEnum("GXH");

        /**
         * Enum HBH for value: "HBH"
         */
        public static final LanguageEnum HBH = new LanguageEnum("HBH");

        /**
         * Enum SXH for value: "SXH"
         */
        public static final LanguageEnum SXH = new LanguageEnum("SXH");

        /**
         * Enum SCH for value: "SCH"
         */
        public static final LanguageEnum SCH = new LanguageEnum("SCH");

        /**
         * Enum YY for value: "YY"
         */
        public static final LanguageEnum YY = new LanguageEnum("YY");

        /**
         * Enum RUSSIAN for value: "Russian"
         */
        public static final LanguageEnum RUSSIAN = new LanguageEnum("Russian");

        /**
         * Enum FILIPINO for value: "Filipino"
         */
        public static final LanguageEnum FILIPINO = new LanguageEnum("Filipino");

        /**
         * Enum DUTCH for value: "Dutch"
         */
        public static final LanguageEnum DUTCH = new LanguageEnum("Dutch");

        /**
         * Enum INDONESIAN for value: "Indonesian"
         */
        public static final LanguageEnum INDONESIAN = new LanguageEnum("Indonesian");

        /**
         * Enum VIETNAMESE for value: "Vietnamese"
         */
        public static final LanguageEnum VIETNAMESE = new LanguageEnum("Vietnamese");

        /**
         * Enum ARABIC for value: "Arabic"
         */
        public static final LanguageEnum ARABIC = new LanguageEnum("Arabic");

        /**
         * Enum TURKISH for value: "Turkish"
         */
        public static final LanguageEnum TURKISH = new LanguageEnum("Turkish");

        /**
         * Enum MALAY for value: "Malay"
         */
        public static final LanguageEnum MALAY = new LanguageEnum("Malay");

        /**
         * Enum THAI for value: "Thai"
         */
        public static final LanguageEnum THAI = new LanguageEnum("Thai");

        /**
         * Enum FINNISH for value: "Finnish"
         */
        public static final LanguageEnum FINNISH = new LanguageEnum("Finnish");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("UNKNOW", UNKNOW);
            map.put("CN", CN);
            map.put("EN", EN);
            map.put("GER", GER);
            map.put("fr", FR);
            map.put("Kr", KR);
            map.put("por", POR);
            map.put("JPN", JPN);
            map.put("Ita", ITA);
            map.put("ESP", ESP);
            map.put("DBH", DBH);
            map.put("GT", GT);
            map.put("GXH", GXH);
            map.put("HBH", HBH);
            map.put("SXH", SXH);
            map.put("SCH", SCH);
            map.put("YY", YY);
            map.put("Russian", RUSSIAN);
            map.put("Filipino", FILIPINO);
            map.put("Dutch", DUTCH);
            map.put("Indonesian", INDONESIAN);
            map.put("Vietnamese", VIETNAMESE);
            map.put("Arabic", ARABIC);
            map.put("Turkish", TURKISH);
            map.put("Malay", MALAY);
            map.put("Thai", THAI);
            map.put("Finnish", FINNISH);
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
    @JsonProperty(value = "languages")

    private List<Language> languages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_ratio")

    private Float speedRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ratio")

    private Float volumeRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_realtime_voice")

    private Boolean isRealtimeVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "style")

    private String style;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_capability")

    private VoiceCapability voiceCapability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_voice_meta")

    private ExternalVoiceAssetMeta externalVoiceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_vc_process")

    private Boolean isSupportVcProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_flexus")

    private Boolean isFlexus;

    public VoiceModelAssetMeta withOrder(Integer order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**： 展示顺序。 **约束限制**： 不涉及。
     * minimum: 0
     * maximum: 32767
     * @return order
     */
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public VoiceModelAssetMeta withModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * **参数解释**： 声音资产类型。 **约束限制**： 不涉及。 **取值范围**： * COMMON：通用情感模型 * CLONE：语音克隆模型
     * @return modelType
     */
    public ModelTypeEnum getModelType() {
        return modelType;
    }

    public void setModelType(ModelTypeEnum modelType) {
        this.modelType = modelType;
    }

    public VoiceModelAssetMeta withSex(SexEnum sex) {
        this.sex = sex;
        return this;
    }

    /**
     * **参数解释**： 声音性别。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知性别声音 * MALE：男性声音 * FEMALE：女性声音
     * @return sex
     */
    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public VoiceModelAssetMeta withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释**： 声音语言。 **约束限制**： 不涉及。 **取值范围**： * UNKNOW：未知 * CN：中文 * EN：英文 * GER：德语 * fr：法语 * Kr：韩语 * por：葡萄牙语 * JPN：日语 * Ita：意大利语 * ESP：西班牙语 * DBH：东北话 * GT：港台 * GXH：广西话 * HBH：湖北话 * SXH：陕西话 * SCH：四川话 * YY：粤语 * Russian: 俄罗斯语 * Filipino: 菲律宾语 * Dutch: 荷兰语 * Indonesian: 印尼语 * Vietnamese: 越南语 * Arabic: 阿拉伯语 * Turkish: 土耳其语 * Malay: 马来语 * Thai: 泰语 * Finnish: 芬兰语
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public VoiceModelAssetMeta withLanguages(List<Language> languages) {
        this.languages = languages;
        return this;
    }

    public VoiceModelAssetMeta addLanguagesItem(Language languagesItem) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        this.languages.add(languagesItem);
        return this;
    }

    public VoiceModelAssetMeta withLanguages(Consumer<List<Language>> languagesSetter) {
        if (this.languages == null) {
            this.languages = new ArrayList<>();
        }
        languagesSetter.accept(this.languages);
        return this;
    }

    /**
     * Get languages
     * @return languages
     */
    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public VoiceModelAssetMeta withSpeedRatio(Float speedRatio) {
        this.speedRatio = speedRatio;
        return this;
    }

    /**
     * **参数解释**： 语速缩放比例。 **约束限制**： 不涉及
     * minimum: 0
     * maximum: 1E+2
     * @return speedRatio
     */
    public Float getSpeedRatio() {
        return speedRatio;
    }

    public void setSpeedRatio(Float speedRatio) {
        this.speedRatio = speedRatio;
    }

    public VoiceModelAssetMeta withVolumeRatio(Float volumeRatio) {
        this.volumeRatio = volumeRatio;
        return this;
    }

    /**
     * **参数解释**： 音量缩放比例。 **约束限制**： 不涉及
     * minimum: 0
     * maximum: 1E+2
     * @return volumeRatio
     */
    public Float getVolumeRatio() {
        return volumeRatio;
    }

    public void setVolumeRatio(Float volumeRatio) {
        this.volumeRatio = volumeRatio;
    }

    public VoiceModelAssetMeta withIsRealtimeVoice(Boolean isRealtimeVoice) {
        this.isRealtimeVoice = isRealtimeVoice;
        return this;
    }

    /**
     * **参数解释**： 该音色是否支持实时合成。 **约束限制**： 支持实时合成的音色，可以用于直播和智能交互场景。否则只能用于视频制作。 **取值范围**： * true: 支持实时合成 * false: 不支持实时合成
     * @return isRealtimeVoice
     */
    public Boolean getIsRealtimeVoice() {
        return isRealtimeVoice;
    }

    public void setIsRealtimeVoice(Boolean isRealtimeVoice) {
        this.isRealtimeVoice = isRealtimeVoice;
    }

    public VoiceModelAssetMeta withStyle(String style) {
        this.style = style;
        return this;
    }

    /**
     * 风格参考
     * @return style
     */
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public VoiceModelAssetMeta withVoiceCapability(VoiceCapability voiceCapability) {
        this.voiceCapability = voiceCapability;
        return this;
    }

    public VoiceModelAssetMeta withVoiceCapability(Consumer<VoiceCapability> voiceCapabilitySetter) {
        if (this.voiceCapability == null) {
            this.voiceCapability = new VoiceCapability();
            voiceCapabilitySetter.accept(this.voiceCapability);
        }

        return this;
    }

    /**
     * Get voiceCapability
     * @return voiceCapability
     */
    public VoiceCapability getVoiceCapability() {
        return voiceCapability;
    }

    public void setVoiceCapability(VoiceCapability voiceCapability) {
        this.voiceCapability = voiceCapability;
    }

    public VoiceModelAssetMeta withExternalVoiceMeta(ExternalVoiceAssetMeta externalVoiceMeta) {
        this.externalVoiceMeta = externalVoiceMeta;
        return this;
    }

    public VoiceModelAssetMeta withExternalVoiceMeta(Consumer<ExternalVoiceAssetMeta> externalVoiceMetaSetter) {
        if (this.externalVoiceMeta == null) {
            this.externalVoiceMeta = new ExternalVoiceAssetMeta();
            externalVoiceMetaSetter.accept(this.externalVoiceMeta);
        }

        return this;
    }

    /**
     * Get externalVoiceMeta
     * @return externalVoiceMeta
     */
    public ExternalVoiceAssetMeta getExternalVoiceMeta() {
        return externalVoiceMeta;
    }

    public void setExternalVoiceMeta(ExternalVoiceAssetMeta externalVoiceMeta) {
        this.externalVoiceMeta = externalVoiceMeta;
    }

    public VoiceModelAssetMeta withIsSupportVcProcess(Boolean isSupportVcProcess) {
        this.isSupportVcProcess = isSupportVcProcess;
        return this;
    }

    /**
     * 是否支持vc。
     * @return isSupportVcProcess
     */
    public Boolean getIsSupportVcProcess() {
        return isSupportVcProcess;
    }

    public void setIsSupportVcProcess(Boolean isSupportVcProcess) {
        this.isSupportVcProcess = isSupportVcProcess;
    }

    public VoiceModelAssetMeta withIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
        return this;
    }

    /**
     * 是否是Flexus版本声音。
     * @return isFlexus
     */
    public Boolean getIsFlexus() {
        return isFlexus;
    }

    public void setIsFlexus(Boolean isFlexus) {
        this.isFlexus = isFlexus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceModelAssetMeta that = (VoiceModelAssetMeta) obj;
        return Objects.equals(this.order, that.order) && Objects.equals(this.modelType, that.modelType)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.language, that.language)
            && Objects.equals(this.languages, that.languages) && Objects.equals(this.speedRatio, that.speedRatio)
            && Objects.equals(this.volumeRatio, that.volumeRatio)
            && Objects.equals(this.isRealtimeVoice, that.isRealtimeVoice) && Objects.equals(this.style, that.style)
            && Objects.equals(this.voiceCapability, that.voiceCapability)
            && Objects.equals(this.externalVoiceMeta, that.externalVoiceMeta)
            && Objects.equals(this.isSupportVcProcess, that.isSupportVcProcess)
            && Objects.equals(this.isFlexus, that.isFlexus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order,
            modelType,
            sex,
            language,
            languages,
            speedRatio,
            volumeRatio,
            isRealtimeVoice,
            style,
            voiceCapability,
            externalVoiceMeta,
            isSupportVcProcess,
            isFlexus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceModelAssetMeta {\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
        sb.append("    speedRatio: ").append(toIndentedString(speedRatio)).append("\n");
        sb.append("    volumeRatio: ").append(toIndentedString(volumeRatio)).append("\n");
        sb.append("    isRealtimeVoice: ").append(toIndentedString(isRealtimeVoice)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    voiceCapability: ").append(toIndentedString(voiceCapability)).append("\n");
        sb.append("    externalVoiceMeta: ").append(toIndentedString(externalVoiceMeta)).append("\n");
        sb.append("    isSupportVcProcess: ").append(toIndentedString(isSupportVcProcess)).append("\n");
        sb.append("    isFlexus: ").append(toIndentedString(isFlexus)).append("\n");
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

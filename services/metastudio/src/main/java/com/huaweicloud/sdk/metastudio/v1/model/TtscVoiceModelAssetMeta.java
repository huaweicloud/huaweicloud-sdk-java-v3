package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 音色模型元数据。
 */
public class TtscVoiceModelAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_voice_meta")

    private TtscExternalVoiceAssetMeta externalVoiceMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_ratio")

    private Float speedRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_ratio")

    private Float volumeRatio;

    public TtscVoiceModelAssetMeta withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 音色性别。 * UNKNOW：中性音色 * MALE：男性音色 * FEMALE：女性音色  默认UNKNOW。
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public TtscVoiceModelAssetMeta withExternalVoiceMeta(TtscExternalVoiceAssetMeta externalVoiceMeta) {
        this.externalVoiceMeta = externalVoiceMeta;
        return this;
    }

    public TtscVoiceModelAssetMeta withExternalVoiceMeta(Consumer<TtscExternalVoiceAssetMeta> externalVoiceMetaSetter) {
        if (this.externalVoiceMeta == null) {
            this.externalVoiceMeta = new TtscExternalVoiceAssetMeta();
            externalVoiceMetaSetter.accept(this.externalVoiceMeta);
        }

        return this;
    }

    /**
     * Get externalVoiceMeta
     * @return externalVoiceMeta
     */
    public TtscExternalVoiceAssetMeta getExternalVoiceMeta() {
        return externalVoiceMeta;
    }

    public void setExternalVoiceMeta(TtscExternalVoiceAssetMeta externalVoiceMeta) {
        this.externalVoiceMeta = externalVoiceMeta;
    }

    public TtscVoiceModelAssetMeta withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 音色语言。 * UNKNOW：未知 * CN：中文 * EN：英文 * GER：德语 * fr：法语 * Kr：韩语 * por：葡萄牙语 * JPN：日语 * Ita：意大利语 * ESP：西班牙语 * DBH：东北话 * GT：港台 * GXH：广西话 * HBH：湖北话 * SXH：陕西话 * SCH：四川话 * YY：粤语 * Russian: 俄罗斯语 * Filipino: 菲律宾语 * Dutch: 荷兰语 * Indonesian: 印尼语 * Vietnamese: 越南语 * Arabic: 阿拉伯语 * Turkish: 土耳其语 * Malay: 马来语 * Thai: 泰语 * Finnish: 芬兰语  默认UNKNOW。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TtscVoiceModelAssetMeta withSpeedRatio(Float speedRatio) {
        this.speedRatio = speedRatio;
        return this;
    }

    /**
     * 语速缩放比例
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

    public TtscVoiceModelAssetMeta withVolumeRatio(Float volumeRatio) {
        this.volumeRatio = volumeRatio;
        return this;
    }

    /**
     * 音量缩放比例
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtscVoiceModelAssetMeta that = (TtscVoiceModelAssetMeta) obj;
        return Objects.equals(this.sex, that.sex) && Objects.equals(this.externalVoiceMeta, that.externalVoiceMeta)
            && Objects.equals(this.language, that.language) && Objects.equals(this.speedRatio, that.speedRatio)
            && Objects.equals(this.volumeRatio, that.volumeRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sex, externalVoiceMeta, language, speedRatio, volumeRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtscVoiceModelAssetMeta {\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    externalVoiceMeta: ").append(toIndentedString(externalVoiceMeta)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    speedRatio: ").append(toIndentedString(speedRatio)).append("\n");
        sb.append("    volumeRatio: ").append(toIndentedString(volumeRatio)).append("\n");
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

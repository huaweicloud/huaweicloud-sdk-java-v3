package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文本转语音试听请求。
 */
public class CreateTtsAuditionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    private String emotion;

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
    @JsonProperty(value = "business_type")

    private String businessType;

    public CreateTtsAuditionRequestBody withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 待合成文本。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CreateTtsAuditionRequestBody withEmotion(String emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 音色ID，获取方式详见[获取音色ID](metastudio_02_0054.xml)。
     * @return emotion
     */
    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    public CreateTtsAuditionRequestBody withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 语速。 * 当取值为“100”时，表示一个成年人正常的语速，约为250字/分钟。 * 50表示0.5倍语速，100表示正常语速，200表示2倍语速。
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

    public CreateTtsAuditionRequestBody withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * 音高。
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

    public CreateTtsAuditionRequestBody withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * 音量。
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

    public CreateTtsAuditionRequestBody withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 业务场景，多个入口调用试听接口时的业务场景
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTtsAuditionRequestBody that = (CreateTtsAuditionRequestBody) obj;
        return Objects.equals(this.text, that.text) && Objects.equals(this.emotion, that.emotion)
            && Objects.equals(this.speed, that.speed) && Objects.equals(this.pitch, that.pitch)
            && Objects.equals(this.volume, that.volume) && Objects.equals(this.businessType, that.businessType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, emotion, speed, pitch, volume, businessType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTtsAuditionRequestBody {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
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

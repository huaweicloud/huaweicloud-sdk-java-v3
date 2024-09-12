package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 语音配置参数。
 */
public class VoiceConfig {

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

    public VoiceConfig withVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
        return this;
    }

    /**
     * **参数解释**： 音色资产ID，可以从资产库中查询。 **约束限制**： 不涉及。 **取值范围**： 字符长度1-256位。 **默认取值**： 不涉及。
     * @return voiceAssetId
     */
    public String getVoiceAssetId() {
        return voiceAssetId;
    }

    public void setVoiceAssetId(String voiceAssetId) {
        this.voiceAssetId = voiceAssetId;
    }

    public VoiceConfig withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * **参数解释**： 语速。50表示0.5倍语速，100表示正常语速，200表示2倍语速。 当取值为“100”时，表示一个成年人的正常语速，约为250字/分钟。  **约束限制**： 不涉及。
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

    public VoiceConfig withPitch(Integer pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * **参数解释**： 音高。 **约束限制**： 不涉及。
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

    public VoiceConfig withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    /**
     * **参数解释**： 音量。 **约束限制**： 不涉及。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceConfig that = (VoiceConfig) obj;
        return Objects.equals(this.voiceAssetId, that.voiceAssetId) && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.pitch, that.pitch) && Objects.equals(this.volume, that.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceAssetId, speed, pitch, volume);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceConfig {\n");
        sb.append("    voiceAssetId: ").append(toIndentedString(voiceAssetId)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    pitch: ").append(toIndentedString(pitch)).append("\n");
        sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

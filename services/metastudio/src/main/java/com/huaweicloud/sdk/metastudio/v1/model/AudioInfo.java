package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AudioInfo
 */
public class AudioInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_id")

    private Integer audioId;

    public AudioInfo withAudioId(Integer audioId) {
        this.audioId = audioId;
        return this;
    }

    /**
     * **参数解释**： 音频id。 > * 获取方式：剧本为音频驱动时，查询剧本详情或者更新剧本会返回audio_id  **约束限制**： 不涉及 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 10000
     * @return audioId
     */
    public Integer getAudioId() {
        return audioId;
    }

    public void setAudioId(Integer audioId) {
        this.audioId = audioId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioInfo that = (AudioInfo) obj;
        return Objects.equals(this.audioId, that.audioId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioInfo {\n");
        sb.append("    audioId: ").append(toIndentedString(audioId)).append("\n");
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

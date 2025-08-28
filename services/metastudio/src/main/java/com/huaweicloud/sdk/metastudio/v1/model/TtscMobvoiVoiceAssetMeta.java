package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 出门问问TTS音色元数据。
 */
public class TtscMobvoiVoiceAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speaker")

    private String speaker;

    public TtscMobvoiVoiceAssetMeta withSpeaker(String speaker) {
        this.speaker = speaker;
        return this;
    }

    /**
     * 合成音频指定发音人
     * @return speaker
     */
    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TtscMobvoiVoiceAssetMeta that = (TtscMobvoiVoiceAssetMeta) obj;
        return Objects.equals(this.speaker, that.speaker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speaker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TtscMobvoiVoiceAssetMeta {\n");
        sb.append("    speaker: ").append(toIndentedString(speaker)).append("\n");
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

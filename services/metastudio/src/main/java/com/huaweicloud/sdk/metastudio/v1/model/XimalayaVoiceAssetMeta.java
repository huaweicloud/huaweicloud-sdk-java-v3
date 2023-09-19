package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 喜马拉雅TTS音色元数据。此参数仅TTSA内部使用，不对外开放。
 */
public class XimalayaVoiceAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speaker_name")

    private String speakerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speaker_variant")

    private String speakerVariant;

    public XimalayaVoiceAssetMeta withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 音色适用领域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public XimalayaVoiceAssetMeta withSpeakerName(String speakerName) {
        this.speakerName = speakerName;
        return this;
    }

    /**
     * 音色名称。
     * @return speakerName
     */
    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public XimalayaVoiceAssetMeta withSpeakerVariant(String speakerVariant) {
        this.speakerVariant = speakerVariant;
        return this;
    }

    /**
     * 音色变声。
     * @return speakerVariant
     */
    public String getSpeakerVariant() {
        return speakerVariant;
    }

    public void setSpeakerVariant(String speakerVariant) {
        this.speakerVariant = speakerVariant;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        XimalayaVoiceAssetMeta that = (XimalayaVoiceAssetMeta) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.speakerName, that.speakerName)
            && Objects.equals(this.speakerVariant, that.speakerVariant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, speakerName, speakerVariant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class XimalayaVoiceAssetMeta {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    speakerName: ").append(toIndentedString(speakerName)).append("\n");
        sb.append("    speakerVariant: ").append(toIndentedString(speakerVariant)).append("\n");
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

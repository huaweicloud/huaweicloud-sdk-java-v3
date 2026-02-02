package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 注册成功的声音列表，调用失败时无此字段。
 */
public class VoiceListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voices")

    private List<VoiceListResultVoices> voices = null;

    public VoiceListResult withVoices(List<VoiceListResultVoices> voices) {
        this.voices = voices;
        return this;
    }

    public VoiceListResult addVoicesItem(VoiceListResultVoices voicesItem) {
        if (this.voices == null) {
            this.voices = new ArrayList<>();
        }
        this.voices.add(voicesItem);
        return this;
    }

    public VoiceListResult withVoices(Consumer<List<VoiceListResultVoices>> voicesSetter) {
        if (this.voices == null) {
            this.voices = new ArrayList<>();
        }
        voicesSetter.accept(this.voices);
        return this;
    }

    /**
     * 声色列表
     * @return voices
     */
    public List<VoiceListResultVoices> getVoices() {
        return voices;
    }

    public void setVoices(List<VoiceListResultVoices> voices) {
        this.voices = voices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VoiceListResult that = (VoiceListResult) obj;
        return Objects.equals(this.voices, that.voices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VoiceListResult {\n");
        sb.append("    voices: ").append(toIndentedString(voices)).append("\n");
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

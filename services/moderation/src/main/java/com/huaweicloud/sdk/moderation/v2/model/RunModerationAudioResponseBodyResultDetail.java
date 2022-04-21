package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 审核结果列表，text为语音转文本后审核结果，audio为音频审核结果。 
 */
public class RunModerationAudioResponseBodyResultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private Object text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private RunModerationAudioResponseBodyResultDetailAudio audio;

    public RunModerationAudioResponseBodyResultDetail withText(Object text) {
        this.text = text;
        return this;
    }

    /**
     * 返回的语音转文本后审核结果详细信息： ● politics：涉政敏感词列表。 ● porn：涉黄敏感词列表。 ● ad：广告敏感词列表。 ● abuse：辱骂敏感词列表。 ● contraband：违禁品敏感词列表 
     * @return text
     */
    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = text;
    }

    public RunModerationAudioResponseBodyResultDetail withAudio(RunModerationAudioResponseBodyResultDetailAudio audio) {
        this.audio = audio;
        return this;
    }

    public RunModerationAudioResponseBodyResultDetail withAudio(
        Consumer<RunModerationAudioResponseBodyResultDetailAudio> audioSetter) {
        if (this.audio == null) {
            this.audio = new RunModerationAudioResponseBodyResultDetailAudio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public RunModerationAudioResponseBodyResultDetailAudio getAudio() {
        return audio;
    }

    public void setAudio(RunModerationAudioResponseBodyResultDetailAudio audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunModerationAudioResponseBodyResultDetail runModerationAudioResponseBodyResultDetail =
            (RunModerationAudioResponseBodyResultDetail) o;
        return Objects.equals(this.text, runModerationAudioResponseBodyResultDetail.text)
            && Objects.equals(this.audio, runModerationAudioResponseBodyResultDetail.audio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, audio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModerationAudioResponseBodyResultDetail {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

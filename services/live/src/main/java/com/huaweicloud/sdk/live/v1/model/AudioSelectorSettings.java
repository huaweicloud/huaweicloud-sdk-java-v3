package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置音频选择器
 */
public class AudioSelectorSettings {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_language_selection")

    private AudioSelectorLangSelection audioLanguageSelection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_pid_selection")

    private AudioSelectorPidSelection audioPidSelection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_hls_selection")

    private AudioSelectorHlsSelection audioHlsSelection;

    public AudioSelectorSettings withAudioLanguageSelection(AudioSelectorLangSelection audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
        return this;
    }

    public AudioSelectorSettings withAudioLanguageSelection(
        Consumer<AudioSelectorLangSelection> audioLanguageSelectionSetter) {
        if (this.audioLanguageSelection == null) {
            this.audioLanguageSelection = new AudioSelectorLangSelection();
            audioLanguageSelectionSetter.accept(this.audioLanguageSelection);
        }

        return this;
    }

    /**
     * Get audioLanguageSelection
     * @return audioLanguageSelection
     */
    public AudioSelectorLangSelection getAudioLanguageSelection() {
        return audioLanguageSelection;
    }

    public void setAudioLanguageSelection(AudioSelectorLangSelection audioLanguageSelection) {
        this.audioLanguageSelection = audioLanguageSelection;
    }

    public AudioSelectorSettings withAudioPidSelection(AudioSelectorPidSelection audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
        return this;
    }

    public AudioSelectorSettings withAudioPidSelection(Consumer<AudioSelectorPidSelection> audioPidSelectionSetter) {
        if (this.audioPidSelection == null) {
            this.audioPidSelection = new AudioSelectorPidSelection();
            audioPidSelectionSetter.accept(this.audioPidSelection);
        }

        return this;
    }

    /**
     * Get audioPidSelection
     * @return audioPidSelection
     */
    public AudioSelectorPidSelection getAudioPidSelection() {
        return audioPidSelection;
    }

    public void setAudioPidSelection(AudioSelectorPidSelection audioPidSelection) {
        this.audioPidSelection = audioPidSelection;
    }

    public AudioSelectorSettings withAudioHlsSelection(AudioSelectorHlsSelection audioHlsSelection) {
        this.audioHlsSelection = audioHlsSelection;
        return this;
    }

    public AudioSelectorSettings withAudioHlsSelection(Consumer<AudioSelectorHlsSelection> audioHlsSelectionSetter) {
        if (this.audioHlsSelection == null) {
            this.audioHlsSelection = new AudioSelectorHlsSelection();
            audioHlsSelectionSetter.accept(this.audioHlsSelection);
        }

        return this;
    }

    /**
     * Get audioHlsSelection
     * @return audioHlsSelection
     */
    public AudioSelectorHlsSelection getAudioHlsSelection() {
        return audioHlsSelection;
    }

    public void setAudioHlsSelection(AudioSelectorHlsSelection audioHlsSelection) {
        this.audioHlsSelection = audioHlsSelection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSelectorSettings that = (AudioSelectorSettings) obj;
        return Objects.equals(this.audioLanguageSelection, that.audioLanguageSelection)
            && Objects.equals(this.audioPidSelection, that.audioPidSelection)
            && Objects.equals(this.audioHlsSelection, that.audioHlsSelection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioLanguageSelection, audioPidSelection, audioHlsSelection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioSelectorSettings {\n");
        sb.append("    audioLanguageSelection: ").append(toIndentedString(audioLanguageSelection)).append("\n");
        sb.append("    audioPidSelection: ").append(toIndentedString(audioPidSelection)).append("\n");
        sb.append("    audioHlsSelection: ").append(toIndentedString(audioHlsSelection)).append("\n");
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

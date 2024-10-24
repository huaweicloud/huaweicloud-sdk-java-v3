package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubtitleFiles
 */
public class SubtitleFiles {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_subtitle_file")

    private SubtitleFileInfo textSubtitleFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_subtitle_file")

    private SubtitleFileInfo audioSubtitleFile;

    public SubtitleFiles withTextSubtitleFile(SubtitleFileInfo textSubtitleFile) {
        this.textSubtitleFile = textSubtitleFile;
        return this;
    }

    public SubtitleFiles withTextSubtitleFile(Consumer<SubtitleFileInfo> textSubtitleFileSetter) {
        if (this.textSubtitleFile == null) {
            this.textSubtitleFile = new SubtitleFileInfo();
            textSubtitleFileSetter.accept(this.textSubtitleFile);
        }

        return this;
    }

    /**
     * Get textSubtitleFile
     * @return textSubtitleFile
     */
    public SubtitleFileInfo getTextSubtitleFile() {
        return textSubtitleFile;
    }

    public void setTextSubtitleFile(SubtitleFileInfo textSubtitleFile) {
        this.textSubtitleFile = textSubtitleFile;
    }

    public SubtitleFiles withAudioSubtitleFile(SubtitleFileInfo audioSubtitleFile) {
        this.audioSubtitleFile = audioSubtitleFile;
        return this;
    }

    public SubtitleFiles withAudioSubtitleFile(Consumer<SubtitleFileInfo> audioSubtitleFileSetter) {
        if (this.audioSubtitleFile == null) {
            this.audioSubtitleFile = new SubtitleFileInfo();
            audioSubtitleFileSetter.accept(this.audioSubtitleFile);
        }

        return this;
    }

    /**
     * Get audioSubtitleFile
     * @return audioSubtitleFile
     */
    public SubtitleFileInfo getAudioSubtitleFile() {
        return audioSubtitleFile;
    }

    public void setAudioSubtitleFile(SubtitleFileInfo audioSubtitleFile) {
        this.audioSubtitleFile = audioSubtitleFile;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubtitleFiles that = (SubtitleFiles) obj;
        return Objects.equals(this.textSubtitleFile, that.textSubtitleFile)
            && Objects.equals(this.audioSubtitleFile, that.audioSubtitleFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textSubtitleFile, audioSubtitleFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubtitleFiles {\n");
        sb.append("    textSubtitleFile: ").append(toIndentedString(textSubtitleFile)).append("\n");
        sb.append("    audioSubtitleFile: ").append(toIndentedString(audioSubtitleFile)).append("\n");
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

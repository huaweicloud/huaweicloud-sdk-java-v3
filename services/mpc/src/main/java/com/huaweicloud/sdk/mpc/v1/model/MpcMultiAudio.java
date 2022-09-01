package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MpcMultiAudio
 */
public class MpcMultiAudio {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_files")

    @JacksonXmlProperty(localName = "audio_files")

    private List<AudioFile> audioFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_filename")

    @JacksonXmlProperty(localName = "output_filename")

    private String outputFilename;

    public MpcMultiAudio withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public MpcMultiAudio withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public MpcMultiAudio withAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
        return this;
    }

    public MpcMultiAudio addAudioFilesItem(AudioFile audioFilesItem) {
        if (this.audioFiles == null) {
            this.audioFiles = new ArrayList<>();
        }
        this.audioFiles.add(audioFilesItem);
        return this;
    }

    public MpcMultiAudio withAudioFiles(Consumer<List<AudioFile>> audioFilesSetter) {
        if (this.audioFiles == null) {
            this.audioFiles = new ArrayList<>();
        }
        audioFilesSetter.accept(this.audioFiles);
        return this;
    }

    /**
     * 音频文件列表
     * @return audioFiles
     */
    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public MpcMultiAudio withOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
        return this;
    }

    /**
     * 输出文件名。 
     * @return outputFilename
     */
    public String getOutputFilename() {
        return outputFilename;
    }

    public void setOutputFilename(String outputFilename) {
        this.outputFilename = outputFilename;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MpcMultiAudio mpcMultiAudio = (MpcMultiAudio) o;
        return Objects.equals(this.output, mpcMultiAudio.output)
            && Objects.equals(this.audioFiles, mpcMultiAudio.audioFiles)
            && Objects.equals(this.outputFilename, mpcMultiAudio.outputFilename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output, audioFiles, outputFilename);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MpcMultiAudio {\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    audioFiles: ").append(toIndentedString(audioFiles)).append("\n");
        sb.append("    outputFilename: ").append(toIndentedString(outputFilename)).append("\n");
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

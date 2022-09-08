package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OutputVideoPara
 */
public class OutputVideoPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack")

    private String pack;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private VideoInfo video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private AudioInfo audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conver_duration")

    private Double converDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private XCodeError error;

    public OutputVideoPara withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 输出视频对应的模板ID 
     * minimum: 0
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public OutputVideoPara withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 视频大小 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public OutputVideoPara withPack(String pack) {
        this.pack = pack;
        return this;
    }

    /**
     * 视频封装格式 
     * @return pack
     */
    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }

    public OutputVideoPara withVideo(VideoInfo video) {
        this.video = video;
        return this;
    }

    public OutputVideoPara withVideo(Consumer<VideoInfo> videoSetter) {
        if (this.video == null) {
            this.video = new VideoInfo();
            videoSetter.accept(this.video);
        }

        return this;
    }

    /**
     * Get video
     * @return video
     */
    public VideoInfo getVideo() {
        return video;
    }

    public void setVideo(VideoInfo video) {
        this.video = video;
    }

    public OutputVideoPara withAudio(AudioInfo audio) {
        this.audio = audio;
        return this;
    }

    public OutputVideoPara withAudio(Consumer<AudioInfo> audioSetter) {
        if (this.audio == null) {
            this.audio = new AudioInfo();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public AudioInfo getAudio() {
        return audio;
    }

    public void setAudio(AudioInfo audio) {
        this.audio = audio;
    }

    public OutputVideoPara withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 输出片源文件名 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public OutputVideoPara withConverDuration(Double converDuration) {
        this.converDuration = converDuration;
        return this;
    }

    /**
     * 折算后视频时长 
     * minimum: 0
     * maximum: 2147483647
     * @return converDuration
     */
    public Double getConverDuration() {
        return converDuration;
    }

    public void setConverDuration(Double converDuration) {
        this.converDuration = converDuration;
    }

    public OutputVideoPara withError(XCodeError error) {
        this.error = error;
        return this;
    }

    public OutputVideoPara withError(Consumer<XCodeError> errorSetter) {
        if (this.error == null) {
            this.error = new XCodeError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public XCodeError getError() {
        return error;
    }

    public void setError(XCodeError error) {
        this.error = error;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutputVideoPara outputVideoPara = (OutputVideoPara) o;
        return Objects.equals(this.templateId, outputVideoPara.templateId)
            && Objects.equals(this.size, outputVideoPara.size) && Objects.equals(this.pack, outputVideoPara.pack)
            && Objects.equals(this.video, outputVideoPara.video) && Objects.equals(this.audio, outputVideoPara.audio)
            && Objects.equals(this.fileName, outputVideoPara.fileName)
            && Objects.equals(this.converDuration, outputVideoPara.converDuration)
            && Objects.equals(this.error, outputVideoPara.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, size, pack, video, audio, fileName, converDuration, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputVideoPara {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    pack: ").append(toIndentedString(pack)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    converDuration: ").append(toIndentedString(converDuration)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

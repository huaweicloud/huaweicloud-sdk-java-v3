package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReadConfig
 */
public class ReadConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_read_configs")

    private List<ImageReadConfig> imageReadConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_type")

    private Integer readType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_content")

    private String readContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "character_position")

    private Integer characterPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_content_paragraph_interval")

    private Integer readContentParagraphInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_frame_id")

    private String imageFrameId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_url")

    private String audioUrl;

    public ReadConfig withImageReadConfigs(List<ImageReadConfig> imageReadConfigs) {
        this.imageReadConfigs = imageReadConfigs;
        return this;
    }

    public ReadConfig addImageReadConfigsItem(ImageReadConfig imageReadConfigsItem) {
        if (this.imageReadConfigs == null) {
            this.imageReadConfigs = new ArrayList<>();
        }
        this.imageReadConfigs.add(imageReadConfigsItem);
        return this;
    }

    public ReadConfig withImageReadConfigs(Consumer<List<ImageReadConfig>> imageReadConfigsSetter) {
        if (this.imageReadConfigs == null) {
            this.imageReadConfigs = new ArrayList<>();
        }
        imageReadConfigsSetter.accept(this.imageReadConfigs);
        return this;
    }

    /**
     * 插图播报配置
     * @return imageReadConfigs
     */
    public List<ImageReadConfig> getImageReadConfigs() {
        return imageReadConfigs;
    }

    public void setImageReadConfigs(List<ImageReadConfig> imageReadConfigs) {
        this.imageReadConfigs = imageReadConfigs;
    }

    public ReadConfig withReadType(Integer readType) {
        this.readType = readType;
        return this;
    }

    /**
     * 播报选项： 0：纯文本播报（使用read_content 字段） 1：插图播报（使用image_read_configs字段） 3：自定义音频播报（使用audio字段） 会根据选项进行具体的字段校验
     * @return readType
     */
    public Integer getReadType() {
        return readType;
    }

    public void setReadType(Integer readType) {
        this.readType = readType;
    }

    public ReadConfig withReadContent(String readContent) {
        this.readContent = readContent;
        return this;
    }

    /**
     * 纯文本播报内容
     * @return readContent
     */
    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    public ReadConfig withCharacterPosition(Integer characterPosition) {
        this.characterPosition = characterPosition;
        return this;
    }

    /**
     * 0：左 1：中 2：右 默认：1
     * @return characterPosition
     */
    public Integer getCharacterPosition() {
        return characterPosition;
    }

    public void setCharacterPosition(Integer characterPosition) {
        this.characterPosition = characterPosition;
    }

    public ReadConfig withReadContentParagraphInterval(Integer readContentParagraphInterval) {
        this.readContentParagraphInterval = readContentParagraphInterval;
        return this;
    }

    /**
     * 段落播报间隔 单位：ms 范围：0~5000 默认：400
     * @return readContentParagraphInterval
     */
    public Integer getReadContentParagraphInterval() {
        return readContentParagraphInterval;
    }

    public void setReadContentParagraphInterval(Integer readContentParagraphInterval) {
        this.readContentParagraphInterval = readContentParagraphInterval;
    }

    public ReadConfig withImageFrameId(String imageFrameId) {
        this.imageFrameId = imageFrameId;
        return this;
    }

    /**
     * 播报框id
     * @return imageFrameId
     */
    public String getImageFrameId() {
        return imageFrameId;
    }

    public void setImageFrameId(String imageFrameId) {
        this.imageFrameId = imageFrameId;
    }

    public ReadConfig withAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }

    /**
     * 用户的音频文件obs地址，为https格式（如：https://cbs-digital-human-cn-north-4.obs.myhuaweicloud.com:443/audio.wav），当字段不为空时，表示将使用用户自己的音频文件。  不支持PPT和图片播报，不支持字幕。音频格式文件格式为wav 音频最长支持20分钟，支持100m大小 注意：该功能的使用需要用户启动OBS授权
     * @return audioUrl
     */
    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReadConfig that = (ReadConfig) obj;
        return Objects.equals(this.imageReadConfigs, that.imageReadConfigs)
            && Objects.equals(this.readType, that.readType) && Objects.equals(this.readContent, that.readContent)
            && Objects.equals(this.characterPosition, that.characterPosition)
            && Objects.equals(this.readContentParagraphInterval, that.readContentParagraphInterval)
            && Objects.equals(this.imageFrameId, that.imageFrameId) && Objects.equals(this.audioUrl, that.audioUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageReadConfigs,
            readType,
            readContent,
            characterPosition,
            readContentParagraphInterval,
            imageFrameId,
            audioUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadConfig {\n");
        sb.append("    imageReadConfigs: ").append(toIndentedString(imageReadConfigs)).append("\n");
        sb.append("    readType: ").append(toIndentedString(readType)).append("\n");
        sb.append("    readContent: ").append(toIndentedString(readContent)).append("\n");
        sb.append("    characterPosition: ").append(toIndentedString(characterPosition)).append("\n");
        sb.append("    readContentParagraphInterval: ")
            .append(toIndentedString(readContentParagraphInterval))
            .append("\n");
        sb.append("    imageFrameId: ").append(toIndentedString(imageFrameId)).append("\n");
        sb.append("    audioUrl: ").append(toIndentedString(audioUrl)).append("\n");
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

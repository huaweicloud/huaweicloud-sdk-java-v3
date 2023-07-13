package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class ReadConfigResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_read_configs")

    private List<ImageReadConfigResp> imageReadConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppt_read_configs")

    private List<PPTReadConfigResp> pptReadConfigs = null;

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
    @JsonProperty(value = "read_content_paragragh_times")

    private List<Integer> readContentParagraghTimes = null;

    public ReadConfigResp withImageReadConfigs(List<ImageReadConfigResp> imageReadConfigs) {
        this.imageReadConfigs = imageReadConfigs;
        return this;
    }

    public ReadConfigResp addImageReadConfigsItem(ImageReadConfigResp imageReadConfigsItem) {
        if (this.imageReadConfigs == null) {
            this.imageReadConfigs = new ArrayList<>();
        }
        this.imageReadConfigs.add(imageReadConfigsItem);
        return this;
    }

    public ReadConfigResp withImageReadConfigs(Consumer<List<ImageReadConfigResp>> imageReadConfigsSetter) {
        if (this.imageReadConfigs == null) {
            this.imageReadConfigs = new ArrayList<>();
        }
        imageReadConfigsSetter.accept(this.imageReadConfigs);
        return this;
    }

    /**
     * 图片播报配置
     * @return imageReadConfigs
     */
    public List<ImageReadConfigResp> getImageReadConfigs() {
        return imageReadConfigs;
    }

    public void setImageReadConfigs(List<ImageReadConfigResp> imageReadConfigs) {
        this.imageReadConfigs = imageReadConfigs;
    }

    public ReadConfigResp withPptReadConfigs(List<PPTReadConfigResp> pptReadConfigs) {
        this.pptReadConfigs = pptReadConfigs;
        return this;
    }

    public ReadConfigResp addPptReadConfigsItem(PPTReadConfigResp pptReadConfigsItem) {
        if (this.pptReadConfigs == null) {
            this.pptReadConfigs = new ArrayList<>();
        }
        this.pptReadConfigs.add(pptReadConfigsItem);
        return this;
    }

    public ReadConfigResp withPptReadConfigs(Consumer<List<PPTReadConfigResp>> pptReadConfigsSetter) {
        if (this.pptReadConfigs == null) {
            this.pptReadConfigs = new ArrayList<>();
        }
        pptReadConfigsSetter.accept(this.pptReadConfigs);
        return this;
    }

    /**
     * ppt播报配置
     * @return pptReadConfigs
     */
    public List<PPTReadConfigResp> getPptReadConfigs() {
        return pptReadConfigs;
    }

    public void setPptReadConfigs(List<PPTReadConfigResp> pptReadConfigs) {
        this.pptReadConfigs = pptReadConfigs;
    }

    public ReadConfigResp withReadType(Integer readType) {
        this.readType = readType;
        return this;
    }

    /**
     * 播报选项： 0：纯文本播报 1：图片播报 2：ppt播报 默认：0 配置哪项会校验哪项是否为空 
     * @return readType
     */
    public Integer getReadType() {
        return readType;
    }

    public void setReadType(Integer readType) {
        this.readType = readType;
    }

    public ReadConfigResp withReadContent(String readContent) {
        this.readContent = readContent;
        return this;
    }

    /**
     * 纯文本播报内容。 换行符会按400ms的静音进行分割
     * @return readContent
     */
    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
    }

    public ReadConfigResp withCharacterPosition(Integer characterPosition) {
        this.characterPosition = characterPosition;
        return this;
    }

    /**
     * 0：左 1：中 2：右
     * @return characterPosition
     */
    public Integer getCharacterPosition() {
        return characterPosition;
    }

    public void setCharacterPosition(Integer characterPosition) {
        this.characterPosition = characterPosition;
    }

    public ReadConfigResp withReadContentParagraghTimes(List<Integer> readContentParagraghTimes) {
        this.readContentParagraghTimes = readContentParagraghTimes;
        return this;
    }

    public ReadConfigResp addReadContentParagraghTimesItem(Integer readContentParagraghTimesItem) {
        if (this.readContentParagraghTimes == null) {
            this.readContentParagraghTimes = new ArrayList<>();
        }
        this.readContentParagraghTimes.add(readContentParagraghTimesItem);
        return this;
    }

    public ReadConfigResp withReadContentParagraghTimes(Consumer<List<Integer>> readContentParagraghTimesSetter) {
        if (this.readContentParagraghTimes == null) {
            this.readContentParagraghTimes = new ArrayList<>();
        }
        readContentParagraghTimesSetter.accept(this.readContentParagraghTimes);
        return this;
    }

    /**
     * read_content 每段播报时间
     * @return readContentParagraghTimes
     */
    public List<Integer> getReadContentParagraghTimes() {
        return readContentParagraghTimes;
    }

    public void setReadContentParagraghTimes(List<Integer> readContentParagraghTimes) {
        this.readContentParagraghTimes = readContentParagraghTimes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReadConfigResp that = (ReadConfigResp) obj;
        return Objects.equals(this.imageReadConfigs, that.imageReadConfigs)
            && Objects.equals(this.pptReadConfigs, that.pptReadConfigs) && Objects.equals(this.readType, that.readType)
            && Objects.equals(this.readContent, that.readContent)
            && Objects.equals(this.characterPosition, that.characterPosition)
            && Objects.equals(this.readContentParagraghTimes, that.readContentParagraghTimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageReadConfigs,
            pptReadConfigs,
            readType,
            readContent,
            characterPosition,
            readContentParagraghTimes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadConfigResp {\n");
        sb.append("    imageReadConfigs: ").append(toIndentedString(imageReadConfigs)).append("\n");
        sb.append("    pptReadConfigs: ").append(toIndentedString(pptReadConfigs)).append("\n");
        sb.append("    readType: ").append(toIndentedString(readType)).append("\n");
        sb.append("    readContent: ").append(toIndentedString(readContent)).append("\n");
        sb.append("    characterPosition: ").append(toIndentedString(characterPosition)).append("\n");
        sb.append("    readContentParagraghTimes: ").append(toIndentedString(readContentParagraghTimes)).append("\n");
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

package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OutputThumbnailPara
 */
public class OutputThumbnailPara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_pictures")

    private Integer totalPictures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    public OutputThumbnailPara withTotalPictures(Integer totalPictures) {
        this.totalPictures = totalPictures;
        return this;
    }

    /**
     * 抽帧图片张数 
     * minimum: 0
     * maximum: 2147483647
     * @return totalPictures
     */
    public Integer getTotalPictures() {
        return totalPictures;
    }

    public void setTotalPictures(Integer totalPictures) {
        this.totalPictures = totalPictures;
    }

    public OutputThumbnailPara withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 抽帧图片宽度 
     * minimum: 0
     * maximum: 2147483647
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public OutputThumbnailPara withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 抽帧图片高度 
     * minimum: 0
     * maximum: 2147483647
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public OutputThumbnailPara withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 抽帧文件名 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public OutputThumbnailPara withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public OutputThumbnailPara withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutputThumbnailPara that = (OutputThumbnailPara) obj;
        return Objects.equals(this.totalPictures, that.totalPictures) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalPictures, width, height, fileName, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutputThumbnailPara {\n");
        sb.append("    totalPictures: ").append(toIndentedString(totalPictures)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageSpriteInfo
 */
public class ImageSpriteInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_count")

    private Integer rowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_count")

    private Integer columnCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_image_name")

    private List<String> outputImageName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_webvtt_name")

    private String outputWebvttName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    public ImageSpriteInfo withRowCount(Integer rowCount) {
        this.rowCount = rowCount;
        return this;
    }

    /**
     * 雪碧图中小图的行数。
     * minimum: 0
     * maximum: 100
     * @return rowCount
     */
    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    public ImageSpriteInfo withColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
        return this;
    }

    /**
     * 雪碧图中小图的列数。
     * minimum: 0
     * maximum: 100
     * @return columnCount
     */
    public Integer getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(Integer columnCount) {
        this.columnCount = columnCount;
    }

    public ImageSpriteInfo withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 雪碧图中小图数量。
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ImageSpriteInfo withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 雪碧图小图宽度 
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

    public ImageSpriteInfo withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 雪碧图小图高度 
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

    public ImageSpriteInfo withOutputImageName(List<String> outputImageName) {
        this.outputImageName = outputImageName;
        return this;
    }

    public ImageSpriteInfo addOutputImageNameItem(String outputImageNameItem) {
        if (this.outputImageName == null) {
            this.outputImageName = new ArrayList<>();
        }
        this.outputImageName.add(outputImageNameItem);
        return this;
    }

    public ImageSpriteInfo withOutputImageName(Consumer<List<String>> outputImageNameSetter) {
        if (this.outputImageName == null) {
            this.outputImageName = new ArrayList<>();
        }
        outputImageNameSetter.accept(this.outputImageName);
        return this;
    }

    /**
     * 每一张雪碧图大图的路径。 
     * @return outputImageName
     */
    public List<String> getOutputImageName() {
        return outputImageName;
    }

    public void setOutputImageName(List<String> outputImageName) {
        this.outputImageName = outputImageName;
    }

    public ImageSpriteInfo withOutputWebvttName(String outputWebvttName) {
        this.outputWebvttName = outputWebvttName;
        return this;
    }

    /**
     * 雪碧图子图位置与时间关系的 WebVtt 文件路径。WebVtt 文件表明了各个雪碧图小图对应的时间点，以及在雪碧大图里的坐标位置，一般被播放器用于实现预览。 
     * @return outputWebvttName
     */
    public String getOutputWebvttName() {
        return outputWebvttName;
    }

    public void setOutputWebvttName(String outputWebvttName) {
        this.outputWebvttName = outputWebvttName;
    }

    public ImageSpriteInfo withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public ImageSpriteInfo withOutput(Consumer<ObsObjInfo> outputSetter) {
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
        ImageSpriteInfo that = (ImageSpriteInfo) obj;
        return Objects.equals(this.rowCount, that.rowCount) && Objects.equals(this.columnCount, that.columnCount)
            && Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.outputImageName, that.outputImageName)
            && Objects.equals(this.outputWebvttName, that.outputWebvttName) && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(rowCount, columnCount, totalCount, width, height, outputImageName, outputWebvttName, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSpriteInfo {\n");
        sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
        sb.append("    columnCount: ").append(toIndentedString(columnCount)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    outputImageName: ").append(toIndentedString(outputImageName)).append("\n");
        sb.append("    outputWebvttName: ").append(toIndentedString(outputWebvttName)).append("\n");
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

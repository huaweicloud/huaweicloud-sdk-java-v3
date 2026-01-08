package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ThumbnailsInfo
 */
public class ThumbnailsInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pic_info")

    private List<PicInfo> picInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    public ThumbnailsInfo withPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
        return this;
    }

    public ThumbnailsInfo addPicInfoItem(PicInfo picInfoItem) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        this.picInfo.add(picInfoItem);
        return this;
    }

    public ThumbnailsInfo withPicInfo(Consumer<List<PicInfo>> picInfoSetter) {
        if (this.picInfo == null) {
            this.picInfo = new ArrayList<>();
        }
        picInfoSetter.accept(this.picInfo);
        return this;
    }

    /**
     * 截图文件信息。 
     * @return picInfo
     */
    public List<PicInfo> getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(List<PicInfo> picInfo) {
        this.picInfo = picInfo;
    }

    public ThumbnailsInfo withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public ThumbnailsInfo withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public ThumbnailsInfo withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * 截图压缩包名。 
     * @return outputName
     */
    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ThumbnailsInfo that = (ThumbnailsInfo) obj;
        return Objects.equals(this.picInfo, that.picInfo) && Objects.equals(this.output, that.output)
            && Objects.equals(this.outputName, that.outputName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(picInfo, output, outputName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ThumbnailsInfo {\n");
        sb.append("    picInfo: ").append(toIndentedString(picInfo)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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

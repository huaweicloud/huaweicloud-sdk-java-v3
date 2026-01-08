package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageSprite
 */
public class ImageSprite {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private ImageSpritePara params;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_object_name")

    private String outputObjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webvtt_object_name")

    private String webvttObjectName;

    public ImageSprite withParams(ImageSpritePara params) {
        this.params = params;
        return this;
    }

    public ImageSprite withParams(Consumer<ImageSpritePara> paramsSetter) {
        if (this.params == null) {
            this.params = new ImageSpritePara();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public ImageSpritePara getParams() {
        return params;
    }

    public void setParams(ImageSpritePara params) {
        this.params = params;
    }

    public ImageSprite withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public ImageSprite withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public ImageSprite withOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
        return this;
    }

    /**
     * 截取雪碧图后，雪碧图图片文件的输出文件名，如果不填，则默认为：{inputName}_imageSprite_{雪碧图id}_{number}.{format}.{雪碧图id}和{number}从0开始递增 
     * @return outputObjectName
     */
    public String getOutputObjectName() {
        return outputObjectName;
    }

    public void setOutputObjectName(String outputObjectName) {
        this.outputObjectName = outputObjectName;
    }

    public ImageSprite withWebvttObjectName(String webvttObjectName) {
        this.webvttObjectName = webvttObjectName;
        return this;
    }

    /**
     * 截取雪碧图后，Web VTT 文件的输出路径，只能为相对路径。如果不填，则默认为相对路径：{inputName}_imageSprite_{雪碧图_id}.vtt 
     * @return webvttObjectName
     */
    public String getWebvttObjectName() {
        return webvttObjectName;
    }

    public void setWebvttObjectName(String webvttObjectName) {
        this.webvttObjectName = webvttObjectName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageSprite that = (ImageSprite) obj;
        return Objects.equals(this.params, that.params) && Objects.equals(this.output, that.output)
            && Objects.equals(this.outputObjectName, that.outputObjectName)
            && Objects.equals(this.webvttObjectName, that.webvttObjectName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params, output, outputObjectName, webvttObjectName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSprite {\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    outputObjectName: ").append(toIndentedString(outputObjectName)).append("\n");
        sb.append("    webvttObjectName: ").append(toIndentedString(webvttObjectName)).append("\n");
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

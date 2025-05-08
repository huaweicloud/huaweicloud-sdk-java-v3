package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectTranscodeTask
 */
public class ObjectTranscodeTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_template_id")

    private String transTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsInfo output;

    public ObjectTranscodeTask withTransTemplateId(String transTemplateId) {
        this.transTemplateId = transTemplateId;
        return this;
    }

    /**
     * 转码模板ID 
     * @return transTemplateId
     */
    public String getTransTemplateId() {
        return transTemplateId;
    }

    public void setTransTemplateId(String transTemplateId) {
        this.transTemplateId = transTemplateId;
    }

    public ObjectTranscodeTask withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * 转码输出文件名 
     * @return outputName
     */
    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public ObjectTranscodeTask withOutput(ObsInfo output) {
        this.output = output;
        return this;
    }

    public ObjectTranscodeTask withOutput(Consumer<ObsInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public ObsInfo getOutput() {
        return output;
    }

    public void setOutput(ObsInfo output) {
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
        ObjectTranscodeTask that = (ObjectTranscodeTask) obj;
        return Objects.equals(this.transTemplateId, that.transTemplateId)
            && Objects.equals(this.outputName, that.outputName) && Objects.equals(this.output, that.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transTemplateId, outputName, output);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectTranscodeTask {\n");
        sb.append("    transTemplateId: ").append(toIndentedString(transTemplateId)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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

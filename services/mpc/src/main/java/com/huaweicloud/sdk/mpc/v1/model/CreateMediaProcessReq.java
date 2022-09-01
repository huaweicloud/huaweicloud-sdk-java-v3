package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateMediaProcessReq
 */
public class CreateMediaProcessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    @JacksonXmlProperty(localName = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    public CreateMediaProcessReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateMediaProcessReq withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public CreateMediaProcessReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateMediaProcessReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateMediaProcessReq withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板ID 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMediaProcessReq createMediaProcessReq = (CreateMediaProcessReq) o;
        return Objects.equals(this.input, createMediaProcessReq.input)
            && Objects.equals(this.output, createMediaProcessReq.output)
            && Objects.equals(this.templateId, createMediaProcessReq.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMediaProcessReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

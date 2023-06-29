package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateRemuxTaskReq
 */
public class CreateRemuxTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private ObsObjInfo output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_param")

    private RemuxOutputParam outputParam;

    public CreateRemuxTaskReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateRemuxTaskReq withInput(Consumer<ObsObjInfo> inputSetter) {
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

    public CreateRemuxTaskReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateRemuxTaskReq withOutput(Consumer<ObsObjInfo> outputSetter) {
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

    public CreateRemuxTaskReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * 用户自定义数据。 
     * @return userData
     */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateRemuxTaskReq withOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
        return this;
    }

    public CreateRemuxTaskReq withOutputParam(Consumer<RemuxOutputParam> outputParamSetter) {
        if (this.outputParam == null) {
            this.outputParam = new RemuxOutputParam();
            outputParamSetter.accept(this.outputParam);
        }

        return this;
    }

    /**
     * Get outputParam
     * @return outputParam
     */
    public RemuxOutputParam getOutputParam() {
        return outputParam;
    }

    public void setOutputParam(RemuxOutputParam outputParam) {
        this.outputParam = outputParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRemuxTaskReq that = (CreateRemuxTaskReq) obj;
        return Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.userData, that.userData) && Objects.equals(this.outputParam, that.outputParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, userData, outputParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRemuxTaskReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    outputParam: ").append(toIndentedString(outputParam)).append("\n");
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

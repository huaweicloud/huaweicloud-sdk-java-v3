package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateExtractTaskReq */
public class CreateExtractTaskReq {

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
    @JsonProperty(value = "sync")

    private Integer sync;

    public CreateExtractTaskReq withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public CreateExtractTaskReq withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /** Get input
     * 
     * @return input */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public CreateExtractTaskReq withOutput(ObsObjInfo output) {
        this.output = output;
        return this;
    }

    public CreateExtractTaskReq withOutput(Consumer<ObsObjInfo> outputSetter) {
        if (this.output == null) {
            this.output = new ObsObjInfo();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /** Get output
     * 
     * @return output */
    public ObsObjInfo getOutput() {
        return output;
    }

    public void setOutput(ObsObjInfo output) {
        this.output = output;
    }

    public CreateExtractTaskReq withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** 用户自定义数据。
     * 
     * @return userData */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public CreateExtractTaskReq withSync(Integer sync) {
        this.sync = sync;
        return this;
    }

    /** 是否同步处理, - 0：排队处理 - 1：同步处理 默认值：0 minimum: 0 maximum: 2
     * 
     * @return sync */
    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateExtractTaskReq createExtractTaskReq = (CreateExtractTaskReq) o;
        return Objects.equals(this.input, createExtractTaskReq.input)
            && Objects.equals(this.output, createExtractTaskReq.output)
            && Objects.equals(this.userData, createExtractTaskReq.userData)
            && Objects.equals(this.sync, createExtractTaskReq.sync);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, output, userData, sync);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateExtractTaskReq {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    sync: ").append(toIndentedString(sync)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

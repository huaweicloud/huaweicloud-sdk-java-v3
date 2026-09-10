package com.huaweicloud.sdk.optverse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调用模型服务创建任务请求体
 */
public class CreateModelServiceTaskReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private ModelServiceTaskInputs inputs;

    public CreateModelServiceTaskReq withInputs(ModelServiceTaskInputs inputs) {
        this.inputs = inputs;
        return this;
    }

    public CreateModelServiceTaskReq withInputs(Consumer<ModelServiceTaskInputs> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ModelServiceTaskInputs();
            inputsSetter.accept(this.inputs);
        }

        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    public ModelServiceTaskInputs getInputs() {
        return inputs;
    }

    public void setInputs(ModelServiceTaskInputs inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateModelServiceTaskReq that = (CreateModelServiceTaskReq) obj;
        return Objects.equals(this.inputs, that.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModelServiceTaskReq {\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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

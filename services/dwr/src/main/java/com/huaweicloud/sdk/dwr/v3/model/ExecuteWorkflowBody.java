package com.huaweicloud.sdk.dwr.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExecuteWorkflowBody
 */
public class ExecuteWorkflowBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    private Input inputs;

    public ExecuteWorkflowBody withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 桶名
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ExecuteWorkflowBody withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 对象名
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public ExecuteWorkflowBody withInputs(Input inputs) {
        this.inputs = inputs;
        return this;
    }

    public ExecuteWorkflowBody withInputs(Consumer<Input> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new Input();
            inputsSetter.accept(this.inputs);
        }

        return this;
    }

    /**
     * Get inputs
     * @return inputs
     */
    public Input getInputs() {
        return inputs;
    }

    public void setInputs(Input inputs) {
        this.inputs = inputs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteWorkflowBody executeWorkflowBody = (ExecuteWorkflowBody) o;
        return Objects.equals(this.bucket, executeWorkflowBody.bucket)
            && Objects.equals(this._object, executeWorkflowBody._object)
            && Objects.equals(this.inputs, executeWorkflowBody.inputs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, _object, inputs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteWorkflowBody {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

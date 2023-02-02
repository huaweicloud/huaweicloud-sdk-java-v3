package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流水线运行源参数
 */
public class RunPipelineSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private RunPipelineSourceParams params;

    public RunPipelineSource withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RunPipelineSource withParams(RunPipelineSourceParams params) {
        this.params = params;
        return this;
    }

    public RunPipelineSource withParams(Consumer<RunPipelineSourceParams> paramsSetter) {
        if (this.params == null) {
            this.params = new RunPipelineSourceParams();
            paramsSetter.accept(this.params);
        }

        return this;
    }

    /**
     * Get params
     * @return params
     */
    public RunPipelineSourceParams getParams() {
        return params;
    }

    public void setParams(RunPipelineSourceParams params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunPipelineSource runPipelineSource = (RunPipelineSource) o;
        return Objects.equals(this.type, runPipelineSource.type)
            && Objects.equals(this.params, runPipelineSource.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineSource {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

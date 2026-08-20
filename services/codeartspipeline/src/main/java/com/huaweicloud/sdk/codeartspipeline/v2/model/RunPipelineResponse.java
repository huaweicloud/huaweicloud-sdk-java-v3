package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RunPipelineResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_run_id")

    private String pipelineRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public RunPipelineResponse withPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }

    /**
     * **参数解释**： 流水线运行实例ID，[启动流水线](RunPipeline.xml)接口的返回值即为流水线运行实例ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return pipelineRunId
     */
    public String getPipelineRunId() {
        return pipelineRunId;
    }

    public void setPipelineRunId(String pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
    }

    public RunPipelineResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * **参数解释**： 流水线运行失败详情。 **取值范围**： 不涉及。 
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunPipelineResponse that = (RunPipelineResponse) obj;
        return Objects.equals(this.pipelineRunId, that.pipelineRunId) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineRunId, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunPipelineResponse {\n");
        sb.append("    pipelineRunId: ").append(toIndentedString(pipelineRunId)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

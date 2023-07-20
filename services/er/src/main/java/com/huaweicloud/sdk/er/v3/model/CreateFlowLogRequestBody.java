package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建流日志请求体
 */
public class CreateFlowLogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log")

    private FlowLogRequest flowLog;

    public CreateFlowLogRequestBody withFlowLog(FlowLogRequest flowLog) {
        this.flowLog = flowLog;
        return this;
    }

    public CreateFlowLogRequestBody withFlowLog(Consumer<FlowLogRequest> flowLogSetter) {
        if (this.flowLog == null) {
            this.flowLog = new FlowLogRequest();
            flowLogSetter.accept(this.flowLog);
        }

        return this;
    }

    /**
     * Get flowLog
     * @return flowLog
     */
    public FlowLogRequest getFlowLog() {
        return flowLog;
    }

    public void setFlowLog(FlowLogRequest flowLog) {
        this.flowLog = flowLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlowLogRequestBody that = (CreateFlowLogRequestBody) obj;
        return Objects.equals(this.flowLog, that.flowLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlowLogRequestBody {\n");
        sb.append("    flowLog: ").append(toIndentedString(flowLog)).append("\n");
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

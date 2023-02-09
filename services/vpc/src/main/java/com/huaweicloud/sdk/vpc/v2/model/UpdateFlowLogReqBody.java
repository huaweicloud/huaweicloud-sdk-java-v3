package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class UpdateFlowLogReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_log")

    private UpdateFlowLogReq flowLog;

    public UpdateFlowLogReqBody withFlowLog(UpdateFlowLogReq flowLog) {
        this.flowLog = flowLog;
        return this;
    }

    public UpdateFlowLogReqBody withFlowLog(Consumer<UpdateFlowLogReq> flowLogSetter) {
        if (this.flowLog == null) {
            this.flowLog = new UpdateFlowLogReq();
            flowLogSetter.accept(this.flowLog);
        }

        return this;
    }

    /**
     * Get flowLog
     * @return flowLog
     */
    public UpdateFlowLogReq getFlowLog() {
        return flowLog;
    }

    public void setFlowLog(UpdateFlowLogReq flowLog) {
        this.flowLog = flowLog;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlowLogReqBody updateFlowLogReqBody = (UpdateFlowLogReqBody) o;
        return Objects.equals(this.flowLog, updateFlowLogReqBody.flowLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flowLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlowLogReqBody {\n");
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

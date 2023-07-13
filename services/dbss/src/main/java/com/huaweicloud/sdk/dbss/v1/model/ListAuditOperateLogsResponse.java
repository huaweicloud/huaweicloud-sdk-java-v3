package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAuditOperateLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_log")

    private List<OperateLogInfo> operateLog = null;

    public ListAuditOperateLogsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总数
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ListAuditOperateLogsResponse withOperateLog(List<OperateLogInfo> operateLog) {
        this.operateLog = operateLog;
        return this;
    }

    public ListAuditOperateLogsResponse addOperateLogItem(OperateLogInfo operateLogItem) {
        if (this.operateLog == null) {
            this.operateLog = new ArrayList<>();
        }
        this.operateLog.add(operateLogItem);
        return this;
    }

    public ListAuditOperateLogsResponse withOperateLog(Consumer<List<OperateLogInfo>> operateLogSetter) {
        if (this.operateLog == null) {
            this.operateLog = new ArrayList<>();
        }
        operateLogSetter.accept(this.operateLog);
        return this;
    }

    /**
     * 操作日志列表
     * @return operateLog
     */
    public List<OperateLogInfo> getOperateLog() {
        return operateLog;
    }

    public void setOperateLog(List<OperateLogInfo> operateLog) {
        this.operateLog = operateLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuditOperateLogsResponse that = (ListAuditOperateLogsResponse) obj;
        return Objects.equals(this.totalNum, that.totalNum) && Objects.equals(this.operateLog, that.operateLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNum, operateLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditOperateLogsResponse {\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    operateLog: ").append(toIndentedString(operateLog)).append("\n");
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

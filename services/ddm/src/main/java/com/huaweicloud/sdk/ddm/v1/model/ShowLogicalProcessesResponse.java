package com.huaweicloud.sdk.ddm.v1.model;

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
public class ShowLogicalProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_processes")

    private List<LogicalProcessInfo> logicalProcesses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ShowLogicalProcessesResponse withLogicalProcesses(List<LogicalProcessInfo> logicalProcesses) {
        this.logicalProcesses = logicalProcesses;
        return this;
    }

    public ShowLogicalProcessesResponse addLogicalProcessesItem(LogicalProcessInfo logicalProcessesItem) {
        if (this.logicalProcesses == null) {
            this.logicalProcesses = new ArrayList<>();
        }
        this.logicalProcesses.add(logicalProcessesItem);
        return this;
    }

    public ShowLogicalProcessesResponse withLogicalProcesses(
        Consumer<List<LogicalProcessInfo>> logicalProcessesSetter) {
        if (this.logicalProcesses == null) {
            this.logicalProcesses = new ArrayList<>();
        }
        logicalProcessesSetter.accept(this.logicalProcesses);
        return this;
    }

    /**
     * 逻辑会话列表
     * @return logicalProcesses
     */
    public List<LogicalProcessInfo> getLogicalProcesses() {
        return logicalProcesses;
    }

    public void setLogicalProcesses(List<LogicalProcessInfo> logicalProcesses) {
        this.logicalProcesses = logicalProcesses;
    }

    public ShowLogicalProcessesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogicalProcessesResponse that = (ShowLogicalProcessesResponse) obj;
        return Objects.equals(this.logicalProcesses, that.logicalProcesses)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalProcesses, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogicalProcessesResponse {\n");
        sb.append("    logicalProcesses: ").append(toIndentedString(logicalProcesses)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

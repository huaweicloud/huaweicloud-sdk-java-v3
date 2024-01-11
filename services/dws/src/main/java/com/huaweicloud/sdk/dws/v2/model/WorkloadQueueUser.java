package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作队列用户
 */
public class WorkloadQueueUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occupy_resource_list")

    private List<OccupyResource> occupyResourceList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_result")

    private Integer execResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_log")

    private String execLog;

    public WorkloadQueueUser withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WorkloadQueueUser withOccupyResourceList(List<OccupyResource> occupyResourceList) {
        this.occupyResourceList = occupyResourceList;
        return this;
    }

    public WorkloadQueueUser addOccupyResourceListItem(OccupyResource occupyResourceListItem) {
        if (this.occupyResourceList == null) {
            this.occupyResourceList = new ArrayList<>();
        }
        this.occupyResourceList.add(occupyResourceListItem);
        return this;
    }

    public WorkloadQueueUser withOccupyResourceList(Consumer<List<OccupyResource>> occupyResourceListSetter) {
        if (this.occupyResourceList == null) {
            this.occupyResourceList = new ArrayList<>();
        }
        occupyResourceListSetter.accept(this.occupyResourceList);
        return this;
    }

    /**
     * 执行计划阶段
     * @return occupyResourceList
     */
    public List<OccupyResource> getOccupyResourceList() {
        return occupyResourceList;
    }

    public void setOccupyResourceList(List<OccupyResource> occupyResourceList) {
        this.occupyResourceList = occupyResourceList;
    }

    public WorkloadQueueUser withExecResult(Integer execResult) {
        this.execResult = execResult;
        return this;
    }

    /**
     * 执行结果。
     * @return execResult
     */
    public Integer getExecResult() {
        return execResult;
    }

    public void setExecResult(Integer execResult) {
        this.execResult = execResult;
    }

    public WorkloadQueueUser withExecLog(String execLog) {
        this.execLog = execLog;
        return this;
    }

    /**
     * 执行日志。
     * @return execLog
     */
    public String getExecLog() {
        return execLog;
    }

    public void setExecLog(String execLog) {
        this.execLog = execLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadQueueUser that = (WorkloadQueueUser) obj;
        return Objects.equals(this.userName, that.userName)
            && Objects.equals(this.occupyResourceList, that.occupyResourceList)
            && Objects.equals(this.execResult, that.execResult) && Objects.equals(this.execLog, that.execLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, occupyResourceList, execResult, execLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadQueueUser {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    occupyResourceList: ").append(toIndentedString(occupyResourceList)).append("\n");
        sb.append("    execResult: ").append(toIndentedString(execResult)).append("\n");
        sb.append("    execLog: ").append(toIndentedString(execLog)).append("\n");
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

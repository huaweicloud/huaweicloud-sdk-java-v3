package com.huaweicloud.sdk.dgc.v1.model;

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
public class ShowJobInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobName")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planTime")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeTime")

    private Long executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<NodeInstance> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private Integer instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forceSuccess")

    private Boolean forceSuccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignoreSuccess")

    private Boolean ignoreSuccess;

    public ShowJobInstanceResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业名称
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowJobInstanceResponse withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 作业实例ID
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public ShowJobInstanceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业实例状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - running-exception：运行异常 - pause： 暂停 - manual-stop：取消
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowJobInstanceResponse withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * 作业实例计划执行时间
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public ShowJobInstanceResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 作业实例实际执行开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowJobInstanceResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 作业实例实际执行结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowJobInstanceResponse withExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行耗时，单位：毫秒
     * @return executeTime
     */
    public Long getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
    }

    public ShowJobInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总的节点数据条数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowJobInstanceResponse withNodes(List<NodeInstance> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowJobInstanceResponse addNodesItem(NodeInstance nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowJobInstanceResponse withNodes(Consumer<List<NodeInstance>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点实例状态
     * @return nodes
     */
    public List<NodeInstance> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeInstance> nodes) {
        this.nodes = nodes;
    }

    public ShowJobInstanceResponse withInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 作业调度方式： - 0：正常调度 - 2：手工调度 - 5：补数据 - 6：子作业调度 - 7：单次调度
     * @return instanceType
     */
    public Integer getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(Integer instanceType) {
        this.instanceType = instanceType;
    }

    public ShowJobInstanceResponse withForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
        return this;
    }

    /**
     * 作业实例状态筛选为强制成功，默认值：false
     * @return forceSuccess
     */
    public Boolean getForceSuccess() {
        return forceSuccess;
    }

    public void setForceSuccess(Boolean forceSuccess) {
        this.forceSuccess = forceSuccess;
    }

    public ShowJobInstanceResponse withIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
        return this;
    }

    /**
     * 作业实例状态筛选为忽略失败，默认值：false
     * @return ignoreSuccess
     */
    public Boolean getIgnoreSuccess() {
        return ignoreSuccess;
    }

    public void setIgnoreSuccess(Boolean ignoreSuccess) {
        this.ignoreSuccess = ignoreSuccess;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobInstanceResponse that = (ShowJobInstanceResponse) obj;
        return Objects.equals(this.jobName, that.jobName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.planTime, that.planTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.executeTime, that.executeTime) && Objects.equals(this.total, that.total)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.forceSuccess, that.forceSuccess)
            && Objects.equals(this.ignoreSuccess, that.ignoreSuccess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName,
            instanceId,
            status,
            planTime,
            startTime,
            endTime,
            executeTime,
            total,
            nodes,
            instanceType,
            forceSuccess,
            ignoreSuccess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobInstanceResponse {\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    forceSuccess: ").append(toIndentedString(forceSuccess)).append("\n");
        sb.append("    ignoreSuccess: ").append(toIndentedString(ignoreSuccess)).append("\n");
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

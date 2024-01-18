package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * NodeInstance
 */
public class NodeInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeName")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

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
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retryTimes")

    private Integer retryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private Long instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputRowCount")

    private Long inputRowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private BigDecimal speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logPath")

    private String logPath;

    public NodeInstance withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态： - waiting：等待运行 - running：运行中 - success：运行成功 - fail： 运行失败 - skip：跳过 - pause： 暂停 - manual-stop：取消
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodeInstance withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * DLI资源队列名称。在返回响应中，仅DLI SQL或者DLI SPARK算子会返回DLI队列名称。
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public NodeInstance withPlanTime(Long planTime) {
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

    public NodeInstance withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 节点实际执行开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public NodeInstance withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 节点实际执行结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public NodeInstance withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点类型： - HiveSQL：执行Hive SQL脚本 - SparkSQL：执行Spark SQL脚本 - DWSSQL：执行DWS SQL脚本 - DLISQL：执行DLI SQL脚本 - Shell：执行Shell SQL脚本 - CDMJob：执行CDM作业 - DISTransferTask：创建DIS转储任务 - CloudTableManager：CloudTable表管理，创建和删除表。 - OBSManager：OBS路径管理，包括创建和删除路径。 - RestClient：REST API请求 - SMN：发送短信或邮件 - MRSSpark：执行MRS服务的Spark作业 - MapReduce：执行MRS服务的MapReduce作业 - MRSFlinkJob：执行MRS服务的FlinkJob作业。 - MRSHetuEngine：执行MRS服务的HetuEngine作业。 - DLISpark：执行DLF服务的Spark作业 - RDSSQL：传递SQL语句到RDS中执行。 - ModelArts Train：执行ModelArts服务的workflow作业。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NodeInstance withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    /**
     * 失败重试次数
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public NodeInstance withInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 作业实例id
     * @return instanceId
     */
    public Long getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
    }

    public NodeInstance withInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    /**
     * 写入数据行数
     * @return inputRowCount
     */
    public Long getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Long inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public NodeInstance withSpeed(BigDecimal speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 写入速度(行/秒)
     * @return speed
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public NodeInstance withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 节点执行的日志路径
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeInstance that = (NodeInstance) obj;
        return Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.queue, that.queue) && Objects.equals(this.planTime, that.planTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.type, that.type) && Objects.equals(this.retryTimes, that.retryTimes)
            && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.inputRowCount, that.inputRowCount) && Objects.equals(this.speed, that.speed)
            && Objects.equals(this.logPath, that.logPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeName,
            status,
            queue,
            planTime,
            startTime,
            endTime,
            type,
            retryTimes,
            instanceId,
            inputRowCount,
            speed,
            logPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeInstance {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    inputRowCount: ").append(toIndentedString(inputRowCount)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
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

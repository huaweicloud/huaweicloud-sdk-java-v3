package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchInspectionReport
 */
public class BatchInspectionReport {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private Integer mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_size")

    private Integer diskSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_rank")

    private String healthRank;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lost_points_detail_list")

    private List<BatchInspectionLostPointsDetail> lostPointsDetailList = null;

    public BatchInspectionReport withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 报告ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public BatchInspectionReport withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public BatchInspectionReport withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public BatchInspectionReport withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * CPU大小
     * minimum: 0
     * maximum: 2147483647
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public BatchInspectionReport withMem(Integer mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小（单位:GB）
     * minimum: 0
     * maximum: 2147483647
     * @return mem
     */
    public Integer getMem() {
        return mem;
    }

    public void setMem(Integer mem) {
        this.mem = mem;
    }

    public BatchInspectionReport withDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
        return this;
    }

    /**
     * 磁盘大小（单位:GB）
     * minimum: 0
     * maximum: 2147483647
     * @return diskSize
     */
    public Integer getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(Integer diskSize) {
        this.diskSize = diskSize;
    }

    public BatchInspectionReport withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 诊断报告生成时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public BatchInspectionReport withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 诊断起始时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public BatchInspectionReport withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 诊断终止时间（Unix timestamp），单位：毫秒。
     * minimum: 0
     * maximum: 253370736001000
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public BatchInspectionReport withHealthRank(String healthRank) {
        this.healthRank = healthRank;
        return this;
    }

    /**
     * 健康等级
     * @return healthRank
     */
    public String getHealthRank() {
        return healthRank;
    }

    public void setHealthRank(String healthRank) {
        this.healthRank = healthRank;
    }

    public BatchInspectionReport withScore(Double score) {
        this.score = score;
        return this;
    }

    /**
     * 评分
     * minimum: 0
     * maximum: 1E+2
     * @return score
     */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public BatchInspectionReport withLostPointsDetailList(List<BatchInspectionLostPointsDetail> lostPointsDetailList) {
        this.lostPointsDetailList = lostPointsDetailList;
        return this;
    }

    public BatchInspectionReport addLostPointsDetailListItem(BatchInspectionLostPointsDetail lostPointsDetailListItem) {
        if (this.lostPointsDetailList == null) {
            this.lostPointsDetailList = new ArrayList<>();
        }
        this.lostPointsDetailList.add(lostPointsDetailListItem);
        return this;
    }

    public BatchInspectionReport withLostPointsDetailList(
        Consumer<List<BatchInspectionLostPointsDetail>> lostPointsDetailListSetter) {
        if (this.lostPointsDetailList == null) {
            this.lostPointsDetailList = new ArrayList<>();
        }
        lostPointsDetailListSetter.accept(this.lostPointsDetailList);
        return this;
    }

    /**
     * 扣分详情
     * @return lostPointsDetailList
     */
    public List<BatchInspectionLostPointsDetail> getLostPointsDetailList() {
        return lostPointsDetailList;
    }

    public void setLostPointsDetailList(List<BatchInspectionLostPointsDetail> lostPointsDetailList) {
        this.lostPointsDetailList = lostPointsDetailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchInspectionReport that = (BatchInspectionReport) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.mem, that.mem) && Objects.equals(this.diskSize, that.diskSize)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.healthRank, that.healthRank)
            && Objects.equals(this.score, that.score)
            && Objects.equals(this.lostPointsDetailList, that.lostPointsDetailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            instanceId,
            instanceName,
            cpu,
            mem,
            diskSize,
            createAt,
            startAt,
            endAt,
            healthRank,
            score,
            lostPointsDetailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchInspectionReport {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    diskSize: ").append(toIndentedString(diskSize)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    healthRank: ").append(toIndentedString(healthRank)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    lostPointsDetailList: ").append(toIndentedString(lostPointsDetailList)).append("\n");
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

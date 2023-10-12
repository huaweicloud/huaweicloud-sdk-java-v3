package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListAiOpsRequestBodyAiopsList
 */
public class ListAiOpsRequestBodyAiopsList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private ListAiOpsRequestBodySummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_status")

    private String smnStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_fail_reason")

    private String smnFailReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_risks")

    private List<AIOpsRiskInfo> taskRisks = null;

    public ListAiOpsRequestBodyAiopsList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 检测任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAiOpsRequestBodyAiopsList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 检测任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAiOpsRequestBodyAiopsList withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 检测任务描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ListAiOpsRequestBodyAiopsList withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。 - 150：未开启。 - 200：已开启。 - 300：已发送。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListAiOpsRequestBodyAiopsList withSummary(ListAiOpsRequestBodySummary summary) {
        this.summary = summary;
        return this;
    }

    public ListAiOpsRequestBodyAiopsList withSummary(Consumer<ListAiOpsRequestBodySummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new ListAiOpsRequestBodySummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public ListAiOpsRequestBodySummary getSummary() {
        return summary;
    }

    public void setSummary(ListAiOpsRequestBodySummary summary) {
        this.summary = summary;
    }

    public ListAiOpsRequestBodyAiopsList withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 检测任务创建时间戳。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ListAiOpsRequestBodyAiopsList withSmnStatus(String smnStatus) {
        this.smnStatus = smnStatus;
        return this;
    }

    /**
     * 检测任务SMN告警任务发送状态。 - not_open：未开启。 - not_trigger：未触发。 - sent：已发送。 - send_fail： 发送失败。
     * @return smnStatus
     */
    public String getSmnStatus() {
        return smnStatus;
    }

    public void setSmnStatus(String smnStatus) {
        this.smnStatus = smnStatus;
    }

    public ListAiOpsRequestBodyAiopsList withSmnFailReason(String smnFailReason) {
        this.smnFailReason = smnFailReason;
        return this;
    }

    /**
     * 发送失败原因。
     * @return smnFailReason
     */
    public String getSmnFailReason() {
        return smnFailReason;
    }

    public void setSmnFailReason(String smnFailReason) {
        this.smnFailReason = smnFailReason;
    }

    public ListAiOpsRequestBodyAiopsList withTaskRisks(List<AIOpsRiskInfo> taskRisks) {
        this.taskRisks = taskRisks;
        return this;
    }

    public ListAiOpsRequestBodyAiopsList addTaskRisksItem(AIOpsRiskInfo taskRisksItem) {
        if (this.taskRisks == null) {
            this.taskRisks = new ArrayList<>();
        }
        this.taskRisks.add(taskRisksItem);
        return this;
    }

    public ListAiOpsRequestBodyAiopsList withTaskRisks(Consumer<List<AIOpsRiskInfo>> taskRisksSetter) {
        if (this.taskRisks == null) {
            this.taskRisks = new ArrayList<>();
        }
        taskRisksSetter.accept(this.taskRisks);
        return this;
    }

    /**
     * 风险项详情。
     * @return taskRisks
     */
    public List<AIOpsRiskInfo> getTaskRisks() {
        return taskRisks;
    }

    public void setTaskRisks(List<AIOpsRiskInfo> taskRisks) {
        this.taskRisks = taskRisks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiOpsRequestBodyAiopsList that = (ListAiOpsRequestBodyAiopsList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.status, that.status)
            && Objects.equals(this.summary, that.summary) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.smnStatus, that.smnStatus) && Objects.equals(this.smnFailReason, that.smnFailReason)
            && Objects.equals(this.taskRisks, that.taskRisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, status, summary, createTime, smnStatus, smnFailReason, taskRisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiOpsRequestBodyAiopsList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    smnStatus: ").append(toIndentedString(smnStatus)).append("\n");
        sb.append("    smnFailReason: ").append(toIndentedString(smnFailReason)).append("\n");
        sb.append("    taskRisks: ").append(toIndentedString(taskRisks)).append("\n");
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

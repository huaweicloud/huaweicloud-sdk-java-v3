package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AiOps
 */
public class AiOps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type")

    private String checkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

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
    @JsonProperty(value = "create_time")

    private LocalDate createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private SummaryInfo summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_risks")

    private List<AiOpsRiskObject> taskRisks = null;

    public AiOps withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测任务ID。 **取值范围**： 不涉及
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AiOps withCheckType(String checkType) {
        this.checkType = checkType;
        return this;
    }

    /**
     * **参数解释**： 检测范围 **取值范围**： - full_detection：全量检测 - unavailability_detection：集群不可用检测 - partial_detection：部分检测
     * @return checkType
     */
    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public AiOps withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * **参数解释**： 触发类型 **取值范围**： - manual：手动 - auto：自动
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public AiOps withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测任务名称。 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AiOps withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测任务描述。 **取值范围**： 不涉及
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public AiOps withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 任务执行状态。 **取值范围**： - 150：未开启。 - 200：已开启。 - 300：已发送。
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AiOps withCreateTime(LocalDate createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 集群风险检测任务创建时间。 **取值范围**： 格式：Unix时间戳格式。
     * @return createTime
     */
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public AiOps withSummary(SummaryInfo summary) {
        this.summary = summary;
        return this;
    }

    public AiOps withSummary(Consumer<SummaryInfo> summarySetter) {
        if (this.summary == null) {
            this.summary = new SummaryInfo();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public SummaryInfo getSummary() {
        return summary;
    }

    public void setSummary(SummaryInfo summary) {
        this.summary = summary;
    }

    public AiOps withTaskRisks(List<AiOpsRiskObject> taskRisks) {
        this.taskRisks = taskRisks;
        return this;
    }

    public AiOps addTaskRisksItem(AiOpsRiskObject taskRisksItem) {
        if (this.taskRisks == null) {
            this.taskRisks = new ArrayList<>();
        }
        this.taskRisks.add(taskRisksItem);
        return this;
    }

    public AiOps withTaskRisks(Consumer<List<AiOpsRiskObject>> taskRisksSetter) {
        if (this.taskRisks == null) {
            this.taskRisks = new ArrayList<>();
        }
        taskRisksSetter.accept(this.taskRisks);
        return this;
    }

    /**
     * **参数解释**： 集群风险项详情。 **取值范围**： 不涉及
     * @return taskRisks
     */
    public List<AiOpsRiskObject> getTaskRisks() {
        return taskRisks;
    }

    public void setTaskRisks(List<AiOpsRiskObject> taskRisks) {
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
        AiOps that = (AiOps) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.checkType, that.checkType)
            && Objects.equals(this.triggerType, that.triggerType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.taskRisks, that.taskRisks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, checkType, triggerType, name, desc, status, createTime, summary, taskRisks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiOps {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    checkType: ").append(toIndentedString(checkType)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

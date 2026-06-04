package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业流程阶段信息列表的主阶段元信息，包含子阶段。
 */
public class StageInfoWithSub {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_message")

    private String enMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zh_message")

    private String zhMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_order")

    private Integer stageOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_stages")

    private List<SubStage> subStages = null;

    public StageInfoWithSub withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：作业ID。 **取值范围**：不涉及。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StageInfoWithSub withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：主阶段名称。  **取值范围**： - scheduling：作业调度 - preparing：环境准备 - running：作业运行 - end：作业结束
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StageInfoWithSub withEnMessage(String enMessage) {
        this.enMessage = enMessage;
        return this;
    }

    /**
     * **参数解释**：主阶段英文描述信息。  **取值范围**：不涉及。
     * @return enMessage
     */
    public String getEnMessage() {
        return enMessage;
    }

    public void setEnMessage(String enMessage) {
        this.enMessage = enMessage;
    }

    public StageInfoWithSub withZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
        return this;
    }

    /**
     * **参数解释**：主阶段中文描述信息。  **取值范围**：不涉及。
     * @return zhMessage
     */
    public String getZhMessage() {
        return zhMessage;
    }

    public void setZhMessage(String zhMessage) {
        this.zhMessage = zhMessage;
    }

    public StageInfoWithSub withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：主阶段开始时间。  **取值范围**：不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public StageInfoWithSub withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：主阶段结束时间。  **取值范围**：不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public StageInfoWithSub withStageOrder(Integer stageOrder) {
        this.stageOrder = stageOrder;
        return this;
    }

    /**
     * **参数解释**：主阶段序号。 **取值范围**：[1,4]。
     * @return stageOrder
     */
    public Integer getStageOrder() {
        return stageOrder;
    }

    public void setStageOrder(Integer stageOrder) {
        this.stageOrder = stageOrder;
    }

    public StageInfoWithSub withSubStages(List<SubStage> subStages) {
        this.subStages = subStages;
        return this;
    }

    public StageInfoWithSub addSubStagesItem(SubStage subStagesItem) {
        if (this.subStages == null) {
            this.subStages = new ArrayList<>();
        }
        this.subStages.add(subStagesItem);
        return this;
    }

    public StageInfoWithSub withSubStages(Consumer<List<SubStage>> subStagesSetter) {
        if (this.subStages == null) {
            this.subStages = new ArrayList<>();
        }
        subStagesSetter.accept(this.subStages);
        return this;
    }

    /**
     * **参数解释**：子阶段信息列表。
     * @return subStages
     */
    public List<SubStage> getSubStages() {
        return subStages;
    }

    public void setSubStages(List<SubStage> subStages) {
        this.subStages = subStages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StageInfoWithSub that = (StageInfoWithSub) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.enMessage, that.enMessage) && Objects.equals(this.zhMessage, that.zhMessage)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.stageOrder, that.stageOrder) && Objects.equals(this.subStages, that.subStages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, name, enMessage, zhMessage, startTime, endTime, stageOrder, subStages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageInfoWithSub {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enMessage: ").append(toIndentedString(enMessage)).append("\n");
        sb.append("    zhMessage: ").append(toIndentedString(zhMessage)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    stageOrder: ").append(toIndentedString(stageOrder)).append("\n");
        sb.append("    subStages: ").append(toIndentedString(subStages)).append("\n");
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

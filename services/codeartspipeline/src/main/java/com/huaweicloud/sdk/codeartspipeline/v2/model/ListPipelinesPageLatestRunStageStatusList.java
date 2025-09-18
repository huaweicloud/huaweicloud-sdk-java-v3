package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListPipelinesPageLatestRunStageStatusList
 */
public class ListPipelinesPageLatestRunStageStatusList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    public ListPipelinesPageLatestRunStageStatusList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 阶段名称。 **取值范围**： 仅支持输入中文、大小写英文字母、数字、'-'、'_'、','、';'、':'、'.'、'/'、'('、')'、'（'、'）'及空格，其中空格不可在名称开头或结尾使用，且长度为[1,128]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPipelinesPageLatestRunStageStatusList withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * **参数解释**： 阶段序列号，0代表第一个流水线阶段。 **取值范围**： 大于等于零。 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public ListPipelinesPageLatestRunStageStatusList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 流水线阶段状态。 **取值范围**： - INIT：初始化。 - QUEUED：排队。 - RUNNING：运行中。 - CANCELED：取消。 - COMPLETED：已完成。 - FAILED：失败。 - SKIPPED：跳过。 - IGNORED：忽略。 - PAUSED：暂停。 - SUSPEND：挂起。 - ASYNC_RUNNING：异步运行。 - ASYNC_FAILED：异步失败。 - UNSELECTED：未选择。 - REDISPATCH：重新调度。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPipelinesPageLatestRunStageStatusList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 阶段开始时间。 **取值范围**： 不涉及。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListPipelinesPageLatestRunStageStatusList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**： 阶段结束时间。 **取值范围**： 不涉及。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListPipelinesPageLatestRunStageStatusList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 阶段ID。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelinesPageLatestRunStageStatusList that = (ListPipelinesPageLatestRunStageStatusList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sequence, that.sequence)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sequence, status, startTime, endTime, id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesPageLatestRunStageStatusList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

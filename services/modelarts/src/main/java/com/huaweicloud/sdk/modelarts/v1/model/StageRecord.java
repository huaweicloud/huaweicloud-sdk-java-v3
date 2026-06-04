package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业流程阶段记录。
 */
public class StageRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_order")

    private Integer recordOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<StageInfoWithSub> stages = null;

    public StageRecord withRecordOrder(Integer recordOrder) {
        this.recordOrder = recordOrder;
        return this;
    }

    /**
     * **参数解释**：阶段记录序号，顺序递增，最大序号记录为当前最新记录。  **取值范围**：不涉及。
     * @return recordOrder
     */
    public Integer getRecordOrder() {
        return recordOrder;
    }

    public void setRecordOrder(Integer recordOrder) {
        this.recordOrder = recordOrder;
    }

    public StageRecord withStages(List<StageInfoWithSub> stages) {
        this.stages = stages;
        return this;
    }

    public StageRecord addStagesItem(StageInfoWithSub stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public StageRecord withStages(Consumer<List<StageInfoWithSub>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * **参数解释**：主阶段信息列表。
     * @return stages
     */
    public List<StageInfoWithSub> getStages() {
        return stages;
    }

    public void setStages(List<StageInfoWithSub> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StageRecord that = (StageRecord) obj;
        return Objects.equals(this.recordOrder, that.recordOrder) && Objects.equals(this.stages, that.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordOrder, stages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageRecord {\n");
        sb.append("    recordOrder: ").append(toIndentedString(recordOrder)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
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

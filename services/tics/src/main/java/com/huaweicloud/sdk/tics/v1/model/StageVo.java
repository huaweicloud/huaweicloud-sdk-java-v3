package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StageVo
 */
public class StageVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_step_stage_id")

    private List<Integer> lastStepStageId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processors")

    private List<ProcessorVo> processors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_name")

    private String stageName;

    public StageVo withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 执行阶段id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StageVo withLastStepStageId(List<Integer> lastStepStageId) {
        this.lastStepStageId = lastStepStageId;
        return this;
    }

    public StageVo addLastStepStageIdItem(Integer lastStepStageIdItem) {
        if (this.lastStepStageId == null) {
            this.lastStepStageId = new ArrayList<>();
        }
        this.lastStepStageId.add(lastStepStageIdItem);
        return this;
    }

    public StageVo withLastStepStageId(Consumer<List<Integer>> lastStepStageIdSetter) {
        if (this.lastStepStageId == null) {
            this.lastStepStageId = new ArrayList<>();
        }
        lastStepStageIdSetter.accept(this.lastStepStageId);
        return this;
    }

    /**
     * 上游的stageId
     * @return lastStepStageId
     */
    public List<Integer> getLastStepStageId() {
        return lastStepStageId;
    }

    public void setLastStepStageId(List<Integer> lastStepStageId) {
        this.lastStepStageId = lastStepStageId;
    }

    public StageVo withProcessors(List<ProcessorVo> processors) {
        this.processors = processors;
        return this;
    }

    public StageVo addProcessorsItem(ProcessorVo processorsItem) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        this.processors.add(processorsItem);
        return this;
    }

    public StageVo withProcessors(Consumer<List<ProcessorVo>> processorsSetter) {
        if (this.processors == null) {
            this.processors = new ArrayList<>();
        }
        processorsSetter.accept(this.processors);
        return this;
    }

    /**
     * 执行过程
     * @return processors
     */
    public List<ProcessorVo> getProcessors() {
        return processors;
    }

    public void setProcessors(List<ProcessorVo> processors) {
        this.processors = processors;
    }

    public StageVo withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    /**
     * 执行阶段名称
     * @return stageName
     */
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StageVo that = (StageVo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.lastStepStageId, that.lastStepStageId)
            && Objects.equals(this.processors, that.processors) && Objects.equals(this.stageName, that.stageName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lastStepStageId, processors, stageName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastStepStageId: ").append(toIndentedString(lastStepStageId)).append("\n");
        sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
        sb.append("    stageName: ").append(toIndentedString(stageName)).append("\n");
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

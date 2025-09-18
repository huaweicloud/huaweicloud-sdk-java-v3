package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流水线执行结果
 */
public class PipelineExecuteStates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<Stages> stages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_url")

    private String modifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public PipelineExecuteStates withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 流水线执行结果。取值及含义：success：成功；error：失败；aborted：终止
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public PipelineExecuteStates withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 流水线执行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PipelineExecuteStates withStages(List<Stages> stages) {
        this.stages = stages;
        return this;
    }

    public PipelineExecuteStates addStagesItem(Stages stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public PipelineExecuteStates withStages(Consumer<List<Stages>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 阶段执行情况
     * @return stages
     */
    public List<Stages> getStages() {
        return stages;
    }

    public void setStages(List<Stages> stages) {
        this.stages = stages;
    }

    public PipelineExecuteStates withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /**
     * 执行人
     * @return executor
     */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public PipelineExecuteStates withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * 流水线名字
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public PipelineExecuteStates withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineExecuteStates withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /**
     * 流水线执行ID
     * @return buildId
     */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public PipelineExecuteStates withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * 流水线详情页URL
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public PipelineExecuteStates withModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
        return this;
    }

    /**
     * 流水线编辑页URL
     * @return modifyUrl
     */
    public String getModifyUrl() {
        return modifyUrl;
    }

    public void setModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
    }

    public PipelineExecuteStates withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始执行时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PipelineExecuteStates withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束执行时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineExecuteStates that = (PipelineExecuteStates) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.status, that.status)
            && Objects.equals(this.stages, that.stages) && Objects.equals(this.executor, that.executor)
            && Objects.equals(this.pipelineName, that.pipelineName) && Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.buildId, that.buildId) && Objects.equals(this.detailUrl, that.detailUrl)
            && Objects.equals(this.modifyUrl, that.modifyUrl) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result,
            status,
            stages,
            executor,
            pipelineName,
            pipelineId,
            buildId,
            detailUrl,
            modifyUrl,
            startTime,
            endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineExecuteStates {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    modifyUrl: ").append(toIndentedString(modifyUrl)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

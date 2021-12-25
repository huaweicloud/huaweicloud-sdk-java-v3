package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowPipelineLastStatusV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor")

    private String executor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_url")

    private String modifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_id")

    private String buildId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<PipelineStageResp> stages = null;

    public ShowPipelineLastStatusV2Response withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /** 流水线id
     * 
     * @return pipelineId */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ShowPipelineLastStatusV2Response withName(String name) {
        this.name = name;
        return this;
    }

    /** 流水线名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPipelineLastStatusV2Response withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 执行状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowPipelineLastStatusV2Response withResult(String result) {
        this.result = result;
        return this;
    }

    /** 执行结果
     * 
     * @return result */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ShowPipelineLastStatusV2Response withExecutor(String executor) {
        this.executor = executor;
        return this;
    }

    /** 执行人
     * 
     * @return executor */
    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public ShowPipelineLastStatusV2Response withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /** 启动时间
     * 
     * @return startTime */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowPipelineLastStatusV2Response withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /** 结束时间
     * 
     * @return finishTime */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowPipelineLastStatusV2Response withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /** 运行详情链接
     * 
     * @return detailUrl */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public ShowPipelineLastStatusV2Response withModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
        return this;
    }

    /** 编辑链接
     * 
     * @return modifyUrl */
    public String getModifyUrl() {
        return modifyUrl;
    }

    public void setModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
    }

    public ShowPipelineLastStatusV2Response withBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }

    /** 流水线执行序号
     * 
     * @return buildId */
    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public ShowPipelineLastStatusV2Response withStages(List<PipelineStageResp> stages) {
        this.stages = stages;
        return this;
    }

    public ShowPipelineLastStatusV2Response addStagesItem(PipelineStageResp stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public ShowPipelineLastStatusV2Response withStages(Consumer<List<PipelineStageResp>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /** 阶段信息
     * 
     * @return stages */
    public List<PipelineStageResp> getStages() {
        return stages;
    }

    public void setStages(List<PipelineStageResp> stages) {
        this.stages = stages;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPipelineLastStatusV2Response showPipelineLastStatusV2Response = (ShowPipelineLastStatusV2Response) o;
        return Objects.equals(this.pipelineId, showPipelineLastStatusV2Response.pipelineId)
            && Objects.equals(this.name, showPipelineLastStatusV2Response.name)
            && Objects.equals(this.status, showPipelineLastStatusV2Response.status)
            && Objects.equals(this.result, showPipelineLastStatusV2Response.result)
            && Objects.equals(this.executor, showPipelineLastStatusV2Response.executor)
            && Objects.equals(this.startTime, showPipelineLastStatusV2Response.startTime)
            && Objects.equals(this.finishTime, showPipelineLastStatusV2Response.finishTime)
            && Objects.equals(this.detailUrl, showPipelineLastStatusV2Response.detailUrl)
            && Objects.equals(this.modifyUrl, showPipelineLastStatusV2Response.modifyUrl)
            && Objects.equals(this.buildId, showPipelineLastStatusV2Response.buildId)
            && Objects.equals(this.stages, showPipelineLastStatusV2Response.stages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            name,
            status,
            result,
            executor,
            startTime,
            finishTime,
            detailUrl,
            modifyUrl,
            buildId,
            stages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineLastStatusV2Response {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    modifyUrl: ").append(toIndentedString(modifyUrl)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

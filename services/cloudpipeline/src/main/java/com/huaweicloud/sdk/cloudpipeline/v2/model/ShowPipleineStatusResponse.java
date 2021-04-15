package com.huaweicloud.sdk.cloudpipeline.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudpipeline.v2.model.PipelineParameter;
import com.huaweicloud.sdk.cloudpipeline.v2.model.PipelineStateStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowPipleineStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_id")
    
    private String pipelineId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pipeline_name")
    
    private String pipelineName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executor")
    
    private String executor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="build_id")
    
    private String buildId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="parameters")
    
    private List<PipelineParameter> parameters = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="states")
    
    private List<PipelineStateStatus> states = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elapsed_time")
    
    private String elapsedTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outcome")
    
    private String outcome;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail_url")
    
    private String detailUrl;

    public ShowPipleineStatusResponse withPipelineId(String pipelineId) {
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

    

    public ShowPipleineStatusResponse withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    


    /**
     * 流水线名称
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    

    public ShowPipleineStatusResponse withExecutor(String executor) {
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

    

    public ShowPipleineStatusResponse withBuildId(String buildId) {
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

    

    public ShowPipleineStatusResponse withStartTime(String startTime) {
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

    

    public ShowPipleineStatusResponse withEndTime(String endTime) {
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

    

    public ShowPipleineStatusResponse withParameters(List<PipelineParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

    
    public ShowPipleineStatusResponse addParametersItem(PipelineParameter parametersItem) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ShowPipleineStatusResponse withParameters(Consumer<List<PipelineParameter>> parametersSetter) {
        if(this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 流水线参数
     * @return parameters
     */
    public List<PipelineParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<PipelineParameter> parameters) {
        this.parameters = parameters;
    }

    

    public ShowPipleineStatusResponse withStates(List<PipelineStateStatus> states) {
        this.states = states;
        return this;
    }

    
    public ShowPipleineStatusResponse addStatesItem(PipelineStateStatus statesItem) {
        if(this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ShowPipleineStatusResponse withStates(Consumer<List<PipelineStateStatus>> statesSetter) {
        if(this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 流水线执行情况
     * @return states
     */
    public List<PipelineStateStatus> getStates() {
        return states;
    }

    public void setStates(List<PipelineStateStatus> states) {
        this.states = states;
    }

    

    public ShowPipleineStatusResponse withElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
        return this;
    }

    


    /**
     * 执行耗时
     * @return elapsedTime
     */
    public String getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(String elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    

    public ShowPipleineStatusResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 流水线运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ShowPipleineStatusResponse withOutcome(String outcome) {
        this.outcome = outcome;
        return this;
    }

    


    /**
     * 流水线执行结果
     * @return outcome
     */
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    

    public ShowPipleineStatusResponse withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    


    /**
     * 流水线详情页地址
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPipleineStatusResponse showPipleineStatusResponse = (ShowPipleineStatusResponse) o;
        return Objects.equals(this.pipelineId, showPipleineStatusResponse.pipelineId) &&
            Objects.equals(this.pipelineName, showPipleineStatusResponse.pipelineName) &&
            Objects.equals(this.executor, showPipleineStatusResponse.executor) &&
            Objects.equals(this.buildId, showPipleineStatusResponse.buildId) &&
            Objects.equals(this.startTime, showPipleineStatusResponse.startTime) &&
            Objects.equals(this.endTime, showPipleineStatusResponse.endTime) &&
            Objects.equals(this.parameters, showPipleineStatusResponse.parameters) &&
            Objects.equals(this.states, showPipleineStatusResponse.states) &&
            Objects.equals(this.elapsedTime, showPipleineStatusResponse.elapsedTime) &&
            Objects.equals(this.status, showPipleineStatusResponse.status) &&
            Objects.equals(this.outcome, showPipleineStatusResponse.outcome) &&
            Objects.equals(this.detailUrl, showPipleineStatusResponse.detailUrl);
    }
    @Override
    public int hashCode() {
        return Objects.hash(pipelineId, pipelineName, executor, buildId, startTime, endTime, parameters, states, elapsedTime, status, outcome, detailUrl);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipleineStatusResponse {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
        sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
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


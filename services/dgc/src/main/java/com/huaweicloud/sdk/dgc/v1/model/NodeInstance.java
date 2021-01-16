package com.huaweicloud.sdk.dgc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NodeInstance
 */
public class NodeInstance  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeName")
    
    private String nodeName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="planTime")
    
    private Integer planTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private Integer startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private Integer endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="executeTime")
    
    private Integer executeTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodeType")
    
    private String nodeType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="retryTimes")
    
    private Integer retryTimes;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instanceId")
    
    private Integer instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inputRowCount")
    
    private Integer inputRowCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="outputRowCount")
    
    private Integer outputRowCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="logPath")
    
    private String logPath;

    public NodeInstance withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    


    /**
     * Get nodeName
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeInstance withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public NodeInstance withPlanTime(Integer planTime) {
        this.planTime = planTime;
        return this;
    }

    


    /**
     * Get planTime
     * @return planTime
     */
    public Integer getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }

    public NodeInstance withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public NodeInstance withEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public NodeInstance withExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    


    /**
     * Get executeTime
     * @return executeTime
     */
    public Integer getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Integer executeTime) {
        this.executeTime = executeTime;
    }

    public NodeInstance withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    


    /**
     * Get nodeType
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public NodeInstance withRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }

    


    /**
     * Get retryTimes
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    public NodeInstance withInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public Integer getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    public NodeInstance withInputRowCount(Integer inputRowCount) {
        this.inputRowCount = inputRowCount;
        return this;
    }

    


    /**
     * Get inputRowCount
     * @return inputRowCount
     */
    public Integer getInputRowCount() {
        return inputRowCount;
    }

    public void setInputRowCount(Integer inputRowCount) {
        this.inputRowCount = inputRowCount;
    }

    public NodeInstance withOutputRowCount(Integer outputRowCount) {
        this.outputRowCount = outputRowCount;
        return this;
    }

    


    /**
     * Get outputRowCount
     * @return outputRowCount
     */
    public Integer getOutputRowCount() {
        return outputRowCount;
    }

    public void setOutputRowCount(Integer outputRowCount) {
        this.outputRowCount = outputRowCount;
    }

    public NodeInstance withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    


    /**
     * Get logPath
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodeInstance nodeInstance = (NodeInstance) o;
        return Objects.equals(this.nodeName, nodeInstance.nodeName) &&
            Objects.equals(this.status, nodeInstance.status) &&
            Objects.equals(this.planTime, nodeInstance.planTime) &&
            Objects.equals(this.startTime, nodeInstance.startTime) &&
            Objects.equals(this.endTime, nodeInstance.endTime) &&
            Objects.equals(this.executeTime, nodeInstance.executeTime) &&
            Objects.equals(this.nodeType, nodeInstance.nodeType) &&
            Objects.equals(this.retryTimes, nodeInstance.retryTimes) &&
            Objects.equals(this.instanceId, nodeInstance.instanceId) &&
            Objects.equals(this.inputRowCount, nodeInstance.inputRowCount) &&
            Objects.equals(this.outputRowCount, nodeInstance.outputRowCount) &&
            Objects.equals(this.logPath, nodeInstance.logPath);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeName, status, planTime, startTime, endTime, executeTime, nodeType, retryTimes, instanceId, inputRowCount, outputRowCount, logPath);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeInstance {\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    retryTimes: ").append(toIndentedString(retryTimes)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    inputRowCount: ").append(toIndentedString(inputRowCount)).append("\n");
        sb.append("    outputRowCount: ").append(toIndentedString(outputRowCount)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
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


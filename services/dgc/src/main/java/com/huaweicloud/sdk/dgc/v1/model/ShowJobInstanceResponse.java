package com.huaweicloud.sdk.dgc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.NodeInstance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobInstanceResponse extends SdkResponse {



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
    @JsonProperty(value="instancesId")
    
    private String instancesId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<NodeInstance> nodes = null;
    
    public ShowJobInstanceResponse withStatus(String status) {
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

    

    public ShowJobInstanceResponse withPlanTime(Integer planTime) {
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

    

    public ShowJobInstanceResponse withStartTime(Integer startTime) {
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

    

    public ShowJobInstanceResponse withEndTime(Integer endTime) {
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

    

    public ShowJobInstanceResponse withExecuteTime(Integer executeTime) {
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

    

    public ShowJobInstanceResponse withInstancesId(String instancesId) {
        this.instancesId = instancesId;
        return this;
    }

    


    /**
     * Get instancesId
     * @return instancesId
     */
    public String getInstancesId() {
        return instancesId;
    }

    public void setInstancesId(String instancesId) {
        this.instancesId = instancesId;
    }

    

    public ShowJobInstanceResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * Get total
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ShowJobInstanceResponse withNodes(List<NodeInstance> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ShowJobInstanceResponse addNodesItem(NodeInstance nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowJobInstanceResponse withNodes(Consumer<List<NodeInstance>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * Get nodes
     * @return nodes
     */
    public List<NodeInstance> getNodes() {
        return nodes;
    }

    public void setNodes(List<NodeInstance> nodes) {
        this.nodes = nodes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobInstanceResponse showJobInstanceResponse = (ShowJobInstanceResponse) o;
        return Objects.equals(this.status, showJobInstanceResponse.status) &&
            Objects.equals(this.planTime, showJobInstanceResponse.planTime) &&
            Objects.equals(this.startTime, showJobInstanceResponse.startTime) &&
            Objects.equals(this.endTime, showJobInstanceResponse.endTime) &&
            Objects.equals(this.executeTime, showJobInstanceResponse.executeTime) &&
            Objects.equals(this.instancesId, showJobInstanceResponse.instancesId) &&
            Objects.equals(this.total, showJobInstanceResponse.total) &&
            Objects.equals(this.nodes, showJobInstanceResponse.nodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, planTime, startTime, endTime, executeTime, instancesId, total, nodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobInstanceResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    instancesId: ").append(toIndentedString(instancesId)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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


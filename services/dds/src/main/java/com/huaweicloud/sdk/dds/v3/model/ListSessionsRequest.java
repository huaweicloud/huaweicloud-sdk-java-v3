package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSessionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plan_summary")
    
    private String planSummary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cost_time")
    
    private Integer costTime;

    public ListSessionsRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    

    public ListSessionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListSessionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListSessionsRequest withPlanSummary(String planSummary) {
        this.planSummary = planSummary;
        return this;
    }

    


    /**
     * Get planSummary
     * @return planSummary
     */
    public String getPlanSummary() {
        return planSummary;
    }

    public void setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
    }

    

    public ListSessionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListSessionsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * Get namespace
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public ListSessionsRequest withCostTime(Integer costTime) {
        this.costTime = costTime;
        return this;
    }

    


    /**
     * Get costTime
     * @return costTime
     */
    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSessionsRequest listSessionsRequest = (ListSessionsRequest) o;
        return Objects.equals(this.nodeId, listSessionsRequest.nodeId) &&
            Objects.equals(this.offset, listSessionsRequest.offset) &&
            Objects.equals(this.limit, listSessionsRequest.limit) &&
            Objects.equals(this.planSummary, listSessionsRequest.planSummary) &&
            Objects.equals(this.type, listSessionsRequest.type) &&
            Objects.equals(this.namespace, listSessionsRequest.namespace) &&
            Objects.equals(this.costTime, listSessionsRequest.costTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeId, offset, limit, planSummary, type, namespace, costTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSessionsRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    planSummary: ").append(toIndentedString(planSummary)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
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


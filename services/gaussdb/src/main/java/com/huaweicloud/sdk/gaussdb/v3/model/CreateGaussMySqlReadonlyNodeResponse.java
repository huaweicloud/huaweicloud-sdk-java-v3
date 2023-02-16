package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateGaussMySqlReadonlyNodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_names")
    
    
    private List<String> nodeNames = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    
    private String orderId;

    public CreateGaussMySqlReadonlyNodeResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public CreateGaussMySqlReadonlyNodeResponse withNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }

    
    public CreateGaussMySqlReadonlyNodeResponse addNodeNamesItem(String nodeNamesItem) {
        if(this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        this.nodeNames.add(nodeNamesItem);
        return this;
    }

    public CreateGaussMySqlReadonlyNodeResponse withNodeNames(Consumer<List<String>> nodeNamesSetter) {
        if(this.nodeNames == null) {
            this.nodeNames = new ArrayList<>();
        }
        nodeNamesSetter.accept(this.nodeNames);
        return this;
    }

    /**
     * 节点名称列表。
     * @return nodeNames
     */
    public List<String> getNodeNames() {
        return nodeNames;
    }

    public void setNodeNames(List<String> nodeNames) {
        this.nodeNames = nodeNames;
    }

    

    public CreateGaussMySqlReadonlyNodeResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 创建只读节点的任务id。  仅创建按需只读节点时会返回该参数。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public CreateGaussMySqlReadonlyNodeResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单号，创建包年包月只读节点时返回该参数。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateGaussMySqlReadonlyNodeResponse createGaussMySqlReadonlyNodeResponse = (CreateGaussMySqlReadonlyNodeResponse) o;
        return Objects.equals(this.instanceId, createGaussMySqlReadonlyNodeResponse.instanceId) &&
            Objects.equals(this.nodeNames, createGaussMySqlReadonlyNodeResponse.nodeNames) &&
            Objects.equals(this.jobId, createGaussMySqlReadonlyNodeResponse.jobId) &&
            Objects.equals(this.orderId, createGaussMySqlReadonlyNodeResponse.orderId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, nodeNames, jobId, orderId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGaussMySqlReadonlyNodeResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeNames: ").append(toIndentedString(nodeNames)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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


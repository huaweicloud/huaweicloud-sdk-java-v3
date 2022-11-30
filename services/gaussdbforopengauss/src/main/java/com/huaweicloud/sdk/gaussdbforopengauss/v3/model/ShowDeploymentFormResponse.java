package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowDeploymentFormResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="initial_node_num")
    
    
    private Integer initialNodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="solution")
    
    
    private String solution;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shard_num")
    
    
    private Integer shardNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replica_num")
    
    
    private Integer replicaNum;

    public ShowDeploymentFormResponse withInitialNodeNum(Integer initialNodeNum) {
        this.initialNodeNum = initialNodeNum;
        return this;
    }

    


    /**
     * 初始节点数。
     * @return initialNodeNum
     */
    public Integer getInitialNodeNum() {
        return initialNodeNum;
    }

    public void setInitialNodeNum(Integer initialNodeNum) {
        this.initialNodeNum = initialNodeNum;
    }

    

    public ShowDeploymentFormResponse withSolution(String solution) {
        this.solution = solution;
        return this;
    }

    


    /**
     * 解决方案模板名称。
     * @return solution
     */
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    

    public ShowDeploymentFormResponse withShardNum(Integer shardNum) {
        this.shardNum = shardNum;
        return this;
    }

    


    /**
     * 分片数。
     * @return shardNum
     */
    public Integer getShardNum() {
        return shardNum;
    }

    public void setShardNum(Integer shardNum) {
        this.shardNum = shardNum;
    }

    

    public ShowDeploymentFormResponse withReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    


    /**
     * 副本数。
     * @return replicaNum
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeploymentFormResponse showDeploymentFormResponse = (ShowDeploymentFormResponse) o;
        return Objects.equals(this.initialNodeNum, showDeploymentFormResponse.initialNodeNum) &&
            Objects.equals(this.solution, showDeploymentFormResponse.solution) &&
            Objects.equals(this.shardNum, showDeploymentFormResponse.shardNum) &&
            Objects.equals(this.replicaNum, showDeploymentFormResponse.replicaNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(initialNodeNum, solution, shardNum, replicaNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentFormResponse {\n");
        sb.append("    initialNodeNum: ").append(toIndentedString(initialNodeNum)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    shardNum: ").append(toIndentedString(shardNum)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
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


package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.Deployment;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDeploymentsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deployments")
    
    private List<Deployment> deployments = null;
    
    public ListDeploymentsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 部署计划列表的总和。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListDeploymentsResponse withDeployments(List<Deployment> deployments) {
        this.deployments = deployments;
        return this;
    }

    
    public ListDeploymentsResponse addDeploymentsItem(Deployment deploymentsItem) {
        if(this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public ListDeploymentsResponse withDeployments(Consumer<List<Deployment>> deploymentsSetter) {
        if(this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * 部署计划列表。
     * @return deployments
     */
    public List<Deployment> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<Deployment> deployments) {
        this.deployments = deployments;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDeploymentsResponse listDeploymentsResponse = (ListDeploymentsResponse) o;
        return Objects.equals(this.count, listDeploymentsResponse.count) &&
            Objects.equals(this.deployments, listDeploymentsResponse.deployments);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, deployments);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeploymentsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
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


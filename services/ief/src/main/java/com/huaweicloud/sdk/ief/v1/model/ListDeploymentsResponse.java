package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDeploymentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<DeploymentResp> deployments = null;

    public ListDeploymentsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 应用部署总数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListDeploymentsResponse withDeployments(List<DeploymentResp> deployments) {
        this.deployments = deployments;
        return this;
    }

    public ListDeploymentsResponse addDeploymentsItem(DeploymentResp deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public ListDeploymentsResponse withDeployments(Consumer<List<DeploymentResp>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * 应用部署列表
     * @return deployments
     */
    public List<DeploymentResp> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<DeploymentResp> deployments) {
        this.deployments = deployments;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeploymentsResponse that = (ListDeploymentsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.deployments, that.deployments);
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

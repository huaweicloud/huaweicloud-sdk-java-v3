package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsModelDeploymentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_count")

    private OpsDeployTaskStatusCount statusCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployments")

    private List<OpsModelDeploymentInfo> deployments = null;

    public ListOpsModelDeploymentsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 满足条件的部署记录总数，用于计算分页总页数，单位：个（记录总数）。  **取值范围：** 大于等于0的整数。
     * minimum: 0
     * maximum: 100000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListOpsModelDeploymentsResponse withStatusCount(OpsDeployTaskStatusCount statusCount) {
        this.statusCount = statusCount;
        return this;
    }

    public ListOpsModelDeploymentsResponse withStatusCount(Consumer<OpsDeployTaskStatusCount> statusCountSetter) {
        if (this.statusCount == null) {
            this.statusCount = new OpsDeployTaskStatusCount();
            statusCountSetter.accept(this.statusCount);
        }

        return this;
    }

    /**
     * Get statusCount
     * @return statusCount
     */
    public OpsDeployTaskStatusCount getStatusCount() {
        return statusCount;
    }

    public void setStatusCount(OpsDeployTaskStatusCount statusCount) {
        this.statusCount = statusCount;
    }

    public ListOpsModelDeploymentsResponse withDeployments(List<OpsModelDeploymentInfo> deployments) {
        this.deployments = deployments;
        return this;
    }

    public ListOpsModelDeploymentsResponse addDeploymentsItem(OpsModelDeploymentInfo deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    public ListOpsModelDeploymentsResponse withDeployments(Consumer<List<OpsModelDeploymentInfo>> deploymentsSetter) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        deploymentsSetter.accept(this.deployments);
        return this;
    }

    /**
     * **参数解释：** 部署任务列表。  **取值范围：** 符合OpsModelDeploymentInfo定义的对象数组。
     * @return deployments
     */
    public List<OpsModelDeploymentInfo> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<OpsModelDeploymentInfo> deployments) {
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
        ListOpsModelDeploymentsResponse that = (ListOpsModelDeploymentsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.statusCount, that.statusCount)
            && Objects.equals(this.deployments, that.deployments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, statusCount, deployments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsModelDeploymentsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    statusCount: ").append(toIndentedString(statusCount)).append("\n");
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

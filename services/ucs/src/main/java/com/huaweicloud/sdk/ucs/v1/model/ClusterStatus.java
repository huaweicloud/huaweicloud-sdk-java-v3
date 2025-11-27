package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterStatus
 */
public class ClusterStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesVersion")

    private String kubernetesVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conditions")

    private List<ConditionStatus> conditions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeSummary")

    private NodeSummary nodeSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourceSummary")

    private ResourceSummary resourceSummary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private Object endpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arrearFreeze")

    private String arrearFreeze;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policeFreeze")

    private String policeFreeze;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiEnablements")

    private List<APIEnablement> apiEnablements = null;

    public ClusterStatus withKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }

    /**
     * kubernetes版本
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    public void setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }

    public ClusterStatus withConditions(List<ConditionStatus> conditions) {
        this.conditions = conditions;
        return this;
    }

    public ClusterStatus addConditionsItem(ConditionStatus conditionsItem) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        this.conditions.add(conditionsItem);
        return this;
    }

    public ClusterStatus withConditions(Consumer<List<ConditionStatus>> conditionsSetter) {
        if (this.conditions == null) {
            this.conditions = new ArrayList<>();
        }
        conditionsSetter.accept(this.conditions);
        return this;
    }

    /**
     * conditions信息
     * @return conditions
     */
    public List<ConditionStatus> getConditions() {
        return conditions;
    }

    public void setConditions(List<ConditionStatus> conditions) {
        this.conditions = conditions;
    }

    public ClusterStatus withNodeSummary(NodeSummary nodeSummary) {
        this.nodeSummary = nodeSummary;
        return this;
    }

    public ClusterStatus withNodeSummary(Consumer<NodeSummary> nodeSummarySetter) {
        if (this.nodeSummary == null) {
            this.nodeSummary = new NodeSummary();
            nodeSummarySetter.accept(this.nodeSummary);
        }

        return this;
    }

    /**
     * Get nodeSummary
     * @return nodeSummary
     */
    public NodeSummary getNodeSummary() {
        return nodeSummary;
    }

    public void setNodeSummary(NodeSummary nodeSummary) {
        this.nodeSummary = nodeSummary;
    }

    public ClusterStatus withResourceSummary(ResourceSummary resourceSummary) {
        this.resourceSummary = resourceSummary;
        return this;
    }

    public ClusterStatus withResourceSummary(Consumer<ResourceSummary> resourceSummarySetter) {
        if (this.resourceSummary == null) {
            this.resourceSummary = new ResourceSummary();
            resourceSummarySetter.accept(this.resourceSummary);
        }

        return this;
    }

    /**
     * Get resourceSummary
     * @return resourceSummary
     */
    public ResourceSummary getResourceSummary() {
        return resourceSummary;
    }

    public void setResourceSummary(ResourceSummary resourceSummary) {
        this.resourceSummary = resourceSummary;
    }

    public ClusterStatus withEndpoints(Object endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * 端点
     * @return endpoints
     */
    public Object getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(Object endpoints) {
        this.endpoints = endpoints;
    }

    public ClusterStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 阶段状态信息
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public ClusterStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 表述上次状况变化的原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ClusterStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 上次状态转换的详细信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ClusterStatus withArrearFreeze(String arrearFreeze) {
        this.arrearFreeze = arrearFreeze;
        return this;
    }

    /**
     * 欠费冻结
     * @return arrearFreeze
     */
    public String getArrearFreeze() {
        return arrearFreeze;
    }

    public void setArrearFreeze(String arrearFreeze) {
        this.arrearFreeze = arrearFreeze;
    }

    public ClusterStatus withPoliceFreeze(String policeFreeze) {
        this.policeFreeze = policeFreeze;
        return this;
    }

    /**
     * 公安冻结
     * @return policeFreeze
     */
    public String getPoliceFreeze() {
        return policeFreeze;
    }

    public void setPoliceFreeze(String policeFreeze) {
        this.policeFreeze = policeFreeze;
    }

    public ClusterStatus withApiEnablements(List<APIEnablement> apiEnablements) {
        this.apiEnablements = apiEnablements;
        return this;
    }

    public ClusterStatus addApiEnablementsItem(APIEnablement apiEnablementsItem) {
        if (this.apiEnablements == null) {
            this.apiEnablements = new ArrayList<>();
        }
        this.apiEnablements.add(apiEnablementsItem);
        return this;
    }

    public ClusterStatus withApiEnablements(Consumer<List<APIEnablement>> apiEnablementsSetter) {
        if (this.apiEnablements == null) {
            this.apiEnablements = new ArrayList<>();
        }
        apiEnablementsSetter.accept(this.apiEnablements);
        return this;
    }

    /**
     * 开启的资源列表
     * @return apiEnablements
     */
    public List<APIEnablement> getApiEnablements() {
        return apiEnablements;
    }

    public void setApiEnablements(List<APIEnablement> apiEnablements) {
        this.apiEnablements = apiEnablements;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterStatus that = (ClusterStatus) obj;
        return Objects.equals(this.kubernetesVersion, that.kubernetesVersion)
            && Objects.equals(this.conditions, that.conditions) && Objects.equals(this.nodeSummary, that.nodeSummary)
            && Objects.equals(this.resourceSummary, that.resourceSummary)
            && Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.message, that.message)
            && Objects.equals(this.arrearFreeze, that.arrearFreeze)
            && Objects.equals(this.policeFreeze, that.policeFreeze)
            && Objects.equals(this.apiEnablements, that.apiEnablements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kubernetesVersion,
            conditions,
            nodeSummary,
            resourceSummary,
            endpoints,
            phase,
            reason,
            message,
            arrearFreeze,
            policeFreeze,
            apiEnablements);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterStatus {\n");
        sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    nodeSummary: ").append(toIndentedString(nodeSummary)).append("\n");
        sb.append("    resourceSummary: ").append(toIndentedString(resourceSummary)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    arrearFreeze: ").append(toIndentedString(arrearFreeze)).append("\n");
        sb.append("    policeFreeze: ").append(toIndentedString(policeFreeze)).append("\n");
        sb.append("    apiEnablements: ").append(toIndentedString(apiEnablements)).append("\n");
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

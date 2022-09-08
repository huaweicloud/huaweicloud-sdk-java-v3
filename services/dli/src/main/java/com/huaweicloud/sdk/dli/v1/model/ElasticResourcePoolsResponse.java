package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 弹性资源池列表
 */
public class ElasticResourcePoolsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queues")

    private List<String> queues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cu")

    private Integer maxCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cu")

    private Integer minCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_cu")

    private Integer actualCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_in_vpc")

    private String cidrInVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cu")

    private Integer currentCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prepay_cu")

    private Integer prepayCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager")

    private String manager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private Map<String, String> label = null;

    public ElasticResourcePoolsResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ElasticResourcePoolsResponse withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public ElasticResourcePoolsResponse addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ElasticResourcePoolsResponse withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * 
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public ElasticResourcePoolsResponse withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 用户名
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ElasticResourcePoolsResponse withElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
        return this;
    }

    /**
     * 资源池名称
     * @return elasticResourcePoolName
     */
    public String getElasticResourcePoolName() {
        return elasticResourcePoolName;
    }

    public void setElasticResourcePoolName(String elasticResourcePoolName) {
        this.elasticResourcePoolName = elasticResourcePoolName;
    }

    public ElasticResourcePoolsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 资源池描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ElasticResourcePoolsResponse withMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }

    /**
     * 最大cu数量
     * @return maxCu
     */
    public Integer getMaxCu() {
        return maxCu;
    }

    public void setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
    }

    public ElasticResourcePoolsResponse withMinCu(Integer minCu) {
        this.minCu = minCu;
        return this;
    }

    /**
     * 最小cu数量
     * @return minCu
     */
    public Integer getMinCu() {
        return minCu;
    }

    public void setMinCu(Integer minCu) {
        this.minCu = minCu;
    }

    public ElasticResourcePoolsResponse withActualCu(Integer actualCu) {
        this.actualCu = actualCu;
        return this;
    }

    /**
     * 实际cu数量
     * @return actualCu
     */
    public Integer getActualCu() {
        return actualCu;
    }

    public void setActualCu(Integer actualCu) {
        this.actualCu = actualCu;
    }

    public ElasticResourcePoolsResponse withCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
        return this;
    }

    /**
     * 子网
     * @return cidrInVpc
     */
    public String getCidrInVpc() {
        return cidrInVpc;
    }

    public void setCidrInVpc(String cidrInVpc) {
        this.cidrInVpc = cidrInVpc;
    }

    public ElasticResourcePoolsResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ElasticResourcePoolsResponse withCurrentCu(Integer currentCu) {
        this.currentCu = currentCu;
        return this;
    }

    /**
     * 当前cu数量
     * @return currentCu
     */
    public Integer getCurrentCu() {
        return currentCu;
    }

    public void setCurrentCu(Integer currentCu) {
        this.currentCu = currentCu;
    }

    public ElasticResourcePoolsResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ElasticResourcePoolsResponse withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ElasticResourcePoolsResponse withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 创建失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public ElasticResourcePoolsResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ElasticResourcePoolsResponse withPrepayCu(Integer prepayCu) {
        this.prepayCu = prepayCu;
        return this;
    }

    /**
     * 预付费cu数量
     * @return prepayCu
     */
    public Integer getPrepayCu() {
        return prepayCu;
    }

    public void setPrepayCu(Integer prepayCu) {
        this.prepayCu = prepayCu;
    }

    public ElasticResourcePoolsResponse withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费类型
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ElasticResourcePoolsResponse withManager(String manager) {
        this.manager = manager;
        return this;
    }

    /**
     * 弹性资源池类型
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public ElasticResourcePoolsResponse withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public ElasticResourcePoolsResponse putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public ElasticResourcePoolsResponse withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 标识弹性资源池，目前只支持 开发者标签，\"label\": {\"billing_spec_code\":\"developer\"}
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ElasticResourcePoolsResponse elasticResourcePoolsResponse = (ElasticResourcePoolsResponse) o;
        return Objects.equals(this.updateTime, elasticResourcePoolsResponse.updateTime)
            && Objects.equals(this.queues, elasticResourcePoolsResponse.queues)
            && Objects.equals(this.owner, elasticResourcePoolsResponse.owner)
            && Objects.equals(this.elasticResourcePoolName, elasticResourcePoolsResponse.elasticResourcePoolName)
            && Objects.equals(this.description, elasticResourcePoolsResponse.description)
            && Objects.equals(this.maxCu, elasticResourcePoolsResponse.maxCu)
            && Objects.equals(this.minCu, elasticResourcePoolsResponse.minCu)
            && Objects.equals(this.actualCu, elasticResourcePoolsResponse.actualCu)
            && Objects.equals(this.cidrInVpc, elasticResourcePoolsResponse.cidrInVpc)
            && Objects.equals(this.createTime, elasticResourcePoolsResponse.createTime)
            && Objects.equals(this.currentCu, elasticResourcePoolsResponse.currentCu)
            && Objects.equals(this.status, elasticResourcePoolsResponse.status)
            && Objects.equals(this.resourceId, elasticResourcePoolsResponse.resourceId)
            && Objects.equals(this.failReason, elasticResourcePoolsResponse.failReason)
            && Objects.equals(this.enterpriseProjectId, elasticResourcePoolsResponse.enterpriseProjectId)
            && Objects.equals(this.prepayCu, elasticResourcePoolsResponse.prepayCu)
            && Objects.equals(this.chargingMode, elasticResourcePoolsResponse.chargingMode)
            && Objects.equals(this.manager, elasticResourcePoolsResponse.manager)
            && Objects.equals(this.label, elasticResourcePoolsResponse.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(updateTime,
            queues,
            owner,
            elasticResourcePoolName,
            description,
            maxCu,
            minCu,
            actualCu,
            cidrInVpc,
            createTime,
            currentCu,
            status,
            resourceId,
            failReason,
            enterpriseProjectId,
            prepayCu,
            chargingMode,
            manager,
            label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElasticResourcePoolsResponse {\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
        sb.append("    actualCu: ").append(toIndentedString(actualCu)).append("\n");
        sb.append("    cidrInVpc: ").append(toIndentedString(cidrInVpc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    currentCu: ").append(toIndentedString(currentCu)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    prepayCu: ").append(toIndentedString(prepayCu)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

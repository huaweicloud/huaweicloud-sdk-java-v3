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
public class ElasticResourcePool {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elastic_resource_pool_name")

    private String elasticResourcePoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_cidr_in_subnet")

    private String ipv6CidrInSubnet;

    public ElasticResourcePool withElasticResourcePoolName(String elasticResourcePoolName) {
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

    public ElasticResourcePool withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 资源池id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ElasticResourcePool withUpdateTime(Long updateTime) {
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

    public ElasticResourcePool withQueues(List<String> queues) {
        this.queues = queues;
        return this;
    }

    public ElasticResourcePool addQueuesItem(String queuesItem) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        this.queues.add(queuesItem);
        return this;
    }

    public ElasticResourcePool withQueues(Consumer<List<String>> queuesSetter) {
        if (this.queues == null) {
            this.queues = new ArrayList<>();
        }
        queuesSetter.accept(this.queues);
        return this;
    }

    /**
     * Get queues
     * @return queues
     */
    public List<String> getQueues() {
        return queues;
    }

    public void setQueues(List<String> queues) {
        this.queues = queues;
    }

    public ElasticResourcePool withOwner(String owner) {
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

    public ElasticResourcePool withDescription(String description) {
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

    public ElasticResourcePool withMaxCu(Integer maxCu) {
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

    public ElasticResourcePool withMinCu(Integer minCu) {
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

    public ElasticResourcePool withActualCu(Integer actualCu) {
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

    public ElasticResourcePool withCidrInVpc(String cidrInVpc) {
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

    public ElasticResourcePool withCreateTime(Long createTime) {
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

    public ElasticResourcePool withCurrentCu(Integer currentCu) {
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

    public ElasticResourcePool withStatus(String status) {
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

    public ElasticResourcePool withResourceId(String resourceId) {
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

    public ElasticResourcePool withFailReason(String failReason) {
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

    public ElasticResourcePool withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ElasticResourcePool withPrepayCu(Integer prepayCu) {
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

    public ElasticResourcePool withChargingMode(Integer chargingMode) {
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

    public ElasticResourcePool withManager(String manager) {
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

    public ElasticResourcePool withLabel(Map<String, String> label) {
        this.label = label;
        return this;
    }

    public ElasticResourcePool putLabelItem(String key, String labelItem) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        this.label.put(key, labelItem);
        return this;
    }

    public ElasticResourcePool withLabel(Consumer<Map<String, String>> labelSetter) {
        if (this.label == null) {
            this.label = new HashMap<>();
        }
        labelSetter.accept(this.label);
        return this;
    }

    /**
     * 弹性资源池属性字段。默认为标准版弹性资源池；{\"spec\":\"basic\"}标识基础版弹性资源池；{\"billing_spec_code\":\"developer\"}标识开发者弹性资源池。目前不支持其它属性设置。
     * @return label
     */
    public Map<String, String> getLabel() {
        return label;
    }

    public void setLabel(Map<String, String> label) {
        this.label = label;
    }

    public ElasticResourcePool withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否启用IPv6
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ElasticResourcePool withIpv6CidrInSubnet(String ipv6CidrInSubnet) {
        this.ipv6CidrInSubnet = ipv6CidrInSubnet;
        return this;
    }

    /**
     * IPv6子网网段
     * @return ipv6CidrInSubnet
     */
    public String getIpv6CidrInSubnet() {
        return ipv6CidrInSubnet;
    }

    public void setIpv6CidrInSubnet(String ipv6CidrInSubnet) {
        this.ipv6CidrInSubnet = ipv6CidrInSubnet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElasticResourcePool that = (ElasticResourcePool) obj;
        return Objects.equals(this.elasticResourcePoolName, that.elasticResourcePoolName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.queues, that.queues) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.description, that.description) && Objects.equals(this.maxCu, that.maxCu)
            && Objects.equals(this.minCu, that.minCu) && Objects.equals(this.actualCu, that.actualCu)
            && Objects.equals(this.cidrInVpc, that.cidrInVpc) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.currentCu, that.currentCu) && Objects.equals(this.status, that.status)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.prepayCu, that.prepayCu) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.manager, that.manager) && Objects.equals(this.label, that.label)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.ipv6CidrInSubnet, that.ipv6CidrInSubnet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elasticResourcePoolName,
            id,
            updateTime,
            queues,
            owner,
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
            label,
            ipv6Enable,
            ipv6CidrInSubnet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElasticResourcePool {\n");
        sb.append("    elasticResourcePoolName: ").append(toIndentedString(elasticResourcePoolName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6CidrInSubnet: ").append(toIndentedString(ipv6CidrInSubnet)).append("\n");
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

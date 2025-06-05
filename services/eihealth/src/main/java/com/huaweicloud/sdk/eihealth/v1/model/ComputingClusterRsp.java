package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 计算集群详情。
 */
public class ComputingClusterRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_nodes_number")

    private Integer activeNodesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_nodes_number")

    private Integer totalNodesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_create_time")

    private String cceCreateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_status")

    private String cceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_id")

    private String cceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private String billingMode;

    public ComputingClusterRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 已绑定的集群ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComputingClusterRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 计算集群名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComputingClusterRsp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 计算集群版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ComputingClusterRsp withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 计算集群规格。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ComputingClusterRsp withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 计算集群类别。CCE代表CCE集群，Turbo代表CCE Turbo集群。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ComputingClusterRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 计算集群绑定状态，支持RUNNING|INSTALL_FAILED|UNINSTALL_FAILED|INSTALLING|UNINSTALLING。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ComputingClusterRsp withActiveNodesNumber(Integer activeNodesNumber) {
        this.activeNodesNumber = activeNodesNumber;
        return this;
    }

    /**
     * 计算集群可用节点数。
     * @return activeNodesNumber
     */
    public Integer getActiveNodesNumber() {
        return activeNodesNumber;
    }

    public void setActiveNodesNumber(Integer activeNodesNumber) {
        this.activeNodesNumber = activeNodesNumber;
    }

    public ComputingClusterRsp withTotalNodesNumber(Integer totalNodesNumber) {
        this.totalNodesNumber = totalNodesNumber;
        return this;
    }

    /**
     * 计算集群总节点数。
     * @return totalNodesNumber
     */
    public Integer getTotalNodesNumber() {
        return totalNodesNumber;
    }

    public void setTotalNodesNumber(Integer totalNodesNumber) {
        this.totalNodesNumber = totalNodesNumber;
    }

    public ComputingClusterRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 计算集群绑定时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ComputingClusterRsp withCceCreateTime(String cceCreateTime) {
        this.cceCreateTime = cceCreateTime;
        return this;
    }

    /**
     * cce集群创建时间。
     * @return cceCreateTime
     */
    public String getCceCreateTime() {
        return cceCreateTime;
    }

    public void setCceCreateTime(String cceCreateTime) {
        this.cceCreateTime = cceCreateTime;
    }

    public ComputingClusterRsp withCceStatus(String cceStatus) {
        this.cceStatus = cceStatus;
        return this;
    }

    /**
     * cce集群绑态。
     * @return cceStatus
     */
    public String getCceStatus() {
        return cceStatus;
    }

    public void setCceStatus(String cceStatus) {
        this.cceStatus = cceStatus;
    }

    public ComputingClusterRsp withCceId(String cceId) {
        this.cceId = cceId;
        return this;
    }

    /**
     * cce集群ID。
     * @return cceId
     */
    public String getCceId() {
        return cceId;
    }

    public void setCceId(String cceId) {
        this.cceId = cceId;
    }

    public ComputingClusterRsp withBillingMode(String billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 计费模式，prepaid表示包周期，postpaid表示按需。
     * @return billingMode
     */
    public String getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComputingClusterRsp that = (ComputingClusterRsp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.flavor, that.flavor)
            && Objects.equals(this.category, that.category) && Objects.equals(this.status, that.status)
            && Objects.equals(this.activeNodesNumber, that.activeNodesNumber)
            && Objects.equals(this.totalNodesNumber, that.totalNodesNumber)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.cceCreateTime, that.cceCreateTime) && Objects.equals(this.cceStatus, that.cceStatus)
            && Objects.equals(this.cceId, that.cceId) && Objects.equals(this.billingMode, that.billingMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            version,
            flavor,
            category,
            status,
            activeNodesNumber,
            totalNodesNumber,
            createTime,
            cceCreateTime,
            cceStatus,
            cceId,
            billingMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComputingClusterRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    activeNodesNumber: ").append(toIndentedString(activeNodesNumber)).append("\n");
        sb.append("    totalNodesNumber: ").append(toIndentedString(totalNodesNumber)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    cceCreateTime: ").append(toIndentedString(cceCreateTime)).append("\n");
        sb.append("    cceStatus: ").append(toIndentedString(cceStatus)).append("\n");
        sb.append("    cceId: ").append(toIndentedString(cceId)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
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

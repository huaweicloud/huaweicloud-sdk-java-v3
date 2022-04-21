package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源分组信息
 */
public class ResourceGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_statistics")

    private InstanceStatistics instanceStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ResourceGroupInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 资源分组的名称，如：ResourceGroup-Test01。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ResourceGroupInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 资源分组的ID，如：rg1603786526428bWbVmk4rP。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ResourceGroupInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 资源分组的创建时间，UNIX时间戳，单位毫秒；如：1603819753000。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ResourceGroupInfo withInstanceStatistics(InstanceStatistics instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
        return this;
    }

    public ResourceGroupInfo withInstanceStatistics(Consumer<InstanceStatistics> instanceStatisticsSetter) {
        if (this.instanceStatistics == null) {
            this.instanceStatistics = new InstanceStatistics();
            instanceStatisticsSetter.accept(this.instanceStatistics);
        }

        return this;
    }

    /**
     * Get instanceStatistics
     * @return instanceStatistics
     */
    public InstanceStatistics getInstanceStatistics() {
        return instanceStatistics;
    }

    public void setInstanceStatistics(InstanceStatistics instanceStatistics) {
        this.instanceStatistics = instanceStatistics;
    }

    public ResourceGroupInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 资源分组的当前状态，值可为health、unhealth、no_alarm_rule；health表示健康，unhealth表示不健康，no_alarm_rule表示未设置告警规则。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ResourceGroupInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 创建资源分组时关联的企业项目，默认值为0，表示企业项目为default。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceGroupInfo resourceGroupInfo = (ResourceGroupInfo) o;
        return Objects.equals(this.groupName, resourceGroupInfo.groupName)
            && Objects.equals(this.groupId, resourceGroupInfo.groupId)
            && Objects.equals(this.createTime, resourceGroupInfo.createTime)
            && Objects.equals(this.instanceStatistics, resourceGroupInfo.instanceStatistics)
            && Objects.equals(this.status, resourceGroupInfo.status)
            && Objects.equals(this.enterpriseProjectId, resourceGroupInfo.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, groupId, createTime, instanceStatistics, status, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceGroupInfo {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    instanceStatistics: ").append(toIndentedString(instanceStatistics)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

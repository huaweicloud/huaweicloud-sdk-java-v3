package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SimpleDesktopInfoDetail
 */
public class SimpleDesktopInfoDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "computer_name")

    private String computerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_host_name")

    private String osHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_user_infos")

    private List<AttachInstancesUserInfo> attachUserInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private String userGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ou_name")

    private String ouName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_maintenance_mode")

    private Boolean inMaintenanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_resource_sku")

    private String shareResourceSku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_type")

    private String desktopType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_resource_id")

    private String billResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_status")

    private String connectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hibernate_policy_num")

    private Integer hibernatePolicyNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_hibernate")

    private Integer isAutoHibernate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclusive_host_id")

    private String exclusiveHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deh_id")

    private String dehId;

    public SimpleDesktopInfoDetail withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面ID。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public SimpleDesktopInfoDetail withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * 桌面名。
     * @return computerName
     */
    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public SimpleDesktopInfoDetail withOsHostName(String osHostName) {
        this.osHostName = osHostName;
        return this;
    }

    /**
     * 系统计算机名。
     * @return osHostName
     */
    public String getOsHostName() {
        return osHostName;
    }

    public void setOsHostName(String osHostName) {
        this.osHostName = osHostName;
    }

    public SimpleDesktopInfoDetail withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 创建时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public SimpleDesktopInfoDetail withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 桌面ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public SimpleDesktopInfoDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SimpleDesktopInfoDetail withAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
        return this;
    }

    public SimpleDesktopInfoDetail addAttachUserInfosItem(AttachInstancesUserInfo attachUserInfosItem) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        this.attachUserInfos.add(attachUserInfosItem);
        return this;
    }

    public SimpleDesktopInfoDetail withAttachUserInfos(Consumer<List<AttachInstancesUserInfo>> attachUserInfosSetter) {
        if (this.attachUserInfos == null) {
            this.attachUserInfos = new ArrayList<>();
        }
        attachUserInfosSetter.accept(this.attachUserInfos);
        return this;
    }

    /**
     * 桌面已分配的用户信息列表。
     * @return attachUserInfos
     */
    public List<AttachInstancesUserInfo> getAttachUserInfos() {
        return attachUserInfos;
    }

    public void setAttachUserInfos(List<AttachInstancesUserInfo> attachUserInfos) {
        this.attachUserInfos = attachUserInfos;
    }

    public SimpleDesktopInfoDetail withUserGroup(String userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    /**
     * 权限组。
     * @return userGroup
     */
    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public SimpleDesktopInfoDetail withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 桌面的SID信息。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public SimpleDesktopInfoDetail withOuName(String ouName) {
        this.ouName = ouName;
        return this;
    }

    /**
     * ou名称。
     * @return ouName
     */
    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public SimpleDesktopInfoDetail withEnterpriseProjectId(String enterpriseProjectId) {
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

    public SimpleDesktopInfoDetail withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public SimpleDesktopInfoDetail addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SimpleDesktopInfoDetail withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public SimpleDesktopInfoDetail withInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
        return this;
    }

    /**
     * 是否处于管理员维护模式
     * @return inMaintenanceMode
     */
    public Boolean getInMaintenanceMode() {
        return inMaintenanceMode;
    }

    public void setInMaintenanceMode(Boolean inMaintenanceMode) {
        this.inMaintenanceMode = inMaintenanceMode;
    }

    public SimpleDesktopInfoDetail withShareResourceSku(String shareResourceSku) {
        this.shareResourceSku = shareResourceSku;
        return this;
    }

    /**
     * 桌面协同资源SKU码
     * @return shareResourceSku
     */
    public String getShareResourceSku() {
        return shareResourceSku;
    }

    public void setShareResourceSku(String shareResourceSku) {
        this.shareResourceSku = shareResourceSku;
    }

    public SimpleDesktopInfoDetail withDesktopType(String desktopType) {
        this.desktopType = desktopType;
        return this;
    }

    /**
     * 桌面类型
     * @return desktopType
     */
    public String getDesktopType() {
        return desktopType;
    }

    public void setDesktopType(String desktopType) {
        this.desktopType = desktopType;
    }

    public SimpleDesktopInfoDetail withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 桌面的子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public SimpleDesktopInfoDetail withBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
        return this;
    }

    /**
     * 桌面计费资源ID。
     * @return billResourceId
     */
    public String getBillResourceId() {
        return billResourceId;
    }

    public void setBillResourceId(String billResourceId) {
        this.billResourceId = billResourceId;
    }

    public SimpleDesktopInfoDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SimpleDesktopInfoDetail withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 桌面的任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public SimpleDesktopInfoDetail withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 系統状态
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public SimpleDesktopInfoDetail withConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
        return this;
    }

    /**
     * 连接状态
     * @return connectStatus
     */
    public String getConnectStatus() {
        return connectStatus;
    }

    public void setConnectStatus(String connectStatus) {
        this.connectStatus = connectStatus;
    }

    public SimpleDesktopInfoDetail withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 套餐名称
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public SimpleDesktopInfoDetail withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * AccessAgent版本号
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public SimpleDesktopInfoDetail withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户ID
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public SimpleDesktopInfoDetail withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public SimpleDesktopInfoDetail withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * 资源池ID
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public SimpleDesktopInfoDetail withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型：Linux、Windows或Others。
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public SimpleDesktopInfoDetail withHibernatePolicyNum(Integer hibernatePolicyNum) {
        this.hibernatePolicyNum = hibernatePolicyNum;
        return this;
    }

    /**
     * 智能休眠策略数。
     * minimum: 0
     * maximum: 50
     * @return hibernatePolicyNum
     */
    public Integer getHibernatePolicyNum() {
        return hibernatePolicyNum;
    }

    public void setHibernatePolicyNum(Integer hibernatePolicyNum) {
        this.hibernatePolicyNum = hibernatePolicyNum;
    }

    public SimpleDesktopInfoDetail withIsAutoHibernate(Integer isAutoHibernate) {
        this.isAutoHibernate = isAutoHibernate;
        return this;
    }

    /**
     * 是否处于智能休眠中
     * @return isAutoHibernate
     */
    public Integer getIsAutoHibernate() {
        return isAutoHibernate;
    }

    public void setIsAutoHibernate(Integer isAutoHibernate) {
        this.isAutoHibernate = isAutoHibernate;
    }

    public SimpleDesktopInfoDetail withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 所属的可用区。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public SimpleDesktopInfoDetail withExclusiveHostId(String exclusiveHostId) {
        this.exclusiveHostId = exclusiveHostId;
        return this;
    }

    /**
     * 专享主机ID。
     * @return exclusiveHostId
     */
    public String getExclusiveHostId() {
        return exclusiveHostId;
    }

    public void setExclusiveHostId(String exclusiveHostId) {
        this.exclusiveHostId = exclusiveHostId;
    }

    public SimpleDesktopInfoDetail withDehId(String dehId) {
        this.dehId = dehId;
        return this;
    }

    /**
     * 云办公主机ID。
     * @return dehId
     */
    public String getDehId() {
        return dehId;
    }

    public void setDehId(String dehId) {
        this.dehId = dehId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleDesktopInfoDetail that = (SimpleDesktopInfoDetail) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.computerName, that.computerName)
            && Objects.equals(this.osHostName, that.osHostName) && Objects.equals(this.created, that.created)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.attachUserInfos, that.attachUserInfos)
            && Objects.equals(this.userGroup, that.userGroup) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.ouName, that.ouName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.inMaintenanceMode, that.inMaintenanceMode)
            && Objects.equals(this.shareResourceSku, that.shareResourceSku)
            && Objects.equals(this.desktopType, that.desktopType) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.billResourceId, that.billResourceId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskStatus, that.taskStatus)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.connectStatus, that.connectStatus)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.tenantName, that.tenantName)
            && Objects.equals(this.resourcePoolId, that.resourcePoolId) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.hibernatePolicyNum, that.hibernatePolicyNum)
            && Objects.equals(this.isAutoHibernate, that.isAutoHibernate)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.exclusiveHostId, that.exclusiveHostId) && Objects.equals(this.dehId, that.dehId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            computerName,
            osHostName,
            created,
            ipAddress,
            userName,
            attachUserInfos,
            userGroup,
            sid,
            ouName,
            enterpriseProjectId,
            tags,
            inMaintenanceMode,
            shareResourceSku,
            desktopType,
            subnetId,
            billResourceId,
            status,
            taskStatus,
            instanceStatus,
            connectStatus,
            productName,
            agentVersion,
            tenantId,
            tenantName,
            resourcePoolId,
            osType,
            hibernatePolicyNum,
            isAutoHibernate,
            availabilityZone,
            exclusiveHostId,
            dehId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleDesktopInfoDetail {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    computerName: ").append(toIndentedString(computerName)).append("\n");
        sb.append("    osHostName: ").append(toIndentedString(osHostName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    attachUserInfos: ").append(toIndentedString(attachUserInfos)).append("\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    ouName: ").append(toIndentedString(ouName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    inMaintenanceMode: ").append(toIndentedString(inMaintenanceMode)).append("\n");
        sb.append("    shareResourceSku: ").append(toIndentedString(shareResourceSku)).append("\n");
        sb.append("    desktopType: ").append(toIndentedString(desktopType)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    billResourceId: ").append(toIndentedString(billResourceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    connectStatus: ").append(toIndentedString(connectStatus)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    hibernatePolicyNum: ").append(toIndentedString(hibernatePolicyNum)).append("\n");
        sb.append("    isAutoHibernate: ").append(toIndentedString(isAutoHibernate)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    exclusiveHostId: ").append(toIndentedString(exclusiveHostId)).append("\n");
        sb.append("    dehId: ").append(toIndentedString(dehId)).append("\n");
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

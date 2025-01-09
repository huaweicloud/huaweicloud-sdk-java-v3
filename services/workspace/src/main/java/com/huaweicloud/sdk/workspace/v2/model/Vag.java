package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Vag
 */
public class Vag {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "site_id")

    private String siteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vag_ip")

    private String vagIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ipv6")

    private String privateIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vag_port_id")

    private String vagPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_user")

    private String sshUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_pwd")

    private String sshPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_id")

    private String vmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ip")

    private String internalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_ipv6")

    private String internalIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internal_port_id")

    private String internalPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_ip")

    private String externalIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_id")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_user")

    private String rootUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_pwd")

    private String rootPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_str")

    private String createTimeStr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_online_user")

    private Long numberOfOnlineUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private String runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_edge_version")

    private String accessEdgeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_lock")

    private Integer tenantLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_type")

    private String resourcePoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_sk")

    private String edgeSk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_heartbeat")

    private Boolean hasHeartbeat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private Integer userCount;

    public Vag withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * vAG信息ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vag withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Vag withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    /**
     * 站点ID
     * @return siteId
     */
    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public Vag withVagIp(String vagIp) {
        this.vagIp = vagIp;
        return this;
    }

    /**
     * vAG IP，与管理节点相同的IP
     * @return vagIp
     */
    public String getVagIp() {
        return vagIp;
    }

    public void setVagIp(String vagIp) {
        this.vagIp = vagIp;
    }

    public Vag withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * vAG内网IP，HDA往这个IP上报心跳
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public Vag withPrivateIpv6(String privateIpv6) {
        this.privateIpv6 = privateIpv6;
        return this;
    }

    /**
     * vAG内网IPv6
     * @return privateIpv6
     */
    public String getPrivateIpv6() {
        return privateIpv6;
    }

    public void setPrivateIpv6(String privateIpv6) {
        this.privateIpv6 = privateIpv6;
    }

    public Vag withVagPortId(String vagPortId) {
        this.vagPortId = vagPortId;
        return this;
    }

    /**
     * vAG端口ID，与管理节点相同的端口的ID
     * @return vagPortId
     */
    public String getVagPortId() {
        return vagPortId;
    }

    public void setVagPortId(String vagPortId) {
        this.vagPortId = vagPortId;
    }

    public Vag withSshUser(String sshUser) {
        this.sshUser = sshUser;
        return this;
    }

    /**
     * SSH用户的名称，固定为gandalf
     * @return sshUser
     */
    public String getSshUser() {
        return sshUser;
    }

    public void setSshUser(String sshUser) {
        this.sshUser = sshUser;
    }

    public Vag withSshPwd(String sshPwd) {
        this.sshPwd = sshPwd;
        return this;
    }

    /**
     * SSH用户的密码
     * @return sshPwd
     */
    public String getSshPwd() {
        return sshPwd;
    }

    public void setSshPwd(String sshPwd) {
        this.sshPwd = sshPwd;
    }

    public Vag withVmId(String vmId) {
        this.vmId = vmId;
        return this;
    }

    /**
     * vAG所属ECS的ID
     * @return vmId
     */
    public String getVmId() {
        return vmId;
    }

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public Vag withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * vAG所属机器名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vag withInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }

    /**
     * vAG内部通信IP，最终租户VPC的子网IP
     * @return internalIp
     */
    public String getInternalIp() {
        return internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    public Vag withInternalIpv6(String internalIpv6) {
        this.internalIpv6 = internalIpv6;
        return this;
    }

    /**
     * vAG内部通信IPV6
     * @return internalIpv6
     */
    public String getInternalIpv6() {
        return internalIpv6;
    }

    public void setInternalIpv6(String internalIpv6) {
        this.internalIpv6 = internalIpv6;
    }

    public Vag withInternalPortId(String internalPortId) {
        this.internalPortId = internalPortId;
        return this;
    }

    /**
     * vAG内部通信端口ID，最终租户VPC的子网中端口的ID
     * @return internalPortId
     */
    public String getInternalPortId() {
        return internalPortId;
    }

    public void setInternalPortId(String internalPortId) {
        this.internalPortId = internalPortId;
    }

    public Vag withExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }

    /**
     * 外部通信IP，可能独立的EIP
     * @return externalIp
     */
    public String getExternalIp() {
        return externalIp;
    }

    public void setExternalIp(String externalIp) {
        this.externalIp = externalIp;
    }

    public Vag withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部通信ID，可能独立的EIP ID
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Vag withRootUser(String rootUser) {
        this.rootUser = rootUser;
        return this;
    }

    /**
     * root用户的名称，固定为root
     * @return rootUser
     */
    public String getRootUser() {
        return rootUser;
    }

    public void setRootUser(String rootUser) {
        this.rootUser = rootUser;
    }

    public Vag withRootPwd(String rootPwd) {
        this.rootPwd = rootPwd;
        return this;
    }

    /**
     * root用户的密码
     * @return rootPwd
     */
    public String getRootPwd() {
        return rootPwd;
    }

    public void setRootPwd(String rootPwd) {
        this.rootPwd = rootPwd;
    }

    public Vag withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * vag操作状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vag withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 可用分区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Vag withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 255
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Vag withCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
        return this;
    }

    /**
     * 创建时间字符串
     * @return createTimeStr
     */
    public String getCreateTimeStr() {
        return createTimeStr;
    }

    public void setCreateTimeStr(String createTimeStr) {
        this.createTimeStr = createTimeStr;
    }

    public Vag withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * vag服务状态 NOT_USE：维护，ON_USE：启用，CANCELLATION：退服
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Vag withNumberOfOnlineUser(Long numberOfOnlineUser) {
        this.numberOfOnlineUser = numberOfOnlineUser;
        return this;
    }

    /**
     * 在线用户数
     * minimum: 0
     * maximum: 20000
     * @return numberOfOnlineUser
     */
    public Long getNumberOfOnlineUser() {
        return numberOfOnlineUser;
    }

    public void setNumberOfOnlineUser(Long numberOfOnlineUser) {
        this.numberOfOnlineUser = numberOfOnlineUser;
    }

    public Vag withRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * vag运行状态
     * @return runningStatus
     */
    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public Vag withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户侧domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public Vag withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * vag当前版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Vag withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * vag最新版本号。
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Vag withAccessEdgeVersion(String accessEdgeVersion) {
        this.accessEdgeVersion = accessEdgeVersion;
        return this;
    }

    /**
     * wksAccessEdge版本号
     * @return accessEdgeVersion
     */
    public String getAccessEdgeVersion() {
        return accessEdgeVersion;
    }

    public void setAccessEdgeVersion(String accessEdgeVersion) {
        this.accessEdgeVersion = accessEdgeVersion;
    }

    public Vag withTenantLock(Integer tenantLock) {
        this.tenantLock = tenantLock;
        return this;
    }

    /**
     * 项目是否被锁定 0是未锁定 1是锁定
     * minimum: 0
     * maximum: 1
     * @return tenantLock
     */
    public Integer getTenantLock() {
        return tenantLock;
    }

    public void setTenantLock(Integer tenantLock) {
        this.tenantLock = tenantLock;
    }

    public Vag withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * 资源池id
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public Vag withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * agent角色，如：vag,vap4down,vap4up,authConnector
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Vag withResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
        return this;
    }

    /**
     * 资源池类型，public,private
     * @return resourcePoolType
     */
    public String getResourcePoolType() {
        return resourcePoolType;
    }

    public void setResourcePoolType(String resourcePoolType) {
        this.resourcePoolType = resourcePoolType;
    }

    public Vag withEdgeSk(String edgeSk) {
        this.edgeSk = edgeSk;
        return this;
    }

    /**
     * 边缘sk
     * @return edgeSk
     */
    public String getEdgeSk() {
        return edgeSk;
    }

    public void setEdgeSk(String edgeSk) {
        this.edgeSk = edgeSk;
    }

    public Vag withHasHeartbeat(Boolean hasHeartbeat) {
        this.hasHeartbeat = hasHeartbeat;
        return this;
    }

    /**
     * 是否有心跳
     * @return hasHeartbeat
     */
    public Boolean getHasHeartbeat() {
        return hasHeartbeat;
    }

    public void setHasHeartbeat(Boolean hasHeartbeat) {
        this.hasHeartbeat = hasHeartbeat;
    }

    public Vag withUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * VAG负载个数
     * @return userCount
     */
    public Integer getUserCount() {
        return userCount;
    }

    public void setUserCount(Integer userCount) {
        this.userCount = userCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Vag that = (Vag) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.siteId, that.siteId) && Objects.equals(this.vagIp, that.vagIp)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.privateIpv6, that.privateIpv6)
            && Objects.equals(this.vagPortId, that.vagPortId) && Objects.equals(this.sshUser, that.sshUser)
            && Objects.equals(this.sshPwd, that.sshPwd) && Objects.equals(this.vmId, that.vmId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.internalIp, that.internalIp)
            && Objects.equals(this.internalIpv6, that.internalIpv6)
            && Objects.equals(this.internalPortId, that.internalPortId)
            && Objects.equals(this.externalIp, that.externalIp) && Objects.equals(this.externalId, that.externalId)
            && Objects.equals(this.rootUser, that.rootUser) && Objects.equals(this.rootPwd, that.rootPwd)
            && Objects.equals(this.status, that.status) && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeStr, that.createTimeStr) && Objects.equals(this.state, that.state)
            && Objects.equals(this.numberOfOnlineUser, that.numberOfOnlineUser)
            && Objects.equals(this.runningStatus, that.runningStatus) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.accessEdgeVersion, that.accessEdgeVersion)
            && Objects.equals(this.tenantLock, that.tenantLock)
            && Objects.equals(this.resourcePoolId, that.resourcePoolId) && Objects.equals(this.role, that.role)
            && Objects.equals(this.resourcePoolType, that.resourcePoolType) && Objects.equals(this.edgeSk, that.edgeSk)
            && Objects.equals(this.hasHeartbeat, that.hasHeartbeat) && Objects.equals(this.userCount, that.userCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            siteId,
            vagIp,
            privateIp,
            privateIpv6,
            vagPortId,
            sshUser,
            sshPwd,
            vmId,
            name,
            internalIp,
            internalIpv6,
            internalPortId,
            externalIp,
            externalId,
            rootUser,
            rootPwd,
            status,
            availabilityZone,
            createTime,
            createTimeStr,
            state,
            numberOfOnlineUser,
            runningStatus,
            domainId,
            version,
            latestVersion,
            accessEdgeVersion,
            tenantLock,
            resourcePoolId,
            role,
            resourcePoolType,
            edgeSk,
            hasHeartbeat,
            userCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Vag {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
        sb.append("    vagIp: ").append(toIndentedString(vagIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    privateIpv6: ").append(toIndentedString(privateIpv6)).append("\n");
        sb.append("    vagPortId: ").append(toIndentedString(vagPortId)).append("\n");
        sb.append("    sshUser: ").append(toIndentedString(sshUser)).append("\n");
        sb.append("    sshPwd: ").append(toIndentedString(sshPwd)).append("\n");
        sb.append("    vmId: ").append(toIndentedString(vmId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    internalIp: ").append(toIndentedString(internalIp)).append("\n");
        sb.append("    internalIpv6: ").append(toIndentedString(internalIpv6)).append("\n");
        sb.append("    internalPortId: ").append(toIndentedString(internalPortId)).append("\n");
        sb.append("    externalIp: ").append(toIndentedString(externalIp)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    rootUser: ").append(toIndentedString(rootUser)).append("\n");
        sb.append("    rootPwd: ").append(toIndentedString(rootPwd)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeStr: ").append(toIndentedString(createTimeStr)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    numberOfOnlineUser: ").append(toIndentedString(numberOfOnlineUser)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    accessEdgeVersion: ").append(toIndentedString(accessEdgeVersion)).append("\n");
        sb.append("    tenantLock: ").append(toIndentedString(tenantLock)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    resourcePoolType: ").append(toIndentedString(resourcePoolType)).append("\n");
        sb.append("    edgeSk: ").append(toIndentedString(edgeSk)).append("\n");
        sb.append("    hasHeartbeat: ").append(toIndentedString(hasHeartbeat)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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

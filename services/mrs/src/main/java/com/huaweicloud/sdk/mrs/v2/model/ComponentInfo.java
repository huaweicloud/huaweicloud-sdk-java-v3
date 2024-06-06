package com.huaweicloud.sdk.mrs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 组件实例信息。
 */
public class ComponentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_group_name")

    private String instanceGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_status")

    private String runningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_status")

    private String haStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_status")

    private String configStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_short_name")

    private String roleShortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_type")

    private String roleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_name")

    private String serviceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pair_name")

    private String pairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_pairs")

    private String relationPairs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_decom")

    private String supportDecom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_reinstall")

    private String supportReinstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_collect_stack_info")

    private String supportCollectStackInfo;

    public ComponentInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 组件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ComponentInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ComponentInfo withInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
        return this;
    }

    /**
     * 组件所在组名称。
     * @return instanceGroupName
     */
    public String getInstanceGroupName() {
        return instanceGroupName;
    }

    public void setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
    }

    public ComponentInfo withRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
        return this;
    }

    /**
     * 运行状态。
     * @return runningStatus
     */
    public String getRunningStatus() {
        return runningStatus;
    }

    public void setRunningStatus(String runningStatus) {
        this.runningStatus = runningStatus;
    }

    public ComponentInfo withHaStatus(String haStatus) {
        this.haStatus = haStatus;
        return this;
    }

    /**
     * HA状态。
     * @return haStatus
     */
    public String getHaStatus() {
        return haStatus;
    }

    public void setHaStatus(String haStatus) {
        this.haStatus = haStatus;
    }

    public ComponentInfo withConfigStatus(String configStatus) {
        this.configStatus = configStatus;
        return this;
    }

    /**
     * 配置状态。
     * @return configStatus
     */
    public String getConfigStatus() {
        return configStatus;
    }

    public void setConfigStatus(String configStatus) {
        this.configStatus = configStatus;
    }

    public ComponentInfo withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 角色。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public ComponentInfo withRoleShortName(String roleShortName) {
        this.roleShortName = roleShortName;
        return this;
    }

    /**
     * 角色缩写。
     * @return roleShortName
     */
    public String getRoleShortName() {
        return roleShortName;
    }

    public void setRoleShortName(String roleShortName) {
        this.roleShortName = roleShortName;
    }

    public ComponentInfo withRoleType(String roleType) {
        this.roleType = roleType;
        return this;
    }

    /**
     * 角色类型。
     * @return roleType
     */
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public ComponentInfo withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * 服务名。
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public ComponentInfo withPairName(String pairName) {
        this.pairName = pairName;
        return this;
    }

    /**
     * 对名。
     * @return pairName
     */
    public String getPairName() {
        return pairName;
    }

    public void setPairName(String pairName) {
        this.pairName = pairName;
    }

    public ComponentInfo withRelationPairs(String relationPairs) {
        this.relationPairs = relationPairs;
        return this;
    }

    /**
     * 关联对。
     * @return relationPairs
     */
    public String getRelationPairs() {
        return relationPairs;
    }

    public void setRelationPairs(String relationPairs) {
        this.relationPairs = relationPairs;
    }

    public ComponentInfo withSupportDecom(String supportDecom) {
        this.supportDecom = supportDecom;
        return this;
    }

    /**
     * 是否支持Decom。
     * @return supportDecom
     */
    public String getSupportDecom() {
        return supportDecom;
    }

    public void setSupportDecom(String supportDecom) {
        this.supportDecom = supportDecom;
    }

    public ComponentInfo withSupportReinstall(String supportReinstall) {
        this.supportReinstall = supportReinstall;
        return this;
    }

    /**
     * 是否支持重装。
     * @return supportReinstall
     */
    public String getSupportReinstall() {
        return supportReinstall;
    }

    public void setSupportReinstall(String supportReinstall) {
        this.supportReinstall = supportReinstall;
    }

    public ComponentInfo withSupportCollectStackInfo(String supportCollectStackInfo) {
        this.supportCollectStackInfo = supportCollectStackInfo;
        return this;
    }

    /**
     * 是否支持收集堆栈信息。
     * @return supportCollectStackInfo
     */
    public String getSupportCollectStackInfo() {
        return supportCollectStackInfo;
    }

    public void setSupportCollectStackInfo(String supportCollectStackInfo) {
        this.supportCollectStackInfo = supportCollectStackInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInfo that = (ComponentInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceGroupName, that.instanceGroupName)
            && Objects.equals(this.runningStatus, that.runningStatus) && Objects.equals(this.haStatus, that.haStatus)
            && Objects.equals(this.configStatus, that.configStatus) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleShortName, that.roleShortName) && Objects.equals(this.roleType, that.roleType)
            && Objects.equals(this.serviceName, that.serviceName) && Objects.equals(this.pairName, that.pairName)
            && Objects.equals(this.relationPairs, that.relationPairs)
            && Objects.equals(this.supportDecom, that.supportDecom)
            && Objects.equals(this.supportReinstall, that.supportReinstall)
            && Objects.equals(this.supportCollectStackInfo, that.supportCollectStackInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            instanceGroupName,
            runningStatus,
            haStatus,
            configStatus,
            roleName,
            roleShortName,
            roleType,
            serviceName,
            pairName,
            relationPairs,
            supportDecom,
            supportReinstall,
            supportCollectStackInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceGroupName: ").append(toIndentedString(instanceGroupName)).append("\n");
        sb.append("    runningStatus: ").append(toIndentedString(runningStatus)).append("\n");
        sb.append("    haStatus: ").append(toIndentedString(haStatus)).append("\n");
        sb.append("    configStatus: ").append(toIndentedString(configStatus)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleShortName: ").append(toIndentedString(roleShortName)).append("\n");
        sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    pairName: ").append(toIndentedString(pairName)).append("\n");
        sb.append("    relationPairs: ").append(toIndentedString(relationPairs)).append("\n");
        sb.append("    supportDecom: ").append(toIndentedString(supportDecom)).append("\n");
        sb.append("    supportReinstall: ").append(toIndentedString(supportReinstall)).append("\n");
        sb.append("    supportCollectStackInfo: ").append(toIndentedString(supportCollectStackInfo)).append("\n");
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

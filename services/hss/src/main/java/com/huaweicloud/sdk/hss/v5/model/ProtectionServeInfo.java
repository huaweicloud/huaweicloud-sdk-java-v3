package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProtectionServeInfo
 */
public class ProtectionServeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_status")

    private String raspStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_friendly_user")

    private Boolean isFriendlyUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_support_auto_attach")

    private Boolean agentSupportAutoAttach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_attach")

    private Boolean autoAttach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_event_num")

    private Long protectEventNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rasp_port")

    private Integer raspPort;

    public ProtectionServeInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public ProtectionServeInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ProtectionServeInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Agent版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ProtectionServeInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 服务器名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ProtectionServeInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 弹性ip地址
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ProtectionServeInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 私有ip
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public ProtectionServeInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**: 策略支持的操作系统 **约束限制**: 不涉及 **取值范围**: 包含如下：   - Windows : Windows系统   - Linux : Linux系统 **默认取值**: 不涉及
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ProtectionServeInfo withRaspStatus(String raspStatus) {
        this.raspStatus = raspStatus;
        return this;
    }

    /**
     * **参数解释**: 应用防护状态 **约束限制**: 不涉及 **取值范围**: 包含如下7种。 - app_install_processing：防护开启中。 - app_protected：防护成功。 - app_install_failed：防护失败（安装失败）。 - app_not_configure：未防护。 - app_partially_protected：部分防护。 - app_all_failed：防护失败。 - app_uninstall_processing：卸载中。 **默认取值**: 不涉及 
     * @return raspStatus
     */
    public String getRaspStatus() {
        return raspStatus;
    }

    public void setRaspStatus(String raspStatus) {
        this.raspStatus = raspStatus;
    }

    public ProtectionServeInfo withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 防护策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ProtectionServeInfo withIsFriendlyUser(Boolean isFriendlyUser) {
        this.isFriendlyUser = isFriendlyUser;
        return this;
    }

    /**
     * 是否为友好用户
     * @return isFriendlyUser
     */
    public Boolean getIsFriendlyUser() {
        return isFriendlyUser;
    }

    public void setIsFriendlyUser(Boolean isFriendlyUser) {
        this.isFriendlyUser = isFriendlyUser;
    }

    public ProtectionServeInfo withAgentSupportAutoAttach(Boolean agentSupportAutoAttach) {
        this.agentSupportAutoAttach = agentSupportAutoAttach;
        return this;
    }

    /**
     * agent是否支持动态加载
     * @return agentSupportAutoAttach
     */
    public Boolean getAgentSupportAutoAttach() {
        return agentSupportAutoAttach;
    }

    public void setAgentSupportAutoAttach(Boolean agentSupportAutoAttach) {
        this.agentSupportAutoAttach = agentSupportAutoAttach;
    }

    public ProtectionServeInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **约束限制**: 不涉及 **取值范围**: 包含如下6种。 - installed ：已安装。 - not_installed ：未安装。 - online ：在线。 - offline ：离线。 - install_failed ：安装失败。 - installing ：安装中。 **默认取值**: 不涉及 
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ProtectionServeInfo withAutoAttach(Boolean autoAttach) {
        this.autoAttach = autoAttach;
        return this;
    }

    /**
     * 动态加载是否开启
     * @return autoAttach
     */
    public Boolean getAutoAttach() {
        return autoAttach;
    }

    public void setAutoAttach(Boolean autoAttach) {
        this.autoAttach = autoAttach;
    }

    public ProtectionServeInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态 |- agent防护状态，包含如下2种。 - 0 ：关闭。 - 1 ：开启。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public ProtectionServeInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 服务器组ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ProtectionServeInfo withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 服务器组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ProtectionServeInfo withProtectEventNum(Long protectEventNum) {
        this.protectEventNum = protectEventNum;
        return this;
    }

    /**
     * 防护事件数
     * minimum: 0
     * maximum: 2097152
     * @return protectEventNum
     */
    public Long getProtectEventNum() {
        return protectEventNum;
    }

    public void setProtectEventNum(Long protectEventNum) {
        this.protectEventNum = protectEventNum;
    }

    public ProtectionServeInfo withRaspPort(Integer raspPort) {
        this.raspPort = raspPort;
        return this;
    }

    /**
     * RASP端口号
     * minimum: 0
     * maximum: 65536
     * @return raspPort
     */
    public Integer getRaspPort() {
        return raspPort;
    }

    public void setRaspPort(Integer raspPort) {
        this.raspPort = raspPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectionServeInfo that = (ProtectionServeInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.raspStatus, that.raspStatus)
            && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.isFriendlyUser, that.isFriendlyUser)
            && Objects.equals(this.agentSupportAutoAttach, that.agentSupportAutoAttach)
            && Objects.equals(this.agentStatus, that.agentStatus) && Objects.equals(this.autoAttach, that.autoAttach)
            && Objects.equals(this.protectStatus, that.protectStatus) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.protectEventNum, that.protectEventNum)
            && Objects.equals(this.raspPort, that.raspPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            agentId,
            agentVersion,
            hostName,
            publicIp,
            privateIp,
            osType,
            raspStatus,
            policyName,
            isFriendlyUser,
            agentSupportAutoAttach,
            agentStatus,
            autoAttach,
            protectStatus,
            groupId,
            groupName,
            protectEventNum,
            raspPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectionServeInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    raspStatus: ").append(toIndentedString(raspStatus)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    isFriendlyUser: ").append(toIndentedString(isFriendlyUser)).append("\n");
        sb.append("    agentSupportAutoAttach: ").append(toIndentedString(agentSupportAutoAttach)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    autoAttach: ").append(toIndentedString(autoAttach)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    protectEventNum: ").append(toIndentedString(protectEventNum)).append("\n");
        sb.append("    raspPort: ").append(toIndentedString(raspPort)).append("\n");
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

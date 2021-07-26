package com.huaweicloud.sdk.hss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Host
 */
public class Host  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_id")
    
    private String agentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_id")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_name")
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_ip")
    
    private String hostIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private String publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_name")
    
    private String groupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private Long expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="policy_group_name")
    
    private String policyGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_status")
    
    private String hostStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_status")
    
    private String agentStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protect_status")
    
    private String protectStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_image")
    
    private String osImage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_bit")
    
    private String osBit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detect_result")
    
    private String detectResult;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_port_num")
    
    private Integer riskPortNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_vul_num")
    
    private Integer riskVulNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_intrusion_num")
    
    private Integer riskIntrusionNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="risk_baseline_num")
    
    private Integer riskBaselineNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private String chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;

    public Host withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    


    /**
     * 云主机id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    

    public Host withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 云主机id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    

    public Host withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    


    /**
     * 云主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    

    public Host withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    


    /**
     * 云主机私有IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    

    public Host withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 云主机公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public Host withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    


    /**
     * 所属企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    

    public Host withGroupName(String groupName) {
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

    

    public Host withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * 服务到期时间
     * minimum: 0
     * maximum: 3857960855552
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    

    public Host withPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
        return this;
    }

    


    /**
     * 策略组名称
     * @return policyGroupName
     */
    public String getPolicyGroupName() {
        return policyGroupName;
    }

    public void setPolicyGroupName(String policyGroupName) {
        this.policyGroupName = policyGroupName;
    }

    

    public Host withHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * Agent状态，包含如下4种。   - ACTIVE ：正在运行。   - SHUTOFF ：关机。   - BUILDING ：创建中。   - ERROR ：故障。
     * @return hostStatus
     */
    public String getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    

    public Host withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    


    /**
     * Agent状态，包含如下3种。   - uninstall ：未注册。   - online ：在线。   - offline ：离线。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    

    public Host withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 主机开通的版本，包含如下5种输入。   - hss.version.null ：无。   - hss.version.basic ：基础版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public Host withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    


    /**
     * 防护状态，包含如下2种。 - closed ：关闭。 - opened ：开启。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    

    public Host withOsImage(String osImage) {
        this.osImage = osImage;
        return this;
    }

    


    /**
     * 系统镜像
     * @return osImage
     */
    public String getOsImage() {
        return osImage;
    }

    public void setOsImage(String osImage) {
        this.osImage = osImage;
    }

    

    public Host withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    

    public Host withOsBit(String osBit) {
        this.osBit = osBit;
        return this;
    }

    


    /**
     * 操作系统位数
     * @return osBit
     */
    public String getOsBit() {
        return osBit;
    }

    public void setOsBit(String osBit) {
        this.osBit = osBit;
    }

    

    public Host withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    


    /**
     * 云主机安全检测结果，包含如下3种。 - undetect ：未检测。 - clean ：无风险。 - risk ：有风险。
     * @return detectResult
     */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    

    public Host withRiskPortNum(Integer riskPortNum) {
        this.riskPortNum = riskPortNum;
        return this;
    }

    


    /**
     * 资产风险个数
     * minimum: 0
     * maximum: 2097152
     * @return riskPortNum
     */
    public Integer getRiskPortNum() {
        return riskPortNum;
    }

    public void setRiskPortNum(Integer riskPortNum) {
        this.riskPortNum = riskPortNum;
    }

    

    public Host withRiskVulNum(Integer riskVulNum) {
        this.riskVulNum = riskVulNum;
        return this;
    }

    


    /**
     * 漏洞风险个数
     * minimum: 0
     * maximum: 2097152
     * @return riskVulNum
     */
    public Integer getRiskVulNum() {
        return riskVulNum;
    }

    public void setRiskVulNum(Integer riskVulNum) {
        this.riskVulNum = riskVulNum;
    }

    

    public Host withRiskIntrusionNum(Integer riskIntrusionNum) {
        this.riskIntrusionNum = riskIntrusionNum;
        return this;
    }

    


    /**
     * 入侵风险个数
     * minimum: 0
     * maximum: 2097152
     * @return riskIntrusionNum
     */
    public Integer getRiskIntrusionNum() {
        return riskIntrusionNum;
    }

    public void setRiskIntrusionNum(Integer riskIntrusionNum) {
        this.riskIntrusionNum = riskIntrusionNum;
    }

    

    public Host withRiskBaselineNum(Integer riskBaselineNum) {
        this.riskBaselineNum = riskBaselineNum;
        return this;
    }

    


    /**
     * 基线风险个数
     * minimum: 0
     * maximum: 2097152
     * @return riskBaselineNum
     */
    public Integer getRiskBaselineNum() {
        return riskBaselineNum;
    }

    public void setRiskBaselineNum(Integer riskBaselineNum) {
        this.riskBaselineNum = riskBaselineNum;
    }

    

    public Host withChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * 收费模式，包含如下2种。   - packet_cycle ：包年/包月。   - on_demand ：按需。
     * @return chargingMode
     */
    public String getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(String chargingMode) {
        this.chargingMode = chargingMode;
    }

    

    public Host withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 云服务资源实例ID（UUID）
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Host host = (Host) o;
        return Objects.equals(this.agentId, host.agentId) &&
            Objects.equals(this.hostId, host.hostId) &&
            Objects.equals(this.hostName, host.hostName) &&
            Objects.equals(this.hostIp, host.hostIp) &&
            Objects.equals(this.publicIp, host.publicIp) &&
            Objects.equals(this.enterpriseProjectName, host.enterpriseProjectName) &&
            Objects.equals(this.groupName, host.groupName) &&
            Objects.equals(this.expireTime, host.expireTime) &&
            Objects.equals(this.policyGroupName, host.policyGroupName) &&
            Objects.equals(this.hostStatus, host.hostStatus) &&
            Objects.equals(this.agentStatus, host.agentStatus) &&
            Objects.equals(this.version, host.version) &&
            Objects.equals(this.protectStatus, host.protectStatus) &&
            Objects.equals(this.osImage, host.osImage) &&
            Objects.equals(this.osType, host.osType) &&
            Objects.equals(this.osBit, host.osBit) &&
            Objects.equals(this.detectResult, host.detectResult) &&
            Objects.equals(this.riskPortNum, host.riskPortNum) &&
            Objects.equals(this.riskVulNum, host.riskVulNum) &&
            Objects.equals(this.riskIntrusionNum, host.riskIntrusionNum) &&
            Objects.equals(this.riskBaselineNum, host.riskBaselineNum) &&
            Objects.equals(this.chargingMode, host.chargingMode) &&
            Objects.equals(this.resourceId, host.resourceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agentId, hostId, hostName, hostIp, publicIp, enterpriseProjectName, groupName, expireTime, policyGroupName, hostStatus, agentStatus, version, protectStatus, osImage, osType, osBit, detectResult, riskPortNum, riskVulNum, riskIntrusionNum, riskBaselineNum, chargingMode, resourceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Host {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    policyGroupName: ").append(toIndentedString(policyGroupName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    osImage: ").append(toIndentedString(osImage)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osBit: ").append(toIndentedString(osBit)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    riskPortNum: ").append(toIndentedString(riskPortNum)).append("\n");
        sb.append("    riskVulNum: ").append(toIndentedString(riskVulNum)).append("\n");
        sb.append("    riskIntrusionNum: ").append(toIndentedString(riskIntrusionNum)).append("\n");
        sb.append("    riskBaselineNum: ").append(toIndentedString(riskBaselineNum)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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


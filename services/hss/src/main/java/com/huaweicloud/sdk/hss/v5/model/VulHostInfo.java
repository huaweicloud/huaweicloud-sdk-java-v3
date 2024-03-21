package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 软件漏洞列表
 */
public class VulHostInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_num")

    private Integer cveNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id_list")

    private List<String> cveIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_cmd")

    private String repairCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_affect_business")

    private Boolean isAffectBusiness;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_restore")

    private Boolean supportRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled_operate_types")

    private List<VulHostInfoDisabledOperateTypes> disabledOperateTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private String repairPriority;

    public VulHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 受漏洞影响的服务器id
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public VulHostInfo withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 危险程度   - Critical : 漏洞cvss评分大于等于9；对应控制台页面的高危   - High : 漏洞cvss评分大于等于7，小于9；对应控制台页面的中危   - Medium : 漏洞cvss评分大于等于4，小于7；对应控制台页面的中危   - Low : 漏洞cvss评分小于4；对应控制台页面的低危
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public VulHostInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 受影响主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulHostInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 受影响主机ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public VulHostInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 主机对应的Agent ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public VulHostInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 主机绑定的配额版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VulHostInfo withCveNum(Integer cveNum) {
        this.cveNum = cveNum;
        return this;
    }

    /**
     * 漏洞cve总数
     * minimum: 0
     * maximum: 10000
     * @return cveNum
     */
    public Integer getCveNum() {
        return cveNum;
    }

    public void setCveNum(Integer cveNum) {
        this.cveNum = cveNum;
    }

    public VulHostInfo withCveIdList(List<String> cveIdList) {
        this.cveIdList = cveIdList;
        return this;
    }

    public VulHostInfo addCveIdListItem(String cveIdListItem) {
        if (this.cveIdList == null) {
            this.cveIdList = new ArrayList<>();
        }
        this.cveIdList.add(cveIdListItem);
        return this;
    }

    public VulHostInfo withCveIdList(Consumer<List<String>> cveIdListSetter) {
        if (this.cveIdList == null) {
            this.cveIdList = new ArrayList<>();
        }
        cveIdListSetter.accept(this.cveIdList);
        return this;
    }

    /**
     * 漏洞对应的cve id列表
     * @return cveIdList
     */
    public List<String> getCveIdList() {
        return cveIdList;
    }

    public void setCveIdList(List<String> cveIdList) {
        this.cveIdList = cveIdList;
    }

    public VulHostInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 漏洞状态   - vul_status_unfix : 未处理   - vul_status_ignored : 已忽略   - vul_status_verified : 验证中   - vul_status_fixing : 修复中   - vul_status_fixed : 修复成功   - vul_status_reboot : 修复成功待重启   - vul_status_failed : 修复失败   - vul_status_fix_after_reboot : 请重启主机再次修复
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulHostInfo withRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
        return this;
    }

    /**
     * 修复漏洞需要执行的命令行（只有Linux漏洞有该字段）
     * @return repairCmd
     */
    public String getRepairCmd() {
        return repairCmd;
    }

    public void setRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
    }

    public VulHostInfo withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * 应用软件的路径（只有应用漏洞有该字段）
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public VulHostInfo withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 地域
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public VulHostInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 服务器公网ip
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public VulHostInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * 服务器私网ip
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public VulHostInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 服务器组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public VulHostInfo withGroupName(String groupName) {
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

    public VulHostInfo withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public VulHostInfo withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * 资产重要性，包含如下3种   - important ：重要资产   - common ：一般资产   - test ：测试资产
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public VulHostInfo withIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
        return this;
    }

    /**
     * 是否影响业务
     * @return isAffectBusiness
     */
    public Boolean getIsAffectBusiness() {
        return isAffectBusiness;
    }

    public void setIsAffectBusiness(Boolean isAffectBusiness) {
        this.isAffectBusiness = isAffectBusiness;
    }

    public VulHostInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * 首次扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public VulHostInfo withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * 扫描时间，时间戳单位：毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public VulHostInfo withSupportRestore(Boolean supportRestore) {
        this.supportRestore = supportRestore;
        return this;
    }

    /**
     * 是否可以回滚到修复漏洞时创建的备份
     * @return supportRestore
     */
    public Boolean getSupportRestore() {
        return supportRestore;
    }

    public void setSupportRestore(Boolean supportRestore) {
        this.supportRestore = supportRestore;
    }

    public VulHostInfo withDisabledOperateTypes(List<VulHostInfoDisabledOperateTypes> disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
        return this;
    }

    public VulHostInfo addDisabledOperateTypesItem(VulHostInfoDisabledOperateTypes disabledOperateTypesItem) {
        if (this.disabledOperateTypes == null) {
            this.disabledOperateTypes = new ArrayList<>();
        }
        this.disabledOperateTypes.add(disabledOperateTypesItem);
        return this;
    }

    public VulHostInfo withDisabledOperateTypes(
        Consumer<List<VulHostInfoDisabledOperateTypes>> disabledOperateTypesSetter) {
        if (this.disabledOperateTypes == null) {
            this.disabledOperateTypes = new ArrayList<>();
        }
        disabledOperateTypesSetter.accept(this.disabledOperateTypes);
        return this;
    }

    /**
     * 漏洞在当前主机上不可进行的操作类型列表
     * @return disabledOperateTypes
     */
    public List<VulHostInfoDisabledOperateTypes> getDisabledOperateTypes() {
        return disabledOperateTypes;
    }

    public void setDisabledOperateTypes(List<VulHostInfoDisabledOperateTypes> disabledOperateTypes) {
        this.disabledOperateTypes = disabledOperateTypes;
    }

    public VulHostInfo withRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * 修复优先级,包含如下  - Critical 紧急  - High 高  - Medium 中  - Low 低
     * @return repairPriority
     */
    public String getRepairPriority() {
        return repairPriority;
    }

    public void setRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostInfo that = (VulHostInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.agentId, that.agentId) && Objects.equals(this.version, that.version)
            && Objects.equals(this.cveNum, that.cveNum) && Objects.equals(this.cveIdList, that.cveIdList)
            && Objects.equals(this.status, that.status) && Objects.equals(this.repairCmd, that.repairCmd)
            && Objects.equals(this.appPath, that.appPath) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.isAffectBusiness, that.isAffectBusiness)
            && Objects.equals(this.firstScanTime, that.firstScanTime) && Objects.equals(this.scanTime, that.scanTime)
            && Objects.equals(this.supportRestore, that.supportRestore)
            && Objects.equals(this.disabledOperateTypes, that.disabledOperateTypes)
            && Objects.equals(this.repairPriority, that.repairPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            severityLevel,
            hostName,
            hostIp,
            agentId,
            version,
            cveNum,
            cveIdList,
            status,
            repairCmd,
            appPath,
            regionName,
            publicIp,
            privateIp,
            groupId,
            groupName,
            osType,
            assetValue,
            isAffectBusiness,
            firstScanTime,
            scanTime,
            supportRestore,
            disabledOperateTypes,
            repairPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    cveNum: ").append(toIndentedString(cveNum)).append("\n");
        sb.append("    cveIdList: ").append(toIndentedString(cveIdList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repairCmd: ").append(toIndentedString(repairCmd)).append("\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    isAffectBusiness: ").append(toIndentedString(isAffectBusiness)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    supportRestore: ").append(toIndentedString(supportRestore)).append("\n");
        sb.append("    disabledOperateTypes: ").append(toIndentedString(disabledOperateTypes)).append("\n");
        sb.append("    repairPriority: ").append(toIndentedString(repairPriority)).append("\n");
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

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

    public VulHostInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机id
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
     * 危险程度   - Critical : 高危   - High : 中危   - Medium : 中危   - Low : 低危
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
     * 受影响资产名称
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
     * 受影响资产ip
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public VulHostInfo withCveNum(Integer cveNum) {
        this.cveNum = cveNum;
        return this;
    }

    /**
     * 漏洞cve数
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
     * cve列表
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
     * 修复命令行
     * @return repairCmd
     */
    public String getRepairCmd() {
        return repairCmd;
    }

    public void setRepairCmd(String repairCmd) {
        this.repairCmd = repairCmd;
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
            && Objects.equals(this.cveNum, that.cveNum) && Objects.equals(this.cveIdList, that.cveIdList)
            && Objects.equals(this.status, that.status) && Objects.equals(this.repairCmd, that.repairCmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, severityLevel, hostName, hostIp, cveNum, cveIdList, status, repairCmd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    cveNum: ").append(toIndentedString(cveNum)).append("\n");
        sb.append("    cveIdList: ").append(toIndentedString(cveIdList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    repairCmd: ").append(toIndentedString(repairCmd)).append("\n");
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

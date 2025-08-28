package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulReportRequestBody
 */
public class VulReportRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_status")

    private String handleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public VulReportRequestBody withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 资产重要性 **约束限制**: 不涉及 **取值范围**: - important：重要资产。 - common：一般资产。 - test：测试资产。  **默认取值**: 不涉及 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public VulReportRequestBody withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 服务器组名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位 **默认取值**： 不涉及 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public VulReportRequestBody withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public VulReportRequestBody addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public VulReportRequestBody withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**： 服务器ID列表 **约束限制**： 不涉及 **取值范围**： 0-100个items **默认取值**： 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public VulReportRequestBody withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 主机名称 **约束限制**： 不涉及 **取值范围**： 字符长度1-64位 **默认取值**： 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public VulReportRequestBody withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**： 主机ip **约束限制**： 不涉及 **取值范围**： 字符长度0-128位 **默认取值**： 不涉及 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public VulReportRequestBody withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * **参数解释**: 漏洞风险等级 **约束限制**: 不涉及 **取值范围**: - High：高。 - Medium：中等。 - Low：低。 - Security：安全。  **默认取值**: 不涉及 
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public VulReportRequestBody withHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
        return this;
    }

    /**
     * **参数解释**: 处置状态 **约束限制**: 不涉及 **取值范围**: - unhandled：未处理。 - handled：已处理。  **默认取值**: 不涉及 
     * @return handleStatus
     */
    public String getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(String handleStatus) {
        this.handleStatus = handleStatus;
    }

    public VulReportRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 主机的漏洞状态 **约束限制**: 不涉及 **取值范围**: - vul_status_unfix：未处理。 - vul_status_ignored：已忽略。 - vul_status_verified：验证中。 - vul_status_fixing：修复中。 - vul_status_fixed：已修复。 - vul_status_reboot：修复待重启。 - vul_status_failed：修复失败。 - vul_status_fix_after_reboot：请重启主机再次修复。  **默认取值**: 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulReportRequestBody that = (VulReportRequestBody) obj;
        return Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.hostIds, that.hostIds) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIp, that.hostIp) && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.handleStatus, that.handleStatus) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assetValue, groupName, hostIds, hostName, hostIp, severityLevel, handleStatus, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulReportRequestBody {\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    handleStatus: ").append(toIndentedString(handleStatus)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowVulScanTaskEstimatedTimeRequestInfo
 */
public class ShowVulScanTaskEstimatedTimeRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manual_scan_type")

    private List<String> manualScanType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_type")

    private String rangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_ids")

    private List<String> agentIds = null;

    public ShowVulScanTaskEstimatedTimeRequestInfo withManualScanType(List<String> manualScanType) {
        this.manualScanType = manualScanType;
        return this;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo addManualScanTypeItem(String manualScanTypeItem) {
        if (this.manualScanType == null) {
            this.manualScanType = new ArrayList<>();
        }
        this.manualScanType.add(manualScanTypeItem);
        return this;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo withManualScanType(Consumer<List<String>> manualScanTypeSetter) {
        if (this.manualScanType == null) {
            this.manualScanType = new ArrayList<>();
        }
        manualScanTypeSetter.accept(this.manualScanType);
        return this;
    }

    /**
     * **参数解释**: 漏洞手动检测类型 **约束限制**: 不涉及 **取值范围**: - linux_vul：linux漏洞 - windows_vul：windows漏洞 - web_cms - app_vul - urgent_vul  **默认取值**: 不涉及 
     * @return manualScanType
     */
    public List<String> getManualScanType() {
        return manualScanType;
    }

    public void setManualScanType(List<String> manualScanType) {
        this.manualScanType = manualScanType;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo withRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    /**
     * **参数解释**: 检测的主机范围 **约束限制**: 不涉及 **取值范围**: - all_host：全部主机 - specific_host：部分主机  **默认取值**: 不涉及 
     * @return rangeType
     */
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo withAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
        return this;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo addAgentIdsItem(String agentIdsItem) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        this.agentIds.add(agentIdsItem);
        return this;
    }

    public ShowVulScanTaskEstimatedTimeRequestInfo withAgentIds(Consumer<List<String>> agentIdsSetter) {
        if (this.agentIds == null) {
            this.agentIds = new ArrayList<>();
        }
        agentIdsSetter.accept(this.agentIds);
        return this;
    }

    /**
     * **参数解释**: 待检测的agent列表 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return agentIds
     */
    public List<String> getAgentIds() {
        return agentIds;
    }

    public void setAgentIds(List<String> agentIds) {
        this.agentIds = agentIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVulScanTaskEstimatedTimeRequestInfo that = (ShowVulScanTaskEstimatedTimeRequestInfo) obj;
        return Objects.equals(this.manualScanType, that.manualScanType)
            && Objects.equals(this.rangeType, that.rangeType) && Objects.equals(this.agentIds, that.agentIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualScanType, rangeType, agentIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVulScanTaskEstimatedTimeRequestInfo {\n");
        sb.append("    manualScanType: ").append(toIndentedString(manualScanType)).append("\n");
        sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
        sb.append("    agentIds: ").append(toIndentedString(agentIds)).append("\n");
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

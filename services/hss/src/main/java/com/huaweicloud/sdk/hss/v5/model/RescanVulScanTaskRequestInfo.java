package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RescanVulScanTaskRequestInfo
 */
public class RescanVulScanTaskRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "range_type")

    private String rangeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    public RescanVulScanTaskRequestInfo withRangeType(String rangeType) {
        this.rangeType = rangeType;
        return this;
    }

    /**
     * **参数解释**: 重新扫描的主机范围 **约束限制**: 不涉及 **取值范围**: - all_failed_host：当前任务下所有扫描失败的主机 - specific_host：指定主机  **默认取值**: 不涉及 
     * @return rangeType
     */
    public String getRangeType() {
        return rangeType;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public RescanVulScanTaskRequestInfo withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public RescanVulScanTaskRequestInfo addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public RescanVulScanTaskRequestInfo withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**: 主机ID列表 **约束限制**: range_type值为“specific_host”时有效 **取值范围**: 最少1条，最多1000条  **默认取值**: 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RescanVulScanTaskRequestInfo that = (RescanVulScanTaskRequestInfo) obj;
        return Objects.equals(this.rangeType, that.rangeType) && Objects.equals(this.hostIds, that.hostIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rangeType, hostIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RescanVulScanTaskRequestInfo {\n");
        sb.append("    rangeType: ").append(toIndentedString(rangeType)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
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

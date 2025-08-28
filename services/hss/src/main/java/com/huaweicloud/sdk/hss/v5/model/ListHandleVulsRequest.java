package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHandleVulsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_name")

    private String vulName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cve_id")

    private String cveId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label_list")

    private String labelList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private String assetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "handle_circle")

    private String handleCircle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_priority")

    private String repairPriority;

    public ListHandleVulsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHandleVulsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHandleVulsRequest withVulName(String vulName) {
        this.vulName = vulName;
        return this;
    }

    /**
     * **参数解释**: 漏洞名称 **约束限制**: 不涉及 **取值范围**: 字符长度0-256位 **默认取值**: 不涉及 
     * @return vulName
     */
    public String getVulName() {
        return vulName;
    }

    public void setVulName(String vulName) {
        this.vulName = vulName;
    }

    public ListHandleVulsRequest withCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * **参数解释**: 漏洞cve编号 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return cveId
     */
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public ListHandleVulsRequest withLabelList(String labelList) {
        this.labelList = labelList;
        return this;
    }

    /**
     * **参数解释**: 漏洞标签 **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return labelList
     */
    public String getLabelList() {
        return labelList;
    }

    public void setLabelList(String labelList) {
        this.labelList = labelList;
    }

    public ListHandleVulsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 漏洞状态 **约束限制**： 不涉及 **取值范围**： - vul_status_ignored: 已忽略。 - vul_status_fixed: 修复成功。  **默认取值**： 不涉及 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListHandleVulsRequest withAssetValue(String assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**： 资产重要性 **约束限制**: 不涉及 **取值范围**: - important：重要资产。 - common：一般资产。 - test：测试资产。  **默认取值**: 不涉及 
     * @return assetValue
     */
    public String getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(String assetValue) {
        this.assetValue = assetValue;
    }

    public ListHandleVulsRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**: 服务器组名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ListHandleVulsRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 主机名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128位 **默认取值**: 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListHandleVulsRequest withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 主机ip **约束限制**: 不涉及 **取值范围**: 字符长度0-128位 **默认取值**: 不涉及 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public ListHandleVulsRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 漏洞类型 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListHandleVulsRequest withHandleCircle(String handleCircle) {
        this.handleCircle = handleCircle;
        return this;
    }

    /**
     * **参数解释**： 处理周期 **约束限制**: 不涉及 **取值范围**: - today：今日处理。 - all：累计处理。  **默认取值**: 不涉及 
     * @return handleCircle
     */
    public String getHandleCircle() {
        return handleCircle;
    }

    public void setHandleCircle(String handleCircle) {
        this.handleCircle = handleCircle;
    }

    public ListHandleVulsRequest withRepairPriority(String repairPriority) {
        this.repairPriority = repairPriority;
        return this;
    }

    /**
     * **参数解释**： 修复优先级 **约束限制**: 不涉及 **取值范围**: - Critical：紧急。 - High：高。 - Medium：中。 - Low：低。  **默认取值**: 不涉及 
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
        ListHandleVulsRequest that = (ListHandleVulsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.vulName, that.vulName) && Objects.equals(this.cveId, that.cveId)
            && Objects.equals(this.labelList, that.labelList) && Objects.equals(this.status, that.status)
            && Objects.equals(this.assetValue, that.assetValue) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.type, that.type) && Objects.equals(this.handleCircle, that.handleCircle)
            && Objects.equals(this.repairPriority, that.repairPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            vulName,
            cveId,
            labelList,
            status,
            assetValue,
            groupName,
            hostName,
            hostIp,
            type,
            handleCircle,
            repairPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHandleVulsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    vulName: ").append(toIndentedString(vulName)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    labelList: ").append(toIndentedString(labelList)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    handleCircle: ").append(toIndentedString(handleCircle)).append("\n");
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

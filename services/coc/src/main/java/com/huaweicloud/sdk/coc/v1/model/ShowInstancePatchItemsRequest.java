package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowInstancePatchItemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_compliant_id")

    private String instanceCompliantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_status")

    private String patchStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private String classification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_level")

    private String complianceLevel;

    public ShowInstancePatchItemsRequest withInstanceCompliantId(String instanceCompliantId) {
        this.instanceCompliantId = instanceCompliantId;
        return this;
    }

    /**
     * 合规性报告id
     * @return instanceCompliantId
     */
    public String getInstanceCompliantId() {
        return instanceCompliantId;
    }

    public void setInstanceCompliantId(String instanceCompliantId) {
        this.instanceCompliantId = instanceCompliantId;
    }

    public ShowInstancePatchItemsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowInstancePatchItemsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowInstancePatchItemsRequest withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 补丁名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowInstancePatchItemsRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序 - asc：升序 - desc：降序
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ShowInstancePatchItemsRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序字段 -installed_time：补丁安装时间
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ShowInstancePatchItemsRequest withPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
        return this;
    }

    /**
     * 补丁状态 INSTALLED：已安装 INSTALLED_OTHER：已安装其他 MISSING：缺失 REJECT：拒绝 FAILED：失败 PENDING_REBOOT：已安装待重启
     * @return patchStatus
     */
    public String getPatchStatus() {
        return patchStatus;
    }

    public void setPatchStatus(String patchStatus) {
        this.patchStatus = patchStatus;
    }

    public ShowInstancePatchItemsRequest withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * 分类
     * @return classification
     */
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public ShowInstancePatchItemsRequest withSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
        return this;
    }

    /**
     * 严重性级别
     * @return severityLevel
     */
    public String getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(String severityLevel) {
        this.severityLevel = severityLevel;
    }

    public ShowInstancePatchItemsRequest withComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    /**
     * 合规性级别
     * @return complianceLevel
     */
    public String getComplianceLevel() {
        return complianceLevel;
    }

    public void setComplianceLevel(String complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstancePatchItemsRequest that = (ShowInstancePatchItemsRequest) obj;
        return Objects.equals(this.instanceCompliantId, that.instanceCompliantId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.title, that.title) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.patchStatus, that.patchStatus)
            && Objects.equals(this.classification, that.classification)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.complianceLevel, that.complianceLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceCompliantId,
            offset,
            limit,
            title,
            sortDir,
            sortKey,
            patchStatus,
            classification,
            severityLevel,
            complianceLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstancePatchItemsRequest {\n");
        sb.append("    instanceCompliantId: ").append(toIndentedString(instanceCompliantId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    patchStatus: ").append(toIndentedString(patchStatus)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
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

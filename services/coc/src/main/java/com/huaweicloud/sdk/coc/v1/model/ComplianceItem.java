package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ComplianceItem
 */
public class ComplianceItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private String classification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_level")

    private String severityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_level")

    private String complianceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "patch_detail")

    private PatchDetail patchDetail;

    public ComplianceItem withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 节点id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ComplianceItem withTitle(String title) {
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

    public ComplianceItem withClassification(String classification) {
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

    public ComplianceItem withSeverityLevel(String severityLevel) {
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

    public ComplianceItem withComplianceLevel(String complianceLevel) {
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

    public ComplianceItem withPatchDetail(PatchDetail patchDetail) {
        this.patchDetail = patchDetail;
        return this;
    }

    public ComplianceItem withPatchDetail(Consumer<PatchDetail> patchDetailSetter) {
        if (this.patchDetail == null) {
            this.patchDetail = new PatchDetail();
            patchDetailSetter.accept(this.patchDetail);
        }

        return this;
    }

    /**
     * Get patchDetail
     * @return patchDetail
     */
    public PatchDetail getPatchDetail() {
        return patchDetail;
    }

    public void setPatchDetail(PatchDetail patchDetail) {
        this.patchDetail = patchDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplianceItem that = (ComplianceItem) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.title, that.title)
            && Objects.equals(this.classification, that.classification)
            && Objects.equals(this.severityLevel, that.severityLevel)
            && Objects.equals(this.complianceLevel, that.complianceLevel)
            && Objects.equals(this.patchDetail, that.patchDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, title, classification, severityLevel, complianceLevel, patchDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComplianceItem {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    severityLevel: ").append(toIndentedString(severityLevel)).append("\n");
        sb.append("    complianceLevel: ").append(toIndentedString(complianceLevel)).append("\n");
        sb.append("    patchDetail: ").append(toIndentedString(patchDetail)).append("\n");
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

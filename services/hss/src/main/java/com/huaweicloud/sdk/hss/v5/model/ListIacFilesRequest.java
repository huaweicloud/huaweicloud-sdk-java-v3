package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListIacFilesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_type")

    private String fileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky")

    private Boolean risky;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id")

    private String cicdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    public ListIacFilesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListIacFilesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 不涉及 
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

    public ListIacFilesRequest withLimit(Integer limit) {
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

    public ListIacFilesRequest withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**: 扫描方式 **约束限制**: 不涉及 **取值范围**: - manual_scan：手动扫描 - cicd_scan：cicd扫描 **默认取值**: 不涉及 
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public ListIacFilesRequest withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * **参数解释**: 文件ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64  **默认取值**: 不涉及 
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ListIacFilesRequest withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 文件名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-512  **默认取值**: 不涉及 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListIacFilesRequest withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释**: 文件类型 **约束限制**: 不涉及 **取值范围**: - dockerfile：Dockerfile文件 - k8s_yaml：k8s yaml文件  **默认取值**: 不涉及 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ListIacFilesRequest withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * **参数解释**: 是否有风险 **约束限制**: 不涉及 **取值范围**: - true：有风险 - false：无风险  **默认取值**: 不涉及 
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ListIacFilesRequest withCicdId(String cicdId) {
        this.cicdId = cicdId;
        return this;
    }

    /**
     * **约束限制**: 不涉及 **取值范围**: 字符长度1-128 **默认取值**: 不涉及 
     * @return cicdId
     */
    public String getCicdId() {
        return cicdId;
    }

    public void setCicdId(String cicdId) {
        this.cicdId = cicdId;
    }

    public ListIacFilesRequest withCicdName(String cicdName) {
        this.cicdName = cicdName;
        return this;
    }

    /**
     * **参数解释**: CI/CD名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-128 **默认取值**: 不涉及 
     * @return cicdName
     */
    public String getCicdName() {
        return cicdName;
    }

    public void setCicdName(String cicdName) {
        this.cicdName = cicdName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIacFilesRequest that = (ListIacFilesRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.scanType, that.scanType) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.fileType, that.fileType)
            && Objects.equals(this.risky, that.risky) && Objects.equals(this.cicdId, that.cicdId)
            && Objects.equals(this.cicdName, that.cicdName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(enterpriseProjectId, offset, limit, scanType, fileId, fileName, fileType, risky, cicdId, cicdName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIacFilesRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    cicdId: ").append(toIndentedString(cicdId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
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

package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListIacFilesResponseInfoDataList
 */
public class ListIacFilesResponseInfoDataList {

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
    @JsonProperty(value = "risk_num")

    private Integer riskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_scan_time")

    private Long lastScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_file_time")

    private Long uploadFileTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_id")

    private String cicdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cicd_name")

    private String cicdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    public ListIacFilesResponseInfoDataList withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * **参数解释**: 文件ID **约束限制**: 不涉及 **取值范围**: 字符长度1-64 **默认取值**: 不涉及 
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public ListIacFilesResponseInfoDataList withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 文件名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-512 **默认取值**: 不涉及 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ListIacFilesResponseInfoDataList withFileType(String fileType) {
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

    public ListIacFilesResponseInfoDataList withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * **参数解释**: 是否有风险 **约束限制**: 不涉及 **取值范围**: - true：有风险 - false：无风险 **默认取值**: 不涉及 
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public ListIacFilesResponseInfoDataList withRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
        return this;
    }

    /**
     * 风险项数量
     * minimum: 0
     * maximum: 2147483647
     * @return riskNum
     */
    public Integer getRiskNum() {
        return riskNum;
    }

    public void setRiskNum(Integer riskNum) {
        this.riskNum = riskNum;
    }

    public ListIacFilesResponseInfoDataList withFirstScanTime(Long firstScanTime) {
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

    public ListIacFilesResponseInfoDataList withLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
        return this;
    }

    /**
     * 最近扫描时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastScanTime
     */
    public Long getLastScanTime() {
        return lastScanTime;
    }

    public void setLastScanTime(Long lastScanTime) {
        this.lastScanTime = lastScanTime;
    }

    public ListIacFilesResponseInfoDataList withUploadFileTime(Long uploadFileTime) {
        this.uploadFileTime = uploadFileTime;
        return this;
    }

    /**
     * 上传文件时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return uploadFileTime
     */
    public Long getUploadFileTime() {
        return uploadFileTime;
    }

    public void setUploadFileTime(Long uploadFileTime) {
        this.uploadFileTime = uploadFileTime;
    }

    public ListIacFilesResponseInfoDataList withCicdId(String cicdId) {
        this.cicdId = cicdId;
        return this;
    }

    /**
     * **参数解释**: cicd标识 **约束限制**: 不涉及 **取值范围**: 字符长度1-128 **默认取值**: 不涉及 
     * @return cicdId
     */
    public String getCicdId() {
        return cicdId;
    }

    public void setCicdId(String cicdId) {
        this.cicdId = cicdId;
    }

    public ListIacFilesResponseInfoDataList withCicdName(String cicdName) {
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

    public ListIacFilesResponseInfoDataList withScanType(String scanType) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListIacFilesResponseInfoDataList that = (ListIacFilesResponseInfoDataList) obj;
        return Objects.equals(this.fileId, that.fileId) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.risky, that.risky)
            && Objects.equals(this.riskNum, that.riskNum) && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.lastScanTime, that.lastScanTime)
            && Objects.equals(this.uploadFileTime, that.uploadFileTime) && Objects.equals(this.cicdId, that.cicdId)
            && Objects.equals(this.cicdName, that.cicdName) && Objects.equals(this.scanType, that.scanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileId,
            fileName,
            fileType,
            risky,
            riskNum,
            firstScanTime,
            lastScanTime,
            uploadFileTime,
            cicdId,
            cicdName,
            scanType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIacFilesResponseInfoDataList {\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
        sb.append("    riskNum: ").append(toIndentedString(riskNum)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    lastScanTime: ").append(toIndentedString(lastScanTime)).append("\n");
        sb.append("    uploadFileTime: ").append(toIndentedString(uploadFileTime)).append("\n");
        sb.append("    cicdId: ").append(toIndentedString(cicdId)).append("\n");
        sb.append("    cicdName: ").append(toIndentedString(cicdName)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
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

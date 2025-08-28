package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IaC风险筛选条件
 */
public class IacRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id_list")

    private List<String> fileIdList = null;

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
    @JsonProperty(value = "scan_type")

    private String scanType;

    public IacRequestInfo withFileIdList(List<String> fileIdList) {
        this.fileIdList = fileIdList;
        return this;
    }

    public IacRequestInfo addFileIdListItem(String fileIdListItem) {
        if (this.fileIdList == null) {
            this.fileIdList = new ArrayList<>();
        }
        this.fileIdList.add(fileIdListItem);
        return this;
    }

    public IacRequestInfo withFileIdList(Consumer<List<String>> fileIdListSetter) {
        if (this.fileIdList == null) {
            this.fileIdList = new ArrayList<>();
        }
        fileIdListSetter.accept(this.fileIdList);
        return this;
    }

    /**
     * **参数解释**: IaC文件ID列表 **约束限制**: 不涉及 **取值范围**: 1-200个items **默认取值**: 不涉及 
     * @return fileIdList
     */
    public List<String> getFileIdList() {
        return fileIdList;
    }

    public void setFileIdList(List<String> fileIdList) {
        this.fileIdList = fileIdList;
    }

    public IacRequestInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 文件名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-64 **默认取值**: 不涉及 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public IacRequestInfo withFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    /**
     * **参数解释**: 文件类型 **约束限制**: 不涉及 **取值范围**: - dockerfile：Dockerfile文件。 - k8s_yaml：k8s yaml文件。  **默认取值**: 不涉及 
     * @return fileType
     */
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public IacRequestInfo withRisky(Boolean risky) {
        this.risky = risky;
        return this;
    }

    /**
     * **参数解释**: 是否有风险 **约束限制**: 不涉及 **取值范围**: - true：有风险。 - false：无风险。  **默认取值**: 不涉及 
     * @return risky
     */
    public Boolean getRisky() {
        return risky;
    }

    public void setRisky(Boolean risky) {
        this.risky = risky;
    }

    public IacRequestInfo withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * **参数解释**: 扫描方式 **约束限制**: 不涉及 **取值范围**: - manual_scan：手动扫描。 - cicd_scan：cicd扫描。  **默认取值**: manual_scan 
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
        IacRequestInfo that = (IacRequestInfo) obj;
        return Objects.equals(this.fileIdList, that.fileIdList) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.fileType, that.fileType) && Objects.equals(this.risky, that.risky)
            && Objects.equals(this.scanType, that.scanType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileIdList, fileName, fileType, risky, scanType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IacRequestInfo {\n");
        sb.append("    fileIdList: ").append(toIndentedString(fileIdList)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
        sb.append("    risky: ").append(toIndentedString(risky)).append("\n");
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

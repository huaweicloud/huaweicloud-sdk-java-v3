package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObsScanResultInfo
 */
public class ObsScanResultInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    @JacksonXmlProperty(localName = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_id")

    @JacksonXmlProperty(localName = "bucket_id")

    private String bucketId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    @JacksonXmlProperty(localName = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    @JacksonXmlProperty(localName = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    @JacksonXmlProperty(localName = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    @JacksonXmlProperty(localName = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    @JacksonXmlProperty(localName = "risk_level")

    private Integer riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sensitive_data_type")

    @JacksonXmlProperty(localName = "sensitive_data_type")

    private List<String> sensitiveDataType = null;

    public ObsScanResultInfo withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ObsScanResultInfo withBucketId(String bucketId) {
        this.bucketId = bucketId;
        return this;
    }

    /**
     * OBS桶ID
     * @return bucketId
     */
    public String getBucketId() {
        return bucketId;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public ObsScanResultInfo withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * OBS桶名称
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsScanResultInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * 文件路径
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public ObsScanResultInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ObsScanResultInfo withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * 文件md5值
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public ObsScanResultInfo withRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public Integer getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(Integer riskLevel) {
        this.riskLevel = riskLevel;
    }

    public ObsScanResultInfo withSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
        return this;
    }

    public ObsScanResultInfo addSensitiveDataTypeItem(String sensitiveDataTypeItem) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        this.sensitiveDataType.add(sensitiveDataTypeItem);
        return this;
    }

    public ObsScanResultInfo withSensitiveDataType(Consumer<List<String>> sensitiveDataTypeSetter) {
        if (this.sensitiveDataType == null) {
            this.sensitiveDataType = new ArrayList<>();
        }
        sensitiveDataTypeSetter.accept(this.sensitiveDataType);
        return this;
    }

    /**
     * 风险数据类型
     * @return sensitiveDataType
     */
    public List<String> getSensitiveDataType() {
        return sensitiveDataType;
    }

    public void setSensitiveDataType(List<String> sensitiveDataType) {
        this.sensitiveDataType = sensitiveDataType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsScanResultInfo obsScanResultInfo = (ObsScanResultInfo) o;
        return Objects.equals(this.taskId, obsScanResultInfo.taskId)
            && Objects.equals(this.bucketId, obsScanResultInfo.bucketId)
            && Objects.equals(this.bucketName, obsScanResultInfo.bucketName)
            && Objects.equals(this.filePath, obsScanResultInfo.filePath)
            && Objects.equals(this.fileName, obsScanResultInfo.fileName)
            && Objects.equals(this.md5, obsScanResultInfo.md5)
            && Objects.equals(this.riskLevel, obsScanResultInfo.riskLevel)
            && Objects.equals(this.sensitiveDataType, obsScanResultInfo.sensitiveDataType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, bucketId, bucketName, filePath, fileName, md5, riskLevel, sensitiveDataType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsScanResultInfo {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    sensitiveDataType: ").append(toIndentedString(sensitiveDataType)).append("\n");
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

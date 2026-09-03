package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建binlog解析任务请求体
 */
public class CreateBinlogTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_type")

    private String binlogType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    public CreateBinlogTaskRequestBody withBinlogType(String binlogType) {
        this.binlogType = binlogType;
        return this;
    }

    /**
     * binlog类型。取值范围：latest（最近日志）、backup（归档日志）、fragment（碎片备份日志）
     * @return binlogType
     */
    public String getBinlogType() {
        return binlogType;
    }

    public void setBinlogType(String binlogType) {
        this.binlogType = binlogType;
    }

    public CreateBinlogTaskRequestBody withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * binlog文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public CreateBinlogTaskRequestBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * 归档ID
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateBinlogTaskRequestBody that = (CreateBinlogTaskRequestBody) obj;
        return Objects.equals(this.binlogType, that.binlogType) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.backupId, that.backupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binlogType, fileName, backupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBinlogTaskRequestBody {\n");
        sb.append("    binlogType: ").append(toIndentedString(binlogType)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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

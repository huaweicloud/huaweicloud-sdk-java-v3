package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * binlog解析错误信息
 */
public class ErrorTransInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_position")

    private Long beginPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_position")

    private Long endPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tb_name")

    private String tbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public ErrorTransInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 解析任务ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ErrorTransInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 文件名称
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public ErrorTransInfo withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * 对象键
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public ErrorTransInfo withBeginPosition(Long beginPosition) {
        this.beginPosition = beginPosition;
        return this;
    }

    /**
     * 解析开始位置
     * @return beginPosition
     */
    public Long getBeginPosition() {
        return beginPosition;
    }

    public void setBeginPosition(Long beginPosition) {
        this.beginPosition = beginPosition;
    }

    public ErrorTransInfo withEndPosition(Long endPosition) {
        this.endPosition = endPosition;
        return this;
    }

    /**
     * 解析结束位置
     * @return endPosition
     */
    public Long getEndPosition() {
        return endPosition;
    }

    public void setEndPosition(Long endPosition) {
        this.endPosition = endPosition;
    }

    public ErrorTransInfo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ErrorTransInfo withTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }

    /**
     * 表名称
     * @return tbName
     */
    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public ErrorTransInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间，单位毫秒
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ErrorTransInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorTransInfo that = (ErrorTransInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.beginPosition, that.beginPosition)
            && Objects.equals(this.endPosition, that.endPosition) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.tbName, that.tbName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, objectKey, beginPosition, endPosition, dbName, tbName, createTime, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorTransInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    beginPosition: ").append(toIndentedString(beginPosition)).append("\n");
        sb.append("    endPosition: ").append(toIndentedString(endPosition)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tbName: ").append(toIndentedString(tbName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

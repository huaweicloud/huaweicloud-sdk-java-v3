package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 标准属性值。
 */
public class StandElementValueVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_name")

    private String fdName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_value")

    private String fdValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_id")

    private String fdId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private String directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_id")

    private String rowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private BizStatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_by")

    private String createBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_by")

    private String updateBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public StandElementValueVO withFdName(String fdName) {
        this.fdName = fdName;
        return this;
    }

    /**
     * 属性名称。
     * @return fdName
     */
    public String getFdName() {
        return fdName;
    }

    public void setFdName(String fdName) {
        this.fdName = fdName;
    }

    public StandElementValueVO withFdValue(String fdValue) {
        this.fdValue = fdValue;
        return this;
    }

    /**
     * 属性值。
     * @return fdValue
     */
    public String getFdValue() {
        return fdValue;
    }

    public void setFdValue(String fdValue) {
        this.fdValue = fdValue;
    }

    public StandElementValueVO withFdId(String fdId) {
        this.fdId = fdId;
        return this;
    }

    /**
     * 属性定义的ID，填写String类型替代Long类型。
     * @return fdId
     */
    public String getFdId() {
        return fdId;
    }

    public void setFdId(String fdId) {
        this.fdId = fdId;
    }

    public StandElementValueVO withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 标准所属目录，填写String类型替代Long类型。
     * @return directoryId
     */
    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public StandElementValueVO withRowId(String rowId) {
        this.rowId = rowId;
        return this;
    }

    /**
     * 标准所属行，填写String类型替代Long类型。
     * @return rowId
     */
    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public StandElementValueVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 数据标准的ID，填写String类型替代Long类型。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StandElementValueVO withStatus(BizStatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    public BizStatusEnum getStatus() {
        return status;
    }

    public void setStatus(BizStatusEnum status) {
        this.status = status;
    }

    public StandElementValueVO withCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    /**
     * 创建人。
     * @return createBy
     */
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public StandElementValueVO withUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    /**
     * 更新人。
     * @return updateBy
     */
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public StandElementValueVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public StandElementValueVO withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，只读，格式遵循RFC3339，精确到秒，UTC时区，即yyyy-mm-ddTHH:MM:SSZ，如1970-01-01T00:00:00Z。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StandElementValueVO that = (StandElementValueVO) obj;
        return Objects.equals(this.fdName, that.fdName) && Objects.equals(this.fdValue, that.fdValue)
            && Objects.equals(this.fdId, that.fdId) && Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.rowId, that.rowId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createBy, that.createBy)
            && Objects.equals(this.updateBy, that.updateBy) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(fdName, fdValue, fdId, directoryId, rowId, id, status, createBy, updateBy, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandElementValueVO {\n");
        sb.append("    fdName: ").append(toIndentedString(fdName)).append("\n");
        sb.append("    fdValue: ").append(toIndentedString(fdValue)).append("\n");
        sb.append("    fdId: ").append(toIndentedString(fdId)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createBy: ").append(toIndentedString(createBy)).append("\n");
        sb.append("    updateBy: ").append(toIndentedString(updateBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

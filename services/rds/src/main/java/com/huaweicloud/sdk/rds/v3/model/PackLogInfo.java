package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * binlog合并下载文件信息
 */
public class PackLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_unit")

    private String sizeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start_time")

    private Long queryStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_end_time")

    private Long queryEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    public PackLogInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  文件唯一ID标识。  **约束限制**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PackLogInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：  实例id。  **约束限制**：  不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public PackLogInfo withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**：  文件大小。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 1E+13
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public PackLogInfo withSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
        return this;
    }

    /**
     * **参数解释**：  文件大小单位。  **约束限制**：  不涉及。
     * @return sizeUnit
     */
    public String getSizeUnit() {
        return sizeUnit;
    }

    public void setSizeUnit(String sizeUnit) {
        this.sizeUnit = sizeUnit;
    }

    public PackLogInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  状态。  **约束限制**：  不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PackLogInfo withQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    /**
     * **参数解释**：  合并时间段起始时间戳。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 9999999999999
     * @return queryStartTime
     */
    public Long getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(Long queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public PackLogInfo withQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * **参数解释**：  合并时间段结束时间戳。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 9999999999999
     * @return queryEndTime
     */
    public Long getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(Long queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public PackLogInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**：  文件名。  **约束限制**：  不涉及。
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PackLogInfo that = (PackLogInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.size, that.size) && Objects.equals(this.sizeUnit, that.sizeUnit)
            && Objects.equals(this.status, that.status) && Objects.equals(this.queryStartTime, that.queryStartTime)
            && Objects.equals(this.queryEndTime, that.queryEndTime) && Objects.equals(this.fileName, that.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, size, sizeUnit, status, queryStartTime, queryEndTime, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PackLogInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeUnit: ").append(toIndentedString(sizeUnit)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

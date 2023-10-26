package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ScanExpireKeyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_type")

    private String scanType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "started_at")

    private String startedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finished_at")

    private String finishedAt;

    public ScanExpireKeyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 主键ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScanExpireKeyResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ScanExpireKeyResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScanExpireKeyResponse withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * 扫描类型
     * @return scanType
     */
    public String getScanType() {
        return scanType;
    }

    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    public ScanExpireKeyResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间, 格式为：\"2020-06-15T02:21:18.669Z\"
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ScanExpireKeyResponse withStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * 开始时间, 格式为：\"2020-06-15T02:21:18.669Z\"
     * @return startedAt
     */
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public ScanExpireKeyResponse withFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * 完成时间, 格式为：\"2020-06-15T02:21:18.669Z\"
     * @return finishedAt
     */
    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScanExpireKeyResponse that = (ScanExpireKeyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.scanType, that.scanType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.startedAt, that.startedAt)
            && Objects.equals(this.finishedAt, that.finishedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, instanceId, status, scanType, createdAt, startedAt, finishedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScanExpireKeyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    scanType: ").append(toIndentedString(scanType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
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

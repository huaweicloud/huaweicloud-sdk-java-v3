package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RealTimeLogCollect
 */
public class RealTimeLogCollect {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indexPrefix")

    private String indexPrefix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepDays")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetClusterId")

    private String targetClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createAt")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private Long updateAt;

    public RealTimeLogCollect withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 日志采集ID，通过系统UUID生成。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RealTimeLogCollect withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RealTimeLogCollect withIndexPrefix(String indexPrefix) {
        this.indexPrefix = indexPrefix;
        return this;
    }

    /**
     * 日志保存索引的前缀。
     * @return indexPrefix
     */
    public String getIndexPrefix() {
        return indexPrefix;
    }

    public void setIndexPrefix(String indexPrefix) {
        this.indexPrefix = indexPrefix;
    }

    public RealTimeLogCollect withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 日志保存时间。
     * minimum: 1
     * maximum: 3650
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public RealTimeLogCollect withTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
        return this;
    }

    /**
     * 保存日志的目标集群ID。
     * @return targetClusterId
     */
    public String getTargetClusterId() {
        return targetClusterId;
    }

    public void setTargetClusterId(String targetClusterId) {
        this.targetClusterId = targetClusterId;
    }

    public RealTimeLogCollect withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 日志实时采集任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RealTimeLogCollect withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 日志实时采集任务开启时间。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public RealTimeLogCollect withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 日志实时采集任务更新时间。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealTimeLogCollect that = (RealTimeLogCollect) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.indexPrefix, that.indexPrefix) && Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.targetClusterId, that.targetClusterId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createAt, that.createAt) && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, indexPrefix, keepDays, targetClusterId, status, createAt, updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeLogCollect {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    indexPrefix: ").append(toIndentedString(indexPrefix)).append("\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    targetClusterId: ").append(toIndentedString(targetClusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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

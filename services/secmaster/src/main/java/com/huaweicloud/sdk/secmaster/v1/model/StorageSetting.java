package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 存储设置
 */
public class StorageSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_cu")

    private BigDecimal dataTransformationCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_replicas")

    private Integer indexReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_shards")

    private Integer indexShards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_period")

    private Integer indexStoragePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_size")

    private Integer indexStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lake_storage_period")

    private Integer lakeStoragePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_bandwidth")

    private BigDecimal streamingBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_dataspace_id")

    private String streamingDataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_partition")

    private Integer streamingPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_retention_size")

    private Integer streamingRetentionSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_retention_time")

    private Integer streamingRetentionTime;

    public StorageSetting withDataTransformationCu(BigDecimal dataTransformationCu) {
        this.dataTransformationCu = dataTransformationCu;
        return this;
    }

    /**
     * 数据转换 CU
     * @return dataTransformationCu
     */
    public BigDecimal getDataTransformationCu() {
        return dataTransformationCu;
    }

    public void setDataTransformationCu(BigDecimal dataTransformationCu) {
        this.dataTransformationCu = dataTransformationCu;
    }

    public StorageSetting withIndexReplicas(Integer indexReplicas) {
        this.indexReplicas = indexReplicas;
        return this;
    }

    /**
     * 索引副本数
     * @return indexReplicas
     */
    public Integer getIndexReplicas() {
        return indexReplicas;
    }

    public void setIndexReplicas(Integer indexReplicas) {
        this.indexReplicas = indexReplicas;
    }

    public StorageSetting withIndexShards(Integer indexShards) {
        this.indexShards = indexShards;
        return this;
    }

    /**
     * 索引分片数
     * @return indexShards
     */
    public Integer getIndexShards() {
        return indexShards;
    }

    public void setIndexShards(Integer indexShards) {
        this.indexShards = indexShards;
    }

    public StorageSetting withIndexStoragePeriod(Integer indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
        return this;
    }

    /**
     * 索引存储周期
     * @return indexStoragePeriod
     */
    public Integer getIndexStoragePeriod() {
        return indexStoragePeriod;
    }

    public void setIndexStoragePeriod(Integer indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
    }

    public StorageSetting withIndexStorageSize(Integer indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
        return this;
    }

    /**
     * 索引存储大小
     * @return indexStorageSize
     */
    public Integer getIndexStorageSize() {
        return indexStorageSize;
    }

    public void setIndexStorageSize(Integer indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
    }

    public StorageSetting withLakeStoragePeriod(Integer lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
        return this;
    }

    /**
     * 湖存储周期
     * @return lakeStoragePeriod
     */
    public Integer getLakeStoragePeriod() {
        return lakeStoragePeriod;
    }

    public void setLakeStoragePeriod(Integer lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
    }

    public StorageSetting withStreamingBandwidth(BigDecimal streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
        return this;
    }

    /**
     * 流式带宽
     * @return streamingBandwidth
     */
    public BigDecimal getStreamingBandwidth() {
        return streamingBandwidth;
    }

    public void setStreamingBandwidth(BigDecimal streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
    }

    public StorageSetting withStreamingDataspaceId(String streamingDataspaceId) {
        this.streamingDataspaceId = streamingDataspaceId;
        return this;
    }

    /**
     * 流式数据空间ID
     * @return streamingDataspaceId
     */
    public String getStreamingDataspaceId() {
        return streamingDataspaceId;
    }

    public void setStreamingDataspaceId(String streamingDataspaceId) {
        this.streamingDataspaceId = streamingDataspaceId;
    }

    public StorageSetting withStreamingPartition(Integer streamingPartition) {
        this.streamingPartition = streamingPartition;
        return this;
    }

    /**
     * 流式分区数
     * @return streamingPartition
     */
    public Integer getStreamingPartition() {
        return streamingPartition;
    }

    public void setStreamingPartition(Integer streamingPartition) {
        this.streamingPartition = streamingPartition;
    }

    public StorageSetting withStreamingRetentionSize(Integer streamingRetentionSize) {
        this.streamingRetentionSize = streamingRetentionSize;
        return this;
    }

    /**
     * 流式保留大小
     * @return streamingRetentionSize
     */
    public Integer getStreamingRetentionSize() {
        return streamingRetentionSize;
    }

    public void setStreamingRetentionSize(Integer streamingRetentionSize) {
        this.streamingRetentionSize = streamingRetentionSize;
    }

    public StorageSetting withStreamingRetentionTime(Integer streamingRetentionTime) {
        this.streamingRetentionTime = streamingRetentionTime;
        return this;
    }

    /**
     * 流式保留时间
     * @return streamingRetentionTime
     */
    public Integer getStreamingRetentionTime() {
        return streamingRetentionTime;
    }

    public void setStreamingRetentionTime(Integer streamingRetentionTime) {
        this.streamingRetentionTime = streamingRetentionTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StorageSetting that = (StorageSetting) obj;
        return Objects.equals(this.dataTransformationCu, that.dataTransformationCu)
            && Objects.equals(this.indexReplicas, that.indexReplicas)
            && Objects.equals(this.indexShards, that.indexShards)
            && Objects.equals(this.indexStoragePeriod, that.indexStoragePeriod)
            && Objects.equals(this.indexStorageSize, that.indexStorageSize)
            && Objects.equals(this.lakeStoragePeriod, that.lakeStoragePeriod)
            && Objects.equals(this.streamingBandwidth, that.streamingBandwidth)
            && Objects.equals(this.streamingDataspaceId, that.streamingDataspaceId)
            && Objects.equals(this.streamingPartition, that.streamingPartition)
            && Objects.equals(this.streamingRetentionSize, that.streamingRetentionSize)
            && Objects.equals(this.streamingRetentionTime, that.streamingRetentionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTransformationCu,
            indexReplicas,
            indexShards,
            indexStoragePeriod,
            indexStorageSize,
            lakeStoragePeriod,
            streamingBandwidth,
            streamingDataspaceId,
            streamingPartition,
            streamingRetentionSize,
            streamingRetentionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageSetting {\n");
        sb.append("    dataTransformationCu: ").append(toIndentedString(dataTransformationCu)).append("\n");
        sb.append("    indexReplicas: ").append(toIndentedString(indexReplicas)).append("\n");
        sb.append("    indexShards: ").append(toIndentedString(indexShards)).append("\n");
        sb.append("    indexStoragePeriod: ").append(toIndentedString(indexStoragePeriod)).append("\n");
        sb.append("    indexStorageSize: ").append(toIndentedString(indexStorageSize)).append("\n");
        sb.append("    lakeStoragePeriod: ").append(toIndentedString(lakeStoragePeriod)).append("\n");
        sb.append("    streamingBandwidth: ").append(toIndentedString(streamingBandwidth)).append("\n");
        sb.append("    streamingDataspaceId: ").append(toIndentedString(streamingDataspaceId)).append("\n");
        sb.append("    streamingPartition: ").append(toIndentedString(streamingPartition)).append("\n");
        sb.append("    streamingRetentionSize: ").append(toIndentedString(streamingRetentionSize)).append("\n");
        sb.append("    streamingRetentionTime: ").append(toIndentedString(streamingRetentionTime)).append("\n");
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

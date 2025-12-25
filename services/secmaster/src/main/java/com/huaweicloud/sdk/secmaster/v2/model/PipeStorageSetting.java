package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 管道存储设置
 */
public class PipeStorageSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_bandwidth")

    private Float streamingBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_dataspace_id")

    private String streamingDataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_period")

    private Long indexStoragePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_size")

    private Long indexStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_shards")

    private Long indexShards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_transformation_cu")

    private Float dataTransformationCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lake_storage_period")

    private Long lakeStoragePeriod;

    public PipeStorageSetting withStreamingBandwidth(Float streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
        return this;
    }

    /**
     * Bandwidth in MB/s
     * minimum: 0.1
     * maximum: 5
     * @return streamingBandwidth
     */
    public Float getStreamingBandwidth() {
        return streamingBandwidth;
    }

    public void setStreamingBandwidth(Float streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
    }

    public PipeStorageSetting withStreamingDataspaceId(String streamingDataspaceId) {
        this.streamingDataspaceId = streamingDataspaceId;
        return this;
    }

    /**
     * UUID
     * @return streamingDataspaceId
     */
    public String getStreamingDataspaceId() {
        return streamingDataspaceId;
    }

    public void setStreamingDataspaceId(String streamingDataspaceId) {
        this.streamingDataspaceId = streamingDataspaceId;
    }

    public PipeStorageSetting withIndexStoragePeriod(Long indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
        return this;
    }

    /**
     * 索引存储周期
     * minimum: 1
     * maximum: 8
     * @return indexStoragePeriod
     */
    public Long getIndexStoragePeriod() {
        return indexStoragePeriod;
    }

    public void setIndexStoragePeriod(Long indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
    }

    public PipeStorageSetting withIndexStorageSize(Long indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
        return this;
    }

    /**
     * 索引存储容量，单位：GB
     * minimum: 1
     * maximum: 1024
     * @return indexStorageSize
     */
    public Long getIndexStorageSize() {
        return indexStorageSize;
    }

    public void setIndexStorageSize(Long indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
    }

    public PipeStorageSetting withIndexShards(Long indexShards) {
        this.indexShards = indexShards;
        return this;
    }

    /**
     * 索引分区数
     * minimum: 1
     * maximum: 64
     * @return indexShards
     */
    public Long getIndexShards() {
        return indexShards;
    }

    public void setIndexShards(Long indexShards) {
        this.indexShards = indexShards;
    }

    public PipeStorageSetting withDataTransformationCu(Float dataTransformationCu) {
        this.dataTransformationCu = dataTransformationCu;
        return this;
    }

    /**
     * 数据转换CU
     * minimum: 0.25
     * maximum: 8
     * @return dataTransformationCu
     */
    public Float getDataTransformationCu() {
        return dataTransformationCu;
    }

    public void setDataTransformationCu(Float dataTransformationCu) {
        this.dataTransformationCu = dataTransformationCu;
    }

    public PipeStorageSetting withLakeStoragePeriod(Long lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
        return this;
    }

    /**
     * Index shards
     * minimum: 15
     * maximum: 3700
     * @return lakeStoragePeriod
     */
    public Long getLakeStoragePeriod() {
        return lakeStoragePeriod;
    }

    public void setLakeStoragePeriod(Long lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipeStorageSetting that = (PipeStorageSetting) obj;
        return Objects.equals(this.streamingBandwidth, that.streamingBandwidth)
            && Objects.equals(this.streamingDataspaceId, that.streamingDataspaceId)
            && Objects.equals(this.indexStoragePeriod, that.indexStoragePeriod)
            && Objects.equals(this.indexStorageSize, that.indexStorageSize)
            && Objects.equals(this.indexShards, that.indexShards)
            && Objects.equals(this.dataTransformationCu, that.dataTransformationCu)
            && Objects.equals(this.lakeStoragePeriod, that.lakeStoragePeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(streamingBandwidth,
            streamingDataspaceId,
            indexStoragePeriod,
            indexStorageSize,
            indexShards,
            dataTransformationCu,
            lakeStoragePeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipeStorageSetting {\n");
        sb.append("    streamingBandwidth: ").append(toIndentedString(streamingBandwidth)).append("\n");
        sb.append("    streamingDataspaceId: ").append(toIndentedString(streamingDataspaceId)).append("\n");
        sb.append("    indexStoragePeriod: ").append(toIndentedString(indexStoragePeriod)).append("\n");
        sb.append("    indexStorageSize: ").append(toIndentedString(indexStorageSize)).append("\n");
        sb.append("    indexShards: ").append(toIndentedString(indexShards)).append("\n");
        sb.append("    dataTransformationCu: ").append(toIndentedString(dataTransformationCu)).append("\n");
        sb.append("    lakeStoragePeriod: ").append(toIndentedString(lakeStoragePeriod)).append("\n");
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

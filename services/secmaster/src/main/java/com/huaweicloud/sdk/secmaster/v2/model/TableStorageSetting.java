package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 表存储设置
 */
public class TableStorageSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_index")

    private String applicationIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_topic")

    private String applicationTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_data_class_id")

    private String applicationDataClassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_bandwidth")

    private BigDecimal streamingBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_partition")

    private Integer streamingPartition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_retention_size")

    private Integer streamingRetentionSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streaming_dataspace_id")

    private String streamingDataspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_period")

    private Integer indexStoragePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_size")

    private Integer indexStorageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_shards")

    private Integer indexShards;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_replicas")

    private Integer indexReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lake_storage_period")

    private Long lakeStoragePeriod;

    /**
     * **参数解释**: 时间单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及 
     */
    public static final class LakePartitionSettingEnum {

        /**
         * Enum DAY for value: "DAY"
         */
        public static final LakePartitionSettingEnum DAY = new LakePartitionSettingEnum("DAY");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final LakePartitionSettingEnum HOUR = new LakePartitionSettingEnum("HOUR");

        /**
         * Enum MINUTE10 for value: "MINUTE10"
         */
        public static final LakePartitionSettingEnum MINUTE10 = new LakePartitionSettingEnum("MINUTE10");

        private static final Map<String, LakePartitionSettingEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LakePartitionSettingEnum> createStaticFields() {
            Map<String, LakePartitionSettingEnum> map = new HashMap<>();
            map.put("DAY", DAY);
            map.put("HOUR", HOUR);
            map.put("MINUTE10", MINUTE10);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LakePartitionSettingEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LakePartitionSettingEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LakePartitionSettingEnum(value));
        }

        public static LakePartitionSettingEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LakePartitionSettingEnum) {
                return this.value.equals(((LakePartitionSettingEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lake_partition_setting")

    private LakePartitionSettingEnum lakePartitionSetting;

    /**
     * **参数解释**: 数据湖过期状态 - NOT_EXPIRED 未过期 - EXPIRED_PROCESSING 过期处理中 - EXPIRED_SUCCESS 过期处理成功 - EXPIRED_FAILURE 过期处理失败  **约束限制** 不涉及 **取值范围**: - NOT_EXPIRED - EXPIRED_PROCESSING - EXPIRED_SUCCESS - EXPIRED_FAILURE  **默认值** 不涉及         
     */
    public static final class LakeExpirationStatusEnum {

        /**
         * Enum NOT_EXPIRED for value: "NOT_EXPIRED"
         */
        public static final LakeExpirationStatusEnum NOT_EXPIRED = new LakeExpirationStatusEnum("NOT_EXPIRED");

        /**
         * Enum EXPIRED_PROCESSING for value: "EXPIRED_PROCESSING"
         */
        public static final LakeExpirationStatusEnum EXPIRED_PROCESSING =
            new LakeExpirationStatusEnum("EXPIRED_PROCESSING");

        /**
         * Enum EXPIRED_SUCCESS for value: "EXPIRED_SUCCESS"
         */
        public static final LakeExpirationStatusEnum EXPIRED_SUCCESS = new LakeExpirationStatusEnum("EXPIRED_SUCCESS");

        /**
         * Enum EXPIRED_FAILURE for value: "EXPIRED_FAILURE"
         */
        public static final LakeExpirationStatusEnum EXPIRED_FAILURE = new LakeExpirationStatusEnum("EXPIRED_FAILURE");

        private static final Map<String, LakeExpirationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LakeExpirationStatusEnum> createStaticFields() {
            Map<String, LakeExpirationStatusEnum> map = new HashMap<>();
            map.put("NOT_EXPIRED", NOT_EXPIRED);
            map.put("EXPIRED_PROCESSING", EXPIRED_PROCESSING);
            map.put("EXPIRED_SUCCESS", EXPIRED_SUCCESS);
            map.put("EXPIRED_FAILURE", EXPIRED_FAILURE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LakeExpirationStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LakeExpirationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LakeExpirationStatusEnum(value));
        }

        public static LakeExpirationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LakeExpirationStatusEnum) {
                return this.value.equals(((LakeExpirationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lake_expiration_status")

    private LakeExpirationStatusEnum lakeExpirationStatus;

    public TableStorageSetting withApplicationIndex(String applicationIndex) {
        this.applicationIndex = applicationIndex;
        return this;
    }

    /**
     * 应用索引
     * @return applicationIndex
     */
    public String getApplicationIndex() {
        return applicationIndex;
    }

    public void setApplicationIndex(String applicationIndex) {
        this.applicationIndex = applicationIndex;
    }

    public TableStorageSetting withApplicationTopic(String applicationTopic) {
        this.applicationTopic = applicationTopic;
        return this;
    }

    /**
     * 应用主题
     * @return applicationTopic
     */
    public String getApplicationTopic() {
        return applicationTopic;
    }

    public void setApplicationTopic(String applicationTopic) {
        this.applicationTopic = applicationTopic;
    }

    public TableStorageSetting withApplicationDataClassId(String applicationDataClassId) {
        this.applicationDataClassId = applicationDataClassId;
        return this;
    }

    /**
     * 应用数据类ID
     * @return applicationDataClassId
     */
    public String getApplicationDataClassId() {
        return applicationDataClassId;
    }

    public void setApplicationDataClassId(String applicationDataClassId) {
        this.applicationDataClassId = applicationDataClassId;
    }

    public TableStorageSetting withStreamingBandwidth(BigDecimal streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
        return this;
    }

    /**
     * 流式带宽 MB/s
     * minimum: 0.1
     * maximum: 5
     * @return streamingBandwidth
     */
    public BigDecimal getStreamingBandwidth() {
        return streamingBandwidth;
    }

    public void setStreamingBandwidth(BigDecimal streamingBandwidth) {
        this.streamingBandwidth = streamingBandwidth;
    }

    public TableStorageSetting withStreamingPartition(Integer streamingPartition) {
        this.streamingPartition = streamingPartition;
        return this;
    }

    /**
     * 流式分区
     * minimum: 1
     * maximum: 64
     * @return streamingPartition
     */
    public Integer getStreamingPartition() {
        return streamingPartition;
    }

    public void setStreamingPartition(Integer streamingPartition) {
        this.streamingPartition = streamingPartition;
    }

    public TableStorageSetting withStreamingRetentionSize(Integer streamingRetentionSize) {
        this.streamingRetentionSize = streamingRetentionSize;
        return this;
    }

    /**
     * 流式容量大小
     * minimum: 1
     * maximum: 64
     * @return streamingRetentionSize
     */
    public Integer getStreamingRetentionSize() {
        return streamingRetentionSize;
    }

    public void setStreamingRetentionSize(Integer streamingRetentionSize) {
        this.streamingRetentionSize = streamingRetentionSize;
    }

    public TableStorageSetting withStreamingDataspaceId(String streamingDataspaceId) {
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

    public TableStorageSetting withIndexStoragePeriod(Integer indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
        return this;
    }

    /**
     * 索引存储周期
     * minimum: 1
     * maximum: 8
     * @return indexStoragePeriod
     */
    public Integer getIndexStoragePeriod() {
        return indexStoragePeriod;
    }

    public void setIndexStoragePeriod(Integer indexStoragePeriod) {
        this.indexStoragePeriod = indexStoragePeriod;
    }

    public TableStorageSetting withIndexStorageSize(Integer indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
        return this;
    }

    /**
     * 索引存储大小
     * minimum: 1
     * maximum: 1024
     * @return indexStorageSize
     */
    public Integer getIndexStorageSize() {
        return indexStorageSize;
    }

    public void setIndexStorageSize(Integer indexStorageSize) {
        this.indexStorageSize = indexStorageSize;
    }

    public TableStorageSetting withIndexShards(Integer indexShards) {
        this.indexShards = indexShards;
        return this;
    }

    /**
     * 索引分片数
     * minimum: 1
     * maximum: 64
     * @return indexShards
     */
    public Integer getIndexShards() {
        return indexShards;
    }

    public void setIndexShards(Integer indexShards) {
        this.indexShards = indexShards;
    }

    public TableStorageSetting withIndexReplicas(Integer indexReplicas) {
        this.indexReplicas = indexReplicas;
        return this;
    }

    /**
     * 索引副本数
     * minimum: 1
     * maximum: 64
     * @return indexReplicas
     */
    public Integer getIndexReplicas() {
        return indexReplicas;
    }

    public void setIndexReplicas(Integer indexReplicas) {
        this.indexReplicas = indexReplicas;
    }

    public TableStorageSetting withLakeStoragePeriod(Long lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
        return this;
    }

    /**
     * 数据湖存储周期
     * minimum: 30
     * maximum: 180
     * @return lakeStoragePeriod
     */
    public Long getLakeStoragePeriod() {
        return lakeStoragePeriod;
    }

    public void setLakeStoragePeriod(Long lakeStoragePeriod) {
        this.lakeStoragePeriod = lakeStoragePeriod;
    }

    public TableStorageSetting withLakePartitionSetting(LakePartitionSettingEnum lakePartitionSetting) {
        this.lakePartitionSetting = lakePartitionSetting;
        return this;
    }

    /**
     * **参数解释**: 时间单位 - MINUTE10 10分钟 - HOUR 小时 - DAY 天  **约束限制** 不涉及 **取值范围**: - MINUTE - HOUR - DAY  **默认值** 不涉及 
     * @return lakePartitionSetting
     */
    public LakePartitionSettingEnum getLakePartitionSetting() {
        return lakePartitionSetting;
    }

    public void setLakePartitionSetting(LakePartitionSettingEnum lakePartitionSetting) {
        this.lakePartitionSetting = lakePartitionSetting;
    }

    public TableStorageSetting withLakeExpirationStatus(LakeExpirationStatusEnum lakeExpirationStatus) {
        this.lakeExpirationStatus = lakeExpirationStatus;
        return this;
    }

    /**
     * **参数解释**: 数据湖过期状态 - NOT_EXPIRED 未过期 - EXPIRED_PROCESSING 过期处理中 - EXPIRED_SUCCESS 过期处理成功 - EXPIRED_FAILURE 过期处理失败  **约束限制** 不涉及 **取值范围**: - NOT_EXPIRED - EXPIRED_PROCESSING - EXPIRED_SUCCESS - EXPIRED_FAILURE  **默认值** 不涉及         
     * @return lakeExpirationStatus
     */
    public LakeExpirationStatusEnum getLakeExpirationStatus() {
        return lakeExpirationStatus;
    }

    public void setLakeExpirationStatus(LakeExpirationStatusEnum lakeExpirationStatus) {
        this.lakeExpirationStatus = lakeExpirationStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TableStorageSetting that = (TableStorageSetting) obj;
        return Objects.equals(this.applicationIndex, that.applicationIndex)
            && Objects.equals(this.applicationTopic, that.applicationTopic)
            && Objects.equals(this.applicationDataClassId, that.applicationDataClassId)
            && Objects.equals(this.streamingBandwidth, that.streamingBandwidth)
            && Objects.equals(this.streamingPartition, that.streamingPartition)
            && Objects.equals(this.streamingRetentionSize, that.streamingRetentionSize)
            && Objects.equals(this.streamingDataspaceId, that.streamingDataspaceId)
            && Objects.equals(this.indexStoragePeriod, that.indexStoragePeriod)
            && Objects.equals(this.indexStorageSize, that.indexStorageSize)
            && Objects.equals(this.indexShards, that.indexShards)
            && Objects.equals(this.indexReplicas, that.indexReplicas)
            && Objects.equals(this.lakeStoragePeriod, that.lakeStoragePeriod)
            && Objects.equals(this.lakePartitionSetting, that.lakePartitionSetting)
            && Objects.equals(this.lakeExpirationStatus, that.lakeExpirationStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationIndex,
            applicationTopic,
            applicationDataClassId,
            streamingBandwidth,
            streamingPartition,
            streamingRetentionSize,
            streamingDataspaceId,
            indexStoragePeriod,
            indexStorageSize,
            indexShards,
            indexReplicas,
            lakeStoragePeriod,
            lakePartitionSetting,
            lakeExpirationStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableStorageSetting {\n");
        sb.append("    applicationIndex: ").append(toIndentedString(applicationIndex)).append("\n");
        sb.append("    applicationTopic: ").append(toIndentedString(applicationTopic)).append("\n");
        sb.append("    applicationDataClassId: ").append(toIndentedString(applicationDataClassId)).append("\n");
        sb.append("    streamingBandwidth: ").append(toIndentedString(streamingBandwidth)).append("\n");
        sb.append("    streamingPartition: ").append(toIndentedString(streamingPartition)).append("\n");
        sb.append("    streamingRetentionSize: ").append(toIndentedString(streamingRetentionSize)).append("\n");
        sb.append("    streamingDataspaceId: ").append(toIndentedString(streamingDataspaceId)).append("\n");
        sb.append("    indexStoragePeriod: ").append(toIndentedString(indexStoragePeriod)).append("\n");
        sb.append("    indexStorageSize: ").append(toIndentedString(indexStorageSize)).append("\n");
        sb.append("    indexShards: ").append(toIndentedString(indexShards)).append("\n");
        sb.append("    indexReplicas: ").append(toIndentedString(indexReplicas)).append("\n");
        sb.append("    lakeStoragePeriod: ").append(toIndentedString(lakeStoragePeriod)).append("\n");
        sb.append("    lakePartitionSetting: ").append(toIndentedString(lakePartitionSetting)).append("\n");
        sb.append("    lakeExpirationStatus: ").append(toIndentedString(lakeExpirationStatus)).append("\n");
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

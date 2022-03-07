package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 设置同步策略请求体 */
public class SyncPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /** 冲突策略。 - ignore：忽略 - overwrite：覆盖 - stop：报错 */
    public static final class ConflictPolicyEnum {

        /** Enum IGNORE for value: "ignore" */
        public static final ConflictPolicyEnum IGNORE = new ConflictPolicyEnum("ignore");

        /** Enum OVERWRITE for value: "overwrite" */
        public static final ConflictPolicyEnum OVERWRITE = new ConflictPolicyEnum("overwrite");

        /** Enum STOP for value: "stop" */
        public static final ConflictPolicyEnum STOP = new ConflictPolicyEnum("stop");

        private static final Map<String, ConflictPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConflictPolicyEnum> createStaticFields() {
            Map<String, ConflictPolicyEnum> map = new HashMap<>();
            map.put("ignore", IGNORE);
            map.put("overwrite", OVERWRITE);
            map.put("stop", STOP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConflictPolicyEnum(String value) {
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
        public static ConflictPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConflictPolicyEnum(value);
            }
            return result;
        }

        public static ConflictPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConflictPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConflictPolicyEnum) {
                return this.value.equals(((ConflictPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_policy")

    private ConflictPolicyEnum conflictPolicy;

    /** 过滤DDL策略。 */
    public static final class FilterDdlPolicyEnum {

        /** Enum DROP_DATABASE for value: "drop_database" */
        public static final FilterDdlPolicyEnum DROP_DATABASE = new FilterDdlPolicyEnum("drop_database");

        private static final Map<String, FilterDdlPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterDdlPolicyEnum> createStaticFields() {
            Map<String, FilterDdlPolicyEnum> map = new HashMap<>();
            map.put("drop_database", DROP_DATABASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterDdlPolicyEnum(String value) {
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
        public static FilterDdlPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FilterDdlPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FilterDdlPolicyEnum(value);
            }
            return result;
        }

        public static FilterDdlPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FilterDdlPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterDdlPolicyEnum) {
                return this.value.equals(((FilterDdlPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_ddl_policy")

    private FilterDdlPolicyEnum filterDdlPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_trans")

    private Boolean ddlTrans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_trans")

    private Boolean indexTrans;

    /** 同步Topic策略，目标库为kafka时必填，取值： - 0：集中投递到一个Topic - 1：按库名-schema自动生成Topic名字 - 2：按库名自动生成Topic名字 -
     * 3：按库名-schema-表名自动生成Topic名字 */
    public static final class TopicPolicyEnum {

        /** Enum _0 for value: "0" */
        public static final TopicPolicyEnum _0 = new TopicPolicyEnum("0");

        /** Enum _1 for value: "1" */
        public static final TopicPolicyEnum _1 = new TopicPolicyEnum("1");

        /** Enum _2 for value: "2" */
        public static final TopicPolicyEnum _2 = new TopicPolicyEnum("2");

        /** Enum _3 for value: "3" */
        public static final TopicPolicyEnum _3 = new TopicPolicyEnum("3");

        private static final Map<String, TopicPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TopicPolicyEnum> createStaticFields() {
            Map<String, TopicPolicyEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TopicPolicyEnum(String value) {
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
        public static TopicPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TopicPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TopicPolicyEnum(value);
            }
            return result;
        }

        public static TopicPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TopicPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TopicPolicyEnum) {
                return this.value.equals(((TopicPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_policy")

    private TopicPolicyEnum topicPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    /** 同步到kafka partition策略，取值： - 0：按库名.schema.表名的hash值投递到不同Partition - 1：全部投递到Partition 0 - 2：按主键的hash值投递到不同Partition
     * - 3：按库名.schema的hash值投递到不同Partition
     * **当topic_policy取0时，可以取0,1,2,3；当topic_policy取1时，可以取0,1；当topic_policy取2时，可以取0,1,3；当topic_policy取3时，可以取1,2；** */
    public static final class PartitionPolicyEnum {

        /** Enum _0 for value: "0" */
        public static final PartitionPolicyEnum _0 = new PartitionPolicyEnum("0");

        /** Enum _1 for value: "1" */
        public static final PartitionPolicyEnum _1 = new PartitionPolicyEnum("1");

        /** Enum _2 for value: "2" */
        public static final PartitionPolicyEnum _2 = new PartitionPolicyEnum("2");

        /** Enum _3 for value: "3" */
        public static final PartitionPolicyEnum _3 = new PartitionPolicyEnum("3");

        private static final Map<String, PartitionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PartitionPolicyEnum> createStaticFields() {
            Map<String, PartitionPolicyEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            map.put("3", _3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PartitionPolicyEnum(String value) {
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
        public static PartitionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PartitionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PartitionPolicyEnum(value);
            }
            return result;
        }

        public static PartitionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PartitionPolicyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PartitionPolicyEnum) {
                return this.value.equals(((PartitionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_policy")

    private PartitionPolicyEnum partitionPolicy;

    /** 投送到kafka的数据格式，不填默认为json： */
    public static final class KafkaDataFormatEnum {

        /** Enum JSON for value: "json" */
        public static final KafkaDataFormatEnum JSON = new KafkaDataFormatEnum("json");

        /** Enum AVRO for value: "avro" */
        public static final KafkaDataFormatEnum AVRO = new KafkaDataFormatEnum("avro");

        private static final Map<String, KafkaDataFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KafkaDataFormatEnum> createStaticFields() {
            Map<String, KafkaDataFormatEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("avro", AVRO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KafkaDataFormatEnum(String value) {
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
        public static KafkaDataFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            KafkaDataFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KafkaDataFormatEnum(value);
            }
            return result;
        }

        public static KafkaDataFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            KafkaDataFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KafkaDataFormatEnum) {
                return this.value.equals(((KafkaDataFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kafka_data_format")

    private KafkaDataFormatEnum kafkaDataFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name_format")

    private String topicNameFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions_num")

    private String partitionsNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_factor")

    private String replicationFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_fill_materialized_view")

    private Boolean isFillMaterializedView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "export_snapshot")

    private String exportSnapshot;

    public SyncPolicyReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public SyncPolicyReq withConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /** 冲突策略。 - ignore：忽略 - overwrite：覆盖 - stop：报错
     * 
     * @return conflictPolicy */
    public ConflictPolicyEnum getConflictPolicy() {
        return conflictPolicy;
    }

    public void setConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
    }

    public SyncPolicyReq withFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
        return this;
    }

    /** 过滤DDL策略。
     * 
     * @return filterDdlPolicy */
    public FilterDdlPolicyEnum getFilterDdlPolicy() {
        return filterDdlPolicy;
    }

    public void setFilterDdlPolicy(FilterDdlPolicyEnum filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
    }

    public SyncPolicyReq withDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
        return this;
    }

    /** 同步增量是否同步DDL。
     * 
     * @return ddlTrans */
    public Boolean getDdlTrans() {
        return ddlTrans;
    }

    public void setDdlTrans(Boolean ddlTrans) {
        this.ddlTrans = ddlTrans;
    }

    public SyncPolicyReq withIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
        return this;
    }

    /** 同步增量是否同步索引。
     * 
     * @return indexTrans */
    public Boolean getIndexTrans() {
        return indexTrans;
    }

    public void setIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
    }

    public SyncPolicyReq withTopicPolicy(TopicPolicyEnum topicPolicy) {
        this.topicPolicy = topicPolicy;
        return this;
    }

    /** 同步Topic策略，目标库为kafka时必填，取值： - 0：集中投递到一个Topic - 1：按库名-schema自动生成Topic名字 - 2：按库名自动生成Topic名字 -
     * 3：按库名-schema-表名自动生成Topic名字
     * 
     * @return topicPolicy */
    public TopicPolicyEnum getTopicPolicy() {
        return topicPolicy;
    }

    public void setTopicPolicy(TopicPolicyEnum topicPolicy) {
        this.topicPolicy = topicPolicy;
    }

    public SyncPolicyReq withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /** Topic名称，topic_policy为0时必填，确保topic已存在。
     * 
     * @return topic */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SyncPolicyReq withPartitionPolicy(PartitionPolicyEnum partitionPolicy) {
        this.partitionPolicy = partitionPolicy;
        return this;
    }

    /** 同步到kafka partition策略，取值： - 0：按库名.schema.表名的hash值投递到不同Partition - 1：全部投递到Partition 0 - 2：按主键的hash值投递到不同Partition
     * - 3：按库名.schema的hash值投递到不同Partition
     * **当topic_policy取0时，可以取0,1,2,3；当topic_policy取1时，可以取0,1；当topic_policy取2时，可以取0,1,3；当topic_policy取3时，可以取1,2；**
     * 
     * @return partitionPolicy */
    public PartitionPolicyEnum getPartitionPolicy() {
        return partitionPolicy;
    }

    public void setPartitionPolicy(PartitionPolicyEnum partitionPolicy) {
        this.partitionPolicy = partitionPolicy;
    }

    public SyncPolicyReq withKafkaDataFormat(KafkaDataFormatEnum kafkaDataFormat) {
        this.kafkaDataFormat = kafkaDataFormat;
        return this;
    }

    /** 投送到kafka的数据格式，不填默认为json：
     * 
     * @return kafkaDataFormat */
    public KafkaDataFormatEnum getKafkaDataFormat() {
        return kafkaDataFormat;
    }

    public void setKafkaDataFormat(KafkaDataFormatEnum kafkaDataFormat) {
        this.kafkaDataFormat = kafkaDataFormat;
    }

    public SyncPolicyReq withTopicNameFormat(String topicNameFormat) {
        this.topicNameFormat = topicNameFormat;
        return this;
    }

    /** Topic名字格式，topic_policy为1,2,3,时需要 -
     * 当topic_policy取1时，Topic名字格式支持database、schema两个变量，其他字符当做常量。分别用$database$代替数据库名，$schema$代替模式名，不填默认为$database$-$schema$
     * - 当topic_policy取2时，Topic名字格式支持database一个变量，其他字符都当做常量，不填默认为$database$ -
     * 当topic_policy取3时，Topic名字格式支持database、schema和tablename三个变量，其他字符当做常量。分别用$database$代替数据库名，$schema$代替模式名，$tablename$代替表名，不填默认为$database$-$schema$-$tablename$
     * 
     * @return topicNameFormat */
    public String getTopicNameFormat() {
        return topicNameFormat;
    }

    public void setTopicNameFormat(String topicNameFormat) {
        this.topicNameFormat = topicNameFormat;
    }

    public SyncPolicyReq withPartitionsNum(String partitionsNum) {
        this.partitionsNum = partitionsNum;
        return this;
    }

    /** Partition个数，取值1-2147483647之间，topic_policy为1,2,3,时需要，不填默认为1
     * 
     * @return partitionsNum */
    public String getPartitionsNum() {
        return partitionsNum;
    }

    public void setPartitionsNum(String partitionsNum) {
        this.partitionsNum = partitionsNum;
    }

    public SyncPolicyReq withReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
        return this;
    }

    /** 副本个数，取值1-32767之间，topic_policy为1,2,3,时需要，不填默认为1
     * 
     * @return replicationFactor */
    public String getReplicationFactor() {
        return replicationFactor;
    }

    public void setReplicationFactor(String replicationFactor) {
        this.replicationFactor = replicationFactor;
    }

    public SyncPolicyReq withIsFillMaterializedView(Boolean isFillMaterializedView) {
        this.isFillMaterializedView = isFillMaterializedView;
        return this;
    }

    /** PostgreSQL同步全量阶段是否填充物化视图，不填默认为false
     * 
     * @return isFillMaterializedView */
    public Boolean getIsFillMaterializedView() {
        return isFillMaterializedView;
    }

    public void setIsFillMaterializedView(Boolean isFillMaterializedView) {
        this.isFillMaterializedView = isFillMaterializedView;
    }

    public SyncPolicyReq withExportSnapshot(String exportSnapshot) {
        this.exportSnapshot = exportSnapshot;
        return this;
    }

    /** PostgreSQL同步全量阶段是否使用快照模式导出，不填默认为false
     * 
     * @return exportSnapshot */
    public String getExportSnapshot() {
        return exportSnapshot;
    }

    public void setExportSnapshot(String exportSnapshot) {
        this.exportSnapshot = exportSnapshot;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncPolicyReq syncPolicyReq = (SyncPolicyReq) o;
        return Objects.equals(this.jobId, syncPolicyReq.jobId)
            && Objects.equals(this.conflictPolicy, syncPolicyReq.conflictPolicy)
            && Objects.equals(this.filterDdlPolicy, syncPolicyReq.filterDdlPolicy)
            && Objects.equals(this.ddlTrans, syncPolicyReq.ddlTrans)
            && Objects.equals(this.indexTrans, syncPolicyReq.indexTrans)
            && Objects.equals(this.topicPolicy, syncPolicyReq.topicPolicy)
            && Objects.equals(this.topic, syncPolicyReq.topic)
            && Objects.equals(this.partitionPolicy, syncPolicyReq.partitionPolicy)
            && Objects.equals(this.kafkaDataFormat, syncPolicyReq.kafkaDataFormat)
            && Objects.equals(this.topicNameFormat, syncPolicyReq.topicNameFormat)
            && Objects.equals(this.partitionsNum, syncPolicyReq.partitionsNum)
            && Objects.equals(this.replicationFactor, syncPolicyReq.replicationFactor)
            && Objects.equals(this.isFillMaterializedView, syncPolicyReq.isFillMaterializedView)
            && Objects.equals(this.exportSnapshot, syncPolicyReq.exportSnapshot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            conflictPolicy,
            filterDdlPolicy,
            ddlTrans,
            indexTrans,
            topicPolicy,
            topic,
            partitionPolicy,
            kafkaDataFormat,
            topicNameFormat,
            partitionsNum,
            replicationFactor,
            isFillMaterializedView,
            exportSnapshot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncPolicyReq {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    conflictPolicy: ").append(toIndentedString(conflictPolicy)).append("\n");
        sb.append("    filterDdlPolicy: ").append(toIndentedString(filterDdlPolicy)).append("\n");
        sb.append("    ddlTrans: ").append(toIndentedString(ddlTrans)).append("\n");
        sb.append("    indexTrans: ").append(toIndentedString(indexTrans)).append("\n");
        sb.append("    topicPolicy: ").append(toIndentedString(topicPolicy)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    partitionPolicy: ").append(toIndentedString(partitionPolicy)).append("\n");
        sb.append("    kafkaDataFormat: ").append(toIndentedString(kafkaDataFormat)).append("\n");
        sb.append("    topicNameFormat: ").append(toIndentedString(topicNameFormat)).append("\n");
        sb.append("    partitionsNum: ").append(toIndentedString(partitionsNum)).append("\n");
        sb.append("    replicationFactor: ").append(toIndentedString(replicationFactor)).append("\n");
        sb.append("    isFillMaterializedView: ").append(toIndentedString(isFillMaterializedView)).append("\n");
        sb.append("    exportSnapshot: ").append(toIndentedString(exportSnapshot)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

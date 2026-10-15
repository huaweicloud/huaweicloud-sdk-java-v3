package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 设置同步策略请求体
 */
public class SyncPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    /**
     * **参数解释**：  数据迁移过程中的冲突忽略策略，指定当目标库已存在相同数据时的处理方式。  **约束限制**：  不涉及。  **取值范围**：  - stop：冲突失败，遇到冲突时停止任务 - overwrite：冲突覆盖，用源库数据覆盖目标库已有数据 - ignore：冲突忽略，跳过冲突数据继续迁移  **默认取值**：  不涉及
     */
    public static final class ConflictPolicyEnum {

        /**
         * Enum IGNORE for value: "ignore"
         */
        public static final ConflictPolicyEnum IGNORE = new ConflictPolicyEnum("ignore");

        /**
         * Enum OVERWRITE for value: "overwrite"
         */
        public static final ConflictPolicyEnum OVERWRITE = new ConflictPolicyEnum("overwrite");

        /**
         * Enum STOP for value: "stop"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConflictPolicyEnum(value));
        }

        public static ConflictPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：  过滤DDL策略，指定增量同步过程中需要过滤的DDL操作类型。  **约束限制**：  不涉及。  **取值范围**：  - drop_database：过滤DROP DATABASE操作  **默认取值**：  不涉及
     */
    public static final class FilterDdlPolicyEnum {

        /**
         * Enum DROP_DATABASE for value: "drop_database"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterDdlPolicyEnum(value));
        }

        public static FilterDdlPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：  同步Topic策略，指定Kafka目标库的Topic生成方式。  **约束限制**：  - 目标库为Kafka时必填。 - 不同引擎类型支持的取值范围不同，详见取值范围说明。  **取值范围**：  - 0：集中投递到一个Topic - 1：按库名-schema-表名自动生成Topic名字（GaussDB集中式版到Kafka、PostgreSQL到Kafka按库名-schema-表名；MySQL到Kafka、TaurusDB到Kafka自动生成Topic；Oracle到Kafka按schema-表名） - 2：按库名自动生成Topic名字 - 3：按库名-schema自动生成Topic名字（Oracle到Kafka按schema自动生成Topic）  **默认取值**：  不涉及
     */
    public static final class TopicPolicyEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final TopicPolicyEnum _0 = new TopicPolicyEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final TopicPolicyEnum _1 = new TopicPolicyEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final TopicPolicyEnum _2 = new TopicPolicyEnum("2");

        /**
         * Enum _3 for value: "3"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TopicPolicyEnum(value));
        }

        public static TopicPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：  同步到Kafka Partition的策略，指定数据投递到Kafka分区的方式。  **约束限制**：  - 目标库为Kafka时必填。 - partition_policy的可选取值受topic_policy约束：当topic_policy取0时可取0、1、2、3、4、5；当topic_policy取1时可取0、1、2、5；当topic_policy取2时可取0、1、2、3；当topic_policy取3时可取0、1；当topic_policy取4时可取0、1、3。  **取值范围**：  - 0：按库名.schema.表名的hash值投递到不同Partition - 1：全部投递到Partition 0 - 2：按主键的hash值投递到不同Partition - 3：按库名.schema的hash值投递到不同Partition  **默认取值**：  不涉及
     */
    public static final class PartitionPolicyEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final PartitionPolicyEnum _0 = new PartitionPolicyEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final PartitionPolicyEnum _1 = new PartitionPolicyEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final PartitionPolicyEnum _2 = new PartitionPolicyEnum("2");

        /**
         * Enum _3 for value: "3"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PartitionPolicyEnum(value));
        }

        public static PartitionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * **参数解释**：  投送到Kafka的数据格式，指定同步到Kafka的数据序列化方式。  **约束限制**：  - MySQL到Kafka、TaurusDB到Kafka同步支持json和json_c。 - 其他引擎支持json和avro。  **取值范围**：  - json：JSON格式 - avro：Avro格式  **默认取值**：  json
     */
    public static final class KafkaDataFormatEnum {

        /**
         * Enum JSON for value: "json"
         */
        public static final KafkaDataFormatEnum JSON = new KafkaDataFormatEnum("json");

        /**
         * Enum AVRO for value: "avro"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KafkaDataFormatEnum(value));
        }

        public static KafkaDataFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private Boolean exportSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_name")

    private String slotName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_and_position")

    private String fileAndPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gtid_set")

    private String gtidSet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl_topic")

    private String ddlTopic;

    public SyncPolicyReq withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释**：  同步任务ID，用于唯一标识一个数据复制任务，在批量设置同步策略时指定需要设置策略的任务。  **约束限制**：  不涉及。  **取值范围**：  UUID格式字符串。  **默认取值**：  不涉及
     * @return jobId
     */
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

    /**
     * **参数解释**：  数据迁移过程中的冲突忽略策略，指定当目标库已存在相同数据时的处理方式。  **约束限制**：  不涉及。  **取值范围**：  - stop：冲突失败，遇到冲突时停止任务 - overwrite：冲突覆盖，用源库数据覆盖目标库已有数据 - ignore：冲突忽略，跳过冲突数据继续迁移  **默认取值**：  不涉及
     * @return conflictPolicy
     */
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

    /**
     * **参数解释**：  过滤DDL策略，指定增量同步过程中需要过滤的DDL操作类型。  **约束限制**：  不涉及。  **取值范围**：  - drop_database：过滤DROP DATABASE操作  **默认取值**：  不涉及
     * @return filterDdlPolicy
     */
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

    /**
     * **参数解释**：  同步增量时是否同步DDL，指定增量同步阶段是否将源库的DDL操作同步到目标库。  **约束限制**：  不涉及。  **取值范围**：  - true：同步增量时同步DDL - false：同步增量时不同步DDL  **默认取值**：  不涉及
     * @return ddlTrans
     */
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

    /**
     * **参数解释**：  同步增量时是否同步索引，指定增量同步阶段是否将源库的索引变更同步到目标库。  **约束限制**：  不涉及。  **取值范围**：  - true：同步增量时同步索引 - false：同步增量时不同步索引  **默认取值**：  不涉及
     * @return indexTrans
     */
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

    /**
     * **参数解释**：  同步Topic策略，指定Kafka目标库的Topic生成方式。  **约束限制**：  - 目标库为Kafka时必填。 - 不同引擎类型支持的取值范围不同，详见取值范围说明。  **取值范围**：  - 0：集中投递到一个Topic - 1：按库名-schema-表名自动生成Topic名字（GaussDB集中式版到Kafka、PostgreSQL到Kafka按库名-schema-表名；MySQL到Kafka、TaurusDB到Kafka自动生成Topic；Oracle到Kafka按schema-表名） - 2：按库名自动生成Topic名字 - 3：按库名-schema自动生成Topic名字（Oracle到Kafka按schema自动生成Topic）  **默认取值**：  不涉及
     * @return topicPolicy
     */
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

    /**
     * **参数解释**：  Kafka Topic名称，指定同步数据投递的目标Topic。  **约束限制**：  - topic_policy为0时必填。 - 确保Topic已存在。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return topic
     */
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

    /**
     * **参数解释**：  同步到Kafka Partition的策略，指定数据投递到Kafka分区的方式。  **约束限制**：  - 目标库为Kafka时必填。 - partition_policy的可选取值受topic_policy约束：当topic_policy取0时可取0、1、2、3、4、5；当topic_policy取1时可取0、1、2、5；当topic_policy取2时可取0、1、2、3；当topic_policy取3时可取0、1；当topic_policy取4时可取0、1、3。  **取值范围**：  - 0：按库名.schema.表名的hash值投递到不同Partition - 1：全部投递到Partition 0 - 2：按主键的hash值投递到不同Partition - 3：按库名.schema的hash值投递到不同Partition  **默认取值**：  不涉及
     * @return partitionPolicy
     */
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

    /**
     * **参数解释**：  投送到Kafka的数据格式，指定同步到Kafka的数据序列化方式。  **约束限制**：  - MySQL到Kafka、TaurusDB到Kafka同步支持json和json_c。 - 其他引擎支持json和avro。  **取值范围**：  - json：JSON格式 - avro：Avro格式  **默认取值**：  json
     * @return kafkaDataFormat
     */
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

    /**
     * **参数解释**：  Topic名字格式，指定自动生成Topic名称时使用的命名模板。  **约束限制**：  - topic_policy为1、2、3时需要填写。 - PostgreSQL到Kafka、GaussDB集中式版到Kafka：topic_policy取1时支持database和schema变量，不填默认为$-$；取2时支持database变量，不填默认为$；取3时支持database、schema和tablename变量，不填默认为$-$-$。 - Oracle到Kafka：topic_policy取1时支持schema和tablename变量，不填默认为$-$；取3时支持schema变量，不填默认为$。 - MySQL到Kafka、TaurusDB到Kafka：topic_policy取1时支持database和tablename变量，不填默认为$-$。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return topicNameFormat
     */
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

    /**
     * **参数解释**：  Partition个数，指定Kafka Topic的分区数量。  **约束限制**：  - topic_policy为1、2、3时需要填写。  **取值范围**：  1-2147483647  **默认取值**：  1
     * @return partitionsNum
     */
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

    /**
     * **参数解释**：  副本个数，指定Kafka Topic的副本数量。  **约束限制**：  - topic_policy为1、2、3时需要填写。  **取值范围**：  1-32767  **默认取值**：  1
     * @return replicationFactor
     */
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

    /**
     * **参数解释**：  PostgreSQL同步全量阶段是否填充物化视图，指定全量同步时是否将源库物化视图的数据填充到目标库。  **约束限制**：  不涉及。  **取值范围**：  - true：填充物化视图 - false：不填充物化视图  **默认取值**：  false
     * @return isFillMaterializedView
     */
    public Boolean getIsFillMaterializedView() {
        return isFillMaterializedView;
    }

    public void setIsFillMaterializedView(Boolean isFillMaterializedView) {
        this.isFillMaterializedView = isFillMaterializedView;
    }

    public SyncPolicyReq withExportSnapshot(Boolean exportSnapshot) {
        this.exportSnapshot = exportSnapshot;
        return this;
    }

    /**
     * **参数解释**：  PostgreSQL同步全量阶段是否使用快照模式导出，指定全量同步时是否采用快照方式导出源库数据。  **约束限制**：  不涉及。  **取值范围**：  - true：使用快照模式导出 - false：不使用快照模式导出  **默认取值**：  false
     * @return exportSnapshot
     */
    public Boolean getExportSnapshot() {
        return exportSnapshot;
    }

    public void setExportSnapshot(Boolean exportSnapshot) {
        this.exportSnapshot = exportSnapshot;
    }

    public SyncPolicyReq withSlotName(String slotName) {
        this.slotName = slotName;
        return this;
    }

    /**
     * **参数解释**：  复制槽名称，指定PostgreSQL逻辑复制的复制槽标识。  **约束限制**：  - gaussdbv5ha-to-kafka主备任务必填。 - PostgreSQL为源的单增量同步任务选填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return slotName
     */
    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public SyncPolicyReq withFileAndPosition(String fileAndPosition) {
        this.fileAndPosition = fileAndPosition;
        return this;
    }

    /**
     * **参数解释**：  源库日志位点，指定增量同步的起始位点。  **约束限制**：  - MySQL为源时，通过show master status命令获取源库位点，格式为：文件名.文件编号:事件位点。文件名只能为1-60个字符且不能包含特殊字符，文件编号只能为3-20个数字，binlog事件位置只能为1-20个数字，且总长度不能超过100个字符。 - MongoDB为源时，位点需设置在oplog范围以内，格式为：timestamp:incre，timestamp和incre均为范围在1~2147483647之间的整数。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return fileAndPosition
     */
    public String getFileAndPosition() {
        return fileAndPosition;
    }

    public void setFileAndPosition(String fileAndPosition) {
        this.fileAndPosition = fileAndPosition;
    }

    public SyncPolicyReq withGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
        return this;
    }

    /**
     * **参数解释**：  MySQL GTID集合，指定增量同步的GTID起始位点。  **约束限制**：  - MySQL为源的任务需要填写，通过show master status命令获取源库位点，根据提示填写Executed_Gtid_Set。 - 如果源库为MySQL 5.5版本，则不支持使用同步任务。 - 不能包含特殊字符和中文，且不能超过2048个字符。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return gtidSet
     */
    public String getGtidSet() {
        return gtidSet;
    }

    public void setGtidSet(String gtidSet) {
        this.gtidSet = gtidSet;
    }

    public SyncPolicyReq withDdlTopic(String ddlTopic) {
        this.ddlTopic = ddlTopic;
        return this;
    }

    /**
     * **参数解释**：  存储DDL的Kafka Topic名称，指定DDL操作数据投递的目标Topic。  **约束限制**：  - Kafka为目标且ddl_trans为true时必填。 - 取值必须为目标库已存在的Topic名称，确保Topic已存在。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return ddlTopic
     */
    public String getDdlTopic() {
        return ddlTopic;
    }

    public void setDdlTopic(String ddlTopic) {
        this.ddlTopic = ddlTopic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncPolicyReq that = (SyncPolicyReq) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.conflictPolicy, that.conflictPolicy)
            && Objects.equals(this.filterDdlPolicy, that.filterDdlPolicy)
            && Objects.equals(this.ddlTrans, that.ddlTrans) && Objects.equals(this.indexTrans, that.indexTrans)
            && Objects.equals(this.topicPolicy, that.topicPolicy) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.partitionPolicy, that.partitionPolicy)
            && Objects.equals(this.kafkaDataFormat, that.kafkaDataFormat)
            && Objects.equals(this.topicNameFormat, that.topicNameFormat)
            && Objects.equals(this.partitionsNum, that.partitionsNum)
            && Objects.equals(this.replicationFactor, that.replicationFactor)
            && Objects.equals(this.isFillMaterializedView, that.isFillMaterializedView)
            && Objects.equals(this.exportSnapshot, that.exportSnapshot) && Objects.equals(this.slotName, that.slotName)
            && Objects.equals(this.fileAndPosition, that.fileAndPosition) && Objects.equals(this.gtidSet, that.gtidSet)
            && Objects.equals(this.ddlTopic, that.ddlTopic);
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
            exportSnapshot,
            slotName,
            fileAndPosition,
            gtidSet,
            ddlTopic);
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
        sb.append("    slotName: ").append(toIndentedString(slotName)).append("\n");
        sb.append("    fileAndPosition: ").append(toIndentedString(fileAndPosition)).append("\n");
        sb.append("    gtidSet: ").append(toIndentedString(gtidSet)).append("\n");
        sb.append("    ddlTopic: ").append(toIndentedString(ddlTopic)).append("\n");
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

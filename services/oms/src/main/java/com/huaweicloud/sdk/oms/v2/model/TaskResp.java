package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskResp
 */
public class TaskResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_policy")

    private List<BandwidthPolicyDto> bandwidthPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_size")

    private Long completeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_node")

    private DstNodeResp dstNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_failed_object_recording")

    private Boolean enableFailedObjectRecording;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_kms")

    private Boolean enableKms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_metadata_migration")

    private Boolean enableMetadataMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_restore")

    private Boolean enableRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private ErrorReasonResp errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_num")

    private Long failedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_object_record")

    private FailedObjectRecordDto failedObjectRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_query_over")

    private Boolean isQueryOver;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "left_time")

    private Long leftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_since")

    private Long migrateSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Long migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Double progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_size")

    private Long realSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_num")

    private Long skippedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_node")

    private SrcNodeResp srcNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successful_num")

    private Long successfulNum;

    /**
     * 任务类型，为空默认设置为object。 list：对象列表迁移 object：文件/文件夹迁移 prefix：对象前缀迁移 url_list: url对象列表
     */
    public static final class TaskTypeEnum {

        /**
         * Enum LIST for value: "list"
         */
        public static final TaskTypeEnum LIST = new TaskTypeEnum("list");

        /**
         * Enum OBJECT for value: "object"
         */
        public static final TaskTypeEnum OBJECT = new TaskTypeEnum("object");

        /**
         * Enum PREFIX for value: "prefix"
         */
        public static final TaskTypeEnum PREFIX = new TaskTypeEnum("prefix");

        /**
         * Enum URL_LIST for value: "url_list"
         */
        public static final TaskTypeEnum URL_LIST = new TaskTypeEnum("url_list");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("list", LIST);
            map.put("object", OBJECT);
            map.put("prefix", PREFIX);
            map.put("url_list", URL_LIST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskTypeEnum(String value) {
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
        public static TaskTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskTypeEnum) {
                return this.value.equals(((TaskTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private TaskTypeEnum taskType;

    /**
     * 分组类型 NORMAL_TASK：一般迁移任务 SYNC_TASK：同步任务所属迁移任务 GROUP_TASK：任务组所属迁移任务
     */
    public static final class GroupTypeEnum {

        /**
         * Enum NORMAL_TASK for value: "NORMAL_TASK"
         */
        public static final GroupTypeEnum NORMAL_TASK = new GroupTypeEnum("NORMAL_TASK");

        /**
         * Enum SYNC_TASK for value: "SYNC_TASK"
         */
        public static final GroupTypeEnum SYNC_TASK = new GroupTypeEnum("SYNC_TASK");

        /**
         * Enum GROUP_TASK for value: "GROUP_TASK"
         */
        public static final GroupTypeEnum GROUP_TASK = new GroupTypeEnum("GROUP_TASK");

        private static final Map<String, GroupTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GroupTypeEnum> createStaticFields() {
            Map<String, GroupTypeEnum> map = new HashMap<>();
            map.put("NORMAL_TASK", NORMAL_TASK);
            map.put("SYNC_TASK", SYNC_TASK);
            map.put("GROUP_TASK", GROUP_TASK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GroupTypeEnum(String value) {
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
        public static GroupTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GroupTypeEnum(value));
        }

        public static GroupTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GroupTypeEnum) {
                return this.value.equals(((GroupTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private GroupTypeEnum groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Long totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_info")

    private SmnInfo smnInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn")

    private SourceCdnResp sourceCdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_record_error_reason")

    private String successRecordErrorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_record_error_reason")

    private String skipRecordErrorReason;

    /**
     * 迁移前同名对象覆盖方式，用于迁移前判断源端与目的端有同名对象时，覆盖目的端或跳过迁移。默认SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE。 NO_OVERWRITE：不覆盖。迁移前源端对象与目的端对象同名时，不做对比直接跳过迁移。 SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE：大小/最后修改时间对比覆盖。默认配置。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象大小和最后修改时间，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。源端与目的端同名对象大小不相同，或目的端对象的最后修改时间晚于源端对象的最后修改时间(源端较新)，覆盖目的端。  CRC64_COMPARISON_OVERWRITE：CRC64对比覆盖。目前仅支持华为/阿里/腾讯。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象元数据中CRC64值是否相同，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE(大小/最后修改时间对比覆盖)来对比进行覆盖判断。 FULL_OVERWRITE：全覆盖。迁移前源端对象与目的端对象同名时，不做对比覆盖目的端。
     */
    public static final class ObjectOverwriteModeEnum {

        /**
         * Enum NO_OVERWRITE for value: "NO_OVERWRITE"
         */
        public static final ObjectOverwriteModeEnum NO_OVERWRITE = new ObjectOverwriteModeEnum("NO_OVERWRITE");

        /**
         * Enum SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE for value: "SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE"
         */
        public static final ObjectOverwriteModeEnum SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE =
            new ObjectOverwriteModeEnum("SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE");

        /**
         * Enum CRC64_COMPARISON_OVERWRITE for value: "CRC64_COMPARISON_OVERWRITE"
         */
        public static final ObjectOverwriteModeEnum CRC64_COMPARISON_OVERWRITE =
            new ObjectOverwriteModeEnum("CRC64_COMPARISON_OVERWRITE");

        /**
         * Enum FULL_OVERWRITE for value: "FULL_OVERWRITE"
         */
        public static final ObjectOverwriteModeEnum FULL_OVERWRITE = new ObjectOverwriteModeEnum("FULL_OVERWRITE");

        private static final Map<String, ObjectOverwriteModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectOverwriteModeEnum> createStaticFields() {
            Map<String, ObjectOverwriteModeEnum> map = new HashMap<>();
            map.put("NO_OVERWRITE", NO_OVERWRITE);
            map.put("SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE", SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE);
            map.put("CRC64_COMPARISON_OVERWRITE", CRC64_COMPARISON_OVERWRITE);
            map.put("FULL_OVERWRITE", FULL_OVERWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectOverwriteModeEnum(String value) {
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
        public static ObjectOverwriteModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectOverwriteModeEnum(value));
        }

        public static ObjectOverwriteModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectOverwriteModeEnum) {
                return this.value.equals(((ObjectOverwriteModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_overwrite_mode")

    private ObjectOverwriteModeEnum objectOverwriteMode;

    /**
     * 目的端存储类型设置，当且仅当目的端为华为云OBS时需要，默认为标准存储 STANDARD：华为云OBS标准存储 IA：华为云OBS低频存储 ARCHIVE：华为云OBS归档存储 DEEP_ARCHIVE：华为云OBS深度归档存储 SRC_STORAGE_MAPPING：保留源端存储类型，将源端存储类型映射为华为云OBS存储类型
     */
    public static final class DstStoragePolicyEnum {

        /**
         * Enum STANDARD for value: "STANDARD"
         */
        public static final DstStoragePolicyEnum STANDARD = new DstStoragePolicyEnum("STANDARD");

        /**
         * Enum IA for value: "IA"
         */
        public static final DstStoragePolicyEnum IA = new DstStoragePolicyEnum("IA");

        /**
         * Enum ARCHIVE for value: "ARCHIVE"
         */
        public static final DstStoragePolicyEnum ARCHIVE = new DstStoragePolicyEnum("ARCHIVE");

        /**
         * Enum DEEP_ARCHIVE for value: "DEEP_ARCHIVE"
         */
        public static final DstStoragePolicyEnum DEEP_ARCHIVE = new DstStoragePolicyEnum("DEEP_ARCHIVE");

        /**
         * Enum SRC_STORAGE_MAPPING for value: "SRC_STORAGE_MAPPING"
         */
        public static final DstStoragePolicyEnum SRC_STORAGE_MAPPING = new DstStoragePolicyEnum("SRC_STORAGE_MAPPING");

        private static final Map<String, DstStoragePolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DstStoragePolicyEnum> createStaticFields() {
            Map<String, DstStoragePolicyEnum> map = new HashMap<>();
            map.put("STANDARD", STANDARD);
            map.put("IA", IA);
            map.put("ARCHIVE", ARCHIVE);
            map.put("DEEP_ARCHIVE", DEEP_ARCHIVE);
            map.put("SRC_STORAGE_MAPPING", SRC_STORAGE_MAPPING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DstStoragePolicyEnum(String value) {
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
        public static DstStoragePolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DstStoragePolicyEnum(value));
        }

        public static DstStoragePolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DstStoragePolicyEnum) {
                return this.value.equals(((DstStoragePolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_storage_policy")

    private DstStoragePolicyEnum dstStoragePolicy;

    /**
     * 一致性校验方式，用于迁移前/后校验对象是否一致，所有校验方式需满足源端/目的端对象的加密状态一致，具体校验方式和校验结果可通过对象列表查看。默认size_last_modified。 size_last_modified：默认配置。迁移前后，通过对比源端和目的端对象大小+最后修改时间，判断对象是否已存在或迁移后数据是否完整。源端与目的端同名对象大小相同，且目的端对象的最后修改时间不早于源端对象的最后修改时间，则代表该对象已存在/迁移成功。 crc64：目前仅支持华为/阿里/腾讯。迁移前后，通过对比源端和目的端对象元数据中CRC64值是否相同，判断对象是否已存在/迁移完成。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用大小/最后修改时间校验方式来校验。 no_check：目前仅支持HTTP/HTTPS数据源。当源端对象无法通过标准http协议中content-length字段获取数据大小时，默认数据下载成功即迁移成功，不对数据做额外校验，且迁移时源端对象默认覆盖目的端同名对象。当源端对象能正常通过标准http协议中content-length字段获取数据大小时，则采用大小/最后修改时间校验方式来校验。
     */
    public static final class ConsistencyCheckEnum {

        /**
         * Enum SIZE_LAST_MODIFIED for value: "size_last_modified"
         */
        public static final ConsistencyCheckEnum SIZE_LAST_MODIFIED = new ConsistencyCheckEnum("size_last_modified");

        /**
         * Enum CRC64 for value: "crc64"
         */
        public static final ConsistencyCheckEnum CRC64 = new ConsistencyCheckEnum("crc64");

        /**
         * Enum NO_CHECK for value: "no_check"
         */
        public static final ConsistencyCheckEnum NO_CHECK = new ConsistencyCheckEnum("no_check");

        private static final Map<String, ConsistencyCheckEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistencyCheckEnum> createStaticFields() {
            Map<String, ConsistencyCheckEnum> map = new HashMap<>();
            map.put("size_last_modified", SIZE_LAST_MODIFIED);
            map.put("crc64", CRC64);
            map.put("no_check", NO_CHECK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistencyCheckEnum(String value) {
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
        public static ConsistencyCheckEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConsistencyCheckEnum(value));
        }

        public static ConsistencyCheckEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsistencyCheckEnum) {
                return this.value.equals(((ConsistencyCheckEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistency_check")

    private ConsistencyCheckEnum consistencyCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_requester_pays")

    private Boolean enableRequesterPays;

    /**
     * HIGH：高优先级 MEDIUM：中优先级 LOW：低优先级
     */
    public static final class TaskPriorityEnum {

        /**
         * Enum HIGH for value: "HIGH"
         */
        public static final TaskPriorityEnum HIGH = new TaskPriorityEnum("HIGH");

        /**
         * Enum MEDIUM for value: "MEDIUM"
         */
        public static final TaskPriorityEnum MEDIUM = new TaskPriorityEnum("MEDIUM");

        /**
         * Enum LOW for value: "LOW"
         */
        public static final TaskPriorityEnum LOW = new TaskPriorityEnum("LOW");

        private static final Map<String, TaskPriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskPriorityEnum> createStaticFields() {
            Map<String, TaskPriorityEnum> map = new HashMap<>();
            map.put("HIGH", HIGH);
            map.put("MEDIUM", MEDIUM);
            map.put("LOW", LOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskPriorityEnum(String value) {
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
        public static TaskPriorityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskPriorityEnum(value));
        }

        public static TaskPriorityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskPriorityEnum) {
                return this.value.equals(((TaskPriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_priority")

    private TaskPriorityEnum taskPriority;

    public TaskResp withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    public TaskResp addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public TaskResp withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /**
     * 流量控制策略，每个任务最多可设置5条限速策略。
     * @return bandwidthPolicy
     */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    public TaskResp withCompleteSize(Long completeSize) {
        this.completeSize = completeSize;
        return this;
    }

    /**
     * 任务迁移完成大小（Byte）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return completeSize
     */
    public Long getCompleteSize() {
        return completeSize;
    }

    public void setCompleteSize(Long completeSize) {
        this.completeSize = completeSize;
    }

    public TaskResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述，没有设置时为空字符串。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskResp withDstNode(DstNodeResp dstNode) {
        this.dstNode = dstNode;
        return this;
    }

    public TaskResp withDstNode(Consumer<DstNodeResp> dstNodeSetter) {
        if (this.dstNode == null) {
            this.dstNode = new DstNodeResp();
            dstNodeSetter.accept(this.dstNode);
        }

        return this;
    }

    /**
     * Get dstNode
     * @return dstNode
     */
    public DstNodeResp getDstNode() {
        return dstNode;
    }

    public void setDstNode(DstNodeResp dstNode) {
        this.dstNode = dstNode;
    }

    public TaskResp withEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
        return this;
    }

    /**
     * 是否记录失败对象。开启后，如果有迁移失败对象，会在目的端存储失败对象信息。
     * @return enableFailedObjectRecording
     */
    public Boolean getEnableFailedObjectRecording() {
        return enableFailedObjectRecording;
    }

    public void setEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
    }

    public TaskResp withEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }

    /**
     * 存储入OBS时是否使用KMS加密。
     * @return enableKms
     */
    public Boolean getEnableKms() {
        return enableKms;
    }

    public void setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
    }

    public TaskResp withEnableMetadataMigration(Boolean enableMetadataMigration) {
        this.enableMetadataMigration = enableMetadataMigration;
        return this;
    }

    /**
     * 是否启用元数据迁移，默认否。不启用时，为保证迁移任务正常运行，仍将为您迁移ContentType元数据。
     * @return enableMetadataMigration
     */
    public Boolean getEnableMetadataMigration() {
        return enableMetadataMigration;
    }

    public void setEnableMetadataMigration(Boolean enableMetadataMigration) {
        this.enableMetadataMigration = enableMetadataMigration;
    }

    public TaskResp withEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
        return this;
    }

    /**
     * 是否自动解冻归档数据，（由于对象存储解冻需要源端存储等待一定时间，开启自动解冻会对迁移速度有较大影响，建议先完成归档存储数据解冻后再启动迁移）。 开启后，如果遇到归档类型数据，会自动解冻再进行迁移；关闭后，如果遇到归档类型的对象直接跳过相应对象，系统默认对象迁移失败并记录相关信息到失败对象列表中。
     * @return enableRestore
     */
    public Boolean getEnableRestore() {
        return enableRestore;
    }

    public void setEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
    }

    public TaskResp withErrorReason(ErrorReasonResp errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    public TaskResp withErrorReason(Consumer<ErrorReasonResp> errorReasonSetter) {
        if (this.errorReason == null) {
            this.errorReason = new ErrorReasonResp();
            errorReasonSetter.accept(this.errorReason);
        }

        return this;
    }

    /**
     * Get errorReason
     * @return errorReason
     */
    public ErrorReasonResp getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(ErrorReasonResp errorReason) {
        this.errorReason = errorReason;
    }

    public TaskResp withFailedNum(Long failedNum) {
        this.failedNum = failedNum;
        return this;
    }

    /**
     * 迁移失败对象数量。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return failedNum
     */
    public Long getFailedNum() {
        return failedNum;
    }

    public void setFailedNum(Long failedNum) {
        this.failedNum = failedNum;
    }

    public TaskResp withFailedObjectRecord(FailedObjectRecordDto failedObjectRecord) {
        this.failedObjectRecord = failedObjectRecord;
        return this;
    }

    public TaskResp withFailedObjectRecord(Consumer<FailedObjectRecordDto> failedObjectRecordSetter) {
        if (this.failedObjectRecord == null) {
            this.failedObjectRecord = new FailedObjectRecordDto();
            failedObjectRecordSetter.accept(this.failedObjectRecord);
        }

        return this;
    }

    /**
     * Get failedObjectRecord
     * @return failedObjectRecord
     */
    public FailedObjectRecordDto getFailedObjectRecord() {
        return failedObjectRecord;
    }

    public void setFailedObjectRecord(FailedObjectRecordDto failedObjectRecord) {
        this.failedObjectRecord = failedObjectRecord;
    }

    public TaskResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 迁移任务组ID，当任务由迁移任务组创建时会包含迁移任务组的id信息。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TaskResp withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * minimum: 0
     * maximum: 999999999999999
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskResp withIsQueryOver(Boolean isQueryOver) {
        this.isQueryOver = isQueryOver;
        return this;
    }

    /**
     * 迁移任务是否完成源端对象统计数据扫描。
     * @return isQueryOver
     */
    public Boolean getIsQueryOver() {
        return isQueryOver;
    }

    public void setIsQueryOver(Boolean isQueryOver) {
        this.isQueryOver = isQueryOver;
    }

    public TaskResp withLeftTime(Long leftTime) {
        this.leftTime = leftTime;
        return this;
    }

    /**
     * 任务剩余时间（毫秒）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return leftTime
     */
    public Long getLeftTime() {
        return leftTime;
    }

    public void setLeftTime(Long leftTime) {
        this.leftTime = leftTime;
    }

    public TaskResp withMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
        return this;
    }

    /**
     * 迁移指定时间（时间戳，毫秒），表示仅迁移在指定时间之后修改的源端待迁移对象。默认为0，表示不设置迁移指定时间。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return migrateSince
     */
    public Long getMigrateSince() {
        return migrateSince;
    }

    public void setMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
    }

    public TaskResp withMigrateSpeed(Long migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /**
     * 任务迁移速度（Byte/s）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return migrateSpeed
     */
    public Long getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Long migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public TaskResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskResp withProgress(Double progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 任务进度，例如：0.522代表任务进度为52.2%，1代表任务进度为100%。
     * minimum: 0
     * maximum: 1
     * @return progress
     */
    public Double getProgress() {
        return progress;
    }

    public void setProgress(Double progress) {
        this.progress = progress;
    }

    public TaskResp withRealSize(Long realSize) {
        this.realSize = realSize;
        return this;
    }

    /**
     * 实际迁移对象总大小（Byte），忽略对象的大小不会统计在内。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return realSize
     */
    public Long getRealSize() {
        return realSize;
    }

    public void setRealSize(Long realSize) {
        this.realSize = realSize;
    }

    public TaskResp withSkippedNum(Long skippedNum) {
        this.skippedNum = skippedNum;
        return this;
    }

    /**
     * 迁移忽略对象数（存在以下两种情况会自动跳过：1.源端对象最后修改时间在迁移指定时间前；2.目的端已有该对象。）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return skippedNum
     */
    public Long getSkippedNum() {
        return skippedNum;
    }

    public void setSkippedNum(Long skippedNum) {
        this.skippedNum = skippedNum;
    }

    public TaskResp withSrcNode(SrcNodeResp srcNode) {
        this.srcNode = srcNode;
        return this;
    }

    public TaskResp withSrcNode(Consumer<SrcNodeResp> srcNodeSetter) {
        if (this.srcNode == null) {
            this.srcNode = new SrcNodeResp();
            srcNodeSetter.accept(this.srcNode);
        }

        return this;
    }

    /**
     * Get srcNode
     * @return srcNode
     */
    public SrcNodeResp getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(SrcNodeResp srcNode) {
        this.srcNode = srcNode;
    }

    public TaskResp withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 任务启动时间（Unix时间戳，毫秒）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public TaskResp withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 1：等待调度 2：正在执行 3：停止 4：失败 5：成功 6：重试中 7：暂停中
     * minimum: 1
     * maximum: 7
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public TaskResp withSuccessfulNum(Long successfulNum) {
        this.successfulNum = successfulNum;
        return this;
    }

    /**
     * 迁移成功对象数量。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return successfulNum
     */
    public Long getSuccessfulNum() {
        return successfulNum;
    }

    public void setSuccessfulNum(Long successfulNum) {
        this.successfulNum = successfulNum;
    }

    public TaskResp withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，为空默认设置为object。 list：对象列表迁移 object：文件/文件夹迁移 prefix：对象前缀迁移 url_list: url对象列表
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public TaskResp withGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * 分组类型 NORMAL_TASK：一般迁移任务 SYNC_TASK：同步任务所属迁移任务 GROUP_TASK：任务组所属迁移任务
     * @return groupType
     */
    public GroupTypeEnum getGroupType() {
        return groupType;
    }

    public void setGroupType(GroupTypeEnum groupType) {
        this.groupType = groupType;
    }

    public TaskResp withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 迁移任务对象总数量。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalNum
     */
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
    }

    public TaskResp withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 任务迁移总大小（Byte）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalSize
     */
    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public TaskResp withTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * 任务总耗时（毫秒）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalTime
     */
    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public TaskResp withSmnInfo(SmnInfo smnInfo) {
        this.smnInfo = smnInfo;
        return this;
    }

    public TaskResp withSmnInfo(Consumer<SmnInfo> smnInfoSetter) {
        if (this.smnInfo == null) {
            this.smnInfo = new SmnInfo();
            smnInfoSetter.accept(this.smnInfo);
        }

        return this;
    }

    /**
     * Get smnInfo
     * @return smnInfo
     */
    public SmnInfo getSmnInfo() {
        return smnInfo;
    }

    public void setSmnInfo(SmnInfo smnInfo) {
        this.smnInfo = smnInfo;
    }

    public TaskResp withSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public TaskResp withSourceCdn(Consumer<SourceCdnResp> sourceCdnSetter) {
        if (this.sourceCdn == null) {
            this.sourceCdn = new SourceCdnResp();
            sourceCdnSetter.accept(this.sourceCdn);
        }

        return this;
    }

    /**
     * Get sourceCdn
     * @return sourceCdn
     */
    public SourceCdnResp getSourceCdn() {
        return sourceCdn;
    }

    public void setSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
    }

    public TaskResp withSuccessRecordErrorReason(String successRecordErrorReason) {
        this.successRecordErrorReason = successRecordErrorReason;
        return this;
    }

    /**
     * 迁移成功对象列表记录失败错误码，记录成功时为空
     * @return successRecordErrorReason
     */
    public String getSuccessRecordErrorReason() {
        return successRecordErrorReason;
    }

    public void setSuccessRecordErrorReason(String successRecordErrorReason) {
        this.successRecordErrorReason = successRecordErrorReason;
    }

    public TaskResp withSkipRecordErrorReason(String skipRecordErrorReason) {
        this.skipRecordErrorReason = skipRecordErrorReason;
        return this;
    }

    /**
     * 迁移忽略对象列表记录失败错误码,记录记录成功时为空。
     * @return skipRecordErrorReason
     */
    public String getSkipRecordErrorReason() {
        return skipRecordErrorReason;
    }

    public void setSkipRecordErrorReason(String skipRecordErrorReason) {
        this.skipRecordErrorReason = skipRecordErrorReason;
    }

    public TaskResp withObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
        this.objectOverwriteMode = objectOverwriteMode;
        return this;
    }

    /**
     * 迁移前同名对象覆盖方式，用于迁移前判断源端与目的端有同名对象时，覆盖目的端或跳过迁移。默认SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE。 NO_OVERWRITE：不覆盖。迁移前源端对象与目的端对象同名时，不做对比直接跳过迁移。 SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE：大小/最后修改时间对比覆盖。默认配置。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象大小和最后修改时间，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。源端与目的端同名对象大小不相同，或目的端对象的最后修改时间晚于源端对象的最后修改时间(源端较新)，覆盖目的端。  CRC64_COMPARISON_OVERWRITE：CRC64对比覆盖。目前仅支持华为/阿里/腾讯。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象元数据中CRC64值是否相同，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE(大小/最后修改时间对比覆盖)来对比进行覆盖判断。 FULL_OVERWRITE：全覆盖。迁移前源端对象与目的端对象同名时，不做对比覆盖目的端。
     * @return objectOverwriteMode
     */
    public ObjectOverwriteModeEnum getObjectOverwriteMode() {
        return objectOverwriteMode;
    }

    public void setObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
        this.objectOverwriteMode = objectOverwriteMode;
    }

    public TaskResp withDstStoragePolicy(DstStoragePolicyEnum dstStoragePolicy) {
        this.dstStoragePolicy = dstStoragePolicy;
        return this;
    }

    /**
     * 目的端存储类型设置，当且仅当目的端为华为云OBS时需要，默认为标准存储 STANDARD：华为云OBS标准存储 IA：华为云OBS低频存储 ARCHIVE：华为云OBS归档存储 DEEP_ARCHIVE：华为云OBS深度归档存储 SRC_STORAGE_MAPPING：保留源端存储类型，将源端存储类型映射为华为云OBS存储类型
     * @return dstStoragePolicy
     */
    public DstStoragePolicyEnum getDstStoragePolicy() {
        return dstStoragePolicy;
    }

    public void setDstStoragePolicy(DstStoragePolicyEnum dstStoragePolicy) {
        this.dstStoragePolicy = dstStoragePolicy;
    }

    public TaskResp withConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
        this.consistencyCheck = consistencyCheck;
        return this;
    }

    /**
     * 一致性校验方式，用于迁移前/后校验对象是否一致，所有校验方式需满足源端/目的端对象的加密状态一致，具体校验方式和校验结果可通过对象列表查看。默认size_last_modified。 size_last_modified：默认配置。迁移前后，通过对比源端和目的端对象大小+最后修改时间，判断对象是否已存在或迁移后数据是否完整。源端与目的端同名对象大小相同，且目的端对象的最后修改时间不早于源端对象的最后修改时间，则代表该对象已存在/迁移成功。 crc64：目前仅支持华为/阿里/腾讯。迁移前后，通过对比源端和目的端对象元数据中CRC64值是否相同，判断对象是否已存在/迁移完成。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用大小/最后修改时间校验方式来校验。 no_check：目前仅支持HTTP/HTTPS数据源。当源端对象无法通过标准http协议中content-length字段获取数据大小时，默认数据下载成功即迁移成功，不对数据做额外校验，且迁移时源端对象默认覆盖目的端同名对象。当源端对象能正常通过标准http协议中content-length字段获取数据大小时，则采用大小/最后修改时间校验方式来校验。
     * @return consistencyCheck
     */
    public ConsistencyCheckEnum getConsistencyCheck() {
        return consistencyCheck;
    }

    public void setConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
        this.consistencyCheck = consistencyCheck;
    }

    public TaskResp withEnableRequesterPays(Boolean enableRequesterPays) {
        this.enableRequesterPays = enableRequesterPays;
        return this;
    }

    /**
     * 是否开启请求者付款，在启用后，请求者支付请求和数据传输费用。
     * @return enableRequesterPays
     */
    public Boolean getEnableRequesterPays() {
        return enableRequesterPays;
    }

    public void setEnableRequesterPays(Boolean enableRequesterPays) {
        this.enableRequesterPays = enableRequesterPays;
    }

    public TaskResp withTaskPriority(TaskPriorityEnum taskPriority) {
        this.taskPriority = taskPriority;
        return this;
    }

    /**
     * HIGH：高优先级 MEDIUM：中优先级 LOW：低优先级
     * @return taskPriority
     */
    public TaskPriorityEnum getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriorityEnum taskPriority) {
        this.taskPriority = taskPriority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskResp that = (TaskResp) obj;
        return Objects.equals(this.bandwidthPolicy, that.bandwidthPolicy)
            && Objects.equals(this.completeSize, that.completeSize)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dstNode, that.dstNode)
            && Objects.equals(this.enableFailedObjectRecording, that.enableFailedObjectRecording)
            && Objects.equals(this.enableKms, that.enableKms)
            && Objects.equals(this.enableMetadataMigration, that.enableMetadataMigration)
            && Objects.equals(this.enableRestore, that.enableRestore)
            && Objects.equals(this.errorReason, that.errorReason) && Objects.equals(this.failedNum, that.failedNum)
            && Objects.equals(this.failedObjectRecord, that.failedObjectRecord)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isQueryOver, that.isQueryOver) && Objects.equals(this.leftTime, that.leftTime)
            && Objects.equals(this.migrateSince, that.migrateSince)
            && Objects.equals(this.migrateSpeed, that.migrateSpeed) && Objects.equals(this.name, that.name)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.realSize, that.realSize)
            && Objects.equals(this.skippedNum, that.skippedNum) && Objects.equals(this.srcNode, that.srcNode)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.successfulNum, that.successfulNum) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.groupType, that.groupType) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.totalSize, that.totalSize) && Objects.equals(this.totalTime, that.totalTime)
            && Objects.equals(this.smnInfo, that.smnInfo) && Objects.equals(this.sourceCdn, that.sourceCdn)
            && Objects.equals(this.successRecordErrorReason, that.successRecordErrorReason)
            && Objects.equals(this.skipRecordErrorReason, that.skipRecordErrorReason)
            && Objects.equals(this.objectOverwriteMode, that.objectOverwriteMode)
            && Objects.equals(this.dstStoragePolicy, that.dstStoragePolicy)
            && Objects.equals(this.consistencyCheck, that.consistencyCheck)
            && Objects.equals(this.enableRequesterPays, that.enableRequesterPays)
            && Objects.equals(this.taskPriority, that.taskPriority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandwidthPolicy,
            completeSize,
            description,
            dstNode,
            enableFailedObjectRecording,
            enableKms,
            enableMetadataMigration,
            enableRestore,
            errorReason,
            failedNum,
            failedObjectRecord,
            groupId,
            id,
            isQueryOver,
            leftTime,
            migrateSince,
            migrateSpeed,
            name,
            progress,
            realSize,
            skippedNum,
            srcNode,
            startTime,
            status,
            successfulNum,
            taskType,
            groupType,
            totalNum,
            totalSize,
            totalTime,
            smnInfo,
            sourceCdn,
            successRecordErrorReason,
            skipRecordErrorReason,
            objectOverwriteMode,
            dstStoragePolicy,
            consistencyCheck,
            enableRequesterPays,
            taskPriority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResp {\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
        sb.append("    completeSize: ").append(toIndentedString(completeSize)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dstNode: ").append(toIndentedString(dstNode)).append("\n");
        sb.append("    enableFailedObjectRecording: ")
            .append(toIndentedString(enableFailedObjectRecording))
            .append("\n");
        sb.append("    enableKms: ").append(toIndentedString(enableKms)).append("\n");
        sb.append("    enableMetadataMigration: ").append(toIndentedString(enableMetadataMigration)).append("\n");
        sb.append("    enableRestore: ").append(toIndentedString(enableRestore)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    failedNum: ").append(toIndentedString(failedNum)).append("\n");
        sb.append("    failedObjectRecord: ").append(toIndentedString(failedObjectRecord)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isQueryOver: ").append(toIndentedString(isQueryOver)).append("\n");
        sb.append("    leftTime: ").append(toIndentedString(leftTime)).append("\n");
        sb.append("    migrateSince: ").append(toIndentedString(migrateSince)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    realSize: ").append(toIndentedString(realSize)).append("\n");
        sb.append("    skippedNum: ").append(toIndentedString(skippedNum)).append("\n");
        sb.append("    srcNode: ").append(toIndentedString(srcNode)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    successfulNum: ").append(toIndentedString(successfulNum)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    smnInfo: ").append(toIndentedString(smnInfo)).append("\n");
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
        sb.append("    successRecordErrorReason: ").append(toIndentedString(successRecordErrorReason)).append("\n");
        sb.append("    skipRecordErrorReason: ").append(toIndentedString(skipRecordErrorReason)).append("\n");
        sb.append("    objectOverwriteMode: ").append(toIndentedString(objectOverwriteMode)).append("\n");
        sb.append("    dstStoragePolicy: ").append(toIndentedString(dstStoragePolicy)).append("\n");
        sb.append("    consistencyCheck: ").append(toIndentedString(consistencyCheck)).append("\n");
        sb.append("    enableRequesterPays: ").append(toIndentedString(enableRequesterPays)).append("\n");
        sb.append("    taskPriority: ").append(toIndentedString(taskPriority)).append("\n");
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

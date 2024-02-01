package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskGroupResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private ErrorReasonResp errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_node")

    private TaskGroupSrcNodeResp srcNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_node")

    private TaskGroupDstNodeResp dstNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_metadata_migration")

    private Boolean enableMetadataMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_failed_object_recording")

    private Boolean enableFailedObjectRecording;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_restore")

    private Boolean enableRestore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_kms")

    private Boolean enableKms;

    /**
     * 任务类型，默认为PREFIX。 LIST：对象列表迁移 URL_LIST：URL列表迁移， PREFIX：对象前缀迁移
     */
    public static final class TaskTypeEnum {

        /**
         * Enum LIST for value: "LIST"
         */
        public static final TaskTypeEnum LIST = new TaskTypeEnum("LIST");

        /**
         * Enum URL_LIST for value: "URL_LIST"
         */
        public static final TaskTypeEnum URL_LIST = new TaskTypeEnum("URL_LIST");

        /**
         * Enum PREFIX for value: "PREFIX"
         */
        public static final TaskTypeEnum PREFIX = new TaskTypeEnum("PREFIX");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("LIST", LIST);
            map.put("URL_LIST", URL_LIST);
            map.put("PREFIX", PREFIX);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth_policy")

    private List<BandwidthPolicyDto> bandwidthPolicy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_config")

    private SmnInfo smnConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn")

    private SourceCdnResp sourceCdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_since")

    private Long migrateSince;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Long migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Long totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_task_num")

    private Long totalTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_task_num")

    private Long createTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_task_num")

    private Long failedTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_task_num")

    private Long completeTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paused_task_num")

    private Long pausedTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executing_task_num")

    private Long executingTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_task_num")

    private Long waitingTaskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Long totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_complete_num")

    private Long createCompleteNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_num")

    private Long successNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_num")

    private Long failNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_num")

    private Long skipNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Long totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_complete_size")

    private Long createCompleteSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_size")

    private Long completeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_object_record")

    private FailedObjectRecordDto failedObjectRecord;

    /**
     * 迁移前同名对象覆盖方式，用于迁移前判断源端与目的端有同名对象时，覆盖目的端或跳过迁移。默认SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE。 NO_OVERWRITE：不覆盖。迁移前源端对象与目的端对象同名时，不做对比直接跳过迁移。 SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE：大小/最后修改时间对比覆盖。默认配置。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象大小和最后修改时间，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。源端与目的端同名对象大小不相同，或目的端对象的最后修改时间晚于源端对象的最后修改时间(源端较新)，覆盖目的端。 CRC64_COMPARISON_OVERWRITE：CRC64对比覆盖。目前仅支持华为/阿里/腾讯。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象元数据中CRC64值是否相同，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE(大小/最后修改时间对比覆盖)来对比进行覆盖判断。 FULL_OVERWRITE：全覆盖。迁移前源端对象与目的端对象同名时，不做对比覆盖目的端。
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

    public ShowTaskGroupResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 任务组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowTaskGroupResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 迁移组任务状态。 0 – 等待中 1 – 执行中/创建中 2 – 监控任务执行 3 – 暂停 4 – 创建任务失败 5 – 迁移失败 6 – 迁移完成 7 – 暂停中 8 – 等待删除中 9 – 删除
     * minimum: 0
     * maximum: 9
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTaskGroupResponse withErrorReason(ErrorReasonResp errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    public ShowTaskGroupResponse withErrorReason(Consumer<ErrorReasonResp> errorReasonSetter) {
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

    public ShowTaskGroupResponse withSrcNode(TaskGroupSrcNodeResp srcNode) {
        this.srcNode = srcNode;
        return this;
    }

    public ShowTaskGroupResponse withSrcNode(Consumer<TaskGroupSrcNodeResp> srcNodeSetter) {
        if (this.srcNode == null) {
            this.srcNode = new TaskGroupSrcNodeResp();
            srcNodeSetter.accept(this.srcNode);
        }

        return this;
    }

    /**
     * Get srcNode
     * @return srcNode
     */
    public TaskGroupSrcNodeResp getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(TaskGroupSrcNodeResp srcNode) {
        this.srcNode = srcNode;
    }

    public ShowTaskGroupResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述，不能超过255个字符，且不能包含^<>&\"'等特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTaskGroupResponse withDstNode(TaskGroupDstNodeResp dstNode) {
        this.dstNode = dstNode;
        return this;
    }

    public ShowTaskGroupResponse withDstNode(Consumer<TaskGroupDstNodeResp> dstNodeSetter) {
        if (this.dstNode == null) {
            this.dstNode = new TaskGroupDstNodeResp();
            dstNodeSetter.accept(this.dstNode);
        }

        return this;
    }

    /**
     * Get dstNode
     * @return dstNode
     */
    public TaskGroupDstNodeResp getDstNode() {
        return dstNode;
    }

    public void setDstNode(TaskGroupDstNodeResp dstNode) {
        this.dstNode = dstNode;
    }

    public ShowTaskGroupResponse withEnableMetadataMigration(Boolean enableMetadataMigration) {
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

    public ShowTaskGroupResponse withEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
        return this;
    }

    /**
     * 是否开启记录失败对象
     * @return enableFailedObjectRecording
     */
    public Boolean getEnableFailedObjectRecording() {
        return enableFailedObjectRecording;
    }

    public void setEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
        this.enableFailedObjectRecording = enableFailedObjectRecording;
    }

    public ShowTaskGroupResponse withEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
        return this;
    }

    /**
     * 是否自动解冻归档数据，（由于对象存储解冻需要源端存储等待一定时间，开启自动解冻会对迁移速度有较大影响，建议先完成归档存储数据解冻后再启动迁移）。 开启后，如果遇到归档类型数据，会自动解冻再进行迁移；如果遇到归档类型的对象直接跳过相应对象，系统默认对象迁移失败并记录相关信息到失败对象列表中。
     * @return enableRestore
     */
    public Boolean getEnableRestore() {
        return enableRestore;
    }

    public void setEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
    }

    public ShowTaskGroupResponse withEnableKms(Boolean enableKms) {
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

    public ShowTaskGroupResponse withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，默认为PREFIX。 LIST：对象列表迁移 URL_LIST：URL列表迁移， PREFIX：对象前缀迁移
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ShowTaskGroupResponse withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    public ShowTaskGroupResponse addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public ShowTaskGroupResponse withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        bandwidthPolicySetter.accept(this.bandwidthPolicy);
        return this;
    }

    /**
     * 配置流量控制策略。数组中一个元素对应一个时段的最大带宽，最多允许5个时段，且时段不能重叠。
     * @return bandwidthPolicy
     */
    public List<BandwidthPolicyDto> getBandwidthPolicy() {
        return bandwidthPolicy;
    }

    public void setBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
    }

    public ShowTaskGroupResponse withSmnConfig(SmnInfo smnConfig) {
        this.smnConfig = smnConfig;
        return this;
    }

    public ShowTaskGroupResponse withSmnConfig(Consumer<SmnInfo> smnConfigSetter) {
        if (this.smnConfig == null) {
            this.smnConfig = new SmnInfo();
            smnConfigSetter.accept(this.smnConfig);
        }

        return this;
    }

    /**
     * Get smnConfig
     * @return smnConfig
     */
    public SmnInfo getSmnConfig() {
        return smnConfig;
    }

    public void setSmnConfig(SmnInfo smnConfig) {
        this.smnConfig = smnConfig;
    }

    public ShowTaskGroupResponse withSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public ShowTaskGroupResponse withSourceCdn(Consumer<SourceCdnResp> sourceCdnSetter) {
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

    public ShowTaskGroupResponse withMigrateSince(Long migrateSince) {
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

    public ShowTaskGroupResponse withMigrateSpeed(Long migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /**
     * 任务组迁移速度（Byte/s）
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

    public ShowTaskGroupResponse withTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * 迁移任务组总耗时(毫秒)
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

    public ShowTaskGroupResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 迁移任务组的启动时间(Unix时间戳，毫秒)
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

    public ShowTaskGroupResponse withTotalTaskNum(Long totalTaskNum) {
        this.totalTaskNum = totalTaskNum;
        return this;
    }

    /**
     * 任务组包含的迁移任务总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalTaskNum
     */
    public Long getTotalTaskNum() {
        return totalTaskNum;
    }

    public void setTotalTaskNum(Long totalTaskNum) {
        this.totalTaskNum = totalTaskNum;
    }

    public ShowTaskGroupResponse withCreateTaskNum(Long createTaskNum) {
        this.createTaskNum = createTaskNum;
        return this;
    }

    /**
     * 已创建的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTaskNum
     */
    public Long getCreateTaskNum() {
        return createTaskNum;
    }

    public void setCreateTaskNum(Long createTaskNum) {
        this.createTaskNum = createTaskNum;
    }

    public ShowTaskGroupResponse withFailedTaskNum(Long failedTaskNum) {
        this.failedTaskNum = failedTaskNum;
        return this;
    }

    /**
     * 失败的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return failedTaskNum
     */
    public Long getFailedTaskNum() {
        return failedTaskNum;
    }

    public void setFailedTaskNum(Long failedTaskNum) {
        this.failedTaskNum = failedTaskNum;
    }

    public ShowTaskGroupResponse withCompleteTaskNum(Long completeTaskNum) {
        this.completeTaskNum = completeTaskNum;
        return this;
    }

    /**
     * 已完成的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return completeTaskNum
     */
    public Long getCompleteTaskNum() {
        return completeTaskNum;
    }

    public void setCompleteTaskNum(Long completeTaskNum) {
        this.completeTaskNum = completeTaskNum;
    }

    public ShowTaskGroupResponse withPausedTaskNum(Long pausedTaskNum) {
        this.pausedTaskNum = pausedTaskNum;
        return this;
    }

    /**
     * 暂停的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return pausedTaskNum
     */
    public Long getPausedTaskNum() {
        return pausedTaskNum;
    }

    public void setPausedTaskNum(Long pausedTaskNum) {
        this.pausedTaskNum = pausedTaskNum;
    }

    public ShowTaskGroupResponse withExecutingTaskNum(Long executingTaskNum) {
        this.executingTaskNum = executingTaskNum;
        return this;
    }

    /**
     * 正在运行的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return executingTaskNum
     */
    public Long getExecutingTaskNum() {
        return executingTaskNum;
    }

    public void setExecutingTaskNum(Long executingTaskNum) {
        this.executingTaskNum = executingTaskNum;
    }

    public ShowTaskGroupResponse withWaitingTaskNum(Long waitingTaskNum) {
        this.waitingTaskNum = waitingTaskNum;
        return this;
    }

    /**
     * 等待中的迁移任务数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return waitingTaskNum
     */
    public Long getWaitingTaskNum() {
        return waitingTaskNum;
    }

    public void setWaitingTaskNum(Long waitingTaskNum) {
        this.waitingTaskNum = waitingTaskNum;
    }

    public ShowTaskGroupResponse withTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 迁移任务组包含的对象总数量
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

    public ShowTaskGroupResponse withCreateCompleteNum(Long createCompleteNum) {
        this.createCompleteNum = createCompleteNum;
        return this;
    }

    /**
     * 已完成任务创建的对象总数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createCompleteNum
     */
    public Long getCreateCompleteNum() {
        return createCompleteNum;
    }

    public void setCreateCompleteNum(Long createCompleteNum) {
        this.createCompleteNum = createCompleteNum;
    }

    public ShowTaskGroupResponse withSuccessNum(Long successNum) {
        this.successNum = successNum;
        return this;
    }

    /**
     * 成功的对象数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return successNum
     */
    public Long getSuccessNum() {
        return successNum;
    }

    public void setSuccessNum(Long successNum) {
        this.successNum = successNum;
    }

    public ShowTaskGroupResponse withFailNum(Long failNum) {
        this.failNum = failNum;
        return this;
    }

    /**
     * 失败的对象数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return failNum
     */
    public Long getFailNum() {
        return failNum;
    }

    public void setFailNum(Long failNum) {
        this.failNum = failNum;
    }

    public ShowTaskGroupResponse withSkipNum(Long skipNum) {
        this.skipNum = skipNum;
        return this;
    }

    /**
     * 忽略的对象数量
     * minimum: 0
     * maximum: 9223372036854775807
     * @return skipNum
     */
    public Long getSkipNum() {
        return skipNum;
    }

    public void setSkipNum(Long skipNum) {
        this.skipNum = skipNum;
    }

    public ShowTaskGroupResponse withTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 任务迁移总大小(Byte)
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

    public ShowTaskGroupResponse withCreateCompleteSize(Long createCompleteSize) {
        this.createCompleteSize = createCompleteSize;
        return this;
    }

    /**
     * 已创建迁移任务包含的对象总大小(Byte)
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createCompleteSize
     */
    public Long getCreateCompleteSize() {
        return createCompleteSize;
    }

    public void setCreateCompleteSize(Long createCompleteSize) {
        this.createCompleteSize = createCompleteSize;
    }

    public ShowTaskGroupResponse withCompleteSize(Long completeSize) {
        this.completeSize = completeSize;
        return this;
    }

    /**
     * 已迁移成功的对象总大小(Byte)
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

    public ShowTaskGroupResponse withFailedObjectRecord(FailedObjectRecordDto failedObjectRecord) {
        this.failedObjectRecord = failedObjectRecord;
        return this;
    }

    public ShowTaskGroupResponse withFailedObjectRecord(Consumer<FailedObjectRecordDto> failedObjectRecordSetter) {
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

    public ShowTaskGroupResponse withObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
        this.objectOverwriteMode = objectOverwriteMode;
        return this;
    }

    /**
     * 迁移前同名对象覆盖方式，用于迁移前判断源端与目的端有同名对象时，覆盖目的端或跳过迁移。默认SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE。 NO_OVERWRITE：不覆盖。迁移前源端对象与目的端对象同名时，不做对比直接跳过迁移。 SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE：大小/最后修改时间对比覆盖。默认配置。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象大小和最后修改时间，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。源端与目的端同名对象大小不相同，或目的端对象的最后修改时间晚于源端对象的最后修改时间(源端较新)，覆盖目的端。 CRC64_COMPARISON_OVERWRITE：CRC64对比覆盖。目前仅支持华为/阿里/腾讯。迁移前源端对象与目的端对象同名时，通过对比源端和目的端对象元数据中CRC64值是否相同，判断是否覆盖目的端，需满足源端/目的端对象的加密状态一致。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用SIZE_LAST_MODIFIED_COMPARISON_OVERWRITE(大小/最后修改时间对比覆盖)来对比进行覆盖判断。 FULL_OVERWRITE：全覆盖。迁移前源端对象与目的端对象同名时，不做对比覆盖目的端。
     * @return objectOverwriteMode
     */
    public ObjectOverwriteModeEnum getObjectOverwriteMode() {
        return objectOverwriteMode;
    }

    public void setObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
        this.objectOverwriteMode = objectOverwriteMode;
    }

    public ShowTaskGroupResponse withDstStoragePolicy(DstStoragePolicyEnum dstStoragePolicy) {
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

    public ShowTaskGroupResponse withConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
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

    public ShowTaskGroupResponse withEnableRequesterPays(Boolean enableRequesterPays) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskGroupResponse that = (ShowTaskGroupResponse) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorReason, that.errorReason) && Objects.equals(this.srcNode, that.srcNode)
            && Objects.equals(this.description, that.description) && Objects.equals(this.dstNode, that.dstNode)
            && Objects.equals(this.enableMetadataMigration, that.enableMetadataMigration)
            && Objects.equals(this.enableFailedObjectRecording, that.enableFailedObjectRecording)
            && Objects.equals(this.enableRestore, that.enableRestore) && Objects.equals(this.enableKms, that.enableKms)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.bandwidthPolicy, that.bandwidthPolicy)
            && Objects.equals(this.smnConfig, that.smnConfig) && Objects.equals(this.sourceCdn, that.sourceCdn)
            && Objects.equals(this.migrateSince, that.migrateSince)
            && Objects.equals(this.migrateSpeed, that.migrateSpeed) && Objects.equals(this.totalTime, that.totalTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.totalTaskNum, that.totalTaskNum)
            && Objects.equals(this.createTaskNum, that.createTaskNum)
            && Objects.equals(this.failedTaskNum, that.failedTaskNum)
            && Objects.equals(this.completeTaskNum, that.completeTaskNum)
            && Objects.equals(this.pausedTaskNum, that.pausedTaskNum)
            && Objects.equals(this.executingTaskNum, that.executingTaskNum)
            && Objects.equals(this.waitingTaskNum, that.waitingTaskNum) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.createCompleteNum, that.createCompleteNum)
            && Objects.equals(this.successNum, that.successNum) && Objects.equals(this.failNum, that.failNum)
            && Objects.equals(this.skipNum, that.skipNum) && Objects.equals(this.totalSize, that.totalSize)
            && Objects.equals(this.createCompleteSize, that.createCompleteSize)
            && Objects.equals(this.completeSize, that.completeSize)
            && Objects.equals(this.failedObjectRecord, that.failedObjectRecord)
            && Objects.equals(this.objectOverwriteMode, that.objectOverwriteMode)
            && Objects.equals(this.dstStoragePolicy, that.dstStoragePolicy)
            && Objects.equals(this.consistencyCheck, that.consistencyCheck)
            && Objects.equals(this.enableRequesterPays, that.enableRequesterPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            status,
            errorReason,
            srcNode,
            description,
            dstNode,
            enableMetadataMigration,
            enableFailedObjectRecording,
            enableRestore,
            enableKms,
            taskType,
            bandwidthPolicy,
            smnConfig,
            sourceCdn,
            migrateSince,
            migrateSpeed,
            totalTime,
            startTime,
            totalTaskNum,
            createTaskNum,
            failedTaskNum,
            completeTaskNum,
            pausedTaskNum,
            executingTaskNum,
            waitingTaskNum,
            totalNum,
            createCompleteNum,
            successNum,
            failNum,
            skipNum,
            totalSize,
            createCompleteSize,
            completeSize,
            failedObjectRecord,
            objectOverwriteMode,
            dstStoragePolicy,
            consistencyCheck,
            enableRequesterPays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskGroupResponse {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    srcNode: ").append(toIndentedString(srcNode)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dstNode: ").append(toIndentedString(dstNode)).append("\n");
        sb.append("    enableMetadataMigration: ").append(toIndentedString(enableMetadataMigration)).append("\n");
        sb.append("    enableFailedObjectRecording: ")
            .append(toIndentedString(enableFailedObjectRecording))
            .append("\n");
        sb.append("    enableRestore: ").append(toIndentedString(enableRestore)).append("\n");
        sb.append("    enableKms: ").append(toIndentedString(enableKms)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    bandwidthPolicy: ").append(toIndentedString(bandwidthPolicy)).append("\n");
        sb.append("    smnConfig: ").append(toIndentedString(smnConfig)).append("\n");
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
        sb.append("    migrateSince: ").append(toIndentedString(migrateSince)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    totalTaskNum: ").append(toIndentedString(totalTaskNum)).append("\n");
        sb.append("    createTaskNum: ").append(toIndentedString(createTaskNum)).append("\n");
        sb.append("    failedTaskNum: ").append(toIndentedString(failedTaskNum)).append("\n");
        sb.append("    completeTaskNum: ").append(toIndentedString(completeTaskNum)).append("\n");
        sb.append("    pausedTaskNum: ").append(toIndentedString(pausedTaskNum)).append("\n");
        sb.append("    executingTaskNum: ").append(toIndentedString(executingTaskNum)).append("\n");
        sb.append("    waitingTaskNum: ").append(toIndentedString(waitingTaskNum)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    createCompleteNum: ").append(toIndentedString(createCompleteNum)).append("\n");
        sb.append("    successNum: ").append(toIndentedString(successNum)).append("\n");
        sb.append("    failNum: ").append(toIndentedString(failNum)).append("\n");
        sb.append("    skipNum: ").append(toIndentedString(skipNum)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    createCompleteSize: ").append(toIndentedString(createCompleteSize)).append("\n");
        sb.append("    completeSize: ").append(toIndentedString(completeSize)).append("\n");
        sb.append("    failedObjectRecord: ").append(toIndentedString(failedObjectRecord)).append("\n");
        sb.append("    objectOverwriteMode: ").append(toIndentedString(objectOverwriteMode)).append("\n");
        sb.append("    dstStoragePolicy: ").append(toIndentedString(dstStoragePolicy)).append("\n");
        sb.append("    consistencyCheck: ").append(toIndentedString(consistencyCheck)).append("\n");
        sb.append("    enableRequesterPays: ").append(toIndentedString(enableRequesterPays)).append("\n");
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

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
 * 迁移任务组创建请求体
 */
public class CreateTaskGroupReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_node")

    private TaskGroupSrcNode srcNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_node")

    private TaskGroupDstNode dstNode;

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

    private SmnConfig smnConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_cdn")

    private SourceCdnReq sourceCdn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_since")

    private Long migrateSince;

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

    public CreateTaskGroupReq withSrcNode(TaskGroupSrcNode srcNode) {
        this.srcNode = srcNode;
        return this;
    }

    public CreateTaskGroupReq withSrcNode(Consumer<TaskGroupSrcNode> srcNodeSetter) {
        if (this.srcNode == null) {
            this.srcNode = new TaskGroupSrcNode();
            srcNodeSetter.accept(this.srcNode);
        }

        return this;
    }

    /**
     * Get srcNode
     * @return srcNode
     */
    public TaskGroupSrcNode getSrcNode() {
        return srcNode;
    }

    public void setSrcNode(TaskGroupSrcNode srcNode) {
        this.srcNode = srcNode;
    }

    public CreateTaskGroupReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务组描述，不能超过255个字符，且不能包含^<>&\"'等特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateTaskGroupReq withDstNode(TaskGroupDstNode dstNode) {
        this.dstNode = dstNode;
        return this;
    }

    public CreateTaskGroupReq withDstNode(Consumer<TaskGroupDstNode> dstNodeSetter) {
        if (this.dstNode == null) {
            this.dstNode = new TaskGroupDstNode();
            dstNodeSetter.accept(this.dstNode);
        }

        return this;
    }

    /**
     * Get dstNode
     * @return dstNode
     */
    public TaskGroupDstNode getDstNode() {
        return dstNode;
    }

    public void setDstNode(TaskGroupDstNode dstNode) {
        this.dstNode = dstNode;
    }

    public CreateTaskGroupReq withEnableMetadataMigration(Boolean enableMetadataMigration) {
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

    public CreateTaskGroupReq withEnableFailedObjectRecording(Boolean enableFailedObjectRecording) {
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

    public CreateTaskGroupReq withEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
        return this;
    }

    /**
     * 是否自动解冻归档数据，默认否。 开启后，如果遇到归档类型数据，会自动解冻再进行迁移。
     * @return enableRestore
     */
    public Boolean getEnableRestore() {
        return enableRestore;
    }

    public void setEnableRestore(Boolean enableRestore) {
        this.enableRestore = enableRestore;
    }

    public CreateTaskGroupReq withEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
        return this;
    }

    /**
     * 是否开启KMS加密，默认不开启。
     * @return enableKms
     */
    public Boolean getEnableKms() {
        return enableKms;
    }

    public void setEnableKms(Boolean enableKms) {
        this.enableKms = enableKms;
    }

    public CreateTaskGroupReq withTaskType(TaskTypeEnum taskType) {
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

    public CreateTaskGroupReq withBandwidthPolicy(List<BandwidthPolicyDto> bandwidthPolicy) {
        this.bandwidthPolicy = bandwidthPolicy;
        return this;
    }

    public CreateTaskGroupReq addBandwidthPolicyItem(BandwidthPolicyDto bandwidthPolicyItem) {
        if (this.bandwidthPolicy == null) {
            this.bandwidthPolicy = new ArrayList<>();
        }
        this.bandwidthPolicy.add(bandwidthPolicyItem);
        return this;
    }

    public CreateTaskGroupReq withBandwidthPolicy(Consumer<List<BandwidthPolicyDto>> bandwidthPolicySetter) {
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

    public CreateTaskGroupReq withSmnConfig(SmnConfig smnConfig) {
        this.smnConfig = smnConfig;
        return this;
    }

    public CreateTaskGroupReq withSmnConfig(Consumer<SmnConfig> smnConfigSetter) {
        if (this.smnConfig == null) {
            this.smnConfig = new SmnConfig();
            smnConfigSetter.accept(this.smnConfig);
        }

        return this;
    }

    /**
     * Get smnConfig
     * @return smnConfig
     */
    public SmnConfig getSmnConfig() {
        return smnConfig;
    }

    public void setSmnConfig(SmnConfig smnConfig) {
        this.smnConfig = smnConfig;
    }

    public CreateTaskGroupReq withSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public CreateTaskGroupReq withSourceCdn(Consumer<SourceCdnReq> sourceCdnSetter) {
        if (this.sourceCdn == null) {
            this.sourceCdn = new SourceCdnReq();
            sourceCdnSetter.accept(this.sourceCdn);
        }

        return this;
    }

    /**
     * Get sourceCdn
     * @return sourceCdn
     */
    public SourceCdnReq getSourceCdn() {
        return sourceCdn;
    }

    public void setSourceCdn(SourceCdnReq sourceCdn) {
        this.sourceCdn = sourceCdn;
    }

    public CreateTaskGroupReq withMigrateSince(Long migrateSince) {
        this.migrateSince = migrateSince;
        return this;
    }

    /**
     * 以时间戳方式表示的迁移指定时间（单位：秒），表示仅迁移在指定时间之后修改的源端待迁移对象。默认不设置迁移指定时间。
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

    public CreateTaskGroupReq withObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
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

    public CreateTaskGroupReq withDstStoragePolicy(DstStoragePolicyEnum dstStoragePolicy) {
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

    public CreateTaskGroupReq withConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
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

    public CreateTaskGroupReq withEnableRequesterPays(Boolean enableRequesterPays) {
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
        CreateTaskGroupReq that = (CreateTaskGroupReq) obj;
        return Objects.equals(this.srcNode, that.srcNode) && Objects.equals(this.description, that.description)
            && Objects.equals(this.dstNode, that.dstNode)
            && Objects.equals(this.enableMetadataMigration, that.enableMetadataMigration)
            && Objects.equals(this.enableFailedObjectRecording, that.enableFailedObjectRecording)
            && Objects.equals(this.enableRestore, that.enableRestore) && Objects.equals(this.enableKms, that.enableKms)
            && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.bandwidthPolicy, that.bandwidthPolicy)
            && Objects.equals(this.smnConfig, that.smnConfig) && Objects.equals(this.sourceCdn, that.sourceCdn)
            && Objects.equals(this.migrateSince, that.migrateSince)
            && Objects.equals(this.objectOverwriteMode, that.objectOverwriteMode)
            && Objects.equals(this.dstStoragePolicy, that.dstStoragePolicy)
            && Objects.equals(this.consistencyCheck, that.consistencyCheck)
            && Objects.equals(this.enableRequesterPays, that.enableRequesterPays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(srcNode,
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
            objectOverwriteMode,
            dstStoragePolicy,
            consistencyCheck,
            enableRequesterPays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTaskGroupReq {\n");
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

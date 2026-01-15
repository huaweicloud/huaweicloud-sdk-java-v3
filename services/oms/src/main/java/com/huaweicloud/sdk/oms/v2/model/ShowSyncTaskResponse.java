package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSyncTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_task_id")

    private String syncTaskId;

    /**
     * 源端云服务提供商。  可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、UCloud。默认值为Aliyun。
     */
    public static final class SrcCloudTypeEnum {

        /**
         * Enum AWS for value: "AWS"
         */
        public static final SrcCloudTypeEnum AWS = new SrcCloudTypeEnum("AWS");

        /**
         * Enum AZURE for value: "Azure"
         */
        public static final SrcCloudTypeEnum AZURE = new SrcCloudTypeEnum("Azure");

        /**
         * Enum ALIYUN for value: "Aliyun"
         */
        public static final SrcCloudTypeEnum ALIYUN = new SrcCloudTypeEnum("Aliyun");

        /**
         * Enum TENCENT for value: "Tencent"
         */
        public static final SrcCloudTypeEnum TENCENT = new SrcCloudTypeEnum("Tencent");

        /**
         * Enum HUAWEICLOUD for value: "HuaweiCloud"
         */
        public static final SrcCloudTypeEnum HUAWEICLOUD = new SrcCloudTypeEnum("HuaweiCloud");

        /**
         * Enum QINGCLOUD for value: "QingCloud"
         */
        public static final SrcCloudTypeEnum QINGCLOUD = new SrcCloudTypeEnum("QingCloud");

        /**
         * Enum KINGSOFTCLOUD for value: "KingsoftCloud"
         */
        public static final SrcCloudTypeEnum KINGSOFTCLOUD = new SrcCloudTypeEnum("KingsoftCloud");

        /**
         * Enum BAIDU for value: "Baidu"
         */
        public static final SrcCloudTypeEnum BAIDU = new SrcCloudTypeEnum("Baidu");

        /**
         * Enum QINIU for value: "Qiniu"
         */
        public static final SrcCloudTypeEnum QINIU = new SrcCloudTypeEnum("Qiniu");

        /**
         * Enum UCLOUD for value: "UCloud"
         */
        public static final SrcCloudTypeEnum UCLOUD = new SrcCloudTypeEnum("UCloud");

        private static final Map<String, SrcCloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SrcCloudTypeEnum> createStaticFields() {
            Map<String, SrcCloudTypeEnum> map = new HashMap<>();
            map.put("AWS", AWS);
            map.put("Azure", AZURE);
            map.put("Aliyun", ALIYUN);
            map.put("Tencent", TENCENT);
            map.put("HuaweiCloud", HUAWEICLOUD);
            map.put("QingCloud", QINGCLOUD);
            map.put("KingsoftCloud", KINGSOFTCLOUD);
            map.put("Baidu", BAIDU);
            map.put("Qiniu", QINIU);
            map.put("UCloud", UCLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SrcCloudTypeEnum(String value) {
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
        public static SrcCloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SrcCloudTypeEnum(value));
        }

        public static SrcCloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SrcCloudTypeEnum) {
                return this.value.equals(((SrcCloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_cloud_type")

    private SrcCloudTypeEnum srcCloudType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_region")

    private String srcRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_bucket")

    private String srcBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_start_time")

    private Long lastStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_bucket")

    private String dstBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dst_region")

    private String dstRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 同步任务状态 SYNCHRONIZING：同步中 STOPPED：已停止
     */
    public static final class StatusEnum {

        /**
         * Enum SYNCHRONIZING for value: "SYNCHRONIZING"
         */
        public static final StatusEnum SYNCHRONIZING = new StatusEnum("SYNCHRONIZING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("SYNCHRONIZING", SYNCHRONIZING);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

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
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_acceptance_request")

    private Long monthlyAcceptanceRequest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_success_object")

    private Long monthlySuccessObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_failure_object")

    private Long monthlyFailureObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_skip_object")

    private Long monthlySkipObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monthly_size")

    private Long monthlySize;

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
     * 迁移后对象一致性校验方式，用于迁移后校验对象是否一致，所有校验方式需满足源端/目的端对象的加密状态一致，具体校验方式和校验结果可通过对象列表查看。默认size_last_modified。 size_last_modified：默认配置。迁移后，通过对比源端和目的端对象大小和最后修改时间，判断对象迁移后数据是否完整。源端与目的端同名对象大小相同，且目的端对象的最后修改时间不早于源端对象的最后修改时间，则代表该对象迁移成功。 crc64：目前仅支持华为/阿里/腾讯。迁移后，通过对比源端和目的端对象元数据中CRC64值是否相同，判断对象是否迁移完成。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用大小/最后修改时间校验方式来校验。 no_check：目前仅支持HTTP/HTTPS数据源。当源端对象无法通过标准http协议中content-length字段获取数据大小时，默认数据下载成功即迁移成功，不对数据做额外校验。当源端对象能正常通过标准http协议中content-length字段获取数据大小时，则采用大小/最后修改时间校验方式来校验。
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

    public ShowSyncTaskResponse withSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
        return this;
    }

    /**
     * 同步任务ID
     * @return syncTaskId
     */
    public String getSyncTaskId() {
        return syncTaskId;
    }

    public void setSyncTaskId(String syncTaskId) {
        this.syncTaskId = syncTaskId;
    }

    public ShowSyncTaskResponse withSrcCloudType(SrcCloudTypeEnum srcCloudType) {
        this.srcCloudType = srcCloudType;
        return this;
    }

    /**
     * 源端云服务提供商。  可选值有AWS、Azure、Aliyun、Tencent、HuaweiCloud、QingCloud、KingsoftCloud、Baidu、Qiniu、UCloud。默认值为Aliyun。
     * @return srcCloudType
     */
    public SrcCloudTypeEnum getSrcCloudType() {
        return srcCloudType;
    }

    public void setSrcCloudType(SrcCloudTypeEnum srcCloudType) {
        this.srcCloudType = srcCloudType;
    }

    public ShowSyncTaskResponse withSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
        return this;
    }

    /**
     * 源端桶所处的区域
     * @return srcRegion
     */
    public String getSrcRegion() {
        return srcRegion;
    }

    public void setSrcRegion(String srcRegion) {
        this.srcRegion = srcRegion;
    }

    public ShowSyncTaskResponse withSrcBucket(String srcBucket) {
        this.srcBucket = srcBucket;
        return this;
    }

    /**
     * 源端桶
     * @return srcBucket
     */
    public String getSrcBucket() {
        return srcBucket;
    }

    public void setSrcBucket(String srcBucket) {
        this.srcBucket = srcBucket;
    }

    public ShowSyncTaskResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 同步任务创建时间（Unix时间戳，毫秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSyncTaskResponse withLastStartTime(Long lastStartTime) {
        this.lastStartTime = lastStartTime;
        return this;
    }

    /**
     * 最近启动同步任务时间（Unix时间戳，毫秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastStartTime
     */
    public Long getLastStartTime() {
        return lastStartTime;
    }

    public void setLastStartTime(Long lastStartTime) {
        this.lastStartTime = lastStartTime;
    }

    public ShowSyncTaskResponse withDstBucket(String dstBucket) {
        this.dstBucket = dstBucket;
        return this;
    }

    /**
     * 目的端桶。
     * @return dstBucket
     */
    public String getDstBucket() {
        return dstBucket;
    }

    public void setDstBucket(String dstBucket) {
        this.dstBucket = dstBucket;
    }

    public ShowSyncTaskResponse withDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
        return this;
    }

    /**
     * 目的端region
     * @return dstRegion
     */
    public String getDstRegion() {
        return dstRegion;
    }

    public void setDstRegion(String dstRegion) {
        this.dstRegion = dstRegion;
    }

    public ShowSyncTaskResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述，不能超过255个字符，且不能包含<>()\"'&等特殊字符。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowSyncTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 同步任务状态 SYNCHRONIZING：同步中 STOPPED：已停止
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowSyncTaskResponse withEnableKms(Boolean enableKms) {
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

    public ShowSyncTaskResponse withEnableMetadataMigration(Boolean enableMetadataMigration) {
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

    public ShowSyncTaskResponse withEnableRestore(Boolean enableRestore) {
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

    public ShowSyncTaskResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 腾讯云APPID，当源端为腾讯云时，会返回此参数。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowSyncTaskResponse withMonthlyAcceptanceRequest(Long monthlyAcceptanceRequest) {
        this.monthlyAcceptanceRequest = monthlyAcceptanceRequest;
        return this;
    }

    /**
     * 当月接收同步请求对象数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return monthlyAcceptanceRequest
     */
    public Long getMonthlyAcceptanceRequest() {
        return monthlyAcceptanceRequest;
    }

    public void setMonthlyAcceptanceRequest(Long monthlyAcceptanceRequest) {
        this.monthlyAcceptanceRequest = monthlyAcceptanceRequest;
    }

    public ShowSyncTaskResponse withMonthlySuccessObject(Long monthlySuccessObject) {
        this.monthlySuccessObject = monthlySuccessObject;
        return this;
    }

    /**
     * 当月同步成功对象数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return monthlySuccessObject
     */
    public Long getMonthlySuccessObject() {
        return monthlySuccessObject;
    }

    public void setMonthlySuccessObject(Long monthlySuccessObject) {
        this.monthlySuccessObject = monthlySuccessObject;
    }

    public ShowSyncTaskResponse withMonthlyFailureObject(Long monthlyFailureObject) {
        this.monthlyFailureObject = monthlyFailureObject;
        return this;
    }

    /**
     * 当月同步失败对象数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return monthlyFailureObject
     */
    public Long getMonthlyFailureObject() {
        return monthlyFailureObject;
    }

    public void setMonthlyFailureObject(Long monthlyFailureObject) {
        this.monthlyFailureObject = monthlyFailureObject;
    }

    public ShowSyncTaskResponse withMonthlySkipObject(Long monthlySkipObject) {
        this.monthlySkipObject = monthlySkipObject;
        return this;
    }

    /**
     * 当月同步忽略对象数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return monthlySkipObject
     */
    public Long getMonthlySkipObject() {
        return monthlySkipObject;
    }

    public void setMonthlySkipObject(Long monthlySkipObject) {
        this.monthlySkipObject = monthlySkipObject;
    }

    public ShowSyncTaskResponse withMonthlySize(Long monthlySize) {
        this.monthlySize = monthlySize;
        return this;
    }

    /**
     * 当月同步对象容量大小（Byte）。
     * minimum: 0
     * maximum: 9223372036854775807
     * @return monthlySize
     */
    public Long getMonthlySize() {
        return monthlySize;
    }

    public void setMonthlySize(Long monthlySize) {
        this.monthlySize = monthlySize;
    }

    public ShowSyncTaskResponse withObjectOverwriteMode(ObjectOverwriteModeEnum objectOverwriteMode) {
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

    public ShowSyncTaskResponse withDstStoragePolicy(DstStoragePolicyEnum dstStoragePolicy) {
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

    public ShowSyncTaskResponse withConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
        this.consistencyCheck = consistencyCheck;
        return this;
    }

    /**
     * 迁移后对象一致性校验方式，用于迁移后校验对象是否一致，所有校验方式需满足源端/目的端对象的加密状态一致，具体校验方式和校验结果可通过对象列表查看。默认size_last_modified。 size_last_modified：默认配置。迁移后，通过对比源端和目的端对象大小和最后修改时间，判断对象迁移后数据是否完整。源端与目的端同名对象大小相同，且目的端对象的最后修改时间不早于源端对象的最后修改时间，则代表该对象迁移成功。 crc64：目前仅支持华为/阿里/腾讯。迁移后，通过对比源端和目的端对象元数据中CRC64值是否相同，判断对象是否迁移完成。如果源端与目的端对象元数据中不存在CRC64值，则系统会默认使用大小/最后修改时间校验方式来校验。 no_check：目前仅支持HTTP/HTTPS数据源。当源端对象无法通过标准http协议中content-length字段获取数据大小时，默认数据下载成功即迁移成功，不对数据做额外校验。当源端对象能正常通过标准http协议中content-length字段获取数据大小时，则采用大小/最后修改时间校验方式来校验。
     * @return consistencyCheck
     */
    public ConsistencyCheckEnum getConsistencyCheck() {
        return consistencyCheck;
    }

    public void setConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
        this.consistencyCheck = consistencyCheck;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSyncTaskResponse that = (ShowSyncTaskResponse) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId) && Objects.equals(this.srcCloudType, that.srcCloudType)
            && Objects.equals(this.srcRegion, that.srcRegion) && Objects.equals(this.srcBucket, that.srcBucket)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastStartTime, that.lastStartTime) && Objects.equals(this.dstBucket, that.dstBucket)
            && Objects.equals(this.dstRegion, that.dstRegion) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.enableKms, that.enableKms)
            && Objects.equals(this.enableMetadataMigration, that.enableMetadataMigration)
            && Objects.equals(this.enableRestore, that.enableRestore) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.monthlyAcceptanceRequest, that.monthlyAcceptanceRequest)
            && Objects.equals(this.monthlySuccessObject, that.monthlySuccessObject)
            && Objects.equals(this.monthlyFailureObject, that.monthlyFailureObject)
            && Objects.equals(this.monthlySkipObject, that.monthlySkipObject)
            && Objects.equals(this.monthlySize, that.monthlySize)
            && Objects.equals(this.objectOverwriteMode, that.objectOverwriteMode)
            && Objects.equals(this.dstStoragePolicy, that.dstStoragePolicy)
            && Objects.equals(this.consistencyCheck, that.consistencyCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(syncTaskId,
            srcCloudType,
            srcRegion,
            srcBucket,
            createTime,
            lastStartTime,
            dstBucket,
            dstRegion,
            description,
            status,
            enableKms,
            enableMetadataMigration,
            enableRestore,
            appId,
            monthlyAcceptanceRequest,
            monthlySuccessObject,
            monthlyFailureObject,
            monthlySkipObject,
            monthlySize,
            objectOverwriteMode,
            dstStoragePolicy,
            consistencyCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSyncTaskResponse {\n");
        sb.append("    syncTaskId: ").append(toIndentedString(syncTaskId)).append("\n");
        sb.append("    srcCloudType: ").append(toIndentedString(srcCloudType)).append("\n");
        sb.append("    srcRegion: ").append(toIndentedString(srcRegion)).append("\n");
        sb.append("    srcBucket: ").append(toIndentedString(srcBucket)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    lastStartTime: ").append(toIndentedString(lastStartTime)).append("\n");
        sb.append("    dstBucket: ").append(toIndentedString(dstBucket)).append("\n");
        sb.append("    dstRegion: ").append(toIndentedString(dstRegion)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enableKms: ").append(toIndentedString(enableKms)).append("\n");
        sb.append("    enableMetadataMigration: ").append(toIndentedString(enableMetadataMigration)).append("\n");
        sb.append("    enableRestore: ").append(toIndentedString(enableRestore)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    monthlyAcceptanceRequest: ").append(toIndentedString(monthlyAcceptanceRequest)).append("\n");
        sb.append("    monthlySuccessObject: ").append(toIndentedString(monthlySuccessObject)).append("\n");
        sb.append("    monthlyFailureObject: ").append(toIndentedString(monthlyFailureObject)).append("\n");
        sb.append("    monthlySkipObject: ").append(toIndentedString(monthlySkipObject)).append("\n");
        sb.append("    monthlySize: ").append(toIndentedString(monthlySize)).append("\n");
        sb.append("    objectOverwriteMode: ").append(toIndentedString(objectOverwriteMode)).append("\n");
        sb.append("    dstStoragePolicy: ").append(toIndentedString(dstStoragePolicy)).append("\n");
        sb.append("    consistencyCheck: ").append(toIndentedString(consistencyCheck)).append("\n");
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

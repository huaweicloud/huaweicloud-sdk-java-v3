package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询同步任务列表时返回的单个同步任务信息实体
 */
public class SyncTaskInfo {

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
    @JsonProperty(value = "source_cdn")

    private SourceCdnResp sourceCdn;

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

    public SyncTaskInfo withSyncTaskId(String syncTaskId) {
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

    public SyncTaskInfo withSrcCloudType(SrcCloudTypeEnum srcCloudType) {
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

    public SyncTaskInfo withSrcRegion(String srcRegion) {
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

    public SyncTaskInfo withSrcBucket(String srcBucket) {
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

    public SyncTaskInfo withCreateTime(Long createTime) {
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

    public SyncTaskInfo withLastStartTime(Long lastStartTime) {
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

    public SyncTaskInfo withDstBucket(String dstBucket) {
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

    public SyncTaskInfo withDstRegion(String dstRegion) {
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

    public SyncTaskInfo withDescription(String description) {
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

    public SyncTaskInfo withStatus(StatusEnum status) {
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

    public SyncTaskInfo withEnableKms(Boolean enableKms) {
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

    public SyncTaskInfo withEnableMetadataMigration(Boolean enableMetadataMigration) {
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

    public SyncTaskInfo withEnableRestore(Boolean enableRestore) {
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

    public SyncTaskInfo withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 当源端为腾讯云时，需要填写此参数。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SyncTaskInfo withSourceCdn(SourceCdnResp sourceCdn) {
        this.sourceCdn = sourceCdn;
        return this;
    }

    public SyncTaskInfo withSourceCdn(Consumer<SourceCdnResp> sourceCdnSetter) {
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

    public SyncTaskInfo withConsistencyCheck(ConsistencyCheckEnum consistencyCheck) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncTaskInfo that = (SyncTaskInfo) obj;
        return Objects.equals(this.syncTaskId, that.syncTaskId) && Objects.equals(this.srcCloudType, that.srcCloudType)
            && Objects.equals(this.srcRegion, that.srcRegion) && Objects.equals(this.srcBucket, that.srcBucket)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.lastStartTime, that.lastStartTime) && Objects.equals(this.dstBucket, that.dstBucket)
            && Objects.equals(this.dstRegion, that.dstRegion) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.enableKms, that.enableKms)
            && Objects.equals(this.enableMetadataMigration, that.enableMetadataMigration)
            && Objects.equals(this.enableRestore, that.enableRestore) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.sourceCdn, that.sourceCdn)
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
            sourceCdn,
            consistencyCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncTaskInfo {\n");
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
        sb.append("    sourceCdn: ").append(toIndentedString(sourceCdn)).append("\n");
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

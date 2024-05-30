package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RecycleInstancesDetailResult
 */
public class RecycleInstancesDetailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 部署形态(Ha:主备版;Independent:独立部署;Combined:混合部署)。
     */
    public static final class HaModeEnum {

        /**
         * Enum HA for value: "Ha"
         */
        public static final HaModeEnum HA = new HaModeEnum("Ha");

        /**
         * Enum INDEPENDENT for value: "Independent"
         */
        public static final HaModeEnum INDEPENDENT = new HaModeEnum("Independent");

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Independent", INDEPENDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaModeEnum(value));
        }

        public static HaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private HaModeEnum haMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private String engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    /**
     * 计费模式（0：按需计费；1：包年/包月）。
     */
    public static final class PayModelEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final PayModelEnum _0 = new PayModelEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final PayModelEnum _1 = new PayModelEnum("1");

        private static final Map<String, PayModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PayModelEnum> createStaticFields() {
            Map<String, PayModelEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PayModelEnum(String value) {
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
        public static PayModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PayModelEnum(value));
        }

        public static PayModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PayModelEnum) {
                return this.value.equals(((PayModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_model")

    private PayModelEnum payModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted_at")

    private String deletedAt;

    /**
     * 磁盘类型。（SAS：high；SSD：ultrahigh；ESSD：essd）。
     */
    public static final class VolumeTypeEnum {

        /**
         * Enum HIGH for value: "high"
         */
        public static final VolumeTypeEnum HIGH = new VolumeTypeEnum("high");

        /**
         * Enum ULTRAHIGH for value: "ultrahigh"
         */
        public static final VolumeTypeEnum ULTRAHIGH = new VolumeTypeEnum("ultrahigh");

        /**
         * Enum ESSD for value: "essd"
         */
        public static final VolumeTypeEnum ESSD = new VolumeTypeEnum("essd");

        private static final Map<String, VolumeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VolumeTypeEnum> createStaticFields() {
            Map<String, VolumeTypeEnum> map = new HashMap<>();
            map.put("high", HIGH);
            map.put("ultrahigh", ULTRAHIGH);
            map.put("essd", ESSD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VolumeTypeEnum(String value) {
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
        public static VolumeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VolumeTypeEnum(value));
        }

        public static VolumeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VolumeTypeEnum) {
                return this.value.equals(((VolumeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private VolumeTypeEnum volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_size")

    private String volumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_vip")

    private String dataVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_level")

    private String backupLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_backup_id")

    private String recycleBackupId;

    /**
     * 回收站备份状态。（Running：运行中；Active：有效的）。
     */
    public static final class RecycleStatusEnum {

        /**
         * Enum RUNNING for value: "Running"
         */
        public static final RecycleStatusEnum RUNNING = new RecycleStatusEnum("Running");

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final RecycleStatusEnum ACTIVE = new RecycleStatusEnum("Active");

        private static final Map<String, RecycleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecycleStatusEnum> createStaticFields() {
            Map<String, RecycleStatusEnum> map = new HashMap<>();
            map.put("Running", RUNNING);
            map.put("Active", ACTIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecycleStatusEnum(String value) {
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
        public static RecycleStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecycleStatusEnum(value));
        }

        public static RecycleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecycleStatusEnum) {
                return this.value.equals(((RecycleStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recycle_status")

    private RecycleStatusEnum recycleStatus;

    /**
     * 产品类型（basic：基础版；standard：标准版；enterprise：企业版）。
     */
    public static final class ModeEnum {

        /**
         * Enum BASIC for value: "basic"
         */
        public static final ModeEnum BASIC = new ModeEnum("basic");

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final ModeEnum STANDARD = new ModeEnum("standard");

        /**
         * Enum ENTERPRISE for value: "enterprise"
         */
        public static final ModeEnum ENTERPRISE = new ModeEnum("enterprise");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            map.put("standard", STANDARD);
            map.put("enterprise", ENTERPRISE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    public RecycleInstancesDetailResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RecycleInstancesDetailResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecycleInstancesDetailResult withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 部署形态(Ha:主备版;Independent:独立部署;Combined:混合部署)。
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    public RecycleInstancesDetailResult withEngineName(String engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称
     * @return engineName
     */
    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public RecycleInstancesDetailResult withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本号。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public RecycleInstancesDetailResult withPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
        return this;
    }

    /**
     * 计费模式（0：按需计费；1：包年/包月）。
     * @return payModel
     */
    public PayModelEnum getPayModel() {
        return payModel;
    }

    public void setPayModel(PayModelEnum payModel) {
        this.payModel = payModel;
    }

    public RecycleInstancesDetailResult withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RecycleInstancesDetailResult withDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
        return this;
    }

    /**
     * 删除时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return deletedAt
     */
    public String getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(String deletedAt) {
        this.deletedAt = deletedAt;
    }

    public RecycleInstancesDetailResult withVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /**
     * 磁盘类型。（SAS：high；SSD：ultrahigh；ESSD：essd）。
     * @return volumeType
     */
    public VolumeTypeEnum getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(VolumeTypeEnum volumeType) {
        this.volumeType = volumeType;
    }

    public RecycleInstancesDetailResult withVolumeSize(String volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    /**
     * 磁盘大小
     * @return volumeSize
     */
    public String getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(String volumeSize) {
        this.volumeSize = volumeSize;
    }

    public RecycleInstancesDetailResult withDataVip(String dataVip) {
        this.dataVip = dataVip;
        return this;
    }

    /**
     * 数据vip。
     * @return dataVip
     */
    public String getDataVip() {
        return dataVip;
    }

    public void setDataVip(String dataVip) {
        this.dataVip = dataVip;
    }

    public RecycleInstancesDetailResult withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public RecycleInstancesDetailResult withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public RecycleInstancesDetailResult withBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
        return this;
    }

    /**
     * 备份级别
     * @return backupLevel
     */
    public String getBackupLevel() {
        return backupLevel;
    }

    public void setBackupLevel(String backupLevel) {
        this.backupLevel = backupLevel;
    }

    public RecycleInstancesDetailResult withRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
        return this;
    }

    /**
     * 备份ID。（指删除实例时产生备份信息中的备份ID）。
     * @return recycleBackupId
     */
    public String getRecycleBackupId() {
        return recycleBackupId;
    }

    public void setRecycleBackupId(String recycleBackupId) {
        this.recycleBackupId = recycleBackupId;
    }

    public RecycleInstancesDetailResult withRecycleStatus(RecycleStatusEnum recycleStatus) {
        this.recycleStatus = recycleStatus;
        return this;
    }

    /**
     * 回收站备份状态。（Running：运行中；Active：有效的）。
     * @return recycleStatus
     */
    public RecycleStatusEnum getRecycleStatus() {
        return recycleStatus;
    }

    public void setRecycleStatus(RecycleStatusEnum recycleStatus) {
        this.recycleStatus = recycleStatus;
    }

    public RecycleInstancesDetailResult withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 产品类型（basic：基础版；standard：标准版；enterprise：企业版）。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecycleInstancesDetailResult that = (RecycleInstancesDetailResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.haMode, that.haMode) && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.payModel, that.payModel)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.deletedAt, that.deletedAt)
            && Objects.equals(this.volumeType, that.volumeType) && Objects.equals(this.volumeSize, that.volumeSize)
            && Objects.equals(this.dataVip, that.dataVip)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.backupLevel, that.backupLevel)
            && Objects.equals(this.recycleBackupId, that.recycleBackupId)
            && Objects.equals(this.recycleStatus, that.recycleStatus) && Objects.equals(this.mode, that.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            haMode,
            engineName,
            engineVersion,
            payModel,
            createdAt,
            deletedAt,
            volumeType,
            volumeSize,
            dataVip,
            enterpriseProjectId,
            enterpriseProjectName,
            backupLevel,
            recycleBackupId,
            recycleStatus,
            mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecycleInstancesDetailResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    payModel: ").append(toIndentedString(payModel)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
        sb.append("    dataVip: ").append(toIndentedString(dataVip)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    backupLevel: ").append(toIndentedString(backupLevel)).append("\n");
        sb.append("    recycleBackupId: ").append(toIndentedString(recycleBackupId)).append("\n");
        sb.append("    recycleStatus: ").append(toIndentedString(recycleStatus)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

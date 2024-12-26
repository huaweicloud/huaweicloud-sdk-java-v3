package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Billing
 */
public class Billing {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allocated")

    private Integer allocated;

    /**
     * 创建模式
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PRE_PAID for value: "pre_paid"
         */
        public static final ChargingModeEnum PRE_PAID = new ChargingModeEnum("pre_paid");

        /**
         * Enum POST_PAID for value: "post_paid"
         */
        public static final ChargingModeEnum POST_PAID = new ChargingModeEnum("post_paid");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("pre_paid", PRE_PAID);
            map.put("post_paid", POST_PAID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * 云平台
     */
    public static final class CloudTypeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final CloudTypeEnum PUBLIC = new CloudTypeEnum("public");

        /**
         * Enum HYBRID for value: "hybrid"
         */
        public static final CloudTypeEnum HYBRID = new CloudTypeEnum("hybrid");

        private static final Map<String, CloudTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CloudTypeEnum> createStaticFields() {
            Map<String, CloudTypeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("hybrid", HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CloudTypeEnum(String value) {
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
        public static CloudTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CloudTypeEnum(value));
        }

        public static CloudTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CloudTypeEnum) {
                return this.value.equals(((CloudTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_type")

    private CloudTypeEnum cloudType;

    /**
     * 崩溃一致性（crash_consistent）或应用一致性（app_consistent）
     */
    public static final class ConsistentLevelEnum {

        /**
         * Enum APP_CONSISTENT for value: "app_consistent"
         */
        public static final ConsistentLevelEnum APP_CONSISTENT = new ConsistentLevelEnum("app_consistent");

        /**
         * Enum CRASH_CONSISTENT for value: "crash_consistent"
         */
        public static final ConsistentLevelEnum CRASH_CONSISTENT = new ConsistentLevelEnum("crash_consistent");

        private static final Map<String, ConsistentLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConsistentLevelEnum> createStaticFields() {
            Map<String, ConsistentLevelEnum> map = new HashMap<>();
            map.put("app_consistent", APP_CONSISTENT);
            map.put("crash_consistent", CRASH_CONSISTENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConsistentLevelEnum(String value) {
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
        public static ConsistentLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ConsistentLevelEnum(value));
        }

        public static ConsistentLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConsistentLevelEnum) {
                return this.value.equals(((ConsistentLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consistent_level")

    private ConsistentLevelEnum consistentLevel;

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo），云桌面（workspace），VMware（vmware），关系型数据库（rds），文件（file）。
     */
    public static final class ObjectTypeEnum {

        /**
         * Enum SERVER for value: "server"
         */
        public static final ObjectTypeEnum SERVER = new ObjectTypeEnum("server");

        /**
         * Enum DISK for value: "disk"
         */
        public static final ObjectTypeEnum DISK = new ObjectTypeEnum("disk");

        /**
         * Enum TURBO for value: "turbo"
         */
        public static final ObjectTypeEnum TURBO = new ObjectTypeEnum("turbo");

        /**
         * Enum WORKSPACE for value: "workspace"
         */
        public static final ObjectTypeEnum WORKSPACE = new ObjectTypeEnum("workspace");

        /**
         * Enum VMWARE for value: "vmware"
         */
        public static final ObjectTypeEnum VMWARE = new ObjectTypeEnum("vmware");

        /**
         * Enum RDS for value: "rds"
         */
        public static final ObjectTypeEnum RDS = new ObjectTypeEnum("rds");

        /**
         * Enum FILE for value: "file"
         */
        public static final ObjectTypeEnum FILE = new ObjectTypeEnum("file");

        private static final Map<String, ObjectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ObjectTypeEnum> createStaticFields() {
            Map<String, ObjectTypeEnum> map = new HashMap<>();
            map.put("server", SERVER);
            map.put("disk", DISK);
            map.put("turbo", TURBO);
            map.put("workspace", WORKSPACE);
            map.put("vmware", VMWARE);
            map.put("rds", RDS);
            map.put("file", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ObjectTypeEnum(String value) {
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
        public static ObjectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ObjectTypeEnum(value));
        }

        public static ObjectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ObjectTypeEnum) {
                return this.value.equals(((ObjectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_type")

    private ObjectTypeEnum objectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    /**
     * 保护类型
     */
    public static final class ProtectTypeEnum {

        /**
         * Enum BACKUP for value: "backup"
         */
        public static final ProtectTypeEnum BACKUP = new ProtectTypeEnum("backup");

        /**
         * Enum REPLICATION for value: "replication"
         */
        public static final ProtectTypeEnum REPLICATION = new ProtectTypeEnum("replication");

        /**
         * Enum HYBRID for value: "hybrid"
         */
        public static final ProtectTypeEnum HYBRID = new ProtectTypeEnum("hybrid");

        private static final Map<String, ProtectTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectTypeEnum> createStaticFields() {
            Map<String, ProtectTypeEnum> map = new HashMap<>();
            map.put("backup", BACKUP);
            map.put("replication", REPLICATION);
            map.put("hybrid", HYBRID);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectTypeEnum(String value) {
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
        public static ProtectTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectTypeEnum(value));
        }

        public static ProtectTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectTypeEnum) {
                return this.value.equals(((ProtectTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_type")

    private ProtectTypeEnum protectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 规格编码: 云服务备份存储库:vault.backup.server.normal;云硬盘备份存储库:vault.backup.volume.normal;文件备份存储库:vault.backup.turbo.normal;数据库备份存储库:vault.backup.database.normal;混合云备份存储库:vault.hybrid.server.normal;复制备份存储库:vault.replication.server.normal
     */
    public static final class SpecCodeEnum {

        /**
         * Enum VAULT_BACKUP_SERVER_NORMAL for value: "vault.backup.server.normal"
         */
        public static final SpecCodeEnum VAULT_BACKUP_SERVER_NORMAL = new SpecCodeEnum("vault.backup.server.normal");

        /**
         * Enum VAULT_BACKUP_VOLUME_NORMAL for value: "vault.backup.volume.normal"
         */
        public static final SpecCodeEnum VAULT_BACKUP_VOLUME_NORMAL = new SpecCodeEnum("vault.backup.volume.normal");

        /**
         * Enum VAULT_BACKUP_TURBO_NORMAL for value: "vault.backup.turbo.normal"
         */
        public static final SpecCodeEnum VAULT_BACKUP_TURBO_NORMAL = new SpecCodeEnum("vault.backup.turbo.normal");

        /**
         * Enum VAULT_BACKUP_DATABASE_NORMAL for value: "vault.backup.database.normal"
         */
        public static final SpecCodeEnum VAULT_BACKUP_DATABASE_NORMAL =
            new SpecCodeEnum("vault.backup.database.normal");

        /**
         * Enum VAULT_HYBRID_SERVER_NORMAL for value: "vault.hybrid.server.normal"
         */
        public static final SpecCodeEnum VAULT_HYBRID_SERVER_NORMAL = new SpecCodeEnum("vault.hybrid.server.normal");

        /**
         * Enum VAULT_REPLICATION_SERVER_NORMAL for value: "vault.replication.server.normal"
         */
        public static final SpecCodeEnum VAULT_REPLICATION_SERVER_NORMAL =
            new SpecCodeEnum("vault.replication.server.normal");

        private static final Map<String, SpecCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecCodeEnum> createStaticFields() {
            Map<String, SpecCodeEnum> map = new HashMap<>();
            map.put("vault.backup.server.normal", VAULT_BACKUP_SERVER_NORMAL);
            map.put("vault.backup.volume.normal", VAULT_BACKUP_VOLUME_NORMAL);
            map.put("vault.backup.turbo.normal", VAULT_BACKUP_TURBO_NORMAL);
            map.put("vault.backup.database.normal", VAULT_BACKUP_DATABASE_NORMAL);
            map.put("vault.hybrid.server.normal", VAULT_HYBRID_SERVER_NORMAL);
            map.put("vault.replication.server.normal", VAULT_REPLICATION_SERVER_NORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecCodeEnum(String value) {
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
        public static SpecCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecCodeEnum(value));
        }

        public static SpecCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecCodeEnum) {
                return this.value.equals(((SpecCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private SpecCodeEnum specCode;

    /**
     * 存储库状态
     */
    public static final class StatusEnum {

        /**
         * Enum AVAILABLE for value: "available"
         */
        public static final StatusEnum AVAILABLE = new StatusEnum("available");

        /**
         * Enum LOCK for value: "lock"
         */
        public static final StatusEnum LOCK = new StatusEnum("lock");

        /**
         * Enum FROZEN for value: "frozen"
         */
        public static final StatusEnum FROZEN = new StatusEnum("frozen");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("deleting");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("available", AVAILABLE);
            map.put("lock", LOCK);
            map.put("frozen", FROZEN);
            map.put("deleting", DELETING);
            map.put("error", ERROR);
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
    @JsonProperty(value = "storage_unit")

    private String storageUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used")

    private Integer used;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_scene")

    private String frozenScene;

    public Billing withAllocated(Integer allocated) {
        this.allocated = allocated;
        return this;
    }

    /**
     * 已分配容量，单位GB
     * @return allocated
     */
    public Integer getAllocated() {
        return allocated;
    }

    public void setAllocated(Integer allocated) {
        this.allocated = allocated;
    }

    public Billing withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 创建模式
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public Billing withCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
        return this;
    }

    /**
     * 云平台
     * @return cloudType
     */
    public CloudTypeEnum getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudTypeEnum cloudType) {
        this.cloudType = cloudType;
    }

    public Billing withConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
        return this;
    }

    /**
     * 崩溃一致性（crash_consistent）或应用一致性（app_consistent）
     * @return consistentLevel
     */
    public ConsistentLevelEnum getConsistentLevel() {
        return consistentLevel;
    }

    public void setConsistentLevel(ConsistentLevelEnum consistentLevel) {
        this.consistentLevel = consistentLevel;
    }

    public Billing withObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * 对象类型：云服务器（server），云硬盘（disk），文件系统（turbo），云桌面（workspace），VMware（vmware），关系型数据库（rds），文件（file）。
     * @return objectType
     */
    public ObjectTypeEnum getObjectType() {
        return objectType;
    }

    public void setObjectType(ObjectTypeEnum objectType) {
        this.objectType = objectType;
    }

    public Billing withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Billing withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Billing withProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
        return this;
    }

    /**
     * 保护类型
     * @return protectType
     */
    public ProtectTypeEnum getProtectType() {
        return protectType;
    }

    public void setProtectType(ProtectTypeEnum protectType) {
        this.protectType = protectType;
    }

    public Billing withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 容量，单位GB
     * minimum: 1
     * maximum: 10485760
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Billing withSpecCode(SpecCodeEnum specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * 规格编码: 云服务备份存储库:vault.backup.server.normal;云硬盘备份存储库:vault.backup.volume.normal;文件备份存储库:vault.backup.turbo.normal;数据库备份存储库:vault.backup.database.normal;混合云备份存储库:vault.hybrid.server.normal;复制备份存储库:vault.replication.server.normal
     * @return specCode
     */
    public SpecCodeEnum getSpecCode() {
        return specCode;
    }

    public void setSpecCode(SpecCodeEnum specCode) {
        this.specCode = specCode;
    }

    public Billing withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 存储库状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Billing withStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit;
        return this;
    }

    /**
     * 存储库桶名
     * @return storageUnit
     */
    public String getStorageUnit() {
        return storageUnit;
    }

    public void setStorageUnit(String storageUnit) {
        this.storageUnit = storageUnit;
    }

    public Billing withUsed(Integer used) {
        this.used = used;
        return this;
    }

    /**
     * 已使用容量，单位MB
     * @return used
     */
    public Integer getUsed() {
        return used;
    }

    public void setUsed(Integer used) {
        this.used = used;
    }

    public Billing withFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
        return this;
    }

    /**
     * 冻结场景
     * @return frozenScene
     */
    public String getFrozenScene() {
        return frozenScene;
    }

    public void setFrozenScene(String frozenScene) {
        this.frozenScene = frozenScene;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Billing that = (Billing) obj;
        return Objects.equals(this.allocated, that.allocated) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.cloudType, that.cloudType)
            && Objects.equals(this.consistentLevel, that.consistentLevel)
            && Objects.equals(this.objectType, that.objectType) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.protectType, that.protectType)
            && Objects.equals(this.size, that.size) && Objects.equals(this.specCode, that.specCode)
            && Objects.equals(this.status, that.status) && Objects.equals(this.storageUnit, that.storageUnit)
            && Objects.equals(this.used, that.used) && Objects.equals(this.frozenScene, that.frozenScene);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allocated,
            chargingMode,
            cloudType,
            consistentLevel,
            objectType,
            orderId,
            productId,
            protectType,
            size,
            specCode,
            status,
            storageUnit,
            used,
            frozenScene);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Billing {\n");
        sb.append("    allocated: ").append(toIndentedString(allocated)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
        sb.append("    consistentLevel: ").append(toIndentedString(consistentLevel)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    protectType: ").append(toIndentedString(protectType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    storageUnit: ").append(toIndentedString(storageUnit)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
        sb.append("    frozenScene: ").append(toIndentedString(frozenScene)).append("\n");
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

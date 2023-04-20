package com.huaweicloud.sdk.drs.v3.model;

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
 * QueryJobResp
 */
public class QueryJobResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务状态。 - CREATING：创建中 - CREATE_FAILED：创建失败 - CONFIGURATION：配置中 - STARTJOBING：启动中 - WAITING_FOR_START：等待启动中 - START_JOB_FAILED：启动失败 - PAUSING：已暂停 - FULL_TRANSFER_STARTED：全量开始，灾备场景下为初始化 - FULL_TRANSFER_FAILED：全量失败，灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE：全量完成，灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED：增量开始，灾备场景下为灾备中 - INCRE_TRANSFER_FAILED：增量失败，灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED：结束任务中 - RELEASE_RESOURCE_FAILED：结束任务失败 - RELEASE_RESOURCE_COMPLETE：已结束 - REBUILD_NODE_STARTED：故障恢复中 - REBUILD_NODE_FAILED：故障恢复失败 - CHANGE_JOB_STARTED：任务变更中 - CHANGE_JOB_FAILED：任务变更失败 - DELETED：已删除 - CHILD_TRANSFER_STARTING：再编辑子任务启动中 - CHILD_TRANSFER_STARTED：再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE：再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED：再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED：再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE：再编辑子任务已结束 - NODE_UPGRADE_START：升级开始 - NODE_UPGRADE_COMPLETE：升级完成 - NODE_UPGRADE_FAILED：升级失败
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "CREATING"
         */
        public static final StatusEnum CREATING = new StatusEnum("CREATING");

        /**
         * Enum CREATE_FAILED for value: "CREATE_FAILED"
         */
        public static final StatusEnum CREATE_FAILED = new StatusEnum("CREATE_FAILED");

        /**
         * Enum CONFIGURATION for value: "CONFIGURATION"
         */
        public static final StatusEnum CONFIGURATION = new StatusEnum("CONFIGURATION");

        /**
         * Enum STARTJOBING for value: "STARTJOBING"
         */
        public static final StatusEnum STARTJOBING = new StatusEnum("STARTJOBING");

        /**
         * Enum WAITING_FOR_START for value: "WAITING_FOR_START"
         */
        public static final StatusEnum WAITING_FOR_START = new StatusEnum("WAITING_FOR_START");

        /**
         * Enum START_JOB_FAILED for value: "START_JOB_FAILED"
         */
        public static final StatusEnum START_JOB_FAILED = new StatusEnum("START_JOB_FAILED");

        /**
         * Enum PAUSING for value: "PAUSING"
         */
        public static final StatusEnum PAUSING = new StatusEnum("PAUSING");

        /**
         * Enum FULL_TRANSFER_STARTED for value: "FULL_TRANSFER_STARTED"
         */
        public static final StatusEnum FULL_TRANSFER_STARTED = new StatusEnum("FULL_TRANSFER_STARTED");

        /**
         * Enum FULL_TRANSFER_FAILED for value: "FULL_TRANSFER_FAILED"
         */
        public static final StatusEnum FULL_TRANSFER_FAILED = new StatusEnum("FULL_TRANSFER_FAILED");

        /**
         * Enum FULL_TRANSFER_COMPLETE for value: "FULL_TRANSFER_COMPLETE"
         */
        public static final StatusEnum FULL_TRANSFER_COMPLETE = new StatusEnum("FULL_TRANSFER_COMPLETE");

        /**
         * Enum INCRE_TRANSFER_STARTED for value: "INCRE_TRANSFER_STARTED"
         */
        public static final StatusEnum INCRE_TRANSFER_STARTED = new StatusEnum("INCRE_TRANSFER_STARTED");

        /**
         * Enum INCRE_TRANSFER_FAILED for value: "INCRE_TRANSFER_FAILED"
         */
        public static final StatusEnum INCRE_TRANSFER_FAILED = new StatusEnum("INCRE_TRANSFER_FAILED");

        /**
         * Enum RELEASE_RESOURCE_STARTED for value: "RELEASE_RESOURCE_STARTED"
         */
        public static final StatusEnum RELEASE_RESOURCE_STARTED = new StatusEnum("RELEASE_RESOURCE_STARTED");

        /**
         * Enum RELEASE_RESOURCE_FAILED for value: "RELEASE_RESOURCE_FAILED"
         */
        public static final StatusEnum RELEASE_RESOURCE_FAILED = new StatusEnum("RELEASE_RESOURCE_FAILED");

        /**
         * Enum RELEASE_RESOURCE_COMPLETE for value: "RELEASE_RESOURCE_COMPLETE"
         */
        public static final StatusEnum RELEASE_RESOURCE_COMPLETE = new StatusEnum("RELEASE_RESOURCE_COMPLETE");

        /**
         * Enum REBUILD_NODE_STARTED for value: "REBUILD_NODE_STARTED"
         */
        public static final StatusEnum REBUILD_NODE_STARTED = new StatusEnum("REBUILD_NODE_STARTED");

        /**
         * Enum REBUILD_NODE_FAILED for value: "REBUILD_NODE_FAILED"
         */
        public static final StatusEnum REBUILD_NODE_FAILED = new StatusEnum("REBUILD_NODE_FAILED");

        /**
         * Enum CHANGE_JOB_STARTED for value: "CHANGE_JOB_STARTED"
         */
        public static final StatusEnum CHANGE_JOB_STARTED = new StatusEnum("CHANGE_JOB_STARTED");

        /**
         * Enum CHANGE_JOB_FAILED for value: "CHANGE_JOB_FAILED"
         */
        public static final StatusEnum CHANGE_JOB_FAILED = new StatusEnum("CHANGE_JOB_FAILED");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum CHILD_TRANSFER_STARTING for value: "CHILD_TRANSFER_STARTING"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTING = new StatusEnum("CHILD_TRANSFER_STARTING");

        /**
         * Enum CHILD_TRANSFER_STARTED for value: "CHILD_TRANSFER_STARTED"
         */
        public static final StatusEnum CHILD_TRANSFER_STARTED = new StatusEnum("CHILD_TRANSFER_STARTED");

        /**
         * Enum CHILD_TRANSFER_COMPLETE for value: "CHILD_TRANSFER_COMPLETE"
         */
        public static final StatusEnum CHILD_TRANSFER_COMPLETE = new StatusEnum("CHILD_TRANSFER_COMPLETE");

        /**
         * Enum CHILD_TRANSFER_FAILED for value: "CHILD_TRANSFER_FAILED"
         */
        public static final StatusEnum CHILD_TRANSFER_FAILED = new StatusEnum("CHILD_TRANSFER_FAILED");

        /**
         * Enum RELEASE_CHILD_TRANSFER_STARTED for value: "RELEASE_CHILD_TRANSFER_STARTED"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_STARTED =
            new StatusEnum("RELEASE_CHILD_TRANSFER_STARTED");

        /**
         * Enum RELEASE_CHILD_TRANSFER_COMPLETE for value: "RELEASE_CHILD_TRANSFER_COMPLETE"
         */
        public static final StatusEnum RELEASE_CHILD_TRANSFER_COMPLETE =
            new StatusEnum("RELEASE_CHILD_TRANSFER_COMPLETE");

        /**
         * Enum NODE_UPGRADE_START for value: "NODE_UPGRADE_START"
         */
        public static final StatusEnum NODE_UPGRADE_START = new StatusEnum("NODE_UPGRADE_START");

        /**
         * Enum NODE_UPGRADE_COMPLETE for value: "NODE_UPGRADE_COMPLETE"
         */
        public static final StatusEnum NODE_UPGRADE_COMPLETE = new StatusEnum("NODE_UPGRADE_COMPLETE");

        /**
         * Enum NODE_UPGRADE_FAILED for value: "NODE_UPGRADE_FAILED"
         */
        public static final StatusEnum NODE_UPGRADE_FAILED = new StatusEnum("NODE_UPGRADE_FAILED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CONFIGURATION", CONFIGURATION);
            map.put("STARTJOBING", STARTJOBING);
            map.put("WAITING_FOR_START", WAITING_FOR_START);
            map.put("START_JOB_FAILED", START_JOB_FAILED);
            map.put("PAUSING", PAUSING);
            map.put("FULL_TRANSFER_STARTED", FULL_TRANSFER_STARTED);
            map.put("FULL_TRANSFER_FAILED", FULL_TRANSFER_FAILED);
            map.put("FULL_TRANSFER_COMPLETE", FULL_TRANSFER_COMPLETE);
            map.put("INCRE_TRANSFER_STARTED", INCRE_TRANSFER_STARTED);
            map.put("INCRE_TRANSFER_FAILED", INCRE_TRANSFER_FAILED);
            map.put("RELEASE_RESOURCE_STARTED", RELEASE_RESOURCE_STARTED);
            map.put("RELEASE_RESOURCE_FAILED", RELEASE_RESOURCE_FAILED);
            map.put("RELEASE_RESOURCE_COMPLETE", RELEASE_RESOURCE_COMPLETE);
            map.put("REBUILD_NODE_STARTED", REBUILD_NODE_STARTED);
            map.put("REBUILD_NODE_FAILED", REBUILD_NODE_FAILED);
            map.put("CHANGE_JOB_STARTED", CHANGE_JOB_STARTED);
            map.put("CHANGE_JOB_FAILED", CHANGE_JOB_FAILED);
            map.put("DELETED", DELETED);
            map.put("CHILD_TRANSFER_STARTING", CHILD_TRANSFER_STARTING);
            map.put("CHILD_TRANSFER_STARTED", CHILD_TRANSFER_STARTED);
            map.put("CHILD_TRANSFER_COMPLETE", CHILD_TRANSFER_COMPLETE);
            map.put("CHILD_TRANSFER_FAILED", CHILD_TRANSFER_FAILED);
            map.put("RELEASE_CHILD_TRANSFER_STARTED", RELEASE_CHILD_TRANSFER_STARTED);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE", RELEASE_CHILD_TRANSFER_COMPLETE);
            map.put("NODE_UPGRADE_START", NODE_UPGRADE_START);
            map.put("NODE_UPGRADE_COMPLETE", NODE_UPGRADE_COMPLETE);
            map.put("NODE_UPGRADE_FAILED", NODE_UPGRADE_FAILED);
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
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /**
     * 迁移模式
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskTypeEnum FULL_TRANS = new TaskTypeEnum("FULL_TRANS");

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS = new TaskTypeEnum("FULL_INCR_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskTypeEnum INCR_TRANS = new TaskTypeEnum("INCR_TRANS");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_TRANS", FULL_TRANS);
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
            map.put("INCR_TRANS", INCR_TRANS);
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
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TaskTypeEnum(value);
            }
            return result;
        }

        public static TaskTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TaskTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "source_endpoint")

    private Endpoint sourceEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dmq_endpoint")

    private Endpoint dmqEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_sharding")

    private List<Endpoint> sourceSharding = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private Endpoint targetEndpoint;

    /**
     * 网络类型
     */
    public static final class NetTypeEnum {

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");

        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("vpn", VPN);
            map.put("vpc", VPC);
            map.put("eip", EIP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetTypeEnum(String value) {
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
        public static NetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NetTypeEnum(value);
            }
            return result;
        }

        public static NetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NetTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetTypeEnum) {
                return this.value.equals(((NetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_type")

    private NetTypeEnum netType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inst_info")

    private InstInfo instInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actual_start_time")

    private String actualStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_transfer_complete_time")

    private String fullTransferCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    /**
     * 任务方向
     */
    public static final class JobDirectionEnum {

        /**
         * Enum UP for value: "up"
         */
        public static final JobDirectionEnum UP = new JobDirectionEnum("up");

        /**
         * Enum DOWN for value: "down"
         */
        public static final JobDirectionEnum DOWN = new JobDirectionEnum("down");

        /**
         * Enum NON_DBS for value: "non-dbs"
         */
        public static final JobDirectionEnum NON_DBS = new JobDirectionEnum("non-dbs");

        private static final Map<String, JobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobDirectionEnum> createStaticFields() {
            Map<String, JobDirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            map.put("non-dbs", NON_DBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobDirectionEnum(String value) {
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
        public static JobDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new JobDirectionEnum(value);
            }
            return result;
        }

        public static JobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            JobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobDirectionEnum) {
                return this.value.equals(((JobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    private JobDirectionEnum jobDirection;

    /**
     * 迁移场景 - migration：实时迁移 - sync：实时同步 - cloudDataGuard：实时灾备
     */
    public static final class DbUseTypeEnum {

        /**
         * Enum MIGRATION for value: "migration"
         */
        public static final DbUseTypeEnum MIGRATION = new DbUseTypeEnum("migration");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final DbUseTypeEnum SYNC = new DbUseTypeEnum("sync");

        /**
         * Enum CLOUDDATAGUARD for value: "cloudDataGuard"
         */
        public static final DbUseTypeEnum CLOUDDATAGUARD = new DbUseTypeEnum("cloudDataGuard");

        private static final Map<String, DbUseTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DbUseTypeEnum> createStaticFields() {
            Map<String, DbUseTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            map.put("sync", SYNC);
            map.put("cloudDataGuard", CLOUDDATAGUARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DbUseTypeEnum(String value) {
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
        public static DbUseTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DbUseTypeEnum(value);
            }
            return result;
        }

        public static DbUseTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DbUseTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DbUseTypeEnum) {
                return this.value.equals(((DbUseTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_use_type")

    private DbUseTypeEnum dbUseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_restart")

    private Boolean needRestart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_target_readonly")

    private Boolean isTargetReadonly;

    /**
     * 冲突忽略策略 - stop：冲突失败 - overwrite：冲突覆盖 - ignore：冲突忽略
     */
    public static final class ConflictPolicyEnum {

        /**
         * Enum STOP for value: "stop"
         */
        public static final ConflictPolicyEnum STOP = new ConflictPolicyEnum("stop");

        /**
         * Enum OVERWRITE for value: "overwrite"
         */
        public static final ConflictPolicyEnum OVERWRITE = new ConflictPolicyEnum("overwrite");

        /**
         * Enum IGNORE for value: "ignore"
         */
        public static final ConflictPolicyEnum IGNORE = new ConflictPolicyEnum("ignore");

        private static final Map<String, ConflictPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConflictPolicyEnum> createStaticFields() {
            Map<String, ConflictPolicyEnum> map = new HashMap<>();
            map.put("stop", STOP);
            map.put("overwrite", OVERWRITE);
            map.put("ignore", IGNORE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_ddl_policy")

    private String filterDdlPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private List<SpeedLimitInfo> speedLimit = null;

    /**
    * 迁移方案 - Replication-主从复制 - Tungsten-日志解析 - PGBaseBackup-PG备份
    */
    public static final class SchemaTypeEnum {

        /**
         * Enum REPLICATION for value: "Replication"
         */
        public static final SchemaTypeEnum REPLICATION = new SchemaTypeEnum("Replication");

        /**
         * Enum TUNGSTEN for value: "Tungsten"
         */
        public static final SchemaTypeEnum TUNGSTEN = new SchemaTypeEnum("Tungsten");

        /**
         * Enum PGBASEBACKUP for value: "PGBaseBackup"
         */
        public static final SchemaTypeEnum PGBASEBACKUP = new SchemaTypeEnum("PGBaseBackup");

        private static final Map<String, SchemaTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchemaTypeEnum> createStaticFields() {
            Map<String, SchemaTypeEnum> map = new HashMap<>();
            map.put("Replication", REPLICATION);
            map.put("Tungsten", TUNGSTEN);
            map.put("PGBaseBackup", PGBASEBACKUP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchemaTypeEnum(String value) {
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
        public static SchemaTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            SchemaTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SchemaTypeEnum(value);
            }
            return result;
        }

        public static SchemaTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SchemaTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchemaTypeEnum) {
                return this.value.equals(((SchemaTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_type")

    private SchemaTypeEnum schemaType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private String nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_switch")

    private Boolean objectSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_job_id")

    private String masterJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_mode")

    private String fullMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "struct_trans")

    private Boolean structTrans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_trans")

    private Boolean indexTrans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_definer")

    private Boolean replaceDefiner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_user")

    private Boolean migrateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_database")

    private Boolean syncDatabase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_root_db")

    private DefaultRootDb targetRootDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    private String azCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_write")

    private Boolean multiWrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ip_v6")

    private Boolean supportIpV6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_id")

    private String inheritId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gtid")

    private String gtid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private QuerySmnInfoResp alarmNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incre_start_position")

    private String increStartPosition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_name")

    private String azName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_az")

    private String masterAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_az")

    private String slaveAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_order")

    private PeriodOrderResp periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_infos")

    private List<DatabaseObjectInfo> objectInfos = null;

    /**
    * 初始任务方向。 取值： - up：入云，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
    */
    public static final class OriginalJobDirectionEnum {

        /**
         * Enum UP for value: "up"
         */
        public static final OriginalJobDirectionEnum UP = new OriginalJobDirectionEnum("up");

        /**
         * Enum DOWN for value: "down"
         */
        public static final OriginalJobDirectionEnum DOWN = new OriginalJobDirectionEnum("down");

        /**
         * Enum NON_DBS for value: "non-dbs"
         */
        public static final OriginalJobDirectionEnum NON_DBS = new OriginalJobDirectionEnum("non-dbs");

        private static final Map<String, OriginalJobDirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OriginalJobDirectionEnum> createStaticFields() {
            Map<String, OriginalJobDirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            map.put("non-dbs", NON_DBS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OriginalJobDirectionEnum(String value) {
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
        public static OriginalJobDirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OriginalJobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OriginalJobDirectionEnum(value);
            }
            return result;
        }

        public static OriginalJobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OriginalJobDirectionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OriginalJobDirectionEnum) {
                return this.value.equals(((OriginalJobDirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_job_direction")

    private OriginalJobDirectionEnum originalJobDirection;

    public QueryJobResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryJobResp withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父任务id。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public QueryJobResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryJobResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 - CREATING：创建中 - CREATE_FAILED：创建失败 - CONFIGURATION：配置中 - STARTJOBING：启动中 - WAITING_FOR_START：等待启动中 - START_JOB_FAILED：启动失败 - PAUSING：已暂停 - FULL_TRANSFER_STARTED：全量开始，灾备场景下为初始化 - FULL_TRANSFER_FAILED：全量失败，灾备场景下为初始化失败 - FULL_TRANSFER_COMPLETE：全量完成，灾备场景下为初始化完成 - INCRE_TRANSFER_STARTED：增量开始，灾备场景下为灾备中 - INCRE_TRANSFER_FAILED：增量失败，灾备场景下为灾备异常 - RELEASE_RESOURCE_STARTED：结束任务中 - RELEASE_RESOURCE_FAILED：结束任务失败 - RELEASE_RESOURCE_COMPLETE：已结束 - REBUILD_NODE_STARTED：故障恢复中 - REBUILD_NODE_FAILED：故障恢复失败 - CHANGE_JOB_STARTED：任务变更中 - CHANGE_JOB_FAILED：任务变更失败 - DELETED：已删除 - CHILD_TRANSFER_STARTING：再编辑子任务启动中 - CHILD_TRANSFER_STARTED：再编辑子任务迁移中 - CHILD_TRANSFER_COMPLETE：再编辑子任务迁移完成 - CHILD_TRANSFER_FAILED：再编辑子任务迁移失败 - RELEASE_CHILD_TRANSFER_STARTED：再编辑子任务结束中 - RELEASE_CHILD_TRANSFER_COMPLETE：再编辑子任务已结束 - NODE_UPGRADE_START：升级开始 - NODE_UPGRADE_COMPLETE：升级完成 - NODE_UPGRADE_FAILED：升级失败
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public QueryJobResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QueryJobResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，时间戳格式。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public QueryJobResp withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 迁移模式
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public QueryJobResp withSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public QueryJobResp withSourceEndpoint(Consumer<Endpoint> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new Endpoint();
            sourceEndpointSetter.accept(this.sourceEndpoint);
        }

        return this;
    }

    /**
     * Get sourceEndpoint
     * @return sourceEndpoint
     */
    public Endpoint getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(Endpoint sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public QueryJobResp withDmqEndpoint(Endpoint dmqEndpoint) {
        this.dmqEndpoint = dmqEndpoint;
        return this;
    }

    public QueryJobResp withDmqEndpoint(Consumer<Endpoint> dmqEndpointSetter) {
        if (this.dmqEndpoint == null) {
            this.dmqEndpoint = new Endpoint();
            dmqEndpointSetter.accept(this.dmqEndpoint);
        }

        return this;
    }

    /**
     * Get dmqEndpoint
     * @return dmqEndpoint
     */
    public Endpoint getDmqEndpoint() {
        return dmqEndpoint;
    }

    public void setDmqEndpoint(Endpoint dmqEndpoint) {
        this.dmqEndpoint = dmqEndpoint;
    }

    public QueryJobResp withSourceSharding(List<Endpoint> sourceSharding) {
        this.sourceSharding = sourceSharding;
        return this;
    }

    public QueryJobResp addSourceShardingItem(Endpoint sourceShardingItem) {
        if (this.sourceSharding == null) {
            this.sourceSharding = new ArrayList<>();
        }
        this.sourceSharding.add(sourceShardingItem);
        return this;
    }

    public QueryJobResp withSourceSharding(Consumer<List<Endpoint>> sourceShardingSetter) {
        if (this.sourceSharding == null) {
            this.sourceSharding = new ArrayList<>();
        }
        sourceShardingSetter.accept(this.sourceSharding);
        return this;
    }

    /**
     * 物理源库信息。
     * @return sourceSharding
     */
    public List<Endpoint> getSourceSharding() {
        return sourceSharding;
    }

    public void setSourceSharding(List<Endpoint> sourceSharding) {
        this.sourceSharding = sourceSharding;
    }

    public QueryJobResp withTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public QueryJobResp withTargetEndpoint(Consumer<Endpoint> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new Endpoint();
            targetEndpointSetter.accept(this.targetEndpoint);
        }

        return this;
    }

    /**
     * Get targetEndpoint
     * @return targetEndpoint
     */
    public Endpoint getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(Endpoint targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public QueryJobResp withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public QueryJobResp withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public QueryJobResp withInstInfo(InstInfo instInfo) {
        this.instInfo = instInfo;
        return this;
    }

    public QueryJobResp withInstInfo(Consumer<InstInfo> instInfoSetter) {
        if (this.instInfo == null) {
            this.instInfo = new InstInfo();
            instInfoSetter.accept(this.instInfo);
        }

        return this;
    }

    /**
     * Get instInfo
     * @return instInfo
     */
    public InstInfo getInstInfo() {
        return instInfo;
    }

    public void setInstInfo(InstInfo instInfo) {
        this.instInfo = instInfo;
    }

    public QueryJobResp withActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
        return this;
    }

    /**
     * 实际启动时间，时间戳格式。
     * @return actualStartTime
     */
    public String getActualStartTime() {
        return actualStartTime;
    }

    public void setActualStartTime(String actualStartTime) {
        this.actualStartTime = actualStartTime;
    }

    public QueryJobResp withFullTransferCompleteTime(String fullTransferCompleteTime) {
        this.fullTransferCompleteTime = fullTransferCompleteTime;
        return this;
    }

    /**
     * 全量完成时间，时间戳格式。
     * @return fullTransferCompleteTime
     */
    public String getFullTransferCompleteTime() {
        return fullTransferCompleteTime;
    }

    public void setFullTransferCompleteTime(String fullTransferCompleteTime) {
        this.fullTransferCompleteTime = fullTransferCompleteTime;
    }

    public QueryJobResp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，时间戳格式
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public QueryJobResp withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 任务方向
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public QueryJobResp withDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
        return this;
    }

    /**
     * 迁移场景 - migration：实时迁移 - sync：实时同步 - cloudDataGuard：实时灾备
     * @return dbUseType
     */
    public DbUseTypeEnum getDbUseType() {
        return dbUseType;
    }

    public void setDbUseType(DbUseTypeEnum dbUseType) {
        this.dbUseType = dbUseType;
    }

    public QueryJobResp withNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
        return this;
    }

    /**
     * 是否需要重启
     * @return needRestart
     */
    public Boolean getNeedRestart() {
        return needRestart;
    }

    public void setNeedRestart(Boolean needRestart) {
        this.needRestart = needRestart;
    }

    public QueryJobResp withIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
        return this;
    }

    /**
     * 指定目标实例是否限制为只读
     * @return isTargetReadonly
     */
    public Boolean getIsTargetReadonly() {
        return isTargetReadonly;
    }

    public void setIsTargetReadonly(Boolean isTargetReadonly) {
        this.isTargetReadonly = isTargetReadonly;
    }

    public QueryJobResp withConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
        return this;
    }

    /**
     * 冲突忽略策略 - stop：冲突失败 - overwrite：冲突覆盖 - ignore：冲突忽略
     * @return conflictPolicy
     */
    public ConflictPolicyEnum getConflictPolicy() {
        return conflictPolicy;
    }

    public void setConflictPolicy(ConflictPolicyEnum conflictPolicy) {
        this.conflictPolicy = conflictPolicy;
    }

    public QueryJobResp withFilterDdlPolicy(String filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
        return this;
    }

    /**
     * 过滤DDL策略 - drop_database：过滤drop_database - drop_databasefilter_all：过滤所有ddl - \"\"：不过滤
     * @return filterDdlPolicy
     */
    public String getFilterDdlPolicy() {
        return filterDdlPolicy;
    }

    public void setFilterDdlPolicy(String filterDdlPolicy) {
        this.filterDdlPolicy = filterDdlPolicy;
    }

    public QueryJobResp withSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public QueryJobResp addSpeedLimitItem(SpeedLimitInfo speedLimitItem) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        this.speedLimit.add(speedLimitItem);
        return this;
    }

    public QueryJobResp withSpeedLimit(Consumer<List<SpeedLimitInfo>> speedLimitSetter) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        speedLimitSetter.accept(this.speedLimit);
        return this;
    }

    /**
     * 迁移速度限制。
     * @return speedLimit
     */
    public List<SpeedLimitInfo> getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
    }

    public QueryJobResp withSchemaType(SchemaTypeEnum schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * 迁移方案 - Replication-主从复制 - Tungsten-日志解析 - PGBaseBackup-PG备份
     * @return schemaType
     */
    public SchemaTypeEnum getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(SchemaTypeEnum schemaType) {
        this.schemaType = schemaType;
    }

    public QueryJobResp withNodeNum(String nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点个数。
     * @return nodeNum
     */
    public String getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(String nodeNum) {
        this.nodeNum = nodeNum;
    }

    public QueryJobResp withObjectSwitch(Boolean objectSwitch) {
        this.objectSwitch = objectSwitch;
        return this;
    }

    /**
     * 对象选择开关
     * @return objectSwitch
     */
    public Boolean getObjectSwitch() {
        return objectSwitch;
    }

    public void setObjectSwitch(Boolean objectSwitch) {
        this.objectSwitch = objectSwitch;
    }

    public QueryJobResp withMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
        return this;
    }

    /**
     * 主任务Id。
     * @return masterJobId
     */
    public String getMasterJobId() {
        return masterJobId;
    }

    public void setMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
    }

    public QueryJobResp withFullMode(String fullMode) {
        this.fullMode = fullMode;
        return this;
    }

    /**
     * 全量快照模式。
     * @return fullMode
     */
    public String getFullMode() {
        return fullMode;
    }

    public void setFullMode(String fullMode) {
        this.fullMode = fullMode;
    }

    public QueryJobResp withStructTrans(Boolean structTrans) {
        this.structTrans = structTrans;
        return this;
    }

    /**
     * 是否迁移结构。
     * @return structTrans
     */
    public Boolean getStructTrans() {
        return structTrans;
    }

    public void setStructTrans(Boolean structTrans) {
        this.structTrans = structTrans;
    }

    public QueryJobResp withIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
        return this;
    }

    /**
     * 否迁移索引。
     * @return indexTrans
     */
    public Boolean getIndexTrans() {
        return indexTrans;
    }

    public void setIndexTrans(Boolean indexTrans) {
        this.indexTrans = indexTrans;
    }

    public QueryJobResp withReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
        return this;
    }

    /**
     * 是否使用目标库的用户替换掉definer。
     * @return replaceDefiner
     */
    public Boolean getReplaceDefiner() {
        return replaceDefiner;
    }

    public void setReplaceDefiner(Boolean replaceDefiner) {
        this.replaceDefiner = replaceDefiner;
    }

    public QueryJobResp withMigrateUser(Boolean migrateUser) {
        this.migrateUser = migrateUser;
        return this;
    }

    /**
     * 是否迁移用户。
     * @return migrateUser
     */
    public Boolean getMigrateUser() {
        return migrateUser;
    }

    public void setMigrateUser(Boolean migrateUser) {
        this.migrateUser = migrateUser;
    }

    public QueryJobResp withSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
        return this;
    }

    /**
     * 是否库级同步。
     * @return syncDatabase
     */
    public Boolean getSyncDatabase() {
        return syncDatabase;
    }

    public void setSyncDatabase(Boolean syncDatabase) {
        this.syncDatabase = syncDatabase;
    }

    public QueryJobResp withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public QueryJobResp withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public QueryJobResp withTargetRootDb(DefaultRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
        return this;
    }

    public QueryJobResp withTargetRootDb(Consumer<DefaultRootDb> targetRootDbSetter) {
        if (this.targetRootDb == null) {
            this.targetRootDb = new DefaultRootDb();
            targetRootDbSetter.accept(this.targetRootDb);
        }

        return this;
    }

    /**
     * Get targetRootDb
     * @return targetRootDb
     */
    public DefaultRootDb getTargetRootDb() {
        return targetRootDb;
    }

    public void setTargetRootDb(DefaultRootDb targetRootDb) {
        this.targetRootDb = targetRootDb;
    }

    public QueryJobResp withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * node所在AZ
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public QueryJobResp withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * node所在VPC
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public QueryJobResp withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * node所在子网
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public QueryJobResp withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * node所在安全组
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public QueryJobResp withMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
        return this;
    }

    /**
     * 是否多主灾备任务,双主灾备时有值为true
     * @return multiWrite
     */
    public Boolean getMultiWrite() {
        return multiWrite;
    }

    public void setMultiWrite(Boolean multiWrite) {
        this.multiWrite = multiWrite;
    }

    public QueryJobResp withSupportIpV6(Boolean supportIpV6) {
        this.supportIpV6 = supportIpV6;
        return this;
    }

    /**
     * 是否支持IPV6
     * @return supportIpV6
     */
    public Boolean getSupportIpV6() {
        return supportIpV6;
    }

    public void setSupportIpV6(Boolean supportIpV6) {
        this.supportIpV6 = supportIpV6;
    }

    public QueryJobResp withInheritId(String inheritId) {
        this.inheritId = inheritId;
        return this;
    }

    /**
     * 继承的任务ID，Oracle_Mrskafka链路时使用。
     * @return inheritId
     */
    public String getInheritId() {
        return inheritId;
    }

    public void setInheritId(String inheritId) {
        this.inheritId = inheritId;
    }

    public QueryJobResp withGtid(String gtid) {
        this.gtid = gtid;
        return this;
    }

    /**
     * 断点的GTID集合
     * @return gtid
     */
    public String getGtid() {
        return gtid;
    }

    public void setGtid(String gtid) {
        this.gtid = gtid;
    }

    public QueryJobResp withAlarmNotify(QuerySmnInfoResp alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    public QueryJobResp withAlarmNotify(Consumer<QuerySmnInfoResp> alarmNotifySetter) {
        if (this.alarmNotify == null) {
            this.alarmNotify = new QuerySmnInfoResp();
            alarmNotifySetter.accept(this.alarmNotify);
        }

        return this;
    }

    /**
     * Get alarmNotify
     * @return alarmNotify
     */
    public QuerySmnInfoResp getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(QuerySmnInfoResp alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public QueryJobResp withIncreStartPosition(String increStartPosition) {
        this.increStartPosition = increStartPosition;
        return this;
    }

    /**
     * 增量任务启动位点
     * @return increStartPosition
     */
    public String getIncreStartPosition() {
        return increStartPosition;
    }

    public void setIncreStartPosition(String increStartPosition) {
        this.increStartPosition = increStartPosition;
    }

    public QueryJobResp withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    /**
     * 是否是主备任务。
     * @return isMultiAz
     */
    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    public QueryJobResp withAzName(String azName) {
        this.azName = azName;
        return this;
    }

    /**
     * node所在节点AZ名称。
     * @return azName
     */
    public String getAzName() {
        return azName;
    }

    public void setAzName(String azName) {
        this.azName = azName;
    }

    public QueryJobResp withMasterAz(String masterAz) {
        this.masterAz = masterAz;
        return this;
    }

    /**
     * 主备任务主AZ。
     * @return masterAz
     */
    public String getMasterAz() {
        return masterAz;
    }

    public void setMasterAz(String masterAz) {
        this.masterAz = masterAz;
    }

    public QueryJobResp withSlaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
        return this;
    }

    /**
     * 主备任务备AZ。
     * @return slaveAz
     */
    public String getSlaveAz() {
        return slaveAz;
    }

    public void setSlaveAz(String slaveAz) {
        this.slaveAz = slaveAz;
    }

    public QueryJobResp withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 任务主备角色。
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public QueryJobResp withPeriodOrder(PeriodOrderResp periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public QueryJobResp withPeriodOrder(Consumer<PeriodOrderResp> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderResp();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderResp getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderResp periodOrder) {
        this.periodOrder = periodOrder;
    }

    public QueryJobResp withObjectInfos(List<DatabaseObjectInfo> objectInfos) {
        this.objectInfos = objectInfos;
        return this;
    }

    public QueryJobResp addObjectInfosItem(DatabaseObjectInfo objectInfosItem) {
        if (this.objectInfos == null) {
            this.objectInfos = new ArrayList<>();
        }
        this.objectInfos.add(objectInfosItem);
        return this;
    }

    public QueryJobResp withObjectInfos(Consumer<List<DatabaseObjectInfo>> objectInfosSetter) {
        if (this.objectInfos == null) {
            this.objectInfos = new ArrayList<>();
        }
        objectInfosSetter.accept(this.objectInfos);
        return this;
    }

    /**
     * 已同步对象信息。
     * @return objectInfos
     */
    public List<DatabaseObjectInfo> getObjectInfos() {
        return objectInfos;
    }

    public void setObjectInfos(List<DatabaseObjectInfo> objectInfos) {
        this.objectInfos = objectInfos;
    }

    public QueryJobResp withOriginalJobDirection(OriginalJobDirectionEnum originalJobDirection) {
        this.originalJobDirection = originalJobDirection;
        return this;
    }

    /**
     * 初始任务方向。 取值： - up：入云，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
     * @return originalJobDirection
     */
    public OriginalJobDirectionEnum getOriginalJobDirection() {
        return originalJobDirection;
    }

    public void setOriginalJobDirection(OriginalJobDirectionEnum originalJobDirection) {
        this.originalJobDirection = originalJobDirection;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryJobResp queryJobResp = (QueryJobResp) o;
        return Objects.equals(this.id, queryJobResp.id) && Objects.equals(this.parentId, queryJobResp.parentId)
            && Objects.equals(this.name, queryJobResp.name) && Objects.equals(this.status, queryJobResp.status)
            && Objects.equals(this.description, queryJobResp.description)
            && Objects.equals(this.createTime, queryJobResp.createTime)
            && Objects.equals(this.taskType, queryJobResp.taskType)
            && Objects.equals(this.sourceEndpoint, queryJobResp.sourceEndpoint)
            && Objects.equals(this.dmqEndpoint, queryJobResp.dmqEndpoint)
            && Objects.equals(this.sourceSharding, queryJobResp.sourceSharding)
            && Objects.equals(this.targetEndpoint, queryJobResp.targetEndpoint)
            && Objects.equals(this.netType, queryJobResp.netType)
            && Objects.equals(this.failedReason, queryJobResp.failedReason)
            && Objects.equals(this.instInfo, queryJobResp.instInfo)
            && Objects.equals(this.actualStartTime, queryJobResp.actualStartTime)
            && Objects.equals(this.fullTransferCompleteTime, queryJobResp.fullTransferCompleteTime)
            && Objects.equals(this.updateTime, queryJobResp.updateTime)
            && Objects.equals(this.jobDirection, queryJobResp.jobDirection)
            && Objects.equals(this.dbUseType, queryJobResp.dbUseType)
            && Objects.equals(this.needRestart, queryJobResp.needRestart)
            && Objects.equals(this.isTargetReadonly, queryJobResp.isTargetReadonly)
            && Objects.equals(this.conflictPolicy, queryJobResp.conflictPolicy)
            && Objects.equals(this.filterDdlPolicy, queryJobResp.filterDdlPolicy)
            && Objects.equals(this.speedLimit, queryJobResp.speedLimit)
            && Objects.equals(this.schemaType, queryJobResp.schemaType)
            && Objects.equals(this.nodeNum, queryJobResp.nodeNum)
            && Objects.equals(this.objectSwitch, queryJobResp.objectSwitch)
            && Objects.equals(this.masterJobId, queryJobResp.masterJobId)
            && Objects.equals(this.fullMode, queryJobResp.fullMode)
            && Objects.equals(this.structTrans, queryJobResp.structTrans)
            && Objects.equals(this.indexTrans, queryJobResp.indexTrans)
            && Objects.equals(this.replaceDefiner, queryJobResp.replaceDefiner)
            && Objects.equals(this.migrateUser, queryJobResp.migrateUser)
            && Objects.equals(this.syncDatabase, queryJobResp.syncDatabase)
            && Objects.equals(this.errorCode, queryJobResp.errorCode)
            && Objects.equals(this.errorMessage, queryJobResp.errorMessage)
            && Objects.equals(this.targetRootDb, queryJobResp.targetRootDb)
            && Objects.equals(this.azCode, queryJobResp.azCode) && Objects.equals(this.vpcId, queryJobResp.vpcId)
            && Objects.equals(this.subnetId, queryJobResp.subnetId)
            && Objects.equals(this.securityGroupId, queryJobResp.securityGroupId)
            && Objects.equals(this.multiWrite, queryJobResp.multiWrite)
            && Objects.equals(this.supportIpV6, queryJobResp.supportIpV6)
            && Objects.equals(this.inheritId, queryJobResp.inheritId) && Objects.equals(this.gtid, queryJobResp.gtid)
            && Objects.equals(this.alarmNotify, queryJobResp.alarmNotify)
            && Objects.equals(this.increStartPosition, queryJobResp.increStartPosition)
            && Objects.equals(this.isMultiAz, queryJobResp.isMultiAz)
            && Objects.equals(this.azName, queryJobResp.azName) && Objects.equals(this.masterAz, queryJobResp.masterAz)
            && Objects.equals(this.slaveAz, queryJobResp.slaveAz)
            && Objects.equals(this.nodeRole, queryJobResp.nodeRole)
            && Objects.equals(this.periodOrder, queryJobResp.periodOrder)
            && Objects.equals(this.objectInfos, queryJobResp.objectInfos)
            && Objects.equals(this.originalJobDirection, queryJobResp.originalJobDirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parentId,
            name,
            status,
            description,
            createTime,
            taskType,
            sourceEndpoint,
            dmqEndpoint,
            sourceSharding,
            targetEndpoint,
            netType,
            failedReason,
            instInfo,
            actualStartTime,
            fullTransferCompleteTime,
            updateTime,
            jobDirection,
            dbUseType,
            needRestart,
            isTargetReadonly,
            conflictPolicy,
            filterDdlPolicy,
            speedLimit,
            schemaType,
            nodeNum,
            objectSwitch,
            masterJobId,
            fullMode,
            structTrans,
            indexTrans,
            replaceDefiner,
            migrateUser,
            syncDatabase,
            errorCode,
            errorMessage,
            targetRootDb,
            azCode,
            vpcId,
            subnetId,
            securityGroupId,
            multiWrite,
            supportIpV6,
            inheritId,
            gtid,
            alarmNotify,
            increStartPosition,
            isMultiAz,
            azName,
            masterAz,
            slaveAz,
            nodeRole,
            periodOrder,
            objectInfos,
            originalJobDirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryJobResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    dmqEndpoint: ").append(toIndentedString(dmqEndpoint)).append("\n");
        sb.append("    sourceSharding: ").append(toIndentedString(sourceSharding)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    instInfo: ").append(toIndentedString(instInfo)).append("\n");
        sb.append("    actualStartTime: ").append(toIndentedString(actualStartTime)).append("\n");
        sb.append("    fullTransferCompleteTime: ").append(toIndentedString(fullTransferCompleteTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    dbUseType: ").append(toIndentedString(dbUseType)).append("\n");
        sb.append("    needRestart: ").append(toIndentedString(needRestart)).append("\n");
        sb.append("    isTargetReadonly: ").append(toIndentedString(isTargetReadonly)).append("\n");
        sb.append("    conflictPolicy: ").append(toIndentedString(conflictPolicy)).append("\n");
        sb.append("    filterDdlPolicy: ").append(toIndentedString(filterDdlPolicy)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    objectSwitch: ").append(toIndentedString(objectSwitch)).append("\n");
        sb.append("    masterJobId: ").append(toIndentedString(masterJobId)).append("\n");
        sb.append("    fullMode: ").append(toIndentedString(fullMode)).append("\n");
        sb.append("    structTrans: ").append(toIndentedString(structTrans)).append("\n");
        sb.append("    indexTrans: ").append(toIndentedString(indexTrans)).append("\n");
        sb.append("    replaceDefiner: ").append(toIndentedString(replaceDefiner)).append("\n");
        sb.append("    migrateUser: ").append(toIndentedString(migrateUser)).append("\n");
        sb.append("    syncDatabase: ").append(toIndentedString(syncDatabase)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    targetRootDb: ").append(toIndentedString(targetRootDb)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    multiWrite: ").append(toIndentedString(multiWrite)).append("\n");
        sb.append("    supportIpV6: ").append(toIndentedString(supportIpV6)).append("\n");
        sb.append("    inheritId: ").append(toIndentedString(inheritId)).append("\n");
        sb.append("    gtid: ").append(toIndentedString(gtid)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    increStartPosition: ").append(toIndentedString(increStartPosition)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    azName: ").append(toIndentedString(azName)).append("\n");
        sb.append("    masterAz: ").append(toIndentedString(masterAz)).append("\n");
        sb.append("    slaveAz: ").append(toIndentedString(slaveAz)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    objectInfos: ").append(toIndentedString(objectInfos)).append("\n");
        sb.append("    originalJobDirection: ").append(toIndentedString(originalJobDirection)).append("\n");
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

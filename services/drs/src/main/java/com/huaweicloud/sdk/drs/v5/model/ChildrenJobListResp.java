package com.huaweicloud.sdk.drs.v5.model;

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
 * 子任务列表响应体。
 */
public class ChildrenJobListResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务状态。取值： - CREATING：创建中。 - CREATE_FAILED：创建失败。 - CONFIGURATION：配置中。 - STARTJOBING：启动中。 - WAITING_FOR_START：等待启动中。 - START_JOB_FAILED：任务启动失败。 - FULL_TRANSFER_STARTED：全量迁移中 灾备场景为初始化。 - FULL_TRANSFER_FAILED：全量迁移失败 灾备场景为初始化失败。 - FULL_TRANSFER_COMPLETE：全量迁移完成 灾备场景为初始化完成。 - INCRE_TRANSFER_STARTED：增量迁移中 灾备场景为灾备中。 - INCRE_TRANSFER_FAILED：增量迁移失败 灾备场景为灾备异常。 - RELEASE_RESOURCE_STARTED：结束任务中。 - RELEASE_RESOURCE_FAILED：结束任务失败。 - RELEASE_RESOURCE_COMPLETE：已结束。 - CHANGE_JOB_STARTED：任务变更中。 - CHANGE_JOB_FAILED：任务变更失败。 - CHILD_TRANSFER_STARTING：子任务启动中。 - CHILD_TRANSFER_STARTED：子任务迁移中。 - CHILD_TRANSFER_COMPLETE：子任务迁移完成。 - CHILD_TRANSFER_FAILED：子任务迁移失败。 - RELEASE_CHILD_TRANSFER_STARTED：子任务结束中。 - RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束。
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
         * Enum CHANGE_JOB_STARTED for value: "CHANGE_JOB_STARTED"
         */
        public static final StatusEnum CHANGE_JOB_STARTED = new StatusEnum("CHANGE_JOB_STARTED");

        /**
         * Enum CHANGE_JOB_FAILED for value: "CHANGE_JOB_FAILED"
         */
        public static final StatusEnum CHANGE_JOB_FAILED = new StatusEnum("CHANGE_JOB_FAILED");

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

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("CREATING", CREATING);
            map.put("CREATE_FAILED", CREATE_FAILED);
            map.put("CONFIGURATION", CONFIGURATION);
            map.put("STARTJOBING", STARTJOBING);
            map.put("WAITING_FOR_START", WAITING_FOR_START);
            map.put("START_JOB_FAILED", START_JOB_FAILED);
            map.put("FULL_TRANSFER_STARTED", FULL_TRANSFER_STARTED);
            map.put("FULL_TRANSFER_FAILED", FULL_TRANSFER_FAILED);
            map.put("FULL_TRANSFER_COMPLETE", FULL_TRANSFER_COMPLETE);
            map.put("INCRE_TRANSFER_STARTED", INCRE_TRANSFER_STARTED);
            map.put("INCRE_TRANSFER_FAILED", INCRE_TRANSFER_FAILED);
            map.put("RELEASE_RESOURCE_STARTED", RELEASE_RESOURCE_STARTED);
            map.put("RELEASE_RESOURCE_FAILED", RELEASE_RESOURCE_FAILED);
            map.put("RELEASE_RESOURCE_COMPLETE", RELEASE_RESOURCE_COMPLETE);
            map.put("CHANGE_JOB_STARTED", CHANGE_JOB_STARTED);
            map.put("CHANGE_JOB_FAILED", CHANGE_JOB_FAILED);
            map.put("CHILD_TRANSFER_STARTING", CHILD_TRANSFER_STARTING);
            map.put("CHILD_TRANSFER_STARTED", CHILD_TRANSFER_STARTED);
            map.put("CHILD_TRANSFER_COMPLETE", CHILD_TRANSFER_COMPLETE);
            map.put("CHILD_TRANSFER_FAILED", CHILD_TRANSFER_FAILED);
            map.put("RELEASE_CHILD_TRANSFER_STARTED", RELEASE_CHILD_TRANSFER_STARTED);
            map.put("RELEASE_CHILD_TRANSFER_COMPLETE", RELEASE_CHILD_TRANSFER_COMPLETE);
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    /**
     * 引擎类型。取值： - oracle-to-gaussdbv5：Oracle同步到GaussDB分布式版，实时同步场景使用。 - redis-to-gaussredis：Redis同步到GeminiDB Redis，实时迁移场景使用。 - rediscluster-to-gaussredis：Redis集群同步到GeminiDB Redis，实时迁移场景使用。
     */
    public static final class EngineTypeEnum {

        /**
         * Enum ORACLE_TO_GAUSSDBV5 for value: "oracle-to-gaussdbv5"
         */
        public static final EngineTypeEnum ORACLE_TO_GAUSSDBV5 = new EngineTypeEnum("oracle-to-gaussdbv5");

        /**
         * Enum REDIS_TO_GAUSSREDIS for value: "redis-to-gaussredis"
         */
        public static final EngineTypeEnum REDIS_TO_GAUSSREDIS = new EngineTypeEnum("redis-to-gaussredis");

        /**
         * Enum REDISCLUSTER_TO_GAUSSREDIS for value: "rediscluster-to-gaussredis"
         */
        public static final EngineTypeEnum REDISCLUSTER_TO_GAUSSREDIS =
            new EngineTypeEnum("rediscluster-to-gaussredis");

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("oracle-to-gaussdbv5", ORACLE_TO_GAUSSDBV5);
            map.put("redis-to-gaussredis", REDIS_TO_GAUSSREDIS);
            map.put("rediscluster-to-gaussredis", REDISCLUSTER_TO_GAUSSREDIS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineTypeEnum(value));
        }

        public static EngineTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private EngineTypeEnum engineType;

    /**
     * 网络类型。取值： - eip：公网网络。 - vpc：VPC网络，灾备场景不支持选择VPC网络。 - vpn：VPN、专线网络。
     */
    public static final class NetTypeEnum {

        /**
         * Enum EIP for value: "eip"
         */
        public static final NetTypeEnum EIP = new NetTypeEnum("eip");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetTypeEnum VPC = new NetTypeEnum("vpc");

        /**
         * Enum VPN for value: "vpn"
         */
        public static final NetTypeEnum VPN = new NetTypeEnum("vpn");

        private static final Map<String, NetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetTypeEnum> createStaticFields() {
            Map<String, NetTypeEnum> map = new HashMap<>();
            map.put("eip", EIP);
            map.put("vpc", VPC);
            map.put("vpn", VPN);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetTypeEnum(value));
        }

        public static NetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 计费模式。取值： - period：包周期。 - on_demand：按需。
     */
    public static final class ChargingModeEnum {

        /**
         * Enum PERIOD for value: "period"
         */
        public static final ChargingModeEnum PERIOD = new ChargingModeEnum("period");

        /**
         * Enum ON_DEMAND for value: "on_demand"
         */
        public static final ChargingModeEnum ON_DEMAND = new ChargingModeEnum("on_demand");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("period", PERIOD);
            map.put("on_demand", ON_DEMAND);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_tag")

    private Boolean billingTag;

    /**
     * 任务方向。取值： - up：入云 ，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobDirectionEnum(value));
        }

        public static JobDirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
     * 任务场景。取值： - migration：实时迁移。 - sync：实时同步。 - cloudDataGuard：实时灾备。
     */
    public static final class JobTypeEnum {

        /**
         * Enum MIGRATION for value: "migration"
         */
        public static final JobTypeEnum MIGRATION = new JobTypeEnum("migration");

        /**
         * Enum SYNC for value: "sync"
         */
        public static final JobTypeEnum SYNC = new JobTypeEnum("sync");

        /**
         * Enum CLOUDDATAGUARD for value: "cloudDataGuard"
         */
        public static final JobTypeEnum CLOUDDATAGUARD = new JobTypeEnum("cloudDataGuard");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            map.put("sync", SYNC);
            map.put("cloudDataGuard", CLOUDDATAGUARD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    /**
     * 任务模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
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
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * 任务模式。取值： - single：单任务。 - sync_child：同步子任务。 - multi_to_single：多对一任务。
     */
    public static final class JobModeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final JobModeEnum SINGLE = new JobModeEnum("single");

        /**
         * Enum SYNC_CHILD for value: "sync_child"
         */
        public static final JobModeEnum SYNC_CHILD = new JobModeEnum("sync_child");

        /**
         * Enum MULTI_TO_SINGLE for value: "multi_to_single"
         */
        public static final JobModeEnum MULTI_TO_SINGLE = new JobModeEnum("multi_to_single");

        private static final Map<String, JobModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobModeEnum> createStaticFields() {
            Map<String, JobModeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("sync_child", SYNC_CHILD);
            map.put("multi_to_single", MULTI_TO_SINGLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobModeEnum(String value) {
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
        public static JobModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobModeEnum(value));
        }

        public static JobModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobModeEnum) {
                return this.value.equals(((JobModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode")

    private JobModeEnum jobMode;

    /**
     * 任务角色。取值： - parent：父任务。 - child：子任务。 - master：主任务。 - slave：备任务。
     */
    public static final class JobModeRoleEnum {

        /**
         * Enum PARENT for value: "parent"
         */
        public static final JobModeRoleEnum PARENT = new JobModeRoleEnum("parent");

        /**
         * Enum CHILD for value: "child"
         */
        public static final JobModeRoleEnum CHILD = new JobModeRoleEnum("child");

        /**
         * Enum MASTER for value: "master"
         */
        public static final JobModeRoleEnum MASTER = new JobModeRoleEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final JobModeRoleEnum SLAVE = new JobModeRoleEnum("slave");

        private static final Map<String, JobModeRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobModeRoleEnum> createStaticFields() {
            Map<String, JobModeRoleEnum> map = new HashMap<>();
            map.put("parent", PARENT);
            map.put("child", CHILD);
            map.put("master", MASTER);
            map.put("slave", SLAVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobModeRoleEnum(String value) {
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
        public static JobModeRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobModeRoleEnum(value));
        }

        public static JobModeRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobModeRoleEnum) {
                return this.value.equals(((JobModeRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_mode_role")

    private JobModeRoleEnum jobModeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_multi_az")

    private Boolean isMultiAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_new_framework")

    private Boolean nodeNewFramework;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_action")

    private JobActions jobAction;

    public ChildrenJobListResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChildrenJobListResp withName(String name) {
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

    public ChildrenJobListResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。取值： - CREATING：创建中。 - CREATE_FAILED：创建失败。 - CONFIGURATION：配置中。 - STARTJOBING：启动中。 - WAITING_FOR_START：等待启动中。 - START_JOB_FAILED：任务启动失败。 - FULL_TRANSFER_STARTED：全量迁移中 灾备场景为初始化。 - FULL_TRANSFER_FAILED：全量迁移失败 灾备场景为初始化失败。 - FULL_TRANSFER_COMPLETE：全量迁移完成 灾备场景为初始化完成。 - INCRE_TRANSFER_STARTED：增量迁移中 灾备场景为灾备中。 - INCRE_TRANSFER_FAILED：增量迁移失败 灾备场景为灾备异常。 - RELEASE_RESOURCE_STARTED：结束任务中。 - RELEASE_RESOURCE_FAILED：结束任务失败。 - RELEASE_RESOURCE_COMPLETE：已结束。 - CHANGE_JOB_STARTED：任务变更中。 - CHANGE_JOB_FAILED：任务变更失败。 - CHILD_TRANSFER_STARTING：子任务启动中。 - CHILD_TRANSFER_STARTED：子任务迁移中。 - CHILD_TRANSFER_COMPLETE：子任务迁移完成。 - CHILD_TRANSFER_FAILED：子任务迁移失败。 - RELEASE_CHILD_TRANSFER_STARTED：子任务结束中。 - RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ChildrenJobListResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChildrenJobListResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ChildrenJobListResp withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型。取值： - oracle-to-gaussdbv5：Oracle同步到GaussDB分布式版，实时同步场景使用。 - redis-to-gaussredis：Redis同步到GeminiDB Redis，实时迁移场景使用。 - rediscluster-to-gaussredis：Redis集群同步到GeminiDB Redis，实时迁移场景使用。
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    public ChildrenJobListResp withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。取值： - eip：公网网络。 - vpc：VPC网络，灾备场景不支持选择VPC网络。 - vpn：VPN、专线网络。
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public ChildrenJobListResp withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。取值： - period：包周期。 - on_demand：按需。
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public ChildrenJobListResp withBillingTag(Boolean billingTag) {
        this.billingTag = billingTag;
        return this;
    }

    /**
     * 是否计费。
     * @return billingTag
     */
    public Boolean getBillingTag() {
        return billingTag;
    }

    public void setBillingTag(Boolean billingTag) {
        this.billingTag = billingTag;
    }

    public ChildrenJobListResp withJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 任务方向。取值： - up：入云 ，灾备场景时对应本云为备。 - down：出云，灾备场景时对应本云为主。 - non-dbs：自建。
     * @return jobDirection
     */
    public JobDirectionEnum getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(JobDirectionEnum jobDirection) {
        this.jobDirection = jobDirection;
    }

    public ChildrenJobListResp withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 任务场景。取值： - migration：实时迁移。 - sync：实时同步。 - cloudDataGuard：实时灾备。
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ChildrenJobListResp withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务模式。取值： - FULL_TRANS ：全量。 - FULL_INCR_TRANS：全量+增量。 - INCR_TRANS：增量。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ChildrenJobListResp withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ChildrenJobListResp withJobMode(JobModeEnum jobMode) {
        this.jobMode = jobMode;
        return this;
    }

    /**
     * 任务模式。取值： - single：单任务。 - sync_child：同步子任务。 - multi_to_single：多对一任务。
     * @return jobMode
     */
    public JobModeEnum getJobMode() {
        return jobMode;
    }

    public void setJobMode(JobModeEnum jobMode) {
        this.jobMode = jobMode;
    }

    public ChildrenJobListResp withJobModeRole(JobModeRoleEnum jobModeRole) {
        this.jobModeRole = jobModeRole;
        return this;
    }

    /**
     * 任务角色。取值： - parent：父任务。 - child：子任务。 - master：主任务。 - slave：备任务。
     * @return jobModeRole
     */
    public JobModeRoleEnum getJobModeRole() {
        return jobModeRole;
    }

    public void setJobModeRole(JobModeRoleEnum jobModeRole) {
        this.jobModeRole = jobModeRole;
    }

    public ChildrenJobListResp withIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
        return this;
    }

    /**
     * 是否跨AZ任务。
     * @return isMultiAz
     */
    public Boolean getIsMultiAz() {
        return isMultiAz;
    }

    public void setIsMultiAz(Boolean isMultiAz) {
        this.isMultiAz = isMultiAz;
    }

    public ChildrenJobListResp withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 任务节点角色。
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    public ChildrenJobListResp withNodeNewFramework(Boolean nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
        return this;
    }

    /**
     * 是否新框架。
     * @return nodeNewFramework
     */
    public Boolean getNodeNewFramework() {
        return nodeNewFramework;
    }

    public void setNodeNewFramework(Boolean nodeNewFramework) {
        this.nodeNewFramework = nodeNewFramework;
    }

    public ChildrenJobListResp withJobAction(JobActions jobAction) {
        this.jobAction = jobAction;
        return this;
    }

    public ChildrenJobListResp withJobAction(Consumer<JobActions> jobActionSetter) {
        if (this.jobAction == null) {
            this.jobAction = new JobActions();
            jobActionSetter.accept(this.jobAction);
        }

        return this;
    }

    /**
     * Get jobAction
     * @return jobAction
     */
    public JobActions getJobAction() {
        return jobAction;
    }

    public void setJobAction(JobActions jobAction) {
        this.jobAction = jobAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChildrenJobListResp that = (ChildrenJobListResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.engineType, that.engineType)
            && Objects.equals(this.netType, that.netType) && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.billingTag, that.billingTag) && Objects.equals(this.jobDirection, that.jobDirection)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.jobMode, that.jobMode) && Objects.equals(this.jobModeRole, that.jobModeRole)
            && Objects.equals(this.isMultiAz, that.isMultiAz) && Objects.equals(this.nodeRole, that.nodeRole)
            && Objects.equals(this.nodeNewFramework, that.nodeNewFramework)
            && Objects.equals(this.jobAction, that.jobAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            description,
            createTime,
            engineType,
            netType,
            chargingMode,
            billingTag,
            jobDirection,
            jobType,
            taskType,
            enterpriseProjectId,
            jobMode,
            jobModeRole,
            isMultiAz,
            nodeRole,
            nodeNewFramework,
            jobAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChildrenJobListResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    billingTag: ").append(toIndentedString(billingTag)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    jobMode: ").append(toIndentedString(jobMode)).append("\n");
        sb.append("    jobModeRole: ").append(toIndentedString(jobModeRole)).append("\n");
        sb.append("    isMultiAz: ").append(toIndentedString(isMultiAz)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    nodeNewFramework: ").append(toIndentedString(nodeNewFramework)).append("\n");
        sb.append("    jobAction: ").append(toIndentedString(jobAction)).append("\n");
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

package com.huaweicloud.sdk.drs.v5.model;

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
 * 导出任务列表请求体
 */
public class ExportJobsReq {

    /**
     * DRS任务的业务场景类型。用于筛选导出特定业务场景类型的任务列表。 取值： - migration 实时迁移 - sync 实时同步 - backupMigration 备份迁移 - subscription 订阅 - cloudDataGuard 实时灾备
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

        /**
         * Enum BACKUPMIGRATION for value: "backupMigration"
         */
        public static final JobTypeEnum BACKUPMIGRATION = new JobTypeEnum("backupMigration");

        /**
         * Enum SUBSCRIPTION for value: "subscription"
         */
        public static final JobTypeEnum SUBSCRIPTION = new JobTypeEnum("subscription");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("migration", MIGRATION);
            map.put("sync", SYNC);
            map.put("cloudDataGuard", CLOUDDATAGUARD);
            map.put("backupMigration", BACKUPMIGRATION);
            map.put("subscription", SUBSCRIPTION);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务状态。默认查询所有状态的任务 - 当job_type取值：migration,sync,cloudDataGuard     对应的任务状态取值如下：     CREATING：创建中。     CREATE_FAILED：创建失败。     CONFIGURATION：配置中。     STARTJOBING：启动中。     WAITING_FOR_START：等待启动中。     START_JOB_FAILED：任务启动失败。     FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化。     FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败。     FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成。     INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中。     INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常。     RELEASE_RESOURCE_STARTED：结束任务中。     RELEASE_RESOURCE_FAILED：结束任务失败。     RELEASE_RESOURCE_COMPLETE：已结束。     CHANGE_JOB_STARTED：任务变更中。     CHANGE_JOB_FAILED：任务变更失败。     CHILD_TRANSFER_STARTING：子任务启动中。     CHILD_TRANSFER_STARTED：子任务迁移中。     CHILD_TRANSFER_COMPLETE：子任务迁移完成。     CHILD_TRANSFER_FAILED：子任务迁移失败。     RELEASE_CHILD_TRANSFER_STARTED：子任务结束中。     RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束。其中，异常状态可单独查询，也可以通过以下方式查询全部异常任务：CREATE_FAILED，START_JOB_FAILED，FULL_TRANSFER_FAILED，INCRE_TRANSFER_FAILED，RELEASE_RESOURCE_FAILED，CHANGE_JOB_FAILED，CHILD_TRANSFER_FAILED。 - 当job_type取值：backupMigration   对应的任务状态取值如下：     SUBSCRIPTION_STARTED：创建中。     CREATE_FAILED：创建失败。     SUBSCRIPTION_FAILED：订阅失败。     CONFIGURATION：配置中。     STARTJOBING：启动中。     REBUILD_NODE_STARTED：故障恢复。     REBUILD_NODE_FAILED：故障恢复失败。     START_JOB_FAILED：任务启动失败。 - 当job_type取值：subscription   对应的任务状态取值如下：     SUCCESS：成功。     TRANSFERRING：备份迁移中。     FAILED：失败。     PRECHECK FAILED：预检查失败。
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

        /**
         * Enum SUBSCRIPTION_STARTED for value: "SUBSCRIPTION_STARTED"
         */
        public static final StatusEnum SUBSCRIPTION_STARTED = new StatusEnum("SUBSCRIPTION_STARTED");

        /**
         * Enum SUBSCRIPTION_FAILED for value: "SUBSCRIPTION_FAILED"
         */
        public static final StatusEnum SUBSCRIPTION_FAILED = new StatusEnum("SUBSCRIPTION_FAILED");

        /**
         * Enum EMPTY for value: ""
         */
        public static final StatusEnum EMPTY = new StatusEnum("");

        /**
         * Enum REBUILD_NODE_FAILED for value: "REBUILD_NODE_FAILED"
         */
        public static final StatusEnum REBUILD_NODE_FAILED = new StatusEnum("REBUILD_NODE_FAILED");

        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        /**
         * Enum TRANSFERRING for value: "TRANSFERRING"
         */
        public static final StatusEnum TRANSFERRING = new StatusEnum("TRANSFERRING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        /**
         * Enum PRECHECK_FAILED for value: "PRECHECK FAILED"
         */
        public static final StatusEnum PRECHECK_FAILED = new StatusEnum("PRECHECK FAILED");

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
            map.put("SUBSCRIPTION_STARTED", SUBSCRIPTION_STARTED);
            map.put("SUBSCRIPTION_FAILED", SUBSCRIPTION_FAILED);
            map.put("", EMPTY);
            map.put("REBUILD_NODE_FAILED", REBUILD_NODE_FAILED);
            map.put("SUCCESS", SUCCESS);
            map.put("TRANSFERRING", TRANSFERRING);
            map.put("FAILED", FAILED);
            map.put("PRECHECK FAILED", PRECHECK_FAILED);
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
    @JsonProperty(value = "dbs_instance_ids")

    private List<String> dbsInstanceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "completed_at")

    private String completedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    /**
     * 网络类型。取值： eip：公网网络。 vpc：VPC网络。 vpn：VPN、专线网络。 当job_type取值：migration,sync,cloudDataGuard，该参数支持填写。
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
     * 计费标识。当job_type取值：migration,sync,cloudDataGuard,subscription，该参数支持填写。取值\"0\"表示计费中，\"1\"表示未计费
     */
    public static final class BillingTagEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final BillingTagEnum _0 = new BillingTagEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final BillingTagEnum _1 = new BillingTagEnum("1");

        private static final Map<String, BillingTagEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BillingTagEnum> createStaticFields() {
            Map<String, BillingTagEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BillingTagEnum(String value) {
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
        public static BillingTagEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingTagEnum(value));
        }

        public static BillingTagEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingTagEnum) {
                return this.value.equals(((BillingTagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_tag")

    private BillingTagEnum billingTag;

    /**
     * 计费模式。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。取值：\"1\"表示包年包月，\"0\"表示按需计费
     */
    public static final class BillingModeEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final BillingModeEnum _0 = new BillingModeEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final BillingModeEnum _1 = new BillingModeEnum("1");

        private static final Map<String, BillingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BillingModeEnum> createStaticFields() {
            Map<String, BillingModeEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BillingModeEnum(String value) {
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
        public static BillingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BillingModeEnum(value));
        }

        public static BillingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BillingModeEnum) {
                return this.value.equals(((BillingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_mode")

    private BillingModeEnum billingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_ip")

    private String instanceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inner_ip")

    private String innerIp;

    /**
     * 规格类型。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。 取值如下： 2xlarge：极大规格。 xlarge：超大规格。 high：大规格。 medium：中规格。 small：小规格。 micro：极小规格。
     */
    public static final class SpecTypeEnum {

        /**
         * Enum _2XLARGE for value: "2xlarge"
         */
        public static final SpecTypeEnum _2XLARGE = new SpecTypeEnum("2xlarge");

        /**
         * Enum XLARGE for value: "xlarge"
         */
        public static final SpecTypeEnum XLARGE = new SpecTypeEnum("xlarge");

        /**
         * Enum HIGH for value: "high"
         */
        public static final SpecTypeEnum HIGH = new SpecTypeEnum("high");

        /**
         * Enum MEDIUM for value: "medium"
         */
        public static final SpecTypeEnum MEDIUM = new SpecTypeEnum("medium");

        /**
         * Enum SMALL for value: "small"
         */
        public static final SpecTypeEnum SMALL = new SpecTypeEnum("small");

        /**
         * Enum MICRO for value: "micro"
         */
        public static final SpecTypeEnum MICRO = new SpecTypeEnum("micro");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("2xlarge", _2XLARGE);
            map.put("xlarge", XLARGE);
            map.put("high", HIGH);
            map.put("medium", MEDIUM);
            map.put("small", SMALL);
            map.put("micro", MICRO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecTypeEnum(String value) {
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
        public static SpecTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecTypeEnum(value));
        }

        public static SpecTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecTypeEnum) {
                return this.value.equals(((SpecTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_type")

    private SpecTypeEnum specType;

    /**
     * 数据流动方向。 当job_type取值migration,sync时支持传值。 取值： - up：入云 - down：出云 - non-dbs：自建 - multiWrite：双向同步。 当job_type取值cloudDataGuard时支持传值， 取值： - up：本云为备 - down：本云为主 - multiWrite：双主灾备
     */
    public static final class DirectionEnum {

        /**
         * Enum UP for value: "up"
         */
        public static final DirectionEnum UP = new DirectionEnum("up");

        /**
         * Enum DOWN for value: "down"
         */
        public static final DirectionEnum DOWN = new DirectionEnum("down");

        /**
         * Enum NON_DBS for value: "non-dbs"
         */
        public static final DirectionEnum NON_DBS = new DirectionEnum("non-dbs");

        /**
         * Enum MULTIWRITE for value: "multiWrite"
         */
        public static final DirectionEnum MULTIWRITE = new DirectionEnum("multiWrite");

        private static final Map<String, DirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DirectionEnum> createStaticFields() {
            Map<String, DirectionEnum> map = new HashMap<>();
            map.put("up", UP);
            map.put("down", DOWN);
            map.put("non-dbs", NON_DBS);
            map.put("multiWrite", MULTIWRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DirectionEnum(String value) {
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
        public static DirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DirectionEnum(value));
        }

        public static DirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DirectionEnum) {
                return this.value.equals(((DirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direction")

    private DirectionEnum direction;

    /**
     * 同步类型。当job_type取值migration,sync时支持传值。
     */
    public static final class TaskTypeEnum {

        /**
         * Enum FULL_INCR_TRANS for value: "FULL_INCR_TRANS"
         */
        public static final TaskTypeEnum FULL_INCR_TRANS = new TaskTypeEnum("FULL_INCR_TRANS");

        /**
         * Enum FULL_TRANS for value: "FULL_TRANS"
         */
        public static final TaskTypeEnum FULL_TRANS = new TaskTypeEnum("FULL_TRANS");

        /**
         * Enum INCR_TRANS for value: "INCR_TRANS"
         */
        public static final TaskTypeEnum INCR_TRANS = new TaskTypeEnum("INCR_TRANS");

        private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskTypeEnum> createStaticFields() {
            Map<String, TaskTypeEnum> map = new HashMap<>();
            map.put("FULL_INCR_TRANS", FULL_INCR_TRANS);
            map.put("FULL_TRANS", FULL_TRANS);
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
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    public ExportJobsReq withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * DRS任务的业务场景类型。用于筛选导出特定业务场景类型的任务列表。 取值： - migration 实时迁移 - sync 实时同步 - backupMigration 备份迁移 - subscription 订阅 - cloudDataGuard 实时灾备
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public ExportJobsReq withName(String name) {
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

    public ExportJobsReq withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。默认查询所有状态的任务 - 当job_type取值：migration,sync,cloudDataGuard     对应的任务状态取值如下：     CREATING：创建中。     CREATE_FAILED：创建失败。     CONFIGURATION：配置中。     STARTJOBING：启动中。     WAITING_FOR_START：等待启动中。     START_JOB_FAILED：任务启动失败。     FULL_TRANSFER_STARTED：全量迁移中，灾备场景为初始化。     FULL_TRANSFER_FAILED：全量迁移失败，灾备场景为初始化失败。     FULL_TRANSFER_COMPLETE：全量迁移完成，灾备场景为初始化完成。     INCRE_TRANSFER_STARTED：增量迁移中，灾备场景为灾备中。     INCRE_TRANSFER_FAILED：增量迁移失败，灾备场景为灾备异常。     RELEASE_RESOURCE_STARTED：结束任务中。     RELEASE_RESOURCE_FAILED：结束任务失败。     RELEASE_RESOURCE_COMPLETE：已结束。     CHANGE_JOB_STARTED：任务变更中。     CHANGE_JOB_FAILED：任务变更失败。     CHILD_TRANSFER_STARTING：子任务启动中。     CHILD_TRANSFER_STARTED：子任务迁移中。     CHILD_TRANSFER_COMPLETE：子任务迁移完成。     CHILD_TRANSFER_FAILED：子任务迁移失败。     RELEASE_CHILD_TRANSFER_STARTED：子任务结束中。     RELEASE_CHILD_TRANSFER_COMPLETE：子任务已结束。其中，异常状态可单独查询，也可以通过以下方式查询全部异常任务：CREATE_FAILED，START_JOB_FAILED，FULL_TRANSFER_FAILED，INCRE_TRANSFER_FAILED，RELEASE_RESOURCE_FAILED，CHANGE_JOB_FAILED，CHILD_TRANSFER_FAILED。 - 当job_type取值：backupMigration   对应的任务状态取值如下：     SUBSCRIPTION_STARTED：创建中。     CREATE_FAILED：创建失败。     SUBSCRIPTION_FAILED：订阅失败。     CONFIGURATION：配置中。     STARTJOBING：启动中。     REBUILD_NODE_STARTED：故障恢复。     REBUILD_NODE_FAILED：故障恢复失败。     START_JOB_FAILED：任务启动失败。 - 当job_type取值：subscription   对应的任务状态取值如下：     SUCCESS：成功。     TRANSFERRING：备份迁移中。     FAILED：失败。     PRECHECK FAILED：预检查失败。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ExportJobsReq withDbsInstanceIds(List<String> dbsInstanceIds) {
        this.dbsInstanceIds = dbsInstanceIds;
        return this;
    }

    public ExportJobsReq addDbsInstanceIdsItem(String dbsInstanceIdsItem) {
        if (this.dbsInstanceIds == null) {
            this.dbsInstanceIds = new ArrayList<>();
        }
        this.dbsInstanceIds.add(dbsInstanceIdsItem);
        return this;
    }

    public ExportJobsReq withDbsInstanceIds(Consumer<List<String>> dbsInstanceIdsSetter) {
        if (this.dbsInstanceIds == null) {
            this.dbsInstanceIds = new ArrayList<>();
        }
        dbsInstanceIdsSetter.accept(this.dbsInstanceIds);
        return this;
    }

    /**
     * 数据库实例ID，最大数量为10。
     * @return dbsInstanceIds
     */
    public List<String> getDbsInstanceIds() {
        return dbsInstanceIds;
    }

    public void setDbsInstanceIds(List<String> dbsInstanceIds) {
        this.dbsInstanceIds = dbsInstanceIds;
    }

    public ExportJobsReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ExportJobsReq withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 创建时间。 当job_type取值：migration,sync,cloudDataGuard， 任务创建时间，比如\"2026-05-25T13:41:00.127Z|2026-05-28T13:41:00.999Z\" 当job_type取值：backupMigration， 表示任务创建时间，比如\"2026-05-25T13:41:00.127Z|2026-05-28T13:41:00.999Z\" 当job_type取值：subscription，表示消费时间点，比如\"2026-05-25T13:25:46.383Z|2026-05-28T13:25:46.999Z\"
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ExportJobsReq withCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * 完成时间。在job_type是backupMigration时支持该参数填写， 表示任务完成时间，比如\"2026-05-25T13:41:00.127Z|2026-05-28T13:41:00.999Z\"
     * @return completedAt
     */
    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public ExportJobsReq withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ExportJobsReq withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型。当job_type取值：migration,sync,cloudDataGuard，该参数支持填写。当job_type取值：backupMigration 时，该参数默认值是sqlserver
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ExportJobsReq withNetType(NetTypeEnum netType) {
        this.netType = netType;
        return this;
    }

    /**
     * 网络类型。取值： eip：公网网络。 vpc：VPC网络。 vpn：VPN、专线网络。 当job_type取值：migration,sync,cloudDataGuard，该参数支持填写。
     * @return netType
     */
    public NetTypeEnum getNetType() {
        return netType;
    }

    public void setNetType(NetTypeEnum netType) {
        this.netType = netType;
    }

    public ExportJobsReq withBillingTag(BillingTagEnum billingTag) {
        this.billingTag = billingTag;
        return this;
    }

    /**
     * 计费标识。当job_type取值：migration,sync,cloudDataGuard,subscription，该参数支持填写。取值\"0\"表示计费中，\"1\"表示未计费
     * @return billingTag
     */
    public BillingTagEnum getBillingTag() {
        return billingTag;
    }

    public void setBillingTag(BillingTagEnum billingTag) {
        this.billingTag = billingTag;
    }

    public ExportJobsReq withBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    /**
     * 计费模式。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。取值：\"1\"表示包年包月，\"0\"表示按需计费
     * @return billingMode
     */
    public BillingModeEnum getBillingMode() {
        return billingMode;
    }

    public void setBillingMode(BillingModeEnum billingMode) {
        this.billingMode = billingMode;
    }

    public ExportJobsReq withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * 实例绑定的公网IP。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public ExportJobsReq withInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
        return this;
    }

    /**
     * DRS绑定的数据库实例IP。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。
     * @return instanceIp
     */
    public String getInstanceIp() {
        return instanceIp;
    }

    public void setInstanceIp(String instanceIp) {
        this.instanceIp = instanceIp;
    }

    public ExportJobsReq withInnerIp(String innerIp) {
        this.innerIp = innerIp;
        return this;
    }

    /**
     * DRS绑定的内网IP。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。
     * @return innerIp
     */
    public String getInnerIp() {
        return innerIp;
    }

    public void setInnerIp(String innerIp) {
        this.innerIp = innerIp;
    }

    public ExportJobsReq withSpecType(SpecTypeEnum specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 规格类型。当job_type取值：migration,sync,cloudDataGuard，支持该参数填写。 取值如下： 2xlarge：极大规格。 xlarge：超大规格。 high：大规格。 medium：中规格。 small：小规格。 micro：极小规格。
     * @return specType
     */
    public SpecTypeEnum getSpecType() {
        return specType;
    }

    public void setSpecType(SpecTypeEnum specType) {
        this.specType = specType;
    }

    public ExportJobsReq withDirection(DirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    /**
     * 数据流动方向。 当job_type取值migration,sync时支持传值。 取值： - up：入云 - down：出云 - non-dbs：自建 - multiWrite：双向同步。 当job_type取值cloudDataGuard时支持传值， 取值： - up：本云为备 - down：本云为主 - multiWrite：双主灾备
     * @return direction
     */
    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public ExportJobsReq withTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 同步类型。当job_type取值migration,sync时支持传值。
     * @return taskType
     */
    public TaskTypeEnum getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEnum taskType) {
        this.taskType = taskType;
    }

    public ExportJobsReq withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 返回结果按该关键字排序，默认为“create_time”。 当前支持排序的关键字： name status create_time net_type job_direction pay_mode
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ExportJobsReq withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 降序或升序（分别对应desc和asc，默认为“desc”）。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ExportJobsReq withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 标签
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportJobsReq that = (ExportJobsReq) obj;
        return Objects.equals(this.jobType, that.jobType) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.dbsInstanceIds, that.dbsInstanceIds)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.completedAt, that.completedAt)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.engineType, that.engineType) && Objects.equals(this.netType, that.netType)
            && Objects.equals(this.billingTag, that.billingTag) && Objects.equals(this.billingMode, that.billingMode)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.instanceIp, that.instanceIp)
            && Objects.equals(this.innerIp, that.innerIp) && Objects.equals(this.specType, that.specType)
            && Objects.equals(this.direction, that.direction) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobType,
            name,
            status,
            dbsInstanceIds,
            description,
            createAt,
            completedAt,
            enterpriseProjectId,
            engineType,
            netType,
            billingTag,
            billingMode,
            publicIp,
            instanceIp,
            innerIp,
            specType,
            direction,
            taskType,
            sortKey,
            sortDir,
            tag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportJobsReq {\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dbsInstanceIds: ").append(toIndentedString(dbsInstanceIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    netType: ").append(toIndentedString(netType)).append("\n");
        sb.append("    billingTag: ").append(toIndentedString(billingTag)).append("\n");
        sb.append("    billingMode: ").append(toIndentedString(billingMode)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    instanceIp: ").append(toIndentedString(instanceIp)).append("\n");
        sb.append("    innerIp: ").append(toIndentedString(innerIp)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

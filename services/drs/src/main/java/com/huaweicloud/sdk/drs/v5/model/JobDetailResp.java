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
 * 任务详情响应体。
 */
public class JobDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_job_id")

    private String masterJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private JobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private List<JobEndpointInfo> sourceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private List<JobEndpointInfo> targetEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private AlarmNotifyConfig alarmNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private List<SpeedLimitInfo> speedLimit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_migration")

    private UserMigrationInfo userMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_config")

    private PolicyConfig policyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_param")

    private DbParamInfo dbParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_params")

    private TuningParamInfo tuningParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_order")

    private PeriodOrderInfo periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private JobNodeInfo nodeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<TaskLogInfo> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_results")

    private List<QueryNetworkResult> networkResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_result")

    private QueryPreCheckResult precheckResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_info")

    private JobProgressInfo progressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_object_progress_info")

    private QueryMigrationObjectProgressInfo migrationObjectProgressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private QueryMetricResult metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private CompareResultInfo compareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_import_file_resp")

    private SupportImportFileResult supportImportFileResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_features")

    private Map<String, String> instanceFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_version")

    private String taskVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_management")

    private ConnectionManagement connectionManagement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_list")

    private List<PublicIpConfig> publicIpList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bind_public_ip_state")

    private String bindPublicIpState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children")

    private List<FailedToBindEipChildInfo> children = null;

    /**
     * 解除目标库只读操作后，目标库解除只读是否成功。 - pending：目标库解除操作进行中。 - success：目标库解除只读操作成功。
     */
    public static final class IsWritableEnum {

        /**
         * Enum PENDING for value: "pending"
         */
        public static final IsWritableEnum PENDING = new IsWritableEnum("pending");

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final IsWritableEnum SUCCESS = new IsWritableEnum("success");

        private static final Map<String, IsWritableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsWritableEnum> createStaticFields() {
            Map<String, IsWritableEnum> map = new HashMap<>();
            map.put("pending", PENDING);
            map.put("success", SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsWritableEnum(String value) {
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
        public static IsWritableEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsWritableEnum(value));
        }

        public static IsWritableEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsWritableEnum) {
                return this.value.equals(((IsWritableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_writable")

    private IsWritableEnum isWritable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnoses")

    private List<QueryDiagnosisResult> diagnoses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_progress_info")

    private JobDetailRespRepairProgressInfo repairProgressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_detail_info")

    private QueryRepairDetailResp repairDetailInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repair_export_status")

    private String repairExportStatus;

    public JobDetailResp withId(String id) {
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

    public JobDetailResp withStatus(StatusEnum status) {
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

    public JobDetailResp withCreateTime(String createTime) {
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

    public JobDetailResp withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public JobDetailResp withMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
        return this;
    }

    /**
     * 多任务主节点的任务ID。
     * @return masterJobId
     */
    public String getMasterJobId() {
        return masterJobId;
    }

    public void setMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
    }

    public JobDetailResp withBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public JobDetailResp withBaseInfo(Consumer<JobBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new JobBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public JobBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public JobDetailResp withSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public JobDetailResp addSourceEndpointItem(JobEndpointInfo sourceEndpointItem) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        this.sourceEndpoint.add(sourceEndpointItem);
        return this;
    }

    public JobDetailResp withSourceEndpoint(Consumer<List<JobEndpointInfo>> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        sourceEndpointSetter.accept(this.sourceEndpoint);
        return this;
    }

    /**
     * 任务源数据库信息体。
     * @return sourceEndpoint
     */
    public List<JobEndpointInfo> getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public JobDetailResp withTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public JobDetailResp addTargetEndpointItem(JobEndpointInfo targetEndpointItem) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        this.targetEndpoint.add(targetEndpointItem);
        return this;
    }

    public JobDetailResp withTargetEndpoint(Consumer<List<JobEndpointInfo>> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        targetEndpointSetter.accept(this.targetEndpoint);
        return this;
    }

    /**
     * 任务目标数据库信息体。
     * @return targetEndpoint
     */
    public List<JobEndpointInfo> getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public JobDetailResp withAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    public JobDetailResp withAlarmNotify(Consumer<AlarmNotifyConfig> alarmNotifySetter) {
        if (this.alarmNotify == null) {
            this.alarmNotify = new AlarmNotifyConfig();
            alarmNotifySetter.accept(this.alarmNotify);
        }

        return this;
    }

    /**
     * Get alarmNotify
     * @return alarmNotify
     */
    public AlarmNotifyConfig getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public JobDetailResp withSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public JobDetailResp addSpeedLimitItem(SpeedLimitInfo speedLimitItem) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        this.speedLimit.add(speedLimitItem);
        return this;
    }

    public JobDetailResp withSpeedLimit(Consumer<List<SpeedLimitInfo>> speedLimitSetter) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        speedLimitSetter.accept(this.speedLimit);
        return this;
    }

    /**
     * 限速信息体。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。  - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     * @return speedLimit
     */
    public List<SpeedLimitInfo> getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
    }

    public JobDetailResp withUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
        return this;
    }

    public JobDetailResp withUserMigration(Consumer<UserMigrationInfo> userMigrationSetter) {
        if (this.userMigration == null) {
            this.userMigration = new UserMigrationInfo();
            userMigrationSetter.accept(this.userMigration);
        }

        return this;
    }

    /**
     * Get userMigration
     * @return userMigration
     */
    public UserMigrationInfo getUserMigration() {
        return userMigration;
    }

    public void setUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
    }

    public JobDetailResp withPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
        return this;
    }

    public JobDetailResp withPolicyConfig(Consumer<PolicyConfig> policyConfigSetter) {
        if (this.policyConfig == null) {
            this.policyConfig = new PolicyConfig();
            policyConfigSetter.accept(this.policyConfig);
        }

        return this;
    }

    /**
     * Get policyConfig
     * @return policyConfig
     */
    public PolicyConfig getPolicyConfig() {
        return policyConfig;
    }

    public void setPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
    }

    public JobDetailResp withDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
        return this;
    }

    public JobDetailResp withDbParam(Consumer<DbParamInfo> dbParamSetter) {
        if (this.dbParam == null) {
            this.dbParam = new DbParamInfo();
            dbParamSetter.accept(this.dbParam);
        }

        return this;
    }

    /**
     * Get dbParam
     * @return dbParam
     */
    public DbParamInfo getDbParam() {
        return dbParam;
    }

    public void setDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
    }

    public JobDetailResp withTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
        return this;
    }

    public JobDetailResp withTuningParams(Consumer<TuningParamInfo> tuningParamsSetter) {
        if (this.tuningParams == null) {
            this.tuningParams = new TuningParamInfo();
            tuningParamsSetter.accept(this.tuningParams);
        }

        return this;
    }

    /**
     * Get tuningParams
     * @return tuningParams
     */
    public TuningParamInfo getTuningParams() {
        return tuningParams;
    }

    public void setTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
    }

    public JobDetailResp withPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public JobDetailResp withPeriodOrder(Consumer<PeriodOrderInfo> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderInfo();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderInfo getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
    }

    public JobDetailResp withNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public JobDetailResp withNodeInfo(Consumer<JobNodeInfo> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new JobNodeInfo();
            nodeInfoSetter.accept(this.nodeInfo);
        }

        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public JobNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public JobDetailResp withLogs(List<TaskLogInfo> logs) {
        this.logs = logs;
        return this;
    }

    public JobDetailResp addLogsItem(TaskLogInfo logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public JobDetailResp withLogs(Consumer<List<TaskLogInfo>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 日志查询结果信息体。
     * @return logs
     */
    public List<TaskLogInfo> getLogs() {
        return logs;
    }

    public void setLogs(List<TaskLogInfo> logs) {
        this.logs = logs;
    }

    public JobDetailResp withNetworkResults(List<QueryNetworkResult> networkResults) {
        this.networkResults = networkResults;
        return this;
    }

    public JobDetailResp addNetworkResultsItem(QueryNetworkResult networkResultsItem) {
        if (this.networkResults == null) {
            this.networkResults = new ArrayList<>();
        }
        this.networkResults.add(networkResultsItem);
        return this;
    }

    public JobDetailResp withNetworkResults(Consumer<List<QueryNetworkResult>> networkResultsSetter) {
        if (this.networkResults == null) {
            this.networkResults = new ArrayList<>();
        }
        networkResultsSetter.accept(this.networkResults);
        return this;
    }

    /**
     * 网络打通测试结果信息体。
     * @return networkResults
     */
    public List<QueryNetworkResult> getNetworkResults() {
        return networkResults;
    }

    public void setNetworkResults(List<QueryNetworkResult> networkResults) {
        this.networkResults = networkResults;
    }

    public JobDetailResp withPrecheckResult(QueryPreCheckResult precheckResult) {
        this.precheckResult = precheckResult;
        return this;
    }

    public JobDetailResp withPrecheckResult(Consumer<QueryPreCheckResult> precheckResultSetter) {
        if (this.precheckResult == null) {
            this.precheckResult = new QueryPreCheckResult();
            precheckResultSetter.accept(this.precheckResult);
        }

        return this;
    }

    /**
     * Get precheckResult
     * @return precheckResult
     */
    public QueryPreCheckResult getPrecheckResult() {
        return precheckResult;
    }

    public void setPrecheckResult(QueryPreCheckResult precheckResult) {
        this.precheckResult = precheckResult;
    }

    public JobDetailResp withProgressInfo(JobProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public JobDetailResp withProgressInfo(Consumer<JobProgressInfo> progressInfoSetter) {
        if (this.progressInfo == null) {
            this.progressInfo = new JobProgressInfo();
            progressInfoSetter.accept(this.progressInfo);
        }

        return this;
    }

    /**
     * Get progressInfo
     * @return progressInfo
     */
    public JobProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(JobProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
    }

    public JobDetailResp withMigrationObjectProgressInfo(QueryMigrationObjectProgressInfo migrationObjectProgressInfo) {
        this.migrationObjectProgressInfo = migrationObjectProgressInfo;
        return this;
    }

    public JobDetailResp withMigrationObjectProgressInfo(
        Consumer<QueryMigrationObjectProgressInfo> migrationObjectProgressInfoSetter) {
        if (this.migrationObjectProgressInfo == null) {
            this.migrationObjectProgressInfo = new QueryMigrationObjectProgressInfo();
            migrationObjectProgressInfoSetter.accept(this.migrationObjectProgressInfo);
        }

        return this;
    }

    /**
     * Get migrationObjectProgressInfo
     * @return migrationObjectProgressInfo
     */
    public QueryMigrationObjectProgressInfo getMigrationObjectProgressInfo() {
        return migrationObjectProgressInfo;
    }

    public void setMigrationObjectProgressInfo(QueryMigrationObjectProgressInfo migrationObjectProgressInfo) {
        this.migrationObjectProgressInfo = migrationObjectProgressInfo;
    }

    public JobDetailResp withMetrics(QueryMetricResult metrics) {
        this.metrics = metrics;
        return this;
    }

    public JobDetailResp withMetrics(Consumer<QueryMetricResult> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new QueryMetricResult();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public QueryMetricResult getMetrics() {
        return metrics;
    }

    public void setMetrics(QueryMetricResult metrics) {
        this.metrics = metrics;
    }

    public JobDetailResp withCompareResult(CompareResultInfo compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    public JobDetailResp withCompareResult(Consumer<CompareResultInfo> compareResultSetter) {
        if (this.compareResult == null) {
            this.compareResult = new CompareResultInfo();
            compareResultSetter.accept(this.compareResult);
        }

        return this;
    }

    /**
     * Get compareResult
     * @return compareResult
     */
    public CompareResultInfo getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(CompareResultInfo compareResult) {
        this.compareResult = compareResult;
    }

    public JobDetailResp withSupportImportFileResp(SupportImportFileResult supportImportFileResp) {
        this.supportImportFileResp = supportImportFileResp;
        return this;
    }

    public JobDetailResp withSupportImportFileResp(Consumer<SupportImportFileResult> supportImportFileRespSetter) {
        if (this.supportImportFileResp == null) {
            this.supportImportFileResp = new SupportImportFileResult();
            supportImportFileRespSetter.accept(this.supportImportFileResp);
        }

        return this;
    }

    /**
     * Get supportImportFileResp
     * @return supportImportFileResp
     */
    public SupportImportFileResult getSupportImportFileResp() {
        return supportImportFileResp;
    }

    public void setSupportImportFileResp(SupportImportFileResult supportImportFileResp) {
        this.supportImportFileResp = supportImportFileResp;
    }

    public JobDetailResp withInstanceFeatures(Map<String, String> instanceFeatures) {
        this.instanceFeatures = instanceFeatures;
        return this;
    }

    public JobDetailResp putInstanceFeaturesItem(String key, String instanceFeaturesItem) {
        if (this.instanceFeatures == null) {
            this.instanceFeatures = new HashMap<>();
        }
        this.instanceFeatures.put(key, instanceFeaturesItem);
        return this;
    }

    public JobDetailResp withInstanceFeatures(Consumer<Map<String, String>> instanceFeaturesSetter) {
        if (this.instanceFeatures == null) {
            this.instanceFeatures = new HashMap<>();
        }
        instanceFeaturesSetter.accept(this.instanceFeatures);
        return this;
    }

    /**
     * 由开关和版本共同控制的任务级别的功能列表。
     * @return instanceFeatures
     */
    public Map<String, String> getInstanceFeatures() {
        return instanceFeatures;
    }

    public void setInstanceFeatures(Map<String, String> instanceFeatures) {
        this.instanceFeatures = instanceFeatures;
    }

    public JobDetailResp withTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }

    /**
     * 任务版本。
     * @return taskVersion
     */
    public String getTaskVersion() {
        return taskVersion;
    }

    public void setTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
    }

    public JobDetailResp withConnectionManagement(ConnectionManagement connectionManagement) {
        this.connectionManagement = connectionManagement;
        return this;
    }

    public JobDetailResp withConnectionManagement(Consumer<ConnectionManagement> connectionManagementSetter) {
        if (this.connectionManagement == null) {
            this.connectionManagement = new ConnectionManagement();
            connectionManagementSetter.accept(this.connectionManagement);
        }

        return this;
    }

    /**
     * Get connectionManagement
     * @return connectionManagement
     */
    public ConnectionManagement getConnectionManagement() {
        return connectionManagement;
    }

    public void setConnectionManagement(ConnectionManagement connectionManagement) {
        this.connectionManagement = connectionManagement;
    }

    public JobDetailResp withPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
        return this;
    }

    public JobDetailResp addPublicIpListItem(PublicIpConfig publicIpListItem) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        this.publicIpList.add(publicIpListItem);
        return this;
    }

    public JobDetailResp withPublicIpList(Consumer<List<PublicIpConfig>> publicIpListSetter) {
        if (this.publicIpList == null) {
            this.publicIpList = new ArrayList<>();
        }
        publicIpListSetter.accept(this.publicIpList);
        return this;
    }

    /**
     * 指定公网IP的信息
     * @return publicIpList
     */
    public List<PublicIpConfig> getPublicIpList() {
        return publicIpList;
    }

    public void setPublicIpList(List<PublicIpConfig> publicIpList) {
        this.publicIpList = publicIpList;
    }

    public JobDetailResp withBindPublicIpState(String bindPublicIpState) {
        this.bindPublicIpState = bindPublicIpState;
        return this;
    }

    /**
     * 是否成功绑定公网IP
     * @return bindPublicIpState
     */
    public String getBindPublicIpState() {
        return bindPublicIpState;
    }

    public void setBindPublicIpState(String bindPublicIpState) {
        this.bindPublicIpState = bindPublicIpState;
    }

    public JobDetailResp withChildren(List<FailedToBindEipChildInfo> children) {
        this.children = children;
        return this;
    }

    public JobDetailResp addChildrenItem(FailedToBindEipChildInfo childrenItem) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public JobDetailResp withChildren(Consumer<List<FailedToBindEipChildInfo>> childrenSetter) {
        if (this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 多任务时，存在子任务绑定失败时，返回子任务的信息
     * @return children
     */
    public List<FailedToBindEipChildInfo> getChildren() {
        return children;
    }

    public void setChildren(List<FailedToBindEipChildInfo> children) {
        this.children = children;
    }

    public JobDetailResp withIsWritable(IsWritableEnum isWritable) {
        this.isWritable = isWritable;
        return this;
    }

    /**
     * 解除目标库只读操作后，目标库解除只读是否成功。 - pending：目标库解除操作进行中。 - success：目标库解除只读操作成功。
     * @return isWritable
     */
    public IsWritableEnum getIsWritable() {
        return isWritable;
    }

    public void setIsWritable(IsWritableEnum isWritable) {
        this.isWritable = isWritable;
    }

    public JobDetailResp withDiagnoses(List<QueryDiagnosisResult> diagnoses) {
        this.diagnoses = diagnoses;
        return this;
    }

    public JobDetailResp addDiagnosesItem(QueryDiagnosisResult diagnosesItem) {
        if (this.diagnoses == null) {
            this.diagnoses = new ArrayList<>();
        }
        this.diagnoses.add(diagnosesItem);
        return this;
    }

    public JobDetailResp withDiagnoses(Consumer<List<QueryDiagnosisResult>> diagnosesSetter) {
        if (this.diagnoses == null) {
            this.diagnoses = new ArrayList<>();
        }
        diagnosesSetter.accept(this.diagnoses);
        return this;
    }

    /**
     * 一键诊断结果。
     * @return diagnoses
     */
    public List<QueryDiagnosisResult> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<QueryDiagnosisResult> diagnoses) {
        this.diagnoses = diagnoses;
    }

    public JobDetailResp withRepairProgressInfo(JobDetailRespRepairProgressInfo repairProgressInfo) {
        this.repairProgressInfo = repairProgressInfo;
        return this;
    }

    public JobDetailResp withRepairProgressInfo(Consumer<JobDetailRespRepairProgressInfo> repairProgressInfoSetter) {
        if (this.repairProgressInfo == null) {
            this.repairProgressInfo = new JobDetailRespRepairProgressInfo();
            repairProgressInfoSetter.accept(this.repairProgressInfo);
        }

        return this;
    }

    /**
     * Get repairProgressInfo
     * @return repairProgressInfo
     */
    public JobDetailRespRepairProgressInfo getRepairProgressInfo() {
        return repairProgressInfo;
    }

    public void setRepairProgressInfo(JobDetailRespRepairProgressInfo repairProgressInfo) {
        this.repairProgressInfo = repairProgressInfo;
    }

    public JobDetailResp withRepairDetailInfo(QueryRepairDetailResp repairDetailInfo) {
        this.repairDetailInfo = repairDetailInfo;
        return this;
    }

    public JobDetailResp withRepairDetailInfo(Consumer<QueryRepairDetailResp> repairDetailInfoSetter) {
        if (this.repairDetailInfo == null) {
            this.repairDetailInfo = new QueryRepairDetailResp();
            repairDetailInfoSetter.accept(this.repairDetailInfo);
        }

        return this;
    }

    /**
     * Get repairDetailInfo
     * @return repairDetailInfo
     */
    public QueryRepairDetailResp getRepairDetailInfo() {
        return repairDetailInfo;
    }

    public void setRepairDetailInfo(QueryRepairDetailResp repairDetailInfo) {
        this.repairDetailInfo = repairDetailInfo;
    }

    public JobDetailResp withRepairExportStatus(String repairExportStatus) {
        this.repairExportStatus = repairExportStatus;
        return this;
    }

    /**
     * 修复SQL导出状态。
     * @return repairExportStatus
     */
    public String getRepairExportStatus() {
        return repairExportStatus;
    }

    public void setRepairExportStatus(String repairExportStatus) {
        this.repairExportStatus = repairExportStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetailResp that = (JobDetailResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.masterJobId, that.masterJobId) && Objects.equals(this.baseInfo, that.baseInfo)
            && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint)
            && Objects.equals(this.alarmNotify, that.alarmNotify) && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.userMigration, that.userMigration)
            && Objects.equals(this.policyConfig, that.policyConfig) && Objects.equals(this.dbParam, that.dbParam)
            && Objects.equals(this.tuningParams, that.tuningParams)
            && Objects.equals(this.periodOrder, that.periodOrder) && Objects.equals(this.nodeInfo, that.nodeInfo)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.networkResults, that.networkResults)
            && Objects.equals(this.precheckResult, that.precheckResult)
            && Objects.equals(this.progressInfo, that.progressInfo)
            && Objects.equals(this.migrationObjectProgressInfo, that.migrationObjectProgressInfo)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.compareResult, that.compareResult)
            && Objects.equals(this.supportImportFileResp, that.supportImportFileResp)
            && Objects.equals(this.instanceFeatures, that.instanceFeatures)
            && Objects.equals(this.taskVersion, that.taskVersion)
            && Objects.equals(this.connectionManagement, that.connectionManagement)
            && Objects.equals(this.publicIpList, that.publicIpList)
            && Objects.equals(this.bindPublicIpState, that.bindPublicIpState)
            && Objects.equals(this.children, that.children) && Objects.equals(this.isWritable, that.isWritable)
            && Objects.equals(this.diagnoses, that.diagnoses)
            && Objects.equals(this.repairProgressInfo, that.repairProgressInfo)
            && Objects.equals(this.repairDetailInfo, that.repairDetailInfo)
            && Objects.equals(this.repairExportStatus, that.repairExportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            createTime,
            totalCount,
            masterJobId,
            baseInfo,
            sourceEndpoint,
            targetEndpoint,
            alarmNotify,
            speedLimit,
            userMigration,
            policyConfig,
            dbParam,
            tuningParams,
            periodOrder,
            nodeInfo,
            logs,
            networkResults,
            precheckResult,
            progressInfo,
            migrationObjectProgressInfo,
            metrics,
            compareResult,
            supportImportFileResp,
            instanceFeatures,
            taskVersion,
            connectionManagement,
            publicIpList,
            bindPublicIpState,
            children,
            isWritable,
            diagnoses,
            repairProgressInfo,
            repairDetailInfo,
            repairExportStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetailResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    masterJobId: ").append(toIndentedString(masterJobId)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    userMigration: ").append(toIndentedString(userMigration)).append("\n");
        sb.append("    policyConfig: ").append(toIndentedString(policyConfig)).append("\n");
        sb.append("    dbParam: ").append(toIndentedString(dbParam)).append("\n");
        sb.append("    tuningParams: ").append(toIndentedString(tuningParams)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    networkResults: ").append(toIndentedString(networkResults)).append("\n");
        sb.append("    precheckResult: ").append(toIndentedString(precheckResult)).append("\n");
        sb.append("    progressInfo: ").append(toIndentedString(progressInfo)).append("\n");
        sb.append("    migrationObjectProgressInfo: ")
            .append(toIndentedString(migrationObjectProgressInfo))
            .append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
        sb.append("    supportImportFileResp: ").append(toIndentedString(supportImportFileResp)).append("\n");
        sb.append("    instanceFeatures: ").append(toIndentedString(instanceFeatures)).append("\n");
        sb.append("    taskVersion: ").append(toIndentedString(taskVersion)).append("\n");
        sb.append("    connectionManagement: ").append(toIndentedString(connectionManagement)).append("\n");
        sb.append("    publicIpList: ").append(toIndentedString(publicIpList)).append("\n");
        sb.append("    bindPublicIpState: ").append(toIndentedString(bindPublicIpState)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    isWritable: ").append(toIndentedString(isWritable)).append("\n");
        sb.append("    diagnoses: ").append(toIndentedString(diagnoses)).append("\n");
        sb.append("    repairProgressInfo: ").append(toIndentedString(repairProgressInfo)).append("\n");
        sb.append("    repairDetailInfo: ").append(toIndentedString(repairDetailInfo)).append("\n");
        sb.append("    repairExportStatus: ").append(toIndentedString(repairExportStatus)).append("\n");
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

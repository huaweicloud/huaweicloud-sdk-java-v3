package com.huaweicloud.sdk.sms.v3.model;

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
public class ShowTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     */
    public static final class TypeEnum {

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * 进程优先级  0：低  1：标准（默认）  2：高
     */
    public static final class PriorityEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PriorityEnum NUMBER_0 = new PriorityEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PriorityEnum NUMBER_1 = new PriorityEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PriorityEnum NUMBER_2 = new PriorityEnum(2);

        private static final Map<Integer, PriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PriorityEnum> createStaticFields() {
            Map<Integer, PriorityEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PriorityEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PriorityEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PriorityEnum(value));
        }

        public static PriorityEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityEnum) {
                return this.value.equals(((PriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private PriorityEnum priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_ip")

    private String migrationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_template_id")

    private String vmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_server")

    private SourceServerResponse sourceServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    private TaskTargetServer targetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_complete_time")

    private Long estimateCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connected")

    private Boolean connected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private Long createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_date")

    private Long finishDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_rate")

    private Double compressRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_json")

    private String errorJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Long totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float_ip")

    private String floatIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_seconds")

    private Long remainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_snapshot_id")

    private String targetSnapshotId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_server")

    private CloneServer cloneServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tasks")

    private List<SubTask> subTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_check_info")

    private NetworkCheckInfoRequestBody networkCheckInfo;

    public ShowTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称（用户自定义）
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTaskResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ShowTaskResponse withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public ShowTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 迁移任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTaskResponse withPriority(PriorityEnum priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 进程优先级  0：低  1：标准（默认）  2：高
     * minimum: 0
     * maximum: 2
     * @return priority
     */
    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public ShowTaskResponse withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /**
     * 迁移限速
     * minimum: 0
     * maximum: 65535
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public ShowTaskResponse withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 目的端服务器的区域ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ShowTaskResponse withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    /**
     * 迁移完成后是否启动目的端服务器  true：启动  false：停止
     * @return startTargetServer
     */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public ShowTaskResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowTaskResponse withMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
        return this;
    }

    /**
     * 目的端服务器的IP地址。  公网迁移时请填写弹性IP地址  专线迁移时请填写私有IP地址
     * @return migrationIp
     */
    public String getMigrationIp() {
        return migrationIp;
    }

    public void setMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
    }

    public ShowTaskResponse withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * 目的端服务器的区域名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ShowTaskResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 目的端服务器所在项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowTaskResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 目的端服务器所在项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowTaskResponse withVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * 模板ID
     * @return vmTemplateId
     */
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    public ShowTaskResponse withSourceServer(SourceServerResponse sourceServer) {
        this.sourceServer = sourceServer;
        return this;
    }

    public ShowTaskResponse withSourceServer(Consumer<SourceServerResponse> sourceServerSetter) {
        if (this.sourceServer == null) {
            this.sourceServer = new SourceServerResponse();
            sourceServerSetter.accept(this.sourceServer);
        }

        return this;
    }

    /**
     * Get sourceServer
     * @return sourceServer
     */
    public SourceServerResponse getSourceServer() {
        return sourceServer;
    }

    public void setSourceServer(SourceServerResponse sourceServer) {
        this.sourceServer = sourceServer;
    }

    public ShowTaskResponse withTargetServer(TaskTargetServer targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public ShowTaskResponse withTargetServer(Consumer<TaskTargetServer> targetServerSetter) {
        if (this.targetServer == null) {
            this.targetServer = new TaskTargetServer();
            targetServerSetter.accept(this.targetServer);
        }

        return this;
    }

    /**
     * Get targetServer
     * @return targetServer
     */
    public TaskTargetServer getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(TaskTargetServer targetServer) {
        this.targetServer = targetServer;
    }

    public ShowTaskResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowTaskResponse withEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
        return this;
    }

    /**
     * 预估完成时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return estimateCompleteTime
     */
    public Long getEstimateCompleteTime() {
        return estimateCompleteTime;
    }

    public void setEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
    }

    public ShowTaskResponse withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /**
     * 连接状态
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public ShowTaskResponse withCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }

    /**
     * 任务创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createDate
     */
    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public ShowTaskResponse withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 任务开始时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public ShowTaskResponse withFinishDate(Long finishDate) {
        this.finishDate = finishDate;
        return this;
    }

    /**
     * 任务结束时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return finishDate
     */
    public Long getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Long finishDate) {
        this.finishDate = finishDate;
    }

    public ShowTaskResponse withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /**
     * 迁移速率，单位：MB/S
     * minimum: 0
     * maximum: 1E+4
     * @return migrateSpeed
     */
    public Double getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public ShowTaskResponse withCompressRate(Double compressRate) {
        this.compressRate = compressRate;
        return this;
    }

    /**
     * 压缩率
     * minimum: 0
     * maximum: 1E+4
     * @return compressRate
     */
    public Double getCompressRate() {
        return compressRate;
    }

    public void setCompressRate(Double compressRate) {
        this.compressRate = compressRate;
    }

    public ShowTaskResponse withErrorJson(String errorJson) {
        this.errorJson = errorJson;
        return this;
    }

    /**
     * 错误信息
     * @return errorJson
     */
    public String getErrorJson() {
        return errorJson;
    }

    public void setErrorJson(String errorJson) {
        this.errorJson = errorJson;
    }

    public ShowTaskResponse withTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * 任务总耗时
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

    public ShowTaskResponse withFloatIp(String floatIp) {
        this.floatIp = floatIp;
        return this;
    }

    /**
     * 暂时保留float,兼容现网老版本的SMS-Agent
     * @return floatIp
     */
    public String getFloatIp() {
        return floatIp;
    }

    public void setFloatIp(String floatIp) {
        this.floatIp = floatIp;
    }

    public ShowTaskResponse withRemainSeconds(Long remainSeconds) {
        this.remainSeconds = remainSeconds;
        return this;
    }

    /**
     * 迁移剩余时间（秒）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return remainSeconds
     */
    public Long getRemainSeconds() {
        return remainSeconds;
    }

    public void setRemainSeconds(Long remainSeconds) {
        this.remainSeconds = remainSeconds;
    }

    public ShowTaskResponse withTargetSnapshotId(String targetSnapshotId) {
        this.targetSnapshotId = targetSnapshotId;
        return this;
    }

    /**
     * 目的端的快照ID
     * @return targetSnapshotId
     */
    public String getTargetSnapshotId() {
        return targetSnapshotId;
    }

    public void setTargetSnapshotId(String targetSnapshotId) {
        this.targetSnapshotId = targetSnapshotId;
    }

    public ShowTaskResponse withCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
        return this;
    }

    public ShowTaskResponse withCloneServer(Consumer<CloneServer> cloneServerSetter) {
        if (this.cloneServer == null) {
            this.cloneServer = new CloneServer();
            cloneServerSetter.accept(this.cloneServer);
        }

        return this;
    }

    /**
     * Get cloneServer
     * @return cloneServer
     */
    public CloneServer getCloneServer() {
        return cloneServer;
    }

    public void setCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
    }

    public ShowTaskResponse withSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
        return this;
    }

    public ShowTaskResponse addSubTasksItem(SubTask subTasksItem) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public ShowTaskResponse withSubTasks(Consumer<List<SubTask>> subTasksSetter) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        subTasksSetter.accept(this.subTasks);
        return this;
    }

    /**
     * 任务包含的子任务列表
     * @return subTasks
     */
    public List<SubTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTask> subTasks) {
        this.subTasks = subTasks;
    }

    public ShowTaskResponse withNetworkCheckInfo(NetworkCheckInfoRequestBody networkCheckInfo) {
        this.networkCheckInfo = networkCheckInfo;
        return this;
    }

    public ShowTaskResponse withNetworkCheckInfo(Consumer<NetworkCheckInfoRequestBody> networkCheckInfoSetter) {
        if (this.networkCheckInfo == null) {
            this.networkCheckInfo = new NetworkCheckInfoRequestBody();
            networkCheckInfoSetter.accept(this.networkCheckInfo);
        }

        return this;
    }

    /**
     * Get networkCheckInfo
     * @return networkCheckInfo
     */
    public NetworkCheckInfoRequestBody getNetworkCheckInfo() {
        return networkCheckInfo;
    }

    public void setNetworkCheckInfo(NetworkCheckInfoRequestBody networkCheckInfo) {
        this.networkCheckInfo = networkCheckInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskResponse that = (ShowTaskResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.startTargetServer, that.startTargetServer)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.migrationIp, that.migrationIp) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.vmTemplateId, that.vmTemplateId)
            && Objects.equals(this.sourceServer, that.sourceServer)
            && Objects.equals(this.targetServer, that.targetServer) && Objects.equals(this.state, that.state)
            && Objects.equals(this.estimateCompleteTime, that.estimateCompleteTime)
            && Objects.equals(this.connected, that.connected) && Objects.equals(this.createDate, that.createDate)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.finishDate, that.finishDate)
            && Objects.equals(this.migrateSpeed, that.migrateSpeed)
            && Objects.equals(this.compressRate, that.compressRate) && Objects.equals(this.errorJson, that.errorJson)
            && Objects.equals(this.totalTime, that.totalTime) && Objects.equals(this.floatIp, that.floatIp)
            && Objects.equals(this.remainSeconds, that.remainSeconds)
            && Objects.equals(this.targetSnapshotId, that.targetSnapshotId)
            && Objects.equals(this.cloneServer, that.cloneServer) && Objects.equals(this.subTasks, that.subTasks)
            && Objects.equals(this.networkCheckInfo, that.networkCheckInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            osType,
            id,
            priority,
            speedLimit,
            regionId,
            startTargetServer,
            enterpriseProjectId,
            migrationIp,
            regionName,
            projectName,
            projectId,
            vmTemplateId,
            sourceServer,
            targetServer,
            state,
            estimateCompleteTime,
            connected,
            createDate,
            startDate,
            finishDate,
            migrateSpeed,
            compressRate,
            errorJson,
            totalTime,
            floatIp,
            remainSeconds,
            targetSnapshotId,
            cloneServer,
            subTasks,
            networkCheckInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    migrationIp: ").append(toIndentedString(migrationIp)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
        sb.append("    sourceServer: ").append(toIndentedString(sourceServer)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    estimateCompleteTime: ").append(toIndentedString(estimateCompleteTime)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    finishDate: ").append(toIndentedString(finishDate)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    compressRate: ").append(toIndentedString(compressRate)).append("\n");
        sb.append("    errorJson: ").append(toIndentedString(errorJson)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    floatIp: ").append(toIndentedString(floatIp)).append("\n");
        sb.append("    remainSeconds: ").append(toIndentedString(remainSeconds)).append("\n");
        sb.append("    targetSnapshotId: ").append(toIndentedString(targetSnapshotId)).append("\n");
        sb.append("    cloneServer: ").append(toIndentedString(cloneServer)).append("\n");
        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
        sb.append("    networkCheckInfo: ").append(toIndentedString(networkCheckInfo)).append("\n");
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

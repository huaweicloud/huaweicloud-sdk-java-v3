package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.CloneServer;
import com.huaweicloud.sdk.sms.v3.model.SourceServer;
import com.huaweicloud.sdk.sms.v3.model.SubTask;
import com.huaweicloud.sdk.sms.v3.model.TaskTargetServer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 任务类型，创建时必选，更新时可选
     */
    public static final class TypeEnum {

        
        /**
         * Enum MIGRATE_FILE_ for value: "MIGRATE_FILE：文件级"
         */
        public static final TypeEnum MIGRATE_FILE_ = new TypeEnum("MIGRATE_FILE：文件级");
        
        /**
         * Enum MIGRATE_BLOCK_ for value: "MIGRATE_BLOCK：块级"
         */
        public static final TypeEnum MIGRATE_BLOCK_ = new TypeEnum("MIGRATE_BLOCK：块级");
        

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE：文件级", MIGRATE_FILE_);
            map.put("MIGRATE_BLOCK：块级", MIGRATE_BLOCK_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof TypeEnum) {
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
    @JsonProperty(value="type")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsTypeEnum) {
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
    @JsonProperty(value="os_type")
    
    private OsTypeEnum osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="priority")
    
    private Integer priority;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_target_server")
    
    private Boolean startTargetServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migration_ip")
    
    private String migrationIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vm_template_id")
    
    private String vmTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_server")
    
    private SourceServer sourceServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_server")
    
    private TaskTargetServer targetServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="estimate_complete_time")
    
    private Long estimateCompleteTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connected")
    
    private Boolean connected;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_date")
    
    private Long createDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_date")
    
    private Long startDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="finish_date")
    
    private Long finishDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrate_speed")
    
    private Double migrateSpeed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="compress_rate")
    
    private Double compressRate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_json")
    
    private String errorJson;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_time")
    
    private Long totalTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="float_ip")
    
    private String floatIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remain_seconds")
    
    private Long remainSeconds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_snapshot_id")
    
    private String targetSnapshotId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clone_server")
    
    private CloneServer cloneServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_tasks")
    
    private List<SubTask> subTasks = null;
    
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
     * 任务类型，创建时必选，更新时可选
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
     * 迁移任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowTaskResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    


    /**
     * 进程优先级  0：低  1：标准（默认）  2：高
     * minimum: 0
     * maximum: 2
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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
     * 企业项目id
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

    

    public ShowTaskResponse withSourceServer(SourceServer sourceServer) {
        this.sourceServer = sourceServer;
        return this;
    }

    public ShowTaskResponse withSourceServer(Consumer<SourceServer> sourceServerSetter) {
        if(this.sourceServer == null ){
            this.sourceServer = new SourceServer();
            sourceServerSetter.accept(this.sourceServer);
        }
        
        return this;
    }


    /**
     * Get sourceServer
     * @return sourceServer
     */
    public SourceServer getSourceServer() {
        return sourceServer;
    }

    public void setSourceServer(SourceServer sourceServer) {
        this.sourceServer = sourceServer;
    }

    

    public ShowTaskResponse withTargetServer(TaskTargetServer targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public ShowTaskResponse withTargetServer(Consumer<TaskTargetServer> targetServerSetter) {
        if(this.targetServer == null ){
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
     * 目的端的快照id
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
        if(this.cloneServer == null ){
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
        if(this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public ShowTaskResponse withSubTasks(Consumer<List<SubTask>> subTasksSetter) {
        if(this.subTasks == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskResponse showTaskResponse = (ShowTaskResponse) o;
        return Objects.equals(this.name, showTaskResponse.name) &&
            Objects.equals(this.type, showTaskResponse.type) &&
            Objects.equals(this.osType, showTaskResponse.osType) &&
            Objects.equals(this.id, showTaskResponse.id) &&
            Objects.equals(this.priority, showTaskResponse.priority) &&
            Objects.equals(this.regionId, showTaskResponse.regionId) &&
            Objects.equals(this.startTargetServer, showTaskResponse.startTargetServer) &&
            Objects.equals(this.enterpriseProjectId, showTaskResponse.enterpriseProjectId) &&
            Objects.equals(this.migrationIp, showTaskResponse.migrationIp) &&
            Objects.equals(this.regionName, showTaskResponse.regionName) &&
            Objects.equals(this.projectName, showTaskResponse.projectName) &&
            Objects.equals(this.projectId, showTaskResponse.projectId) &&
            Objects.equals(this.vmTemplateId, showTaskResponse.vmTemplateId) &&
            Objects.equals(this.sourceServer, showTaskResponse.sourceServer) &&
            Objects.equals(this.targetServer, showTaskResponse.targetServer) &&
            Objects.equals(this.state, showTaskResponse.state) &&
            Objects.equals(this.estimateCompleteTime, showTaskResponse.estimateCompleteTime) &&
            Objects.equals(this.connected, showTaskResponse.connected) &&
            Objects.equals(this.createDate, showTaskResponse.createDate) &&
            Objects.equals(this.startDate, showTaskResponse.startDate) &&
            Objects.equals(this.finishDate, showTaskResponse.finishDate) &&
            Objects.equals(this.migrateSpeed, showTaskResponse.migrateSpeed) &&
            Objects.equals(this.compressRate, showTaskResponse.compressRate) &&
            Objects.equals(this.errorJson, showTaskResponse.errorJson) &&
            Objects.equals(this.totalTime, showTaskResponse.totalTime) &&
            Objects.equals(this.floatIp, showTaskResponse.floatIp) &&
            Objects.equals(this.remainSeconds, showTaskResponse.remainSeconds) &&
            Objects.equals(this.targetSnapshotId, showTaskResponse.targetSnapshotId) &&
            Objects.equals(this.cloneServer, showTaskResponse.cloneServer) &&
            Objects.equals(this.subTasks, showTaskResponse.subTasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, osType, id, priority, regionId, startTargetServer, enterpriseProjectId, migrationIp, regionName, projectName, projectId, vmTemplateId, sourceServer, targetServer, state, estimateCompleteTime, connected, createDate, startDate, finishDate, migrateSpeed, compressRate, errorJson, totalTime, floatIp, remainSeconds, targetSnapshotId, cloneServer, subTasks);
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


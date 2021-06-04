package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.CloneServer;
import com.huaweicloud.sdk.sms.v3.model.TargetServerById;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源端列表中关联的任务
 */
public class TaskByServerSource  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_date")
    
    private Long startDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="speed_limit")
    
    private Integer speedLimit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="migrate_speed")
    
    private Double migrateSpeed;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_target_server")
    
    private Boolean startTargetServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vm_template_id")
    
    private String vmTemplateId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_id")
    
    private String regionId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_name")
    
    private String projectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_server")
    
    private TargetServerById targetServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_collect_status")
    
    private String logCollectStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="exist_server")
    
    private Boolean existServer;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_public_ip")
    
    private Boolean usePublicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="clone_server")
    
    private CloneServer cloneServer;

    public TaskByServerSource withId(String id) {
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

    

    public TaskByServerSource withName(String name) {
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

    

    public TaskByServerSource withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 任务类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public TaskByServerSource withState(String state) {
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

    

    public TaskByServerSource withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    


    /**
     * 开始时间
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

    

    public TaskByServerSource withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    


    /**
     * 限速
     * minimum: 0
     * maximum: 10000
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    

    public TaskByServerSource withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    


    /**
     * 迁移速率
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

    

    public TaskByServerSource withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    


    /**
     * 是否启动虚拟机
     * @return startTargetServer
     */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    

    public TaskByServerSource withVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
        return this;
    }

    


    /**
     * 虚拟机模板id
     * @return vmTemplateId
     */
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    

    public TaskByServerSource withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    


    /**
     * region_id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    

    public TaskByServerSource withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    


    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    

    public TaskByServerSource withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public TaskByServerSource withTargetServer(TargetServerById targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public TaskByServerSource withTargetServer(Consumer<TargetServerById> targetServerSetter) {
        if(this.targetServer == null ){
            this.targetServer = new TargetServerById();
            targetServerSetter.accept(this.targetServer);
        }
        
        return this;
    }


    /**
     * Get targetServer
     * @return targetServer
     */
    public TargetServerById getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(TargetServerById targetServer) {
        this.targetServer = targetServer;
    }

    

    public TaskByServerSource withLogCollectStatus(String logCollectStatus) {
        this.logCollectStatus = logCollectStatus;
        return this;
    }

    


    /**
     * 日志收集状态
     * @return logCollectStatus
     */
    public String getLogCollectStatus() {
        return logCollectStatus;
    }

    public void setLogCollectStatus(String logCollectStatus) {
        this.logCollectStatus = logCollectStatus;
    }

    

    public TaskByServerSource withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    


    /**
     * 是否使用已有虚拟机
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    

    public TaskByServerSource withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    


    /**
     * 是否使用公网ip
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    

    public TaskByServerSource withCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
        return this;
    }

    public TaskByServerSource withCloneServer(Consumer<CloneServer> cloneServerSetter) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskByServerSource taskByServerSource = (TaskByServerSource) o;
        return Objects.equals(this.id, taskByServerSource.id) &&
            Objects.equals(this.name, taskByServerSource.name) &&
            Objects.equals(this.type, taskByServerSource.type) &&
            Objects.equals(this.state, taskByServerSource.state) &&
            Objects.equals(this.startDate, taskByServerSource.startDate) &&
            Objects.equals(this.speedLimit, taskByServerSource.speedLimit) &&
            Objects.equals(this.migrateSpeed, taskByServerSource.migrateSpeed) &&
            Objects.equals(this.startTargetServer, taskByServerSource.startTargetServer) &&
            Objects.equals(this.vmTemplateId, taskByServerSource.vmTemplateId) &&
            Objects.equals(this.regionId, taskByServerSource.regionId) &&
            Objects.equals(this.projectName, taskByServerSource.projectName) &&
            Objects.equals(this.projectId, taskByServerSource.projectId) &&
            Objects.equals(this.targetServer, taskByServerSource.targetServer) &&
            Objects.equals(this.logCollectStatus, taskByServerSource.logCollectStatus) &&
            Objects.equals(this.existServer, taskByServerSource.existServer) &&
            Objects.equals(this.usePublicIp, taskByServerSource.usePublicIp) &&
            Objects.equals(this.cloneServer, taskByServerSource.cloneServer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, state, startDate, speedLimit, migrateSpeed, startTargetServer, vmTemplateId, regionId, projectName, projectId, targetServer, logCollectStatus, existServer, usePublicIp, cloneServer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskByServerSource {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    logCollectStatus: ").append(toIndentedString(logCollectStatus)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    cloneServer: ").append(toIndentedString(cloneServer)).append("\n");
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


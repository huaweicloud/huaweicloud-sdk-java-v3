package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 源端列表中关联的任务
 */
public class TaskByServerSources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_complete_time")

    private Long estimateCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_rate")

    private Double compressRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_template_id")

    private String vmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    private TargetServerById targetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_collect_status")

    private String logCollectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_server")

    private CloneServer cloneServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_seconds")

    private Long remainSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_bucket")

    private String logBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_upload_time")

    private Long logUploadTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_share_url")

    private String logShareUrl;

    public TaskByServerSources withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskByServerSources withName(String name) {
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

    public TaskByServerSources withType(String type) {
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

    public TaskByServerSources withState(String state) {
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

    public TaskByServerSources withEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
        return this;
    }

    /**
     * 预估结束时间
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

    public TaskByServerSources withStartDate(Long startDate) {
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

    public TaskByServerSources withSpeedLimit(Integer speedLimit) {
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

    public TaskByServerSources withMigrateSpeed(Double migrateSpeed) {
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

    public TaskByServerSources withCompressRate(Double compressRate) {
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

    public TaskByServerSources withStartTargetServer(Boolean startTargetServer) {
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

    public TaskByServerSources withVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * 虚拟机模板ID
     * @return vmTemplateId
     */
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    public TaskByServerSources withRegionId(String regionId) {
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

    public TaskByServerSources withProjectName(String projectName) {
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

    public TaskByServerSources withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskByServerSources withTargetServer(TargetServerById targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public TaskByServerSources withTargetServer(Consumer<TargetServerById> targetServerSetter) {
        if (this.targetServer == null) {
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

    public TaskByServerSources withLogCollectStatus(String logCollectStatus) {
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

    public TaskByServerSources withExistServer(Boolean existServer) {
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

    public TaskByServerSources withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    /**
     * 是否使用公网IP
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public TaskByServerSources withCloneServer(CloneServer cloneServer) {
        this.cloneServer = cloneServer;
        return this;
    }

    public TaskByServerSources withCloneServer(Consumer<CloneServer> cloneServerSetter) {
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

    public TaskByServerSources withRemainSeconds(Long remainSeconds) {
        this.remainSeconds = remainSeconds;
        return this;
    }

    /**
     * 已迁移时长
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

    public TaskByServerSources withLogBucket(String logBucket) {
        this.logBucket = logBucket;
        return this;
    }

    /**
     * 上传日志指定桶名称
     * @return logBucket
     */
    public String getLogBucket() {
        return logBucket;
    }

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    public TaskByServerSources withLogUploadTime(Long logUploadTime) {
        this.logUploadTime = logUploadTime;
        return this;
    }

    /**
     * 日志上传时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return logUploadTime
     */
    public Long getLogUploadTime() {
        return logUploadTime;
    }

    public void setLogUploadTime(Long logUploadTime) {
        this.logUploadTime = logUploadTime;
    }

    public TaskByServerSources withLogShareUrl(String logShareUrl) {
        this.logShareUrl = logShareUrl;
        return this;
    }

    /**
     * 分享链接url
     * @return logShareUrl
     */
    public String getLogShareUrl() {
        return logShareUrl;
    }

    public void setLogShareUrl(String logShareUrl) {
        this.logShareUrl = logShareUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskByServerSources that = (TaskByServerSources) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.state, that.state)
            && Objects.equals(this.estimateCompleteTime, that.estimateCompleteTime)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.migrateSpeed, that.migrateSpeed)
            && Objects.equals(this.compressRate, that.compressRate)
            && Objects.equals(this.startTargetServer, that.startTargetServer)
            && Objects.equals(this.vmTemplateId, that.vmTemplateId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.targetServer, that.targetServer)
            && Objects.equals(this.logCollectStatus, that.logCollectStatus)
            && Objects.equals(this.existServer, that.existServer) && Objects.equals(this.usePublicIp, that.usePublicIp)
            && Objects.equals(this.cloneServer, that.cloneServer)
            && Objects.equals(this.remainSeconds, that.remainSeconds) && Objects.equals(this.logBucket, that.logBucket)
            && Objects.equals(this.logUploadTime, that.logUploadTime)
            && Objects.equals(this.logShareUrl, that.logShareUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            state,
            estimateCompleteTime,
            startDate,
            speedLimit,
            migrateSpeed,
            compressRate,
            startTargetServer,
            vmTemplateId,
            regionId,
            projectName,
            projectId,
            targetServer,
            logCollectStatus,
            existServer,
            usePublicIp,
            cloneServer,
            remainSeconds,
            logBucket,
            logUploadTime,
            logShareUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskByServerSources {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    estimateCompleteTime: ").append(toIndentedString(estimateCompleteTime)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    compressRate: ").append(toIndentedString(compressRate)).append("\n");
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
        sb.append("    remainSeconds: ").append(toIndentedString(remainSeconds)).append("\n");
        sb.append("    logBucket: ").append(toIndentedString(logBucket)).append("\n");
        sb.append("    logUploadTime: ").append(toIndentedString(logUploadTime)).append("\n");
        sb.append("    logShareUrl: ").append(toIndentedString(logShareUrl)).append("\n");
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

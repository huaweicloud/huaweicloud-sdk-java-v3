package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ScheduleTask
 */
public class ScheduleTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_id")
    
    
    private String jobId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_name")
    
    
    private String instanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_status")
    
    
    private String instanceStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_id")
    
    
    private String projectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_name")
    
    
    private String jobName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="job_status")
    
    
    private String jobStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_type")
    
    
    private String datastoreType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_config")
    
    
    private Object targetConfig;

    public ScheduleTask withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    


    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    

    public ScheduleTask withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ScheduleTask withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    public ScheduleTask withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    


    /**
     * 实例状态。 取值： - 值为“createfail”，表示实例创建失败。 - 值为“creating”，表示实例创建中。 - 值为“normal”，表示实例正常。 - 值为“abnormal”，表示实例异常。 - 值为“deleted”，表示实例已删除。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    

    public ScheduleTask withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    


    /**
     * 租户在某一region下的project ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    

    public ScheduleTask withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    


    /**
     * 任务名称。取值有：    - \"CreateGaussDBforMySQLInstance\"表示创建实例。    - \"RestoreGaussDBforMySQLNewInstance\"表示恢复新实例。    - \"AddGaussDBforMySQLNodes\"表示添加节点。    - \"DeleteGaussDBforMySQLNode\"表示删除节点。    - \"RebootGaussDBforMySQLInstance\"表示重启实例。    - \"ModifyGaussDBforMySQLPort\"表示修改实例端口。    - \"ModifyGaussDBforMySQLSecurityGroup\"表示修改实例安全组。    - \"ResizeGaussDBforMySQLFlavor\"表示实例规格变更。    - \"SwitchoverGaussDBforMySQLMasterNode\"表示只读升主。    - \"GaussDBforMySQLBindEIP\"表示绑定弹性公网IP。    - \"GaussDBforMySQLUnbindEIP\"表示解绑弹性公网IP。    - \"RenameGaussDBforMySQLInstance\"表示修改实例名称。    - \"DeleteGaussDBforMySQLInstance\"表示删除实例集群。    - \"UpgradeGaussDBforMySQLDatabaseVersion\"表示版本升级。    - \"EnlargeGaussDBforMySQLProxy\"表示实例的数据库代理节点扩容。    - \"OpenGaussDBforMySQLProxy\"表示开启实例的数据库代理。    - \"CloseGaussDBforMySQLProxy\"表示关闭实例的数据库代理。    - \"GaussdbforMySQLModifyProxyIp\"表示修改数据库代理ip。    - \"ScaleGaussDBforMySQLProxy\"表示实例的数据库代理节点规格变更。    - \"GaussDBforMySQLModifyInstanceMetricExtend\"表示实例秒级监控。    - \"GaussDBforMySQLModifyInstanceDataVip\"表示修改实例数据Vip。    - \"GaussDBforMySQLSwitchSSL\"表示切换实例SSL开关。    - \"GaussDBforMySQLModifyProxyConsist\"表示修改代理一致性。    - \"GaussDBforMySQLModifyProxyWeight\"表示修改代理权重。
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    

    public ScheduleTask withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 任务创建时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。 说明：创建时返回值为空，数据库实例创建成功后该值不为空
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ScheduleTask withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 任务开始时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。 说明：创建时返回值为空，数据库实例创建成功后该值不为空
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public ScheduleTask withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 任务结束时间，格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如偏移1个小时显示为+0100。 说明：创建时返回值为空，数据库实例创建成功后该值不为空
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public ScheduleTask withJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    


    /**
     * 任务执行状态。 取值： - 值为“Pending”，表示延时任务，未执行。 - 值为“Running”，表示任务正在执行。 - 值为“Completed”，表示任务执行成功。 - 值为“Failed”，表示任务执行失败。
     * @return jobStatus
     */
    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    

    public ScheduleTask withDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    


    /**
     * 数据库类型。
     * @return datastoreType
     */
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    

    public ScheduleTask withTargetConfig(Object targetConfig) {
        this.targetConfig = targetConfig;
        return this;
    }

    


    /**
     * 实例配置相关信息，比如规格等。
     * @return targetConfig
     */
    public Object getTargetConfig() {
        return targetConfig;
    }

    public void setTargetConfig(Object targetConfig) {
        this.targetConfig = targetConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScheduleTask scheduleTask = (ScheduleTask) o;
        return Objects.equals(this.jobId, scheduleTask.jobId) &&
            Objects.equals(this.instanceId, scheduleTask.instanceId) &&
            Objects.equals(this.instanceName, scheduleTask.instanceName) &&
            Objects.equals(this.instanceStatus, scheduleTask.instanceStatus) &&
            Objects.equals(this.projectId, scheduleTask.projectId) &&
            Objects.equals(this.jobName, scheduleTask.jobName) &&
            Objects.equals(this.createTime, scheduleTask.createTime) &&
            Objects.equals(this.startTime, scheduleTask.startTime) &&
            Objects.equals(this.endTime, scheduleTask.endTime) &&
            Objects.equals(this.jobStatus, scheduleTask.jobStatus) &&
            Objects.equals(this.datastoreType, scheduleTask.datastoreType) &&
            Objects.equals(this.targetConfig, scheduleTask.targetConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jobId, instanceId, instanceName, instanceStatus, projectId, jobName, createTime, startTime, endTime, jobStatus, datastoreType, targetConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScheduleTask {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
        sb.append("    targetConfig: ").append(toIndentedString(targetConfig)).append("\n");
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


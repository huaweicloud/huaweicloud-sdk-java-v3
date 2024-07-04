package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTaskInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_id")

    private String releaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private TaskInfoDtoError error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private String scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private TaskSchedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private TaskInput input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private TaskOutputForDisplay output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private TaskServiceConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_name")

    private String videoSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_config")

    private String taskConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_order_id")

    private String resourceOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_address")

    private String accessAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_publish_id")

    private String algorithmPublishId;

    public ShowTaskInfoResponse withId(String id) {
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

    public ShowTaskInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTaskInfoResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 任务创建者的用户名
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowTaskInfoResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 任务创建者的项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowTaskInfoResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 任务的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowTaskInfoResponse withReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }

    /**
     * 任务对应服务的ID
     * @return releaseId
     */
    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public ShowTaskInfoResponse withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 任务对应服务的ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ShowTaskInfoResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 任务创建的时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowTaskInfoResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 任务最近一次状态更新的时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowTaskInfoResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 任务当前的状态，分别为PENDING（等待中），RECOVERING（恢复中），STARTING（启动中），UPGRADING（升级中），CREATE_FAILED（创建失败），START_FAILED（启动失败），RUNNING（运行中），STOPPING（停止中），STOPPED（已停止），ABNORMAL（异常），SUCCEEDED（运行成功），FAILED（运行失败），DELETING（删除中），FREEZING（冻结中），FROZEN（已冻结）
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowTaskInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态的详情信息，仅部分状态会有详情信息
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowTaskInfoResponse withError(TaskInfoDtoError error) {
        this.error = error;
        return this;
    }

    public ShowTaskInfoResponse withError(Consumer<TaskInfoDtoError> errorSetter) {
        if (this.error == null) {
            this.error = new TaskInfoDtoError();
            errorSetter.accept(this.error);
        }

        return this;
    }

    /**
     * Get error
     * @return error
     */
    public TaskInfoDtoError getError() {
        return error;
    }

    public void setError(TaskInfoDtoError error) {
        this.error = error;
    }

    public ShowTaskInfoResponse withScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * 计划任务的状态，分别为ACTIVATED（激活），INACTIVATED（未激活）
     * @return scheduleStatus
     */
    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ShowTaskInfoResponse withSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    public ShowTaskInfoResponse withSchedule(Consumer<TaskSchedule> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new TaskSchedule();
            scheduleSetter.accept(this.schedule);
        }

        return this;
    }

    /**
     * Get schedule
     * @return schedule
     */
    public TaskSchedule getSchedule() {
        return schedule;
    }

    public void setSchedule(TaskSchedule schedule) {
        this.schedule = schedule;
    }

    public ShowTaskInfoResponse withInput(TaskInput input) {
        this.input = input;
        return this;
    }

    public ShowTaskInfoResponse withInput(Consumer<TaskInput> inputSetter) {
        if (this.input == null) {
            this.input = new TaskInput();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public TaskInput getInput() {
        return input;
    }

    public void setInput(TaskInput input) {
        this.input = input;
    }

    public ShowTaskInfoResponse withOutput(TaskOutputForDisplay output) {
        this.output = output;
        return this;
    }

    public ShowTaskInfoResponse withOutput(Consumer<TaskOutputForDisplay> outputSetter) {
        if (this.output == null) {
            this.output = new TaskOutputForDisplay();
            outputSetter.accept(this.output);
        }

        return this;
    }

    /**
     * Get output
     * @return output
     */
    public TaskOutputForDisplay getOutput() {
        return output;
    }

    public void setOutput(TaskOutputForDisplay output) {
        this.output = output;
    }

    public ShowTaskInfoResponse withConfig(TaskServiceConfig config) {
        this.config = config;
        return this;
    }

    public ShowTaskInfoResponse withConfig(Consumer<TaskServiceConfig> configSetter) {
        if (this.config == null) {
            this.config = new TaskServiceConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public TaskServiceConfig getConfig() {
        return config;
    }

    public void setConfig(TaskServiceConfig config) {
        this.config = config;
    }

    public ShowTaskInfoResponse withVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
        return this;
    }

    /**
     * 视频源名称
     * @return videoSourceName
     */
    public String getVideoSourceName() {
        return videoSourceName;
    }

    public void setVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
    }

    public ShowTaskInfoResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 算法中文名称
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ShowTaskInfoResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分组名称，多个以逗号分隔
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowTaskInfoResponse withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 厂商
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ShowTaskInfoResponse withTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
        return this;
    }

    /**
     * 任务算法配置
     * @return taskConfig
     */
    public String getTaskConfig() {
        return taskConfig;
    }

    public void setTaskConfig(String taskConfig) {
        this.taskConfig = taskConfig;
    }

    public ShowTaskInfoResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * cloud或edge
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowTaskInfoResponse withResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
        return this;
    }

    /**
     * 资源订单id
     * @return resourceOrderId
     */
    public String getResourceOrderId() {
        return resourceOrderId;
    }

    public void setResourceOrderId(String resourceOrderId) {
        this.resourceOrderId = resourceOrderId;
    }

    public ShowTaskInfoResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 算法包id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public ShowTaskInfoResponse withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * 设备id
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ShowTaskInfoResponse withAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress;
        return this;
    }

    /**
     * 接入地址
     * @return accessAddress
     */
    public String getAccessAddress() {
        return accessAddress;
    }

    public void setAccessAddress(String accessAddress) {
        this.accessAddress = accessAddress;
    }

    public ShowTaskInfoResponse withAlgorithmPublishId(String algorithmPublishId) {
        this.algorithmPublishId = algorithmPublishId;
        return this;
    }

    /**
     * 算法id
     * @return algorithmPublishId
     */
    public String getAlgorithmPublishId() {
        return algorithmPublishId;
    }

    public void setAlgorithmPublishId(String algorithmPublishId) {
        this.algorithmPublishId = algorithmPublishId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskInfoResponse that = (ShowTaskInfoResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.releaseId, that.releaseId)
            && Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.state, that.state)
            && Objects.equals(this.status, that.status) && Objects.equals(this.error, that.error)
            && Objects.equals(this.scheduleStatus, that.scheduleStatus) && Objects.equals(this.schedule, that.schedule)
            && Objects.equals(this.input, that.input) && Objects.equals(this.output, that.output)
            && Objects.equals(this.config, that.config) && Objects.equals(this.videoSourceName, that.videoSourceName)
            && Objects.equals(this.title, that.title) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.company, that.company) && Objects.equals(this.taskConfig, that.taskConfig)
            && Objects.equals(this.type, that.type) && Objects.equals(this.resourceOrderId, that.resourceOrderId)
            && Objects.equals(this.packageId, that.packageId) && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.accessAddress, that.accessAddress)
            && Objects.equals(this.algorithmPublishId, that.algorithmPublishId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            creator,
            projectId,
            description,
            releaseId,
            serviceId,
            createdAt,
            updatedAt,
            state,
            status,
            error,
            scheduleStatus,
            schedule,
            input,
            output,
            config,
            videoSourceName,
            title,
            groupName,
            company,
            taskConfig,
            type,
            resourceOrderId,
            packageId,
            deviceId,
            accessAddress,
            algorithmPublishId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    releaseId: ").append(toIndentedString(releaseId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    videoSourceName: ").append(toIndentedString(videoSourceName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    taskConfig: ").append(toIndentedString(taskConfig)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceOrderId: ").append(toIndentedString(resourceOrderId)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    accessAddress: ").append(toIndentedString(accessAddress)).append("\n");
        sb.append("    algorithmPublishId: ").append(toIndentedString(algorithmPublishId)).append("\n");
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

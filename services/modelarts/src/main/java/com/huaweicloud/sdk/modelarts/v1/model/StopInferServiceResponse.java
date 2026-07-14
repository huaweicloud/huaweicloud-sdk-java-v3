package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StopInferServiceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_reason")

    private String failureReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private ServiceVersionResponse version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "predict_url")

    private List<PredictUrlResponse> predictUrl = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dispatcher_group_id")

    private String dispatcherGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsResponse> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_timeout_minutes")

    private Integer deployTimeoutMinutes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private List<ScheduleConfigResponse> schedule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_infos")

    private List<FrozenInfo> frozenInfos = null;

    public StopInferServiceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务ID，在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **取值范围：** 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StopInferServiceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务名，用户在[创建服务](CreateInferService.xml)时自定义的名称。 **取值范围：** 支持1-64位字符，可包含字母、中文、数字、中划线、下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StopInferServiceResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释：** 工作空间ID。 **取值范围：** - 0：默认空间ID。 - 由数字和小写字母组成的32位字符：其他空间ID，可参考[工作空间创建](CreateWorkspace.xml)。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public StopInferServiceResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 推理服务类型。 **取值范围：** - REAL_TIME：在线服务。 - ASYNC_REAL_TIME：异步服务。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StopInferServiceResponse withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署方式。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public StopInferServiceResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务当前状态。 **取值范围：** - DEPLOYING：部署中 。 - FAILED：失败 。 - STOPPED：停止。 - RUNNING：运行中。 - DELETING：删除中 。 - STOPPING：停止中 。 - CONCERNING：告警 。 - UPGRADING：升级中 。 - ERROR：异常 。 - INIT：待部署。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StopInferServiceResponse withFailureReason(String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     * **参数解释：** 在线服务失败原因。 **取值范围：** 不涉及。
     * @return failureReason
     */
    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public StopInferServiceResponse withVersion(ServiceVersionResponse version) {
        this.version = version;
        return this;
    }

    public StopInferServiceResponse withVersion(Consumer<ServiceVersionResponse> versionSetter) {
        if (this.version == null) {
            this.version = new ServiceVersionResponse();
            versionSetter.accept(this.version);
        }

        return this;
    }

    /**
     * Get version
     * @return version
     */
    public ServiceVersionResponse getVersion() {
        return version;
    }

    public void setVersion(ServiceVersionResponse version) {
        this.version = version;
    }

    public StopInferServiceResponse withPredictUrl(List<PredictUrlResponse> predictUrl) {
        this.predictUrl = predictUrl;
        return this;
    }

    public StopInferServiceResponse addPredictUrlItem(PredictUrlResponse predictUrlItem) {
        if (this.predictUrl == null) {
            this.predictUrl = new ArrayList<>();
        }
        this.predictUrl.add(predictUrlItem);
        return this;
    }

    public StopInferServiceResponse withPredictUrl(Consumer<List<PredictUrlResponse>> predictUrlSetter) {
        if (this.predictUrl == null) {
            this.predictUrl = new ArrayList<>();
        }
        predictUrlSetter.accept(this.predictUrl);
        return this;
    }

    /**
     * **参数解释：** 在线服务访问地址，创建服务接口无返回，详情接口中返回。
     * @return predictUrl
     */
    public List<PredictUrlResponse> getPredictUrl() {
        return predictUrl;
    }

    public void setPredictUrl(List<PredictUrlResponse> predictUrl) {
        this.predictUrl = predictUrl;
    }

    public StopInferServiceResponse withDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
        return this;
    }

    /**
     * **参数解释：** 服务绑定的dispatcher组ID，创建服务接口无返回，详情接口中返回。 **取值范围：** 不涉及。
     * @return dispatcherGroupId
     */
    public String getDispatcherGroupId() {
        return dispatcherGroupId;
    }

    public void setDispatcherGroupId(String dispatcherGroupId) {
        this.dispatcherGroupId = dispatcherGroupId;
    }

    public StopInferServiceResponse withTags(List<TagsResponse> tags) {
        this.tags = tags;
        return this;
    }

    public StopInferServiceResponse addTagsItem(TagsResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public StopInferServiceResponse withTags(Consumer<List<TagsResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** TMS对接标签类。
     * @return tags
     */
    public List<TagsResponse> getTags() {
        return tags;
    }

    public void setTags(List<TagsResponse> tags) {
        this.tags = tags;
    }

    public StopInferServiceResponse withDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
        return this;
    }

    /**
     * **参数解释：** 部署超时时间。
     * @return deployTimeoutMinutes
     */
    public Integer getDeployTimeoutMinutes() {
        return deployTimeoutMinutes;
    }

    public void setDeployTimeoutMinutes(Integer deployTimeoutMinutes) {
        this.deployTimeoutMinutes = deployTimeoutMinutes;
    }

    public StopInferServiceResponse withSchedule(List<ScheduleConfigResponse> schedule) {
        this.schedule = schedule;
        return this;
    }

    public StopInferServiceResponse addScheduleItem(ScheduleConfigResponse scheduleItem) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        this.schedule.add(scheduleItem);
        return this;
    }

    public StopInferServiceResponse withSchedule(Consumer<List<ScheduleConfigResponse>> scheduleSetter) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        scheduleSetter.accept(this.schedule);
        return this;
    }

    /**
     * **参数解释：** 定时停止配置。
     * @return schedule
     */
    public List<ScheduleConfigResponse> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleConfigResponse> schedule) {
        this.schedule = schedule;
    }

    public StopInferServiceResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，根据创建时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字，如1609459200000。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public StopInferServiceResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，根据更新时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字，如1609459200000。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public StopInferServiceResponse withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * **参数解释：** 模型类型。 **取值范围：** - TEXT_GENERATION：文本生成 - IMAGE_UNDERSTANDING：图像理解 - VIDEO_GENERATION：视频生成 - IMAGE_GENERATION：图像生成 - RERANK：重排序 - VECTOR_MODEL：向量模型 - EMBEDDING：Embedding嵌入
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public StopInferServiceResponse withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * **参数解释：** 服务提供者的账号id（创建服务时通过X-Auth-Token-Provider请求头解析iam token而来），该值不为空时，该服务的所有更新操作需要在请求头中添加X-Auth-Token-Provider，取值为该账号id的domain级或project级token。
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public StopInferServiceResponse withFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
        return this;
    }

    public StopInferServiceResponse addFrozenInfosItem(FrozenInfo frozenInfosItem) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        this.frozenInfos.add(frozenInfosItem);
        return this;
    }

    public StopInferServiceResponse withFrozenInfos(Consumer<List<FrozenInfo>> frozenInfosSetter) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        frozenInfosSetter.accept(this.frozenInfos);
        return this;
    }

    /**
     * **参数解释：** 当服务或者部署被冻结时返回的冻结类型信息。
     * @return frozenInfos
     */
    public List<FrozenInfo> getFrozenInfos() {
        return frozenInfos;
    }

    public void setFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopInferServiceResponse that = (StopInferServiceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failureReason, that.failureReason) && Objects.equals(this.version, that.version)
            && Objects.equals(this.predictUrl, that.predictUrl)
            && Objects.equals(this.dispatcherGroupId, that.dispatcherGroupId) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.deployTimeoutMinutes, that.deployTimeoutMinutes)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.frozenInfos, that.frozenInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            workspaceId,
            type,
            deployType,
            status,
            failureReason,
            version,
            predictUrl,
            dispatcherGroupId,
            tags,
            deployTimeoutMinutes,
            schedule,
            createAt,
            updateAt,
            taskType,
            provider,
            frozenInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopInferServiceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    predictUrl: ").append(toIndentedString(predictUrl)).append("\n");
        sb.append("    dispatcherGroupId: ").append(toIndentedString(dispatcherGroupId)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    deployTimeoutMinutes: ").append(toIndentedString(deployTimeoutMinutes)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    frozenInfos: ").append(toIndentedString(frozenInfos)).append("\n");
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

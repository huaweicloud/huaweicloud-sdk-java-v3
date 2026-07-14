package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServiceItemResponseData
 */
public class ServiceItemResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_count")

    private Integer versionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private Long createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagsResponse> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule")

    private List<ScheduleConfigResponse> schedule = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frozen_infos")

    private List<FrozenInfo> frozenInfos = null;

    public ServiceItemResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 服务ID，在[创建服务](CreateInferService.xml)时即可在返回体中获取，也可通过[查询服务列表](ListInferServices.xml)获取当前用户拥有的服务，其中service_id字段即为服务ID。 **取值范围：** 服务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceItemResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 服务名，用户在[创建服务](CreateInferService.xml)时自定义。 **取值范围：** 支持1-128个字符，可以包含字母、汉字、数字、连字符和下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServiceItemResponseData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 服务当前状态。 **取值范围：** - DEPLOYING：部署中。 - FAILED：失败。 - STOPPED：停止。 - RUNNING：运行中。 - DELETING：删除中。 - STOPPING：停止中。 - CONCERNING：告警。 - UPGRADING：升级中。 - ERROR：异常。 - INTERRUPTING：中断中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ServiceItemResponseData withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释：** 服务版本号，以数字及点号组成，形如1.0.1。 **取值范围：** 1.0.0 ~ 99.99.99，长度不超过8位。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ServiceItemResponseData withVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
        return this;
    }

    /**
     * **参数解释：** 服务版本数量。 **取值范围：** 不涉及。
     * @return versionCount
     */
    public Integer getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Integer versionCount) {
        this.versionCount = versionCount;
    }

    public ServiceItemResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 服务描述，由用户[创建服务](CreateInferService.xml)时自行填写。 **取值范围：** 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceItemResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 推理服务类型。 **约束限制：** 不涉及。 **取值范围：** - REAL_TIME：在线服务。 - ASYNC_REAL_TIME：异步服务。 **默认取值：** 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ServiceItemResponseData withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * **参数解释：** 部署类型。 **取值范围：** - SINGLE：单机单卡。 - MULTI：多机多卡。
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public ServiceItemResponseData withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 创建服务的用户名。 **取值范围：** 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ServiceItemResponseData withWorkspaceId(String workspaceId) {
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

    public ServiceItemResponseData withCreateAt(Long createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间，根据创建时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字。
     * @return createAt
     */
    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public ServiceItemResponseData withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间，根据更新时的当前时间自动生成。 **取值范围：** 毫秒级时间戳，13位数字。
     * @return updateAt
     */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public ServiceItemResponseData withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释：** 在线服务认证类型。 **取值范围：** - TOKEN：IAM Token认证。 - API_KEY：API Key认证。 - NONE：无认证。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public ServiceItemResponseData withTaskType(String taskType) {
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

    public ServiceItemResponseData withTags(List<TagsResponse> tags) {
        this.tags = tags;
        return this;
    }

    public ServiceItemResponseData addTagsItem(TagsResponse tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ServiceItemResponseData withTags(Consumer<List<TagsResponse>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 在线服务标签数据。
     * @return tags
     */
    public List<TagsResponse> getTags() {
        return tags;
    }

    public void setTags(List<TagsResponse> tags) {
        this.tags = tags;
    }

    public ServiceItemResponseData withSchedule(List<ScheduleConfigResponse> schedule) {
        this.schedule = schedule;
        return this;
    }

    public ServiceItemResponseData addScheduleItem(ScheduleConfigResponse scheduleItem) {
        if (this.schedule == null) {
            this.schedule = new ArrayList<>();
        }
        this.schedule.add(scheduleItem);
        return this;
    }

    public ServiceItemResponseData withSchedule(Consumer<List<ScheduleConfigResponse>> scheduleSetter) {
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

    public ServiceItemResponseData withFrozenInfos(List<FrozenInfo> frozenInfos) {
        this.frozenInfos = frozenInfos;
        return this;
    }

    public ServiceItemResponseData addFrozenInfosItem(FrozenInfo frozenInfosItem) {
        if (this.frozenInfos == null) {
            this.frozenInfos = new ArrayList<>();
        }
        this.frozenInfos.add(frozenInfosItem);
        return this;
    }

    public ServiceItemResponseData withFrozenInfos(Consumer<List<FrozenInfo>> frozenInfosSetter) {
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
        ServiceItemResponseData that = (ServiceItemResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.status, that.status) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionCount, that.versionCount)
            && Objects.equals(this.description, that.description) && Objects.equals(this.type, that.type)
            && Objects.equals(this.deployType, that.deployType) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.schedule, that.schedule) && Objects.equals(this.frozenInfos, that.frozenInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            version,
            versionCount,
            description,
            type,
            deployType,
            userName,
            workspaceId,
            createAt,
            updateAt,
            authType,
            taskType,
            tags,
            schedule,
            frozenInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceItemResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionCount: ").append(toIndentedString(versionCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

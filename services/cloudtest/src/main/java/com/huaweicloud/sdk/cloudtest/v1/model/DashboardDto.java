package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DashboardDto
 */
public class DashboardDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private String dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_type")

    private String viewType;

    public DashboardDto withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public DashboardDto withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public DashboardDto withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型：0=用例成功率；1=用例时长
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public DashboardDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID，主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DashboardDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 看板标题
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DashboardDto withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public DashboardDto withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public DashboardDto addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public DashboardDto withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 任务ID列表
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public DashboardDto withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型，仅支持持续拨测和冒烟测试
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public DashboardDto withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public DashboardDto withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 修改者
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public DashboardDto withViewType(String viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * 看板类型：0=折线图；1=散点图；2=饼图
     * @return viewType
     */
    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashboardDto that = (DashboardDto) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.dataType, that.dataType) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.taskIds, that.taskIds) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.viewType, that.viewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            createUser,
            dataType,
            id,
            name,
            serviceId,
            taskIds,
            taskType,
            updateTime,
            updateUser,
            viewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashboardDto {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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

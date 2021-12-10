package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class Scene {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_name")

    private String sceneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_id")

    private String sceneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_id")

    private String datasourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Integer createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private Integer updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type")

    private String serviceType;

    public Scene withCategory(String category) {
        this.category = category;
        return this;
    }

    /** 类型。
     * 
     * @return category */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Scene withType(String type) {
        this.type = type;
        return this;
    }

    /** 场景类型。
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Scene withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    /** 场景名称。
     * 
     * @return sceneName */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    public Scene withSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }

    /** 场景id。
     * 
     * @return sceneId */
    public String getSceneId() {
        return sceneId;
    }

    public void setSceneId(String sceneId) {
        this.sceneId = sceneId;
    }

    public Scene withDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }

    /** 数据源id。
     * 
     * @return datasourceId */
    public String getDatasourceId() {
        return datasourceId;
    }

    public void setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
    }

    public Scene withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 状态。
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Scene withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 创建时间。
     * 
     * @return createdAt */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Scene withUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updateAt */
    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public Scene withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /** 工作空间id。
     * 
     * @return workspaceId */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Scene withServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    /** 服务类型。
     * 
     * @return serviceType */
    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Scene scene = (Scene) o;
        return Objects.equals(this.category, scene.category) && Objects.equals(this.type, scene.type)
            && Objects.equals(this.sceneName, scene.sceneName) && Objects.equals(this.sceneId, scene.sceneId)
            && Objects.equals(this.datasourceId, scene.datasourceId) && Objects.equals(this.status, scene.status)
            && Objects.equals(this.createdAt, scene.createdAt) && Objects.equals(this.updateAt, scene.updateAt)
            && Objects.equals(this.workspaceId, scene.workspaceId)
            && Objects.equals(this.serviceType, scene.serviceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            type,
            sceneName,
            sceneId,
            datasourceId,
            status,
            createdAt,
            updateAt,
            workspaceId,
            serviceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Scene {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
        sb.append("    sceneId: ").append(toIndentedString(sceneId)).append("\n");
        sb.append("    datasourceId: ").append(toIndentedString(datasourceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

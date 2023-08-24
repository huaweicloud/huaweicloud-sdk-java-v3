package com.huaweicloud.sdk.mssi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Connector元数据
 */
public class ConnectorInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_count")

    private Integer actionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionBaseInfo> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_content")

    private Object authContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_id")

    private String authId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    private Boolean favorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon")

    private String icon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_auth")

    private Boolean needAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_name")

    private String providerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_version")

    private String releaseVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_permissions")

    private List<RuntimePermission> runtimePermissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger")

    private Object swagger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "swagger_version_id")

    private String swaggerVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_count")

    private Integer triggerCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<TriggerBaseInfo> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Object version;

    public ConnectorInfo withActionCount(Integer actionCount) {
        this.actionCount = actionCount;
        return this;
    }

    /**
     * 执行动作数量
     * @return actionCount
     */
    public Integer getActionCount() {
        return actionCount;
    }

    public void setActionCount(Integer actionCount) {
        this.actionCount = actionCount;
    }

    public ConnectorInfo withActions(List<ActionBaseInfo> actions) {
        this.actions = actions;
        return this;
    }

    public ConnectorInfo addActionsItem(ActionBaseInfo actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public ConnectorInfo withActions(Consumer<List<ActionBaseInfo>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 触发事件数量
     * @return actions
     */
    public List<ActionBaseInfo> getActions() {
        return actions;
    }

    public void setActions(List<ActionBaseInfo> actions) {
        this.actions = actions;
    }

    public ConnectorInfo withAuthContent(Object authContent) {
        this.authContent = authContent;
        return this;
    }

    /**
     * 安全认证配置内容
     * @return authContent
     */
    public Object getAuthContent() {
        return authContent;
    }

    public void setAuthContent(Object authContent) {
        this.authContent = authContent;
    }

    public ConnectorInfo withAuthId(String authId) {
        this.authId = authId;
        return this;
    }

    /**
     * 认证配置ID
     * @return authId
     */
    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public ConnectorInfo withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 自定义连接器种类（连接器市场的tab分类）
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ConnectorInfo withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public ConnectorInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义连接器描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ConnectorInfo withFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 是否收藏
     * @return favorite
     */
    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public ConnectorInfo withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * logo base64编码
     * @return icon
     */
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public ConnectorInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自定义连接器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConnectorInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义连接器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConnectorInfo withNeedAuth(Boolean needAuth) {
        this.needAuth = needAuth;
        return this;
    }

    /**
     * 是否需要验证
     * @return needAuth
     */
    public Boolean getNeedAuth() {
        return needAuth;
    }

    public void setNeedAuth(Boolean needAuth) {
        this.needAuth = needAuth;
    }

    public ConnectorInfo withProviderName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * 服务提供商
     * @return providerName
     */
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public ConnectorInfo withReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
        return this;
    }

    /**
     * 发布版本
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public ConnectorInfo withRuntimePermissions(List<RuntimePermission> runtimePermissions) {
        this.runtimePermissions = runtimePermissions;
        return this;
    }

    public ConnectorInfo addRuntimePermissionsItem(RuntimePermission runtimePermissionsItem) {
        if (this.runtimePermissions == null) {
            this.runtimePermissions = new ArrayList<>();
        }
        this.runtimePermissions.add(runtimePermissionsItem);
        return this;
    }

    public ConnectorInfo withRuntimePermissions(Consumer<List<RuntimePermission>> runtimePermissionsSetter) {
        if (this.runtimePermissions == null) {
            this.runtimePermissions = new ArrayList<>();
        }
        runtimePermissionsSetter.accept(this.runtimePermissions);
        return this;
    }

    /**
     * 权限
     * @return runtimePermissions
     */
    public List<RuntimePermission> getRuntimePermissions() {
        return runtimePermissions;
    }

    public void setRuntimePermissions(List<RuntimePermission> runtimePermissions) {
        this.runtimePermissions = runtimePermissions;
    }

    public ConnectorInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态(dev：草稿、released：已发布、onboard：已上架)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConnectorInfo withSwagger(Object swagger) {
        this.swagger = swagger;
        return this;
    }

    /**
     * swagger文档（只包含基本信息+认证信息）
     * @return swagger
     */
    public Object getSwagger() {
        return swagger;
    }

    public void setSwagger(Object swagger) {
        this.swagger = swagger;
    }

    public ConnectorInfo withSwaggerVersionId(String swaggerVersionId) {
        this.swaggerVersionId = swaggerVersionId;
        return this;
    }

    /**
     * 版本id
     * @return swaggerVersionId
     */
    public String getSwaggerVersionId() {
        return swaggerVersionId;
    }

    public void setSwaggerVersionId(String swaggerVersionId) {
        this.swaggerVersionId = swaggerVersionId;
    }

    public ConnectorInfo withTriggerCount(Integer triggerCount) {
        this.triggerCount = triggerCount;
        return this;
    }

    /**
     * 触发事件数量
     * @return triggerCount
     */
    public Integer getTriggerCount() {
        return triggerCount;
    }

    public void setTriggerCount(Integer triggerCount) {
        this.triggerCount = triggerCount;
    }

    public ConnectorInfo withTriggers(List<TriggerBaseInfo> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ConnectorInfo addTriggersItem(TriggerBaseInfo triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ConnectorInfo withTriggers(Consumer<List<TriggerBaseInfo>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * 触发事件数量
     * @return triggers
     */
    public List<TriggerBaseInfo> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<TriggerBaseInfo> triggers) {
        this.triggers = triggers;
    }

    public ConnectorInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 自定义连接器类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ConnectorInfo withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 修改时间
     * @return updatedTime
     */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ConnectorInfo withVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectorInfo that = (ConnectorInfo) obj;
        return Objects.equals(this.actionCount, that.actionCount) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.authContent, that.authContent) && Objects.equals(this.authId, that.authId)
            && Objects.equals(this.category, that.category) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.description, that.description) && Objects.equals(this.favorite, that.favorite)
            && Objects.equals(this.icon, that.icon) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.needAuth, that.needAuth)
            && Objects.equals(this.providerName, that.providerName)
            && Objects.equals(this.releaseVersion, that.releaseVersion)
            && Objects.equals(this.runtimePermissions, that.runtimePermissions)
            && Objects.equals(this.status, that.status) && Objects.equals(this.swagger, that.swagger)
            && Objects.equals(this.swaggerVersionId, that.swaggerVersionId)
            && Objects.equals(this.triggerCount, that.triggerCount) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.type, that.type) && Objects.equals(this.updatedTime, that.updatedTime)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionCount,
            actions,
            authContent,
            authId,
            category,
            createdTime,
            description,
            favorite,
            icon,
            id,
            name,
            needAuth,
            providerName,
            releaseVersion,
            runtimePermissions,
            status,
            swagger,
            swaggerVersionId,
            triggerCount,
            triggers,
            type,
            updatedTime,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectorInfo {\n");
        sb.append("    actionCount: ").append(toIndentedString(actionCount)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    authContent: ").append(toIndentedString(authContent)).append("\n");
        sb.append("    authId: ").append(toIndentedString(authId)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
        sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    needAuth: ").append(toIndentedString(needAuth)).append("\n");
        sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
        sb.append("    releaseVersion: ").append(toIndentedString(releaseVersion)).append("\n");
        sb.append("    runtimePermissions: ").append(toIndentedString(runtimePermissions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    swagger: ").append(toIndentedString(swagger)).append("\n");
        sb.append("    swaggerVersionId: ").append(toIndentedString(swaggerVersionId)).append("\n");
        sb.append("    triggerCount: ").append(toIndentedString(triggerCount)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

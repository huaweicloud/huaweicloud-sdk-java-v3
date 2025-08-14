package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 应用信息。
 */
public class App {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_param")

    private String commandParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_path")

    private String executePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_path")

    private String workPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_path")

    private String iconPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_index")

    private Integer iconIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private AppStateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_at")

    private OffsetDateTime publishAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private String publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishable")

    private Boolean publishable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sandbox_enable")

    private Boolean sandboxEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pre_boot")

    private Boolean isPreBoot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_extended_info")

    private AppExtendedInfo appExtendedInfo;

    public App withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public App withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public App withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 应用版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public App withCommandParam(String commandParam) {
        this.commandParam = commandParam;
        return this;
    }

    /**
     * 启动命令行参数。
     * @return commandParam
     */
    public String getCommandParam() {
        return commandParam;
    }

    public void setCommandParam(String commandParam) {
        this.commandParam = commandParam;
    }

    public App withExecutePath(String executePath) {
        this.executePath = executePath;
        return this;
    }

    /**
     * 执行路径。
     * @return executePath
     */
    public String getExecutePath() {
        return executePath;
    }

    public void setExecutePath(String executePath) {
        this.executePath = executePath;
    }

    public App withWorkPath(String workPath) {
        this.workPath = workPath;
        return this;
    }

    /**
     * 应用工作目录。
     * @return workPath
     */
    public String getWorkPath() {
        return workPath;
    }

    public void setWorkPath(String workPath) {
        this.workPath = workPath;
    }

    public App withIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    /**
     * 应用图标的路径。
     * @return iconPath
     */
    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public App withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
        return this;
    }

    /**
     * 应用图标的索引。
     * @return iconIndex
     */
    public Integer getIconIndex() {
        return iconIndex;
    }

    public void setIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
    }

    public App withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public App withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组标识Id。
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public App withState(AppStateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    public AppStateEnum getState() {
        return state;
    }

    public void setState(AppStateEnum state) {
        this.state = state;
    }

    public App withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 所在的租户ID。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public App withPublishAt(OffsetDateTime publishAt) {
        this.publishAt = publishAt;
        return this;
    }

    /**
     * 发布时间。
     * @return publishAt
     */
    public OffsetDateTime getPublishAt() {
        return publishAt;
    }

    public void setPublishAt(OffsetDateTime publishAt) {
        this.publishAt = publishAt;
    }

    public App withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 应用类型： - '1':系统内置应用 - '2':镜像应用 - '3':自定义应用
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public App withPublisher(String publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * 应用发布者。
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public App withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 图标url。
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public App withPublishable(Boolean publishable) {
        this.publishable = publishable;
        return this;
    }

    /**
     * 是否可发布应用： - true: 可发布。 - false: 不可发布。
     * @return publishable
     */
    public Boolean getPublishable() {
        return publishable;
    }

    public void setPublishable(Boolean publishable) {
        this.publishable = publishable;
    }

    public App withSandboxEnable(Boolean sandboxEnable) {
        this.sandboxEnable = sandboxEnable;
        return this;
    }

    /**
     * 是否使用沙箱模式运行，取值为： - false: 表示不以沙箱模式运行。 - true: 表示以沙箱模式运行。
     * @return sandboxEnable
     */
    public Boolean getSandboxEnable() {
        return sandboxEnable;
    }

    public void setSandboxEnable(Boolean sandboxEnable) {
        this.sandboxEnable = sandboxEnable;
    }

    public App withIsPreBoot(Boolean isPreBoot) {
        this.isPreBoot = isPreBoot;
        return this;
    }

    /**
     * 是否开启应用预开，取值为： - false: 表示关闭应用预开。 - true: 表示开启应用预开。
     * @return isPreBoot
     */
    public Boolean getIsPreBoot() {
        return isPreBoot;
    }

    public void setIsPreBoot(Boolean isPreBoot) {
        this.isPreBoot = isPreBoot;
    }

    public App withAppExtendedInfo(AppExtendedInfo appExtendedInfo) {
        this.appExtendedInfo = appExtendedInfo;
        return this;
    }

    public App withAppExtendedInfo(Consumer<AppExtendedInfo> appExtendedInfoSetter) {
        if (this.appExtendedInfo == null) {
            this.appExtendedInfo = new AppExtendedInfo();
            appExtendedInfoSetter.accept(this.appExtendedInfo);
        }

        return this;
    }

    /**
     * Get appExtendedInfo
     * @return appExtendedInfo
     */
    public AppExtendedInfo getAppExtendedInfo() {
        return appExtendedInfo;
    }

    public void setAppExtendedInfo(AppExtendedInfo appExtendedInfo) {
        this.appExtendedInfo = appExtendedInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        App that = (App) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.commandParam, that.commandParam)
            && Objects.equals(this.executePath, that.executePath) && Objects.equals(this.workPath, that.workPath)
            && Objects.equals(this.iconPath, that.iconPath) && Objects.equals(this.iconIndex, that.iconIndex)
            && Objects.equals(this.description, that.description) && Objects.equals(this.appGroupId, that.appGroupId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.publishAt, that.publishAt) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.publisher, that.publisher) && Objects.equals(this.iconUrl, that.iconUrl)
            && Objects.equals(this.publishable, that.publishable)
            && Objects.equals(this.sandboxEnable, that.sandboxEnable) && Objects.equals(this.isPreBoot, that.isPreBoot)
            && Objects.equals(this.appExtendedInfo, that.appExtendedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            version,
            commandParam,
            executePath,
            workPath,
            iconPath,
            iconIndex,
            description,
            appGroupId,
            state,
            tenantId,
            publishAt,
            sourceType,
            publisher,
            iconUrl,
            publishable,
            sandboxEnable,
            isPreBoot,
            appExtendedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class App {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    commandParam: ").append(toIndentedString(commandParam)).append("\n");
        sb.append("    executePath: ").append(toIndentedString(executePath)).append("\n");
        sb.append("    workPath: ").append(toIndentedString(workPath)).append("\n");
        sb.append("    iconPath: ").append(toIndentedString(iconPath)).append("\n");
        sb.append("    iconIndex: ").append(toIndentedString(iconIndex)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    publishAt: ").append(toIndentedString(publishAt)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
        sb.append("    publishable: ").append(toIndentedString(publishable)).append("\n");
        sb.append("    sandboxEnable: ").append(toIndentedString(sandboxEnable)).append("\n");
        sb.append("    isPreBoot: ").append(toIndentedString(isPreBoot)).append("\n");
        sb.append("    appExtendedInfo: ").append(toIndentedString(appExtendedInfo)).append("\n");
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

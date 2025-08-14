package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发布应用的结构体。
 */
public class PublishApp {

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
    @JsonProperty(value = "icon_uri")

    private String iconUri;

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
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publisher")

    private String publisher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_image_ids")

    private List<String> sourceImageIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sandbox_enable")

    private Boolean sandboxEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_extended_info")

    private AppExtendedInfo appExtendedInfo;

    public PublishApp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称,名称需满足如下规则: 1. 名称允许可见字符或空格，不可为全空格。 2. 不允许包含如下字符:^;|~`{}[]<>。 3. 长度1~64个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublishApp withVersion(String version) {
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

    public PublishApp withCommandParam(String commandParam) {
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

    public PublishApp withIconUri(String iconUri) {
        this.iconUri = iconUri;
        return this;
    }

    /**
     * 图标地址，该字段当前未使用。 > - 图片的默认大小当前限制为8KB，即1024 * 8字节。 > - 如果数据格式为data;image/png;base64,iVBORw0KGgoAAAANS时实际大小约为字段约为：size * 4/3 + 4bytes。
     * @return iconUri
     */
    public String getIconUri() {
        return iconUri;
    }

    public void setIconUri(String iconUri) {
        this.iconUri = iconUri;
    }

    public PublishApp withExecutePath(String executePath) {
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

    public PublishApp withWorkPath(String workPath) {
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

    public PublishApp withIconPath(String iconPath) {
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

    public PublishApp withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
        return this;
    }

    /**
     * 应用图标的索引。
     * minimum: 0
     * maximum: 2147483647
     * @return iconIndex
     */
    public Integer getIconIndex() {
        return iconIndex;
    }

    public void setIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
    }

    public PublishApp withDescription(String description) {
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

    public PublishApp withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 应用类型： - '1':系统保留不可用。 - '2':镜像应用。 - '3':自定义应用。
     * minimum: 1
     * maximum: 3
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public PublishApp withPublisher(String publisher) {
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

    public PublishApp withSourceImageIds(List<String> sourceImageIds) {
        this.sourceImageIds = sourceImageIds;
        return this;
    }

    public PublishApp addSourceImageIdsItem(String sourceImageIdsItem) {
        if (this.sourceImageIds == null) {
            this.sourceImageIds = new ArrayList<>();
        }
        this.sourceImageIds.add(sourceImageIdsItem);
        return this;
    }

    public PublishApp withSourceImageIds(Consumer<List<String>> sourceImageIdsSetter) {
        if (this.sourceImageIds == null) {
            this.sourceImageIds = new ArrayList<>();
        }
        sourceImageIdsSetter.accept(this.sourceImageIds);
        return this;
    }

    /**
     * 镜像ids,最多20个。
     * @return sourceImageIds
     */
    public List<String> getSourceImageIds() {
        return sourceImageIds;
    }

    public void setSourceImageIds(List<String> sourceImageIds) {
        this.sourceImageIds = sourceImageIds;
    }

    public PublishApp withSandboxEnable(Boolean sandboxEnable) {
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

    public PublishApp withAppExtendedInfo(AppExtendedInfo appExtendedInfo) {
        this.appExtendedInfo = appExtendedInfo;
        return this;
    }

    public PublishApp withAppExtendedInfo(Consumer<AppExtendedInfo> appExtendedInfoSetter) {
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
        PublishApp that = (PublishApp) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.version, that.version)
            && Objects.equals(this.commandParam, that.commandParam) && Objects.equals(this.iconUri, that.iconUri)
            && Objects.equals(this.executePath, that.executePath) && Objects.equals(this.workPath, that.workPath)
            && Objects.equals(this.iconPath, that.iconPath) && Objects.equals(this.iconIndex, that.iconIndex)
            && Objects.equals(this.description, that.description) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.publisher, that.publisher)
            && Objects.equals(this.sourceImageIds, that.sourceImageIds)
            && Objects.equals(this.sandboxEnable, that.sandboxEnable)
            && Objects.equals(this.appExtendedInfo, that.appExtendedInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            version,
            commandParam,
            iconUri,
            executePath,
            workPath,
            iconPath,
            iconIndex,
            description,
            sourceType,
            publisher,
            sourceImageIds,
            sandboxEnable,
            appExtendedInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublishApp {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    commandParam: ").append(toIndentedString(commandParam)).append("\n");
        sb.append("    iconUri: ").append(toIndentedString(iconUri)).append("\n");
        sb.append("    executePath: ").append(toIndentedString(executePath)).append("\n");
        sb.append("    workPath: ").append(toIndentedString(workPath)).append("\n");
        sb.append("    iconPath: ").append(toIndentedString(iconPath)).append("\n");
        sb.append("    iconIndex: ").append(toIndentedString(iconIndex)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    sourceImageIds: ").append(toIndentedString(sourceImageIds)).append("\n");
        sb.append("    sandboxEnable: ").append(toIndentedString(sandboxEnable)).append("\n");
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

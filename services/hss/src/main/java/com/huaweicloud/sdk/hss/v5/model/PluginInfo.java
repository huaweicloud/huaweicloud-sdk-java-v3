package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件信息
 */
public class PluginInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installed_attachment_num")

    private Integer installedAttachmentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uninstall_attachment_num")

    private Integer uninstallAttachmentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cpu_limit")

    private Integer maxCpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_memory_limit")

    private Integer maxMemoryLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_size")

    private String maxSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_mode")

    private Integer displayMode;

    public PluginInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 插件编码 **取值范围**: 不涉及 
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PluginInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 插件名称 **取值范围**: 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PluginInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 插件的描述信息 **取值范围**: 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PluginInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public PluginInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PluginInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 插件标签信息 **取值范围**: 不涉及 
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public PluginInfo withInstalledAttachmentNum(Integer installedAttachmentNum) {
        this.installedAttachmentNum = installedAttachmentNum;
        return this;
    }

    /**
     * **参数解释**： 已安装插件的主机数量 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return installedAttachmentNum
     */
    public Integer getInstalledAttachmentNum() {
        return installedAttachmentNum;
    }

    public void setInstalledAttachmentNum(Integer installedAttachmentNum) {
        this.installedAttachmentNum = installedAttachmentNum;
    }

    public PluginInfo withUninstallAttachmentNum(Integer uninstallAttachmentNum) {
        this.uninstallAttachmentNum = uninstallAttachmentNum;
        return this;
    }

    /**
     * **参数解释**： 未安装插件的主机数量，包括插件状态为未安装、安装中与安装失败的主机 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 2147483647
     * @return uninstallAttachmentNum
     */
    public Integer getUninstallAttachmentNum() {
        return uninstallAttachmentNum;
    }

    public void setUninstallAttachmentNum(Integer uninstallAttachmentNum) {
        this.uninstallAttachmentNum = uninstallAttachmentNum;
    }

    public PluginInfo withMaxCpuLimit(Integer maxCpuLimit) {
        this.maxCpuLimit = maxCpuLimit;
        return this;
    }

    /**
     * **参数解释**： 此种类型的插件包中，运行插件所需单核CPU(0-100%)的最大值 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 100
     * @return maxCpuLimit
     */
    public Integer getMaxCpuLimit() {
        return maxCpuLimit;
    }

    public void setMaxCpuLimit(Integer maxCpuLimit) {
        this.maxCpuLimit = maxCpuLimit;
    }

    public PluginInfo withMaxMemoryLimit(Integer maxMemoryLimit) {
        this.maxMemoryLimit = maxMemoryLimit;
        return this;
    }

    /**
     * **参数解释**： 此种类型的插件包中，运行插件所需内存(MB)的最大值 **取值范围**: 不涉及 
     * minimum: 0
     * maximum: 200
     * @return maxMemoryLimit
     */
    public Integer getMaxMemoryLimit() {
        return maxMemoryLimit;
    }

    public void setMaxMemoryLimit(Integer maxMemoryLimit) {
        this.maxMemoryLimit = maxMemoryLimit;
    }

    public PluginInfo withMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * **参数解释**： 此种类型的插件包中，插件大小(MB)的最大值 **取值范围**: 不涉及 
     * @return maxSize
     */
    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public PluginInfo withDisplayMode(Integer displayMode) {
        this.displayMode = displayMode;
        return this;
    }

    /**
     * **参数解释**： 插件展示模式 **取值范围**: - 0：插件所有操作功能均支持 - 1：不支持插件的安装、卸载操作 - 2：插件所有操作功能均不支持 
     * minimum: 0
     * maximum: 100
     * @return displayMode
     */
    public Integer getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(Integer displayMode) {
        this.displayMode = displayMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginInfo that = (PluginInfo) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.installedAttachmentNum, that.installedAttachmentNum)
            && Objects.equals(this.uninstallAttachmentNum, that.uninstallAttachmentNum)
            && Objects.equals(this.maxCpuLimit, that.maxCpuLimit)
            && Objects.equals(this.maxMemoryLimit, that.maxMemoryLimit) && Objects.equals(this.maxSize, that.maxSize)
            && Objects.equals(this.displayMode, that.displayMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code,
            name,
            description,
            tags,
            installedAttachmentNum,
            uninstallAttachmentNum,
            maxCpuLimit,
            maxMemoryLimit,
            maxSize,
            displayMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginInfo {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    installedAttachmentNum: ").append(toIndentedString(installedAttachmentNum)).append("\n");
        sb.append("    uninstallAttachmentNum: ").append(toIndentedString(uninstallAttachmentNum)).append("\n");
        sb.append("    maxCpuLimit: ").append(toIndentedString(maxCpuLimit)).append("\n");
        sb.append("    maxMemoryLimit: ").append(toIndentedString(maxMemoryLimit)).append("\n");
        sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
        sb.append("    displayMode: ").append(toIndentedString(displayMode)).append("\n");
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

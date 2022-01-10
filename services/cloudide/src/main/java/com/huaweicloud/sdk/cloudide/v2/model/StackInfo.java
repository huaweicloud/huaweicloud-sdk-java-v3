package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** StackInfo */
public class StackInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arm_config")

    private StacksConfig armConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bundle_url")

    private String bundleUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private StacksConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private OffsetDateTime createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private Boolean delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo")

    private String logo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show")

    private Boolean show;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_name")

    private String stackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private OffsetDateTime updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<String> users = null;

    public StackInfo withArmConfig(StacksConfig armConfig) {
        this.armConfig = armConfig;
        return this;
    }

    public StackInfo withArmConfig(Consumer<StacksConfig> armConfigSetter) {
        if (this.armConfig == null) {
            this.armConfig = new StacksConfig();
            armConfigSetter.accept(this.armConfig);
        }

        return this;
    }

    /** Get armConfig
     * 
     * @return armConfig */
    public StacksConfig getArmConfig() {
        return armConfig;
    }

    public void setArmConfig(StacksConfig armConfig) {
        this.armConfig = armConfig;
    }

    public StackInfo withBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
        return this;
    }

    /** bundleUrl
     * 
     * @return bundleUrl */
    public String getBundleUrl() {
        return bundleUrl;
    }

    public void setBundleUrl(String bundleUrl) {
        this.bundleUrl = bundleUrl;
    }

    public StackInfo withConfig(StacksConfig config) {
        this.config = config;
        return this;
    }

    public StackInfo withConfig(Consumer<StacksConfig> configSetter) {
        if (this.config == null) {
            this.config = new StacksConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /** Get config
     * 
     * @return config */
    public StacksConfig getConfig() {
        return config;
    }

    public void setConfig(StacksConfig config) {
        this.config = config;
    }

    public StackInfo withCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /** 创建时间
     * 
     * @return createdTime */
    public OffsetDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(OffsetDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public StackInfo withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }

    /** 是否删除
     * 
     * @return delete */
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public StackInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StackInfo withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /** 是否可用
     * 
     * @return disable */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public StackInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /** 显示名称
     * 
     * @return displayName */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public StackInfo withId(Long id) {
        this.id = id;
        return this;
    }

    /** id
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StackInfo withLabel(String label) {
        this.label = label;
        return this;
    }

    /** 标签
     * 
     * @return label */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public StackInfo withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    /** 图标
     * 
     * @return logo */
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public StackInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /** region
     * 
     * @return region */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public StackInfo withShow(Boolean show) {
        this.show = show;
        return this;
    }

    /** 是否显示
     * 
     * @return show */
    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public StackInfo withStackName(String stackName) {
        this.stackName = stackName;
        return this;
    }

    /** 技术栈名称
     * 
     * @return stackName */
    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public StackInfo withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public StackInfo addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public StackInfo withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** tags
     * 
     * @return tags */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public StackInfo withUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /** 修改时间
     * 
     * @return updatedTime */
    public OffsetDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(OffsetDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public StackInfo withUsers(List<String> users) {
        this.users = users;
        return this;
    }

    public StackInfo addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public StackInfo withUsers(Consumer<List<String>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /** 使用者
     * 
     * @return users */
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StackInfo stackInfo = (StackInfo) o;
        return Objects.equals(this.armConfig, stackInfo.armConfig)
            && Objects.equals(this.bundleUrl, stackInfo.bundleUrl) && Objects.equals(this.config, stackInfo.config)
            && Objects.equals(this.createdTime, stackInfo.createdTime) && Objects.equals(this.delete, stackInfo.delete)
            && Objects.equals(this.description, stackInfo.description)
            && Objects.equals(this.disable, stackInfo.disable)
            && Objects.equals(this.displayName, stackInfo.displayName) && Objects.equals(this.id, stackInfo.id)
            && Objects.equals(this.label, stackInfo.label) && Objects.equals(this.logo, stackInfo.logo)
            && Objects.equals(this.region, stackInfo.region) && Objects.equals(this.show, stackInfo.show)
            && Objects.equals(this.stackName, stackInfo.stackName) && Objects.equals(this.tags, stackInfo.tags)
            && Objects.equals(this.updatedTime, stackInfo.updatedTime) && Objects.equals(this.users, stackInfo.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(armConfig,
            bundleUrl,
            config,
            createdTime,
            delete,
            description,
            disable,
            displayName,
            id,
            label,
            logo,
            region,
            show,
            stackName,
            tags,
            updatedTime,
            users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StackInfo {\n");
        sb.append("    armConfig: ").append(toIndentedString(armConfig)).append("\n");
        sb.append("    bundleUrl: ").append(toIndentedString(bundleUrl)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    show: ").append(toIndentedString(show)).append("\n");
        sb.append("    stackName: ").append(toIndentedString(stackName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

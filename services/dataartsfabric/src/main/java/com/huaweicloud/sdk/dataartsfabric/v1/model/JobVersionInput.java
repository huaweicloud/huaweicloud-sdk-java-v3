package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 版本信息
 */
public class JobVersionInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cap_white_list")

    private List<String> capWhiteList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private JobConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependence_framework")

    private List<Framework> dependenceFramework = null;

    public JobVersionInput withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业版本名称,只能包含中文、字母、数字、下划线、中划线、点、空格
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobVersionInput withCapWhiteList(List<String> capWhiteList) {
        this.capWhiteList = capWhiteList;
        return this;
    }

    public JobVersionInput addCapWhiteListItem(String capWhiteListItem) {
        if (this.capWhiteList == null) {
            this.capWhiteList = new ArrayList<>();
        }
        this.capWhiteList.add(capWhiteListItem);
        return this;
    }

    public JobVersionInput withCapWhiteList(Consumer<List<String>> capWhiteListSetter) {
        if (this.capWhiteList == null) {
            this.capWhiteList = new ArrayList<>();
        }
        capWhiteListSetter.accept(this.capWhiteList);
        return this;
    }

    /**
     * cap白名单
     * @return capWhiteList
     */
    public List<String> getCapWhiteList() {
        return capWhiteList;
    }

    public void setCapWhiteList(List<String> capWhiteList) {
        this.capWhiteList = capWhiteList;
    }

    public JobVersionInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobVersionInput withConfig(JobConfig config) {
        this.config = config;
        return this;
    }

    public JobVersionInput withConfig(Consumer<JobConfig> configSetter) {
        if (this.config == null) {
            this.config = new JobConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public JobConfig getConfig() {
        return config;
    }

    public void setConfig(JobConfig config) {
        this.config = config;
    }

    public JobVersionInput withDependenceFramework(List<Framework> dependenceFramework) {
        this.dependenceFramework = dependenceFramework;
        return this;
    }

    public JobVersionInput addDependenceFrameworkItem(Framework dependenceFrameworkItem) {
        if (this.dependenceFramework == null) {
            this.dependenceFramework = new ArrayList<>();
        }
        this.dependenceFramework.add(dependenceFrameworkItem);
        return this;
    }

    public JobVersionInput withDependenceFramework(Consumer<List<Framework>> dependenceFrameworkSetter) {
        if (this.dependenceFramework == null) {
            this.dependenceFramework = new ArrayList<>();
        }
        dependenceFrameworkSetter.accept(this.dependenceFramework);
        return this;
    }

    /**
     * Framework列表信息
     * @return dependenceFramework
     */
    public List<Framework> getDependenceFramework() {
        return dependenceFramework;
    }

    public void setDependenceFramework(List<Framework> dependenceFramework) {
        this.dependenceFramework = dependenceFramework;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobVersionInput that = (JobVersionInput) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.capWhiteList, that.capWhiteList)
            && Objects.equals(this.description, that.description) && Objects.equals(this.config, that.config)
            && Objects.equals(this.dependenceFramework, that.dependenceFramework);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capWhiteList, description, config, dependenceFramework);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobVersionInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    capWhiteList: ").append(toIndentedString(capWhiteList)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    dependenceFramework: ").append(toIndentedString(dependenceFramework)).append("\n");
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

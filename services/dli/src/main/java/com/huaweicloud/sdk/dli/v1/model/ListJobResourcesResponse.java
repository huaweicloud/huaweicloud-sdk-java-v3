package com.huaweicloud.sdk.dli.v1.model;

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
public class ListJobResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PackageResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<PackageResourceMoudle> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<Object> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListJobResourcesResponse withResources(List<PackageResource> resources) {
        this.resources = resources;
        return this;
    }

    public ListJobResourcesResponse addResourcesItem(PackageResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListJobResourcesResponse withResources(Consumer<List<PackageResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 已上传的用户资源名列表。
     * @return resources
     */
    public List<PackageResource> getResources() {
        return resources;
    }

    public void setResources(List<PackageResource> resources) {
        this.resources = resources;
    }

    public ListJobResourcesResponse withModules(List<PackageResourceMoudle> modules) {
        this.modules = modules;
        return this;
    }

    public ListJobResourcesResponse addModulesItem(PackageResourceMoudle modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ListJobResourcesResponse withModules(Consumer<List<PackageResourceMoudle>> modulesSetter) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        modulesSetter.accept(this.modules);
        return this;
    }

    /**
     * 系统内置资源模块列表
     * @return modules
     */
    public List<PackageResourceMoudle> getModules() {
        return modules;
    }

    public void setModules(List<PackageResourceMoudle> modules) {
        this.modules = modules;
    }

    public ListJobResourcesResponse withGroups(List<Object> groups) {
        this.groups = groups;
        return this;
    }

    public ListJobResourcesResponse addGroupsItem(Object groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListJobResourcesResponse withGroups(Consumer<List<Object>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 已上传的用户分组资源。
     * @return groups
     */
    public List<Object> getGroups() {
        return groups;
    }

    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    public ListJobResourcesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 资源包返回总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListJobResourcesResponse that = (ListJobResourcesResponse) obj;
        return Objects.equals(this.resources, that.resources) && Objects.equals(this.modules, that.modules)
            && Objects.equals(this.groups, that.groups) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, modules, groups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJobResourcesResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

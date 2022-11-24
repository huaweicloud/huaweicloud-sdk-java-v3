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
public class ListResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ListGroupPackagesResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modules")

    private List<ListResourcePackagesRespMoudle> modules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<Object> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListResourcesResponse withResources(List<ListGroupPackagesResource> resources) {
        this.resources = resources;
        return this;
    }

    public ListResourcesResponse addResourcesItem(ListGroupPackagesResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListResourcesResponse withResources(Consumer<List<ListGroupPackagesResource>> resourcesSetter) {
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
    public List<ListGroupPackagesResource> getResources() {
        return resources;
    }

    public void setResources(List<ListGroupPackagesResource> resources) {
        this.resources = resources;
    }

    public ListResourcesResponse withModules(List<ListResourcePackagesRespMoudle> modules) {
        this.modules = modules;
        return this;
    }

    public ListResourcesResponse addModulesItem(ListResourcePackagesRespMoudle modulesItem) {
        if (this.modules == null) {
            this.modules = new ArrayList<>();
        }
        this.modules.add(modulesItem);
        return this;
    }

    public ListResourcesResponse withModules(Consumer<List<ListResourcePackagesRespMoudle>> modulesSetter) {
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
    public List<ListResourcePackagesRespMoudle> getModules() {
        return modules;
    }

    public void setModules(List<ListResourcePackagesRespMoudle> modules) {
        this.modules = modules;
    }

    public ListResourcesResponse withGroups(List<Object> groups) {
        this.groups = groups;
        return this;
    }

    public ListResourcesResponse addGroupsItem(Object groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ListResourcesResponse withGroups(Consumer<List<Object>> groupsSetter) {
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

    public ListResourcesResponse withTotal(Integer total) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourcesResponse listResourcesResponse = (ListResourcesResponse) o;
        return Objects.equals(this.resources, listResourcesResponse.resources)
            && Objects.equals(this.modules, listResourcesResponse.modules)
            && Objects.equals(this.groups, listResourcesResponse.groups)
            && Objects.equals(this.total, listResourcesResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, modules, groups, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesResponse {\n");
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

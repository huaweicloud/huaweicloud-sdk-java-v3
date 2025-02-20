package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplicationModelQueryResponseData
 */
public class ApplicationModelQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_applications")

    private List<ApplicationInfo> subApplications = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<ComponentInfo> components = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<GroupInfo> groups = null;

    public ApplicationModelQueryResponseData withSubApplications(List<ApplicationInfo> subApplications) {
        this.subApplications = subApplications;
        return this;
    }

    public ApplicationModelQueryResponseData addSubApplicationsItem(ApplicationInfo subApplicationsItem) {
        if (this.subApplications == null) {
            this.subApplications = new ArrayList<>();
        }
        this.subApplications.add(subApplicationsItem);
        return this;
    }

    public ApplicationModelQueryResponseData withSubApplications(
        Consumer<List<ApplicationInfo>> subApplicationsSetter) {
        if (this.subApplications == null) {
            this.subApplications = new ArrayList<>();
        }
        subApplicationsSetter.accept(this.subApplications);
        return this;
    }

    /**
     * Get subApplications
     * @return subApplications
     */
    public List<ApplicationInfo> getSubApplications() {
        return subApplications;
    }

    public void setSubApplications(List<ApplicationInfo> subApplications) {
        this.subApplications = subApplications;
    }

    public ApplicationModelQueryResponseData withComponents(List<ComponentInfo> components) {
        this.components = components;
        return this;
    }

    public ApplicationModelQueryResponseData addComponentsItem(ComponentInfo componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ApplicationModelQueryResponseData withComponents(Consumer<List<ComponentInfo>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * Get components
     * @return components
     */
    public List<ComponentInfo> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentInfo> components) {
        this.components = components;
    }

    public ApplicationModelQueryResponseData withGroups(List<GroupInfo> groups) {
        this.groups = groups;
        return this;
    }

    public ApplicationModelQueryResponseData addGroupsItem(GroupInfo groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ApplicationModelQueryResponseData withGroups(Consumer<List<GroupInfo>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * Get groups
     * @return groups
     */
    public List<GroupInfo> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupInfo> groups) {
        this.groups = groups;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationModelQueryResponseData that = (ApplicationModelQueryResponseData) obj;
        return Objects.equals(this.subApplications, that.subApplications)
            && Objects.equals(this.components, that.components) && Objects.equals(this.groups, that.groups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subApplications, components, groups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationModelQueryResponseData {\n");
        sb.append("    subApplications: ").append(toIndentedString(subApplications)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

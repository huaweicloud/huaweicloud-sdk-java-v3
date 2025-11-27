package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * APIEnablement
 */
public class APIEnablement {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupVersion")

    private String groupVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<APIResource> resources = null;

    public APIEnablement withGroupVersion(String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    /**
     * 资源组版本
     * @return groupVersion
     */
    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public APIEnablement withResources(List<APIResource> resources) {
        this.resources = resources;
        return this;
    }

    public APIEnablement addResourcesItem(APIResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public APIEnablement withResources(Consumer<List<APIResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源类型、名称
     * @return resources
     */
    public List<APIResource> getResources() {
        return resources;
    }

    public void setResources(List<APIResource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        APIEnablement that = (APIEnablement) obj;
        return Objects.equals(this.groupVersion, that.groupVersion) && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupVersion, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class APIEnablement {\n");
        sb.append("    groupVersion: ").append(toIndentedString(groupVersion)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

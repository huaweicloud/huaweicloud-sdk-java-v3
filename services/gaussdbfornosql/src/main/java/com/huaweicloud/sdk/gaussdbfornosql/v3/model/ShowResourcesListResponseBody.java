package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowResourcesListResponseBody
 */
public class ShowResourcesListResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<ShowResourcesDetailResponseBody> resources = null;

    public ShowResourcesListResponseBody withResources(List<ShowResourcesDetailResponseBody> resources) {
        this.resources = resources;
        return this;
    }

    public ShowResourcesListResponseBody addResourcesItem(ShowResourcesDetailResponseBody resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ShowResourcesListResponseBody withResources(
        Consumer<List<ShowResourcesDetailResponseBody>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表对象
     * @return resources
     */
    public List<ShowResourcesDetailResponseBody> getResources() {
        return resources;
    }

    public void setResources(List<ShowResourcesDetailResponseBody> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResourcesListResponseBody showResourcesListResponseBody = (ShowResourcesListResponseBody) o;
        return Objects.equals(this.resources, showResourcesListResponseBody.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourcesListResponseBody {\n");
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

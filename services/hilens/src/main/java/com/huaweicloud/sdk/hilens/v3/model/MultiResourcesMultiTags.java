package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiResourcesMultiTags
 */
public class MultiResourcesMultiTags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<NodeResource> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<NodeTag> tags = null;

    public MultiResourcesMultiTags withResources(List<NodeResource> resources) {
        this.resources = resources;
        return this;
    }

    public MultiResourcesMultiTags addResourcesItem(NodeResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public MultiResourcesMultiTags withResources(Consumer<List<NodeResource>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 资源列表
     * @return resources
     */
    public List<NodeResource> getResources() {
        return resources;
    }

    public void setResources(List<NodeResource> resources) {
        this.resources = resources;
    }

    public MultiResourcesMultiTags withTags(List<NodeTag> tags) {
        this.tags = tags;
        return this;
    }

    public MultiResourcesMultiTags addTagsItem(NodeTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MultiResourcesMultiTags withTags(Consumer<List<NodeTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签列表
     * @return tags
     */
    public List<NodeTag> getTags() {
        return tags;
    }

    public void setTags(List<NodeTag> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiResourcesMultiTags multiResourcesMultiTags = (MultiResourcesMultiTags) o;
        return Objects.equals(this.resources, multiResourcesMultiTags.resources)
            && Objects.equals(this.tags, multiResourcesMultiTags.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiResourcesMultiTags {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

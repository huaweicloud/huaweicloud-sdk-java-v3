package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 路由表
 */
public class CreateRouteTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgp_options")

    private BgpOptions bgpOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    public CreateRouteTable withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 路由器表名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateRouteTable withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 路由器表描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateRouteTable withBgpOptions(BgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
        return this;
    }

    public CreateRouteTable withBgpOptions(Consumer<BgpOptions> bgpOptionsSetter) {
        if (this.bgpOptions == null) {
            this.bgpOptions = new BgpOptions();
            bgpOptionsSetter.accept(this.bgpOptions);
        }

        return this;
    }

    /**
     * Get bgpOptions
     * @return bgpOptions
     */
    public BgpOptions getBgpOptions() {
        return bgpOptions;
    }

    public void setBgpOptions(BgpOptions bgpOptions) {
        this.bgpOptions = bgpOptions;
    }

    public CreateRouteTable withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public CreateRouteTable addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateRouteTable withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 标签信息
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
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
        CreateRouteTable createRouteTable = (CreateRouteTable) o;
        return Objects.equals(this.name, createRouteTable.name)
            && Objects.equals(this.description, createRouteTable.description)
            && Objects.equals(this.bgpOptions, createRouteTable.bgpOptions)
            && Objects.equals(this.tags, createRouteTable.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, bgpOptions, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRouteTable {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bgpOptions: ").append(toIndentedString(bgpOptions)).append("\n");
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

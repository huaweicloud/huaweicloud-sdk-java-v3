package com.huaweicloud.sdk.ram.v1.model;

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
public class ListResourceShareTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagDTO> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoMarkerByKey pageInfo;

    public ListResourceShareTagsResponse withTags(List<TagDTO> tags) {
        this.tags = tags;
        return this;
    }

    public ListResourceShareTagsResponse addTagsItem(TagDTO tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListResourceShareTagsResponse withTags(Consumer<List<TagDTO>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 一个或多个标签键值对的列表。标签键必须存在，而不是空字符串。标签值必须存在，但可以是空字符串。
     * @return tags
     */
    public List<TagDTO> getTags() {
        return tags;
    }

    public void setTags(List<TagDTO> tags) {
        this.tags = tags;
    }

    public ListResourceShareTagsResponse withPageInfo(PageInfoMarkerByKey pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListResourceShareTagsResponse withPageInfo(Consumer<PageInfoMarkerByKey> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoMarkerByKey();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoMarkerByKey getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoMarkerByKey pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceShareTagsResponse listResourceShareTagsResponse = (ListResourceShareTagsResponse) o;
        return Objects.equals(this.tags, listResourceShareTagsResponse.tags)
            && Objects.equals(this.pageInfo, listResourceShareTagsResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceShareTagsResponse {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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

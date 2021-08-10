package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListPredefineTagsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<PredefineTag> tags = null;

    public ListPredefineTagsResponse withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 分页位置标识（索引）。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListPredefineTagsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 查询到的标签总数
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListPredefineTagsResponse withTags(List<PredefineTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListPredefineTagsResponse addTagsItem(PredefineTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListPredefineTagsResponse withTags(Consumer<List<PredefineTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 查询到的标签列表
     * 
     * @return tags */
    public List<PredefineTag> getTags() {
        return tags;
    }

    public void setTags(List<PredefineTag> tags) {
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
        ListPredefineTagsResponse listPredefineTagsResponse = (ListPredefineTagsResponse) o;
        return Objects.equals(this.marker, listPredefineTagsResponse.marker)
            && Objects.equals(this.totalCount, listPredefineTagsResponse.totalCount)
            && Objects.equals(this.tags, listPredefineTagsResponse.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marker, totalCount, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPredefineTagsResponse {\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

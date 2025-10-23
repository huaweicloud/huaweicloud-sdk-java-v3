package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListResourceCopiesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "copies")

    private List<ResourceCopyItem> copies = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_marker")

    private String nextMarker;

    public ListResourceCopiesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 副本总数
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListResourceCopiesResponse withCopies(List<ResourceCopyItem> copies) {
        this.copies = copies;
        return this;
    }

    public ListResourceCopiesResponse addCopiesItem(ResourceCopyItem copiesItem) {
        if (this.copies == null) {
            this.copies = new ArrayList<>();
        }
        this.copies.add(copiesItem);
        return this;
    }

    public ListResourceCopiesResponse withCopies(Consumer<List<ResourceCopyItem>> copiesSetter) {
        if (this.copies == null) {
            this.copies = new ArrayList<>();
        }
        copiesSetter.accept(this.copies);
        return this;
    }

    /**
     * 副本列表
     * @return copies
     */
    public List<ResourceCopyItem> getCopies() {
        return copies;
    }

    public void setCopies(List<ResourceCopyItem> copies) {
        this.copies = copies;
    }

    public ListResourceCopiesResponse withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * 下一页的marker
     * @return nextMarker
     */
    public String getNextMarker() {
        return nextMarker;
    }

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceCopiesResponse that = (ListResourceCopiesResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.copies, that.copies)
            && Objects.equals(this.nextMarker, that.nextMarker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, copies, nextMarker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceCopiesResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    copies: ").append(toIndentedString(copies)).append("\n");
        sb.append("    nextMarker: ").append(toIndentedString(nextMarker)).append("\n");
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

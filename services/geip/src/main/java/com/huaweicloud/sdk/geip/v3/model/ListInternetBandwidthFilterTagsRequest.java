package com.huaweicloud.sdk.geip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListInternetBandwidthFilterTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private List<Integer> limit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private List<Integer> offset = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListResourcesByTagsRequestBody body;

    public ListInternetBandwidthFilterTagsRequest withLimit(List<Integer> limit) {
        this.limit = limit;
        return this;
    }

    public ListInternetBandwidthFilterTagsRequest addLimitItem(Integer limitItem) {
        if (this.limit == null) {
            this.limit = new ArrayList<>();
        }
        this.limit.add(limitItem);
        return this;
    }

    public ListInternetBandwidthFilterTagsRequest withLimit(Consumer<List<Integer>> limitSetter) {
        if (this.limit == null) {
            this.limit = new ArrayList<>();
        }
        limitSetter.accept(this.limit);
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public List<Integer> getLimit() {
        return limit;
    }

    public void setLimit(List<Integer> limit) {
        this.limit = limit;
    }

    public ListInternetBandwidthFilterTagsRequest withOffset(List<Integer> offset) {
        this.offset = offset;
        return this;
    }

    public ListInternetBandwidthFilterTagsRequest addOffsetItem(Integer offsetItem) {
        if (this.offset == null) {
            this.offset = new ArrayList<>();
        }
        this.offset.add(offsetItem);
        return this;
    }

    public ListInternetBandwidthFilterTagsRequest withOffset(Consumer<List<Integer>> offsetSetter) {
        if (this.offset == null) {
            this.offset = new ArrayList<>();
        }
        offsetSetter.accept(this.offset);
        return this;
    }

    /**
     * Get offset
     * @return offset
     */
    public List<Integer> getOffset() {
        return offset;
    }

    public void setOffset(List<Integer> offset) {
        this.offset = offset;
    }

    public ListInternetBandwidthFilterTagsRequest withBody(ListResourcesByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListInternetBandwidthFilterTagsRequest withBody(Consumer<ListResourcesByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListResourcesByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListResourcesByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListResourcesByTagsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInternetBandwidthFilterTagsRequest that = (ListInternetBandwidthFilterTagsRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInternetBandwidthFilterTagsRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListResourceSharesByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ResourceSharesByTagsReqBody body;

    public ListResourceSharesByTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页页面的最大值。
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourceSharesByTagsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页标记。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListResourceSharesByTagsRequest withBody(ResourceSharesByTagsReqBody body) {
        this.body = body;
        return this;
    }

    public ListResourceSharesByTagsRequest withBody(Consumer<ResourceSharesByTagsReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new ResourceSharesByTagsReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ResourceSharesByTagsReqBody getBody() {
        return body;
    }

    public void setBody(ResourceSharesByTagsReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListResourceSharesByTagsRequest listResourceSharesByTagsRequest = (ListResourceSharesByTagsRequest) o;
        return Objects.equals(this.limit, listResourceSharesByTagsRequest.limit)
            && Objects.equals(this.offset, listResourceSharesByTagsRequest.offset)
            && Objects.equals(this.body, listResourceSharesByTagsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceSharesByTagsRequest {\n");
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

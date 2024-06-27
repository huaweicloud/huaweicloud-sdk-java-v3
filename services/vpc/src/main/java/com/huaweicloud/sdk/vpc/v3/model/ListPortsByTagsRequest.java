package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPortsByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListPortsByTagsRequestBody body;

    public ListPortsByTagsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：查询记录数 取值范围：1-1000 约束：默认为1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPortsByTagsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 功能说明：索引位置， 从第一条数据偏移offset条数据后开始查询 约束：默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPortsByTagsRequest withBody(ListPortsByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListPortsByTagsRequest withBody(Consumer<ListPortsByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListPortsByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListPortsByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListPortsByTagsRequestBody body) {
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
        ListPortsByTagsRequest that = (ListPortsByTagsRequest) obj;
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
        sb.append("class ListPortsByTagsRequest {\n");
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

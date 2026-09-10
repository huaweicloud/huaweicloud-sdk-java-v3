package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListSubNetworkInterfacesByTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListSubNetworkInterfacesByTagsRequestBody body;

    public ListSubNetworkInterfacesByTagsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**： 查询记录数。 **约束限制**： 不涉及。 **取值范围**： 1-1000 **默认取值**： 1000
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListSubNetworkInterfacesByTagsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**： 索引位置，从第一条数据偏移offset条数据后开始查询。 **约束限制**： 必须为数字，不能为负数。 **取值范围**： 不涉及。 **默认取值**： 默认为0（偏移0条数据，表示从第一条数据开始查询）。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSubNetworkInterfacesByTagsRequest withBody(ListSubNetworkInterfacesByTagsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListSubNetworkInterfacesByTagsRequest withBody(
        Consumer<ListSubNetworkInterfacesByTagsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListSubNetworkInterfacesByTagsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ListSubNetworkInterfacesByTagsRequestBody getBody() {
        return body;
    }

    public void setBody(ListSubNetworkInterfacesByTagsRequestBody body) {
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
        ListSubNetworkInterfacesByTagsRequest that = (ListSubNetworkInterfacesByTagsRequest) obj;
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
        sb.append("class ListSubNetworkInterfacesByTagsRequest {\n");
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

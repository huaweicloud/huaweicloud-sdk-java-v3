package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTagsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    @JacksonXmlProperty(localName = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    public ListTagsRequest withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /**
     * 标签名称
     * @return tagName
     */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ListTagsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListTagsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListTagsRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 标签状态，0未使用，1使用中。
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagsRequest listTagsRequest = (ListTagsRequest) o;
        return Objects.equals(this.tagName, listTagsRequest.tagName)
            && Objects.equals(this.limit, listTagsRequest.limit) && Objects.equals(this.offset, listTagsRequest.offset)
            && Objects.equals(this.status, listTagsRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tagName, limit, offset, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagsRequest {\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

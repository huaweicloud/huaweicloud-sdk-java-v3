package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListTagValuesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_store_id")

    private String dataStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_name")

    private String tagName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private String filters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTagValuesRequest withDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
        return this;
    }

    /** 存储ID
     * 
     * @return dataStoreId */
    public String getDataStoreId() {
        return dataStoreId;
    }

    public void setDataStoreId(String dataStoreId) {
        this.dataStoreId = dataStoreId;
    }

    public ListTagValuesRequest withTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    /** tag 名称
     * 
     * @return tagName */
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public ListTagValuesRequest withFilters(String filters) {
        this.filters = filters;
        return this;
    }

    /** 查询标签的值的过滤条件，例如: {\"deviceCategory\": \"class1\"}，注意特殊字符需要 urlencode
     * 
     * @return filters */
    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public ListTagValuesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询起始元素的偏移 minimum: 0 maximum: 2000
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTagValuesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 返回的元素列表大小限制,默认为 100 minimum: 1 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTagValuesRequest listTagValuesRequest = (ListTagValuesRequest) o;
        return Objects.equals(this.dataStoreId, listTagValuesRequest.dataStoreId)
            && Objects.equals(this.tagName, listTagValuesRequest.tagName)
            && Objects.equals(this.filters, listTagValuesRequest.filters)
            && Objects.equals(this.offset, listTagValuesRequest.offset)
            && Objects.equals(this.limit, listTagValuesRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataStoreId, tagName, filters, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagValuesRequest {\n");
        sb.append("    dataStoreId: ").append(toIndentedString(dataStoreId)).append("\n");
        sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

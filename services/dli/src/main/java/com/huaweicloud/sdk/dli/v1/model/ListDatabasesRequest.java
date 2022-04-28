package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDatabasesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with-priv")

    private Boolean withPriv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private String tags;

    public ListDatabasesRequest withWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
        return this;
    }

    /**
     * 是否返回隐私信息
     * @return withPriv
     */
    public Boolean getWithPriv() {
        return withPriv;
    }

    public void setWithPriv(Boolean withPriv) {
        this.withPriv = withPriv;
    }

    public ListDatabasesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListDatabasesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListDatabasesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 过滤关键字
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListDatabasesRequest withTags(String tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 标签过滤
     * @return tags
     */
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
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
        ListDatabasesRequest listDatabasesRequest = (ListDatabasesRequest) o;
        return Objects.equals(this.withPriv, listDatabasesRequest.withPriv)
            && Objects.equals(this.offset, listDatabasesRequest.offset)
            && Objects.equals(this.limit, listDatabasesRequest.limit)
            && Objects.equals(this.keyword, listDatabasesRequest.keyword)
            && Objects.equals(this.tags, listDatabasesRequest.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withPriv, offset, limit, keyword, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabasesRequest {\n");
        sb.append("    withPriv: ").append(toIndentedString(withPriv)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

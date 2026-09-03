package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSharedConnectionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cur_page")

    private String curPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private String perPage;

    public ListSharedConnectionsRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ListSharedConnectionsRequest withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 搜索关键字
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public ListSharedConnectionsRequest withCurPage(String curPage) {
        this.curPage = curPage;
        return this;
    }

    /**
     * 当前页码
     * @return curPage
     */
    public String getCurPage() {
        return curPage;
    }

    public void setCurPage(String curPage) {
        this.curPage = curPage;
    }

    public ListSharedConnectionsRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页记录数
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSharedConnectionsRequest that = (ListSharedConnectionsRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.curPage, that.curPage) && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, keywords, curPage, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSharedConnectionsRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    curPage: ").append(toIndentedString(curPage)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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

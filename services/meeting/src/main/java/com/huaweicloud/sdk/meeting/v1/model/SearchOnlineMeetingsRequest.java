package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SearchOnlineMeetingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    @JacksonXmlProperty(localName = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryAll")

    @JacksonXmlProperty(localName = "queryAll")

    private Boolean queryAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    @JacksonXmlProperty(localName = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    @JacksonXmlProperty(localName = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    @JacksonXmlProperty(localName = "X-Site-Id")

    private String xSiteId;

    public SearchOnlineMeetingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户UUID。 仅管理员有权限查询权限范围内的所有帐号，普通帐号仅能查询自己的。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public SearchOnlineMeetingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 指定返回的记录索引。该值必须大于等于0； 默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchOnlineMeetingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定返回的记录数。默认是20，最大值为500。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchOnlineMeetingsRequest withQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    /**
     * 指定是否查询企业下所有用户的会议记录。 如果登录帐号不是企业管理员，则该字段无效。 如果该字段为true，则userUUID字段无效。 default : false
     * @return queryAll
     */
    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    public SearchOnlineMeetingsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 查询用来当作关键词的字符串。会议主题、会议预约人和会议ID等可作为搜索内容。
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchOnlineMeetingsRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /**
     * 标识是否为第三方portal过来的请求。
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public SearchOnlineMeetingsRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /**
     * 用于区分到哪个HCSO站点鉴权。
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchOnlineMeetingsRequest searchOnlineMeetingsRequest = (SearchOnlineMeetingsRequest) o;
        return Objects.equals(this.userUUID, searchOnlineMeetingsRequest.userUUID)
            && Objects.equals(this.offset, searchOnlineMeetingsRequest.offset)
            && Objects.equals(this.limit, searchOnlineMeetingsRequest.limit)
            && Objects.equals(this.queryAll, searchOnlineMeetingsRequest.queryAll)
            && Objects.equals(this.searchKey, searchOnlineMeetingsRequest.searchKey)
            && Objects.equals(this.xAuthorizationType, searchOnlineMeetingsRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, searchOnlineMeetingsRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUUID, offset, limit, queryAll, searchKey, xAuthorizationType, xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchOnlineMeetingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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

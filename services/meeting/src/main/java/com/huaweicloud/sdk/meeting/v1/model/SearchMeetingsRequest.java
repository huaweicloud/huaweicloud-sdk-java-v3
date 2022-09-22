package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SearchMeetingsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryAll")

    private Boolean queryAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryConfMode")

    private String queryConfMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortType")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    private String xSiteId;

    public SearchMeetingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户的UUID。 > 仅管理员有权限查询本企业其他用户的会议列表；普通帐号该字段无效，只能查询自己的。 
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public SearchMeetingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量。默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchMeetingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量。默认是20，最大500条。
     * minimum: 0
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchMeetingsRequest withQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    /**
     * 是否查询企业下所有用户的会议记录。默认值为false。 * true：查询所有用户的会议 * false：仅查询管理员自己创建的会议 > 仅对企业管理员生效。
     * @return queryAll
     */
    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    public SearchMeetingsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 查询条件。会议主题、会议预约人和会议ID等可作为搜索内容。长度限制为1-128个字符。
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchMeetingsRequest withQueryConfMode(String queryConfMode) {
        this.queryConfMode = queryConfMode;
        return this;
    }

    /**
     * 查询时间范围。 - ADAY:  一天 - AWEEK:  一周 - AMONTH:  一个月 - ALL:  查询所有
     * @return queryConfMode
     */
    public String getQueryConfMode() {
        return queryConfMode;
    }

    public void setQueryConfMode(String queryConfMode) {
        this.queryConfMode = queryConfMode;
    }

    public SearchMeetingsRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 查询结果排序。 - ASC_StartTIME:  按会议开始时间升序排序 - DSC_StartTIME:  按会议开始时间降序排序
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public SearchMeetingsRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /**
     * 标识是否为第三方portal过来的请求。 > 该参数将废弃，请勿使用。 
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

    public SearchMeetingsRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /**
     * 用于区分到哪个HCSO站点鉴权。 > 该参数将废弃，请勿使用。 
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
        SearchMeetingsRequest searchMeetingsRequest = (SearchMeetingsRequest) o;
        return Objects.equals(this.userUUID, searchMeetingsRequest.userUUID)
            && Objects.equals(this.offset, searchMeetingsRequest.offset)
            && Objects.equals(this.limit, searchMeetingsRequest.limit)
            && Objects.equals(this.queryAll, searchMeetingsRequest.queryAll)
            && Objects.equals(this.searchKey, searchMeetingsRequest.searchKey)
            && Objects.equals(this.queryConfMode, searchMeetingsRequest.queryConfMode)
            && Objects.equals(this.sortType, searchMeetingsRequest.sortType)
            && Objects.equals(this.xAuthorizationType, searchMeetingsRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, searchMeetingsRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(userUUID, offset, limit, queryAll, searchKey, queryConfMode, sortType, xAuthorizationType, xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchMeetingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    queryConfMode: ").append(toIndentedString(queryConfMode)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
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

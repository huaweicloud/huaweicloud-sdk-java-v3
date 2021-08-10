package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class SearchRecordingsRequest {

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
    @JsonProperty(value = "startDate")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortType")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    private String xSiteId;

    public SearchRecordingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /** 待查询的会议预定者的用户UUID。仅管理员有权限查询权限范围内的所有录制，普通帐号仅能查询自己的。 默认是登录帐号。
     * 
     * @return userUUID */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public SearchRecordingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 指定返回的页面索引。该值必须大于0。 default: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchRecordingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 指定返回的记录数。默认值为20，最大值为100。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchRecordingsRequest withQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    /** 指定是否查询企业下所有用户的会议录制。 - 如果登录帐号不是企业管理员，则该字段无效。 - 如果该字段为true，则userUUID字段无效。
     * 
     * @return queryAll */
    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    public SearchRecordingsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /** 会议主题，预定人或会议id可作为搜索词，查询录制。
     * 
     * @return searchKey */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchRecordingsRequest withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /** 查询的起始日期毫秒数。
     * 
     * @return startDate */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SearchRecordingsRequest withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /** 查询的截止日期毫秒数。
     * 
     * @return endDate */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SearchRecordingsRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /** - ASC_StartTIME：按录制开始时间升序排序。 - DSC_StartTIME：按录制开始时间降序排序。
     * 
     * @return sortType */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public SearchRecordingsRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /** 标识是否为第三方portal过来的请求。
     * 
     * @return xAuthorizationType */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public SearchRecordingsRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /** 用于区分到哪个HCSO站点鉴权。
     * 
     * @return xSiteId */
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
        SearchRecordingsRequest searchRecordingsRequest = (SearchRecordingsRequest) o;
        return Objects.equals(this.userUUID, searchRecordingsRequest.userUUID)
            && Objects.equals(this.offset, searchRecordingsRequest.offset)
            && Objects.equals(this.limit, searchRecordingsRequest.limit)
            && Objects.equals(this.queryAll, searchRecordingsRequest.queryAll)
            && Objects.equals(this.searchKey, searchRecordingsRequest.searchKey)
            && Objects.equals(this.startDate, searchRecordingsRequest.startDate)
            && Objects.equals(this.endDate, searchRecordingsRequest.endDate)
            && Objects.equals(this.sortType, searchRecordingsRequest.sortType)
            && Objects.equals(this.xAuthorizationType, searchRecordingsRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, searchRecordingsRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUUID,
            offset,
            limit,
            queryAll,
            searchKey,
            startDate,
            endDate,
            sortType,
            xAuthorizationType,
            xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchRecordingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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

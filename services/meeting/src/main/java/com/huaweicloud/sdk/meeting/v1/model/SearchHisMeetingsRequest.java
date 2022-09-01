package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class SearchHisMeetingsRequest {

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
    @JsonProperty(value = "searchKey")

    @JacksonXmlProperty(localName = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryAll")

    @JacksonXmlProperty(localName = "queryAll")

    private Boolean queryAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startDate")

    @JacksonXmlProperty(localName = "startDate")

    private Long startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endDate")

    @JacksonXmlProperty(localName = "endDate")

    private Long endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortType")

    @JacksonXmlProperty(localName = "sortType")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    @JacksonXmlProperty(localName = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    @JacksonXmlProperty(localName = "X-Site-Id")

    private String xSiteId;

    public SearchHisMeetingsRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户UUID。 管理员有权限查询权限范围内的所有帐号，普通帐号仅能查询自己的。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public SearchHisMeetingsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 指定返回的与会者列表的记录索引。该值必须大于等于0； 默认为0。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchHisMeetingsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 指定返回的记录数。默认值为20，最大值为500。 当pageSize大于最大值500时，系统会默认设置为500。
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

    public SearchHisMeetingsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 根据会议主题，预定人和会议id关键词的字符串，查询历史会议。
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchHisMeetingsRequest withQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
        return this;
    }

    /**
     * 指定是否查询企业下所有用户的会议记录，如果登录帐号不是企业管理员，则该字段无效。如果该字段为true，则userUUID字段无效。 default: false
     * @return queryAll
     */
    public Boolean getQueryAll() {
        return queryAll;
    }

    public void setQueryAll(Boolean queryAll) {
        this.queryAll = queryAll;
    }

    public SearchHisMeetingsRequest withStartDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 查询的起始日期毫秒数。例如：1583078400000
     * @return startDate
     */
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public SearchHisMeetingsRequest withEndDate(Long endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 查询的截止日期毫秒数。例如：1585756799000
     * @return endDate
     */
    public Long getEndDate() {
        return endDate;
    }

    public void setEndDate(Long endDate) {
        this.endDate = endDate;
    }

    public SearchHisMeetingsRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * - ASC_StartTIME：根据会议开始时间升序排序。 - DSC_StartTIME：根据会议开始时间降序排序。 - ASC_RecordTYPE：根据是否具有录播文件排序，之后默认按照会议开始时间升序排序。 - DSC_RecordTYPE：根据是否含有录播文件排序，之后默认按照会议开始时间降序排序。
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public SearchHisMeetingsRequest withXAuthorizationType(String xAuthorizationType) {
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

    public SearchHisMeetingsRequest withXSiteId(String xSiteId) {
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
        SearchHisMeetingsRequest searchHisMeetingsRequest = (SearchHisMeetingsRequest) o;
        return Objects.equals(this.userUUID, searchHisMeetingsRequest.userUUID)
            && Objects.equals(this.offset, searchHisMeetingsRequest.offset)
            && Objects.equals(this.limit, searchHisMeetingsRequest.limit)
            && Objects.equals(this.searchKey, searchHisMeetingsRequest.searchKey)
            && Objects.equals(this.queryAll, searchHisMeetingsRequest.queryAll)
            && Objects.equals(this.startDate, searchHisMeetingsRequest.startDate)
            && Objects.equals(this.endDate, searchHisMeetingsRequest.endDate)
            && Objects.equals(this.sortType, searchHisMeetingsRequest.sortType)
            && Objects.equals(this.xAuthorizationType, searchHisMeetingsRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, searchHisMeetingsRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUUID,
            offset,
            limit,
            searchKey,
            queryAll,
            startDate,
            endDate,
            sortType,
            xAuthorizationType,
            xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchHisMeetingsRequest {\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    queryAll: ").append(toIndentedString(queryAll)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

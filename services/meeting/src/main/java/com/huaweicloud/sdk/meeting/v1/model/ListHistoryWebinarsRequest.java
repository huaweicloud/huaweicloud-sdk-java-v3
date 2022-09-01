package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHistoryWebinarsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    @JacksonXmlProperty(localName = "X-Request-Id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    @JacksonXmlProperty(localName = "Accept-Language")

    private String acceptLanguage;

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
    @JsonProperty(value = "sortType")

    @JacksonXmlProperty(localName = "sortType")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    @JacksonXmlProperty(localName = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    @JacksonXmlProperty(localName = "endTime")

    private String endTime;

    public ListHistoryWebinarsRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public ListHistoryWebinarsRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /**
     * 语言参数，默认为中文zh-CN, 英文为en-US
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public ListHistoryWebinarsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询偏移量,若超过最大数量，则返回最后一页的数据 默认值：0 
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListHistoryWebinarsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数量 默认值：0 
     * minimum: 1
     * maximum: 500
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListHistoryWebinarsRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /**
     * 搜索条件。支持账号、姓名、手机、邮箱模糊搜索
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public ListHistoryWebinarsRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * ASC_StartTIME：按会议开始时间升序排序。DSC_StartTIME：按会议开始时间降序排序
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public ListHistoryWebinarsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间, 格式：yyyy-MM-dd HH:mm。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListHistoryWebinarsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间, 格式：yyyy-MM-dd HH:mm。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryWebinarsRequest listHistoryWebinarsRequest = (ListHistoryWebinarsRequest) o;
        return Objects.equals(this.xRequestId, listHistoryWebinarsRequest.xRequestId)
            && Objects.equals(this.acceptLanguage, listHistoryWebinarsRequest.acceptLanguage)
            && Objects.equals(this.offset, listHistoryWebinarsRequest.offset)
            && Objects.equals(this.limit, listHistoryWebinarsRequest.limit)
            && Objects.equals(this.searchKey, listHistoryWebinarsRequest.searchKey)
            && Objects.equals(this.sortType, listHistoryWebinarsRequest.sortType)
            && Objects.equals(this.startTime, listHistoryWebinarsRequest.startTime)
            && Objects.equals(this.endTime, listHistoryWebinarsRequest.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, offset, limit, searchKey, sortType, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryWebinarsRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

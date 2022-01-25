package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class SearchCorpResourcesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    private String acceptLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    private String searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startExpireDate")

    private Long startExpireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endExpireDate")

    private Long endExpireDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vmrMode")

    private Integer vmrMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "typeId")

    private String typeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderId")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public SearchCorpResourcesRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public SearchCorpResourcesRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** 语言参数，默认为中文zh-CN, 英文为en-US
     * 
     * @return acceptLanguage */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public SearchCorpResourcesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 查询偏移量,若超过最大数量，则返回最后一页的数据 默认值：0 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchCorpResourcesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 查询数量 默认值：0 minimum: 1 maximum: 500
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public SearchCorpResourcesRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    /** 搜索条件，支持resourceId模糊查询。
     * 
     * @return searchKey */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public SearchCorpResourcesRequest withStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
        return this;
    }

    /** 查询过期时间在该时间戳之后的资源项
     * 
     * @return startExpireDate */
    public Long getStartExpireDate() {
        return startExpireDate;
    }

    public void setStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
    }

    public SearchCorpResourcesRequest withEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
        return this;
    }

    /** 查询过期时间在该时间戳之前的资源项
     * 
     * @return endExpireDate */
    public Long getEndExpireDate() {
        return endExpireDate;
    }

    public void setEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
    }

    public SearchCorpResourcesRequest withType(String type) {
        this.type = type;
        return this;
    }

    /** 资源类型。 - VMR - 云会议室 - CONF_CALL - 会议并发数 - HARD_1080P - 1080P硬终端 - HARD_720P - 720P硬终端 - SOFT - 软终端用户数 - ROOM -
     * 大屏软终端 - LIVE - 直播推流 - RECORD - 录播空间 - HARD_THIRD_PARTY - 第三方硬终端账号 - HUAWEI_VISION -智慧屏 说明：查询网络研讨会资源时type字段需上送VMR
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SearchCorpResourcesRequest withVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
        return this;
    }

    /** VMR模式，type为vmr时传递该参数 * 0：个人会议ID * 1：云会议室 * 2：网络研讨会 minimum: 1 maximum: 2
     * 
     * @return vmrMode */
    public Integer getVmrMode() {
        return vmrMode;
    }

    public void setVmrMode(Integer vmrMode) {
        this.vmrMode = vmrMode;
    }

    public SearchCorpResourcesRequest withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    /** 资源类型Id,若想搜索5方VMR时，需携带5方vmrpkg对应的id
     * 
     * @return typeId */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public SearchCorpResourcesRequest withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单Id
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SearchCorpResourcesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 订单状态。 - 0：正常 - 1：到期 - 2：停用 minimum: 0 maximum: 2
     * 
     * @return status */
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
        SearchCorpResourcesRequest searchCorpResourcesRequest = (SearchCorpResourcesRequest) o;
        return Objects.equals(this.xRequestId, searchCorpResourcesRequest.xRequestId)
            && Objects.equals(this.acceptLanguage, searchCorpResourcesRequest.acceptLanguage)
            && Objects.equals(this.offset, searchCorpResourcesRequest.offset)
            && Objects.equals(this.limit, searchCorpResourcesRequest.limit)
            && Objects.equals(this.searchKey, searchCorpResourcesRequest.searchKey)
            && Objects.equals(this.startExpireDate, searchCorpResourcesRequest.startExpireDate)
            && Objects.equals(this.endExpireDate, searchCorpResourcesRequest.endExpireDate)
            && Objects.equals(this.type, searchCorpResourcesRequest.type)
            && Objects.equals(this.vmrMode, searchCorpResourcesRequest.vmrMode)
            && Objects.equals(this.typeId, searchCorpResourcesRequest.typeId)
            && Objects.equals(this.orderId, searchCorpResourcesRequest.orderId)
            && Objects.equals(this.status, searchCorpResourcesRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId,
            acceptLanguage,
            offset,
            limit,
            searchKey,
            startExpireDate,
            endExpireDate,
            type,
            vmrMode,
            typeId,
            orderId,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCorpResourcesRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    startExpireDate: ").append(toIndentedString(startExpireDate)).append("\n");
        sb.append("    endExpireDate: ").append(toIndentedString(endExpireDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vmrMode: ").append(toIndentedString(vmrMode)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

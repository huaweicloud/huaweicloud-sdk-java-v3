package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SearchResourceRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="corp_id")
    
    private String corpId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startExpireDate")
    
    private Long startExpireDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endExpireDate")
    
    private Long endExpireDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="typeId")
    
    private String typeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;

    public SearchResourceRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    

    public SearchResourceRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * 语言参数，默认为中文zh_CN, 英文为en_US
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    

    public SearchResourceRequest withOffset(Integer offset) {
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

    

    public SearchResourceRequest withLimit(Integer limit) {
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

    

    public SearchResourceRequest withSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    


    /**
     * 搜索条件
     * @return searchKey
     */
    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    

    public SearchResourceRequest withCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }

    


    /**
     * 企业id
     * @return corpId
     */
    public String getCorpId() {
        return corpId;
    }

    public void setCorpId(String corpId) {
        this.corpId = corpId;
    }

    

    public SearchResourceRequest withStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
        return this;
    }

    


    /**
     * 查询过期时间在该时间戳之后的资源项
     * @return startExpireDate
     */
    public Long getStartExpireDate() {
        return startExpireDate;
    }

    public void setStartExpireDate(Long startExpireDate) {
        this.startExpireDate = startExpireDate;
    }

    

    public SearchResourceRequest withEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
        return this;
    }

    


    /**
     * 查询过期时间在该时间戳之前的资源项
     * @return endExpireDate
     */
    public Long getEndExpireDate() {
        return endExpireDate;
    }

    public void setEndExpireDate(Long endExpireDate) {
        this.endExpireDate = endExpireDate;
    }

    

    public SearchResourceRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 资源类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public SearchResourceRequest withTypeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    


    /**
     * 资源类型Id,若想搜索5方VMR时，需携带5方vmrpkg对应的id
     * @return typeId
     */
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    

    public SearchResourceRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 订单状态: - 0：正常 - 1：到期，仅查询时返回 - 2：停用
     * minimum: 0
     * maximum: 2
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
        SearchResourceRequest searchResourceRequest = (SearchResourceRequest) o;
        return Objects.equals(this.xRequestId, searchResourceRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, searchResourceRequest.acceptLanguage) &&
            Objects.equals(this.offset, searchResourceRequest.offset) &&
            Objects.equals(this.limit, searchResourceRequest.limit) &&
            Objects.equals(this.searchKey, searchResourceRequest.searchKey) &&
            Objects.equals(this.corpId, searchResourceRequest.corpId) &&
            Objects.equals(this.startExpireDate, searchResourceRequest.startExpireDate) &&
            Objects.equals(this.endExpireDate, searchResourceRequest.endExpireDate) &&
            Objects.equals(this.type, searchResourceRequest.type) &&
            Objects.equals(this.typeId, searchResourceRequest.typeId) &&
            Objects.equals(this.status, searchResourceRequest.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, offset, limit, searchKey, corpId, startExpireDate, endExpireDate, type, typeId, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    startExpireDate: ").append(toIndentedString(startExpireDate)).append("\n");
        sb.append("    endExpireDate: ").append(toIndentedString(endExpireDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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


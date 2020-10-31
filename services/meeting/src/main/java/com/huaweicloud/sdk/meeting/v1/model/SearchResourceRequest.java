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
    
    private Integer offset = 0;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit = 100;


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
     * Get xRequestId
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
     * Get acceptLanguage
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
     * Get offset
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
     * Get limit
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
     * Get searchKey
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
     * Get corpId
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
     * Get startExpireDate
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
     * Get endExpireDate
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
     * Get type
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
     * Get typeId
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
     * Get status
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


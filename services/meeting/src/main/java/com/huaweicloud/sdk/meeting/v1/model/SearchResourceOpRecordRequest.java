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
public class SearchResourceOpRecordRequest  {



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
    @JsonProperty(value="startOperateDate")
    
    private Long startOperateDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endOperateDate")
    
    private Long endOperateDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="typeId")
    
    private String typeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operateType")
    
    private Integer operateType;

    public SearchResourceOpRecordRequest withXRequestId(String xRequestId) {
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

    

    public SearchResourceOpRecordRequest withAcceptLanguage(String acceptLanguage) {
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

    

    public SearchResourceOpRecordRequest withOffset(Integer offset) {
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

    

    public SearchResourceOpRecordRequest withLimit(Integer limit) {
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

    

    public SearchResourceOpRecordRequest withSearchKey(String searchKey) {
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

    

    public SearchResourceOpRecordRequest withCorpId(String corpId) {
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

    

    public SearchResourceOpRecordRequest withStartExpireDate(Long startExpireDate) {
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

    

    public SearchResourceOpRecordRequest withEndExpireDate(Long endExpireDate) {
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

    

    public SearchResourceOpRecordRequest withStartOperateDate(Long startOperateDate) {
        this.startOperateDate = startOperateDate;
        return this;
    }

    


    /**
     * Get startOperateDate
     * @return startOperateDate
     */
    public Long getStartOperateDate() {
        return startOperateDate;
    }

    public void setStartOperateDate(Long startOperateDate) {
        this.startOperateDate = startOperateDate;
    }

    

    public SearchResourceOpRecordRequest withEndOperateDate(Long endOperateDate) {
        this.endOperateDate = endOperateDate;
        return this;
    }

    


    /**
     * Get endOperateDate
     * @return endOperateDate
     */
    public Long getEndOperateDate() {
        return endOperateDate;
    }

    public void setEndOperateDate(Long endOperateDate) {
        this.endOperateDate = endOperateDate;
    }

    

    public SearchResourceOpRecordRequest withType(String type) {
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

    

    public SearchResourceOpRecordRequest withTypeId(String typeId) {
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

    

    public SearchResourceOpRecordRequest withOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }

    


    /**
     * Get operateType
     * minimum: 0
     * maximum: 4
     * @return operateType
     */
    public Integer getOperateType() {
        return operateType;
    }

    public void setOperateType(Integer operateType) {
        this.operateType = operateType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResourceOpRecordRequest searchResourceOpRecordRequest = (SearchResourceOpRecordRequest) o;
        return Objects.equals(this.xRequestId, searchResourceOpRecordRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, searchResourceOpRecordRequest.acceptLanguage) &&
            Objects.equals(this.offset, searchResourceOpRecordRequest.offset) &&
            Objects.equals(this.limit, searchResourceOpRecordRequest.limit) &&
            Objects.equals(this.searchKey, searchResourceOpRecordRequest.searchKey) &&
            Objects.equals(this.corpId, searchResourceOpRecordRequest.corpId) &&
            Objects.equals(this.startExpireDate, searchResourceOpRecordRequest.startExpireDate) &&
            Objects.equals(this.endExpireDate, searchResourceOpRecordRequest.endExpireDate) &&
            Objects.equals(this.startOperateDate, searchResourceOpRecordRequest.startOperateDate) &&
            Objects.equals(this.endOperateDate, searchResourceOpRecordRequest.endOperateDate) &&
            Objects.equals(this.type, searchResourceOpRecordRequest.type) &&
            Objects.equals(this.typeId, searchResourceOpRecordRequest.typeId) &&
            Objects.equals(this.operateType, searchResourceOpRecordRequest.operateType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, offset, limit, searchKey, corpId, startExpireDate, endExpireDate, startOperateDate, endOperateDate, type, typeId, operateType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResourceOpRecordRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    corpId: ").append(toIndentedString(corpId)).append("\n");
        sb.append("    startExpireDate: ").append(toIndentedString(startExpireDate)).append("\n");
        sb.append("    endExpireDate: ").append(toIndentedString(endExpireDate)).append("\n");
        sb.append("    startOperateDate: ").append(toIndentedString(startOperateDate)).append("\n");
        sb.append("    endOperateDate: ").append(toIndentedString(endOperateDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
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


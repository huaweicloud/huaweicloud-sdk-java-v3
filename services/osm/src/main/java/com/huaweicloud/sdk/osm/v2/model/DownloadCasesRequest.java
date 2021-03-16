package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DownloadCasesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="language")
    
    private String language;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="timezone")
    
    private String timezone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_id")
    
    private String incidentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_start_time")
    
    private String queryStartTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_end_time")
    
    private String queryEndTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_customer_name")
    
    private String xCustomerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_key")
    
    private String searchKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_source_id_list")
    
    private List<String> tenantSourceIdList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sub_customer_id")
    
    private String subCustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    
    private Integer xSite;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    
    private String xTimeZone;

    public DownloadCasesRequest withLanguage(String language) {
        this.language = language;
        return this;
    }

    


    /**
     * Get language
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    

    public DownloadCasesRequest withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    


    /**
     * Get timezone
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    

    public DownloadCasesRequest withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    


    /**
     * Get incidentId
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    

    public DownloadCasesRequest withQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    


    /**
     * Get queryStartTime
     * @return queryStartTime
     */
    public String getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    

    public DownloadCasesRequest withQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    


    /**
     * Get queryEndTime
     * @return queryEndTime
     */
    public String getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    

    public DownloadCasesRequest withXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
        return this;
    }

    


    /**
     * Get xCustomerName
     * @return xCustomerName
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_customer_name")
    public String getXCustomerName() {
        return xCustomerName;
    }

    public void setXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
    }

    

    public DownloadCasesRequest withSearchKey(String searchKey) {
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

    

    public DownloadCasesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * minimum: 0
     * maximum: 20
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    

    public DownloadCasesRequest withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * Get customerId
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    

    public DownloadCasesRequest withTenantSourceIdList(List<String> tenantSourceIdList) {
        this.tenantSourceIdList = tenantSourceIdList;
        return this;
    }

    
    public DownloadCasesRequest addTenantSourceIdListItem(String tenantSourceIdListItem) {
        this.tenantSourceIdList.add(tenantSourceIdListItem);
        return this;
    }

    public DownloadCasesRequest withTenantSourceIdList(Consumer<List<String>> tenantSourceIdListSetter) {
        if(this.tenantSourceIdList == null ){
            this.tenantSourceIdList = new ArrayList<>();
        }
        tenantSourceIdListSetter.accept(this.tenantSourceIdList);
        return this;
    }

    /**
     * Get tenantSourceIdList
     * @return tenantSourceIdList
     */
    public List<String> getTenantSourceIdList() {
        return tenantSourceIdList;
    }

    public void setTenantSourceIdList(List<String> tenantSourceIdList) {
        this.tenantSourceIdList = tenantSourceIdList;
    }

    

    public DownloadCasesRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    


    /**
     * Get subCustomerId
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    

    public DownloadCasesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public DownloadCasesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public DownloadCasesRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    


    /**
     * Get xSite
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    

    public DownloadCasesRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    

    public DownloadCasesRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    


    /**
     * Get xTimeZone
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DownloadCasesRequest downloadCasesRequest = (DownloadCasesRequest) o;
        return Objects.equals(this.language, downloadCasesRequest.language) &&
            Objects.equals(this.timezone, downloadCasesRequest.timezone) &&
            Objects.equals(this.incidentId, downloadCasesRequest.incidentId) &&
            Objects.equals(this.queryStartTime, downloadCasesRequest.queryStartTime) &&
            Objects.equals(this.queryEndTime, downloadCasesRequest.queryEndTime) &&
            Objects.equals(this.xCustomerName, downloadCasesRequest.xCustomerName) &&
            Objects.equals(this.searchKey, downloadCasesRequest.searchKey) &&
            Objects.equals(this.status, downloadCasesRequest.status) &&
            Objects.equals(this.customerId, downloadCasesRequest.customerId) &&
            Objects.equals(this.tenantSourceIdList, downloadCasesRequest.tenantSourceIdList) &&
            Objects.equals(this.subCustomerId, downloadCasesRequest.subCustomerId) &&
            Objects.equals(this.offset, downloadCasesRequest.offset) &&
            Objects.equals(this.limit, downloadCasesRequest.limit) &&
            Objects.equals(this.xSite, downloadCasesRequest.xSite) &&
            Objects.equals(this.xLanguage, downloadCasesRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, downloadCasesRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(language, timezone, incidentId, queryStartTime, queryEndTime, xCustomerName, searchKey, status, customerId, tenantSourceIdList, subCustomerId, offset, limit, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadCasesRequest {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    xCustomerName: ").append(toIndentedString(xCustomerName)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    tenantSourceIdList: ").append(toIndentedString(tenantSourceIdList)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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


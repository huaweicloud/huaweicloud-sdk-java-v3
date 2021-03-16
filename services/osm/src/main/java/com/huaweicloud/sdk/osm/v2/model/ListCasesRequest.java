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
public class ListCasesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search_key")
    
    private List<String> searchKey = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label_id_list")
    
    private List<String> labelIdList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_key")
    
    private String appKey;


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
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_status")
    
    private String incidentStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_customer_id")
    
    private String xCustomerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_customer_name")
    
    private String xCustomerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


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

    public ListCasesRequest withSearchKey(List<String> searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    
    public ListCasesRequest addSearchKeyItem(String searchKeyItem) {
        this.searchKey.add(searchKeyItem);
        return this;
    }

    public ListCasesRequest withSearchKey(Consumer<List<String>> searchKeySetter) {
        if(this.searchKey == null ){
            this.searchKey = new ArrayList<>();
        }
        searchKeySetter.accept(this.searchKey);
        return this;
    }

    /**
     * Get searchKey
     * @return searchKey
     */
    public List<String> getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(List<String> searchKey) {
        this.searchKey = searchKey;
    }

    

    public ListCasesRequest withLabelIdList(List<String> labelIdList) {
        this.labelIdList = labelIdList;
        return this;
    }

    
    public ListCasesRequest addLabelIdListItem(String labelIdListItem) {
        this.labelIdList.add(labelIdListItem);
        return this;
    }

    public ListCasesRequest withLabelIdList(Consumer<List<String>> labelIdListSetter) {
        if(this.labelIdList == null ){
            this.labelIdList = new ArrayList<>();
        }
        labelIdListSetter.accept(this.labelIdList);
        return this;
    }

    /**
     * Get labelIdList
     * @return labelIdList
     */
    public List<String> getLabelIdList() {
        return labelIdList;
    }

    public void setLabelIdList(List<String> labelIdList) {
        this.labelIdList = labelIdList;
    }

    

    public ListCasesRequest withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    


    /**
     * Get appKey
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    

    public ListCasesRequest withIncidentId(String incidentId) {
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

    

    public ListCasesRequest withQueryStartTime(String queryStartTime) {
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

    

    public ListCasesRequest withQueryEndTime(String queryEndTime) {
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

    

    public ListCasesRequest withStatus(Integer status) {
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

    

    public ListCasesRequest withIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }

    


    /**
     * Get incidentStatus
     * @return incidentStatus
     */
    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    

    public ListCasesRequest withXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
        return this;
    }

    


    /**
     * Get xCustomerId
     * @return xCustomerId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="x_customer_id")
    public String getXCustomerId() {
        return xCustomerId;
    }

    public void setXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
    }

    

    public ListCasesRequest withXCustomerName(String xCustomerName) {
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

    

    public ListCasesRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ListCasesRequest withOffset(Integer offset) {
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

    

    public ListCasesRequest withLimit(Integer limit) {
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

    

    public ListCasesRequest withXSite(Integer xSite) {
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

    

    public ListCasesRequest withXLanguage(String xLanguage) {
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

    

    public ListCasesRequest withXTimeZone(String xTimeZone) {
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
        ListCasesRequest listCasesRequest = (ListCasesRequest) o;
        return Objects.equals(this.searchKey, listCasesRequest.searchKey) &&
            Objects.equals(this.labelIdList, listCasesRequest.labelIdList) &&
            Objects.equals(this.appKey, listCasesRequest.appKey) &&
            Objects.equals(this.incidentId, listCasesRequest.incidentId) &&
            Objects.equals(this.queryStartTime, listCasesRequest.queryStartTime) &&
            Objects.equals(this.queryEndTime, listCasesRequest.queryEndTime) &&
            Objects.equals(this.status, listCasesRequest.status) &&
            Objects.equals(this.incidentStatus, listCasesRequest.incidentStatus) &&
            Objects.equals(this.xCustomerId, listCasesRequest.xCustomerId) &&
            Objects.equals(this.xCustomerName, listCasesRequest.xCustomerName) &&
            Objects.equals(this.groupId, listCasesRequest.groupId) &&
            Objects.equals(this.offset, listCasesRequest.offset) &&
            Objects.equals(this.limit, listCasesRequest.limit) &&
            Objects.equals(this.xSite, listCasesRequest.xSite) &&
            Objects.equals(this.xLanguage, listCasesRequest.xLanguage) &&
            Objects.equals(this.xTimeZone, listCasesRequest.xTimeZone);
    }
    @Override
    public int hashCode() {
        return Objects.hash(searchKey, labelIdList, appKey, incidentId, queryStartTime, queryEndTime, status, incidentStatus, xCustomerId, xCustomerName, groupId, offset, limit, xSite, xLanguage, xTimeZone);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCasesRequest {\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    labelIdList: ").append(toIndentedString(labelIdList)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentStatus: ").append(toIndentedString(incidentStatus)).append("\n");
        sb.append("    xCustomerId: ").append(toIndentedString(xCustomerId)).append("\n");
        sb.append("    xCustomerName: ").append(toIndentedString(xCustomerName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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


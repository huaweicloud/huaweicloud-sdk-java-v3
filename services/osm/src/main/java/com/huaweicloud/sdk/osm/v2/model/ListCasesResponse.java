package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.IncidentInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCasesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_info_list")
    
    private List<IncidentInfoV2> incidentInfoList = null;
    
    public ListCasesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总数
     * minimum: 0
     * maximum: 65535
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListCasesResponse withIncidentInfoList(List<IncidentInfoV2> incidentInfoList) {
        this.incidentInfoList = incidentInfoList;
        return this;
    }

    
    public ListCasesResponse addIncidentInfoListItem(IncidentInfoV2 incidentInfoListItem) {
        this.incidentInfoList.add(incidentInfoListItem);
        return this;
    }

    public ListCasesResponse withIncidentInfoList(Consumer<List<IncidentInfoV2>> incidentInfoListSetter) {
        if(this.incidentInfoList == null ){
            this.incidentInfoList = new ArrayList<>();
        }
        incidentInfoListSetter.accept(this.incidentInfoList);
        return this;
    }

    /**
     * 工单列表
     * @return incidentInfoList
     */
    public List<IncidentInfoV2> getIncidentInfoList() {
        return incidentInfoList;
    }

    public void setIncidentInfoList(List<IncidentInfoV2> incidentInfoList) {
        this.incidentInfoList = incidentInfoList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCasesResponse listCasesResponse = (ListCasesResponse) o;
        return Objects.equals(this.totalCount, listCasesResponse.totalCount) &&
            Objects.equals(this.incidentInfoList, listCasesResponse.incidentInfoList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentInfoList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCasesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentInfoList: ").append(toIndentedString(incidentInfoList)).append("\n");
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


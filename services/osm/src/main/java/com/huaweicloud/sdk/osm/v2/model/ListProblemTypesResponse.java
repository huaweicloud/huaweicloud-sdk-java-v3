package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListProblemTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_business_type_list")

    private List<SimpleIncidentBusinessTypeV2> incidentBusinessTypeList = null;

    public ListProblemTypesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListProblemTypesResponse withIncidentBusinessTypeList(
        List<SimpleIncidentBusinessTypeV2> incidentBusinessTypeList) {
        this.incidentBusinessTypeList = incidentBusinessTypeList;
        return this;
    }

    public ListProblemTypesResponse addIncidentBusinessTypeListItem(
        SimpleIncidentBusinessTypeV2 incidentBusinessTypeListItem) {
        if (this.incidentBusinessTypeList == null) {
            this.incidentBusinessTypeList = new ArrayList<>();
        }
        this.incidentBusinessTypeList.add(incidentBusinessTypeListItem);
        return this;
    }

    public ListProblemTypesResponse withIncidentBusinessTypeList(
        Consumer<List<SimpleIncidentBusinessTypeV2>> incidentBusinessTypeListSetter) {
        if (this.incidentBusinessTypeList == null) {
            this.incidentBusinessTypeList = new ArrayList<>();
        }
        incidentBusinessTypeListSetter.accept(this.incidentBusinessTypeList);
        return this;
    }

    /**
     * 问题类型列表
     * @return incidentBusinessTypeList
     */
    public List<SimpleIncidentBusinessTypeV2> getIncidentBusinessTypeList() {
        return incidentBusinessTypeList;
    }

    public void setIncidentBusinessTypeList(List<SimpleIncidentBusinessTypeV2> incidentBusinessTypeList) {
        this.incidentBusinessTypeList = incidentBusinessTypeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProblemTypesResponse listProblemTypesResponse = (ListProblemTypesResponse) o;
        return Objects.equals(this.totalCount, listProblemTypesResponse.totalCount)
            && Objects.equals(this.incidentBusinessTypeList, listProblemTypesResponse.incidentBusinessTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentBusinessTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProblemTypesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentBusinessTypeList: ").append(toIndentedString(incidentBusinessTypeList)).append("\n");
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

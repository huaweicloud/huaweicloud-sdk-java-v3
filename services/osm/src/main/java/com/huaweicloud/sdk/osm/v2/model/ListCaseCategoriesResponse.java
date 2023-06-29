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
public class ListCaseCategoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_sub_type_list")

    private List<IncidentSubTypeV2Do> incidentSubTypeList = null;

    public ListCaseCategoriesResponse withTotalCount(Integer totalCount) {
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

    public ListCaseCategoriesResponse withIncidentSubTypeList(List<IncidentSubTypeV2Do> incidentSubTypeList) {
        this.incidentSubTypeList = incidentSubTypeList;
        return this;
    }

    public ListCaseCategoriesResponse addIncidentSubTypeListItem(IncidentSubTypeV2Do incidentSubTypeListItem) {
        if (this.incidentSubTypeList == null) {
            this.incidentSubTypeList = new ArrayList<>();
        }
        this.incidentSubTypeList.add(incidentSubTypeListItem);
        return this;
    }

    public ListCaseCategoriesResponse withIncidentSubTypeList(
        Consumer<List<IncidentSubTypeV2Do>> incidentSubTypeListSetter) {
        if (this.incidentSubTypeList == null) {
            this.incidentSubTypeList = new ArrayList<>();
        }
        incidentSubTypeListSetter.accept(this.incidentSubTypeList);
        return this;
    }

    /**
     * 工单子类型列表
     * @return incidentSubTypeList
     */
    public List<IncidentSubTypeV2Do> getIncidentSubTypeList() {
        return incidentSubTypeList;
    }

    public void setIncidentSubTypeList(List<IncidentSubTypeV2Do> incidentSubTypeList) {
        this.incidentSubTypeList = incidentSubTypeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCaseCategoriesResponse that = (ListCaseCategoriesResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.incidentSubTypeList, that.incidentSubTypeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentSubTypeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCaseCategoriesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incidentSubTypeList: ").append(toIndentedString(incidentSubTypeList)).append("\n");
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

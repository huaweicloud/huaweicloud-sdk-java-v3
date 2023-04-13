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
public class ListOrderIncidentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalCount")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incidentInfoList")

    private List<IncidentInfo> incidentInfoList = null;

    public ListOrderIncidentResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 数据总量
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

    public ListOrderIncidentResponse withIncidentInfoList(List<IncidentInfo> incidentInfoList) {
        this.incidentInfoList = incidentInfoList;
        return this;
    }

    public ListOrderIncidentResponse addIncidentInfoListItem(IncidentInfo incidentInfoListItem) {
        if (this.incidentInfoList == null) {
            this.incidentInfoList = new ArrayList<>();
        }
        this.incidentInfoList.add(incidentInfoListItem);
        return this;
    }

    public ListOrderIncidentResponse withIncidentInfoList(Consumer<List<IncidentInfo>> incidentInfoListSetter) {
        if (this.incidentInfoList == null) {
            this.incidentInfoList = new ArrayList<>();
        }
        incidentInfoListSetter.accept(this.incidentInfoList);
        return this;
    }

    /**
     * 工单列表
     * @return incidentInfoList
     */
    public List<IncidentInfo> getIncidentInfoList() {
        return incidentInfoList;
    }

    public void setIncidentInfoList(List<IncidentInfo> incidentInfoList) {
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
        ListOrderIncidentResponse listOrderIncidentResponse = (ListOrderIncidentResponse) o;
        return Objects.equals(this.totalCount, listOrderIncidentResponse.totalCount)
            && Objects.equals(this.incidentInfoList, listOrderIncidentResponse.incidentInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incidentInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrderIncidentResponse {\n");
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

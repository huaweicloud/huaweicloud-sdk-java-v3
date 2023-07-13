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
public class ListAuthorizationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_auth_list")

    private List<IncidentOrderAuthV2> incidentAuthList = null;

    public ListAuthorizationsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListAuthorizationsResponse withIncidentAuthList(List<IncidentOrderAuthV2> incidentAuthList) {
        this.incidentAuthList = incidentAuthList;
        return this;
    }

    public ListAuthorizationsResponse addIncidentAuthListItem(IncidentOrderAuthV2 incidentAuthListItem) {
        if (this.incidentAuthList == null) {
            this.incidentAuthList = new ArrayList<>();
        }
        this.incidentAuthList.add(incidentAuthListItem);
        return this;
    }

    public ListAuthorizationsResponse withIncidentAuthList(Consumer<List<IncidentOrderAuthV2>> incidentAuthListSetter) {
        if (this.incidentAuthList == null) {
            this.incidentAuthList = new ArrayList<>();
        }
        incidentAuthListSetter.accept(this.incidentAuthList);
        return this;
    }

    /**
     * 授权列表
     * @return incidentAuthList
     */
    public List<IncidentOrderAuthV2> getIncidentAuthList() {
        return incidentAuthList;
    }

    public void setIncidentAuthList(List<IncidentOrderAuthV2> incidentAuthList) {
        this.incidentAuthList = incidentAuthList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAuthorizationsResponse that = (ListAuthorizationsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.incidentAuthList, that.incidentAuthList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, incidentAuthList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    incidentAuthList: ").append(toIndentedString(incidentAuthList)).append("\n");
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

package com.huaweicloud.sdk.osm.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.IncidentStatusCount;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIncidentCountResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_status_counts")
    
    private List<IncidentStatusCount> incidentStatusCounts = null;
    
    public ListIncidentCountResponse withIncidentStatusCounts(List<IncidentStatusCount> incidentStatusCounts) {
        this.incidentStatusCounts = incidentStatusCounts;
        return this;
    }

    
    public ListIncidentCountResponse addIncidentStatusCountsItem(IncidentStatusCount incidentStatusCountsItem) {
        if (this.incidentStatusCounts == null) {
            this.incidentStatusCounts = new ArrayList<>();
        }
        this.incidentStatusCounts.add(incidentStatusCountsItem);
        return this;
    }

    public ListIncidentCountResponse withIncidentStatusCounts(Consumer<List<IncidentStatusCount>> incidentStatusCountsSetter) {
        if(this.incidentStatusCounts == null ){
            this.incidentStatusCounts = new ArrayList<>();
        }
        incidentStatusCountsSetter.accept(this.incidentStatusCounts);
        return this;
    }

    /**
     * 状态数量统计列表
     * @return incidentStatusCounts
     */
    public List<IncidentStatusCount> getIncidentStatusCounts() {
        return incidentStatusCounts;
    }

    public void setIncidentStatusCounts(List<IncidentStatusCount> incidentStatusCounts) {
        this.incidentStatusCounts = incidentStatusCounts;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIncidentCountResponse listIncidentCountResponse = (ListIncidentCountResponse) o;
        return Objects.equals(this.incidentStatusCounts, listIncidentCountResponse.incidentStatusCounts);
    }
    @Override
    public int hashCode() {
        return Objects.hash(incidentStatusCounts);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIncidentCountResponse {\n");
        sb.append("    incidentStatusCounts: ").append(toIndentedString(incidentStatusCounts)).append("\n");
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


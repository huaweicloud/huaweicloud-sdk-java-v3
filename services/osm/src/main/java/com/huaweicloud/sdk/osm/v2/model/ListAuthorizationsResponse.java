package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_auth_list")

    @JacksonXmlProperty(localName = "incident_auth_list")

    private List<IncidentOrderAuthV2> incidentAuthList = null;

    public ListAuthorizationsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 9223372036854775807
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuthorizationsResponse listAuthorizationsResponse = (ListAuthorizationsResponse) o;
        return Objects.equals(this.total, listAuthorizationsResponse.total)
            && Objects.equals(this.incidentAuthList, listAuthorizationsResponse.incidentAuthList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, incidentAuthList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuthorizationsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

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
public class ListAgenciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_list")

    @JacksonXmlProperty(localName = "agency_list")

    private List<AgencyV2> agencyList = null;

    public ListAgenciesResponse withTotalCount(Integer totalCount) {
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

    public ListAgenciesResponse withAgencyList(List<AgencyV2> agencyList) {
        this.agencyList = agencyList;
        return this;
    }

    public ListAgenciesResponse addAgencyListItem(AgencyV2 agencyListItem) {
        if (this.agencyList == null) {
            this.agencyList = new ArrayList<>();
        }
        this.agencyList.add(agencyListItem);
        return this;
    }

    public ListAgenciesResponse withAgencyList(Consumer<List<AgencyV2>> agencyListSetter) {
        if (this.agencyList == null) {
            this.agencyList = new ArrayList<>();
        }
        agencyListSetter.accept(this.agencyList);
        return this;
    }

    /**
     * 委托列表
     * @return agencyList
     */
    public List<AgencyV2> getAgencyList() {
        return agencyList;
    }

    public void setAgencyList(List<AgencyV2> agencyList) {
        this.agencyList = agencyList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAgenciesResponse listAgenciesResponse = (ListAgenciesResponse) o;
        return Objects.equals(this.totalCount, listAgenciesResponse.totalCount)
            && Objects.equals(this.agencyList, listAgenciesResponse.agencyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, agencyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgenciesResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    agencyList: ").append(toIndentedString(agencyList)).append("\n");
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

package com.huaweicloud.sdk.iam.v3.model;

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
public class ListAgenciesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencies")

    private List<AgencyListResult> agencies = null;

    public ListAgenciesResponse withAgencies(List<AgencyListResult> agencies) {
        this.agencies = agencies;
        return this;
    }

    public ListAgenciesResponse addAgenciesItem(AgencyListResult agenciesItem) {
        if (this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public ListAgenciesResponse withAgencies(Consumer<List<AgencyListResult>> agenciesSetter) {
        if (this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托信息列表。
     * @return agencies
     */
    public List<AgencyListResult> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<AgencyListResult> agencies) {
        this.agencies = agencies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgenciesResponse that = (ListAgenciesResponse) obj;
        return Objects.equals(this.agencies, that.agencies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgenciesResponse {\n");
        sb.append("    agencies: ").append(toIndentedString(agencies)).append("\n");
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

package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListAgenciesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agencies")
    
    private List<AgencyResult> agencies = null;
    
    public ListAgenciesResponse withAgencies(List<AgencyResult> agencies) {
        this.agencies = agencies;
        return this;
    }

    
    public ListAgenciesResponse addAgenciesItem(AgencyResult agenciesItem) {
        if (this.agencies == null) {
            this.agencies = new ArrayList<>();
        }
        this.agencies.add(agenciesItem);
        return this;
    }

    public ListAgenciesResponse withAgencies(Consumer<List<AgencyResult>> agenciesSetter) {
        if(this.agencies == null ){
            this.agencies = new ArrayList<>();
        }
        agenciesSetter.accept(this.agencies);
        return this;
    }

    /**
     * 委托信息列表。
     * @return agencies
     */
    public List<AgencyResult> getAgencies() {
        return agencies;
    }

    public void setAgencies(List<AgencyResult> agencies) {
        this.agencies = agencies;
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
        return Objects.equals(this.agencies, listAgenciesResponse.agencies);
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


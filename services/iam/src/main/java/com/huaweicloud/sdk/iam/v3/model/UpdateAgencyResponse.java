package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.AgencyResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class UpdateAgencyResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency")
    
    private AgencyResult agency = null;

    public UpdateAgencyResponse withAgency(AgencyResult agency) {
        this.agency = agency;
        return this;
    }

    public UpdateAgencyResponse withAgency(Consumer<AgencyResult> agencySetter) {
        if(this.agency == null ){
            this.agency = new AgencyResult();
        }
        agencySetter.accept(this.agency);
        return this;
    }


    /**
     * Get agency
     * @return agency
     */
    public AgencyResult getAgency() {
        return agency;
    }

    public void setAgency(AgencyResult agency) {
        this.agency = agency;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAgencyResponse updateAgencyResponse = (UpdateAgencyResponse) o;
        return Objects.equals(this.agency, updateAgencyResponse.agency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(agency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAgencyResponse {\n");
            sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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


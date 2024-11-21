package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private AgencyUpdateResult agency;

    public UpdateAgencyResponse withAgency(AgencyUpdateResult agency) {
        this.agency = agency;
        return this;
    }

    public UpdateAgencyResponse withAgency(Consumer<AgencyUpdateResult> agencySetter) {
        if (this.agency == null) {
            this.agency = new AgencyUpdateResult();
            agencySetter.accept(this.agency);
        }

        return this;
    }

    /**
     * Get agency
     * @return agency
     */
    public AgencyUpdateResult getAgency() {
        return agency;
    }

    public void setAgency(AgencyUpdateResult agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAgencyResponse that = (UpdateAgencyResponse) obj;
        return Objects.equals(this.agency, that.agency);
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

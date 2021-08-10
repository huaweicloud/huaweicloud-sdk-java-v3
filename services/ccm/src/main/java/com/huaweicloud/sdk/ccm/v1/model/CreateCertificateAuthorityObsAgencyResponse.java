package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class CreateCertificateAuthorityObsAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_id")

    private String agencyId;

    public CreateCertificateAuthorityObsAgencyResponse withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    /** 授权ID
     * 
     * @return agencyId */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateAuthorityObsAgencyResponse createCertificateAuthorityObsAgencyResponse =
            (CreateCertificateAuthorityObsAgencyResponse) o;
        return Objects.equals(this.agencyId, createCertificateAuthorityObsAgencyResponse.agencyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateAuthorityObsAgencyResponse {\n");
        sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

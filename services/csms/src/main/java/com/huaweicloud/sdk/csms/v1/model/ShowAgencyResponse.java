package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_granted")

    private String agencyGranted;

    public ShowAgencyResponse withAgencyGranted(String agencyGranted) {
        this.agencyGranted = agencyGranted;
        return this;
    }

    /**
     * 委托是否存在。
     * @return agencyGranted
     */
    public String getAgencyGranted() {
        return agencyGranted;
    }

    public void setAgencyGranted(String agencyGranted) {
        this.agencyGranted = agencyGranted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgencyResponse that = (ShowAgencyResponse) obj;
        return Objects.equals(this.agencyGranted, that.agencyGranted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyGranted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgencyResponse {\n");
        sb.append("    agencyGranted: ").append(toIndentedString(agencyGranted)).append("\n");
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

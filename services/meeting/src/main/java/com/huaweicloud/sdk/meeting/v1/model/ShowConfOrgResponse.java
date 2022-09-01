package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowConfOrgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orgID")

    @JacksonXmlProperty(localName = "orgID")

    private String orgID;

    public ShowConfOrgResponse withOrgID(String orgID) {
        this.orgID = orgID;
        return this;
    }

    /**
     * 企业ID
     * @return orgID
     */
    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConfOrgResponse showConfOrgResponse = (ShowConfOrgResponse) o;
        return Objects.equals(this.orgID, showConfOrgResponse.orgID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfOrgResponse {\n");
        sb.append("    orgID: ").append(toIndentedString(orgID)).append("\n");
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

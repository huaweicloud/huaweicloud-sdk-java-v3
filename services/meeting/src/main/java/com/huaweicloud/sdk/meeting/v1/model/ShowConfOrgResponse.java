package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowConfOrgResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orgID")

    private String orgID;

    public ShowConfOrgResponse withOrgID(String orgID) {
        this.orgID = orgID;
        return this;
    }

    /**
     * SP管理员根据会议ID查询该会议归属的企业ID。
     * @return orgID
     */
    public String getOrgID() {
        return orgID;
    }

    public void setOrgID(String orgID) {
        this.orgID = orgID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConfOrgResponse that = (ShowConfOrgResponse) obj;
        return Objects.equals(this.orgID, that.orgID);
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

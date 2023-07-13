package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class PushPortalInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_id")

    private String portalId;

    public PushPortalInfoRequest withPortalId(String portalId) {
        this.portalId = portalId;
        return this;
    }

    /**
     * 主页ID。
     * @return portalId
     */
    public String getPortalId() {
        return portalId;
    }

    public void setPortalId(String portalId) {
        this.portalId = portalId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushPortalInfoRequest that = (PushPortalInfoRequest) obj;
        return Objects.equals(this.portalId, that.portalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portalId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushPortalInfoRequest {\n");
        sb.append("    portalId: ").append(toIndentedString(portalId)).append("\n");
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

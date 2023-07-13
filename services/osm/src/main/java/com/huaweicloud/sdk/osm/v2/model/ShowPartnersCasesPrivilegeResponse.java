package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowPartnersCasesPrivilegeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_privilege")

    private Boolean hasPrivilege;

    public ShowPartnersCasesPrivilegeResponse withHasPrivilege(Boolean hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
        return this;
    }

    /**
     * 是否有权限
     * @return hasPrivilege
     */
    public Boolean getHasPrivilege() {
        return hasPrivilege;
    }

    public void setHasPrivilege(Boolean hasPrivilege) {
        this.hasPrivilege = hasPrivilege;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPartnersCasesPrivilegeResponse that = (ShowPartnersCasesPrivilegeResponse) obj;
        return Objects.equals(this.hasPrivilege, that.hasPrivilege);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasPrivilege);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartnersCasesPrivilegeResponse {\n");
        sb.append("    hasPrivilege: ").append(toIndentedString(hasPrivilege)).append("\n");
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

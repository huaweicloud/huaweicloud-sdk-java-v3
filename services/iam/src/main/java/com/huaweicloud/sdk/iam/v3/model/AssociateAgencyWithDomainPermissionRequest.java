package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class AssociateAgencyWithDomainPermissionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_id")
    
    private String agencyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private String roleId;

    public AssociateAgencyWithDomainPermissionRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AssociateAgencyWithDomainPermissionRequest withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    


    /**
     * Get agencyId
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public AssociateAgencyWithDomainPermissionRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * Get roleId
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateAgencyWithDomainPermissionRequest associateAgencyWithDomainPermissionRequest = (AssociateAgencyWithDomainPermissionRequest) o;
        return Objects.equals(this.domainId, associateAgencyWithDomainPermissionRequest.domainId) &&
            Objects.equals(this.agencyId, associateAgencyWithDomainPermissionRequest.agencyId) &&
            Objects.equals(this.roleId, associateAgencyWithDomainPermissionRequest.roleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, agencyId, roleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateAgencyWithDomainPermissionRequest {\n");
            sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
            sb.append("    agencyId: ").append(toIndentedString(agencyId)).append("\n");
            sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
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


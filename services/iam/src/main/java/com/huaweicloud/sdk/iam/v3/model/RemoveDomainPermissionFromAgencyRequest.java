package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RemoveDomainPermissionFromAgencyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agency_id")
    
    private String agencyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_id")
    
    private String roleId;

    public RemoveDomainPermissionFromAgencyRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 委托方账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public RemoveDomainPermissionFromAgencyRequest withAgencyId(String agencyId) {
        this.agencyId = agencyId;
        return this;
    }

    


    /**
     * 委托ID，获取方式请参见：[获取委托名、委托ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。
     * @return agencyId
     */
    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    

    public RemoveDomainPermissionFromAgencyRequest withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    


    /**
     * 权限ID，获取方式请参见：[获取权限名、权限ID](https://support.huaweicloud.com/api-iam/iam_10_0001.html)。
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
        RemoveDomainPermissionFromAgencyRequest removeDomainPermissionFromAgencyRequest = (RemoveDomainPermissionFromAgencyRequest) o;
        return Objects.equals(this.domainId, removeDomainPermissionFromAgencyRequest.domainId) &&
            Objects.equals(this.agencyId, removeDomainPermissionFromAgencyRequest.agencyId) &&
            Objects.equals(this.roleId, removeDomainPermissionFromAgencyRequest.roleId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, agencyId, roleId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveDomainPermissionFromAgencyRequest {\n");
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


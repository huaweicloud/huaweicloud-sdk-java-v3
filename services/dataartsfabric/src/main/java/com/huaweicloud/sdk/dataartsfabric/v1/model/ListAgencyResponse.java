package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized")

    private Boolean authorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_policies")

    private List<AgencyPolicy> agencyPolicies = null;

    public ListAgencyResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ListAgencyResponse withAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }

    /**
     * 授权与否。如果用户的服务委托权限包含系统所需要的委托权限返回true，否则返回false。
     * @return authorized
     */
    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public ListAgencyResponse withAgencyPolicies(List<AgencyPolicy> agencyPolicies) {
        this.agencyPolicies = agencyPolicies;
        return this;
    }

    public ListAgencyResponse addAgencyPoliciesItem(AgencyPolicy agencyPoliciesItem) {
        if (this.agencyPolicies == null) {
            this.agencyPolicies = new ArrayList<>();
        }
        this.agencyPolicies.add(agencyPoliciesItem);
        return this;
    }

    public ListAgencyResponse withAgencyPolicies(Consumer<List<AgencyPolicy>> agencyPoliciesSetter) {
        if (this.agencyPolicies == null) {
            this.agencyPolicies = new ArrayList<>();
        }
        agencyPoliciesSetter.accept(this.agencyPolicies);
        return this;
    }

    /**
     * 委托策略列表。
     * @return agencyPolicies
     */
    public List<AgencyPolicy> getAgencyPolicies() {
        return agencyPolicies;
    }

    public void setAgencyPolicies(List<AgencyPolicy> agencyPolicies) {
        this.agencyPolicies = agencyPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgencyResponse that = (ListAgencyResponse) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.authorized, that.authorized)
            && Objects.equals(this.agencyPolicies, that.agencyPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName, authorized, agencyPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgencyResponse {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
        sb.append("    agencyPolicies: ").append(toIndentedString(agencyPolicies)).append("\n");
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

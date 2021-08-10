package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
 */
public class AgencyTokenAssumerole {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public AgencyTokenAssumerole withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 委托方A的账号ID。“domain_id”与“domain_name”至少填写一个。
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public AgencyTokenAssumerole withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 委托方A的账号名称。“domain_id”与“domain_name”至少填写一个。
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public AgencyTokenAssumerole withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /** 委托方A创建的委托的名称。
     * 
     * @return agencyName */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AgencyTokenAssumerole agencyTokenAssumerole = (AgencyTokenAssumerole) o;
        return Objects.equals(this.domainId, agencyTokenAssumerole.domainId)
            && Objects.equals(this.domainName, agencyTokenAssumerole.domainName)
            && Objects.equals(this.agencyName, agencyTokenAssumerole.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgencyTokenAssumerole {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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

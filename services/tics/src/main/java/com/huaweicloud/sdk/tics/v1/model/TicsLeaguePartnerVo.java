package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 联盟合作方信息
 */
public class TicsLeaguePartnerVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_alias")

    private String partnerDomainAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_domain_name")

    private String partnerDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_status")

    private String partnerStatus;

    public TicsLeaguePartnerVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 联盟合作方Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TicsLeaguePartnerVo withPartnerDomainAlias(String partnerDomainAlias) {
        this.partnerDomainAlias = partnerDomainAlias;
        return this;
    }

    /**
     * 联盟合作方别名
     * @return partnerDomainAlias
     */
    public String getPartnerDomainAlias() {
        return partnerDomainAlias;
    }

    public void setPartnerDomainAlias(String partnerDomainAlias) {
        this.partnerDomainAlias = partnerDomainAlias;
    }

    public TicsLeaguePartnerVo withPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
        return this;
    }

    /**
     * 联盟合作方租户名
     * @return partnerDomainName
     */
    public String getPartnerDomainName() {
        return partnerDomainName;
    }

    public void setPartnerDomainName(String partnerDomainName) {
        this.partnerDomainName = partnerDomainName;
    }

    public TicsLeaguePartnerVo withPartnerStatus(String partnerStatus) {
        this.partnerStatus = partnerStatus;
        return this;
    }

    /**
     * 联盟合作方状态
     * @return partnerStatus
     */
    public String getPartnerStatus() {
        return partnerStatus;
    }

    public void setPartnerStatus(String partnerStatus) {
        this.partnerStatus = partnerStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TicsLeaguePartnerVo ticsLeaguePartnerVo = (TicsLeaguePartnerVo) o;
        return Objects.equals(this.id, ticsLeaguePartnerVo.id)
            && Objects.equals(this.partnerDomainAlias, ticsLeaguePartnerVo.partnerDomainAlias)
            && Objects.equals(this.partnerDomainName, ticsLeaguePartnerVo.partnerDomainName)
            && Objects.equals(this.partnerStatus, ticsLeaguePartnerVo.partnerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, partnerDomainAlias, partnerDomainName, partnerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsLeaguePartnerVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    partnerDomainAlias: ").append(toIndentedString(partnerDomainAlias)).append("\n");
        sb.append("    partnerDomainName: ").append(toIndentedString(partnerDomainName)).append("\n");
        sb.append("    partnerStatus: ").append(toIndentedString(partnerStatus)).append("\n");
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

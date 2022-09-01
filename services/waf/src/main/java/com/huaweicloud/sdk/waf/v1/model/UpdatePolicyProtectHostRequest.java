package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class UpdatePolicyProtectHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    @JacksonXmlProperty(localName = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    @JacksonXmlProperty(localName = "hosts")

    private String hosts;

    public UpdatePolicyProtectHostRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdatePolicyProtectHostRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 防护策略id，您可以通过调用查询防护策略列表（ListPolicy）获取策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdatePolicyProtectHostRequest withHosts(String hosts) {
        this.hosts = hosts;
        return this;
    }

    /**
     * 域名id，您可以通过调用查询云模式防护域名列表（ListHost）获取域名id
     * @return hosts
     */
    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePolicyProtectHostRequest updatePolicyProtectHostRequest = (UpdatePolicyProtectHostRequest) o;
        return Objects.equals(this.enterpriseProjectId, updatePolicyProtectHostRequest.enterpriseProjectId)
            && Objects.equals(this.policyId, updatePolicyProtectHostRequest.policyId)
            && Objects.equals(this.hosts, updatePolicyProtectHostRequest.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, policyId, hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyProtectHostRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

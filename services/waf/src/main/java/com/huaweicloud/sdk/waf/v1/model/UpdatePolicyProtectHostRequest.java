package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class UpdatePolicyProtectHostRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosts")

    private String hosts;

    public UpdatePolicyProtectHostRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /** 策略id（策略id从查询防护策略列表接口获取）
     * 
     * @return policyId */
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

    /** 域名id9从获取防护网站列表获取域名id）
     * 
     * @return hosts */
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
        return Objects.equals(this.policyId, updatePolicyProtectHostRequest.policyId)
            && Objects.equals(this.hosts, updatePolicyProtectHostRequest.hosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, hosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyProtectHostRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
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

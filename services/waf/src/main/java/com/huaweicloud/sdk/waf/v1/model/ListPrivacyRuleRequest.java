package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPrivacyRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    public ListPrivacyRuleRequest withPolicyId(String policyId) {
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

    public ListPrivacyRuleRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /** 页码
     * 
     * @return page */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListPrivacyRuleRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /** 每页条数
     * 
     * @return pagesize */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPrivacyRuleRequest listPrivacyRuleRequest = (ListPrivacyRuleRequest) o;
        return Objects.equals(this.policyId, listPrivacyRuleRequest.policyId)
            && Objects.equals(this.page, listPrivacyRuleRequest.page)
            && Objects.equals(this.pagesize, listPrivacyRuleRequest.pagesize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, page, pagesize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPrivacyRuleRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
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

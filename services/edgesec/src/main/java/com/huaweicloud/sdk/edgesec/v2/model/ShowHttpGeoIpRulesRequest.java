package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowHttpGeoIpRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    public ShowHttpGeoIpRulesRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 策略id
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ShowHttpGeoIpRulesRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页查询参数，第page页
     * minimum: 1
     * maximum: 1000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ShowHttpGeoIpRulesRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /**
     * 分页查询参数，每页显示pagesize条记录
     * minimum: -1
     * maximum: 1000
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpGeoIpRulesRequest that = (ShowHttpGeoIpRulesRequest) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.pagesize, that.pagesize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, page, pagesize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpGeoIpRulesRequest {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
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

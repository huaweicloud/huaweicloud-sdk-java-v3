package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListPolicyVersionsV5Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    public ListPolicyVersionsV5Request withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * 身份策略ID，长度为1到64个字符，只包含字母、数字和\"-\"的字符串。
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public ListPolicyVersionsV5Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量，范围为1到200条，默认为100条。
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPolicyVersionsV5Request withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标记，长度为4到400个字符，只包含字母、数字、\"+\"、\"/\"、\"=\"、\"-\"和\"_\"的字符串。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyVersionsV5Request that = (ListPolicyVersionsV5Request) obj;
        return Objects.equals(this.policyId, that.policyId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyId, limit, marker);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyVersionsV5Request {\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

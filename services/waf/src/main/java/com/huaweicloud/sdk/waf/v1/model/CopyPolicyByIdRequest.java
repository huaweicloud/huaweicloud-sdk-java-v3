package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CopyPolicyByIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_policy_id")

    private String srcPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_policy_name")

    private String destPolicyName;

    public CopyPolicyByIdRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 您可以通过调用企业项目管理服务（EPS)的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CopyPolicyByIdRequest withSrcPolicyId(String srcPolicyId) {
        this.srcPolicyId = srcPolicyId;
        return this;
    }

    /**
     * 源策略ID
     * @return srcPolicyId
     */
    public String getSrcPolicyId() {
        return srcPolicyId;
    }

    public void setSrcPolicyId(String srcPolicyId) {
        this.srcPolicyId = srcPolicyId;
    }

    public CopyPolicyByIdRequest withDestPolicyName(String destPolicyName) {
        this.destPolicyName = destPolicyName;
        return this;
    }

    /**
     * 复制出的新策略名称
     * @return destPolicyName
     */
    public String getDestPolicyName() {
        return destPolicyName;
    }

    public void setDestPolicyName(String destPolicyName) {
        this.destPolicyName = destPolicyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CopyPolicyByIdRequest that = (CopyPolicyByIdRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.srcPolicyId, that.srcPolicyId)
            && Objects.equals(this.destPolicyName, that.destPolicyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, srcPolicyId, destPolicyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyPolicyByIdRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    srcPolicyId: ").append(toIndentedString(srcPolicyId)).append("\n");
        sb.append("    destPolicyName: ").append(toIndentedString(destPolicyName)).append("\n");
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

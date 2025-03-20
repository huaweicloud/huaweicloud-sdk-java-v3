package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCertificatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private String sortDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private String sortKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_support")

    private Boolean deploySupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owned_by_self")

    private Boolean ownedBySelf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_days_since")

    private Integer expiredDaysSince;

    public ListCertificatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页条目数量，取值如下： - 10：每页显示10条证书信息。 - 20：每页显示20条证书信息。 - 50：每页显示50条证书信息。
     * minimum: 10
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListCertificatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
     * minimum: 0
     * maximum: 100
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCertificatesRequest withSortDir(String sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    /**
     * 排序方式。根据排序参数sort_key进行排序，取值如下： - ASC：升序。 - DESC：降序。
     * @return sortDir
     */
    public String getSortDir() {
        return sortDir;
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }

    public ListCertificatesRequest withSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * 排序依据参数，取值如下： - certExpiredTime：证书到期时间。 - certStatus：证书状态。 - certUpdateTime：证书更新时间。
     * @return sortKey
     */
    public String getSortKey() {
        return sortKey;
    }

    public void setSortKey(String sortKey) {
        this.sortKey = sortKey;
    }

    public ListCertificatesRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态，取值如下： - ALL：所有证书状态。 - PAID：证书已支付，待申请证书。 - ISSUED：证书已签发。 - CHECKING：证书申请审核中。 - CANCELCHECKING：取消证书申请审核中。 - UNPASSED：证书申请未通过。 - EXPIRED：证书已过期。 - REVOKING：证书吊销申请审核中。 - REVOKED：证书已吊销。 - UPLOAD：证书托管中。 - CHECKING_ORG：待完成企业资格认证。 - ISSUING：证书待签发。 - SUPPLEMENTCHECKING：多域名证书新增附加域名审核中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListCertificatesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业多项目ID。用户未开通企业多项目时，不需要输入该字段。 用户开通企业多项目时，查询资源可以输入该字段。 若用户不输入该字段，默认查询租户所有有权限的企业多项目下的资源。 此时“enterprise_project_id”取值为“all”。 若用户输入该字段，取值满足以下任一条件。 - 取值为“all” - 取值为“0” - 满足正则匹配：“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListCertificatesRequest withDeploySupport(Boolean deploySupport) {
        this.deploySupport = deploySupport;
        return this;
    }

    /**
     * 是否仅筛选支持部署的证书。
     * @return deploySupport
     */
    public Boolean getDeploySupport() {
        return deploySupport;
    }

    public void setDeploySupport(Boolean deploySupport) {
        this.deploySupport = deploySupport;
    }

    public ListCertificatesRequest withOwnedBySelf(Boolean ownedBySelf) {
        this.ownedBySelf = ownedBySelf;
        return this;
    }

    /**
     * 过滤资源是否属于当前租户，取值如下： - true：只查属于当前租户的资源，不包括共享资源。 - false：查询当前租户及共享给该租户的资源。
     * @return ownedBySelf
     */
    public Boolean getOwnedBySelf() {
        return ownedBySelf;
    }

    public void setOwnedBySelf(Boolean ownedBySelf) {
        this.ownedBySelf = ownedBySelf;
    }

    public ListCertificatesRequest withExpiredDaysSince(Integer expiredDaysSince) {
        this.expiredDaysSince = expiredDaysSince;
        return this;
    }

    /**
     * 证书在有效期内及最多过期xx天。
     * minimum: 0
     * maximum: 1095
     * @return expiredDaysSince
     */
    public Integer getExpiredDaysSince() {
        return expiredDaysSince;
    }

    public void setExpiredDaysSince(Integer expiredDaysSince) {
        this.expiredDaysSince = expiredDaysSince;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCertificatesRequest that = (ListCertificatesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.sortDir, that.sortDir) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.deploySupport, that.deploySupport)
            && Objects.equals(this.ownedBySelf, that.ownedBySelf)
            && Objects.equals(this.expiredDaysSince, that.expiredDaysSince);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            offset,
            sortDir,
            sortKey,
            status,
            enterpriseProjectId,
            deploySupport,
            ownedBySelf,
            expiredDaysSince);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCertificatesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    deploySupport: ").append(toIndentedString(deploySupport)).append("\n");
        sb.append("    ownedBySelf: ").append(toIndentedString(ownedBySelf)).append("\n");
        sb.append("    expiredDaysSince: ").append(toIndentedString(expiredDaysSince)).append("\n");
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

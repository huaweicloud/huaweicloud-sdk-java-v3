package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NoSqlRequestEpsQuota
 */
public class NoSqlRequestEpsQuota {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota")

    private NoSqlEpsQuota quota;

    public NoSqlRequestEpsQuota withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public NoSqlRequestEpsQuota withQuota(NoSqlEpsQuota quota) {
        this.quota = quota;
        return this;
    }

    public NoSqlRequestEpsQuota withQuota(Consumer<NoSqlEpsQuota> quotaSetter) {
        if (this.quota == null) {
            this.quota = new NoSqlEpsQuota();
            quotaSetter.accept(this.quota);
        }

        return this;
    }

    /**
     * Get quota
     * @return quota
     */
    public NoSqlEpsQuota getQuota() {
        return quota;
    }

    public void setQuota(NoSqlEpsQuota quota) {
        this.quota = quota;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NoSqlRequestEpsQuota noSqlRequestEpsQuota = (NoSqlRequestEpsQuota) o;
        return Objects.equals(this.enterpriseProjectId, noSqlRequestEpsQuota.enterpriseProjectId)
            && Objects.equals(this.quota, noSqlRequestEpsQuota.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, quota);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlRequestEpsQuota {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
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

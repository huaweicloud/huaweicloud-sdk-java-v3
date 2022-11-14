package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class MigrateCompositeHostsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_enterprise_project_id")

    private String targetEnterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private MigrateCompositeHostsRequestBody body;

    public MigrateCompositeHostsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 当前企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public MigrateCompositeHostsRequest withTargetEnterpriseProjectId(String targetEnterpriseProjectId) {
        this.targetEnterpriseProjectId = targetEnterpriseProjectId;
        return this;
    }

    /**
     * 迁移的目标企业项目ID
     * @return targetEnterpriseProjectId
     */
    public String getTargetEnterpriseProjectId() {
        return targetEnterpriseProjectId;
    }

    public void setTargetEnterpriseProjectId(String targetEnterpriseProjectId) {
        this.targetEnterpriseProjectId = targetEnterpriseProjectId;
    }

    public MigrateCompositeHostsRequest withBody(MigrateCompositeHostsRequestBody body) {
        this.body = body;
        return this;
    }

    public MigrateCompositeHostsRequest withBody(Consumer<MigrateCompositeHostsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new MigrateCompositeHostsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public MigrateCompositeHostsRequestBody getBody() {
        return body;
    }

    public void setBody(MigrateCompositeHostsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrateCompositeHostsRequest migrateCompositeHostsRequest = (MigrateCompositeHostsRequest) o;
        return Objects.equals(this.enterpriseProjectId, migrateCompositeHostsRequest.enterpriseProjectId)
            && Objects.equals(this.targetEnterpriseProjectId, migrateCompositeHostsRequest.targetEnterpriseProjectId)
            && Objects.equals(this.body, migrateCompositeHostsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, targetEnterpriseProjectId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateCompositeHostsRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    targetEnterpriseProjectId: ").append(toIndentedString(targetEnterpriseProjectId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

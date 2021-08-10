package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 邀请方信息，被邀请方创建服务实例时需要填写此内容 */
public class CreateRequestBodyInvitorInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockchain_id")

    private String blockchainId;

    public CreateRequestBodyInvitorInfos withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /** 邀请方租户ID
     * 
     * @return tenantId */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateRequestBodyInvitorInfos withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 邀请方项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateRequestBodyInvitorInfos withBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }

    /** 邀请方服务实例ID
     * 
     * @return blockchainId */
    public String getBlockchainId() {
        return blockchainId;
    }

    public void setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRequestBodyInvitorInfos createRequestBodyInvitorInfos = (CreateRequestBodyInvitorInfos) o;
        return Objects.equals(this.tenantId, createRequestBodyInvitorInfos.tenantId)
            && Objects.equals(this.projectId, createRequestBodyInvitorInfos.projectId)
            && Objects.equals(this.blockchainId, createRequestBodyInvitorInfos.blockchainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, projectId, blockchainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRequestBodyInvitorInfos {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    blockchainId: ").append(toIndentedString(blockchainId)).append("\n");
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

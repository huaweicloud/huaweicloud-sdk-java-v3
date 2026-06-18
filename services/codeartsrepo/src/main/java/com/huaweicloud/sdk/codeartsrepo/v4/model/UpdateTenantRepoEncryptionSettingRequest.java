package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateTenantRepoEncryptionSettingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private TenantRepoEncryptionSettingRequestDto body;

    public UpdateTenantRepoEncryptionSettingRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public UpdateTenantRepoEncryptionSettingRequest withBody(TenantRepoEncryptionSettingRequestDto body) {
        this.body = body;
        return this;
    }

    public UpdateTenantRepoEncryptionSettingRequest withBody(
        Consumer<TenantRepoEncryptionSettingRequestDto> bodySetter) {
        if (this.body == null) {
            this.body = new TenantRepoEncryptionSettingRequestDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public TenantRepoEncryptionSettingRequestDto getBody() {
        return body;
    }

    public void setBody(TenantRepoEncryptionSettingRequestDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantRepoEncryptionSettingRequest that = (UpdateTenantRepoEncryptionSettingRequest) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantRepoEncryptionSettingRequest {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

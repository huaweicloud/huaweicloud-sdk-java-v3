package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class MigrateVaultResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    @JacksonXmlProperty(localName = "vault_id")

    private String vaultId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private VaultMigrateResourceReq body;

    public MigrateVaultResourceRequest withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * Get vaultId
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    public MigrateVaultResourceRequest withBody(VaultMigrateResourceReq body) {
        this.body = body;
        return this;
    }

    public MigrateVaultResourceRequest withBody(Consumer<VaultMigrateResourceReq> bodySetter) {
        if (this.body == null) {
            this.body = new VaultMigrateResourceReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public VaultMigrateResourceReq getBody() {
        return body;
    }

    public void setBody(VaultMigrateResourceReq body) {
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
        MigrateVaultResourceRequest migrateVaultResourceRequest = (MigrateVaultResourceRequest) o;
        return Objects.equals(this.vaultId, migrateVaultResourceRequest.vaultId)
            && Objects.equals(this.body, migrateVaultResourceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaultId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateVaultResourceRequest {\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

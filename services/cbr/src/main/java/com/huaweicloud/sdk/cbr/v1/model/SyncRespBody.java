package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SyncRespBody
 */
public class SyncRespBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_log_id")

    private String operationLogId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public SyncRespBody withOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
        return this;
    }

    /**
     * 是否自动触发
     * @return operationLogId
     */
    public String getOperationLogId() {
        return operationLogId;
    }

    public void setOperationLogId(String operationLogId) {
        this.operationLogId = operationLogId;
    }

    public SyncRespBody withVaultId(String vaultId) {
        this.vaultId = vaultId;
        return this;
    }

    /**
     * 混合云vault id
     * @return vaultId
     */
    public String getVaultId() {
        return vaultId;
    }

    public void setVaultId(String vaultId) {
        this.vaultId = vaultId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SyncRespBody that = (SyncRespBody) obj;
        return Objects.equals(this.operationLogId, that.operationLogId) && Objects.equals(this.vaultId, that.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operationLogId, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncRespBody {\n");
        sb.append("    operationLogId: ").append(toIndentedString(operationLogId)).append("\n");
        sb.append("    vaultId: ").append(toIndentedString(vaultId)).append("\n");
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

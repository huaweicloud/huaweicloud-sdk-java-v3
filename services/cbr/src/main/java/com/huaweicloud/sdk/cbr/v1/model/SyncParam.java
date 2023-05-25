package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SyncParam
 */
public class SyncParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_trigger")

    private Boolean autoTrigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault_id")

    private String vaultId;

    public SyncParam withAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
        return this;
    }

    /**
     * 本次同步是否自动触发
     * @return autoTrigger
     */
    public Boolean getAutoTrigger() {
        return autoTrigger;
    }

    public void setAutoTrigger(Boolean autoTrigger) {
        this.autoTrigger = autoTrigger;
    }

    public SyncParam withVaultId(String vaultId) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncParam syncParam = (SyncParam) o;
        return Objects.equals(this.autoTrigger, syncParam.autoTrigger)
            && Objects.equals(this.vaultId, syncParam.vaultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoTrigger, vaultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncParam {\n");
        sb.append("    autoTrigger: ").append(toIndentedString(autoTrigger)).append("\n");
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

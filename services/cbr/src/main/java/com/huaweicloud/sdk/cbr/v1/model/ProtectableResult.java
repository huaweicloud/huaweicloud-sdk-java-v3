package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProtectableResult
 */
public class ProtectableResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vault")

    private VaultGet vault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    public ProtectableResult withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 不支持备份的错误码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProtectableResult withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 不支持备份的原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ProtectableResult withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 是否可备份
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public ProtectableResult withVault(VaultGet vault) {
        this.vault = vault;
        return this;
    }

    public ProtectableResult withVault(Consumer<VaultGet> vaultSetter) {
        if (this.vault == null) {
            this.vault = new VaultGet();
            vaultSetter.accept(this.vault);
        }

        return this;
    }

    /**
     * Get vault
     * @return vault
     */
    public VaultGet getVault() {
        return vault;
    }

    public void setVault(VaultGet vault) {
        this.vault = vault;
    }

    public ProtectableResult withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 资源不可备份的原因信息，当资源可保护性检验失败时才有该字段。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProtectableResult that = (ProtectableResult) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.reason, that.reason)
            && Objects.equals(this.result, that.result) && Objects.equals(this.vault, that.vault)
            && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, reason, result, vault, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

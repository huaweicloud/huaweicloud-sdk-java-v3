package com.huaweicloud.sdk.cbr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.VaultGet;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProtectableResult
 */
public class ProtectableResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private String code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reason")
    
    private String reason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="result")
    
    private String result;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vault")
    
    private VaultGet vault = null;

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

    public ProtectableResult withResult(String result) {
        this.result = result;
        return this;
    }

    


    /**
     * 是否可备份
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public ProtectableResult withVault(VaultGet vault) {
        this.vault = vault;
        return this;
    }

    public ProtectableResult withVault(Consumer<VaultGet> vaultSetter) {
        if(this.vault == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectableResult protectableResult = (ProtectableResult) o;
        return Objects.equals(this.code, protectableResult.code) &&
            Objects.equals(this.reason, protectableResult.reason) &&
            Objects.equals(this.result, protectableResult.result) &&
            Objects.equals(this.vault, protectableResult.vault);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, reason, result, vault);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectableResult {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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


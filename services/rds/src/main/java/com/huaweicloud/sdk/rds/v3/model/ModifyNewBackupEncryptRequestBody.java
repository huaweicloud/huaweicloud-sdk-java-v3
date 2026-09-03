package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设置备份加密开关请求体
 */
public class ModifyNewBackupEncryptRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_key")

    private String kmsKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public ModifyNewBackupEncryptRequestBody withKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
        return this;
    }

    /**
     * **参数解释**：  KMS密钥ID，用于备份加密。  **约束限制**：  当enabled为true时必填，当enabled为false时不需填写。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return kmsKey
     */
    public String getKmsKey() {
        return kmsKey;
    }

    public void setKmsKey(String kmsKey) {
        this.kmsKey = kmsKey;
    }

    public ModifyNewBackupEncryptRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**：  是否开启备份加密。  **约束限制**：  不涉及。  **取值范围**：  - true：开启备份加密 - false：关闭备份加密  **默认取值**：  不涉及。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyNewBackupEncryptRequestBody that = (ModifyNewBackupEncryptRequestBody) obj;
        return Objects.equals(this.kmsKey, that.kmsKey) && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmsKey, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyNewBackupEncryptRequestBody {\n");
        sb.append("    kmsKey: ").append(toIndentedString(kmsKey)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

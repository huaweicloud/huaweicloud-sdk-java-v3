package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowProjectTenantSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_encryption_enabled")

    private Boolean defaultEncryptionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_type")

    private String encryptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permit_public")

    private String permitPublic;

    public ShowProjectTenantSettingsResponse withDefaultEncryptionEnabled(Boolean defaultEncryptionEnabled) {
        this.defaultEncryptionEnabled = defaultEncryptionEnabled;
        return this;
    }

    /**
     * **参数解释：** 仓库默认加密设置是否开启。
     * @return defaultEncryptionEnabled
     */
    public Boolean getDefaultEncryptionEnabled() {
        return defaultEncryptionEnabled;
    }

    public void setDefaultEncryptionEnabled(Boolean defaultEncryptionEnabled) {
        this.defaultEncryptionEnabled = defaultEncryptionEnabled;
    }

    public ShowProjectTenantSettingsResponse withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * **参数解释：** 租户设置的加密类型。 **取值范围：** KMS,normal,null,当为KMS时表示开启了KMS加密。
     * @return encryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public ShowProjectTenantSettingsResponse withPermitPublic(String permitPublic) {
        this.permitPublic = permitPublic;
        return this;
    }

    /**
     * **参数解释：** 允许公共访问。 **取值范围：** allow 允许 deny 拒绝。
     * @return permitPublic
     */
    public String getPermitPublic() {
        return permitPublic;
    }

    public void setPermitPublic(String permitPublic) {
        this.permitPublic = permitPublic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectTenantSettingsResponse that = (ShowProjectTenantSettingsResponse) obj;
        return Objects.equals(this.defaultEncryptionEnabled, that.defaultEncryptionEnabled)
            && Objects.equals(this.encryptionType, that.encryptionType)
            && Objects.equals(this.permitPublic, that.permitPublic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultEncryptionEnabled, encryptionType, permitPublic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectTenantSettingsResponse {\n");
        sb.append("    defaultEncryptionEnabled: ").append(toIndentedString(defaultEncryptionEnabled)).append("\n");
        sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
        sb.append("    permitPublic: ").append(toIndentedString(permitPublic)).append("\n");
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

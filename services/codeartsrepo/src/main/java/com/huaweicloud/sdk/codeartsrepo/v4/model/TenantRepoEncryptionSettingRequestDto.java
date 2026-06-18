package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TenantRepoEncryptionSettingRequestDto
 */
public class TenantRepoEncryptionSettingRequestDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_type")

    private String encryptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_encryption_enabled")

    private Boolean defaultEncryptionEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_key_name")

    private String cmkKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmk_key_id")

    private String cmkKeyId;

    public TenantRepoEncryptionSettingRequestDto withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public TenantRepoEncryptionSettingRequestDto withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }

    /**
     * **参数解释：** 加密类型。 **取值范围：** KMS表示开启KMS加密，normal或者null表示未开启KMS加密。
     * @return encryptionType
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public TenantRepoEncryptionSettingRequestDto withDefaultEncryptionEnabled(Boolean defaultEncryptionEnabled) {
        this.defaultEncryptionEnabled = defaultEncryptionEnabled;
        return this;
    }

    /**
     * **参数解释：** 是否开启租户下默认加密设置。
     * @return defaultEncryptionEnabled
     */
    public Boolean getDefaultEncryptionEnabled() {
        return defaultEncryptionEnabled;
    }

    public void setDefaultEncryptionEnabled(Boolean defaultEncryptionEnabled) {
        this.defaultEncryptionEnabled = defaultEncryptionEnabled;
    }

    public TenantRepoEncryptionSettingRequestDto withCmkKeyName(String cmkKeyName) {
        this.cmkKeyName = cmkKeyName;
        return this;
    }

    /**
     * **参数解释：** 加密主密钥的名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return cmkKeyName
     */
    public String getCmkKeyName() {
        return cmkKeyName;
    }

    public void setCmkKeyName(String cmkKeyName) {
        this.cmkKeyName = cmkKeyName;
    }

    public TenantRepoEncryptionSettingRequestDto withCmkKeyId(String cmkKeyId) {
        this.cmkKeyId = cmkKeyId;
        return this;
    }

    /**
     * **参数解释：** 加密主密钥的id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return cmkKeyId
     */
    public String getCmkKeyId() {
        return cmkKeyId;
    }

    public void setCmkKeyId(String cmkKeyId) {
        this.cmkKeyId = cmkKeyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantRepoEncryptionSettingRequestDto that = (TenantRepoEncryptionSettingRequestDto) obj;
        return Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.encryptionType, that.encryptionType)
            && Objects.equals(this.defaultEncryptionEnabled, that.defaultEncryptionEnabled)
            && Objects.equals(this.cmkKeyName, that.cmkKeyName) && Objects.equals(this.cmkKeyId, that.cmkKeyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tenantId, encryptionType, defaultEncryptionEnabled, cmkKeyName, cmkKeyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TenantRepoEncryptionSettingRequestDto {\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    encryptionType: ").append(toIndentedString(encryptionType)).append("\n");
        sb.append("    defaultEncryptionEnabled: ").append(toIndentedString(defaultEncryptionEnabled)).append("\n");
        sb.append("    cmkKeyName: ").append(toIndentedString(cmkKeyName)).append("\n");
        sb.append("    cmkKeyId: ").append(toIndentedString(cmkKeyId)).append("\n");
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

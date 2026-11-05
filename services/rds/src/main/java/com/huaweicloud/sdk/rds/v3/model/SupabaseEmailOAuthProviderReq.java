package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * enable_email_sign_up&#x3D;false时清空enable_email_auto_confirm和smtp_config。
 */
public class SupabaseEmailOAuthProviderReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_email_sign_up")

    private Boolean enableEmailSignUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_email_auto_confirm")

    private Boolean enableEmailAutoConfirm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_config")

    private SupabaseSMTPServerReq smtpConfig;

    public SupabaseEmailOAuthProviderReq withEnableEmailSignUp(Boolean enableEmailSignUp) {
        this.enableEmailSignUp = enableEmailSignUp;
        return this;
    }

    /**
     * Get enableEmailSignUp
     * @return enableEmailSignUp
     */
    public Boolean getEnableEmailSignUp() {
        return enableEmailSignUp;
    }

    public void setEnableEmailSignUp(Boolean enableEmailSignUp) {
        this.enableEmailSignUp = enableEmailSignUp;
    }

    public SupabaseEmailOAuthProviderReq withEnableEmailAutoConfirm(Boolean enableEmailAutoConfirm) {
        this.enableEmailAutoConfirm = enableEmailAutoConfirm;
        return this;
    }

    /**
     * Get enableEmailAutoConfirm
     * @return enableEmailAutoConfirm
     */
    public Boolean getEnableEmailAutoConfirm() {
        return enableEmailAutoConfirm;
    }

    public void setEnableEmailAutoConfirm(Boolean enableEmailAutoConfirm) {
        this.enableEmailAutoConfirm = enableEmailAutoConfirm;
    }

    public SupabaseEmailOAuthProviderReq withSmtpConfig(SupabaseSMTPServerReq smtpConfig) {
        this.smtpConfig = smtpConfig;
        return this;
    }

    public SupabaseEmailOAuthProviderReq withSmtpConfig(Consumer<SupabaseSMTPServerReq> smtpConfigSetter) {
        if (this.smtpConfig == null) {
            this.smtpConfig = new SupabaseSMTPServerReq();
            smtpConfigSetter.accept(this.smtpConfig);
        }

        return this;
    }

    /**
     * Get smtpConfig
     * @return smtpConfig
     */
    public SupabaseSMTPServerReq getSmtpConfig() {
        return smtpConfig;
    }

    public void setSmtpConfig(SupabaseSMTPServerReq smtpConfig) {
        this.smtpConfig = smtpConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseEmailOAuthProviderReq that = (SupabaseEmailOAuthProviderReq) obj;
        return Objects.equals(this.enableEmailSignUp, that.enableEmailSignUp)
            && Objects.equals(this.enableEmailAutoConfirm, that.enableEmailAutoConfirm)
            && Objects.equals(this.smtpConfig, that.smtpConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableEmailSignUp, enableEmailAutoConfirm, smtpConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseEmailOAuthProviderReq {\n");
        sb.append("    enableEmailSignUp: ").append(toIndentedString(enableEmailSignUp)).append("\n");
        sb.append("    enableEmailAutoConfirm: ").append(toIndentedString(enableEmailAutoConfirm)).append("\n");
        sb.append("    smtpConfig: ").append(toIndentedString(smtpConfig)).append("\n");
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

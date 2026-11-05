package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SupabaseApiEmailOAuthProvider
 */
public class SupabaseApiEmailOAuthProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_email_sign_up")

    private Boolean enableEmailSignUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_email_auto_confirm")

    private Boolean enableEmailAutoConfirm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_config")

    private SupabaseApiSMTPServer smtpConfig;

    public SupabaseApiEmailOAuthProvider withEnableEmailSignUp(Boolean enableEmailSignUp) {
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

    public SupabaseApiEmailOAuthProvider withEnableEmailAutoConfirm(Boolean enableEmailAutoConfirm) {
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

    public SupabaseApiEmailOAuthProvider withSmtpConfig(SupabaseApiSMTPServer smtpConfig) {
        this.smtpConfig = smtpConfig;
        return this;
    }

    public SupabaseApiEmailOAuthProvider withSmtpConfig(Consumer<SupabaseApiSMTPServer> smtpConfigSetter) {
        if (this.smtpConfig == null) {
            this.smtpConfig = new SupabaseApiSMTPServer();
            smtpConfigSetter.accept(this.smtpConfig);
        }

        return this;
    }

    /**
     * Get smtpConfig
     * @return smtpConfig
     */
    public SupabaseApiSMTPServer getSmtpConfig() {
        return smtpConfig;
    }

    public void setSmtpConfig(SupabaseApiSMTPServer smtpConfig) {
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
        SupabaseApiEmailOAuthProvider that = (SupabaseApiEmailOAuthProvider) obj;
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
        sb.append("class SupabaseApiEmailOAuthProvider {\n");
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

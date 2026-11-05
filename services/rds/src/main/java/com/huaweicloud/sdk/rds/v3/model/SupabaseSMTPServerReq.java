package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SupabaseSMTPServerReq
 */
public class SupabaseSMTPServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_host")

    private String smtpHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_port")

    private Integer smtpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_user")

    private String smtpUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_pwd")

    private String smtpPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_admin_email")

    private String smtpAdminEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_sender_name")

    private String smtpSenderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smtp_max_frequency")

    private Integer smtpMaxFrequency;

    public SupabaseSMTPServerReq withSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
        return this;
    }

    /**
     * Get smtpHost
     * @return smtpHost
     */
    public String getSmtpHost() {
        return smtpHost;
    }

    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public SupabaseSMTPServerReq withSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
        return this;
    }

    /**
     * Get smtpPort
     * @return smtpPort
     */
    public Integer getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(Integer smtpPort) {
        this.smtpPort = smtpPort;
    }

    public SupabaseSMTPServerReq withSmtpUser(String smtpUser) {
        this.smtpUser = smtpUser;
        return this;
    }

    /**
     * Get smtpUser
     * @return smtpUser
     */
    public String getSmtpUser() {
        return smtpUser;
    }

    public void setSmtpUser(String smtpUser) {
        this.smtpUser = smtpUser;
    }

    public SupabaseSMTPServerReq withSmtpPwd(String smtpPwd) {
        this.smtpPwd = smtpPwd;
        return this;
    }

    /**
     * 秘密，受控输入，show不返回。
     * @return smtpPwd
     */
    public String getSmtpPwd() {
        return smtpPwd;
    }

    public void setSmtpPwd(String smtpPwd) {
        this.smtpPwd = smtpPwd;
    }

    public SupabaseSMTPServerReq withSmtpAdminEmail(String smtpAdminEmail) {
        this.smtpAdminEmail = smtpAdminEmail;
        return this;
    }

    /**
     * Get smtpAdminEmail
     * @return smtpAdminEmail
     */
    public String getSmtpAdminEmail() {
        return smtpAdminEmail;
    }

    public void setSmtpAdminEmail(String smtpAdminEmail) {
        this.smtpAdminEmail = smtpAdminEmail;
    }

    public SupabaseSMTPServerReq withSmtpSenderName(String smtpSenderName) {
        this.smtpSenderName = smtpSenderName;
        return this;
    }

    /**
     * Get smtpSenderName
     * @return smtpSenderName
     */
    public String getSmtpSenderName() {
        return smtpSenderName;
    }

    public void setSmtpSenderName(String smtpSenderName) {
        this.smtpSenderName = smtpSenderName;
    }

    public SupabaseSMTPServerReq withSmtpMaxFrequency(Integer smtpMaxFrequency) {
        this.smtpMaxFrequency = smtpMaxFrequency;
        return this;
    }

    /**
     * Get smtpMaxFrequency
     * @return smtpMaxFrequency
     */
    public Integer getSmtpMaxFrequency() {
        return smtpMaxFrequency;
    }

    public void setSmtpMaxFrequency(Integer smtpMaxFrequency) {
        this.smtpMaxFrequency = smtpMaxFrequency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SupabaseSMTPServerReq that = (SupabaseSMTPServerReq) obj;
        return Objects.equals(this.smtpHost, that.smtpHost) && Objects.equals(this.smtpPort, that.smtpPort)
            && Objects.equals(this.smtpUser, that.smtpUser) && Objects.equals(this.smtpPwd, that.smtpPwd)
            && Objects.equals(this.smtpAdminEmail, that.smtpAdminEmail)
            && Objects.equals(this.smtpSenderName, that.smtpSenderName)
            && Objects.equals(this.smtpMaxFrequency, that.smtpMaxFrequency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smtpHost, smtpPort, smtpUser, smtpPwd, smtpAdminEmail, smtpSenderName, smtpMaxFrequency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupabaseSMTPServerReq {\n");
        sb.append("    smtpHost: ").append(toIndentedString(smtpHost)).append("\n");
        sb.append("    smtpPort: ").append(toIndentedString(smtpPort)).append("\n");
        sb.append("    smtpUser: ").append(toIndentedString(smtpUser)).append("\n");
        sb.append("    smtpPwd: ").append(toIndentedString(smtpPwd)).append("\n");
        sb.append("    smtpAdminEmail: ").append(toIndentedString(smtpAdminEmail)).append("\n");
        sb.append("    smtpSenderName: ").append(toIndentedString(smtpSenderName)).append("\n");
        sb.append("    smtpMaxFrequency: ").append(toIndentedString(smtpMaxFrequency)).append("\n");
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

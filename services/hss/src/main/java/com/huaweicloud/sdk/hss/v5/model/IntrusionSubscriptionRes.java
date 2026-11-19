package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 入侵检测订阅的项目
 */
public class IntrusionSubscriptionRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_account_status")

    private Boolean riskyAccountStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_login_status")

    private Boolean abnormalLoginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "malicious_program_status")

    private Boolean maliciousProgramStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webshell_status")

    private Boolean webshellStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_crack_status")

    private Boolean accountCrackStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_file_change_status")

    private Boolean criticalFileChangeStatus;

    public IntrusionSubscriptionRes withRiskyAccountStatus(Boolean riskyAccountStatus) {
        this.riskyAccountStatus = riskyAccountStatus;
        return this;
    }

    /**
     * **参数解释**: 风险账号 **取值范围**: - true：开启 - false：关闭 
     * @return riskyAccountStatus
     */
    public Boolean getRiskyAccountStatus() {
        return riskyAccountStatus;
    }

    public void setRiskyAccountStatus(Boolean riskyAccountStatus) {
        this.riskyAccountStatus = riskyAccountStatus;
    }

    public IntrusionSubscriptionRes withAbnormalLoginStatus(Boolean abnormalLoginStatus) {
        this.abnormalLoginStatus = abnormalLoginStatus;
        return this;
    }

    /**
     * **参数解释**: 异地登录 **取值范围**: - true：开启 - false：关闭 
     * @return abnormalLoginStatus
     */
    public Boolean getAbnormalLoginStatus() {
        return abnormalLoginStatus;
    }

    public void setAbnormalLoginStatus(Boolean abnormalLoginStatus) {
        this.abnormalLoginStatus = abnormalLoginStatus;
    }

    public IntrusionSubscriptionRes withMaliciousProgramStatus(Boolean maliciousProgramStatus) {
        this.maliciousProgramStatus = maliciousProgramStatus;
        return this;
    }

    /**
     * **参数解释**: 恶意程序 **取值范围**: - true：开启 - false：关闭 
     * @return maliciousProgramStatus
     */
    public Boolean getMaliciousProgramStatus() {
        return maliciousProgramStatus;
    }

    public void setMaliciousProgramStatus(Boolean maliciousProgramStatus) {
        this.maliciousProgramStatus = maliciousProgramStatus;
    }

    public IntrusionSubscriptionRes withWebshellStatus(Boolean webshellStatus) {
        this.webshellStatus = webshellStatus;
        return this;
    }

    /**
     * **参数解释**: 网站后门 **取值范围**: - true：开启 - false：关闭 
     * @return webshellStatus
     */
    public Boolean getWebshellStatus() {
        return webshellStatus;
    }

    public void setWebshellStatus(Boolean webshellStatus) {
        this.webshellStatus = webshellStatus;
    }

    public IntrusionSubscriptionRes withAccountCrackStatus(Boolean accountCrackStatus) {
        this.accountCrackStatus = accountCrackStatus;
        return this;
    }

    /**
     * **参数解释**: 账号破解 **取值范围**: - true：开启 - false：关闭 
     * @return accountCrackStatus
     */
    public Boolean getAccountCrackStatus() {
        return accountCrackStatus;
    }

    public void setAccountCrackStatus(Boolean accountCrackStatus) {
        this.accountCrackStatus = accountCrackStatus;
    }

    public IntrusionSubscriptionRes withCriticalFileChangeStatus(Boolean criticalFileChangeStatus) {
        this.criticalFileChangeStatus = criticalFileChangeStatus;
        return this;
    }

    /**
     * **参数解释**: 关键文件变更 **取值范围**: - true：开启 - false：关闭 
     * @return criticalFileChangeStatus
     */
    public Boolean getCriticalFileChangeStatus() {
        return criticalFileChangeStatus;
    }

    public void setCriticalFileChangeStatus(Boolean criticalFileChangeStatus) {
        this.criticalFileChangeStatus = criticalFileChangeStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntrusionSubscriptionRes that = (IntrusionSubscriptionRes) obj;
        return Objects.equals(this.riskyAccountStatus, that.riskyAccountStatus)
            && Objects.equals(this.abnormalLoginStatus, that.abnormalLoginStatus)
            && Objects.equals(this.maliciousProgramStatus, that.maliciousProgramStatus)
            && Objects.equals(this.webshellStatus, that.webshellStatus)
            && Objects.equals(this.accountCrackStatus, that.accountCrackStatus)
            && Objects.equals(this.criticalFileChangeStatus, that.criticalFileChangeStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskyAccountStatus,
            abnormalLoginStatus,
            maliciousProgramStatus,
            webshellStatus,
            accountCrackStatus,
            criticalFileChangeStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntrusionSubscriptionRes {\n");
        sb.append("    riskyAccountStatus: ").append(toIndentedString(riskyAccountStatus)).append("\n");
        sb.append("    abnormalLoginStatus: ").append(toIndentedString(abnormalLoginStatus)).append("\n");
        sb.append("    maliciousProgramStatus: ").append(toIndentedString(maliciousProgramStatus)).append("\n");
        sb.append("    webshellStatus: ").append(toIndentedString(webshellStatus)).append("\n");
        sb.append("    accountCrackStatus: ").append(toIndentedString(accountCrackStatus)).append("\n");
        sb.append("    criticalFileChangeStatus: ").append(toIndentedString(criticalFileChangeStatus)).append("\n");
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

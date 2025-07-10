package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBestPracticeOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_score")

    private BigDecimal totalScore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_time")

    private String detectTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization_account")

    private BestPracticeOverviewItem organizationAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_permission")

    private BestPracticeOverviewItem identityPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_planning")

    private BestPracticeOverviewItem networkPlanning;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_audit")

    private BestPracticeOverviewItem complianceAudit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "financial_governance")

    private BestPracticeOverviewItem financialGovernance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_boundary")

    private BestPracticeOverviewItem dataBoundary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "om_monitor")

    private BestPracticeOverviewItem omMonitor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_management")

    private BestPracticeOverviewItem securityManagement;

    public ShowBestPracticeOverviewResponse withTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    /**
     * 总分数
     * @return totalScore
     */
    public BigDecimal getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    public ShowBestPracticeOverviewResponse withDetectTime(String detectTime) {
        this.detectTime = detectTime;
        return this;
    }

    /**
     * 检测完成时间
     * @return detectTime
     */
    public String getDetectTime() {
        return detectTime;
    }

    public void setDetectTime(String detectTime) {
        this.detectTime = detectTime;
    }

    public ShowBestPracticeOverviewResponse withOrganizationAccount(BestPracticeOverviewItem organizationAccount) {
        this.organizationAccount = organizationAccount;
        return this;
    }

    public ShowBestPracticeOverviewResponse withOrganizationAccount(
        Consumer<BestPracticeOverviewItem> organizationAccountSetter) {
        if (this.organizationAccount == null) {
            this.organizationAccount = new BestPracticeOverviewItem();
            organizationAccountSetter.accept(this.organizationAccount);
        }

        return this;
    }

    /**
     * Get organizationAccount
     * @return organizationAccount
     */
    public BestPracticeOverviewItem getOrganizationAccount() {
        return organizationAccount;
    }

    public void setOrganizationAccount(BestPracticeOverviewItem organizationAccount) {
        this.organizationAccount = organizationAccount;
    }

    public ShowBestPracticeOverviewResponse withIdentityPermission(BestPracticeOverviewItem identityPermission) {
        this.identityPermission = identityPermission;
        return this;
    }

    public ShowBestPracticeOverviewResponse withIdentityPermission(
        Consumer<BestPracticeOverviewItem> identityPermissionSetter) {
        if (this.identityPermission == null) {
            this.identityPermission = new BestPracticeOverviewItem();
            identityPermissionSetter.accept(this.identityPermission);
        }

        return this;
    }

    /**
     * Get identityPermission
     * @return identityPermission
     */
    public BestPracticeOverviewItem getIdentityPermission() {
        return identityPermission;
    }

    public void setIdentityPermission(BestPracticeOverviewItem identityPermission) {
        this.identityPermission = identityPermission;
    }

    public ShowBestPracticeOverviewResponse withNetworkPlanning(BestPracticeOverviewItem networkPlanning) {
        this.networkPlanning = networkPlanning;
        return this;
    }

    public ShowBestPracticeOverviewResponse withNetworkPlanning(
        Consumer<BestPracticeOverviewItem> networkPlanningSetter) {
        if (this.networkPlanning == null) {
            this.networkPlanning = new BestPracticeOverviewItem();
            networkPlanningSetter.accept(this.networkPlanning);
        }

        return this;
    }

    /**
     * Get networkPlanning
     * @return networkPlanning
     */
    public BestPracticeOverviewItem getNetworkPlanning() {
        return networkPlanning;
    }

    public void setNetworkPlanning(BestPracticeOverviewItem networkPlanning) {
        this.networkPlanning = networkPlanning;
    }

    public ShowBestPracticeOverviewResponse withComplianceAudit(BestPracticeOverviewItem complianceAudit) {
        this.complianceAudit = complianceAudit;
        return this;
    }

    public ShowBestPracticeOverviewResponse withComplianceAudit(
        Consumer<BestPracticeOverviewItem> complianceAuditSetter) {
        if (this.complianceAudit == null) {
            this.complianceAudit = new BestPracticeOverviewItem();
            complianceAuditSetter.accept(this.complianceAudit);
        }

        return this;
    }

    /**
     * Get complianceAudit
     * @return complianceAudit
     */
    public BestPracticeOverviewItem getComplianceAudit() {
        return complianceAudit;
    }

    public void setComplianceAudit(BestPracticeOverviewItem complianceAudit) {
        this.complianceAudit = complianceAudit;
    }

    public ShowBestPracticeOverviewResponse withFinancialGovernance(BestPracticeOverviewItem financialGovernance) {
        this.financialGovernance = financialGovernance;
        return this;
    }

    public ShowBestPracticeOverviewResponse withFinancialGovernance(
        Consumer<BestPracticeOverviewItem> financialGovernanceSetter) {
        if (this.financialGovernance == null) {
            this.financialGovernance = new BestPracticeOverviewItem();
            financialGovernanceSetter.accept(this.financialGovernance);
        }

        return this;
    }

    /**
     * Get financialGovernance
     * @return financialGovernance
     */
    public BestPracticeOverviewItem getFinancialGovernance() {
        return financialGovernance;
    }

    public void setFinancialGovernance(BestPracticeOverviewItem financialGovernance) {
        this.financialGovernance = financialGovernance;
    }

    public ShowBestPracticeOverviewResponse withDataBoundary(BestPracticeOverviewItem dataBoundary) {
        this.dataBoundary = dataBoundary;
        return this;
    }

    public ShowBestPracticeOverviewResponse withDataBoundary(Consumer<BestPracticeOverviewItem> dataBoundarySetter) {
        if (this.dataBoundary == null) {
            this.dataBoundary = new BestPracticeOverviewItem();
            dataBoundarySetter.accept(this.dataBoundary);
        }

        return this;
    }

    /**
     * Get dataBoundary
     * @return dataBoundary
     */
    public BestPracticeOverviewItem getDataBoundary() {
        return dataBoundary;
    }

    public void setDataBoundary(BestPracticeOverviewItem dataBoundary) {
        this.dataBoundary = dataBoundary;
    }

    public ShowBestPracticeOverviewResponse withOmMonitor(BestPracticeOverviewItem omMonitor) {
        this.omMonitor = omMonitor;
        return this;
    }

    public ShowBestPracticeOverviewResponse withOmMonitor(Consumer<BestPracticeOverviewItem> omMonitorSetter) {
        if (this.omMonitor == null) {
            this.omMonitor = new BestPracticeOverviewItem();
            omMonitorSetter.accept(this.omMonitor);
        }

        return this;
    }

    /**
     * Get omMonitor
     * @return omMonitor
     */
    public BestPracticeOverviewItem getOmMonitor() {
        return omMonitor;
    }

    public void setOmMonitor(BestPracticeOverviewItem omMonitor) {
        this.omMonitor = omMonitor;
    }

    public ShowBestPracticeOverviewResponse withSecurityManagement(BestPracticeOverviewItem securityManagement) {
        this.securityManagement = securityManagement;
        return this;
    }

    public ShowBestPracticeOverviewResponse withSecurityManagement(
        Consumer<BestPracticeOverviewItem> securityManagementSetter) {
        if (this.securityManagement == null) {
            this.securityManagement = new BestPracticeOverviewItem();
            securityManagementSetter.accept(this.securityManagement);
        }

        return this;
    }

    /**
     * Get securityManagement
     * @return securityManagement
     */
    public BestPracticeOverviewItem getSecurityManagement() {
        return securityManagement;
    }

    public void setSecurityManagement(BestPracticeOverviewItem securityManagement) {
        this.securityManagement = securityManagement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBestPracticeOverviewResponse that = (ShowBestPracticeOverviewResponse) obj;
        return Objects.equals(this.totalScore, that.totalScore) && Objects.equals(this.detectTime, that.detectTime)
            && Objects.equals(this.organizationAccount, that.organizationAccount)
            && Objects.equals(this.identityPermission, that.identityPermission)
            && Objects.equals(this.networkPlanning, that.networkPlanning)
            && Objects.equals(this.complianceAudit, that.complianceAudit)
            && Objects.equals(this.financialGovernance, that.financialGovernance)
            && Objects.equals(this.dataBoundary, that.dataBoundary) && Objects.equals(this.omMonitor, that.omMonitor)
            && Objects.equals(this.securityManagement, that.securityManagement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalScore,
            detectTime,
            organizationAccount,
            identityPermission,
            networkPlanning,
            complianceAudit,
            financialGovernance,
            dataBoundary,
            omMonitor,
            securityManagement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBestPracticeOverviewResponse {\n");
        sb.append("    totalScore: ").append(toIndentedString(totalScore)).append("\n");
        sb.append("    detectTime: ").append(toIndentedString(detectTime)).append("\n");
        sb.append("    organizationAccount: ").append(toIndentedString(organizationAccount)).append("\n");
        sb.append("    identityPermission: ").append(toIndentedString(identityPermission)).append("\n");
        sb.append("    networkPlanning: ").append(toIndentedString(networkPlanning)).append("\n");
        sb.append("    complianceAudit: ").append(toIndentedString(complianceAudit)).append("\n");
        sb.append("    financialGovernance: ").append(toIndentedString(financialGovernance)).append("\n");
        sb.append("    dataBoundary: ").append(toIndentedString(dataBoundary)).append("\n");
        sb.append("    omMonitor: ").append(toIndentedString(omMonitor)).append("\n");
        sb.append("    securityManagement: ").append(toIndentedString(securityManagement)).append("\n");
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

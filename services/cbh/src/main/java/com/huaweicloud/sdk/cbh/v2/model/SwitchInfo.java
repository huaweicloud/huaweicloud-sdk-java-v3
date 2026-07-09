package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务功能支持开关信息。
 */
public class SwitchInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_unibuy")

    private Boolean isSupportUnibuy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_float_ipv6")

    private Boolean isSupportFloatIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_admin_login")

    private Boolean isSupportAdminLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_update_ha")

    private Boolean isSupportUpdateHa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_tms")

    private Boolean isSupportTms;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_eps")

    private Boolean isSupportEps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_iam_login")

    private Boolean isSupportIamLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ipv6")

    private Boolean isSupportIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ha")

    private Boolean isSupportHa;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_reset")

    private Boolean isSupportReset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_upgrade_instance")

    private Boolean isSupportUpgradeInstance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_change_security_group")

    private Boolean isSupportChangeSecurityGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_manually_ip")

    private Boolean isSupportManuallyIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_capacity_expantion")

    private Boolean isSupportCapacityExpantion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ha_expantion")

    private Boolean isSupportHaExpantion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_agency_authorize")

    private Boolean isSupportAgencyAuthorize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_change_vpc")

    private Boolean isSupportChangeVpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_cluster")

    private Boolean isSupportCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_ondemand")

    private Boolean isSupportOndemand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_period")

    private Boolean isSupportPeriod;

    public SwitchInfo withIsSupportUnibuy(Boolean isSupportUnibuy) {
        this.isSupportUnibuy = isSupportUnibuy;
        return this;
    }

    /**
     * 是否支持unibuy。 - true：是 - false：否
     * @return isSupportUnibuy
     */
    public Boolean getIsSupportUnibuy() {
        return isSupportUnibuy;
    }

    public void setIsSupportUnibuy(Boolean isSupportUnibuy) {
        this.isSupportUnibuy = isSupportUnibuy;
    }

    public SwitchInfo withIsSupportFloatIpv6(Boolean isSupportFloatIpv6) {
        this.isSupportFloatIpv6 = isSupportFloatIpv6;
        return this;
    }

    /**
     * 是否支持浮动IPv6。 - true：是 - false：否
     * @return isSupportFloatIpv6
     */
    public Boolean getIsSupportFloatIpv6() {
        return isSupportFloatIpv6;
    }

    public void setIsSupportFloatIpv6(Boolean isSupportFloatIpv6) {
        this.isSupportFloatIpv6 = isSupportFloatIpv6;
    }

    public SwitchInfo withIsSupportAdminLogin(Boolean isSupportAdminLogin) {
        this.isSupportAdminLogin = isSupportAdminLogin;
        return this;
    }

    /**
     * 是否支持管理员登录。 - true：是 - false：否
     * @return isSupportAdminLogin
     */
    public Boolean getIsSupportAdminLogin() {
        return isSupportAdminLogin;
    }

    public void setIsSupportAdminLogin(Boolean isSupportAdminLogin) {
        this.isSupportAdminLogin = isSupportAdminLogin;
    }

    public SwitchInfo withIsSupportUpdateHa(Boolean isSupportUpdateHa) {
        this.isSupportUpdateHa = isSupportUpdateHa;
        return this;
    }

    /**
     * 是否支持更新HA。 - true：是 - false：否
     * @return isSupportUpdateHa
     */
    public Boolean getIsSupportUpdateHa() {
        return isSupportUpdateHa;
    }

    public void setIsSupportUpdateHa(Boolean isSupportUpdateHa) {
        this.isSupportUpdateHa = isSupportUpdateHa;
    }

    public SwitchInfo withIsSupportTms(Boolean isSupportTms) {
        this.isSupportTms = isSupportTms;
        return this;
    }

    /**
     * 是否支持TMS。 - true：是 - false：否
     * @return isSupportTms
     */
    public Boolean getIsSupportTms() {
        return isSupportTms;
    }

    public void setIsSupportTms(Boolean isSupportTms) {
        this.isSupportTms = isSupportTms;
    }

    public SwitchInfo withIsSupportEps(Boolean isSupportEps) {
        this.isSupportEps = isSupportEps;
        return this;
    }

    /**
     * 是否支持EPS。 - true：是 - false：否
     * @return isSupportEps
     */
    public Boolean getIsSupportEps() {
        return isSupportEps;
    }

    public void setIsSupportEps(Boolean isSupportEps) {
        this.isSupportEps = isSupportEps;
    }

    public SwitchInfo withIsSupportIamLogin(Boolean isSupportIamLogin) {
        this.isSupportIamLogin = isSupportIamLogin;
        return this;
    }

    /**
     * 是否支持IAM登录。 - true：是 - false：否
     * @return isSupportIamLogin
     */
    public Boolean getIsSupportIamLogin() {
        return isSupportIamLogin;
    }

    public void setIsSupportIamLogin(Boolean isSupportIamLogin) {
        this.isSupportIamLogin = isSupportIamLogin;
    }

    public SwitchInfo withIsSupportIpv6(Boolean isSupportIpv6) {
        this.isSupportIpv6 = isSupportIpv6;
        return this;
    }

    /**
     * 是否支持IPv6。 - true：是 - false：否
     * @return isSupportIpv6
     */
    public Boolean getIsSupportIpv6() {
        return isSupportIpv6;
    }

    public void setIsSupportIpv6(Boolean isSupportIpv6) {
        this.isSupportIpv6 = isSupportIpv6;
    }

    public SwitchInfo withIsSupportHa(Boolean isSupportHa) {
        this.isSupportHa = isSupportHa;
        return this;
    }

    /**
     * 是否支持HA。 - true：是 - false：否
     * @return isSupportHa
     */
    public Boolean getIsSupportHa() {
        return isSupportHa;
    }

    public void setIsSupportHa(Boolean isSupportHa) {
        this.isSupportHa = isSupportHa;
    }

    public SwitchInfo withIsSupportReset(Boolean isSupportReset) {
        this.isSupportReset = isSupportReset;
        return this;
    }

    /**
     * 是否支持重置。 - true：是 - false：否
     * @return isSupportReset
     */
    public Boolean getIsSupportReset() {
        return isSupportReset;
    }

    public void setIsSupportReset(Boolean isSupportReset) {
        this.isSupportReset = isSupportReset;
    }

    public SwitchInfo withIsSupportUpgradeInstance(Boolean isSupportUpgradeInstance) {
        this.isSupportUpgradeInstance = isSupportUpgradeInstance;
        return this;
    }

    /**
     * 是否支持升级实例。 - true：是 - false：否
     * @return isSupportUpgradeInstance
     */
    public Boolean getIsSupportUpgradeInstance() {
        return isSupportUpgradeInstance;
    }

    public void setIsSupportUpgradeInstance(Boolean isSupportUpgradeInstance) {
        this.isSupportUpgradeInstance = isSupportUpgradeInstance;
    }

    public SwitchInfo withIsSupportChangeSecurityGroup(Boolean isSupportChangeSecurityGroup) {
        this.isSupportChangeSecurityGroup = isSupportChangeSecurityGroup;
        return this;
    }

    /**
     * 是否支持更改安全组。 - true：是 - false：否
     * @return isSupportChangeSecurityGroup
     */
    public Boolean getIsSupportChangeSecurityGroup() {
        return isSupportChangeSecurityGroup;
    }

    public void setIsSupportChangeSecurityGroup(Boolean isSupportChangeSecurityGroup) {
        this.isSupportChangeSecurityGroup = isSupportChangeSecurityGroup;
    }

    public SwitchInfo withIsSupportManuallyIp(Boolean isSupportManuallyIp) {
        this.isSupportManuallyIp = isSupportManuallyIp;
        return this;
    }

    /**
     * 是否支持手动IP。 - true：是 - false：否
     * @return isSupportManuallyIp
     */
    public Boolean getIsSupportManuallyIp() {
        return isSupportManuallyIp;
    }

    public void setIsSupportManuallyIp(Boolean isSupportManuallyIp) {
        this.isSupportManuallyIp = isSupportManuallyIp;
    }

    public SwitchInfo withIsSupportCapacityExpantion(Boolean isSupportCapacityExpantion) {
        this.isSupportCapacityExpantion = isSupportCapacityExpantion;
        return this;
    }

    /**
     * 是否支持容量扩展。 - true：是 - false：否
     * @return isSupportCapacityExpantion
     */
    public Boolean getIsSupportCapacityExpantion() {
        return isSupportCapacityExpantion;
    }

    public void setIsSupportCapacityExpantion(Boolean isSupportCapacityExpantion) {
        this.isSupportCapacityExpantion = isSupportCapacityExpantion;
    }

    public SwitchInfo withIsSupportHaExpantion(Boolean isSupportHaExpantion) {
        this.isSupportHaExpantion = isSupportHaExpantion;
        return this;
    }

    /**
     * 是否支持HA扩展。 - true：是 - false：否
     * @return isSupportHaExpantion
     */
    public Boolean getIsSupportHaExpantion() {
        return isSupportHaExpantion;
    }

    public void setIsSupportHaExpantion(Boolean isSupportHaExpantion) {
        this.isSupportHaExpantion = isSupportHaExpantion;
    }

    public SwitchInfo withIsSupportAgencyAuthorize(Boolean isSupportAgencyAuthorize) {
        this.isSupportAgencyAuthorize = isSupportAgencyAuthorize;
        return this;
    }

    /**
     * 是否支持代理授权。 - true：是 - false：否
     * @return isSupportAgencyAuthorize
     */
    public Boolean getIsSupportAgencyAuthorize() {
        return isSupportAgencyAuthorize;
    }

    public void setIsSupportAgencyAuthorize(Boolean isSupportAgencyAuthorize) {
        this.isSupportAgencyAuthorize = isSupportAgencyAuthorize;
    }

    public SwitchInfo withIsSupportChangeVpc(Boolean isSupportChangeVpc) {
        this.isSupportChangeVpc = isSupportChangeVpc;
        return this;
    }

    /**
     * 是否支持更改VPC。 - true：是 - false：否
     * @return isSupportChangeVpc
     */
    public Boolean getIsSupportChangeVpc() {
        return isSupportChangeVpc;
    }

    public void setIsSupportChangeVpc(Boolean isSupportChangeVpc) {
        this.isSupportChangeVpc = isSupportChangeVpc;
    }

    public SwitchInfo withIsSupportCluster(Boolean isSupportCluster) {
        this.isSupportCluster = isSupportCluster;
        return this;
    }

    /**
     * 是否支持集群。 - true：是 - false：否
     * @return isSupportCluster
     */
    public Boolean getIsSupportCluster() {
        return isSupportCluster;
    }

    public void setIsSupportCluster(Boolean isSupportCluster) {
        this.isSupportCluster = isSupportCluster;
    }

    public SwitchInfo withIsSupportOndemand(Boolean isSupportOndemand) {
        this.isSupportOndemand = isSupportOndemand;
        return this;
    }

    /**
     * 是否支持按需。 - true：是 - false：否
     * @return isSupportOndemand
     */
    public Boolean getIsSupportOndemand() {
        return isSupportOndemand;
    }

    public void setIsSupportOndemand(Boolean isSupportOndemand) {
        this.isSupportOndemand = isSupportOndemand;
    }

    public SwitchInfo withIsSupportPeriod(Boolean isSupportPeriod) {
        this.isSupportPeriod = isSupportPeriod;
        return this;
    }

    /**
     * 是否支持周期。 - true：是 - false：否
     * @return isSupportPeriod
     */
    public Boolean getIsSupportPeriod() {
        return isSupportPeriod;
    }

    public void setIsSupportPeriod(Boolean isSupportPeriod) {
        this.isSupportPeriod = isSupportPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchInfo that = (SwitchInfo) obj;
        return Objects.equals(this.isSupportUnibuy, that.isSupportUnibuy)
            && Objects.equals(this.isSupportFloatIpv6, that.isSupportFloatIpv6)
            && Objects.equals(this.isSupportAdminLogin, that.isSupportAdminLogin)
            && Objects.equals(this.isSupportUpdateHa, that.isSupportUpdateHa)
            && Objects.equals(this.isSupportTms, that.isSupportTms)
            && Objects.equals(this.isSupportEps, that.isSupportEps)
            && Objects.equals(this.isSupportIamLogin, that.isSupportIamLogin)
            && Objects.equals(this.isSupportIpv6, that.isSupportIpv6)
            && Objects.equals(this.isSupportHa, that.isSupportHa)
            && Objects.equals(this.isSupportReset, that.isSupportReset)
            && Objects.equals(this.isSupportUpgradeInstance, that.isSupportUpgradeInstance)
            && Objects.equals(this.isSupportChangeSecurityGroup, that.isSupportChangeSecurityGroup)
            && Objects.equals(this.isSupportManuallyIp, that.isSupportManuallyIp)
            && Objects.equals(this.isSupportCapacityExpantion, that.isSupportCapacityExpantion)
            && Objects.equals(this.isSupportHaExpantion, that.isSupportHaExpantion)
            && Objects.equals(this.isSupportAgencyAuthorize, that.isSupportAgencyAuthorize)
            && Objects.equals(this.isSupportChangeVpc, that.isSupportChangeVpc)
            && Objects.equals(this.isSupportCluster, that.isSupportCluster)
            && Objects.equals(this.isSupportOndemand, that.isSupportOndemand)
            && Objects.equals(this.isSupportPeriod, that.isSupportPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSupportUnibuy,
            isSupportFloatIpv6,
            isSupportAdminLogin,
            isSupportUpdateHa,
            isSupportTms,
            isSupportEps,
            isSupportIamLogin,
            isSupportIpv6,
            isSupportHa,
            isSupportReset,
            isSupportUpgradeInstance,
            isSupportChangeSecurityGroup,
            isSupportManuallyIp,
            isSupportCapacityExpantion,
            isSupportHaExpantion,
            isSupportAgencyAuthorize,
            isSupportChangeVpc,
            isSupportCluster,
            isSupportOndemand,
            isSupportPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchInfo {\n");
        sb.append("    isSupportUnibuy: ").append(toIndentedString(isSupportUnibuy)).append("\n");
        sb.append("    isSupportFloatIpv6: ").append(toIndentedString(isSupportFloatIpv6)).append("\n");
        sb.append("    isSupportAdminLogin: ").append(toIndentedString(isSupportAdminLogin)).append("\n");
        sb.append("    isSupportUpdateHa: ").append(toIndentedString(isSupportUpdateHa)).append("\n");
        sb.append("    isSupportTms: ").append(toIndentedString(isSupportTms)).append("\n");
        sb.append("    isSupportEps: ").append(toIndentedString(isSupportEps)).append("\n");
        sb.append("    isSupportIamLogin: ").append(toIndentedString(isSupportIamLogin)).append("\n");
        sb.append("    isSupportIpv6: ").append(toIndentedString(isSupportIpv6)).append("\n");
        sb.append("    isSupportHa: ").append(toIndentedString(isSupportHa)).append("\n");
        sb.append("    isSupportReset: ").append(toIndentedString(isSupportReset)).append("\n");
        sb.append("    isSupportUpgradeInstance: ").append(toIndentedString(isSupportUpgradeInstance)).append("\n");
        sb.append("    isSupportChangeSecurityGroup: ")
            .append(toIndentedString(isSupportChangeSecurityGroup))
            .append("\n");
        sb.append("    isSupportManuallyIp: ").append(toIndentedString(isSupportManuallyIp)).append("\n");
        sb.append("    isSupportCapacityExpantion: ").append(toIndentedString(isSupportCapacityExpantion)).append("\n");
        sb.append("    isSupportHaExpantion: ").append(toIndentedString(isSupportHaExpantion)).append("\n");
        sb.append("    isSupportAgencyAuthorize: ").append(toIndentedString(isSupportAgencyAuthorize)).append("\n");
        sb.append("    isSupportChangeVpc: ").append(toIndentedString(isSupportChangeVpc)).append("\n");
        sb.append("    isSupportCluster: ").append(toIndentedString(isSupportCluster)).append("\n");
        sb.append("    isSupportOndemand: ").append(toIndentedString(isSupportOndemand)).append("\n");
        sb.append("    isSupportPeriod: ").append(toIndentedString(isSupportPeriod)).append("\n");
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

package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowRuleRestrictionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_restrict_rule_switch")

    private Boolean appRestrictRuleSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_control_mode")

    private Integer appControlMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_periodic_switch")

    private Boolean appPeriodicSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_periodic_interval")

    private Integer appPeriodicInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_force_kill_proc_switch")

    private Boolean appForceKillProcSwitch;

    public ShowRuleRestrictionResponse withAppRestrictRuleSwitch(Boolean appRestrictRuleSwitch) {
        this.appRestrictRuleSwitch = appRestrictRuleSwitch;
        return this;
    }

    /**
     * 应用管控开关，false：关闭，true：打开
     * @return appRestrictRuleSwitch
     */
    public Boolean getAppRestrictRuleSwitch() {
        return appRestrictRuleSwitch;
    }

    public void setAppRestrictRuleSwitch(Boolean appRestrictRuleSwitch) {
        this.appRestrictRuleSwitch = appRestrictRuleSwitch;
    }

    public ShowRuleRestrictionResponse withAppControlMode(Integer appControlMode) {
        this.appControlMode = appControlMode;
        return this;
    }

    /**
     * 应用管控方式，0：禁止列表应用程序运行
     * @return appControlMode
     */
    public Integer getAppControlMode() {
        return appControlMode;
    }

    public void setAppControlMode(Integer appControlMode) {
        this.appControlMode = appControlMode;
    }

    public ShowRuleRestrictionResponse withAppPeriodicSwitch(Boolean appPeriodicSwitch) {
        this.appPeriodicSwitch = appPeriodicSwitch;
        return this;
    }

    /**
     * 周期性监控开关，false：关闭，true：打开
     * @return appPeriodicSwitch
     */
    public Boolean getAppPeriodicSwitch() {
        return appPeriodicSwitch;
    }

    public void setAppPeriodicSwitch(Boolean appPeriodicSwitch) {
        this.appPeriodicSwitch = appPeriodicSwitch;
    }

    public ShowRuleRestrictionResponse withAppPeriodicInterval(Integer appPeriodicInterval) {
        this.appPeriodicInterval = appPeriodicInterval;
        return this;
    }

    /**
     * 周期性监控间隔时间，单位分钟
     * @return appPeriodicInterval
     */
    public Integer getAppPeriodicInterval() {
        return appPeriodicInterval;
    }

    public void setAppPeriodicInterval(Integer appPeriodicInterval) {
        this.appPeriodicInterval = appPeriodicInterval;
    }

    public ShowRuleRestrictionResponse withAppForceKillProcSwitch(Boolean appForceKillProcSwitch) {
        this.appForceKillProcSwitch = appForceKillProcSwitch;
        return this;
    }

    /**
     * 强制kill应用开关，false：关闭，true：打开
     * @return appForceKillProcSwitch
     */
    public Boolean getAppForceKillProcSwitch() {
        return appForceKillProcSwitch;
    }

    public void setAppForceKillProcSwitch(Boolean appForceKillProcSwitch) {
        this.appForceKillProcSwitch = appForceKillProcSwitch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRuleRestrictionResponse that = (ShowRuleRestrictionResponse) obj;
        return Objects.equals(this.appRestrictRuleSwitch, that.appRestrictRuleSwitch)
            && Objects.equals(this.appControlMode, that.appControlMode)
            && Objects.equals(this.appPeriodicSwitch, that.appPeriodicSwitch)
            && Objects.equals(this.appPeriodicInterval, that.appPeriodicInterval)
            && Objects.equals(this.appForceKillProcSwitch, that.appForceKillProcSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appRestrictRuleSwitch,
            appControlMode,
            appPeriodicSwitch,
            appPeriodicInterval,
            appForceKillProcSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRuleRestrictionResponse {\n");
        sb.append("    appRestrictRuleSwitch: ").append(toIndentedString(appRestrictRuleSwitch)).append("\n");
        sb.append("    appControlMode: ").append(toIndentedString(appControlMode)).append("\n");
        sb.append("    appPeriodicSwitch: ").append(toIndentedString(appPeriodicSwitch)).append("\n");
        sb.append("    appPeriodicInterval: ").append(toIndentedString(appPeriodicInterval)).append("\n");
        sb.append("    appForceKillProcSwitch: ").append(toIndentedString(appForceKillProcSwitch)).append("\n");
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

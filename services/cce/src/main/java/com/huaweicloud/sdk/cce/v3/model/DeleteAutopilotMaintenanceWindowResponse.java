package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteAutopilotMaintenanceWindowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weekly_period")

    private String weeklyPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_hours")

    private Integer durationHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_scope")

    private String upgradeScope;

    public DeleteAutopilotMaintenanceWindowResponse withWeeklyPeriod(String weeklyPeriod) {
        this.weeklyPeriod = weeklyPeriod;
        return this;
    }

    /**
     * 升级周期，从\"Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday\"中进行选择，以英文逗号分隔 如：\"Friday,Saturday\" 
     * @return weeklyPeriod
     */
    public String getWeeklyPeriod() {
        return weeklyPeriod;
    }

    public void setWeeklyPeriod(String weeklyPeriod) {
        this.weeklyPeriod = weeklyPeriod;
    }

    public DeleteAutopilotMaintenanceWindowResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 升级起始时间（UTC时间）
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public DeleteAutopilotMaintenanceWindowResponse withDurationHours(Integer durationHours) {
        this.durationHours = durationHours;
        return this;
    }

    /**
     * 升级时长
     * @return durationHours
     */
    public Integer getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(Integer durationHours) {
        this.durationHours = durationHours;
    }

    public DeleteAutopilotMaintenanceWindowResponse withUpgradeScope(String upgradeScope) {
        this.upgradeScope = upgradeScope;
        return this;
    }

    /**
     * 升级版本范围，当前只支持小版本自动升级
     * @return upgradeScope
     */
    public String getUpgradeScope() {
        return upgradeScope;
    }

    public void setUpgradeScope(String upgradeScope) {
        this.upgradeScope = upgradeScope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteAutopilotMaintenanceWindowResponse that = (DeleteAutopilotMaintenanceWindowResponse) obj;
        return Objects.equals(this.weeklyPeriod, that.weeklyPeriod) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.durationHours, that.durationHours)
            && Objects.equals(this.upgradeScope, that.upgradeScope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weeklyPeriod, startTime, durationHours, upgradeScope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAutopilotMaintenanceWindowResponse {\n");
        sb.append("    weeklyPeriod: ").append(toIndentedString(weeklyPeriod)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    durationHours: ").append(toIndentedString(durationHours)).append("\n");
        sb.append("    upgradeScope: ").append(toIndentedString(upgradeScope)).append("\n");
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

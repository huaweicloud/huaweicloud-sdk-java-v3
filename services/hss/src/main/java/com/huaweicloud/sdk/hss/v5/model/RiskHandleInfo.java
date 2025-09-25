package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 风险处置小结
 */
public class RiskHandleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_report_info")

    private RiskHandleInfoFreeReportInfo freeReportInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vul_info")

    private RiskHandleInfoVulInfo vulInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_line_info")

    private RiskHandleInfoBaseLineInfo baseLineInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_info")

    private RiskHandleInfoAlarmInfo alarmInfo;

    public RiskHandleInfo withFreeReportInfo(RiskHandleInfoFreeReportInfo freeReportInfo) {
        this.freeReportInfo = freeReportInfo;
        return this;
    }

    public RiskHandleInfo withFreeReportInfo(Consumer<RiskHandleInfoFreeReportInfo> freeReportInfoSetter) {
        if (this.freeReportInfo == null) {
            this.freeReportInfo = new RiskHandleInfoFreeReportInfo();
            freeReportInfoSetter.accept(this.freeReportInfo);
        }

        return this;
    }

    /**
     * Get freeReportInfo
     * @return freeReportInfo
     */
    public RiskHandleInfoFreeReportInfo getFreeReportInfo() {
        return freeReportInfo;
    }

    public void setFreeReportInfo(RiskHandleInfoFreeReportInfo freeReportInfo) {
        this.freeReportInfo = freeReportInfo;
    }

    public RiskHandleInfo withVulInfo(RiskHandleInfoVulInfo vulInfo) {
        this.vulInfo = vulInfo;
        return this;
    }

    public RiskHandleInfo withVulInfo(Consumer<RiskHandleInfoVulInfo> vulInfoSetter) {
        if (this.vulInfo == null) {
            this.vulInfo = new RiskHandleInfoVulInfo();
            vulInfoSetter.accept(this.vulInfo);
        }

        return this;
    }

    /**
     * Get vulInfo
     * @return vulInfo
     */
    public RiskHandleInfoVulInfo getVulInfo() {
        return vulInfo;
    }

    public void setVulInfo(RiskHandleInfoVulInfo vulInfo) {
        this.vulInfo = vulInfo;
    }

    public RiskHandleInfo withBaseLineInfo(RiskHandleInfoBaseLineInfo baseLineInfo) {
        this.baseLineInfo = baseLineInfo;
        return this;
    }

    public RiskHandleInfo withBaseLineInfo(Consumer<RiskHandleInfoBaseLineInfo> baseLineInfoSetter) {
        if (this.baseLineInfo == null) {
            this.baseLineInfo = new RiskHandleInfoBaseLineInfo();
            baseLineInfoSetter.accept(this.baseLineInfo);
        }

        return this;
    }

    /**
     * Get baseLineInfo
     * @return baseLineInfo
     */
    public RiskHandleInfoBaseLineInfo getBaseLineInfo() {
        return baseLineInfo;
    }

    public void setBaseLineInfo(RiskHandleInfoBaseLineInfo baseLineInfo) {
        this.baseLineInfo = baseLineInfo;
    }

    public RiskHandleInfo withAlarmInfo(RiskHandleInfoAlarmInfo alarmInfo) {
        this.alarmInfo = alarmInfo;
        return this;
    }

    public RiskHandleInfo withAlarmInfo(Consumer<RiskHandleInfoAlarmInfo> alarmInfoSetter) {
        if (this.alarmInfo == null) {
            this.alarmInfo = new RiskHandleInfoAlarmInfo();
            alarmInfoSetter.accept(this.alarmInfo);
        }

        return this;
    }

    /**
     * Get alarmInfo
     * @return alarmInfo
     */
    public RiskHandleInfoAlarmInfo getAlarmInfo() {
        return alarmInfo;
    }

    public void setAlarmInfo(RiskHandleInfoAlarmInfo alarmInfo) {
        this.alarmInfo = alarmInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RiskHandleInfo that = (RiskHandleInfo) obj;
        return Objects.equals(this.freeReportInfo, that.freeReportInfo) && Objects.equals(this.vulInfo, that.vulInfo)
            && Objects.equals(this.baseLineInfo, that.baseLineInfo) && Objects.equals(this.alarmInfo, that.alarmInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freeReportInfo, vulInfo, baseLineInfo, alarmInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RiskHandleInfo {\n");
        sb.append("    freeReportInfo: ").append(toIndentedString(freeReportInfo)).append("\n");
        sb.append("    vulInfo: ").append(toIndentedString(vulInfo)).append("\n");
        sb.append("    baseLineInfo: ").append(toIndentedString(baseLineInfo)).append("\n");
        sb.append("    alarmInfo: ").append(toIndentedString(alarmInfo)).append("\n");
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

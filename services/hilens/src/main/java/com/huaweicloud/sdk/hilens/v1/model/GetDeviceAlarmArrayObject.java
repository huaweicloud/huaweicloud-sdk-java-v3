package com.huaweicloud.sdk.hilens.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备告警实体列表
 */
public class GetDeviceAlarmArrayObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_id")

    private Integer alarmId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private String level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform")

    private String platform;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact")

    private String impact;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deal_suggestion")

    private String dealSuggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public GetDeviceAlarmArrayObject withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 设备告警记录ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetDeviceAlarmArrayObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备告警名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetDeviceAlarmArrayObject withAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
        return this;
    }

    /**
     * 设备告警ID
     * @return alarmId
     */
    public Integer getAlarmId() {
        return alarmId;
    }

    public void setAlarmId(Integer alarmId) {
        this.alarmId = alarmId;
    }

    public GetDeviceAlarmArrayObject withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * 设备告警等级，紧急告警(critical)，严重告警(major)，一般告警(minor)
     * @return level
     */
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public GetDeviceAlarmArrayObject withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * 设备平台
     * @return platform
     */
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public GetDeviceAlarmArrayObject withImpact(String impact) {
        this.impact = impact;
        return this;
    }

    /**
     * 设备告警的影响
     * @return impact
     */
    public String getImpact() {
        return impact;
    }

    public void setImpact(String impact) {
        this.impact = impact;
    }

    public GetDeviceAlarmArrayObject withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 设备告警详情内容
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public GetDeviceAlarmArrayObject withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 设备告警原因
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public GetDeviceAlarmArrayObject withDealSuggestion(String dealSuggestion) {
        this.dealSuggestion = dealSuggestion;
        return this;
    }

    /**
     * 设备告警处理建议
     * @return dealSuggestion
     */
    public String getDealSuggestion() {
        return dealSuggestion;
    }

    public void setDealSuggestion(String dealSuggestion) {
        this.dealSuggestion = dealSuggestion;
    }

    public GetDeviceAlarmArrayObject withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（时间戳）
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetDeviceAlarmArrayObject getDeviceAlarmArrayObject = (GetDeviceAlarmArrayObject) o;
        return Objects.equals(this.id, getDeviceAlarmArrayObject.id)
            && Objects.equals(this.name, getDeviceAlarmArrayObject.name)
            && Objects.equals(this.alarmId, getDeviceAlarmArrayObject.alarmId)
            && Objects.equals(this.level, getDeviceAlarmArrayObject.level)
            && Objects.equals(this.platform, getDeviceAlarmArrayObject.platform)
            && Objects.equals(this.impact, getDeviceAlarmArrayObject.impact)
            && Objects.equals(this.detail, getDeviceAlarmArrayObject.detail)
            && Objects.equals(this.reason, getDeviceAlarmArrayObject.reason)
            && Objects.equals(this.dealSuggestion, getDeviceAlarmArrayObject.dealSuggestion)
            && Objects.equals(this.createTime, getDeviceAlarmArrayObject.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, alarmId, level, platform, impact, detail, reason, dealSuggestion, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetDeviceAlarmArrayObject {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    alarmId: ").append(toIndentedString(alarmId)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
        sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    dealSuggestion: ").append(toIndentedString(dealSuggestion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

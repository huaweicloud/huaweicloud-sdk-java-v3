package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TicketCreateSubTicketInfo
 */
public class TicketCreateSubTicketInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_start_time")

    private Long expectedStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expected_end_time")

    private Long expectedEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executors")

    private String executors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cooperators")

    private String cooperators;

    public TicketCreateSubTicketInfo withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释：** 变更服务。 **约束限制：** 当target_type为change_scope时，该字段需传递对应的变更服务中文名称。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public TicketCreateSubTicketInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 变更Region。 **约束限制：** 当target_type为change_scope时，该字段需传递对应的变更RegionID。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TicketCreateSubTicketInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * **参数解释：** 目标选项信息，该值可传递不同的信息，当传递变更应用时，该值传递change_scope，当传递变更计划时，该值传递child_ticket。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public TicketCreateSubTicketInfo withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * **参数解释：** 传递变更单RegionID，需和target_type配合使用。 **约束限制：** 当target_type值为child_ticket时，该值有效。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public TicketCreateSubTicketInfo withExpectedStartTime(Long expectedStartTime) {
        this.expectedStartTime = expectedStartTime;
        return this;
    }

    /**
     * **参数解释：** 变更单计划开始时间时间戳。 **约束限制：** 当target_type值为child_ticket时，该值有效。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 0
     * maximum: 9999999999999
     * @return expectedStartTime
     */
    public Long getExpectedStartTime() {
        return expectedStartTime;
    }

    public void setExpectedStartTime(Long expectedStartTime) {
        this.expectedStartTime = expectedStartTime;
    }

    public TicketCreateSubTicketInfo withExpectedEndTime(Long expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
        return this;
    }

    /**
     * **参数解释：** 变更单计划结束时间时间戳。 **约束限制：** 当target_type值为child_ticket时，该值有效。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * minimum: 0
     * maximum: 9999999999999
     * @return expectedEndTime
     */
    public Long getExpectedEndTime() {
        return expectedEndTime;
    }

    public void setExpectedEndTime(Long expectedEndTime) {
        this.expectedEndTime = expectedEndTime;
    }

    public TicketCreateSubTicketInfo withExecutors(String executors) {
        this.executors = executors;
        return this;
    }

    /**
     * **参数解释：** 变更单实施人。 **约束限制：** 当target_type值为child_ticket时，该值有效。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return executors
     */
    public String getExecutors() {
        return executors;
    }

    public void setExecutors(String executors) {
        this.executors = executors;
    }

    public TicketCreateSubTicketInfo withCooperators(String cooperators) {
        this.cooperators = cooperators;
        return this;
    }

    /**
     * **参数解释：** 变更单配合人。 **约束限制：** 当target_type值为child_ticket时，该值有效。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return cooperators
     */
    public String getCooperators() {
        return cooperators;
    }

    public void setCooperators(String cooperators) {
        this.cooperators = cooperators;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicketCreateSubTicketInfo that = (TicketCreateSubTicketInfo) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.region, that.region)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetValue, that.targetValue)
            && Objects.equals(this.expectedStartTime, that.expectedStartTime)
            && Objects.equals(this.expectedEndTime, that.expectedEndTime)
            && Objects.equals(this.executors, that.executors) && Objects.equals(this.cooperators, that.cooperators);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(appName, region, targetType, targetValue, expectedStartTime, expectedEndTime, executors, cooperators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicketCreateSubTicketInfo {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
        sb.append("    expectedStartTime: ").append(toIndentedString(expectedStartTime)).append("\n");
        sb.append("    expectedEndTime: ").append(toIndentedString(expectedEndTime)).append("\n");
        sb.append("    executors: ").append(toIndentedString(executors)).append("\n");
        sb.append("    cooperators: ").append(toIndentedString(cooperators)).append("\n");
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

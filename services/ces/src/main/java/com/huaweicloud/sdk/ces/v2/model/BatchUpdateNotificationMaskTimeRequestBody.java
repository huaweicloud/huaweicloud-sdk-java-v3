package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改通知屏蔽时间请求体
 */
public class BatchUpdateNotificationMaskTimeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_ids")

    private List<String> notificationMaskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask_type")

    private MaskType maskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private LocalDate startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private LocalDate endDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_timezone")

    private String effectiveTimezone;

    public BatchUpdateNotificationMaskTimeRequestBody withNotificationMaskIds(List<String> notificationMaskIds) {
        this.notificationMaskIds = notificationMaskIds;
        return this;
    }

    public BatchUpdateNotificationMaskTimeRequestBody addNotificationMaskIdsItem(String notificationMaskIdsItem) {
        if (this.notificationMaskIds == null) {
            this.notificationMaskIds = new ArrayList<>();
        }
        this.notificationMaskIds.add(notificationMaskIdsItem);
        return this;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withNotificationMaskIds(
        Consumer<List<String>> notificationMaskIdsSetter) {
        if (this.notificationMaskIds == null) {
            this.notificationMaskIds = new ArrayList<>();
        }
        notificationMaskIdsSetter.accept(this.notificationMaskIds);
        return this;
    }

    /**
     * 关联编号
     * @return notificationMaskIds
     */
    public List<String> getNotificationMaskIds() {
        return notificationMaskIds;
    }

    public void setNotificationMaskIds(List<String> notificationMaskIds) {
        this.notificationMaskIds = notificationMaskIds;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withMaskType(MaskType maskType) {
        this.maskType = maskType;
        return this;
    }

    /**
     * Get maskType
     * @return maskType
     */
    public MaskType getMaskType() {
        return maskType;
    }

    public void setMaskType(MaskType maskType) {
        this.maskType = maskType;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withStartDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 屏蔽起始日期，yyyy-MM-dd。
     * @return startDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 屏蔽起始时间，HH:mm:ss。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withEndDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 屏蔽截止日期，yyyy-MM-dd。
     * @return endDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 屏蔽截止时间，HH:mm:ss。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BatchUpdateNotificationMaskTimeRequestBody withEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
        return this;
    }

    /**
     * 时区，形如：\"GMT-08:00\"、\"GMT+08:00\"、\"GMT+0:00\"
     * @return effectiveTimezone
     */
    public String getEffectiveTimezone() {
        return effectiveTimezone;
    }

    public void setEffectiveTimezone(String effectiveTimezone) {
        this.effectiveTimezone = effectiveTimezone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateNotificationMaskTimeRequestBody that = (BatchUpdateNotificationMaskTimeRequestBody) obj;
        return Objects.equals(this.notificationMaskIds, that.notificationMaskIds)
            && Objects.equals(this.maskType, that.maskType) && Objects.equals(this.startDate, that.startDate)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endDate, that.endDate)
            && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.effectiveTimezone, that.effectiveTimezone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskIds, maskType, startDate, startTime, endDate, endTime, effectiveTimezone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateNotificationMaskTimeRequestBody {\n");
        sb.append("    notificationMaskIds: ").append(toIndentedString(notificationMaskIds)).append("\n");
        sb.append("    maskType: ").append(toIndentedString(maskType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    effectiveTimezone: ").append(toIndentedString(effectiveTimezone)).append("\n");
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

package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNotificationRecordsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_records")

    private List<NotificationRecordInfo> notificationRecords = null;

    public ListNotificationRecordsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListNotificationRecordsResponse withNotificationRecords(List<NotificationRecordInfo> notificationRecords) {
        this.notificationRecords = notificationRecords;
        return this;
    }

    public ListNotificationRecordsResponse addNotificationRecordsItem(NotificationRecordInfo notificationRecordsItem) {
        if (this.notificationRecords == null) {
            this.notificationRecords = new ArrayList<>();
        }
        this.notificationRecords.add(notificationRecordsItem);
        return this;
    }

    public ListNotificationRecordsResponse withNotificationRecords(
        Consumer<List<NotificationRecordInfo>> notificationRecordsSetter) {
        if (this.notificationRecords == null) {
            this.notificationRecords = new ArrayList<>();
        }
        notificationRecordsSetter.accept(this.notificationRecords);
        return this;
    }

    /**
     * 通知拦截记录信息
     * @return notificationRecords
     */
    public List<NotificationRecordInfo> getNotificationRecords() {
        return notificationRecords;
    }

    public void setNotificationRecords(List<NotificationRecordInfo> notificationRecords) {
        this.notificationRecords = notificationRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationRecordsResponse that = (ListNotificationRecordsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.notificationRecords, that.notificationRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, notificationRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationRecordsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    notificationRecords: ").append(toIndentedString(notificationRecords)).append("\n");
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

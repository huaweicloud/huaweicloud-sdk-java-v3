package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteNotificationMasksRequestBody
 */
public class BatchDeleteNotificationMasksRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_mask_ids")

    private List<String> notificationMaskIds = null;

    public BatchDeleteNotificationMasksRequestBody withNotificationMaskIds(List<String> notificationMaskIds) {
        this.notificationMaskIds = notificationMaskIds;
        return this;
    }

    public BatchDeleteNotificationMasksRequestBody addNotificationMaskIdsItem(String notificationMaskIdsItem) {
        if (this.notificationMaskIds == null) {
            this.notificationMaskIds = new ArrayList<>();
        }
        this.notificationMaskIds.add(notificationMaskIdsItem);
        return this;
    }

    public BatchDeleteNotificationMasksRequestBody withNotificationMaskIds(
        Consumer<List<String>> notificationMaskIdsSetter) {
        if (this.notificationMaskIds == null) {
            this.notificationMaskIds = new ArrayList<>();
        }
        notificationMaskIdsSetter.accept(this.notificationMaskIds);
        return this;
    }

    /**
     * 屏蔽规则编号
     * @return notificationMaskIds
     */
    public List<String> getNotificationMaskIds() {
        return notificationMaskIds;
    }

    public void setNotificationMaskIds(List<String> notificationMaskIds) {
        this.notificationMaskIds = notificationMaskIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteNotificationMasksRequestBody that = (BatchDeleteNotificationMasksRequestBody) obj;
        return Objects.equals(this.notificationMaskIds, that.notificationMaskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMaskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteNotificationMasksRequestBody {\n");
        sb.append("    notificationMaskIds: ").append(toIndentedString(notificationMaskIds)).append("\n");
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

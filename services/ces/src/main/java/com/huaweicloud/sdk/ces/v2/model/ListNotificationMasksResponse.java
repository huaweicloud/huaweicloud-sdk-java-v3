package com.huaweicloud.sdk.ces.v2.model;

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
public class ListNotificationMasksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_masks")

    private List<ListNotificationMaskRespNotificationMasks> notificationMasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListNotificationMasksResponse withNotificationMasks(
        List<ListNotificationMaskRespNotificationMasks> notificationMasks) {
        this.notificationMasks = notificationMasks;
        return this;
    }

    public ListNotificationMasksResponse addNotificationMasksItem(
        ListNotificationMaskRespNotificationMasks notificationMasksItem) {
        if (this.notificationMasks == null) {
            this.notificationMasks = new ArrayList<>();
        }
        this.notificationMasks.add(notificationMasksItem);
        return this;
    }

    public ListNotificationMasksResponse withNotificationMasks(
        Consumer<List<ListNotificationMaskRespNotificationMasks>> notificationMasksSetter) {
        if (this.notificationMasks == null) {
            this.notificationMasks = new ArrayList<>();
        }
        notificationMasksSetter.accept(this.notificationMasks);
        return this;
    }

    /**
     * **参数解释**： 通知屏蔽列表 
     * @return notificationMasks
     */
    public List<ListNotificationMaskRespNotificationMasks> getNotificationMasks() {
        return notificationMasks;
    }

    public void setNotificationMasks(List<ListNotificationMaskRespNotificationMasks> notificationMasks) {
        this.notificationMasks = notificationMasks;
    }

    public ListNotificationMasksResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 通知屏蔽列表总数 **取值范围**： [0,99999] 
     * minimum: 0
     * maximum: 99999
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNotificationMasksResponse that = (ListNotificationMasksResponse) obj;
        return Objects.equals(this.notificationMasks, that.notificationMasks) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notificationMasks, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotificationMasksResponse {\n");
        sb.append("    notificationMasks: ").append(toIndentedString(notificationMasks)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

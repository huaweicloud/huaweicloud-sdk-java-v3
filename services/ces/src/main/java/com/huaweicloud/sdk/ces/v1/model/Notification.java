package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Notification
 */
public class Notification {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notificationList")

    private List<String> notificationList = null;

    public Notification withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 告警通知类型。 **约束限制**： 不涉及。 **取值范围**： 取值如下： notification、autoscaling - notification：通知组或主题订阅 - autoscaling：AS通知，只在AS中使用 **默认取值**： 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Notification withNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
        return this;
    }

    public Notification addNotificationListItem(String notificationListItem) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        this.notificationList.add(notificationListItem);
        return this;
    }

    public Notification withNotificationList(Consumer<List<String>> notificationListSetter) {
        if (this.notificationList == null) {
            this.notificationList = new ArrayList<>();
        }
        notificationListSetter.accept(this.notificationList);
        return this;
    }

    /**
     * **参数解释**： 告警状态发生变化时，被通知对象的列表。 **约束限制**： 通知对象ID最多可以配置20个。 topicUrn可从SMN获取，具体操作请参考“查询Topic列表”。 说明：若alarm_action_enabled为true，对应的alarm_actions、ok_actions至少有一个不能为空。若alarm_actions、ok_actions同时存在时，notificationList值保持一致。 
     * @return notificationList
     */
    public List<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Notification that = (Notification) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.notificationList, that.notificationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, notificationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Notification {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    notificationList: ").append(toIndentedString(notificationList)).append("\n");
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

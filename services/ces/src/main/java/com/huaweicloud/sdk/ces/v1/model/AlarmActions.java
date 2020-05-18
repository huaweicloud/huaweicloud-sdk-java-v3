package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * AlarmActions
 */
public class AlarmActions  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="notificationList")
    
    private List<String> notificationList = new ArrayList<>();
    
    public AlarmActions withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * Get type
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AlarmActions withNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
        return this;
    }

    
    public AlarmActions addNotificationListItem(String notificationListItem) {
        this.notificationList.add(notificationListItem);
        return this;
    }

    public AlarmActions withNotificationList(Consumer<List<String>> notificationListSetter) {
        if(this.notificationList == null ){
            this.notificationList = new ArrayList<>();
        }
        notificationListSetter.accept(this.notificationList);
        return this;
    }

    /**
     * 
     * @return notificationList
     */
    public List<String> getNotificationList() {
        return notificationList;
    }

    public void setNotificationList(List<String> notificationList) {
        this.notificationList = notificationList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlarmActions alarmActions = (AlarmActions) o;
        return Objects.equals(this.type, alarmActions.type) &&
            Objects.equals(this.notificationList, alarmActions.notificationList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, notificationList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmActions {\n");
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


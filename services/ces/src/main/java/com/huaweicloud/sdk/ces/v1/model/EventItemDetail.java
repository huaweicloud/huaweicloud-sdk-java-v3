package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class EventItemDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;
    /**
     * 事件状态。  枚举类型：normal\\warning\\incident
     */
    public static class EventStateEnum {

        
        /**
         * Enum NORMAL for value: "normal"
         */
        public static final EventStateEnum NORMAL = new EventStateEnum("normal");

        
        /**
         * Enum WARNING for value: "warning"
         */
        public static final EventStateEnum WARNING = new EventStateEnum("warning");

        
        /**
         * Enum INCIDENT for value: "incident"
         */
        public static final EventStateEnum INCIDENT = new EventStateEnum("incident");

        

        public static Map<String, EventStateEnum> staticFields =
                new HashMap<String, EventStateEnum>() {
                    { 
                        put("normal", NORMAL);
                        put("warning", WARNING);
                        put("incident", INCIDENT);
                    }
                };

        private String value;

        EventStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventStateEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            EventStateEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EventStateEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EventStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EventStateEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EventStateEnum) {
                return this.value.equals(((EventStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_state")
    
    private EventStateEnum eventState;
    /**
     * 事件级别。  枚举类型：Critical, Major, Minor, Info
     */
    public static class EventLevelEnum {

        
        /**
         * Enum CRITICAL for value: "Critical"
         */
        public static final EventLevelEnum CRITICAL = new EventLevelEnum("Critical");

        
        /**
         * Enum MAJOR for value: "Major"
         */
        public static final EventLevelEnum MAJOR = new EventLevelEnum("Major");

        
        /**
         * Enum MINOR for value: "Minor"
         */
        public static final EventLevelEnum MINOR = new EventLevelEnum("Minor");

        
        /**
         * Enum INFO for value: "Info"
         */
        public static final EventLevelEnum INFO = new EventLevelEnum("Info");

        

        public static Map<String, EventLevelEnum> staticFields =
                new HashMap<String, EventLevelEnum>() {
                    { 
                        put("Critical", CRITICAL);
                        put("Major", MAJOR);
                        put("Minor", MINOR);
                        put("Info", INFO);
                    }
                };

        private String value;

        EventLevelEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EventLevelEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            EventLevelEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EventLevelEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EventLevelEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EventLevelEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EventLevelEnum) {
                return this.value.equals(((EventLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_level")
    
    private EventLevelEnum eventLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_user")
    
    private String eventUser;

    public EventItemDetail withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 事件内容，最大长度4096。
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EventItemDetail withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 所属分组。  资源分组对应的ID，必须传存在的分组ID。
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public EventItemDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID，支持字母、数字_ -：，最大长度128。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EventItemDetail withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称，支持字母 中文 数字_ -. ，最大长度128。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public EventItemDetail withEventState(EventStateEnum eventState) {
        this.eventState = eventState;
        return this;
    }

    


    /**
     * 事件状态。  枚举类型：normal\\warning\\incident
     * @return eventState
     */
    public EventStateEnum getEventState() {
        return eventState;
    }

    public void setEventState(EventStateEnum eventState) {
        this.eventState = eventState;
    }

    public EventItemDetail withEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
        return this;
    }

    


    /**
     * 事件级别。  枚举类型：Critical, Major, Minor, Info
     * @return eventLevel
     */
    public EventLevelEnum getEventLevel() {
        return eventLevel;
    }

    public void setEventLevel(EventLevelEnum eventLevel) {
        this.eventLevel = eventLevel;
    }

    public EventItemDetail withEventUser(String eventUser) {
        this.eventUser = eventUser;
        return this;
    }

    


    /**
     * 事件用户。  支持字母 数字_ -/空格 ，最大长度64。
     * @return eventUser
     */
    public String getEventUser() {
        return eventUser;
    }

    public void setEventUser(String eventUser) {
        this.eventUser = eventUser;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventItemDetail eventItemDetail = (EventItemDetail) o;
        return Objects.equals(this.content, eventItemDetail.content) &&
            Objects.equals(this.groupId, eventItemDetail.groupId) &&
            Objects.equals(this.resourceId, eventItemDetail.resourceId) &&
            Objects.equals(this.resourceName, eventItemDetail.resourceName) &&
            Objects.equals(this.eventState, eventItemDetail.eventState) &&
            Objects.equals(this.eventLevel, eventItemDetail.eventLevel) &&
            Objects.equals(this.eventUser, eventItemDetail.eventUser);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, groupId, resourceId, resourceName, eventState, eventLevel, eventUser);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventItemDetail {\n");
            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
            sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
            sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
            sb.append("    eventState: ").append(toIndentedString(eventState)).append("\n");
            sb.append("    eventLevel: ").append(toIndentedString(eventLevel)).append("\n");
            sb.append("    eventUser: ").append(toIndentedString(eventUser)).append("\n");
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


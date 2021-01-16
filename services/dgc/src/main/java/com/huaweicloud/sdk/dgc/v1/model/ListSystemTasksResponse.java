package com.huaweicloud.sdk.dgc.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dgc.v1.model.SubTaskStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSystemTasksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lastUpdate")
    
    private String lastUpdate;
    /**
     * Gets or Sets status
     */
    public static final class StatusEnum {

        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StatusEnum RUNNING = new StatusEnum("RUNNING");
        
        /**
         * Enum SUCCESSFUL for value: "SUCCESSFUL"
         */
        public static final StatusEnum SUCCESSFUL = new StatusEnum("SUCCESSFUL");
        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("SUCCESSFUL", SUCCESSFUL);
            map.put("FAILED", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subTasks")
    
    private List<SubTaskStatus> subTasks = null;
    
    public ListSystemTasksResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListSystemTasksResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListSystemTasksResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * Get startTime
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListSystemTasksResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * Get endTime
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListSystemTasksResponse withLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }

    


    /**
     * Get lastUpdate
     * @return lastUpdate
     */
    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public ListSystemTasksResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * Get status
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ListSystemTasksResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * Get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListSystemTasksResponse withSubTasks(List<SubTaskStatus> subTasks) {
        this.subTasks = subTasks;
        return this;
    }

    
    public ListSystemTasksResponse addSubTasksItem(SubTaskStatus subTasksItem) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public ListSystemTasksResponse withSubTasks(Consumer<List<SubTaskStatus>> subTasksSetter) {
        if(this.subTasks == null ){
            this.subTasks = new ArrayList<>();
        }
        subTasksSetter.accept(this.subTasks);
        return this;
    }

    /**
     * Get subTasks
     * @return subTasks
     */
    public List<SubTaskStatus> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTaskStatus> subTasks) {
        this.subTasks = subTasks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSystemTasksResponse listSystemTasksResponse = (ListSystemTasksResponse) o;
        return Objects.equals(this.id, listSystemTasksResponse.id) &&
            Objects.equals(this.name, listSystemTasksResponse.name) &&
            Objects.equals(this.startTime, listSystemTasksResponse.startTime) &&
            Objects.equals(this.endTime, listSystemTasksResponse.endTime) &&
            Objects.equals(this.lastUpdate, listSystemTasksResponse.lastUpdate) &&
            Objects.equals(this.status, listSystemTasksResponse.status) &&
            Objects.equals(this.message, listSystemTasksResponse.message) &&
            Objects.equals(this.subTasks, listSystemTasksResponse.subTasks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, startTime, endTime, lastUpdate, status, message, subTasks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSystemTasksResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
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


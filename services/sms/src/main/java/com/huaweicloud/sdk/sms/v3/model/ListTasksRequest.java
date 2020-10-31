package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksRequest  {

    /**
     * Gets or Sets state
     */
    public static final class StateEnum {

        
        /**
         * Enum READ for value: "READ"
         */
        public static final StateEnum READ = new StateEnum("READ");
        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");
        
        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final StateEnum SYNCING = new StateEnum("SYNCING");
        
        /**
         * Enum MIGRATE_SUCCESS for value: "MIGRATE_SUCCESS"
         */
        public static final StateEnum MIGRATE_SUCCESS = new StateEnum("MIGRATE_SUCCESS");
        
        /**
         * Enum MIGRATE_FAIL for value: "MIGRATE_FAIL"
         */
        public static final StateEnum MIGRATE_FAIL = new StateEnum("MIGRATE_FAIL");
        
        /**
         * Enum ABORTING for value: "ABORTING"
         */
        public static final StateEnum ABORTING = new StateEnum("ABORTING");
        
        /**
         * Enum ABORT for value: "ABORT"
         */
        public static final StateEnum ABORT = new StateEnum("ABORT");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");
        
        /**
         * Enum SYNC_F_ROLLBACKING for value: "SYNC_F_ROLLBACKING"
         */
        public static final StateEnum SYNC_F_ROLLBACKING = new StateEnum("SYNC_F_ROLLBACKING");
        
        /**
         * Enum SYNC_F_ROLLBACK_SUCCESS for value: "SYNC_F_ROLLBACK_SUCCESS"
         */
        public static final StateEnum SYNC_F_ROLLBACK_SUCCESS = new StateEnum("SYNC_F_ROLLBACK_SUCCESS");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("READ", READ);
            map.put("RUNNING", RUNNING);
            map.put("SYNCING", SYNCING);
            map.put("MIGRATE_SUCCESS", MIGRATE_SUCCESS);
            map.put("MIGRATE_FAIL", MIGRATE_FAIL);
            map.put("ABORTING", ABORTING);
            map.put("ABORT", ABORT);
            map.put("DELETING", DELETING);
            map.put("SYNC_F_ROLLBACKING", SYNC_F_ROLLBACKING);
            map.put("SYNC_F_ROLLBACK_SUCCESS", SYNC_F_ROLLBACK_SUCCESS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="source_server_id")
    
    private String sourceServerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;

    public ListTasksRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * Get state
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ListTasksRequest withName(String name) {
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

    public ListTasksRequest withId(String id) {
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

    public ListTasksRequest withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    


    /**
     * Get sourceServerId
     * @return sourceServerId
     */
    public String getSourceServerId() {
        return sourceServerId;
    }

    public void setSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
    }

    public ListTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * minimum: 0
     * maximum: 50
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 1
     * maximum: 10
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTasksRequest listTasksRequest = (ListTasksRequest) o;
        return Objects.equals(this.state, listTasksRequest.state) &&
            Objects.equals(this.name, listTasksRequest.name) &&
            Objects.equals(this.id, listTasksRequest.id) &&
            Objects.equals(this.sourceServerId, listTasksRequest.sourceServerId) &&
            Objects.equals(this.limit, listTasksRequest.limit) &&
            Objects.equals(this.offset, listTasksRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(state, name, id, sourceServerId, limit, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceServerId: ").append(toIndentedString(sourceServerId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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


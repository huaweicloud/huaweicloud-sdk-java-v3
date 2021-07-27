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
     * 迁移任务状态
     */
    public static final class StateEnum {

        
        /**
         * Enum READY_ for value: "READY：准备就绪"
         */
        public static final StateEnum READY_ = new StateEnum("READY：准备就绪");
        
        /**
         * Enum RUNNING_ for value: "RUNNING：迁移中"
         */
        public static final StateEnum RUNNING_ = new StateEnum("RUNNING：迁移中");
        
        /**
         * Enum SYNCING_ for value: "SYNCING：同步中"
         */
        public static final StateEnum SYNCING_ = new StateEnum("SYNCING：同步中");
        
        /**
         * Enum MIGRATE_SUCCESS_ for value: "MIGRATE_SUCCESS：迁移成功"
         */
        public static final StateEnum MIGRATE_SUCCESS_ = new StateEnum("MIGRATE_SUCCESS：迁移成功");
        
        /**
         * Enum MIGRATE_FAIL_ for value: "MIGRATE_FAIL：迁移失败"
         */
        public static final StateEnum MIGRATE_FAIL_ = new StateEnum("MIGRATE_FAIL：迁移失败");
        
        /**
         * Enum ABORTING_ for value: "ABORTING：任务中止中"
         */
        public static final StateEnum ABORTING_ = new StateEnum("ABORTING：任务中止中");
        
        /**
         * Enum ABORT_ for value: "ABORT：任务中止"
         */
        public static final StateEnum ABORT_ = new StateEnum("ABORT：任务中止");
        
        /**
         * Enum DELETING_ for value: "DELETING：删除中"
         */
        public static final StateEnum DELETING_ = new StateEnum("DELETING：删除中");
        
        /**
         * Enum SYNC_F_ROLLBACKING_ for value: "SYNC_F_ROLLBACKING：同步失败回滚中"
         */
        public static final StateEnum SYNC_F_ROLLBACKING_ = new StateEnum("SYNC_F_ROLLBACKING：同步失败回滚中");
        
        /**
         * Enum SYNC_F_ROLLBACK_SUCCESS_ for value: "SYNC_F_ROLLBACK_SUCCESS：同步失败回滚成功"
         */
        public static final StateEnum SYNC_F_ROLLBACK_SUCCESS_ = new StateEnum("SYNC_F_ROLLBACK_SUCCESS：同步失败回滚成功");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("READY：准备就绪", READY_);
            map.put("RUNNING：迁移中", RUNNING_);
            map.put("SYNCING：同步中", SYNCING_);
            map.put("MIGRATE_SUCCESS：迁移成功", MIGRATE_SUCCESS_);
            map.put("MIGRATE_FAIL：迁移失败", MIGRATE_FAIL_);
            map.put("ABORTING：任务中止中", ABORTING_);
            map.put("ABORT：任务中止", ABORT_);
            map.put("DELETING：删除中", DELETING_);
            map.put("SYNC_F_ROLLBACKING：同步失败回滚中", SYNC_F_ROLLBACKING_);
            map.put("SYNC_F_ROLLBACK_SUCCESS：同步失败回滚成功", SYNC_F_ROLLBACK_SUCCESS_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
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
            if (obj instanceof StateEnum) {
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListTasksRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 迁移任务状态
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
     * 任务的名称
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
     * 任务的ID
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
     * 源端服务器的ID
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
     * 每一页记录的任务数量
     * minimum: 0
     * maximum: 200
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
     * 偏移量
     * minimum: 0
     * maximum: 65535
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListTasksRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 需要查询的企业项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
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
            Objects.equals(this.offset, listTasksRequest.offset) &&
            Objects.equals(this.enterpriseProjectId, listTasksRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(state, name, id, sourceServerId, limit, offset, enterpriseProjectId);
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
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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


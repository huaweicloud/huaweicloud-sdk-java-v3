package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListTasksRequest {

    /**
     * 迁移任务状态 READY:准备就绪 RUNNING:迁移中 SYNCING:同步中 MIGRATE_SUCCESS:迁移成功 MIGRATE_FAIL:迁移失败 ABORTING:中止中 ABORT:中止 DELETING::删除中 SYNC_F_ROLLBACKING:同步失败回滚中 SYNC_F_ROLLBACK_SUCCESS:同步失败回滚成功
     */
    public static final class StateEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final StateEnum READY = new StateEnum("READY");

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
            map.put("READY", READY);
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
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_server_id")

    private String sourceServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListTasksRequest withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 迁移任务状态 READY:准备就绪 RUNNING:迁移中 SYNCING:同步中 MIGRATE_SUCCESS:迁移成功 MIGRATE_FAIL:迁移失败 ABORTING:中止中 ABORT:中止 DELETING::删除中 SYNC_F_ROLLBACKING:同步失败回滚中 SYNC_F_ROLLBACK_SUCCESS:同步失败回滚成功
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
     * 需要查询的企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksRequest that = (ListTasksRequest) obj;
        return Objects.equals(this.state, that.state) && Objects.equals(this.name, that.name)
            && Objects.equals(this.id, that.id) && Objects.equals(this.sourceServerId, that.sourceServerId)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
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

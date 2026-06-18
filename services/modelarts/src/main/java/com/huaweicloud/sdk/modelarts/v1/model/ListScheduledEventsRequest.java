package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListScheduledEventsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspaceId")

    private String workspaceId;

    /**
     * Gets or Sets state
     */
    public static final class StateEnum {

        /**
         * Enum INQUIRING for value: "inquiring"
         */
        public static final StateEnum INQUIRING = new StateEnum("inquiring");

        /**
         * Enum SCHEDULED for value: "scheduled"
         */
        public static final StateEnum SCHEDULED = new StateEnum("scheduled");

        /**
         * Enum EXECUTING for value: "executing"
         */
        public static final StateEnum EXECUTING = new StateEnum("executing");

        /**
         * Enum COMPLETED for value: "completed"
         */
        public static final StateEnum COMPLETED = new StateEnum("completed");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StateEnum FAILED = new StateEnum("failed");

        /**
         * Enum CANCELED for value: "canceled"
         */
        public static final StateEnum CANCELED = new StateEnum("canceled");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("inquiring", INQUIRING);
            map.put("scheduled", SCHEDULED);
            map.put("executing", EXECUTING);
            map.put("completed", COMPLETED);
            map.put("failed", FAILED);
            map.put("canceled", CANCELED);
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

    private List<StateEnum> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeName")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolName")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishStartTime")

    private String publishStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishEndTime")

    private String publishEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListScheduledEventsRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID，默认值为0，取值于查询workspaces列表的接口的id字段。 **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长小于63个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListScheduledEventsRequest withState(List<StateEnum> state) {
        this.state = state;
        return this;
    }

    public ListScheduledEventsRequest addStateItem(StateEnum stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListScheduledEventsRequest withState(Consumer<List<StateEnum>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * **参数解释**：事件状态。 **约束限制**：不涉及。 **取值范围**：可选择值如下： - inquiring: 待授权, - scheduled: 待执行 - executing: 执行中 - completed: 执行成功 - failed: 执行失败 - canceled: 取消 **默认取值**：不涉及。
     * @return state
     */
    public List<StateEnum> getState() {
        return state;
    }

    public void setState(List<StateEnum> state) {
        this.state = state;
    }

    public ListScheduledEventsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListScheduledEventsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListScheduledEventsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * **参数解释**：事件类型。 **约束限制**：不涉及。 **取值范围**：可选择值如下： - system-maintenance：系统维护 - localdisk-recovery：本地盘恢复 - node_reboot：节点重启 - operation-request：运维授权 - node_maintenance：超节点维护 - node_redeploy：超节点重部署 - node_localdisk_recovery 超节点本地盘恢复 **默认取值**：不涉及。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListScheduledEventsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：计划事件ID，取值查询计划事件列表接口的event_id字段。  **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，长度小于63。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListScheduledEventsRequest withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称，取值自节点详情的metadata.name字段。 **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，小于63个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public ListScheduledEventsRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称, lite-cluster、standard才具有，取值自资源池详情的metadata.name字段。查询指定standard cluster和lite cluster下节点的计划事件时可传递该参数。 **约束限制**：系统自动生成，只能以小写字母开头，数字、中划线组成，不能以中划线结尾，小于63个字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ListScheduledEventsRequest withPublishStartTime(String publishStartTime) {
        this.publishStartTime = publishStartTime;
        return this;
    }

    /**
     * **参数解释**：事件发布开始时间,按照时间范围过滤。 **约束限制**：按照ISO8601标准表示，并使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return publishStartTime
     */
    public String getPublishStartTime() {
        return publishStartTime;
    }

    public void setPublishStartTime(String publishStartTime) {
        this.publishStartTime = publishStartTime;
    }

    public ListScheduledEventsRequest withPublishEndTime(String publishEndTime) {
        this.publishEndTime = publishEndTime;
        return this;
    }

    /**
     * **参数解释**：事件发布结束时间,按照时间范围过滤。 **约束限制**：按照ISO8601标准表示，并使用UTC +0时间，格式为yyyy-MM-ddTHH:mm:ssZ。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return publishEndTime
     */
    public String getPublishEndTime() {
        return publishEndTime;
    }

    public void setPublishEndTime(String publishEndTime) {
        this.publishEndTime = publishEndTime;
    }

    public ListScheduledEventsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**：偏移量,表示从此偏移量开始查询。 **约束限制**：不涉及。 **取值范围**：[0,1000000000]。 **默认取值**：0。
     * minimum: 0
     * maximum: 1000000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListScheduledEventsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**：指定每一页返回的最大条目数。 **约束限制**：不涉及。 **取值范围**：[1,100]。 **默认取值**：100。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsRequest that = (ListScheduledEventsRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.state, that.state)
            && Objects.equals(this.type, that.type) && Objects.equals(this.id, that.id)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.publishStartTime, that.publishStartTime)
            && Objects.equals(this.publishEndTime, that.publishEndTime) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(workspaceId, state, type, id, nodeName, poolName, publishStartTime, publishEndTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    publishStartTime: ").append(toIndentedString(publishStartTime)).append("\n");
        sb.append("    publishEndTime: ").append(toIndentedString(publishEndTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

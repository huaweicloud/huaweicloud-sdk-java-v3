package com.huaweicloud.sdk.agentarts.v1.model;

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
public class ListOpsAgentObservationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_name")

    private String agentName;

    /**
     * 智能体类型,agent单智能体,multiagents多智能体,workflow工作流,all全部
     */
    public static final class AgentTypeEnum {

        /**
         * Enum AGENT for value: "agent"
         */
        public static final AgentTypeEnum AGENT = new AgentTypeEnum("agent");

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final AgentTypeEnum MULTIAGENTS = new AgentTypeEnum("multiagents");

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final AgentTypeEnum WORKFLOW = new AgentTypeEnum("workflow");

        /**
         * Enum ALL for value: "all"
         */
        public static final AgentTypeEnum ALL = new AgentTypeEnum("all");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("multiagents", MULTIAGENTS);
            map.put("workflow", WORKFLOW);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentTypeEnum(String value) {
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
        public static AgentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentTypeEnum(value));
        }

        public static AgentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentTypeEnum) {
                return this.value.equals(((AgentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentTypeEnum agentType;

    public ListOpsAgentObservationRequest withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 智能体id
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public ListOpsAgentObservationRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 查询页面，最小为1
     * minimum: 1
     * maximum: 10000
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListOpsAgentObservationRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 查询结果每页最多显示的条数
     * minimum: 1
     * maximum: 1000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOpsAgentObservationRequest withAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }

    /**
     * 智能体名称
     * @return agentName
     */
    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public ListOpsAgentObservationRequest withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * 智能体类型,agent单智能体,multiagents多智能体,workflow工作流,all全部
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentObservationRequest that = (ListOpsAgentObservationRequest) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.agentName, that.agentName)
            && Objects.equals(this.agentType, that.agentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId, page, pageSize, agentName, agentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentObservationRequest {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    agentName: ").append(toIndentedString(agentName)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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

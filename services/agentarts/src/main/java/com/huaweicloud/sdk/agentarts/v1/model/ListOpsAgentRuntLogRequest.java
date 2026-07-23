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
public class ListOpsAgentRuntLogRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_run_id")

    private String agentRunId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_type")

    private String logType;

    /**
     * 智能体类型,agent单智能体,multiagents,workflow工作流
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum AGENT for value: "agent"
         */
        public static final ResourceTypeEnum AGENT = new ResourceTypeEnum("agent");

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final ResourceTypeEnum WORKFLOW = new ResourceTypeEnum("workflow");

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final ResourceTypeEnum MULTIAGENTS = new ResourceTypeEnum("multiagents");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("agent", AGENT);
            map.put("workflow", WORKFLOW);
            map.put("multiagents", MULTIAGENTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
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
        public static ResourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResourceTypeEnum(value));
        }

        public static ResourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private ResourceTypeEnum resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scroll_id")

    private String scrollId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_desc")

    private Boolean isDesc;

    public ListOpsAgentRuntLogRequest withAgentRunId(String agentRunId) {
        this.agentRunId = agentRunId;
        return this;
    }

    /**
     * agent_run_id
     * @return agentRunId
     */
    public String getAgentRunId() {
        return agentRunId;
    }

    public void setAgentRunId(String agentRunId) {
        this.agentRunId = agentRunId;
    }

    public ListOpsAgentRuntLogRequest withLogType(String logType) {
        this.logType = logType;
        return this;
    }

    /**
     * 开始时间戳
     * @return logType
     */
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public ListOpsAgentRuntLogRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 智能体类型,agent单智能体,multiagents,workflow工作流
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListOpsAgentRuntLogRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id,兼容officeclaw场景传用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ListOpsAgentRuntLogRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间戳
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListOpsAgentRuntLogRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间戳
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListOpsAgentRuntLogRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每次返回的数量
     * minimum: 0
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListOpsAgentRuntLogRequest withScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    /**
     * 分页查询时，若上次查询的返回结果中包含字段scrollId，需要增加该字段参与分页查询
     * @return scrollId
     */
    public String getScrollId() {
        return scrollId;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    public ListOpsAgentRuntLogRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /**
     * 关键字查询
     * @return keyword
     */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListOpsAgentRuntLogRequest withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 行数，首次为空，后面上一次的最后一个的line_num
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ListOpsAgentRuntLogRequest withIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }

    /**
     * 参数解释：表示日志查询的顺序，当前支持顺序（false）或倒序查询（true）
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsAgentRuntLogRequest that = (ListOpsAgentRuntLogRequest) obj;
        return Objects.equals(this.agentRunId, that.agentRunId) && Objects.equals(this.logType, that.logType)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.scrollId, that.scrollId)
            && Objects.equals(this.keyword, that.keyword) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.isDesc, that.isDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentRunId,
            logType,
            resourceType,
            userId,
            startTime,
            endTime,
            limit,
            scrollId,
            keyword,
            lineNum,
            isDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsAgentRuntLogRequest {\n");
        sb.append("    agentRunId: ").append(toIndentedString(agentRunId)).append("\n");
        sb.append("    logType: ").append(toIndentedString(logType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
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

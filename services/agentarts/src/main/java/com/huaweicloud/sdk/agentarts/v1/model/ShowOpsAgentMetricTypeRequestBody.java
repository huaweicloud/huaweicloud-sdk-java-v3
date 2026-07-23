package com.huaweicloud.sdk.agentarts.v1.model;

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
 * ShowOpsAgentMetricTypeRequestBody
 */
public class ShowOpsAgentMetricTypeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_by")

    private List<String> groupBy = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    /**
     * 智能体类型,agent单智能体,multiagents多智能体,workflow工作流,office_ace
     */
    public static final class ResourceTypeEnum {

        /**
         * Enum MULTIAGENTS for value: "multiagents"
         */
        public static final ResourceTypeEnum MULTIAGENTS = new ResourceTypeEnum("multiagents");

        /**
         * Enum WORKFLOW for value: "workflow"
         */
        public static final ResourceTypeEnum WORKFLOW = new ResourceTypeEnum("workflow");

        /**
         * Enum AGENT for value: "agent"
         */
        public static final ResourceTypeEnum AGENT = new ResourceTypeEnum("agent");

        /**
         * Enum OFFICE_ACE for value: "office_ace"
         */
        public static final ResourceTypeEnum OFFICE_ACE = new ResourceTypeEnum("office_ace");

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("multiagents", MULTIAGENTS);
            map.put("workflow", WORKFLOW);
            map.put("agent", AGENT);
            map.put("office_ace", OFFICE_ACE);
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
    @JsonProperty(value = "filter")

    private List<MetricFilterParam> filter = null;

    public ShowOpsAgentMetricTypeRequestBody withGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
        return this;
    }

    public ShowOpsAgentMetricTypeRequestBody addGroupByItem(String groupByItem) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        this.groupBy.add(groupByItem);
        return this;
    }

    public ShowOpsAgentMetricTypeRequestBody withGroupBy(Consumer<List<String>> groupBySetter) {
        if (this.groupBy == null) {
            this.groupBy = new ArrayList<>();
        }
        groupBySetter.accept(this.groupBy);
        return this;
    }

    /**
     * 分组名
     * @return groupBy
     */
    public List<String> getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(List<String> groupBy) {
        this.groupBy = groupBy;
    }

    public ShowOpsAgentMetricTypeRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowOpsAgentMetricTypeRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowOpsAgentMetricTypeRequestBody withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowOpsAgentMetricTypeRequestBody withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 智能体或工作流的id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ShowOpsAgentMetricTypeRequestBody withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 智能体类型,agent单智能体,multiagents多智能体,workflow工作流,office_ace
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ShowOpsAgentMetricTypeRequestBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowOpsAgentMetricTypeRequestBody withFilter(List<MetricFilterParam> filter) {
        this.filter = filter;
        return this;
    }

    public ShowOpsAgentMetricTypeRequestBody addFilterItem(MetricFilterParam filterItem) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        this.filter.add(filterItem);
        return this;
    }

    public ShowOpsAgentMetricTypeRequestBody withFilter(Consumer<List<MetricFilterParam>> filterSetter) {
        if (this.filter == null) {
            this.filter = new ArrayList<>();
        }
        filterSetter.accept(this.filter);
        return this;
    }

    /**
     * 过滤条件
     * @return filter
     */
    public List<MetricFilterParam> getFilter() {
        return filter;
    }

    public void setFilter(List<MetricFilterParam> filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOpsAgentMetricTypeRequestBody that = (ShowOpsAgentMetricTypeRequestBody) obj;
        return Objects.equals(this.groupBy, that.groupBy) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.metricName, that.metricName)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupBy, startTime, endTime, metricName, resourceId, resourceType, userId, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOpsAgentMetricTypeRequestBody {\n");
        sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

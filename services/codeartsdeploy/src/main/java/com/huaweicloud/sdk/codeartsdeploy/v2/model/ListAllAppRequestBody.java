package com.huaweicloud.sdk.codeartsdeploy.v2.model;

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
 * ListAllAppRequestBody
 */
public class ListAllAppRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    /**
     * 排序字段的名称，当前仅支持name和startTime
     */
    public static final class SortNameEnum {

        /**
         * Enum NAME for value: "name"
         */
        public static final SortNameEnum NAME = new SortNameEnum("name");

        /**
         * Enum STARTTIME for value: "startTime"
         */
        public static final SortNameEnum STARTTIME = new SortNameEnum("startTime");

        private static final Map<String, SortNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortNameEnum> createStaticFields() {
            Map<String, SortNameEnum> map = new HashMap<>();
            map.put("name", NAME);
            map.put("startTime", STARTTIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortNameEnum(String value) {
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
        public static SortNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortNameEnum(value));
        }

        public static SortNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortNameEnum) {
                return this.value.equals(((SortNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private SortNameEnum sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_by")

    private String sortBy;

    /**
     * 应用最后一次执行的状态
     */
    public static final class StatesEnum {

        /**
         * Enum ABORT for value: "abort"
         */
        public static final StatesEnum ABORT = new StatesEnum("abort");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final StatesEnum FAILED = new StatesEnum("failed");

        /**
         * Enum NOT_STARTED for value: "not_started"
         */
        public static final StatesEnum NOT_STARTED = new StatesEnum("not_started");

        /**
         * Enum PENDING for value: "pending"
         */
        public static final StatesEnum PENDING = new StatesEnum("pending");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final StatesEnum RUNNING = new StatesEnum("running");

        /**
         * Enum SUCCEEDED for value: "succeeded"
         */
        public static final StatesEnum SUCCEEDED = new StatesEnum("succeeded");

        /**
         * Enum TIMEOUT for value: "timeout"
         */
        public static final StatesEnum TIMEOUT = new StatesEnum("timeout");

        /**
         * Enum NOT_EXECUTED for value: "not_executed"
         */
        public static final StatesEnum NOT_EXECUTED = new StatesEnum("not_executed");

        private static final Map<String, StatesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatesEnum> createStaticFields() {
            Map<String, StatesEnum> map = new HashMap<>();
            map.put("abort", ABORT);
            map.put("failed", FAILED);
            map.put("not_started", NOT_STARTED);
            map.put("pending", PENDING);
            map.put("running", RUNNING);
            map.put("succeeded", SUCCEEDED);
            map.put("timeout", TIMEOUT);
            map.put("not_executed", NOT_EXECUTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatesEnum(String value) {
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
        public static StatesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatesEnum(value));
        }

        public static StatesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatesEnum) {
                return this.value.equals(((StatesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<StatesEnum> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public ListAllAppRequestBody withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListAllAppRequestBody withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页页码， 表示从此页开始查询， page大于等于1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListAllAppRequestBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页显示的条目数量，size小于等于100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListAllAppRequestBody withSortName(SortNameEnum sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序字段的名称，当前仅支持name和startTime
     * @return sortName
     */
    public SortNameEnum getSortName() {
        return sortName;
    }

    public void setSortName(SortNameEnum sortName) {
        this.sortName = sortName;
    }

    public ListAllAppRequestBody withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序顺序，正序（ASC）或者逆序（DESC)
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public ListAllAppRequestBody withStates(List<StatesEnum> states) {
        this.states = states;
        return this;
    }

    public ListAllAppRequestBody addStatesItem(StatesEnum statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public ListAllAppRequestBody withStates(Consumer<List<StatesEnum>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 应用状态列表，支持查询以下状态： abort: 部署中止 failed: 部署失败 not_started: 取消执行 pending: 排队中 running: 正在部署 succeeded: 部署成功 timeout: 部署超时 not_executed: 未执行 
     * @return states
     */
    public List<StatesEnum> getStates() {
        return states;
    }

    public void setStates(List<StatesEnum> states) {
        this.states = states;
    }

    public ListAllAppRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 应用的分组id，传入no_grouped为查询未分组的应用
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAllAppRequestBody that = (ListAllAppRequestBody) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.size, that.size) && Objects.equals(this.sortName, that.sortName)
            && Objects.equals(this.sortBy, that.sortBy) && Objects.equals(this.states, that.states)
            && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, page, size, sortName, sortBy, states, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAllAppRequestBody {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

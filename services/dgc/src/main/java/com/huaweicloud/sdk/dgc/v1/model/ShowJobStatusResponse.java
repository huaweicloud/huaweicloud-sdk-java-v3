package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 作业状态： - STARTING：启动中 - NORMAL：正常 - EXCEPTION：异常 - STOPPING： 停止中 - STOPPED：停止 - PAUSE: 暂停 - ABNORMAL: 运行异常/失败 - DISABLE: 节点禁用 - OVERLOAD: 繁忙 - INIT: 初始化
     */
    public static final class StatusEnum {

        /**
         * Enum STARTING for value: "STARTING"
         */
        public static final StatusEnum STARTING = new StatusEnum("STARTING");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");

        /**
         * Enum EXCEPTION for value: "EXCEPTION"
         */
        public static final StatusEnum EXCEPTION = new StatusEnum("EXCEPTION");

        /**
         * Enum STOPPING for value: "STOPPING"
         */
        public static final StatusEnum STOPPING = new StatusEnum("STOPPING");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

        /**
         * Enum PAUSE for value: "PAUSE"
         */
        public static final StatusEnum PAUSE = new StatusEnum("PAUSE");

        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("ABNORMAL");

        /**
         * Enum DISABLE for value: "DISABLE"
         */
        public static final StatusEnum DISABLE = new StatusEnum("DISABLE");

        /**
         * Enum OVERLOAD for value: "OVERLOAD"
         */
        public static final StatusEnum OVERLOAD = new StatusEnum("OVERLOAD");

        /**
         * Enum INIT for value: "INIT"
         */
        public static final StatusEnum INIT = new StatusEnum("INIT");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("STARTING", STARTING);
            map.put("NORMAL", NORMAL);
            map.put("EXCEPTION", EXCEPTION);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
            map.put("PAUSE", PAUSE);
            map.put("ABNORMAL", ABNORMAL);
            map.put("DISABLE", DISABLE);
            map.put("OVERLOAD", OVERLOAD);
            map.put("INIT", INIT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starttime")

    private String starttime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<RealTimeNodeStatus> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createUser")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastModifiyUser")

    private String lastModifiyUser;

    public ShowJobStatusResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobStatusResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态： - STARTING：启动中 - NORMAL：正常 - EXCEPTION：异常 - STOPPING： 停止中 - STOPPED：停止 - PAUSE: 暂停 - ABNORMAL: 运行异常/失败 - DISABLE: 节点禁用 - OVERLOAD: 繁忙 - INIT: 初始化
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ShowJobStatusResponse withStarttime(String starttime) {
        this.starttime = starttime;
        return this;
    }

    /**
     * 开始时间。
     * @return starttime
     */
    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public ShowJobStatusResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowJobStatusResponse withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * 状态最后更新时间。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public ShowJobStatusResponse withNodes(List<RealTimeNodeStatus> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowJobStatusResponse addNodesItem(RealTimeNodeStatus nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowJobStatusResponse withNodes(Consumer<List<RealTimeNodeStatus>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * Get nodes
     * @return nodes
     */
    public List<RealTimeNodeStatus> getNodes() {
        return nodes;
    }

    public void setNodes(List<RealTimeNodeStatus> nodes) {
        this.nodes = nodes;
    }

    public ShowJobStatusResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowJobStatusResponse withLastModifiyUser(String lastModifiyUser) {
        this.lastModifiyUser = lastModifiyUser;
        return this;
    }

    /**
     * 最后修改人。
     * @return lastModifiyUser
     */
    public String getLastModifiyUser() {
        return lastModifiyUser;
    }

    public void setLastModifiyUser(String lastModifiyUser) {
        this.lastModifiyUser = lastModifiyUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobStatusResponse that = (ShowJobStatusResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.starttime, that.starttime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.lastModifiyUser, that.lastModifiyUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, starttime, endTime, lastUpdateTime, nodes, createUser, lastModifiyUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobStatusResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    starttime: ").append(toIndentedString(starttime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    lastModifiyUser: ").append(toIndentedString(lastModifiyUser)).append("\n");
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

package com.huaweicloud.sdk.dgc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RealTimeNodeStatus
 */
public class RealTimeNodeStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 节点状态： - STARTING：启动中 - NORMAL：正常 - EXCEPTION：异常 - STOPPING： 停止中 - STOPPED：停止 - PAUSE: 暂停 - ABNORMAL: 运行异常/失败 - DISABLE: 节点禁用 - OVERLOAD: 繁忙 - INIT: 初始化
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
    @JsonProperty(value = "logPath")

    private String logPath;

    /**
     * 节点类型
     */
    public static final class NodeTypeEnum {

        /**
         * Enum HIVESQL for value: "HiveSQL"
         */
        public static final NodeTypeEnum HIVESQL = new NodeTypeEnum("HiveSQL");

        /**
         * Enum SPARKSQL for value: "SparkSQL"
         */
        public static final NodeTypeEnum SPARKSQL = new NodeTypeEnum("SparkSQL");

        /**
         * Enum DWSSQL for value: "DWSSQL"
         */
        public static final NodeTypeEnum DWSSQL = new NodeTypeEnum("DWSSQL");

        /**
         * Enum DLISQL for value: "DLISQL"
         */
        public static final NodeTypeEnum DLISQL = new NodeTypeEnum("DLISQL");

        /**
         * Enum SHELL for value: "Shell"
         */
        public static final NodeTypeEnum SHELL = new NodeTypeEnum("Shell");

        /**
         * Enum CDMJOB for value: "CDMJob"
         */
        public static final NodeTypeEnum CDMJOB = new NodeTypeEnum("CDMJob");

        /**
         * Enum DISTRANSFERTASK for value: "DISTransferTask"
         */
        public static final NodeTypeEnum DISTRANSFERTASK = new NodeTypeEnum("DISTransferTask");

        /**
         * Enum CSJOB for value: "CSJob"
         */
        public static final NodeTypeEnum CSJOB = new NodeTypeEnum("CSJob");

        /**
         * Enum CLOUDTABLEMANAGE for value: "CloudTableManage"
         */
        public static final NodeTypeEnum CLOUDTABLEMANAGE = new NodeTypeEnum("CloudTableManage");

        /**
         * Enum OBSMANAGER for value: "OBSManager"
         */
        public static final NodeTypeEnum OBSMANAGER = new NodeTypeEnum("OBSManager");

        /**
         * Enum RESTAPI for value: "RESTAPI"
         */
        public static final NodeTypeEnum RESTAPI = new NodeTypeEnum("RESTAPI");

        /**
         * Enum MACHINELEARNING for value: "MachineLearning"
         */
        public static final NodeTypeEnum MACHINELEARNING = new NodeTypeEnum("MachineLearning");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final NodeTypeEnum SMN = new NodeTypeEnum("SMN");

        /**
         * Enum MRSSPARK for value: "MRSSpark"
         */
        public static final NodeTypeEnum MRSSPARK = new NodeTypeEnum("MRSSpark");

        /**
         * Enum MAPREDUCE for value: "MapReduce"
         */
        public static final NodeTypeEnum MAPREDUCE = new NodeTypeEnum("MapReduce");

        /**
         * Enum DLISPARK for value: "DLISpark"
         */
        public static final NodeTypeEnum DLISPARK = new NodeTypeEnum("DLISpark");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("HiveSQL", HIVESQL);
            map.put("SparkSQL", SPARKSQL);
            map.put("DWSSQL", DWSSQL);
            map.put("DLISQL", DLISQL);
            map.put("Shell", SHELL);
            map.put("CDMJob", CDMJOB);
            map.put("DISTransferTask", DISTRANSFERTASK);
            map.put("CSJob", CSJOB);
            map.put("CloudTableManage", CLOUDTABLEMANAGE);
            map.put("OBSManager", OBSMANAGER);
            map.put("RESTAPI", RESTAPI);
            map.put("MachineLearning", MACHINELEARNING);
            map.put("SMN", SMN);
            map.put("MRSSpark", MRSSPARK);
            map.put("MapReduce", MAPREDUCE);
            map.put("DLISpark", DLISPARK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
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
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeType")

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastInstanceStatus")

    private String lastInstanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runningData")

    private String runningData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendCounter")

    private String extendCounter;

    public RealTimeNodeStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealTimeNodeStatus withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态： - STARTING：启动中 - NORMAL：正常 - EXCEPTION：异常 - STOPPING： 停止中 - STOPPED：停止 - PAUSE: 暂停 - ABNORMAL: 运行异常/失败 - DISABLE: 节点禁用 - OVERLOAD: 繁忙 - INIT: 初始化
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RealTimeNodeStatus withLogPath(String logPath) {
        this.logPath = logPath;
        return this;
    }

    /**
     * 节点运行日志路径
     * @return logPath
     */
    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public RealTimeNodeStatus withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public RealTimeNodeStatus withLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
        return this;
    }

    /**
     * 上一次实例的执行状态。
     * @return lastInstanceStatus
     */
    public String getLastInstanceStatus() {
        return lastInstanceStatus;
    }

    public void setLastInstanceStatus(String lastInstanceStatus) {
        this.lastInstanceStatus = lastInstanceStatus;
    }

    public RealTimeNodeStatus withRunningData(String runningData) {
        this.runningData = runningData;
        return this;
    }

    /**
     * 节点运行时内部存放的部分数据。
     * @return runningData
     */
    public String getRunningData() {
        return runningData;
    }

    public void setRunningData(String runningData) {
        this.runningData = runningData;
    }

    public RealTimeNodeStatus withExtendCounter(String extendCounter) {
        this.extendCounter = extendCounter;
        return this;
    }

    /**
     * 扩展计数器。
     * @return extendCounter
     */
    public String getExtendCounter() {
        return extendCounter;
    }

    public void setExtendCounter(String extendCounter) {
        this.extendCounter = extendCounter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RealTimeNodeStatus that = (RealTimeNodeStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.logPath, that.logPath) && Objects.equals(this.nodeType, that.nodeType)
            && Objects.equals(this.lastInstanceStatus, that.lastInstanceStatus)
            && Objects.equals(this.runningData, that.runningData)
            && Objects.equals(this.extendCounter, that.extendCounter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, logPath, nodeType, lastInstanceStatus, runningData, extendCounter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeNodeStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    lastInstanceStatus: ").append(toIndentedString(lastInstanceStatus)).append("\n");
        sb.append("    runningData: ").append(toIndentedString(runningData)).append("\n");
        sb.append("    extendCounter: ").append(toIndentedString(extendCounter)).append("\n");
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

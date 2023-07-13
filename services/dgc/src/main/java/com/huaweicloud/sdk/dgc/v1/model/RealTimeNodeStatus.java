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
     * Gets or Sets status
     */
    public static final class StatusEnum {

        /**
         * Enum STARTTING for value: "STARTTING"
         */
        public static final StatusEnum STARTTING = new StatusEnum("STARTTING");

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

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("STARTTING", STARTTING);
            map.put("NORMAL", NORMAL);
            map.put("EXCEPTION", EXCEPTION);
            map.put("STOPPING", STOPPING);
            map.put("STOPPED", STOPPED);
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
     * Gets or Sets nodeType
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

    public RealTimeNodeStatus withName(String name) {
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

    public RealTimeNodeStatus withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
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
     * Get logPath
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
     * Get nodeType
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
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
            && Objects.equals(this.logPath, that.logPath) && Objects.equals(this.nodeType, that.nodeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status, logPath, nodeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeNodeStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

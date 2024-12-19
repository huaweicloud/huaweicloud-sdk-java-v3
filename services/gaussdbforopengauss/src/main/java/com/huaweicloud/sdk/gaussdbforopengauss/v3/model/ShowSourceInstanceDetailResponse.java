package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSourceInstanceDetailResponse extends SdkResponse {

    /**
     * 实例部署形态。集中式Ha(主备)、分布式Independent(独立部署)。
     */
    public static final class ClusterModeEnum {

        /**
         * Enum HA for value: "Ha"
         */
        public static final ClusterModeEnum HA = new ClusterModeEnum("Ha");

        /**
         * Enum INDEPENDENT for value: "Independent"
         */
        public static final ClusterModeEnum INDEPENDENT = new ClusterModeEnum("Independent");

        private static final Map<String, ClusterModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterModeEnum> createStaticFields() {
            Map<String, ClusterModeEnum> map = new HashMap<>();
            map.put("Ha", HA);
            map.put("Independent", INDEPENDENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterModeEnum(String value) {
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
        public static ClusterModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterModeEnum(value));
        }

        public static ClusterModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterModeEnum) {
                return this.value.equals(((ClusterModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_mode")

    private ClusterModeEnum clusterMode;

    /**
     * 实例模型，企业版enterprise，标准版standard，基础版basic。
     */
    public static final class InstanceModeEnum {

        /**
         * Enum BASIC for value: "basic"
         */
        public static final InstanceModeEnum BASIC = new InstanceModeEnum("basic");

        /**
         * Enum STANDARD for value: "standard"
         */
        public static final InstanceModeEnum STANDARD = new InstanceModeEnum("standard");

        /**
         * Enum ENTERPRISE for value: "enterprise"
         */
        public static final InstanceModeEnum ENTERPRISE = new InstanceModeEnum("enterprise");

        private static final Map<String, InstanceModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstanceModeEnum> createStaticFields() {
            Map<String, InstanceModeEnum> map = new HashMap<>();
            map.put("basic", BASIC);
            map.put("standard", STANDARD);
            map.put("enterprise", ENTERPRISE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstanceModeEnum(String value) {
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
        public static InstanceModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceModeEnum(value));
        }

        public static InstanceModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstanceModeEnum) {
                return this.value.equals(((InstanceModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_mode")

    private InstanceModeEnum instanceMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume_size")

    private String dataVolumeSize;

    /**
     * 解决方案模板类型。集中式Ha一般用triset，分布式Independent一般为空或者默认hws。  描述如下：  triset：高可用(1主2备)  hws：默认。
     */
    public static final class SolutionEnum {

        /**
         * Enum TRISET for value: "triset"
         */
        public static final SolutionEnum TRISET = new SolutionEnum("triset");

        /**
         * Enum HWS for value: "hws"
         */
        public static final SolutionEnum HWS = new SolutionEnum("hws");

        private static final Map<String, SolutionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SolutionEnum> createStaticFields() {
            Map<String, SolutionEnum> map = new HashMap<>();
            map.put("triset", TRISET);
            map.put("hws", HWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SolutionEnum(String value) {
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
        public static SolutionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SolutionEnum(value));
        }

        public static SolutionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SolutionEnum) {
                return this.value.equals(((SolutionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "solution")

    private SolutionEnum solution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coordinator_num")

    private Integer coordinatorNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sharding_num")

    private Integer shardingNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica_num")

    private Integer replicaNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    public ShowSourceInstanceDetailResponse withClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
        return this;
    }

    /**
     * 实例部署形态。集中式Ha(主备)、分布式Independent(独立部署)。
     * @return clusterMode
     */
    public ClusterModeEnum getClusterMode() {
        return clusterMode;
    }

    public void setClusterMode(ClusterModeEnum clusterMode) {
        this.clusterMode = clusterMode;
    }

    public ShowSourceInstanceDetailResponse withInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
        return this;
    }

    /**
     * 实例模型，企业版enterprise，标准版standard，基础版basic。
     * @return instanceMode
     */
    public InstanceModeEnum getInstanceMode() {
        return instanceMode;
    }

    public void setInstanceMode(InstanceModeEnum instanceMode) {
        this.instanceMode = instanceMode;
    }

    public ShowSourceInstanceDetailResponse withDataVolumeSize(String dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
        return this;
    }

    /**
     * 磁盘大小，单位：GB。
     * @return dataVolumeSize
     */
    public String getDataVolumeSize() {
        return dataVolumeSize;
    }

    public void setDataVolumeSize(String dataVolumeSize) {
        this.dataVolumeSize = dataVolumeSize;
    }

    public ShowSourceInstanceDetailResponse withSolution(SolutionEnum solution) {
        this.solution = solution;
        return this;
    }

    /**
     * 解决方案模板类型。集中式Ha一般用triset，分布式Independent一般为空或者默认hws。  描述如下：  triset：高可用(1主2备)  hws：默认。
     * @return solution
     */
    public SolutionEnum getSolution() {
        return solution;
    }

    public void setSolution(SolutionEnum solution) {
        this.solution = solution;
    }

    public ShowSourceInstanceDetailResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点数量。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowSourceInstanceDetailResponse withCoordinatorNum(Integer coordinatorNum) {
        this.coordinatorNum = coordinatorNum;
        return this;
    }

    /**
     * 协调节点数量。
     * @return coordinatorNum
     */
    public Integer getCoordinatorNum() {
        return coordinatorNum;
    }

    public void setCoordinatorNum(Integer coordinatorNum) {
        this.coordinatorNum = coordinatorNum;
    }

    public ShowSourceInstanceDetailResponse withShardingNum(Integer shardingNum) {
        this.shardingNum = shardingNum;
        return this;
    }

    /**
     * 分片数量。
     * @return shardingNum
     */
    public Integer getShardingNum() {
        return shardingNum;
    }

    public void setShardingNum(Integer shardingNum) {
        this.shardingNum = shardingNum;
    }

    public ShowSourceInstanceDetailResponse withReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
        return this;
    }

    /**
     * 副本数量。
     * @return replicaNum
     */
    public Integer getReplicaNum() {
        return replicaNum;
    }

    public void setReplicaNum(Integer replicaNum) {
        this.replicaNum = replicaNum;
    }

    public ShowSourceInstanceDetailResponse withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本。
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSourceInstanceDetailResponse that = (ShowSourceInstanceDetailResponse) obj;
        return Objects.equals(this.clusterMode, that.clusterMode)
            && Objects.equals(this.instanceMode, that.instanceMode)
            && Objects.equals(this.dataVolumeSize, that.dataVolumeSize) && Objects.equals(this.solution, that.solution)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.coordinatorNum, that.coordinatorNum)
            && Objects.equals(this.shardingNum, that.shardingNum) && Objects.equals(this.replicaNum, that.replicaNum)
            && Objects.equals(this.engineVersion, that.engineVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterMode,
            instanceMode,
            dataVolumeSize,
            solution,
            nodeNum,
            coordinatorNum,
            shardingNum,
            replicaNum,
            engineVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSourceInstanceDetailResponse {\n");
        sb.append("    clusterMode: ").append(toIndentedString(clusterMode)).append("\n");
        sb.append("    instanceMode: ").append(toIndentedString(instanceMode)).append("\n");
        sb.append("    dataVolumeSize: ").append(toIndentedString(dataVolumeSize)).append("\n");
        sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    coordinatorNum: ").append(toIndentedString(coordinatorNum)).append("\n");
        sb.append("    shardingNum: ").append(toIndentedString(shardingNum)).append("\n");
        sb.append("    replicaNum: ").append(toIndentedString(replicaNum)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
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

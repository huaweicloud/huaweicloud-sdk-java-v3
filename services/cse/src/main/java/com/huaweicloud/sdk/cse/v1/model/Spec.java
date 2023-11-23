package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 微服务引擎专享版的CCE规格
 */
public class Spec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engineId")

    private String engineId;

    /**
     * 微服务引擎专享版CCE集群部署类型
     */
    public static final class SpecTypeEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final SpecTypeEnum CCE = new SpecTypeEnum("CCE");

        /**
         * Enum CSE for value: "CSE"
         */
        public static final SpecTypeEnum CSE = new SpecTypeEnum("CSE");

        /**
         * Enum SPRINGCLOUD for value: "SpringCloud"
         */
        public static final SpecTypeEnum SPRINGCLOUD = new SpecTypeEnum("SpringCloud");

        private static final Map<String, SpecTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SpecTypeEnum> createStaticFields() {
            Map<String, SpecTypeEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("CSE", CSE);
            map.put("SpringCloud", SPRINGCLOUD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SpecTypeEnum(String value) {
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
        public static SpecTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SpecTypeEnum(value));
        }

        public static SpecTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SpecTypeEnum) {
                return this.value.equals(((SpecTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specType")

    private SpecTypeEnum specType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private String cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterNodes")

    private SpecClusterNode clusterNodes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParam")

    private String extendParam;

    public Spec withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 微服务引擎专享版CCE规格ID
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Spec withEngineId(String engineId) {
        this.engineId = engineId;
        return this;
    }

    /**
     * 微服务引擎专享版ID
     * @return engineId
     */
    public String getEngineId() {
        return engineId;
    }

    public void setEngineId(String engineId) {
        this.engineId = engineId;
    }

    public Spec withSpecType(SpecTypeEnum specType) {
        this.specType = specType;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群部署类型
     * @return specType
     */
    public SpecTypeEnum getSpecType() {
        return specType;
    }

    public void setSpecType(SpecTypeEnum specType) {
        this.specType = specType;
    }

    public Spec withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群信息，目前为null
     * @return cluster
     */
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public Spec withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public Spec withClusterNodes(SpecClusterNode clusterNodes) {
        this.clusterNodes = clusterNodes;
        return this;
    }

    public Spec withClusterNodes(Consumer<SpecClusterNode> clusterNodesSetter) {
        if (this.clusterNodes == null) {
            this.clusterNodes = new SpecClusterNode();
            clusterNodesSetter.accept(this.clusterNodes);
        }

        return this;
    }

    /**
     * Get clusterNodes
     * @return clusterNodes
     */
    public SpecClusterNode getClusterNodes() {
        return clusterNodes;
    }

    public void setClusterNodes(SpecClusterNode clusterNodes) {
        this.clusterNodes = clusterNodes;
    }

    public Spec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群规格
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Spec withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群所在region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Spec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Spec withExtendParam(String extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    /**
     * 微服务引擎专享版CCE集群附加参数
     * @return extendParam
     */
    public String getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(String extendParam) {
        this.extendParam = extendParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Spec that = (Spec) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.engineId, that.engineId)
            && Objects.equals(this.specType, that.specType) && Objects.equals(this.cluster, that.cluster)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterNodes, that.clusterNodes)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.region, that.region)
            && Objects.equals(this.version, that.version) && Objects.equals(this.extendParam, that.extendParam);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, engineId, specType, cluster, clusterId, clusterNodes, flavor, region, version, extendParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spec {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
        sb.append("    specType: ").append(toIndentedString(specType)).append("\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterNodes: ").append(toIndentedString(clusterNodes)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
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

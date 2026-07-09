package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：资源池集群信息，特权池才有该字段。
 */
public class PoolStatusClusters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterFlavor")

    private String clusterFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugins")

    private PoolStatusClustersPlugins plugins;

    public PoolStatusClusters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：集群名称。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PoolStatusClusters withClusterFlavor(String clusterFlavor) {
        this.clusterFlavor = clusterFlavor;
        return this;
    }

    /**
     * **参数解释**：标准池的集群规格。 **取值范围**：不涉及。
     * @return clusterFlavor
     */
    public String getClusterFlavor() {
        return clusterFlavor;
    }

    public void setClusterFlavor(String clusterFlavor) {
        this.clusterFlavor = clusterFlavor;
    }

    public PoolStatusClusters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源池集群的类型。 **取值范围**：不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PoolStatusClusters withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**：集群的版本号。 **取值范围**：不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PoolStatusClusters withPlugins(PoolStatusClustersPlugins plugins) {
        this.plugins = plugins;
        return this;
    }

    public PoolStatusClusters withPlugins(Consumer<PoolStatusClustersPlugins> pluginsSetter) {
        if (this.plugins == null) {
            this.plugins = new PoolStatusClustersPlugins();
            pluginsSetter.accept(this.plugins);
        }

        return this;
    }

    /**
     * Get plugins
     * @return plugins
     */
    public PoolStatusClustersPlugins getPlugins() {
        return plugins;
    }

    public void setPlugins(PoolStatusClustersPlugins plugins) {
        this.plugins = plugins;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolStatusClusters that = (PoolStatusClusters) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.clusterFlavor, that.clusterFlavor)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.plugins, that.plugins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, clusterFlavor, type, version, plugins);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolStatusClusters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    clusterFlavor: ").append(toIndentedString(clusterFlavor)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

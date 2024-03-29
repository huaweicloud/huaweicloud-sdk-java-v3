package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateClusterRequestDTO
 */
public class CreateClusterRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_config")

    private ClusterNodeConfig clusterNodeConfig;

    public CreateClusterRequestDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CreateClusterRequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateClusterRequestDTO withClusterNodeConfig(ClusterNodeConfig clusterNodeConfig) {
        this.clusterNodeConfig = clusterNodeConfig;
        return this;
    }

    public CreateClusterRequestDTO withClusterNodeConfig(Consumer<ClusterNodeConfig> clusterNodeConfigSetter) {
        if (this.clusterNodeConfig == null) {
            this.clusterNodeConfig = new ClusterNodeConfig();
            clusterNodeConfigSetter.accept(this.clusterNodeConfig);
        }

        return this;
    }

    /**
     * Get clusterNodeConfig
     * @return clusterNodeConfig
     */
    public ClusterNodeConfig getClusterNodeConfig() {
        return clusterNodeConfig;
    }

    public void setClusterNodeConfig(ClusterNodeConfig clusterNodeConfig) {
        this.clusterNodeConfig = clusterNodeConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClusterRequestDTO that = (CreateClusterRequestDTO) obj;
        return Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.clusterNodeConfig, that.clusterNodeConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterName, description, clusterNodeConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterRequestDTO {\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    clusterNodeConfig: ").append(toIndentedString(clusterNodeConfig)).append("\n");
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

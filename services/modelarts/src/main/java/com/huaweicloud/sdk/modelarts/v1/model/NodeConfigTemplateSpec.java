package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点配置模板信息。
 */
public class NodeConfigTemplateSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private Integer dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerLvmConfig")

    private DockerLvmConfig dockerLvmConfig;

    public NodeConfigTemplateSpec withDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * **参数解释**： 资源池节点上单容器的可用磁盘空间大小，单位G。 **取值范围**： 不涉及。
     * @return dockerBaseSize
     */
    public Integer getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public NodeConfigTemplateSpec withDockerLvmConfig(DockerLvmConfig dockerLvmConfig) {
        this.dockerLvmConfig = dockerLvmConfig;
        return this;
    }

    public NodeConfigTemplateSpec withDockerLvmConfig(Consumer<DockerLvmConfig> dockerLvmConfigSetter) {
        if (this.dockerLvmConfig == null) {
            this.dockerLvmConfig = new DockerLvmConfig();
            dockerLvmConfigSetter.accept(this.dockerLvmConfig);
        }

        return this;
    }

    /**
     * Get dockerLvmConfig
     * @return dockerLvmConfig
     */
    public DockerLvmConfig getDockerLvmConfig() {
        return dockerLvmConfig;
    }

    public void setDockerLvmConfig(DockerLvmConfig dockerLvmConfig) {
        this.dockerLvmConfig = dockerLvmConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeConfigTemplateSpec that = (NodeConfigTemplateSpec) obj;
        return Objects.equals(this.dockerBaseSize, that.dockerBaseSize)
            && Objects.equals(this.dockerLvmConfig, that.dockerLvmConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize, dockerLvmConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeConfigTemplateSpec {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    dockerLvmConfig: ").append(toIndentedString(dockerLvmConfig)).append("\n");
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

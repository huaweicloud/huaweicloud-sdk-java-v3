package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 构建任务的环境变量。
 */
public class BuildInfoParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_cmd")

    @JacksonXmlProperty(localName = "build_cmd")

    private String buildCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerfile_path")

    @JacksonXmlProperty(localName = "dockerfile_path")

    private String dockerfilePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_namespace")

    @JacksonXmlProperty(localName = "artifact_namespace")

    private String artifactNamespace;

    public BuildInfoParameters withBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
        return this;
    }

    /**
     * 编译命令。默认：  1、根目录存在build.sh：./build.sh  2、根据运行系统，示例如下：  Java和Tomcat：mvn clean package  Nodejs: npm build 
     * @return buildCmd
     */
    public String getBuildCmd() {
        return buildCmd;
    }

    public void setBuildCmd(String buildCmd) {
        this.buildCmd = buildCmd;
    }

    public BuildInfoParameters withDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
        return this;
    }

    /**
     * dockerfile地址。默认是根目录./。
     * @return dockerfilePath
     */
    public String getDockerfilePath() {
        return dockerfilePath;
    }

    public void setDockerfilePath(String dockerfilePath) {
        this.dockerfilePath = dockerfilePath;
    }

    public BuildInfoParameters withArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
        return this;
    }

    /**
     * 构建归档组织，默认cas_{project_id}。
     * @return artifactNamespace
     */
    public String getArtifactNamespace() {
        return artifactNamespace;
    }

    public void setArtifactNamespace(String artifactNamespace) {
        this.artifactNamespace = artifactNamespace;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BuildInfoParameters buildInfoParameters = (BuildInfoParameters) o;
        return Objects.equals(this.buildCmd, buildInfoParameters.buildCmd)
            && Objects.equals(this.dockerfilePath, buildInfoParameters.dockerfilePath)
            && Objects.equals(this.artifactNamespace, buildInfoParameters.artifactNamespace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildCmd, dockerfilePath, artifactNamespace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BuildInfoParameters {\n");
        sb.append("    buildCmd: ").append(toIndentedString(buildCmd)).append("\n");
        sb.append("    dockerfilePath: ").append(toIndentedString(dockerfilePath)).append("\n");
        sb.append("    artifactNamespace: ").append(toIndentedString(artifactNamespace)).append("\n");
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

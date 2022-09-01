package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点重装场景容器运行时配置
 */
public class ReinstallRuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    @JacksonXmlProperty(localName = "dockerBaseSize")

    private Integer dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    @JacksonXmlProperty(localName = "runtime")

    private Runtime runtime;

    public ReinstallRuntimeConfig withDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * 节点上单容器的可用磁盘空间大小，单位G。不配置该值或值为0时将使用默认值，Devicemapper模式下默认值为10；OverlayFS模式默认不限制单容器可用空间大小，且dockerBaseSize设置仅在新版本集群的EulerOS节点上生效。CCE节点容器运行时空间配置请参考[数据盘空间分配说明](cce_01_0341.xml)。Devicemapper模式下建议dockerBaseSize配置不超过80G，设置过大时可能会导致容器运行时初始化时间过长而启动失败，若对容器磁盘大小有特殊要求，可考虑使用挂载外部或本地存储方式代替。 
     * minimum: 10
     * maximum: 500
     * @return dockerBaseSize
     */
    public Integer getDockerBaseSize() {
        return dockerBaseSize;
    }

    public void setDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
    }

    public ReinstallRuntimeConfig withRuntime(Runtime runtime) {
        this.runtime = runtime;
        return this;
    }

    public ReinstallRuntimeConfig withRuntime(Consumer<Runtime> runtimeSetter) {
        if (this.runtime == null) {
            this.runtime = new Runtime();
            runtimeSetter.accept(this.runtime);
        }

        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public Runtime getRuntime() {
        return runtime;
    }

    public void setRuntime(Runtime runtime) {
        this.runtime = runtime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReinstallRuntimeConfig reinstallRuntimeConfig = (ReinstallRuntimeConfig) o;
        return Objects.equals(this.dockerBaseSize, reinstallRuntimeConfig.dockerBaseSize)
            && Objects.equals(this.runtime, reinstallRuntimeConfig.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallRuntimeConfig {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
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

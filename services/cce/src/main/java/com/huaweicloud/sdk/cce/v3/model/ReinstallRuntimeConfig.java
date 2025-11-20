package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点重装场景容器运行时配置
 */
public class ReinstallRuntimeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerBaseSize")

    private Integer dockerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "containerBaseSize")

    private Integer containerBaseSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    private Runtime runtime;

    public ReinstallRuntimeConfig withDockerBaseSize(Integer dockerBaseSize) {
        this.dockerBaseSize = dockerBaseSize;
        return this;
    }

    /**
     * **参数解释**: 节点上单容器的可用磁盘空间大小（已废弃，请优先使用containerBaseSize参数），单位G。  不配置该值或值为0时将使用默认值，Devicemapper模式下默认值为10；OverlayFS模式默认不限制单容器可用空间大小，且dockerBaseSize设置仅在新版本集群的EulerOS[/HCEOS2.0](tag:hws,hws_hk,ctc,cmcc)节点上生效。  CCE节点容器运行时空间配置请参考[数据盘空间分配说明](cce_01_0341.xml)。  Devicemapper模式下建议dockerBaseSize配置不超过80G，设置过大时可能会导致容器运行时初始化时间过长而启动失败，若对容器磁盘大小有特殊要求，可考虑使用挂载外部或本地存储方式代替。 **约束限制**: 不涉及 **取值范围**: 不涉及 **默认取值**: 不涉及
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

    public ReinstallRuntimeConfig withContainerBaseSize(Integer containerBaseSize) {
        this.containerBaseSize = containerBaseSize;
        return this;
    }

    /**
     * **参数解释**： 节点上单容器的可用磁盘空间大小，单位G。 > - 更新节点池时，不支持更新此参数 > - 不配置该值或值为0时将使用默认值，OverlayFS模式默认不限制单容器可用空间大小；Devicemapper模式下默认值为10，且containerBaseSize设置仅在新版本集群（v1.23.14-r0/v1.25.9-r0/v1.27.6-r0/v1.28.4-r0及以上）的EulerOS[/HCEOS2.0](tag:hws,hws_hk,ctc,cmcc)节点上生效。           > - CCE节点容器运行时空间配置请参考[数据盘空间分配说明](cce_01_0341.xml)。        > - Devicemapper模式下建议containerBaseSize配置不超过80G，设置过大时可能会导致容器运行时初始化时间过长而启动失败，若对容器磁盘大小有特殊要求，可考虑使用挂载外部或本地存储方式代替；Devicemapper模式在新版中仅有共池裸机使用，已逐步废弃。  **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * minimum: 10
     * maximum: 500
     * @return containerBaseSize
     */
    public Integer getContainerBaseSize() {
        return containerBaseSize;
    }

    public void setContainerBaseSize(Integer containerBaseSize) {
        this.containerBaseSize = containerBaseSize;
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReinstallRuntimeConfig that = (ReinstallRuntimeConfig) obj;
        return Objects.equals(this.dockerBaseSize, that.dockerBaseSize)
            && Objects.equals(this.containerBaseSize, that.containerBaseSize)
            && Objects.equals(this.runtime, that.runtime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerBaseSize, containerBaseSize, runtime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReinstallRuntimeConfig {\n");
        sb.append("    dockerBaseSize: ").append(toIndentedString(dockerBaseSize)).append("\n");
        sb.append("    containerBaseSize: ").append(toIndentedString(containerBaseSize)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点容器磁盘配置项信息。
 */
public class DockerLvmConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerThinPool")

    private Integer dockerThinPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kubernetesLV")

    private Integer kubernetesLV;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerDiskType")

    private String dockerDiskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvType")

    private String lvType;

    public DockerLvmConfig withDockerThinPool(Integer dockerThinPool) {
        this.dockerThinPool = dockerThinPool;
        return this;
    }

    /**
     * **参数解释**： 资源池节点Docker盘占数据盘的百分比。例如Docker盘大小占用数据盘20%，该参数值为20。 **取值范围**： 不涉及。
     * minimum: 10
     * @return dockerThinPool
     */
    public Integer getDockerThinPool() {
        return dockerThinPool;
    }

    public void setDockerThinPool(Integer dockerThinPool) {
        this.dockerThinPool = dockerThinPool;
    }

    public DockerLvmConfig withKubernetesLV(Integer kubernetesLV) {
        this.kubernetesLV = kubernetesLV;
        return this;
    }

    /**
     * **参数解释**： 资源池节点上kubelet占数据盘的百分比。例如Docker盘大小占用数据盘20%，该参数值为20。 **取值范围**： 不涉及。
     * minimum: 10
     * @return kubernetesLV
     */
    public Integer getKubernetesLV() {
        return kubernetesLV;
    }

    public void setKubernetesLV(Integer kubernetesLV) {
        this.kubernetesLV = kubernetesLV;
    }

    public DockerLvmConfig withDockerDiskType(String dockerDiskType) {
        this.dockerDiskType = dockerDiskType;
        return this;
    }

    /**
     * **参数解释**： 磁盘类型。 **取值范围**： 可选值如下： - evs：云硬盘 - ssd：本地SSD硬盘
     * @return dockerDiskType
     */
    public String getDockerDiskType() {
        return dockerDiskType;
    }

    public void setDockerDiskType(String dockerDiskType) {
        this.dockerDiskType = dockerDiskType;
    }

    public DockerLvmConfig withLvType(String lvType) {
        this.lvType = lvType;
        return this;
    }

    /**
     * **参数解释**： LVM写入模式。 **取值范围**： 可选值如下： - striped：条带模式，使用多块磁盘组成条带模式，能够提升磁盘性能 - linear：线性模式
     * @return lvType
     */
    public String getLvType() {
        return lvType;
    }

    public void setLvType(String lvType) {
        this.lvType = lvType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DockerLvmConfig that = (DockerLvmConfig) obj;
        return Objects.equals(this.dockerThinPool, that.dockerThinPool)
            && Objects.equals(this.kubernetesLV, that.kubernetesLV)
            && Objects.equals(this.dockerDiskType, that.dockerDiskType) && Objects.equals(this.lvType, that.lvType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dockerThinPool, kubernetesLV, dockerDiskType, lvType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DockerLvmConfig {\n");
        sb.append("    dockerThinPool: ").append(toIndentedString(dockerThinPool)).append("\n");
        sb.append("    kubernetesLV: ").append(toIndentedString(kubernetesLV)).append("\n");
        sb.append("    dockerDiskType: ").append(toIndentedString(dockerDiskType)).append("\n");
        sb.append("    lvType: ").append(toIndentedString(lvType)).append("\n");
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

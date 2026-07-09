package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：磁盘高级配置信息。
 */
public class PoolSpecModelVolumeGroupConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroup")

    private String volumeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerThinPool")

    private Integer dockerThinPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvmConfig")

    private PoolSpecModelVolumeGroupConfigsLvmConfig lvmConfig;

    public PoolSpecModelVolumeGroupConfigs withVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
        return this;
    }

    /**
     * **参数解释**：磁盘分组名称。作为dataVolumes中volumeGroup的索引。 **取值范围**：不涉及。
     * @return volumeGroup
     */
    public String getVolumeGroup() {
        return volumeGroup;
    }

    public void setVolumeGroup(String volumeGroup) {
        this.volumeGroup = volumeGroup;
    }

    public PoolSpecModelVolumeGroupConfigs withDockerThinPool(Integer dockerThinPool) {
        this.dockerThinPool = dockerThinPool;
        return this;
    }

    /**
     * **参数解释**：资源池节点容器盘占数据盘的百分比。仅磁盘分组名称为vgpaas时，即容器盘，才可指定此参数。 **取值范围**：不涉及。
     * @return dockerThinPool
     */
    public Integer getDockerThinPool() {
        return dockerThinPool;
    }

    public void setDockerThinPool(Integer dockerThinPool) {
        this.dockerThinPool = dockerThinPool;
    }

    public PoolSpecModelVolumeGroupConfigs withLvmConfig(PoolSpecModelVolumeGroupConfigsLvmConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
        return this;
    }

    public PoolSpecModelVolumeGroupConfigs withLvmConfig(
        Consumer<PoolSpecModelVolumeGroupConfigsLvmConfig> lvmConfigSetter) {
        if (this.lvmConfig == null) {
            this.lvmConfig = new PoolSpecModelVolumeGroupConfigsLvmConfig();
            lvmConfigSetter.accept(this.lvmConfig);
        }

        return this;
    }

    /**
     * Get lvmConfig
     * @return lvmConfig
     */
    public PoolSpecModelVolumeGroupConfigsLvmConfig getLvmConfig() {
        return lvmConfig;
    }

    public void setLvmConfig(PoolSpecModelVolumeGroupConfigsLvmConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolSpecModelVolumeGroupConfigs that = (PoolSpecModelVolumeGroupConfigs) obj;
        return Objects.equals(this.volumeGroup, that.volumeGroup)
            && Objects.equals(this.dockerThinPool, that.dockerThinPool)
            && Objects.equals(this.lvmConfig, that.lvmConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeGroup, dockerThinPool, lvmConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolSpecModelVolumeGroupConfigs {\n");
        sb.append("    volumeGroup: ").append(toIndentedString(volumeGroup)).append("\n");
        sb.append("    dockerThinPool: ").append(toIndentedString(dockerThinPool)).append("\n");
        sb.append("    lvmConfig: ").append(toIndentedString(lvmConfig)).append("\n");
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

package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：磁盘高级配置信息。
 */
public class VolumeGroupConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroup")

    private String volumeGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dockerThinPool")

    private Integer dockerThinPool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lvmConfig")

    private LvmConfig lvmConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<String> types = null;

    public VolumeGroupConfig withVolumeGroup(String volumeGroup) {
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

    public VolumeGroupConfig withDockerThinPool(Integer dockerThinPool) {
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

    public VolumeGroupConfig withLvmConfig(LvmConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
        return this;
    }

    public VolumeGroupConfig withLvmConfig(Consumer<LvmConfig> lvmConfigSetter) {
        if (this.lvmConfig == null) {
            this.lvmConfig = new LvmConfig();
            lvmConfigSetter.accept(this.lvmConfig);
        }

        return this;
    }

    /**
     * Get lvmConfig
     * @return lvmConfig
     */
    public LvmConfig getLvmConfig() {
        return lvmConfig;
    }

    public void setLvmConfig(LvmConfig lvmConfig) {
        this.lvmConfig = lvmConfig;
    }

    public VolumeGroupConfig withTypes(List<String> types) {
        this.types = types;
        return this;
    }

    public VolumeGroupConfig addTypesItem(String typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public VolumeGroupConfig withTypes(Consumer<List<String>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * **参数解释**：存储类型。可选项如下： - volume：云硬盘。当指定dataVolumes时，该值为缺省值。 - local：本地盘。使用本地盘必须指定该字段。
     * @return types
     */
    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VolumeGroupConfig that = (VolumeGroupConfig) obj;
        return Objects.equals(this.volumeGroup, that.volumeGroup)
            && Objects.equals(this.dockerThinPool, that.dockerThinPool)
            && Objects.equals(this.lvmConfig, that.lvmConfig) && Objects.equals(this.types, that.types);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeGroup, dockerThinPool, lvmConfig, types);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VolumeGroupConfig {\n");
        sb.append("    volumeGroup: ").append(toIndentedString(volumeGroup)).append("\n");
        sb.append("    dockerThinPool: ").append(toIndentedString(dockerThinPool)).append("\n");
        sb.append("    lvmConfig: ").append(toIndentedString(lvmConfig)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

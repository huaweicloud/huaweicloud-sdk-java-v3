package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 跨资源池迁移节点时目标资源池中节点的配置。
 */
public class MigrateResourceSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatingStep")

    private CreatingStep creatingStep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePool")

    private String nodePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rootVolume")

    private RootVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataVolumes")

    private List<DataVolumeItem> dataVolumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumeGroupConfigs")

    private List<VolumeGroupConfig> volumeGroupConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taints> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<UserTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NodeNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private ResourceExtendParams extendParams;

    public MigrateResourceSpec withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：资源规格名称，跨资源池迁移时该参数必传。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public MigrateResourceSpec withCreatingStep(CreatingStep creatingStep) {
        this.creatingStep = creatingStep;
        return this;
    }

    public MigrateResourceSpec withCreatingStep(Consumer<CreatingStep> creatingStepSetter) {
        if (this.creatingStep == null) {
            this.creatingStep = new CreatingStep();
            creatingStepSetter.accept(this.creatingStep);
        }

        return this;
    }

    /**
     * Get creatingStep
     * @return creatingStep
     */
    public CreatingStep getCreatingStep() {
        return creatingStep;
    }

    public void setCreatingStep(CreatingStep creatingStep) {
        this.creatingStep = creatingStep;
    }

    public MigrateResourceSpec withNodePool(String nodePool) {
        this.nodePool = nodePool;
        return this;
    }

    /**
     * **参数解释**：资源迁移的目标节点池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodePool
     */
    public String getNodePool() {
        return nodePool;
    }

    public void setNodePool(String nodePool) {
        this.nodePool = nodePool;
    }

    public MigrateResourceSpec withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public MigrateResourceSpec withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new RootVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public RootVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public MigrateResourceSpec withDataVolumes(List<DataVolumeItem> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public MigrateResourceSpec addDataVolumesItem(DataVolumeItem dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public MigrateResourceSpec withDataVolumes(Consumer<List<DataVolumeItem>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：目标节点池的数据盘盘信息，新建节点池时有效。 **约束限制**：不涉及。
     * @return dataVolumes
     */
    public List<DataVolumeItem> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolumeItem> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public MigrateResourceSpec withVolumeGroupConfigs(List<VolumeGroupConfig> volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
        return this;
    }

    public MigrateResourceSpec addVolumeGroupConfigsItem(VolumeGroupConfig volumeGroupConfigsItem) {
        if (this.volumeGroupConfigs == null) {
            this.volumeGroupConfigs = new ArrayList<>();
        }
        this.volumeGroupConfigs.add(volumeGroupConfigsItem);
        return this;
    }

    public MigrateResourceSpec withVolumeGroupConfigs(Consumer<List<VolumeGroupConfig>> volumeGroupConfigsSetter) {
        if (this.volumeGroupConfigs == null) {
            this.volumeGroupConfigs = new ArrayList<>();
        }
        volumeGroupConfigsSetter.accept(this.volumeGroupConfigs);
        return this;
    }

    /**
     * **参数解释**：磁盘高级配置。存在自定义数据盘时必须指定对应的高级配置，新建节点池时有效。 **约束限制**：不涉及。
     * @return volumeGroupConfigs
     */
    public List<VolumeGroupConfig> getVolumeGroupConfigs() {
        return volumeGroupConfigs;
    }

    public void setVolumeGroupConfigs(List<VolumeGroupConfig> volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
    }

    public MigrateResourceSpec withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public MigrateResourceSpec putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public MigrateResourceSpec withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：k8s标签，格式为key/value键值对，非特权池不能指定。新建节点池时有效。 **约束限制**：不涉及。
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public MigrateResourceSpec withTaints(List<Taints> taints) {
        this.taints = taints;
        return this;
    }

    public MigrateResourceSpec addTaintsItem(Taints taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public MigrateResourceSpec withTaints(Consumer<List<Taints>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * **参数解释**：支持给创建出来的节点加taints来设置反亲和性，非特权池不能指定。新建节点池时有效。 **约束限制**：不涉及。
     * @return taints
     */
    public List<Taints> getTaints() {
        return taints;
    }

    public void setTaints(List<Taints> taints) {
        this.taints = taints;
    }

    public MigrateResourceSpec withTags(List<UserTags> tags) {
        this.tags = tags;
        return this;
    }

    public MigrateResourceSpec addTagsItem(UserTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public MigrateResourceSpec withTags(Consumer<List<UserTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：资源标签。新建节点池时有效。 **约束限制**：不涉及。
     * @return tags
     */
    public List<UserTags> getTags() {
        return tags;
    }

    public void setTags(List<UserTags> tags) {
        this.tags = tags;
    }

    public MigrateResourceSpec withNetwork(NodeNetwork network) {
        this.network = network;
        return this;
    }

    public MigrateResourceSpec withNetwork(Consumer<NodeNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new NodeNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public NodeNetwork getNetwork() {
        return network;
    }

    public void setNetwork(NodeNetwork network) {
        this.network = network;
    }

    public MigrateResourceSpec withExtendParams(ResourceExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public MigrateResourceSpec withExtendParams(Consumer<ResourceExtendParams> extendParamsSetter) {
        if (this.extendParams == null) {
            this.extendParams = new ResourceExtendParams();
            extendParamsSetter.accept(this.extendParams);
        }

        return this;
    }

    /**
     * Get extendParams
     * @return extendParams
     */
    public ResourceExtendParams getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(ResourceExtendParams extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateResourceSpec that = (MigrateResourceSpec) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.creatingStep, that.creatingStep)
            && Objects.equals(this.nodePool, that.nodePool) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.volumeGroupConfigs, that.volumeGroupConfigs)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.network, that.network)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            creatingStep,
            nodePool,
            rootVolume,
            dataVolumes,
            volumeGroupConfigs,
            labels,
            taints,
            tags,
            network,
            extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateResourceSpec {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    creatingStep: ").append(toIndentedString(creatingStep)).append("\n");
        sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    volumeGroupConfigs: ").append(toIndentedString(volumeGroupConfigs)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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

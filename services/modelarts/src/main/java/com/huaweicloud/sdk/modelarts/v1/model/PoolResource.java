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
 * 资源池资源规格资源量及节点池配置数据模型。
 */
public class PoolResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxCount")

    private Integer maxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<PoolNodeAz> azs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePool")

    private String nodePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taints")

    private List<Taints> taints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<UserTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NodeNetwork network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extendParams")

    private ResourceExtendParams extendParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatingStep")

    private CreatingStep creatingStep;

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
    @JsonProperty(value = "os")

    private Os os;

    public PoolResource withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：资源规格名称，比如：modelarts.vm.gpu.t4u8。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public PoolResource withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：规格保障使用量。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PoolResource withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * **参数解释**：资源规格的弹性使用量，物理池该值和count相同[，逻辑池该值大于等于count](tag:hcs,hcso)。 **取值范围**：不涉及。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public PoolResource withAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
        return this;
    }

    public PoolResource addAzsItem(PoolNodeAz azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public PoolResource withAzs(Consumer<List<PoolNodeAz>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * **参数解释**：资源池中节点的AZ信息。
     * @return azs
     */
    public List<PoolNodeAz> getAzs() {
        return azs;
    }

    public void setAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
    }

    public PoolResource withNodePool(String nodePool) {
        this.nodePool = nodePool;
        return this;
    }

    /**
     * **参数解释**：节点池名称。比如：nodePool-1。 **取值范围**：不涉及。
     * @return nodePool
     */
    public String getNodePool() {
        return nodePool;
    }

    public void setNodePool(String nodePool) {
        this.nodePool = nodePool;
    }

    public PoolResource withTaints(List<Taints> taints) {
        this.taints = taints;
        return this;
    }

    public PoolResource addTaintsItem(Taints taintsItem) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        this.taints.add(taintsItem);
        return this;
    }

    public PoolResource withTaints(Consumer<List<Taints>> taintsSetter) {
        if (this.taints == null) {
            this.taints = new ArrayList<>();
        }
        taintsSetter.accept(this.taints);
        return this;
    }

    /**
     * **参数解释**：支持给创建出来的节点加taints来设置反亲和性，非特权池不能指定。
     * @return taints
     */
    public List<Taints> getTaints() {
        return taints;
    }

    public void setTaints(List<Taints> taints) {
        this.taints = taints;
    }

    public PoolResource withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public PoolResource putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public PoolResource withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * **参数解释**：k8s标签，格式为key/value键值对。
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public PoolResource withTags(List<UserTags> tags) {
        this.tags = tags;
        return this;
    }

    public PoolResource addTagsItem(UserTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public PoolResource withTags(Consumer<List<UserTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**：资源标签，非特权池不能指定。
     * @return tags
     */
    public List<UserTags> getTags() {
        return tags;
    }

    public void setTags(List<UserTags> tags) {
        this.tags = tags;
    }

    public PoolResource withNetwork(NodeNetwork network) {
        this.network = network;
        return this;
    }

    public PoolResource withNetwork(Consumer<NodeNetwork> networkSetter) {
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

    public PoolResource withExtendParams(ResourceExtendParams extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    public PoolResource withExtendParams(Consumer<ResourceExtendParams> extendParamsSetter) {
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

    public PoolResource withCreatingStep(CreatingStep creatingStep) {
        this.creatingStep = creatingStep;
        return this;
    }

    public PoolResource withCreatingStep(Consumer<CreatingStep> creatingStepSetter) {
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

    public PoolResource withRootVolume(RootVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public PoolResource withRootVolume(Consumer<RootVolume> rootVolumeSetter) {
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

    public PoolResource withDataVolumes(List<DataVolumeItem> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public PoolResource addDataVolumesItem(DataVolumeItem dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public PoolResource withDataVolumes(Consumer<List<DataVolumeItem>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：自定义数据盘（云硬盘）列表信息。
     * @return dataVolumes
     */
    public List<DataVolumeItem> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<DataVolumeItem> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    public PoolResource withVolumeGroupConfigs(List<VolumeGroupConfig> volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
        return this;
    }

    public PoolResource addVolumeGroupConfigsItem(VolumeGroupConfig volumeGroupConfigsItem) {
        if (this.volumeGroupConfigs == null) {
            this.volumeGroupConfigs = new ArrayList<>();
        }
        this.volumeGroupConfigs.add(volumeGroupConfigsItem);
        return this;
    }

    public PoolResource withVolumeGroupConfigs(Consumer<List<VolumeGroupConfig>> volumeGroupConfigsSetter) {
        if (this.volumeGroupConfigs == null) {
            this.volumeGroupConfigs = new ArrayList<>();
        }
        volumeGroupConfigsSetter.accept(this.volumeGroupConfigs);
        return this;
    }

    /**
     * **参数解释**：磁盘高级配置。存在自定义数据盘时必须指定对应的高级配置。
     * @return volumeGroupConfigs
     */
    public List<VolumeGroupConfig> getVolumeGroupConfigs() {
        return volumeGroupConfigs;
    }

    public void setVolumeGroupConfigs(List<VolumeGroupConfig> volumeGroupConfigs) {
        this.volumeGroupConfigs = volumeGroupConfigs;
    }

    public PoolResource withOs(Os os) {
        this.os = os;
        return this;
    }

    public PoolResource withOs(Consumer<Os> osSetter) {
        if (this.os == null) {
            this.os = new Os();
            osSetter.accept(this.os);
        }

        return this;
    }

    /**
     * Get os
     * @return os
     */
    public Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolResource that = (PoolResource) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.count, that.count)
            && Objects.equals(this.maxCount, that.maxCount) && Objects.equals(this.azs, that.azs)
            && Objects.equals(this.nodePool, that.nodePool) && Objects.equals(this.taints, that.taints)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.network, that.network) && Objects.equals(this.extendParams, that.extendParams)
            && Objects.equals(this.creatingStep, that.creatingStep) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolumes, that.dataVolumes)
            && Objects.equals(this.volumeGroupConfigs, that.volumeGroupConfigs) && Objects.equals(this.os, that.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor,
            count,
            maxCount,
            azs,
            nodePool,
            taints,
            labels,
            tags,
            network,
            extendParams,
            creatingStep,
            rootVolume,
            dataVolumes,
            volumeGroupConfigs,
            os);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolResource {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
        sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
        sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
        sb.append("    creatingStep: ").append(toIndentedString(creatingStep)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
        sb.append("    volumeGroupConfigs: ").append(toIndentedString(volumeGroupConfigs)).append("\n");
        sb.append("    os: ").append(toIndentedString(os)).append("\n");
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

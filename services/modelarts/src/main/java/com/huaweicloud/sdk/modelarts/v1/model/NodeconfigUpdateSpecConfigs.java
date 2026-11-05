package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：待更新的节点配置。支持镜像预热（image_warm_up）、CPU管理策略（cpu_manager）、缓存清理（drop_cache）、透明大页（transparent_hugepage）等配置项。 **约束限制**：仅Dedicate（专属）资源池支持修改节点配置，非专属资源池调用将返回403。镜像预热配置仅在资源池机型为支持镜像预热的裸金属规格（Ascend 910B/910C）时可用。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeconfigUpdateSpecConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_warm_up")

    private List<NodeconfigUpdateSpecConfigsImageWarmUp> imageWarmUp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_manager")

    private NodeconfigUpdateSpecConfigsCpuManager cpuManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop_cache")

    private NodeconfigUpdateSpecConfigsDropCache dropCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_hugepage")

    private NodeconfigUpdateSpecConfigsTransparentHugepage transparentHugepage;

    public NodeconfigUpdateSpecConfigs withImageWarmUp(List<NodeconfigUpdateSpecConfigsImageWarmUp> imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
        return this;
    }

    public NodeconfigUpdateSpecConfigs addImageWarmUpItem(NodeconfigUpdateSpecConfigsImageWarmUp imageWarmUpItem) {
        if (this.imageWarmUp == null) {
            this.imageWarmUp = new ArrayList<>();
        }
        this.imageWarmUp.add(imageWarmUpItem);
        return this;
    }

    public NodeconfigUpdateSpecConfigs withImageWarmUp(
        Consumer<List<NodeconfigUpdateSpecConfigsImageWarmUp>> imageWarmUpSetter) {
        if (this.imageWarmUp == null) {
            this.imageWarmUp = new ArrayList<>();
        }
        imageWarmUpSetter.accept(this.imageWarmUp);
        return this;
    }

    /**
     * **参数解释**：镜像预热配置。用于创建或删除镜像预热任务，镜像会被提前拉取到资源池节点，缩短训练任务启动时间。 **约束限制**：镜像预热任务数量上限为10；同一请求内任务名称不可重复、镜像地址不可重复；仅标准池支持，Lite资源池不支持该配置。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return imageWarmUp
     */
    public List<NodeconfigUpdateSpecConfigsImageWarmUp> getImageWarmUp() {
        return imageWarmUp;
    }

    public void setImageWarmUp(List<NodeconfigUpdateSpecConfigsImageWarmUp> imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
    }

    public NodeconfigUpdateSpecConfigs withCpuManager(NodeconfigUpdateSpecConfigsCpuManager cpuManager) {
        this.cpuManager = cpuManager;
        return this;
    }

    public NodeconfigUpdateSpecConfigs withCpuManager(
        Consumer<NodeconfigUpdateSpecConfigsCpuManager> cpuManagerSetter) {
        if (this.cpuManager == null) {
            this.cpuManager = new NodeconfigUpdateSpecConfigsCpuManager();
            cpuManagerSetter.accept(this.cpuManager);
        }

        return this;
    }

    /**
     * Get cpuManager
     * @return cpuManager
     */
    public NodeconfigUpdateSpecConfigsCpuManager getCpuManager() {
        return cpuManager;
    }

    public void setCpuManager(NodeconfigUpdateSpecConfigsCpuManager cpuManager) {
        this.cpuManager = cpuManager;
    }

    public NodeconfigUpdateSpecConfigs withDropCache(NodeconfigUpdateSpecConfigsDropCache dropCache) {
        this.dropCache = dropCache;
        return this;
    }

    public NodeconfigUpdateSpecConfigs withDropCache(Consumer<NodeconfigUpdateSpecConfigsDropCache> dropCacheSetter) {
        if (this.dropCache == null) {
            this.dropCache = new NodeconfigUpdateSpecConfigsDropCache();
            dropCacheSetter.accept(this.dropCache);
        }

        return this;
    }

    /**
     * Get dropCache
     * @return dropCache
     */
    public NodeconfigUpdateSpecConfigsDropCache getDropCache() {
        return dropCache;
    }

    public void setDropCache(NodeconfigUpdateSpecConfigsDropCache dropCache) {
        this.dropCache = dropCache;
    }

    public NodeconfigUpdateSpecConfigs withTransparentHugepage(
        NodeconfigUpdateSpecConfigsTransparentHugepage transparentHugepage) {
        this.transparentHugepage = transparentHugepage;
        return this;
    }

    public NodeconfigUpdateSpecConfigs withTransparentHugepage(
        Consumer<NodeconfigUpdateSpecConfigsTransparentHugepage> transparentHugepageSetter) {
        if (this.transparentHugepage == null) {
            this.transparentHugepage = new NodeconfigUpdateSpecConfigsTransparentHugepage();
            transparentHugepageSetter.accept(this.transparentHugepage);
        }

        return this;
    }

    /**
     * Get transparentHugepage
     * @return transparentHugepage
     */
    public NodeconfigUpdateSpecConfigsTransparentHugepage getTransparentHugepage() {
        return transparentHugepage;
    }

    public void setTransparentHugepage(NodeconfigUpdateSpecConfigsTransparentHugepage transparentHugepage) {
        this.transparentHugepage = transparentHugepage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeconfigUpdateSpecConfigs that = (NodeconfigUpdateSpecConfigs) obj;
        return Objects.equals(this.imageWarmUp, that.imageWarmUp) && Objects.equals(this.cpuManager, that.cpuManager)
            && Objects.equals(this.dropCache, that.dropCache)
            && Objects.equals(this.transparentHugepage, that.transparentHugepage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageWarmUp, cpuManager, dropCache, transparentHugepage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeconfigUpdateSpecConfigs {\n");
        sb.append("    imageWarmUp: ").append(toIndentedString(imageWarmUp)).append("\n");
        sb.append("    cpuManager: ").append(toIndentedString(cpuManager)).append("\n");
        sb.append("    dropCache: ").append(toIndentedString(dropCache)).append("\n");
        sb.append("    transparentHugepage: ").append(toIndentedString(transparentHugepage)).append("\n");
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

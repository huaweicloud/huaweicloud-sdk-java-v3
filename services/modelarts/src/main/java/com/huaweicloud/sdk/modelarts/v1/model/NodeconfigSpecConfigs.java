package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 节点自定义配置；当前支持节点绑核（cpu_manager）、缓存清理（drop_cache）、透明大页（transparent_hugepage）和镜像预热（image_warm_up）。 **约束限制**：仅Dedicate（专属）资源池支持修改节点配置，非专属资源池调用将返回403。 **取值范围**：不涉及。 **默认取值**：不涉及。
 */
public class NodeconfigSpecConfigs {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_warm_up")

    private List<NodeconfigSpecConfigsImageWarmUp> imageWarmUp = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_manager")

    private NodeconfigSpecConfigsCpuManager cpuManager;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "drop_cache")

    private NodeconfigSpecConfigsDropCache dropCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_hugepage")

    private NodeconfigSpecConfigsTransparentHugepage transparentHugepage;

    public NodeconfigSpecConfigs withImageWarmUp(List<NodeconfigSpecConfigsImageWarmUp> imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
        return this;
    }

    public NodeconfigSpecConfigs addImageWarmUpItem(NodeconfigSpecConfigsImageWarmUp imageWarmUpItem) {
        if (this.imageWarmUp == null) {
            this.imageWarmUp = new ArrayList<>();
        }
        this.imageWarmUp.add(imageWarmUpItem);
        return this;
    }

    public NodeconfigSpecConfigs withImageWarmUp(Consumer<List<NodeconfigSpecConfigsImageWarmUp>> imageWarmUpSetter) {
        if (this.imageWarmUp == null) {
            this.imageWarmUp = new ArrayList<>();
        }
        imageWarmUpSetter.accept(this.imageWarmUp);
        return this;
    }

    /**
     * **参数解释**：镜像预热任务配置列表。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return imageWarmUp
     */
    public List<NodeconfigSpecConfigsImageWarmUp> getImageWarmUp() {
        return imageWarmUp;
    }

    public void setImageWarmUp(List<NodeconfigSpecConfigsImageWarmUp> imageWarmUp) {
        this.imageWarmUp = imageWarmUp;
    }

    public NodeconfigSpecConfigs withCpuManager(NodeconfigSpecConfigsCpuManager cpuManager) {
        this.cpuManager = cpuManager;
        return this;
    }

    public NodeconfigSpecConfigs withCpuManager(Consumer<NodeconfigSpecConfigsCpuManager> cpuManagerSetter) {
        if (this.cpuManager == null) {
            this.cpuManager = new NodeconfigSpecConfigsCpuManager();
            cpuManagerSetter.accept(this.cpuManager);
        }

        return this;
    }

    /**
     * Get cpuManager
     * @return cpuManager
     */
    public NodeconfigSpecConfigsCpuManager getCpuManager() {
        return cpuManager;
    }

    public void setCpuManager(NodeconfigSpecConfigsCpuManager cpuManager) {
        this.cpuManager = cpuManager;
    }

    public NodeconfigSpecConfigs withDropCache(NodeconfigSpecConfigsDropCache dropCache) {
        this.dropCache = dropCache;
        return this;
    }

    public NodeconfigSpecConfigs withDropCache(Consumer<NodeconfigSpecConfigsDropCache> dropCacheSetter) {
        if (this.dropCache == null) {
            this.dropCache = new NodeconfigSpecConfigsDropCache();
            dropCacheSetter.accept(this.dropCache);
        }

        return this;
    }

    /**
     * Get dropCache
     * @return dropCache
     */
    public NodeconfigSpecConfigsDropCache getDropCache() {
        return dropCache;
    }

    public void setDropCache(NodeconfigSpecConfigsDropCache dropCache) {
        this.dropCache = dropCache;
    }

    public NodeconfigSpecConfigs withTransparentHugepage(NodeconfigSpecConfigsTransparentHugepage transparentHugepage) {
        this.transparentHugepage = transparentHugepage;
        return this;
    }

    public NodeconfigSpecConfigs withTransparentHugepage(
        Consumer<NodeconfigSpecConfigsTransparentHugepage> transparentHugepageSetter) {
        if (this.transparentHugepage == null) {
            this.transparentHugepage = new NodeconfigSpecConfigsTransparentHugepage();
            transparentHugepageSetter.accept(this.transparentHugepage);
        }

        return this;
    }

    /**
     * Get transparentHugepage
     * @return transparentHugepage
     */
    public NodeconfigSpecConfigsTransparentHugepage getTransparentHugepage() {
        return transparentHugepage;
    }

    public void setTransparentHugepage(NodeconfigSpecConfigsTransparentHugepage transparentHugepage) {
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
        NodeconfigSpecConfigs that = (NodeconfigSpecConfigs) obj;
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
        sb.append("class NodeconfigSpecConfigs {\n");
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

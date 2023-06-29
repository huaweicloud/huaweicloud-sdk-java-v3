package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 场景元数据。
 */
public class SceneAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<SceneComponentInfo> components = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_configs")

    private Map<String, SceneComponentInfo> defaultConfigs = null;

    public SceneAssetMeta withComponents(List<SceneComponentInfo> components) {
        this.components = components;
        return this;
    }

    public SceneAssetMeta addComponentsItem(SceneComponentInfo componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public SceneAssetMeta withComponents(Consumer<List<SceneComponentInfo>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 可操作组件列表（如屏幕，灯光，摄像机）。
     * @return components
     */
    public List<SceneComponentInfo> getComponents() {
        return components;
    }

    public void setComponents(List<SceneComponentInfo> components) {
        this.components = components;
    }

    public SceneAssetMeta withDefaultConfigs(Map<String, SceneComponentInfo> defaultConfigs) {
        this.defaultConfigs = defaultConfigs;
        return this;
    }

    public SceneAssetMeta putDefaultConfigsItem(String key, SceneComponentInfo defaultConfigsItem) {
        if (this.defaultConfigs == null) {
            this.defaultConfigs = new HashMap<>();
        }
        this.defaultConfigs.put(key, defaultConfigsItem);
        return this;
    }

    public SceneAssetMeta withDefaultConfigs(Consumer<Map<String, SceneComponentInfo>> defaultConfigsSetter) {
        if (this.defaultConfigs == null) {
            this.defaultConfigs = new HashMap<>();
        }
        defaultConfigsSetter.accept(this.defaultConfigs);
        return this;
    }

    /**
     * 默认场景设置（机位，初始人位置）。
     * @return defaultConfigs
     */
    public Map<String, SceneComponentInfo> getDefaultConfigs() {
        return defaultConfigs;
    }

    public void setDefaultConfigs(Map<String, SceneComponentInfo> defaultConfigs) {
        this.defaultConfigs = defaultConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SceneAssetMeta that = (SceneAssetMeta) obj;
        return Objects.equals(this.components, that.components)
            && Objects.equals(this.defaultConfigs, that.defaultConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, defaultConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SceneAssetMeta {\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    defaultConfigs: ").append(toIndentedString(defaultConfigs)).append("\n");
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

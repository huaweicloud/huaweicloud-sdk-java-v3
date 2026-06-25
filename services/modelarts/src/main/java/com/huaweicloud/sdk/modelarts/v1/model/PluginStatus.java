package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件状态信息。
 */
public class PluginStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "values")

    private String values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<PluginResources> resources = null;

    public PluginStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**： 插件实例的状态。 **取值范围**：可选值如下： - Pending：安装中，表示插件正在安装中。 - Running：运行中，表示插件全部实例状态都在运行中，插件正常使用。 - Updating：升级中，表示插件正在更新中。 - Abnormal：不可用，表示插件状态异常，插件不可使用。可单击状态查看失败原因。 - Deleting：删除中，表示插件正在删除中。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public PluginStatus withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 插件实例的版本。 **取值范围**： 不涉及。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PluginStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： 插件实例安装失败的详细信息。 **取值范围**： 不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public PluginStatus withValues(String values) {
        this.values = values;
        return this;
    }

    /**
     * **参数解释**： 插件实例的安装参数（各插件不同）。 **取值范围**： 不涉及。
     * @return values
     */
    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public PluginStatus withResources(List<PluginResources> resources) {
        this.resources = resources;
        return this;
    }

    public PluginStatus addResourcesItem(PluginResources resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public PluginStatus withResources(Consumer<List<PluginResources>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * **参数解释**： 插件实例占用的资源量。
     * @return resources
     */
    public List<PluginResources> getResources() {
        return resources;
    }

    public void setResources(List<PluginResources> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginStatus that = (PluginStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.version, that.version)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.values, that.values)
            && Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, version, reason, values, resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

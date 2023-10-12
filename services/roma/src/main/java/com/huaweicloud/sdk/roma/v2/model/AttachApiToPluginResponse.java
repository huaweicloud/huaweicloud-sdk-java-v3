package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AttachApiToPluginResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attached_plugins")

    private List<PluginApiAttachInfo> attachedPlugins = null;

    public AttachApiToPluginResponse withAttachedPlugins(List<PluginApiAttachInfo> attachedPlugins) {
        this.attachedPlugins = attachedPlugins;
        return this;
    }

    public AttachApiToPluginResponse addAttachedPluginsItem(PluginApiAttachInfo attachedPluginsItem) {
        if (this.attachedPlugins == null) {
            this.attachedPlugins = new ArrayList<>();
        }
        this.attachedPlugins.add(attachedPluginsItem);
        return this;
    }

    public AttachApiToPluginResponse withAttachedPlugins(Consumer<List<PluginApiAttachInfo>> attachedPluginsSetter) {
        if (this.attachedPlugins == null) {
            this.attachedPlugins = new ArrayList<>();
        }
        attachedPluginsSetter.accept(this.attachedPlugins);
        return this;
    }

    /**
     * 绑定插件信息列表。
     * @return attachedPlugins
     */
    public List<PluginApiAttachInfo> getAttachedPlugins() {
        return attachedPlugins;
    }

    public void setAttachedPlugins(List<PluginApiAttachInfo> attachedPlugins) {
        this.attachedPlugins = attachedPlugins;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachApiToPluginResponse that = (AttachApiToPluginResponse) obj;
        return Objects.equals(this.attachedPlugins, that.attachedPlugins);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachedPlugins);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachApiToPluginResponse {\n");
        sb.append("    attachedPlugins: ").append(toIndentedString(attachedPlugins)).append("\n");
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

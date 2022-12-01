package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConfigMapModelBoxDTO
 */
public class ConfigMapModelBoxDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configmap")

    private ConfigMap configmap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public ConfigMapModelBoxDTO withConfigmap(ConfigMap configmap) {
        this.configmap = configmap;
        return this;
    }

    public ConfigMapModelBoxDTO withConfigmap(Consumer<ConfigMap> configmapSetter) {
        if (this.configmap == null) {
            this.configmap = new ConfigMap();
            configmapSetter.accept(this.configmap);
        }

        return this;
    }

    /**
     * Get configmap
     * @return configmap
     */
    public ConfigMap getConfigmap() {
        return configmap;
    }

    public void setConfigmap(ConfigMap configmap) {
        this.configmap = configmap;
    }

    public ConfigMapModelBoxDTO withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID，默认为注册账号/子账号的default工作空间，可通过专业版HiLens控制台展开工作空间列表获取到工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfigMapModelBoxDTO configMapModelBoxDTO = (ConfigMapModelBoxDTO) o;
        return Objects.equals(this.configmap, configMapModelBoxDTO.configmap)
            && Objects.equals(this.workspaceId, configMapModelBoxDTO.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configmap, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfigMapModelBoxDTO {\n");
        sb.append("    configmap: ").append(toIndentedString(configmap)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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

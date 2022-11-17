package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PluginOperApiInfo
 */
public class PluginOperApiInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_id")

    private String envId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_ids")

    private List<String> apiIds = null;

    public PluginOperApiInfo withEnvId(String envId) {
        this.envId = envId;
        return this;
    }

    /**
     * 绑定API的环境编码。
     * @return envId
     */
    public String getEnvId() {
        return envId;
    }

    public void setEnvId(String envId) {
        this.envId = envId;
    }

    public PluginOperApiInfo withApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
        return this;
    }

    public PluginOperApiInfo addApiIdsItem(String apiIdsItem) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        this.apiIds.add(apiIdsItem);
        return this;
    }

    public PluginOperApiInfo withApiIds(Consumer<List<String>> apiIdsSetter) {
        if (this.apiIds == null) {
            this.apiIds = new ArrayList<>();
        }
        apiIdsSetter.accept(this.apiIds);
        return this;
    }

    /**
     * 绑定的API编码列表。
     * @return apiIds
     */
    public List<String> getApiIds() {
        return apiIds;
    }

    public void setApiIds(List<String> apiIds) {
        this.apiIds = apiIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PluginOperApiInfo pluginOperApiInfo = (PluginOperApiInfo) o;
        return Objects.equals(this.envId, pluginOperApiInfo.envId)
            && Objects.equals(this.apiIds, pluginOperApiInfo.apiIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(envId, apiIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginOperApiInfo {\n");
        sb.append("    envId: ").append(toIndentedString(envId)).append("\n");
        sb.append("    apiIds: ").append(toIndentedString(apiIds)).append("\n");
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

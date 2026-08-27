package com.huaweicloud.sdk.workspace.v2.model;

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
public class SaveImChannelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_ids")

    private List<String> configIds = null;

    public SaveImChannelsResponse withConfigIds(List<String> configIds) {
        this.configIds = configIds;
        return this;
    }

    public SaveImChannelsResponse addConfigIdsItem(String configIdsItem) {
        if (this.configIds == null) {
            this.configIds = new ArrayList<>();
        }
        this.configIds.add(configIdsItem);
        return this;
    }

    public SaveImChannelsResponse withConfigIds(Consumer<List<String>> configIdsSetter) {
        if (this.configIds == null) {
            this.configIds = new ArrayList<>();
        }
        configIdsSetter.accept(this.configIds);
        return this;
    }

    /**
     * 配置 ID 列表
     * @return configIds
     */
    public List<String> getConfigIds() {
        return configIds;
    }

    public void setConfigIds(List<String> configIds) {
        this.configIds = configIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveImChannelsResponse that = (SaveImChannelsResponse) obj;
        return Objects.equals(this.configIds, that.configIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveImChannelsResponse {\n");
        sb.append("    configIds: ").append(toIndentedString(configIds)).append("\n");
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

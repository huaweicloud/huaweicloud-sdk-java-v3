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
public class ListRemoteProviderModelsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_models")

    private List<BaseModeInfo> remoteModels = null;

    public ListRemoteProviderModelsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 远端模型总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRemoteProviderModelsResponse withRemoteModels(List<BaseModeInfo> remoteModels) {
        this.remoteModels = remoteModels;
        return this;
    }

    public ListRemoteProviderModelsResponse addRemoteModelsItem(BaseModeInfo remoteModelsItem) {
        if (this.remoteModels == null) {
            this.remoteModels = new ArrayList<>();
        }
        this.remoteModels.add(remoteModelsItem);
        return this;
    }

    public ListRemoteProviderModelsResponse withRemoteModels(Consumer<List<BaseModeInfo>> remoteModelsSetter) {
        if (this.remoteModels == null) {
            this.remoteModels = new ArrayList<>();
        }
        remoteModelsSetter.accept(this.remoteModels);
        return this;
    }

    /**
     * 远程模型列表。
     * @return remoteModels
     */
    public List<BaseModeInfo> getRemoteModels() {
        return remoteModels;
    }

    public void setRemoteModels(List<BaseModeInfo> remoteModels) {
        this.remoteModels = remoteModels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRemoteProviderModelsResponse that = (ListRemoteProviderModelsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.remoteModels, that.remoteModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, remoteModels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRemoteProviderModelsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    remoteModels: ").append(toIndentedString(remoteModels)).append("\n");
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

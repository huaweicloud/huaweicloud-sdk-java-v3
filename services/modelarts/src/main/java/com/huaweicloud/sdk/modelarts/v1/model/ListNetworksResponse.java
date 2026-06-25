package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListNetworksResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NetworkListMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<Network> items = null;

    public ListNetworksResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：资源的API版本。 **取值范围**：可选值如下： - v1：当前资源版本为v1。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListNetworksResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源的类型。 **取值范围**：可选值如下： - NetworkList：网络列表。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListNetworksResponse withMetadata(NetworkListMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListNetworksResponse withMetadata(Consumer<NetworkListMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NetworkListMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NetworkListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NetworkListMetadata metadata) {
        this.metadata = metadata;
    }

    public ListNetworksResponse withItems(List<Network> items) {
        this.items = items;
        return this;
    }

    public ListNetworksResponse addItemsItem(Network itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListNetworksResponse withItems(Consumer<List<Network>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * **参数解释**：网络资源列表。
     * @return items
     */
    public List<Network> getItems() {
        return items;
    }

    public void setItems(List<Network> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNetworksResponse that = (ListNetworksResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNetworksResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

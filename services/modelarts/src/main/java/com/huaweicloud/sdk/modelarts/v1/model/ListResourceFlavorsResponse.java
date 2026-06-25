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
public class ListResourceFlavorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ResourceFlavorListMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "items")

    private List<ResourceFlavor> items = null;

    public ListResourceFlavorsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：资源的API版本。 **取值范围**：可选值如下： - v1：当前资源版本为v1
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ListResourceFlavorsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源的类型。 **取值范围**：可选值如下： - ResourceFlavorList：资源规格列表
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ListResourceFlavorsResponse withMetadata(ResourceFlavorListMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ListResourceFlavorsResponse withMetadata(Consumer<ResourceFlavorListMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ResourceFlavorListMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ResourceFlavorListMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ResourceFlavorListMetadata metadata) {
        this.metadata = metadata;
    }

    public ListResourceFlavorsResponse withItems(List<ResourceFlavor> items) {
        this.items = items;
        return this;
    }

    public ListResourceFlavorsResponse addItemsItem(ResourceFlavor itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListResourceFlavorsResponse withItems(Consumer<List<ResourceFlavor>> itemsSetter) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 参数解释：资源规格列表。 取值范围：不涉及。
     * @return items
     */
    public List<ResourceFlavor> getItems() {
        return items;
    }

    public void setItems(List<ResourceFlavor> items) {
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
        ListResourceFlavorsResponse that = (ListResourceFlavorsResponse) obj;
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
        sb.append("class ListResourceFlavorsResponse {\n");
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

package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCollectionData
 */
public class ListCollectionData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collections")

    private List<String> collections = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<ListCollectionDetails> details = null;

    public ListCollectionData withCollections(List<String> collections) {
        this.collections = collections;
        return this;
    }

    public ListCollectionData addCollectionsItem(String collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    public ListCollectionData withCollections(Consumer<List<String>> collectionsSetter) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        collectionsSetter.accept(this.collections);
        return this;
    }

    /**
     * **参数解释：** 知识仓实例下所有collection名称列表。 **约束限制：** 不涉及。
     * @return collections
     */
    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    public ListCollectionData withDetails(List<ListCollectionDetails> details) {
        this.details = details;
        return this;
    }

    public ListCollectionData addDetailsItem(ListCollectionDetails detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public ListCollectionData withDetails(Consumer<List<ListCollectionDetails>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * **参数解释：** 知识仓实例下所有collection详细信息列表。 **约束限制：** 在指定detail字段为true时生效。
     * @return details
     */
    public List<ListCollectionDetails> getDetails() {
        return details;
    }

    public void setDetails(List<ListCollectionDetails> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCollectionData that = (ListCollectionData) obj;
        return Objects.equals(this.collections, that.collections) && Objects.equals(this.details, that.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collections, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCollectionData {\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRestoreCollectionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    @JacksonXmlProperty(localName = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collections")

    @JacksonXmlProperty(localName = "collections")

    private List<String> collections = null;

    public ListRestoreCollectionsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 集合总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListRestoreCollectionsResponse withCollections(List<String> collections) {
        this.collections = collections;
        return this;
    }

    public ListRestoreCollectionsResponse addCollectionsItem(String collectionsItem) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        this.collections.add(collectionsItem);
        return this;
    }

    public ListRestoreCollectionsResponse withCollections(Consumer<List<String>> collectionsSetter) {
        if (this.collections == null) {
            this.collections = new ArrayList<>();
        }
        collectionsSetter.accept(this.collections);
        return this;
    }

    /**
     * 集合列表，列表中每个元素表示一个集合。
     * @return collections
     */
    public List<String> getCollections() {
        return collections;
    }

    public void setCollections(List<String> collections) {
        this.collections = collections;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRestoreCollectionsResponse listRestoreCollectionsResponse = (ListRestoreCollectionsResponse) o;
        return Objects.equals(this.totalCount, listRestoreCollectionsResponse.totalCount)
            && Objects.equals(this.collections, listRestoreCollectionsResponse.collections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, collections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreCollectionsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    collections: ").append(toIndentedString(collections)).append("\n");
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

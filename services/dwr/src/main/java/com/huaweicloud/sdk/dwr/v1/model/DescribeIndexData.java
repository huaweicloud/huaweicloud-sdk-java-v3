package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * DescribeIndexData
 */
public class DescribeIndexData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_desc")

    private IndexDesc indexDesc;

    public DescribeIndexData withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public DescribeIndexData withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public DescribeIndexData withIndexDesc(IndexDesc indexDesc) {
        this.indexDesc = indexDesc;
        return this;
    }

    public DescribeIndexData withIndexDesc(Consumer<IndexDesc> indexDescSetter) {
        if (this.indexDesc == null) {
            this.indexDesc = new IndexDesc();
            indexDescSetter.accept(this.indexDesc);
        }

        return this;
    }

    /**
     * Get indexDesc
     * @return indexDesc
     */
    public IndexDesc getIndexDesc() {
        return indexDesc;
    }

    public void setIndexDesc(IndexDesc indexDesc) {
        this.indexDesc = indexDesc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DescribeIndexData that = (DescribeIndexData) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.indexDesc, that.indexDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, indexDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DescribeIndexData {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    indexDesc: ").append(toIndentedString(indexDesc)).append("\n");
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

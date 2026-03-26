package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HybridSearchBody
 */
public class HybridSearchBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_fields")

    private List<String> outputFields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_k")

    private Integer topK;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_search")

    private List<SubSearch> subSearch = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rerank")

    private Rerank rerank;

    public HybridSearchBody withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public HybridSearchBody withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称，知识仓内唯一。 约束限制： 长度范围为1到255个字符，支持字母、数字、中划线（-）和下划线（ _ ），大小写敏感。第一个字符只能够是下划线（ _ ）和字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public HybridSearchBody withOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public HybridSearchBody addOutputFieldsItem(String outputFieldsItem) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        this.outputFields.add(outputFieldsItem);
        return this;
    }

    public HybridSearchBody withOutputFields(Consumer<List<String>> outputFieldsSetter) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        outputFieldsSetter.accept(this.outputFields);
        return this;
    }

    /**
     * **参数解释：** field名称列表，配置需与搜索结果一起返回的字段。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** `[ ]`，不返回任何额外的字段数据。
     * @return outputFields
     */
    public List<String> getOutputFields() {
        return outputFields;
    }

    public void setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
    }

    public HybridSearchBody withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释：** 返回的entity个数限制。可以将此参数与offset结合使用以启用分页。 **约束限制：** 1.与offset取值的总和应小于16384。 2.当sub_search数量为1时，以sub_search中的top_k和offset为准。 **取值范围：** `[1, 16384]` **默认取值:** 10
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public HybridSearchBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 在搜索结果中跳过的记录数。可以将此参数与 top_k 参数结合使用以启用分页。 **约束限制：** 1.与top_k取值的总和应小于16384。 2.当sub_search数量为1时，以sub_search中的top_k和offset为准。 **取值范围：** 大于等于0 **默认取值：** 0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public HybridSearchBody withSubSearch(List<SubSearch> subSearch) {
        this.subSearch = subSearch;
        return this;
    }

    public HybridSearchBody addSubSearchItem(SubSearch subSearchItem) {
        if (this.subSearch == null) {
            this.subSearch = new ArrayList<>();
        }
        this.subSearch.add(subSearchItem);
        return this;
    }

    public HybridSearchBody withSubSearch(Consumer<List<SubSearch>> subSearchSetter) {
        if (this.subSearch == null) {
            this.subSearch = new ArrayList<>();
        }
        subSearchSetter.accept(this.subSearch);
        return this;
    }

    /**
     * **参数解释：** rerank策略。 **约束限制：** 不涉及 **取值范围：** 不涉及。 **默认取值：** 默认使用rrf算法。
     * @return subSearch
     */
    public List<SubSearch> getSubSearch() {
        return subSearch;
    }

    public void setSubSearch(List<SubSearch> subSearch) {
        this.subSearch = subSearch;
    }

    public HybridSearchBody withRerank(Rerank rerank) {
        this.rerank = rerank;
        return this;
    }

    public HybridSearchBody withRerank(Consumer<Rerank> rerankSetter) {
        if (this.rerank == null) {
            this.rerank = new Rerank();
            rerankSetter.accept(this.rerank);
        }

        return this;
    }

    /**
     * Get rerank
     * @return rerank
     */
    public Rerank getRerank() {
        return rerank;
    }

    public void setRerank(Rerank rerank) {
        this.rerank = rerank;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HybridSearchBody that = (HybridSearchBody) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.outputFields, that.outputFields) && Objects.equals(this.topK, that.topK)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.subSearch, that.subSearch)
            && Objects.equals(this.rerank, that.rerank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, outputFields, topK, offset, subSearch, rerank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HybridSearchBody {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    outputFields: ").append(toIndentedString(outputFields)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    subSearch: ").append(toIndentedString(subSearch)).append("\n");
        sb.append("    rerank: ").append(toIndentedString(rerank)).append("\n");
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

package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SearchEntitiesBody
 */
public class SearchEntitiesBody {

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
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vector")

    private List<Float> vector = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vector_field")

    private String vectorField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    public SearchEntitiesBody withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public SearchEntitiesBody withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称，知识仓内唯一。 **约束限制：** 长度范围为1到255个字符，支持字母、数字、中划线（-）和下划线（ _ ），大小写敏感。第一个字符只能够是下划线（ _ ）和字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public SearchEntitiesBody withOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public SearchEntitiesBody addOutputFieldsItem(String outputFieldsItem) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        this.outputFields.add(outputFieldsItem);
        return this;
    }

    public SearchEntitiesBody withOutputFields(Consumer<List<String>> outputFieldsSetter) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        outputFieldsSetter.accept(this.outputFields);
        return this;
    }

    /**
     * **参数解释：** field名称列表，配置需与搜索结果一起返回的字段。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** [ ]，不返回任何额外的字段数据。
     * @return outputFields
     */
    public List<String> getOutputFields() {
        return outputFields;
    }

    public void setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
    }

    public SearchEntitiesBody withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释：** 返回的entity个数限制。可以将此参数与offset结合使用以启用分页。 **约束限制：** 与offset取值的总和应小于16384。 **取值范围：** `[1, 16384]` **默认取值:** 10
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public SearchEntitiesBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 在搜索结果中跳过的记录数。可以将此参数与 top_k 参数结合使用以启用分页。 **约束限制：** 与top_k取值的总和应小于16384。 **取值范围：** 大于等于0 **默认取值：** 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SearchEntitiesBody withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释：** 用于过滤匹配entity的标量过滤条件。可以将此设置为空字符串以跳过标量过滤。 **约束限制：** 要构建标量过滤条件，请参阅filter表达式规则。 **取值范围：** 不涉及。 **默认取值：** 空字符串，不进行标量过滤。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public SearchEntitiesBody withVector(List<Float> vector) {
        this.vector = vector;
        return this;
    }

    public SearchEntitiesBody addVectorItem(Float vectorItem) {
        if (this.vector == null) {
            this.vector = new ArrayList<>();
        }
        this.vector.add(vectorItem);
        return this;
    }

    public SearchEntitiesBody withVector(Consumer<List<Float>> vectorSetter) {
        if (this.vector == null) {
            this.vector = new ArrayList<>();
        }
        vectorSetter.accept(this.vector);
        return this;
    }

    /**
     * **参数解释：** 要搜索的向量字段数据。 **约束限制：** 与collection field schema中定义的对应向量字段的类型和维度一致。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return vector
     */
    public List<Float> getVector() {
        return vector;
    }

    public void setVector(List<Float> vector) {
        this.vector = vector;
    }

    public SearchEntitiesBody withVectorField(String vectorField) {
        this.vectorField = vectorField;
        return this;
    }

    /**
     * **参数解释：** 要搜索的向量字段名称。 **约束限制：** 必须是collection field schema中存在的向量字段名称。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return vectorField
     */
    public String getVectorField() {
        return vectorField;
    }

    public void setVectorField(String vectorField) {
        this.vectorField = vectorField;
    }

    public SearchEntitiesBody withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public SearchEntitiesBody putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public SearchEntitiesBody withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：** 额外的搜索参数配置。 可以配置的参数： - ef: 每个查询的邻居候选集大小。候选集越大，搜索的精度越高，但是搜索时间也会随之增加。（仅对HNSW索引类型生效） - search_list: 候选列表的大小，越大召回率越高，但性能会下降。（仅对HANNS索引类型生效） - radius：向量相似度范围查询的外圈半径，若指定则进行相似度范围查询。 - range_filter: 向量相似度范围查询的内圈半径，向量相似度查询将过滤与查询相似度或距离在radius和range_filter参数范围内的所有向量。仅当指定radius时，该参数才生效，进行相似度范围查询时，建议根据metric_type指定该参数。 对于距离metric，如L2，范围搜索将搜索距离在[range_filter, radius)范围内的向量，如果range_filter未指定则搜索距离在[0, radius)范围内的向量。 对于相似度metric，如IP和COSINE，范围搜索将搜索相似度在(radius, range_filter]范围内的向量，如果range_filter未指定则分别搜索相似度在(radius, +∞]和(radius, 1.0]范围内的向量。 **约束限制：** 不涉及。 **取值范围：**   ef: [top_k + offset, int32_max]   search_list: [top_k + offset, int32_max] **默认取值:**  ef: top_k + offset  search_list: topk_k + offset
     * @return params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchEntitiesBody that = (SearchEntitiesBody) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.outputFields, that.outputFields) && Objects.equals(this.topK, that.topK)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.filter, that.filter)
            && Objects.equals(this.vector, that.vector) && Objects.equals(this.vectorField, that.vectorField)
            && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, outputFields, topK, offset, filter, vector, vectorField, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchEntitiesBody {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    outputFields: ").append(toIndentedString(outputFields)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
        sb.append("    vectorField: ").append(toIndentedString(vectorField)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

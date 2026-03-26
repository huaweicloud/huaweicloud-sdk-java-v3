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
 * SubSearch
 */
public class SubSearch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vector_field")

    private String vectorField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vector")

    private List<Object> vector = null;

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
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    public SubSearch withVectorField(String vectorField) {
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

    public SubSearch withVector(List<Object> vector) {
        this.vector = vector;
        return this;
    }

    public SubSearch addVectorItem(Object vectorItem) {
        if (this.vector == null) {
            this.vector = new ArrayList<>();
        }
        this.vector.add(vectorItem);
        return this;
    }

    public SubSearch withVector(Consumer<List<Object>> vectorSetter) {
        if (this.vector == null) {
            this.vector = new ArrayList<>();
        }
        vectorSetter.accept(this.vector);
        return this;
    }

    /**
     * **参数解释：** 要搜索的向量字段数据。 **约束限制：** 与collection field schema中定义的对应向量字段的类型和维度一致。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return vector
     */
    public List<Object> getVector() {
        return vector;
    }

    public void setVector(List<Object> vector) {
        this.vector = vector;
    }

    public SubSearch withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释：** 返回的entity个数限制。可以将此参数与offset结合使用以启用分页。 **约束限制：** 当sub_search数量为1时，top_k与offset取值的总和应小于16384。 **取值范围：** `[1, 16384]` **默认取值：** 10
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public SubSearch withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 在搜索结果中跳过的记录数。可以将此参数与 top_k 参数结合使用以启用分页。 **约束限制：** 1.与top_k取值的总和应小于16384。 2.当sub_search数量为1时才生效。 **取值范围：** 大于等于0 **默认取值:** 0
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public SubSearch withFilter(String filter) {
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

    public SubSearch withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public SubSearch putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public SubSearch withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：** 额外的搜索参数配置。 可以配置的参数： * ef: 每个查询的邻居候选集大小。候选集越大，搜索的精度越高，但是搜索时间也会随之增加。（仅对HNSW索引类型生效） * search_list: 候选列表的大小，越大召回率越高，但性能会下降。（仅对HANNS索引类型生效） * cut_off_frequency: 通过停用词出现频率决定是否作为查询结果。（仅对稀疏向量搜索生效）  **约束限制：** 不涉及。 **取值范围：** 当sub_search数量为1时：  ef: [top_k + offset, int32_max]  search_list: [top_k + offset, int32_max]  cut_off_frequency：[0, 1.0] 当sub_search数量大于1时：  ef: [top_k, int32_max]  search_list: [top_k, int32_max]  cut_off_frequency：[0, 1.0]  **默认取值:**  当sub_search数量为1时：  ef: top_k + offset  search_list: top_k + offset  cut_off_frequency: 0 当sub_search数量大于1时：  ef: top_k  search_list: top_k  cut_off_frequency: 0
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
        SubSearch that = (SubSearch) obj;
        return Objects.equals(this.vectorField, that.vectorField) && Objects.equals(this.vector, that.vector)
            && Objects.equals(this.topK, that.topK) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vectorField, vector, topK, offset, filter, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubSearch {\n");
        sb.append("    vectorField: ").append(toIndentedString(vectorField)).append("\n");
        sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

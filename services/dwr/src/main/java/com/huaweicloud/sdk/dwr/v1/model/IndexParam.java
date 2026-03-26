package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * IndexParam
 */
public class IndexParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_name")

    private String indexName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_name")

    private String fieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    public IndexParam withIndexName(String indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * **参数解释：** 创建的索引名称，collection内唯一。 **约束限制：** 长度范围为1到255个字符，支持字母、数字、中划线（-）和下划线（_），大小写敏感。第一个字符只能够是下划线（_）和字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return indexName
     */
    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public IndexParam withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    /**
     * **参数解释：** 要创建索引的目标字段名称。 **约束限制：** - 长度范围为1到255个字符，支持字母、数字、中划线（-）和下划线（_），大小写敏感。第一个字符只能够是下划线（_）和字母，中划线(-)不得出现在字符串末尾。 - field_name必须是collection field schema中存在的字段。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return fieldName
     */
    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public IndexParam withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public IndexParam putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public IndexParam withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：** 创建的索引的参数配置。 可以设置的参数： -  metric_type：向量度量方式，只有向量索引需要配置。 - index_type：创建的索引类型。 - params：对应索引类型的配置参数。  1. HNSW索引类型参数：   - M：节点的最大度。   - efConstruction：构建索引时每个节点邻居数。  2. HANNS索引相关参数：   - max_degree：节点的最大度数。较大的值提供更高的召回率但增加索引的大小和构建时间。   - search_list_size：候选列表的大小。较大的值增加构建索引的时间但提供更高的召回率。   - encoding_type: SQ/PQ/HVQ，默认SQ。   - pq_code_budget_gb_ratio：PQ 码的大小限制。较大的值提供更高的召回率但增加内存使用量，仅当encoding_type为PQ时生效。         - hvq_nbits：HVQ码的大小限制。较大的值提高更高的召回率但增加内存使用量，仅当encoding_type为HVQ时生效。   - beamwidth：用于搜索的束宽。表示每次搜索迭代中每个查询发出的最大 I/O 请求数，可用于提升索引性能。  3. IVF_FLAT索引相关参数：   - nlist：聚类的数量。   - nprobe：查询聚类的数量。  **约束限制：** 不涉及。  **取值范围：**  - metric_type:   1. 稠密向量支持度量方式：\"IP\"、\"L2\"和\"COSINE\"。  2. 稀疏向量支持度量方式：\"IP\"。 - index_type:  1. 稠密向量支持索引类型：\"HNSW\"、\"HANNS\"和\"IVF_FLAT\"。  2. 稀疏向量支持索引类型：\"SPARSE_INVERTED_INDEX\"和\"SPARSE_WAND\"。  3. 标量字段支持索引类型：\"INVERTED\"。 - params：  1. HNSW索引类型参数：   - M：[2, 2048]   - efConstruction：[1, 2000]  2. HANNS索引相关参数：   - max_degree：[1, 512]   - search_list_size：[1, 1000]   - encoding_type: SQ/PQ/HVQ   - pq_code_budget_gb_ratio：(0.0, 1.0]   - beamwidth：[1, 16]  3. IVF_FLAT索引相关参数：   - nlist：[1, 65536]   - nprobe：[1, nlist]          **默认值：** - metric_type:   1. 稠密向量：\"L2\"。  2. 稀疏向量：\"IP\"。  3. 标量：无须配置 - index_type:  1. 稠密向量：\"HANNS\"。  2. 稀疏向量：\"SPARSE_INVERTED_INDEX\"。  3. 标量：\"INVERTED\"。 - params：对应索引类型的配置参数。  1. HNSW索引类型参数：   - M：16。   - efConstruction：200。  2. HANNS索引相关参数：   - max_degree：56。   - search_list_size：100。   - encoding_type: 默认SQ。   - pq_code_budget_gb_ratio：0.125。         - hvq_nbits: 1   - beamwidth：4  3. IVF_FLAT索引相关参数：   - nlist：128   - nprobe：8
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
        IndexParam that = (IndexParam) obj;
        return Objects.equals(this.indexName, that.indexName) && Objects.equals(this.fieldName, that.fieldName)
            && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexName, fieldName, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndexParam {\n");
        sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
        sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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

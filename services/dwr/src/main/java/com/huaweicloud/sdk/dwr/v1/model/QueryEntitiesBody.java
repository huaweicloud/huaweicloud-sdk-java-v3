package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryEntitiesBody
 */
public class QueryEntitiesBody {

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

    public QueryEntitiesBody withStoreName(String storeName) {
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

    public QueryEntitiesBody withCollectionName(String collectionName) {
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

    public QueryEntitiesBody withOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
        return this;
    }

    public QueryEntitiesBody addOutputFieldsItem(String outputFieldsItem) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        this.outputFields.add(outputFieldsItem);
        return this;
    }

    public QueryEntitiesBody withOutputFields(Consumer<List<String>> outputFieldsSetter) {
        if (this.outputFields == null) {
            this.outputFields = new ArrayList<>();
        }
        outputFieldsSetter.accept(this.outputFields);
        return this;
    }

    /**
     * **参数解释：** field名称列表，配置需与搜索结果一起返回的字段。 **约束限制：** 当取值为`[\"count(*)\"]`时，top_k必须为负数，表示统计符合条件的entity数量。 **取值范围：** 不涉及。 **默认取值：** `[ ]`，不返回任何额外的字段数据。
     * @return outputFields
     */
    public List<String> getOutputFields() {
        return outputFields;
    }

    public void setOutputFields(List<String> outputFields) {
        this.outputFields = outputFields;
    }

    public QueryEntitiesBody withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释：** 返回的entity个数限制。可以将此参数与offset结合使用以启用分页。当取值为负数时，表示返回所有符合条件的数据。 **约束限制：** 与offset取值的总和应小于16384。当output_field为`[\"count(*)\"]`时，top_k必须为负数。 **取值范围：** 小于等于16384 **默认取值：** 10
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public QueryEntitiesBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 在搜索结果中跳过的记录数。可以将此参数与 top_k 参数结合使用以启用分页。 **约束限制：** 与top_k取值的总和应小于16384。 **取值范围：** 大于等于0 **默认取值:** 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryEntitiesBody withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释：** 用于过滤匹配entity的标量过滤条件。 **约束限制：** 要构建标量过滤条件，请参阅filter表达式规则。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryEntitiesBody that = (QueryEntitiesBody) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.outputFields, that.outputFields) && Objects.equals(this.topK, that.topK)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.filter, that.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, outputFields, topK, offset, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryEntitiesBody {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    outputFields: ").append(toIndentedString(outputFields)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowUnrelatedTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private AttributeSearchResult attributes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private String classification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<AtlasEntityHeader> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_text_result")

    private List<AtlasFullTextResult> fullTextResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_text")

    private String queryText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scroll_id")

    private String scrollId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_parameters")

    private Object searchParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ShowUnrelatedTableResponse withAttributes(AttributeSearchResult attributes) {
        this.attributes = attributes;
        return this;
    }

    public ShowUnrelatedTableResponse withAttributes(Consumer<AttributeSearchResult> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new AttributeSearchResult();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public AttributeSearchResult getAttributes() {
        return attributes;
    }

    public void setAttributes(AttributeSearchResult attributes) {
        this.attributes = attributes;
    }

    public ShowUnrelatedTableResponse withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * 分类
     * @return classification
     */
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public ShowUnrelatedTableResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 结果总量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowUnrelatedTableResponse withEntities(List<AtlasEntityHeader> entities) {
        this.entities = entities;
        return this;
    }

    public ShowUnrelatedTableResponse addEntitiesItem(AtlasEntityHeader entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ShowUnrelatedTableResponse withEntities(Consumer<List<AtlasEntityHeader>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 资产信息
     * @return entities
     */
    public List<AtlasEntityHeader> getEntities() {
        return entities;
    }

    public void setEntities(List<AtlasEntityHeader> entities) {
        this.entities = entities;
    }

    public ShowUnrelatedTableResponse withFullTextResult(List<AtlasFullTextResult> fullTextResult) {
        this.fullTextResult = fullTextResult;
        return this;
    }

    public ShowUnrelatedTableResponse addFullTextResultItem(AtlasFullTextResult fullTextResultItem) {
        if (this.fullTextResult == null) {
            this.fullTextResult = new ArrayList<>();
        }
        this.fullTextResult.add(fullTextResultItem);
        return this;
    }

    public ShowUnrelatedTableResponse withFullTextResult(Consumer<List<AtlasFullTextResult>> fullTextResultSetter) {
        if (this.fullTextResult == null) {
            this.fullTextResult = new ArrayList<>();
        }
        fullTextResultSetter.accept(this.fullTextResult);
        return this;
    }

    /**
     * Get fullTextResult
     * @return fullTextResult
     */
    public List<AtlasFullTextResult> getFullTextResult() {
        return fullTextResult;
    }

    public void setFullTextResult(List<AtlasFullTextResult> fullTextResult) {
        this.fullTextResult = fullTextResult;
    }

    public ShowUnrelatedTableResponse withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    /**
     * 查询内容
     * @return queryText
     */
    public String getQueryText() {
        return queryText;
    }

    public void setQueryText(String queryText) {
        this.queryText = queryText;
    }

    public ShowUnrelatedTableResponse withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 查询类型，取值范围DSL,FULL_TEXT,GREMLIN,BASIC,ATTRIBUTE,RELATIONSHIP,ADVANCED
     * @return queryType
     */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public ShowUnrelatedTableResponse withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * Map<String, AtlasEntityHeader>
     * @return referredEntities
     */
    public Object getReferredEntities() {
        return referredEntities;
    }

    public void setReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
    }

    public ShowUnrelatedTableResponse withScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }

    /**
     * 滚动条id
     * @return scrollId
     */
    public String getScrollId() {
        return scrollId;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    public ShowUnrelatedTableResponse withSearchParameters(Object searchParameters) {
        this.searchParameters = searchParameters;
        return this;
    }

    /**
     * 参数
     * @return searchParameters
     */
    public Object getSearchParameters() {
        return searchParameters;
    }

    public void setSearchParameters(Object searchParameters) {
        this.searchParameters = searchParameters;
    }

    public ShowUnrelatedTableResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUnrelatedTableResponse that = (ShowUnrelatedTableResponse) obj;
        return Objects.equals(this.attributes, that.attributes)
            && Objects.equals(this.classification, that.classification) && Objects.equals(this.count, that.count)
            && Objects.equals(this.entities, that.entities) && Objects.equals(this.fullTextResult, that.fullTextResult)
            && Objects.equals(this.queryText, that.queryText) && Objects.equals(this.queryType, that.queryType)
            && Objects.equals(this.referredEntities, that.referredEntities)
            && Objects.equals(this.scrollId, that.scrollId)
            && Objects.equals(this.searchParameters, that.searchParameters) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attributes,
            classification,
            count,
            entities,
            fullTextResult,
            queryText,
            queryType,
            referredEntities,
            scrollId,
            searchParameters,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUnrelatedTableResponse {\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    fullTextResult: ").append(toIndentedString(fullTextResult)).append("\n");
        sb.append("    queryText: ").append(toIndentedString(queryText)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    referredEntities: ").append(toIndentedString(referredEntities)).append("\n");
        sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
        sb.append("    searchParameters: ").append(toIndentedString(searchParameters)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDataSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private BigDecimal count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<Entity> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "facets")

    private Object facets;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private Object metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    public ShowDataSetsResponse withCount(BigDecimal count) {
        this.count = count;
        return this;
    }

    /**
     * 查询结果总量
     * @return count
     */
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public ShowDataSetsResponse withEntities(List<Entity> entities) {
        this.entities = entities;
        return this;
    }

    public ShowDataSetsResponse addEntitiesItem(Entity entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ShowDataSetsResponse withEntities(Consumer<List<Entity>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * 资产实体列表
     * @return entities
     */
    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public ShowDataSetsResponse withFacets(Object facets) {
        this.facets = facets;
        return this;
    }

    /**
     * 资产分类facets维度信息列表，数据结构List<Map<String, List<Aggregation>>> 取值为count
     * @return facets
     */
    public Object getFacets() {
        return facets;
    }

    public void setFacets(Object facets) {
        this.facets = facets;
    }

    public ShowDataSetsResponse withMetrics(Object metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * 资产分类metrics维度信息列表，数据结构List<Map<String, List<Aggregation>>>  取值为aggregation
     * @return metrics
     */
    public Object getMetrics() {
        return metrics;
    }

    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public ShowDataSetsResponse withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * 关联资产，数据类型Map<String, Entity>
     * @return referredEntities
     */
    public Object getReferredEntities() {
        return referredEntities;
    }

    public void setReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataSetsResponse that = (ShowDataSetsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.entities, that.entities)
            && Objects.equals(this.facets, that.facets) && Objects.equals(this.metrics, that.metrics)
            && Objects.equals(this.referredEntities, that.referredEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, entities, facets, metrics, referredEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataSetsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    referredEntities: ").append(toIndentedString(referredEntities)).append("\n");
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

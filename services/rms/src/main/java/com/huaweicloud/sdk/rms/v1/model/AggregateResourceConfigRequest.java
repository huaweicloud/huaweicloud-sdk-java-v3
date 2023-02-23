package com.huaweicloud.sdk.rms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询源帐号中的特定资源聚合的配置项请求体。
 */
public class AggregateResourceConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregator_id")

    private String aggregatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_identifier")

    private ResourceIdentifier resourceIdentifier;

    public AggregateResourceConfigRequest withAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }

    /**
     * 资源聚合器ID。
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public AggregateResourceConfigRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    public AggregateResourceConfigRequest withResourceIdentifier(
        Consumer<ResourceIdentifier> resourceIdentifierSetter) {
        if (this.resourceIdentifier == null) {
            this.resourceIdentifier = new ResourceIdentifier();
            resourceIdentifierSetter.accept(this.resourceIdentifier);
        }

        return this;
    }

    /**
     * Get resourceIdentifier
     * @return resourceIdentifier
     */
    public ResourceIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregateResourceConfigRequest aggregateResourceConfigRequest = (AggregateResourceConfigRequest) o;
        return Objects.equals(this.aggregatorId, aggregateResourceConfigRequest.aggregatorId)
            && Objects.equals(this.resourceIdentifier, aggregateResourceConfigRequest.resourceIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatorId, resourceIdentifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AggregateResourceConfigRequest {\n");
        sb.append("    aggregatorId: ").append(toIndentedString(aggregatorId)).append("\n");
        sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
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

package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEntityInfoByGuidResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private OpenEntityWithExtInfoEntity entity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referred_entities")

    private Object referredEntities;

    public ShowEntityInfoByGuidResponse withEntity(OpenEntityWithExtInfoEntity entity) {
        this.entity = entity;
        return this;
    }

    public ShowEntityInfoByGuidResponse withEntity(Consumer<OpenEntityWithExtInfoEntity> entitySetter) {
        if (this.entity == null) {
            this.entity = new OpenEntityWithExtInfoEntity();
            entitySetter.accept(this.entity);
        }

        return this;
    }

    /**
     * Get entity
     * @return entity
     */
    public OpenEntityWithExtInfoEntity getEntity() {
        return entity;
    }

    public void setEntity(OpenEntityWithExtInfoEntity entity) {
        this.entity = entity;
    }

    public ShowEntityInfoByGuidResponse withReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
        return this;
    }

    /**
     * 引用实体 Map<String, OpenEntity>
     * @return referredEntities
     */
    public Object getReferredEntities() {
        return referredEntities;
    }

    public void setReferredEntities(Object referredEntities) {
        this.referredEntities = referredEntities;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEntityInfoByGuidResponse showEntityInfoByGuidResponse = (ShowEntityInfoByGuidResponse) o;
        return Objects.equals(this.entity, showEntityInfoByGuidResponse.entity)
            && Objects.equals(this.referredEntities, showEntityInfoByGuidResponse.referredEntities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity, referredEntities);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEntityInfoByGuidResponse {\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CatalogParamsVO
 */
public class CatalogParamsVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity")

    private CatalogEntityVO entity;

    public CatalogParamsVO withEntity(CatalogEntityVO entity) {
        this.entity = entity;
        return this;
    }

    public CatalogParamsVO withEntity(Consumer<CatalogEntityVO> entitySetter) {
        if (this.entity == null) {
            this.entity = new CatalogEntityVO();
            entitySetter.accept(this.entity);
        }

        return this;
    }

    /**
     * Get entity
     * @return entity
     */
    public CatalogEntityVO getEntity() {
        return entity;
    }

    public void setEntity(CatalogEntityVO entity) {
        this.entity = entity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogParamsVO that = (CatalogParamsVO) obj;
        return Objects.equals(this.entity, that.entity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogParamsVO {\n");
        sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

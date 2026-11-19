package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplyConfigurationEntityRequestBody
 */
public class ApplyConfigurationEntityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_ids")

    private List<String> entityIds = null;

    public ApplyConfigurationEntityRequestBody withEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
        return this;
    }

    public ApplyConfigurationEntityRequestBody addEntityIdsItem(String entityIdsItem) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        this.entityIds.add(entityIdsItem);
        return this;
    }

    public ApplyConfigurationEntityRequestBody withEntityIds(Consumer<List<String>> entityIdsSetter) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        entityIdsSetter.accept(this.entityIds);
        return this;
    }

    /**
     * **参数解释**: 资源ID列表。可通过“查询可应用实例列表”接口获取。 **约束限制**: 不涉及。
     * @return entityIds
     */
    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyConfigurationEntityRequestBody that = (ApplyConfigurationEntityRequestBody) obj;
        return Objects.equals(this.entityIds, that.entityIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationEntityRequestBody {\n");
        sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
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

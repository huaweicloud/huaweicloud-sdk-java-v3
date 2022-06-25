package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ApplyConfigurationRequestBody
 */
public class ApplyConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_ids")

    private List<String> entityIds = null;

    public ApplyConfigurationRequestBody withEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
        return this;
    }

    public ApplyConfigurationRequestBody addEntityIdsItem(String entityIdsItem) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        this.entityIds.add(entityIdsItem);
        return this;
    }

    public ApplyConfigurationRequestBody withEntityIds(Consumer<List<String>> entityIdsSetter) {
        if (this.entityIds == null) {
            this.entityIds = new ArrayList<>();
        }
        entityIdsSetter.accept(this.entityIds);
        return this;
    }

    /**
     * 实例ID或组ID或节点ID的列表对象。可以调用“查询实例列表和详情”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 - 当变更的实例类型是集群，如果变更的是shard组或者config组的参数模板，传值为组ID。如果变更的是mongos节点的参数模板，传值为节点ID。 - 当变更的实例类型是副本集或单节点，传值为实例ID。
     * @return entityIds
     */
    public List<String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<String> entityIds) {
        this.entityIds = entityIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplyConfigurationRequestBody applyConfigurationRequestBody = (ApplyConfigurationRequestBody) o;
        return Objects.equals(this.entityIds, applyConfigurationRequestBody.entityIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyConfigurationRequestBody {\n");
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

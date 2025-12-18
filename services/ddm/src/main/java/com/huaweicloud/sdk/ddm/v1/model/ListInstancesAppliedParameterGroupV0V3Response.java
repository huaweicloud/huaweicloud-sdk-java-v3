package com.huaweicloud.sdk.ddm.v1.model;

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
public class ListInstancesAppliedParameterGroupV0V3Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<ApplicableInstance> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_count_limit")

    private Integer instanceCountLimit;

    public ListInstancesAppliedParameterGroupV0V3Response withEntities(List<ApplicableInstance> entities) {
        this.entities = entities;
        return this;
    }

    public ListInstancesAppliedParameterGroupV0V3Response addEntitiesItem(ApplicableInstance entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ListInstancesAppliedParameterGroupV0V3Response withEntities(
        Consumer<List<ApplicableInstance>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * **参数解释**：  查询可应用的实例列表返回相关信息的集合。  **参数范围**：  不涉及。
     * @return entities
     */
    public List<ApplicableInstance> getEntities() {
        return entities;
    }

    public void setEntities(List<ApplicableInstance> entities) {
        this.entities = entities;
    }

    public ListInstancesAppliedParameterGroupV0V3Response withInstanceCountLimit(Integer instanceCountLimit) {
        this.instanceCountLimit = instanceCountLimit;
        return this;
    }

    /**
     * **参数解释**：  分页参数: 每页记录数。  **约束限制**：  不涉及。  **取值范围**：  大于0且小于等于128。  **默认取值**：  默认值是10。
     * minimum: 1
     * maximum: 2147483647
     * @return instanceCountLimit
     */
    public Integer getInstanceCountLimit() {
        return instanceCountLimit;
    }

    public void setInstanceCountLimit(Integer instanceCountLimit) {
        this.instanceCountLimit = instanceCountLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesAppliedParameterGroupV0V3Response that = (ListInstancesAppliedParameterGroupV0V3Response) obj;
        return Objects.equals(this.entities, that.entities)
            && Objects.equals(this.instanceCountLimit, that.instanceCountLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities, instanceCountLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesAppliedParameterGroupV0V3Response {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    instanceCountLimit: ").append(toIndentedString(instanceCountLimit)).append("\n");
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

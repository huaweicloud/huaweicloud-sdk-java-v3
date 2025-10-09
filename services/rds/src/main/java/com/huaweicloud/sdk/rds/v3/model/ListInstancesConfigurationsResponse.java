package com.huaweicloud.sdk.rds.v3.model;

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
public class ListInstancesConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<ApplicableInstanceInfo> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_count_limit")

    private Integer instanceCountLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListInstancesConfigurationsResponse withEntities(List<ApplicableInstanceInfo> entities) {
        this.entities = entities;
        return this;
    }

    public ListInstancesConfigurationsResponse addEntitiesItem(ApplicableInstanceInfo entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ListInstancesConfigurationsResponse withEntities(Consumer<List<ApplicableInstanceInfo>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * **参数解释**：  实例列表  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return entities
     */
    public List<ApplicableInstanceInfo> getEntities() {
        return entities;
    }

    public void setEntities(List<ApplicableInstanceInfo> entities) {
        this.entities = entities;
    }

    public ListInstancesConfigurationsResponse withInstanceCountLimit(Integer instanceCountLimit) {
        this.instanceCountLimit = instanceCountLimit;
        return this;
    }

    /**
     * **参数解释**：  实例的限制数量  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * minimum: 0
     * maximum: 1000
     * @return instanceCountLimit
     */
    public Integer getInstanceCountLimit() {
        return instanceCountLimit;
    }

    public void setInstanceCountLimit(Integer instanceCountLimit) {
        this.instanceCountLimit = instanceCountLimit;
    }

    public ListInstancesConfigurationsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  应用参数模板的实例总数  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * minimum: 0
     * maximum: 1000
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesConfigurationsResponse that = (ListInstancesConfigurationsResponse) obj;
        return Objects.equals(this.entities, that.entities)
            && Objects.equals(this.instanceCountLimit, that.instanceCountLimit)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities, instanceCountLimit, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesConfigurationsResponse {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    instanceCountLimit: ").append(toIndentedString(instanceCountLimit)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

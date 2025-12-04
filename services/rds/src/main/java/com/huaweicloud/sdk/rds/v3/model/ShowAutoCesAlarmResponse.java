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
public class ShowAutoCesAlarmResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entities")

    private List<AutoCesAlarmInfo> entities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowAutoCesAlarmResponse withEntities(List<AutoCesAlarmInfo> entities) {
        this.entities = entities;
        return this;
    }

    public ShowAutoCesAlarmResponse addEntitiesItem(AutoCesAlarmInfo entitiesItem) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        this.entities.add(entitiesItem);
        return this;
    }

    public ShowAutoCesAlarmResponse withEntities(Consumer<List<AutoCesAlarmInfo>> entitiesSetter) {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }
        entitiesSetter.accept(this.entities);
        return this;
    }

    /**
     * **参数解释**：  自动告警列表  **约束限制**：  不涉及。
     * @return entities
     */
    public List<AutoCesAlarmInfo> getEntities() {
        return entities;
    }

    public void setEntities(List<AutoCesAlarmInfo> entities) {
        this.entities = entities;
    }

    public ShowAutoCesAlarmResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：  总数量。  **约束限制**：  不涉及。
     * minimum: 0
     * maximum: 10000
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoCesAlarmResponse that = (ShowAutoCesAlarmResponse) obj;
        return Objects.equals(this.entities, that.entities) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entities, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoCesAlarmResponse {\n");
        sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

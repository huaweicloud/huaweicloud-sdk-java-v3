package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MigrateAZRequestBody
 */
public class MigrateAZRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_available_zones")

    private List<String> newAvailableZones = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_immediately")

    private Boolean executeImmediately;

    public MigrateAZRequestBody withNewAvailableZones(List<String> newAvailableZones) {
        this.newAvailableZones = newAvailableZones;
        return this;
    }

    public MigrateAZRequestBody addNewAvailableZonesItem(String newAvailableZonesItem) {
        if (this.newAvailableZones == null) {
            this.newAvailableZones = new ArrayList<>();
        }
        this.newAvailableZones.add(newAvailableZonesItem);
        return this;
    }

    public MigrateAZRequestBody withNewAvailableZones(Consumer<List<String>> newAvailableZonesSetter) {
        if (this.newAvailableZones == null) {
            this.newAvailableZones = new ArrayList<>();
        }
        newAvailableZonesSetter.accept(this.newAvailableZones);
        return this;
    }

    /**
     * **参数解释**： 新可用区。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return newAvailableZones
     */
    public List<String> getNewAvailableZones() {
        return newAvailableZones;
    }

    public void setNewAvailableZones(List<String> newAvailableZones) {
        this.newAvailableZones = newAvailableZones;
    }

    public MigrateAZRequestBody withExecuteImmediately(Boolean executeImmediately) {
        this.executeImmediately = executeImmediately;
        return this;
    }

    /**
     * **参数解释**： 是否立即执行变更。 **约束限制**： 不涉及。 **取值范围**： true：立即执行变更。 false：暂不执行变更。 **默认取值**： true 
     * @return executeImmediately
     */
    public Boolean getExecuteImmediately() {
        return executeImmediately;
    }

    public void setExecuteImmediately(Boolean executeImmediately) {
        this.executeImmediately = executeImmediately;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MigrateAZRequestBody that = (MigrateAZRequestBody) obj;
        return Objects.equals(this.newAvailableZones, that.newAvailableZones)
            && Objects.equals(this.executeImmediately, that.executeImmediately);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newAvailableZones, executeImmediately);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrateAZRequestBody {\n");
        sb.append("    newAvailableZones: ").append(toIndentedString(newAvailableZones)).append("\n");
        sb.append("    executeImmediately: ").append(toIndentedString(executeImmediately)).append("\n");
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

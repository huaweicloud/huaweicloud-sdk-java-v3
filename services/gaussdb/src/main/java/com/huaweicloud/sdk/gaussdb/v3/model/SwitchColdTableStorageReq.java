package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchColdTableStorageReq
 */
public class SwitchColdTableStorageReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tables")

    private List<TableTarget> tables = null;

    public SwitchColdTableStorageReq withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * **参数解释**：  操作类型。  **约束限制**：  不涉及。  **取值范围**：  - archive：创建冷表。 - unarchive：回迁冷表。  **默认取值**：  不涉及。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public SwitchColdTableStorageReq withTables(List<TableTarget> tables) {
        this.tables = tables;
        return this;
    }

    public SwitchColdTableStorageReq addTablesItem(TableTarget tablesItem) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    public SwitchColdTableStorageReq withTables(Consumer<List<TableTarget>> tablesSetter) {
        if (this.tables == null) {
            this.tables = new ArrayList<>();
        }
        tablesSetter.accept(this.tables);
        return this;
    }

    /**
     * **参数解释**：  需要操作的表信息。  **约束限制**：  数组长度小于等于50。
     * @return tables
     */
    public List<TableTarget> getTables() {
        return tables;
    }

    public void setTables(List<TableTarget> tables) {
        this.tables = tables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchColdTableStorageReq that = (SwitchColdTableStorageReq) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.tables, that.tables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, tables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchColdTableStorageReq {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
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

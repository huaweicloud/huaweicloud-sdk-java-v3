package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 创建手动备份请求参数。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class NoSqlCreateBackupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_tables")

    private List<DatabaseTable> databaseTables = null;

    public NoSqlCreateBackupRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 手动备份名称。 **约束限制：** 长度为4~64位，必须以字母开头（A~Z或a~z），区分大小写，可以包含字母、数字（0~9）、中划线（-）或者下划线（_），不能包含其他特殊字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NoSqlCreateBackupRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 手动备份描述。 **约束限制：** 长度不超过256位，且不能包含>!<\"&'=特殊字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NoSqlCreateBackupRequestBody withDatabaseTables(List<DatabaseTable> databaseTables) {
        this.databaseTables = databaseTables;
        return this;
    }

    public NoSqlCreateBackupRequestBody addDatabaseTablesItem(DatabaseTable databaseTablesItem) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        this.databaseTables.add(databaseTablesItem);
        return this;
    }

    public NoSqlCreateBackupRequestBody withDatabaseTables(Consumer<List<DatabaseTable>> databaseTablesSetter) {
        if (this.databaseTables == null) {
            this.databaseTables = new ArrayList<>();
        }
        databaseTablesSetter.accept(this.databaseTables);
        return this;
    }

    /**
     * **参数解释：** 备份里的库表信息。 **约束限制：** 该参数仅针对GeminiDB Cassandra。 **取值范围：** - 字段为空，表示创建实例级备份。 - 字段非空，表示创建库表级备份。  **默认取值：** 不涉及。
     * @return databaseTables
     */
    public List<DatabaseTable> getDatabaseTables() {
        return databaseTables;
    }

    public void setDatabaseTables(List<DatabaseTable> databaseTables) {
        this.databaseTables = databaseTables;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoSqlCreateBackupRequestBody that = (NoSqlCreateBackupRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.databaseTables, that.databaseTables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, databaseTables);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoSqlCreateBackupRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    databaseTables: ").append(toIndentedString(databaseTables)).append("\n");
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

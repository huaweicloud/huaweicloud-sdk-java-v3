package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SuccessTable
 */
public class SuccessTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_name")

    private String configName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_number")

    private Integer rowNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_table_name")

    private String fullTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid")

    private Boolean valid;

    public SuccessTable withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入成功的数据库名。   **取值范围**：  不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public SuccessTable withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入成功的表名。   **取值范围**：  不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public SuccessTable withConfigName(String configName) {
        this.configName = configName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入成功的表配置。   **取值范围**：  不涉及。
     * @return configName
     */
    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public SuccessTable withRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
        return this;
    }

    /**
     * **参数解释**：  Excel导入成功的行数。   **取值范围**：  不涉及。
     * @return rowNumber
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public SuccessTable withFullTableName(String fullTableName) {
        this.fullTableName = fullTableName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入成功的表全名。   **取值范围**：  不涉及。
     * @return fullTableName
     */
    public String getFullTableName() {
        return fullTableName;
    }

    public void setFullTableName(String fullTableName) {
        this.fullTableName = fullTableName;
    }

    public SuccessTable withValid(Boolean valid) {
        this.valid = valid;
        return this;
    }

    /**
     * **参数解释**：  Excel信息是否合规。   **取值范围**：  - true：校验结果合规。 - false：校验结果不合规。
     * @return valid
     */
    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SuccessTable that = (SuccessTable) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.configName, that.configName) && Objects.equals(this.rowNumber, that.rowNumber)
            && Objects.equals(this.fullTableName, that.fullTableName) && Objects.equals(this.valid, that.valid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, tableName, configName, rowNumber, fullTableName, valid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuccessTable {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
        sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
        sb.append("    fullTableName: ").append(toIndentedString(fullTableName)).append("\n");
        sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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

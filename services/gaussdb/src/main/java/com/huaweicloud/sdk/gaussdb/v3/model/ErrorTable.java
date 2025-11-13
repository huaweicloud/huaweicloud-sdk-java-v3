package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ErrorTable
 */
public class ErrorTable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_number")

    private Integer rowNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_description")

    private String fullDescription;

    public ErrorTable withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：  Excel导入失败的对象信息。  **取值范围**：  不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorTable withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入失败的数据库名。   **取值范围**：  不涉及。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ErrorTable withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**：  Excel导入失败的表名。   **取值范围**：  不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ErrorTable withRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
        return this;
    }

    /**
     * **参数解释**：  Excel导入失败的行。  **取值范围**：  不涉及。
     * @return rowNumber
     */
    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public ErrorTable withFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
        return this;
    }

    /**
     * **参数解释**：  Excel导入失败的错误信息描述。  **取值范围**：  不涉及。
     * @return fullDescription
     */
    public String getFullDescription() {
        return fullDescription;
    }

    public void setFullDescription(String fullDescription) {
        this.fullDescription = fullDescription;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorTable that = (ErrorTable) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.rowNumber, that.rowNumber)
            && Objects.equals(this.fullDescription, that.fullDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, databaseName, tableName, rowNumber, fullDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorTable {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    rowNumber: ").append(toIndentedString(rowNumber)).append("\n");
        sb.append("    fullDescription: ").append(toIndentedString(fullDescription)).append("\n");
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

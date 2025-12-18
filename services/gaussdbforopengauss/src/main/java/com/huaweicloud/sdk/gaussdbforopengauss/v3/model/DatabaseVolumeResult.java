package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DatabaseVolumeResult
 */
public class DatabaseVolumeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_space_name")

    private String tableSpaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_size")

    private String databaseSize;

    public DatabaseVolumeResult withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseVolumeResult withTableSpaceName(String tableSpaceName) {
        this.tableSpaceName = tableSpaceName;
        return this;
    }

    /**
     * **参数解释**: 数据库的缺省表空间名。 **取值范围**: 不涉及。 
     * @return tableSpaceName
     */
    public String getTableSpaceName() {
        return tableSpaceName;
    }

    public void setTableSpaceName(String tableSpaceName) {
        this.tableSpaceName = tableSpaceName;
    }

    public DatabaseVolumeResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 表所属用户名称。 **取值范围**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public DatabaseVolumeResult withDatabaseSize(String databaseSize) {
        this.databaseSize = databaseSize;
        return this;
    }

    /**
     * **参数解释**: 数据库占用空间大小。 **取值范围**: 不涉及。 
     * @return databaseSize
     */
    public String getDatabaseSize() {
        return databaseSize;
    }

    public void setDatabaseSize(String databaseSize) {
        this.databaseSize = databaseSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseVolumeResult that = (DatabaseVolumeResult) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.tableSpaceName, that.tableSpaceName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.databaseSize, that.databaseSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, tableSpaceName, userName, databaseSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseVolumeResult {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableSpaceName: ").append(toIndentedString(tableSpaceName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    databaseSize: ").append(toIndentedString(databaseSize)).append("\n");
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

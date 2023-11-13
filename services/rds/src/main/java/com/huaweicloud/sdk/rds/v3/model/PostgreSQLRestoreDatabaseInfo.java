package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 库级恢复数据库信息
 */
public class PostgreSQLRestoreDatabaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "old_name")

    private String oldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_name")

    private String newName;

    public PostgreSQLRestoreDatabaseInfo withOldName(String oldName) {
        this.oldName = oldName;
        return this;
    }

    /**
     * 恢复前库名
     * @return oldName
     */
    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public PostgreSQLRestoreDatabaseInfo withNewName(String newName) {
        this.newName = newName;
        return this;
    }

    /**
     * 恢复后库名
     * @return newName
     */
    public String getNewName() {
        return newName;
    }

    public void setNewName(String newName) {
        this.newName = newName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostgreSQLRestoreDatabaseInfo that = (PostgreSQLRestoreDatabaseInfo) obj;
        return Objects.equals(this.oldName, that.oldName) && Objects.equals(this.newName, that.newName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oldName, newName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgreSQLRestoreDatabaseInfo {\n");
        sb.append("    oldName: ").append(toIndentedString(oldName)).append("\n");
        sb.append("    newName: ").append(toIndentedString(newName)).append("\n");
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

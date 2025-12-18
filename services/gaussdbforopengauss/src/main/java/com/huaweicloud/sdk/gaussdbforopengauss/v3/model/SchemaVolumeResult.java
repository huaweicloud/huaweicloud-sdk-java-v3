package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SchemaVolumeResult
 */
public class SchemaVolumeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_size")

    private String schemaSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_count")

    private String tableCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nsp_name")

    private String nspName;

    public SchemaVolumeResult withSchemaSize(String schemaSize) {
        this.schemaSize = schemaSize;
        return this;
    }

    /**
     * **参数解释**: schema的大小。 **取值范围**: 不涉及。 
     * @return schemaSize
     */
    public String getSchemaSize() {
        return schemaSize;
    }

    public void setSchemaSize(String schemaSize) {
        this.schemaSize = schemaSize;
    }

    public SchemaVolumeResult withTableCount(String tableCount) {
        this.tableCount = tableCount;
        return this;
    }

    /**
     * **参数解释**: schema拥有的表数量。 **取值范围**: 不涉及。 
     * @return tableCount
     */
    public String getTableCount() {
        return tableCount;
    }

    public void setTableCount(String tableCount) {
        this.tableCount = tableCount;
    }

    public SchemaVolumeResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: schema所属用户名称。 **取值范围**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SchemaVolumeResult withNspName(String nspName) {
        this.nspName = nspName;
        return this;
    }

    /**
     * **参数解释**: schema名称空间的名称。 **取值范围**: 不涉及。 
     * @return nspName
     */
    public String getNspName() {
        return nspName;
    }

    public void setNspName(String nspName) {
        this.nspName = nspName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchemaVolumeResult that = (SchemaVolumeResult) obj;
        return Objects.equals(this.schemaSize, that.schemaSize) && Objects.equals(this.tableCount, that.tableCount)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.nspName, that.nspName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaSize, tableCount, userName, nspName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchemaVolumeResult {\n");
        sb.append("    schemaSize: ").append(toIndentedString(schemaSize)).append("\n");
        sb.append("    tableCount: ").append(toIndentedString(tableCount)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    nspName: ").append(toIndentedString(nspName)).append("\n");
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

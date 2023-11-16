package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RevokePostgresqlDbPrivilegeUser
 */
public class RevokePostgresqlDbPrivilegeUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    public RevokePostgresqlDbPrivilegeUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库账号名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RevokePostgresqlDbPrivilegeUser withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 数据库下模式名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RevokePostgresqlDbPrivilegeUser that = (RevokePostgresqlDbPrivilegeUser) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.schemaName, that.schemaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schemaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokePostgresqlDbPrivilegeUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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

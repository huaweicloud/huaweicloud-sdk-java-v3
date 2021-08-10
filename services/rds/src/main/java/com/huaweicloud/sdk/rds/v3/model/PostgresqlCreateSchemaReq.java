package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** PostgresqlCreateSchemaReq */
public class PostgresqlCreateSchemaReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public PostgresqlCreateSchemaReq withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /** schema名称。 schema名称在1到63个字符之间，由字母、数字、或下划线组成，不能包含其他特殊字符，不能以“pg”和数字开头，且不能和RDS for PostgreSQL模板库和已存在的schema重名。 RDS
     * for PostgreSQL模板库包括postgres， template0 ，template1。 已存在的schema包括public，information_schema。
     * 
     * @return schemaName */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public PostgresqlCreateSchemaReq withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /** 数据库属主用户。 数据库属主名称在1到63个字符之间，不能以“pg”和数字开头，不能和系统用户名称相同。 系统用户包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”,“
     * rdsProxy”, “rdsDdm”。
     * 
     * @return owner */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostgresqlCreateSchemaReq postgresqlCreateSchemaReq = (PostgresqlCreateSchemaReq) o;
        return Objects.equals(this.schemaName, postgresqlCreateSchemaReq.schemaName)
            && Objects.equals(this.owner, postgresqlCreateSchemaReq.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostgresqlCreateSchemaReq {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

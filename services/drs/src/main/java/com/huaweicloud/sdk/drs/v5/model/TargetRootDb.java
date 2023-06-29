package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库对象迁移或同步目标库信息，两层到三层数据库时需要指定。
 */
public class TargetRootDb {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_encoding")

    private String dbEncoding;

    public TargetRootDb withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TargetRootDb withDbEncoding(String dbEncoding) {
        this.dbEncoding = dbEncoding;
        return this;
    }

    /**
     * 默认编码格式是utf8。
     * @return dbEncoding
     */
    public String getDbEncoding() {
        return dbEncoding;
    }

    public void setDbEncoding(String dbEncoding) {
        this.dbEncoding = dbEncoding;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TargetRootDb that = (TargetRootDb) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.dbEncoding, that.dbEncoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, dbEncoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TargetRootDb {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbEncoding: ").append(toIndentedString(dbEncoding)).append("\n");
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

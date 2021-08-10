package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 目标实例根节点库信息体 */
public class DefaultRootDb {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_encoding")

    private String dbEncoding;

    public DefaultRootDb withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /** 库名。
     * 
     * @return dbName */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public DefaultRootDb withDbEncoding(String dbEncoding) {
        this.dbEncoding = dbEncoding;
        return this;
    }

    /** 编码格式。
     * 
     * @return dbEncoding */
    public String getDbEncoding() {
        return dbEncoding;
    }

    public void setDbEncoding(String dbEncoding) {
        this.dbEncoding = dbEncoding;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultRootDb defaultRootDb = (DefaultRootDb) o;
        return Objects.equals(this.dbName, defaultRootDb.dbName)
            && Objects.equals(this.dbEncoding, defaultRootDb.dbEncoding);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, dbEncoding);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultRootDb {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    dbEncoding: ").append(toIndentedString(dbEncoding)).append("\n");
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

package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SwitchSqlLimitControlReqV3
 */
public class SwitchSqlLimitControlReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    public SwitchSqlLimitControlReqV3 withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public SwitchSqlLimitControlReqV3 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SQL限流ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SwitchSqlLimitControlReqV3 withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * SQL限流动作标志。 取值为“open”：表示开启当前SQL限流。 取值为“close”：表示关闭当前SQL限流。 取值为“disable_all”：表示禁用所有SQL限流。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SwitchSqlLimitControlReqV3 that = (SwitchSqlLimitControlReqV3) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.action, that.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, id, action);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchSqlLimitControlReqV3 {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

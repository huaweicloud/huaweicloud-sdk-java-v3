package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 数据赋权的赋权信息。
 */
public class DataAuthorizationPrivilege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object")

    private String _object;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<String> privileges = null;

    public DataAuthorizationPrivilege withObject(String _object) {
        this._object = _object;
        return this;
    }

    /**
     * 被赋权的数据对象，命名方式为： “databases.数据库名”，则数据库下面的所有数据都将被共享。 “databases.数据库名.tables.表名”, 指定的表的数据将被共享。 “databases.数据库名.tables.表名.columns.列名”，指定的列将被共享。 \"jobs.flink.flink作业ID\"，指定的作业将被共享。 \"groups.程序包组名\"，指定的程序包组将被共享。 \"resources.程序包名\"，指定程序包将被共享。
     * @return _object
     */
    public String getObject() {
        return _object;
    }

    public void setObject(String _object) {
        this._object = _object;
    }

    public DataAuthorizationPrivilege withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public DataAuthorizationPrivilege addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public DataAuthorizationPrivilege withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 待赋权、回收或更新的权限列表。 说明： 若“action”为“update”，更新列表为空，则表示回收用户在该数据库或表的所有权限
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataAuthorizationPrivilege that = (DataAuthorizationPrivilege) obj;
        return Objects.equals(this._object, that._object) && Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_object, privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataAuthorizationPrivilege {\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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

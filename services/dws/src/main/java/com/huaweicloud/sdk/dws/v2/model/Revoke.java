package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 移除权限信息
 */
public class Revoke {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revoke_with")

    private Boolean revokeWith;

    public Revoke withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * 权限名称，根据不通数据库对象类型，拥有权限不同 - database  CREATE | CONNECT | TEMPORARY | TEMP  ALL  PRIVILEGES - schema  CREATE | USAGE | ALTER | DROP  ALL  PRIVILEGES - table  SELECT | INSERT | UPDATE | DELETE | TRUNCATE | REFERENCES | TRIGGER | ANALYZE | ANALYSE | VACUUM | ALTER | DROP  ALL  PRIVILEGES - view  SELECT | INSERT | UPDATE | DELETE | TRUNCATE | REFERENCES   | TRIGGER | ANALYZE | ANALYSE | VACUUM | ALTER | DROP  ALL  PRIVILEGES - column  SELECT | INSERT | UPDATE | REFERENCES  ALL  PRIVILEGES - function  EXECUTE  ALL  PRIVILEGES - sequence  SELECT | UPDATE | USAGE  ALL  PRIVILEGES - nodegroup  CREATE | USAGE | COMPUTE  ALL  PRIVILEGES - role  role_name（角色名称）
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Revoke withRevokeWith(Boolean revokeWith) {
        this.revokeWith = revokeWith;
        return this;
    }

    /**
     * 是否仅移除授权选项
     * @return revokeWith
     */
    public Boolean getRevokeWith() {
        return revokeWith;
    }

    public void setRevokeWith(Boolean revokeWith) {
        this.revokeWith = revokeWith;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Revoke revoke = (Revoke) o;
        return Objects.equals(this.permission, revoke.permission) && Objects.equals(this.revokeWith, revoke.revokeWith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, revokeWith);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Revoke {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    revokeWith: ").append(toIndentedString(revokeWith)).append("\n");
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

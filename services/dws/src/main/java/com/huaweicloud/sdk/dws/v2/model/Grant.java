package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权信息
 */
public class Grant {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private String permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_with")

    private Boolean grantWith;

    public Grant withPermission(String permission) {
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

    public Grant withGrantWith(Boolean grantWith) {
        this.grantWith = grantWith;
        return this;
    }

    /**
     * 是否包含授权选项
     * @return grantWith
     */
    public Boolean getGrantWith() {
        return grantWith;
    }

    public void setGrantWith(Boolean grantWith) {
        this.grantWith = grantWith;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Grant that = (Grant) obj;
        return Objects.equals(this.permission, that.permission) && Objects.equals(this.grantWith, that.grantWith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, grantWith);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Grant {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    grantWith: ").append(toIndentedString(grantWith)).append("\n");
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

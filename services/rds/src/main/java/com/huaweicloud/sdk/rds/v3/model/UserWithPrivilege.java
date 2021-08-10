package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 用户及其权限。 */
public class UserWithPrivilege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

    public UserWithPrivilege withName(String name) {
        this.name = name;
        return this;
    }

    /** 用户名。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserWithPrivilege withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /** 是否为只读权限。
     * 
     * @return readonly */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserWithPrivilege userWithPrivilege = (UserWithPrivilege) o;
        return Objects.equals(this.name, userWithPrivilege.name)
            && Objects.equals(this.readonly, userWithPrivilege.readonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, readonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserWithPrivilege {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

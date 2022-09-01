package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 数据库帐号名称。  数据库帐号名称在1到128个字符之间，不能和系统用户名称相同。  系统用户包括：rdsadmin, rdsuser, rdsbackup, rdsmirror。
 */
public class SqlserverUserWithPrivilege {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    @JacksonXmlProperty(localName = "readonly")

    private Boolean readonly;

    public SqlserverUserWithPrivilege withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库帐号名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SqlserverUserWithPrivilege withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 是否为只读权限。
     * @return readonly
     */
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
        SqlserverUserWithPrivilege sqlserverUserWithPrivilege = (SqlserverUserWithPrivilege) o;
        return Objects.equals(this.name, sqlserverUserWithPrivilege.name)
            && Objects.equals(this.readonly, sqlserverUserWithPrivilege.readonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, readonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlserverUserWithPrivilege {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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

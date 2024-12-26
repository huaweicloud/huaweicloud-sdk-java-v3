package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户的权限属性。
 */
public class GaussDBforOpenGaussRoleAttributes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema")

    private String schema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_privilege_grantee")

    private String defaultPrivilegeGrantee;

    public GaussDBforOpenGaussRoleAttributes withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 数据库角色名称。 不能使用系统用户或角色，且名称必须存在。 系统用户/角色包括“rdsAdmin”,“rdsMetric”, “rdsBackup”, “rdsRepl”, “root”。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GaussDBforOpenGaussRoleAttributes withSchema(String schema) {
        this.schema = schema;
        return this;
    }

    /**
     * SCHEMA名称。 不能和模板库以及系统内schema重名，且schema名称必须存在。 模板库包括postgres， template0 ，template1, 系统内schema包括public，information_schema。
     * @return schema
     */
    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public GaussDBforOpenGaussRoleAttributes withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 数据库角色权限。 - true：只读。 - false：可读可写。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public GaussDBforOpenGaussRoleAttributes withDefaultPrivilegeGrantee(String defaultPrivilegeGrantee) {
        this.defaultPrivilegeGrantee = defaultPrivilegeGrantee;
        return this;
    }

    /**
     * 数据库用户/角色名称。 该字段的含义是将此用户/角色的权限授予给name字段指定的角色，通过readonly字段判断是否授予只读权限。 不能和系统用户/角色名称相同，且用户/角色名称必须存在，系统用户/角色包括“rdsAdmin”,“ rdsMetric”, “rdsBackup”, “rdsRepl”, “root”。
     * @return defaultPrivilegeGrantee
     */
    public String getDefaultPrivilegeGrantee() {
        return defaultPrivilegeGrantee;
    }

    public void setDefaultPrivilegeGrantee(String defaultPrivilegeGrantee) {
        this.defaultPrivilegeGrantee = defaultPrivilegeGrantee;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GaussDBforOpenGaussRoleAttributes that = (GaussDBforOpenGaussRoleAttributes) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.schema, that.schema)
            && Objects.equals(this.readonly, that.readonly)
            && Objects.equals(this.defaultPrivilegeGrantee, that.defaultPrivilegeGrantee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schema, readonly, defaultPrivilegeGrantee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBforOpenGaussRoleAttributes {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
        sb.append("    defaultPrivilegeGrantee: ").append(toIndentedString(defaultPrivilegeGrantee)).append("\n");
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

package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GaussDBListDatabaseRolesPriv
 */
public class GaussDBListDatabaseRolesPriv {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolsuper")

    private Boolean rolsuper;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolinherit")

    private Boolean rolinherit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolcreaterole")

    private Boolean rolcreaterole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolcreatedb")

    private Boolean rolcreatedb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolcanlogin")

    private Boolean rolcanlogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolconnlimit")

    private Integer rolconnlimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolreplication")

    private Boolean rolreplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolbypassrls")

    private Boolean rolbypassrls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rolpassworddeadline")

    private String rolpassworddeadline;

    public GaussDBListDatabaseRolesPriv withRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
        return this;
    }

    /**
     * 用户/角色是否具有管理员权限。
     * @return rolsuper
     */
    public Boolean getRolsuper() {
        return rolsuper;
    }

    public void setRolsuper(Boolean rolsuper) {
        this.rolsuper = rolsuper;
    }

    public GaussDBListDatabaseRolesPriv withRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
        return this;
    }

    /**
     * 用户/角色是否自动继承其所属角色的权限。
     * @return rolinherit
     */
    public Boolean getRolinherit() {
        return rolinherit;
    }

    public void setRolinherit(Boolean rolinherit) {
        this.rolinherit = rolinherit;
    }

    public GaussDBListDatabaseRolesPriv withRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
        return this;
    }

    /**
     * 用户/角色是否支持创建其他子用户。
     * @return rolcreaterole
     */
    public Boolean getRolcreaterole() {
        return rolcreaterole;
    }

    public void setRolcreaterole(Boolean rolcreaterole) {
        this.rolcreaterole = rolcreaterole;
    }

    public GaussDBListDatabaseRolesPriv withRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
        return this;
    }

    /**
     * 用户/角色是否可以创建数据库。
     * @return rolcreatedb
     */
    public Boolean getRolcreatedb() {
        return rolcreatedb;
    }

    public void setRolcreatedb(Boolean rolcreatedb) {
        this.rolcreatedb = rolcreatedb;
    }

    public GaussDBListDatabaseRolesPriv withRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
        return this;
    }

    /**
     * 用户/角色是否可以登录数据库。
     * @return rolcanlogin
     */
    public Boolean getRolcanlogin() {
        return rolcanlogin;
    }

    public void setRolcanlogin(Boolean rolcanlogin) {
        this.rolcanlogin = rolcanlogin;
    }

    public GaussDBListDatabaseRolesPriv withRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
        return this;
    }

    /**
     * 用户/角色连接实例的最大并发连接数。-1表示没有限制。
     * @return rolconnlimit
     */
    public Integer getRolconnlimit() {
        return rolconnlimit;
    }

    public void setRolconnlimit(Integer rolconnlimit) {
        this.rolconnlimit = rolconnlimit;
    }

    public GaussDBListDatabaseRolesPriv withRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
        return this;
    }

    /**
     * 用户/角色是否属于复制角色。
     * @return rolreplication
     */
    public Boolean getRolreplication() {
        return rolreplication;
    }

    public void setRolreplication(Boolean rolreplication) {
        this.rolreplication = rolreplication;
    }

    public GaussDBListDatabaseRolesPriv withRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
        return this;
    }

    /**
     * 用户/角色是否绕过每个行级安全策略。
     * @return rolbypassrls
     */
    public Boolean getRolbypassrls() {
        return rolbypassrls;
    }

    public void setRolbypassrls(Boolean rolbypassrls) {
        this.rolbypassrls = rolbypassrls;
    }

    public GaussDBListDatabaseRolesPriv withRolpassworddeadline(String rolpassworddeadline) {
        this.rolpassworddeadline = rolpassworddeadline;
        return this;
    }

    /**
     * 用户/角色密码过期时间。
     * @return rolpassworddeadline
     */
    public String getRolpassworddeadline() {
        return rolpassworddeadline;
    }

    public void setRolpassworddeadline(String rolpassworddeadline) {
        this.rolpassworddeadline = rolpassworddeadline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GaussDBListDatabaseRolesPriv that = (GaussDBListDatabaseRolesPriv) obj;
        return Objects.equals(this.rolsuper, that.rolsuper) && Objects.equals(this.rolinherit, that.rolinherit)
            && Objects.equals(this.rolcreaterole, that.rolcreaterole)
            && Objects.equals(this.rolcreatedb, that.rolcreatedb) && Objects.equals(this.rolcanlogin, that.rolcanlogin)
            && Objects.equals(this.rolconnlimit, that.rolconnlimit)
            && Objects.equals(this.rolreplication, that.rolreplication)
            && Objects.equals(this.rolbypassrls, that.rolbypassrls)
            && Objects.equals(this.rolpassworddeadline, that.rolpassworddeadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolsuper,
            rolinherit,
            rolcreaterole,
            rolcreatedb,
            rolcanlogin,
            rolconnlimit,
            rolreplication,
            rolbypassrls,
            rolpassworddeadline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GaussDBListDatabaseRolesPriv {\n");
        sb.append("    rolsuper: ").append(toIndentedString(rolsuper)).append("\n");
        sb.append("    rolinherit: ").append(toIndentedString(rolinherit)).append("\n");
        sb.append("    rolcreaterole: ").append(toIndentedString(rolcreaterole)).append("\n");
        sb.append("    rolcreatedb: ").append(toIndentedString(rolcreatedb)).append("\n");
        sb.append("    rolcanlogin: ").append(toIndentedString(rolcanlogin)).append("\n");
        sb.append("    rolconnlimit: ").append(toIndentedString(rolconnlimit)).append("\n");
        sb.append("    rolreplication: ").append(toIndentedString(rolreplication)).append("\n");
        sb.append("    rolbypassrls: ").append(toIndentedString(rolbypassrls)).append("\n");
        sb.append("    rolpassworddeadline: ").append(toIndentedString(rolpassworddeadline)).append("\n");
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

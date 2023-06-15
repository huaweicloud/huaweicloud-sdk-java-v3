package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户详细信息
 */
public class DatabaseUserInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Boolean login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createrole")

    private Boolean createrole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdb")

    private Boolean createdb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "systemadmin")

    private Boolean systemadmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auditadmin")

    private Boolean auditadmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit")

    private Boolean inherit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "useft")

    private Boolean useft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_limit")

    private Integer connLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication")

    private Boolean replication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_begin")

    private String validBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private String validUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock")

    private Boolean lock;

    public DatabaseUserInfoReq withLogin(Boolean login) {
        this.login = login;
        return this;
    }

    /**
     * 是否可以登陆
     * @return login
     */
    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public DatabaseUserInfoReq withCreaterole(Boolean createrole) {
        this.createrole = createrole;
        return this;
    }

    /**
     * 创建角色权限
     * @return createrole
     */
    public Boolean getCreaterole() {
        return createrole;
    }

    public void setCreaterole(Boolean createrole) {
        this.createrole = createrole;
    }

    public DatabaseUserInfoReq withCreatedb(Boolean createdb) {
        this.createdb = createdb;
        return this;
    }

    /**
     * 创建数据库权限
     * @return createdb
     */
    public Boolean getCreatedb() {
        return createdb;
    }

    public void setCreatedb(Boolean createdb) {
        this.createdb = createdb;
    }

    public DatabaseUserInfoReq withSystemadmin(Boolean systemadmin) {
        this.systemadmin = systemadmin;
        return this;
    }

    /**
     * 系统管理员
     * @return systemadmin
     */
    public Boolean getSystemadmin() {
        return systemadmin;
    }

    public void setSystemadmin(Boolean systemadmin) {
        this.systemadmin = systemadmin;
    }

    public DatabaseUserInfoReq withAuditadmin(Boolean auditadmin) {
        this.auditadmin = auditadmin;
        return this;
    }

    /**
     * 审计管理员
     * @return auditadmin
     */
    public Boolean getAuditadmin() {
        return auditadmin;
    }

    public void setAuditadmin(Boolean auditadmin) {
        this.auditadmin = auditadmin;
    }

    public DatabaseUserInfoReq withInherit(Boolean inherit) {
        this.inherit = inherit;
        return this;
    }

    /**
     * 继承所在组权限
     * @return inherit
     */
    public Boolean getInherit() {
        return inherit;
    }

    public void setInherit(Boolean inherit) {
        this.inherit = inherit;
    }

    public DatabaseUserInfoReq withUseft(Boolean useft) {
        this.useft = useft;
        return this;
    }

    /**
     * 访问外表权限
     * @return useft
     */
    public Boolean getUseft() {
        return useft;
    }

    public void setUseft(Boolean useft) {
        this.useft = useft;
    }

    public DatabaseUserInfoReq withConnLimit(Integer connLimit) {
        this.connLimit = connLimit;
        return this;
    }

    /**
     * 连接数限制
     * @return connLimit
     */
    public Integer getConnLimit() {
        return connLimit;
    }

    public void setConnLimit(Integer connLimit) {
        this.connLimit = connLimit;
    }

    public DatabaseUserInfoReq withReplication(Boolean replication) {
        this.replication = replication;
        return this;
    }

    /**
     * 是否允许流复制
     * @return replication
     */
    public Boolean getReplication() {
        return replication;
    }

    public void setReplication(Boolean replication) {
        this.replication = replication;
    }

    public DatabaseUserInfoReq withValidBegin(String validBegin) {
        this.validBegin = validBegin;
        return this;
    }

    /**
     * 角色生效时间 yyyy-MM-ddTHH:mm:ssZ
     * @return validBegin
     */
    public String getValidBegin() {
        return validBegin;
    }

    public void setValidBegin(String validBegin) {
        this.validBegin = validBegin;
    }

    public DatabaseUserInfoReq withValidUntil(String validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 角色过期时间 yyyy-MM-ddTHH:mm:ssZ
     * @return validUntil
     */
    public String getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public DatabaseUserInfoReq withLock(Boolean lock) {
        this.lock = lock;
        return this;
    }

    /**
     * 是否锁定
     * @return lock
     */
    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseUserInfoReq databaseUserInfoReq = (DatabaseUserInfoReq) o;
        return Objects.equals(this.login, databaseUserInfoReq.login)
            && Objects.equals(this.createrole, databaseUserInfoReq.createrole)
            && Objects.equals(this.createdb, databaseUserInfoReq.createdb)
            && Objects.equals(this.systemadmin, databaseUserInfoReq.systemadmin)
            && Objects.equals(this.auditadmin, databaseUserInfoReq.auditadmin)
            && Objects.equals(this.inherit, databaseUserInfoReq.inherit)
            && Objects.equals(this.useft, databaseUserInfoReq.useft)
            && Objects.equals(this.connLimit, databaseUserInfoReq.connLimit)
            && Objects.equals(this.replication, databaseUserInfoReq.replication)
            && Objects.equals(this.validBegin, databaseUserInfoReq.validBegin)
            && Objects.equals(this.validUntil, databaseUserInfoReq.validUntil)
            && Objects.equals(this.lock, databaseUserInfoReq.lock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login,
            createrole,
            createdb,
            systemadmin,
            auditadmin,
            inherit,
            useft,
            connLimit,
            replication,
            validBegin,
            validUntil,
            lock);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseUserInfoReq {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    createrole: ").append(toIndentedString(createrole)).append("\n");
        sb.append("    createdb: ").append(toIndentedString(createdb)).append("\n");
        sb.append("    systemadmin: ").append(toIndentedString(systemadmin)).append("\n");
        sb.append("    auditadmin: ").append(toIndentedString(auditadmin)).append("\n");
        sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
        sb.append("    useft: ").append(toIndentedString(useft)).append("\n");
        sb.append("    connLimit: ").append(toIndentedString(connLimit)).append("\n");
        sb.append("    replication: ").append(toIndentedString(replication)).append("\n");
        sb.append("    validBegin: ").append(toIndentedString(validBegin)).append("\n");
        sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("    lock: ").append(toIndentedString(lock)).append("\n");
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

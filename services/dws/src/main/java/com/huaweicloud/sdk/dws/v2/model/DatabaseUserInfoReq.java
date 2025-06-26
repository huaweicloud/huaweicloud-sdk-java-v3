package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 用户详细信息。 **取值范围**： 不涉及。
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
     * **参数解释**： 是否可以登录。 **取值范围**： 不涉及。
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
     * **参数解释**： 创建角色权限。 **取值范围**： 不涉及。
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
     * **参数解释**： 创建数据库权限。 **取值范围**： 不涉及。
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
     * **参数解释**： 系统管理员。 **取值范围**： 不涉及。
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
     * **参数解释**： 审计管理员。 **取值范围**： 不涉及。
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
     * **参数解释**： 继承所在组权限。 **取值范围**： 不涉及。
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
     * **参数解释**： 访问外表权限。 **取值范围**： 不涉及。
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
     * **参数解释**： 连接数限制。 **取值范围**： 不涉及。
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
     * **参数解释**： 是否允许流复制。 **取值范围**： 不涉及。
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
     * **参数解释**： 角色生效时间。格式：yyyy-MM-ddTHH:mm:ssZ。 **取值范围**： 不涉及。
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
     * **参数解释**： 角色过期时间。格式：yyyy-MM-ddTHH:mm:ssZ。 **取值范围**： 不涉及。
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
     * **参数解释**： 是否锁定。 **取值范围**： 不涉及。
     * @return lock
     */
    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatabaseUserInfoReq that = (DatabaseUserInfoReq) obj;
        return Objects.equals(this.login, that.login) && Objects.equals(this.createrole, that.createrole)
            && Objects.equals(this.createdb, that.createdb) && Objects.equals(this.systemadmin, that.systemadmin)
            && Objects.equals(this.auditadmin, that.auditadmin) && Objects.equals(this.inherit, that.inherit)
            && Objects.equals(this.useft, that.useft) && Objects.equals(this.connLimit, that.connLimit)
            && Objects.equals(this.replication, that.replication) && Objects.equals(this.validBegin, that.validBegin)
            && Objects.equals(this.validUntil, that.validUntil) && Objects.equals(this.lock, that.lock);
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

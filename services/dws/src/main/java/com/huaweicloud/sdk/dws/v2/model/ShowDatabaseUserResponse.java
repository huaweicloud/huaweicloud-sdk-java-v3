package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDatabaseUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

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

    private Long validBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_until")

    private Long validUntil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock")

    private Boolean lock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster")

    private String logicalCluster;

    public ShowDatabaseUserResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDatabaseUserResponse withLogin(Boolean login) {
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

    public ShowDatabaseUserResponse withCreaterole(Boolean createrole) {
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

    public ShowDatabaseUserResponse withCreatedb(Boolean createdb) {
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

    public ShowDatabaseUserResponse withSystemadmin(Boolean systemadmin) {
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

    public ShowDatabaseUserResponse withAuditadmin(Boolean auditadmin) {
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

    public ShowDatabaseUserResponse withInherit(Boolean inherit) {
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

    public ShowDatabaseUserResponse withUseft(Boolean useft) {
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

    public ShowDatabaseUserResponse withConnLimit(Integer connLimit) {
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

    public ShowDatabaseUserResponse withReplication(Boolean replication) {
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

    public ShowDatabaseUserResponse withValidBegin(Long validBegin) {
        this.validBegin = validBegin;
        return this;
    }

    /**
     * 角色生效时间
     * @return validBegin
     */
    public Long getValidBegin() {
        return validBegin;
    }

    public void setValidBegin(Long validBegin) {
        this.validBegin = validBegin;
    }

    public ShowDatabaseUserResponse withValidUntil(Long validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * 角色过期时间
     * @return validUntil
     */
    public Long getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Long validUntil) {
        this.validUntil = validUntil;
    }

    public ShowDatabaseUserResponse withLock(Boolean lock) {
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

    public ShowDatabaseUserResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ShowDatabaseUserResponse withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 用户类型
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public ShowDatabaseUserResponse withLogicalCluster(String logicalCluster) {
        this.logicalCluster = logicalCluster;
        return this;
    }

    /**
     * 所属逻辑集群
     * @return logicalCluster
     */
    public String getLogicalCluster() {
        return logicalCluster;
    }

    public void setLogicalCluster(String logicalCluster) {
        this.logicalCluster = logicalCluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDatabaseUserResponse that = (ShowDatabaseUserResponse) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.login, that.login)
            && Objects.equals(this.createrole, that.createrole) && Objects.equals(this.createdb, that.createdb)
            && Objects.equals(this.systemadmin, that.systemadmin) && Objects.equals(this.auditadmin, that.auditadmin)
            && Objects.equals(this.inherit, that.inherit) && Objects.equals(this.useft, that.useft)
            && Objects.equals(this.connLimit, that.connLimit) && Objects.equals(this.replication, that.replication)
            && Objects.equals(this.validBegin, that.validBegin) && Objects.equals(this.validUntil, that.validUntil)
            && Objects.equals(this.lock, that.lock) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.userType, that.userType) && Objects.equals(this.logicalCluster, that.logicalCluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            login,
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
            lock,
            desc,
            userType,
            logicalCluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatabaseUserResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    logicalCluster: ").append(toIndentedString(logicalCluster)).append("\n");
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

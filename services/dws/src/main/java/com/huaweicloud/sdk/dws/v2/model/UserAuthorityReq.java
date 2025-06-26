package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建用户/角色请求体。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class UserAuthorityReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "login")

    private Boolean login;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_admin")

    private Boolean systemAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster")

    private String logicalCluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_disable")

    private Boolean passwordDisable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_role")

    private Boolean createRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_db")

    private Boolean createDb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit")

    private Boolean inherit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_limit")

    private Integer connLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_members")

    private List<String> grantMembers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_list")

    private List<GrantAuthority> grantList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    public UserAuthorityReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 用户名/角色名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAuthorityReq withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： 类型。 **约束限制**： 不涉及。 **取值范围**： user：数据库用户。 role：数据库角色。 **默认取值**： 不涉及。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserAuthorityReq withLogin(Boolean login) {
        this.login = login;
        return this;
    }

    /**
     * **参数解释**： 类型。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： false
     * @return login
     */
    public Boolean getLogin() {
        return login;
    }

    public void setLogin(Boolean login) {
        this.login = login;
    }

    public UserAuthorityReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**： 密码。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAuthorityReq withSystemAdmin(Boolean systemAdmin) {
        this.systemAdmin = systemAdmin;
        return this;
    }

    /**
     * **参数解释**： 是否是系统管理员。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return systemAdmin
     */
    public Boolean getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(Boolean systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public UserAuthorityReq withLogicalCluster(String logicalCluster) {
        this.logicalCluster = logicalCluster;
        return this;
    }

    /**
     * **参数解释**： 关联的逻辑集群名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return logicalCluster
     */
    public String getLogicalCluster() {
        return logicalCluster;
    }

    public void setLogicalCluster(String logicalCluster) {
        this.logicalCluster = logicalCluster;
    }

    public UserAuthorityReq withPasswordDisable(Boolean passwordDisable) {
        this.passwordDisable = passwordDisable;
        return this;
    }

    /**
     * **参数解释**： 是否允许密码登录。 **约束限制**： 不涉及。 **取值范围**： - true：允许密码登录 - false：不允许密码登录  **默认取值**： false
     * @return passwordDisable
     */
    public Boolean getPasswordDisable() {
        return passwordDisable;
    }

    public void setPasswordDisable(Boolean passwordDisable) {
        this.passwordDisable = passwordDisable;
    }

    public UserAuthorityReq withCreateRole(Boolean createRole) {
        this.createRole = createRole;
        return this;
    }

    /**
     * **参数解释**： 是否允许创建角色。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： false
     * @return createRole
     */
    public Boolean getCreateRole() {
        return createRole;
    }

    public void setCreateRole(Boolean createRole) {
        this.createRole = createRole;
    }

    public UserAuthorityReq withCreateDb(Boolean createDb) {
        this.createDb = createDb;
        return this;
    }

    /**
     * **参数解释**： 是否允许创建数据库。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： false
     * @return createDb
     */
    public Boolean getCreateDb() {
        return createDb;
    }

    public void setCreateDb(Boolean createDb) {
        this.createDb = createDb;
    }

    public UserAuthorityReq withInherit(Boolean inherit) {
        this.inherit = inherit;
        return this;
    }

    /**
     * **参数解释**： 是否允许继承权限。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： false
     * @return inherit
     */
    public Boolean getInherit() {
        return inherit;
    }

    public void setInherit(Boolean inherit) {
        this.inherit = inherit;
    }

    public UserAuthorityReq withConnLimit(Integer connLimit) {
        this.connLimit = connLimit;
        return this;
    }

    /**
     * **参数解释**： 连接数限制。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return connLimit
     */
    public Integer getConnLimit() {
        return connLimit;
    }

    public void setConnLimit(Integer connLimit) {
        this.connLimit = connLimit;
    }

    public UserAuthorityReq withGrantMembers(List<String> grantMembers) {
        this.grantMembers = grantMembers;
        return this;
    }

    public UserAuthorityReq addGrantMembersItem(String grantMembersItem) {
        if (this.grantMembers == null) {
            this.grantMembers = new ArrayList<>();
        }
        this.grantMembers.add(grantMembersItem);
        return this;
    }

    public UserAuthorityReq withGrantMembers(Consumer<List<String>> grantMembersSetter) {
        if (this.grantMembers == null) {
            this.grantMembers = new ArrayList<>();
        }
        grantMembersSetter.accept(this.grantMembers);
        return this;
    }

    /**
     * **参数解释**： 授权对象信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return grantMembers
     */
    public List<String> getGrantMembers() {
        return grantMembers;
    }

    public void setGrantMembers(List<String> grantMembers) {
        this.grantMembers = grantMembers;
    }

    public UserAuthorityReq withGrantList(List<GrantAuthority> grantList) {
        this.grantList = grantList;
        return this;
    }

    public UserAuthorityReq addGrantListItem(GrantAuthority grantListItem) {
        if (this.grantList == null) {
            this.grantList = new ArrayList<>();
        }
        this.grantList.add(grantListItem);
        return this;
    }

    public UserAuthorityReq withGrantList(Consumer<List<GrantAuthority>> grantListSetter) {
        if (this.grantList == null) {
            this.grantList = new ArrayList<>();
        }
        grantListSetter.accept(this.grantList);
        return this;
    }

    /**
     * **参数解释**： 授权列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return grantList
     */
    public List<GrantAuthority> getGrantList() {
        return grantList;
    }

    public void setGrantList(List<GrantAuthority> grantList) {
        this.grantList = grantList;
    }

    public UserAuthorityReq withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 描述信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAuthorityReq that = (UserAuthorityReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.login, that.login) && Objects.equals(this.password, that.password)
            && Objects.equals(this.systemAdmin, that.systemAdmin)
            && Objects.equals(this.logicalCluster, that.logicalCluster)
            && Objects.equals(this.passwordDisable, that.passwordDisable)
            && Objects.equals(this.createRole, that.createRole) && Objects.equals(this.createDb, that.createDb)
            && Objects.equals(this.inherit, that.inherit) && Objects.equals(this.connLimit, that.connLimit)
            && Objects.equals(this.grantMembers, that.grantMembers) && Objects.equals(this.grantList, that.grantList)
            && Objects.equals(this.desc, that.desc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            login,
            password,
            systemAdmin,
            logicalCluster,
            passwordDisable,
            createRole,
            createDb,
            inherit,
            connLimit,
            grantMembers,
            grantList,
            desc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuthorityReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    systemAdmin: ").append(toIndentedString(systemAdmin)).append("\n");
        sb.append("    logicalCluster: ").append(toIndentedString(logicalCluster)).append("\n");
        sb.append("    passwordDisable: ").append(toIndentedString(passwordDisable)).append("\n");
        sb.append("    createRole: ").append(toIndentedString(createRole)).append("\n");
        sb.append("    createDb: ").append(toIndentedString(createDb)).append("\n");
        sb.append("    inherit: ").append(toIndentedString(inherit)).append("\n");
        sb.append("    connLimit: ").append(toIndentedString(connLimit)).append("\n");
        sb.append("    grantMembers: ").append(toIndentedString(grantMembers)).append("\n");
        sb.append("    grantList: ").append(toIndentedString(grantList)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

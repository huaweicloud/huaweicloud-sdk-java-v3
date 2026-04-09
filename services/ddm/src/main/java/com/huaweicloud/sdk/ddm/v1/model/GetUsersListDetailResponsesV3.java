package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GetUsersListDetailResponsesV3
 */
public class GetUsersListDetailResponsesV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_authority")

    private List<String> baseAuthority = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_lifetime")

    private Long passwordLifetime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_last_changed")

    private String passwordLastChanged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<GetUsersListdatabaseV3> databases = null;

    public GetUsersListDetailResponsesV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的名称。  **取值范围**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GetUsersListDetailResponsesV3 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的状态。  **取值范围**：  不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GetUsersListDetailResponsesV3 withBaseAuthority(List<String> baseAuthority) {
        this.baseAuthority = baseAuthority;
        return this;
    }

    public GetUsersListDetailResponsesV3 addBaseAuthorityItem(String baseAuthorityItem) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        this.baseAuthority.add(baseAuthorityItem);
        return this;
    }

    public GetUsersListDetailResponsesV3 withBaseAuthority(Consumer<List<String>> baseAuthoritySetter) {
        if (this.baseAuthority == null) {
            this.baseAuthority = new ArrayList<>();
        }
        baseAuthoritySetter.accept(this.baseAuthority);
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的基础权限。  **取值范围**：  取值为：CREATE、DROP、ALTER、INDEX、INSERT、DELETE、UPDATE、SELECT
     * @return baseAuthority
     */
    public List<String> getBaseAuthority() {
        return baseAuthority;
    }

    public void setBaseAuthority(List<String> baseAuthority) {
        this.baseAuthority = baseAuthority;
    }

    public GetUsersListDetailResponsesV3 withPasswordLifetime(Long passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号密码的有效期。  **取值范围**：  取值范围为0-65535的整数，单位为天。  0与空表示密码永不过期。
     * @return passwordLifetime
     */
    public Long getPasswordLifetime() {
        return passwordLifetime;
    }

    public void setPasswordLifetime(Long passwordLifetime) {
        this.passwordLifetime = passwordLifetime;
    }

    public GetUsersListDetailResponsesV3 withPasswordLastChanged(String passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号密码最近一次的修改时间。  格式为yyyy-mm-ddThh:mm:ssZ。其中，T指定某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。  **取值范围**：  不涉及。
     * @return passwordLastChanged
     */
    public String getPasswordLastChanged() {
        return passwordLastChanged;
    }

    public void setPasswordLastChanged(String passwordLastChanged) {
        this.passwordLastChanged = passwordLastChanged;
    }

    public GetUsersListDetailResponsesV3 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：  账号的描述信息。  **取值范围**：  不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GetUsersListDetailResponsesV3 withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**：  DDM实例账号的创建时间。  格式为yyyy-mm-ddThh:mm:ssZ。其中，T指定某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。  **取值范围**：  不涉及。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public GetUsersListDetailResponsesV3 withDatabases(List<GetUsersListdatabaseV3> databases) {
        this.databases = databases;
        return this;
    }

    public GetUsersListDetailResponsesV3 addDatabasesItem(GetUsersListdatabaseV3 databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public GetUsersListDetailResponsesV3 withDatabases(Consumer<List<GetUsersListdatabaseV3>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * **参数解释**：  关联的逻辑库集合。账号只对已关联的逻辑库有访问权限。  **取值范围**：  不涉及。
     * @return databases
     */
    public List<GetUsersListdatabaseV3> getDatabases() {
        return databases;
    }

    public void setDatabases(List<GetUsersListdatabaseV3> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetUsersListDetailResponsesV3 that = (GetUsersListDetailResponsesV3) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.status, that.status)
            && Objects.equals(this.baseAuthority, that.baseAuthority)
            && Objects.equals(this.passwordLifetime, that.passwordLifetime)
            && Objects.equals(this.passwordLastChanged, that.passwordLastChanged)
            && Objects.equals(this.description, that.description) && Objects.equals(this.created, that.created)
            && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, status, baseAuthority, passwordLifetime, passwordLastChanged, description, created, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUsersListDetailResponsesV3 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    baseAuthority: ").append(toIndentedString(baseAuthority)).append("\n");
        sb.append("    passwordLifetime: ").append(toIndentedString(passwordLifetime)).append("\n");
        sb.append("    passwordLastChanged: ").append(toIndentedString(passwordLastChanged)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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

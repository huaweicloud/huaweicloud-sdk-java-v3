package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PushRuleDevelopersDto
 */
public class PushRuleDevelopersDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Object id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Object userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private Object userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    public PushRuleDevelopersDto withId(Object id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 主键ID。
     * @return id
     */
    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public PushRuleDevelopersDto withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 用户ID。
     * @return userId
     */
    public Object getUserId() {
        return userId;
    }

    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public PushRuleDevelopersDto withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名。
     * @return userName
     */
    public Object getUserName() {
        return userName;
    }

    public void setUserName(Object userName) {
        this.userName = userName;
    }

    public PushRuleDevelopersDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 昵称。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public PushRuleDevelopersDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PushRuleDevelopersDto that = (PushRuleDevelopersDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.tenantName, that.tenantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, userName, nickName, tenantName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PushRuleDevelopersDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
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

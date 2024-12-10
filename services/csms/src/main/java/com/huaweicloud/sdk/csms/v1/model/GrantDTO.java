package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 授权返回数据
 */
public class GrantDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grantee_user")

    private List<GrantUserInfo> granteeUser = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public GrantDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 授权id，授权给个人时存在
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GrantDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 授权name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GrantDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 授权类型（SECRET，GROUP）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public GrantDTO withGranteeUser(List<GrantUserInfo> granteeUser) {
        this.granteeUser = granteeUser;
        return this;
    }

    public GrantDTO addGranteeUserItem(GrantUserInfo granteeUserItem) {
        if (this.granteeUser == null) {
            this.granteeUser = new ArrayList<>();
        }
        this.granteeUser.add(granteeUserItem);
        return this;
    }

    public GrantDTO withGranteeUser(Consumer<List<GrantUserInfo>> granteeUserSetter) {
        if (this.granteeUser == null) {
            this.granteeUser = new ArrayList<>();
        }
        granteeUserSetter.accept(this.granteeUser);
        return this;
    }

    /**
     * 被授权用户信息
     * @return granteeUser
     */
    public List<GrantUserInfo> getGranteeUser() {
        return granteeUser;
    }

    public void setGranteeUser(List<GrantUserInfo> granteeUser) {
        this.granteeUser = granteeUser;
    }

    public GrantDTO withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public GrantDTO withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GrantDTO that = (GrantDTO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.granteeUser, that.granteeUser)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, granteeUser, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    granteeUser: ").append(toIndentedString(granteeUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

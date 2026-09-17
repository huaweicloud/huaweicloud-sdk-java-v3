package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更细工作项时输入的用户信息
 */
public class UserUpdateAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    public UserUpdateAttribute withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 用户ID，可通过[查询项目成员列表](ListProjectUsers.xml)接口获取，响应消息体中的**id**字段的值就是用户ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserUpdateAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 用户名称。 **约束限制**： 当**id**属性有值时，优先使用**id**和项目成员进行匹配，匹配失败再按**name**匹配。 **取值范围**： 2~64个字符。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserUpdateAttribute withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释**： 用户昵称。 **约束限制**： 当**id**，**name**属性有值时，优先使用**id**，**name**和项目成员进行匹配，匹配失败再按**nick_name**匹配。 **取值范围**： 2~30个字符。 **默认取值**： 不涉及。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserUpdateAttribute that = (UserUpdateAttribute) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nickName, that.nickName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserUpdateAttribute {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
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

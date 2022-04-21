package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试计划处理者信息
 */
public class TestPlanDetailOwner {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public TestPlanDetailOwner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 测试计划处理者id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestPlanDetailOwner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测试计划处理者名称，优先返回nickName，不存在则返回userName
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestPlanDetailOwner withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 测试计划处理者的昵称，当用户未设置昵称时不返回该字段
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public TestPlanDetailOwner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 测试计划处理者的用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TestPlanDetailOwner testPlanDetailOwner = (TestPlanDetailOwner) o;
        return Objects.equals(this.id, testPlanDetailOwner.id) && Objects.equals(this.name, testPlanDetailOwner.name)
            && Objects.equals(this.nickName, testPlanDetailOwner.nickName)
            && Objects.equals(this.userName, testPlanDetailOwner.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nickName, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanDetailOwner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 测试计划创建者信息
 */
public class TestPlanDetailCreator {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    public TestPlanDetailCreator withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 测试计划创建者id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TestPlanDetailCreator withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 测试计划创建者的昵称，当用户未设置昵称时不返回该字段
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public TestPlanDetailCreator withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 测试计划创建者的用户名称
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
        TestPlanDetailCreator testPlanDetailCreator = (TestPlanDetailCreator) o;
        return Objects.equals(this.id, testPlanDetailCreator.id)
            && Objects.equals(this.nickName, testPlanDetailCreator.nickName)
            && Objects.equals(this.userName, testPlanDetailCreator.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickName, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TestPlanDetailCreator {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

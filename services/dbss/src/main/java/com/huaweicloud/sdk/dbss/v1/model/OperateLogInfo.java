package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OperateLogInfo
 */
public class OperateLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function")

    private String function;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private String result;

    public OperateLogInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 操作日志ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public OperateLogInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 操作日志用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public OperateLogInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 该条记录发生的时间，格式为时间戳。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public OperateLogInfo withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 该条记录的操作类型 - create：创建 - update：更新 - delete：删除 - download：下载
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public OperateLogInfo withFunction(String function) {
        this.function = function;
        return this;
    }

    /**
     * 该条记录的功能类型
     * @return function
     */
    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public OperateLogInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 该条记录对应的用户操作对象
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OperateLogInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 该条记录具体的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OperateLogInfo withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 该条记录对应用户执行的结果 - success：成功 - fail：失败
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateLogInfo that = (OperateLogInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.user, that.user)
            && Objects.equals(this.time, that.time) && Objects.equals(this.action, that.action)
            && Objects.equals(this.function, that.function) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, time, action, function, name, description, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateLogInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

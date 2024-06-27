package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmTemplateInfo
 */
public class AlarmTemplateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createUser")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testServiceId")

    private String testServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateUser")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public AlarmTemplateInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public AlarmTemplateInfo withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public AlarmTemplateInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlarmTemplateInfo withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public AlarmTemplateInfo withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 服务id
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    public AlarmTemplateInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AlarmTemplateInfo withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 修改者
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public AlarmTemplateInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmTemplateInfo that = (AlarmTemplateInfo) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.id, that.id) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.testServiceId, that.testServiceId)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, createUser, id, remarks, testServiceId, updateTime, updateUser, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmTemplateInfo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

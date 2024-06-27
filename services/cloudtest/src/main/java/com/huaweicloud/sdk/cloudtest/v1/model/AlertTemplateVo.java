package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AlertTemplateVo
 */
public class AlertTemplateVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertLevels")

    private List<AlertLevel> alertLevels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_service_id")

    private String testServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    public AlertTemplateVo withAlertLevels(List<AlertLevel> alertLevels) {
        this.alertLevels = alertLevels;
        return this;
    }

    public AlertTemplateVo addAlertLevelsItem(AlertLevel alertLevelsItem) {
        if (this.alertLevels == null) {
            this.alertLevels = new ArrayList<>();
        }
        this.alertLevels.add(alertLevelsItem);
        return this;
    }

    public AlertTemplateVo withAlertLevels(Consumer<List<AlertLevel>> alertLevelsSetter) {
        if (this.alertLevels == null) {
            this.alertLevels = new ArrayList<>();
        }
        alertLevelsSetter.accept(this.alertLevels);
        return this;
    }

    /**
     * 告警级别列表
     * @return alertLevels
     */
    public List<AlertLevel> getAlertLevels() {
        return alertLevels;
    }

    public void setAlertLevels(List<AlertLevel> alertLevels) {
        this.alertLevels = alertLevels;
    }

    public AlertTemplateVo withCreateTime(String createTime) {
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

    public AlertTemplateVo withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public AlertTemplateVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID，主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AlertTemplateVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 告警模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AlertTemplateVo withRemarks(String remarks) {
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

    public AlertTemplateVo withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 服务ID
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    public AlertTemplateVo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 创建时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public AlertTemplateVo withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertTemplateVo that = (AlertTemplateVo) obj;
        return Objects.equals(this.alertLevels, that.alertLevels) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.remarks, that.remarks)
            && Objects.equals(this.testServiceId, that.testServiceId)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(alertLevels, createTime, createUser, id, name, remarks, testServiceId, updateTime, updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertTemplateVo {\n");
        sb.append("    alertLevels: ").append(toIndentedString(alertLevels)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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

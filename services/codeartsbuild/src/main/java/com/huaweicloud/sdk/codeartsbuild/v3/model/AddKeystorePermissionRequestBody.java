package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行任务接口请求体
 */
public class AddKeystorePermissionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private Boolean delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify")

    private Boolean modify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Boolean usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private Boolean setting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_absent")

    private Boolean canAbsent;

    public AddKeystorePermissionRequestBody withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * 是否有删除权限
     * @return delete
     */
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public AddKeystorePermissionRequestBody withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 文件密钥id
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public AddKeystorePermissionRequestBody withModify(Boolean modify) {
        this.modify = modify;
        return this;
    }

    /**
     * 是否有修改权限
     * @return modify
     */
    public Boolean getModify() {
        return modify;
    }

    public void setModify(Boolean modify) {
        this.modify = modify;
    }

    public AddKeystorePermissionRequestBody withUsage(Boolean usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 是否有使用权限
     * @return usage
     */
    public Boolean getUsage() {
        return usage;
    }

    public void setUsage(Boolean usage) {
        this.usage = usage;
    }

    public AddKeystorePermissionRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AddKeystorePermissionRequestBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AddKeystorePermissionRequestBody withSetting(Boolean setting) {
        this.setting = setting;
        return this;
    }

    /**
     * 是否有设置权限
     * @return setting
     */
    public Boolean getSetting() {
        return setting;
    }

    public void setSetting(Boolean setting) {
        this.setting = setting;
    }

    public AddKeystorePermissionRequestBody withCanAbsent(Boolean canAbsent) {
        this.canAbsent = canAbsent;
        return this;
    }

    /**
     * 是否可编辑
     * @return canAbsent
     */
    public Boolean getCanAbsent() {
        return canAbsent;
    }

    public void setCanAbsent(Boolean canAbsent) {
        this.canAbsent = canAbsent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddKeystorePermissionRequestBody that = (AddKeystorePermissionRequestBody) obj;
        return Objects.equals(this.delete, that.delete) && Objects.equals(this.keystoreId, that.keystoreId)
            && Objects.equals(this.modify, that.modify) && Objects.equals(this.usage, that.usage)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.setting, that.setting) && Objects.equals(this.canAbsent, that.canAbsent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delete, keystoreId, modify, usage, userName, userId, setting, canAbsent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddKeystorePermissionRequestBody {\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    canAbsent: ").append(toIndentedString(canAbsent)).append("\n");
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

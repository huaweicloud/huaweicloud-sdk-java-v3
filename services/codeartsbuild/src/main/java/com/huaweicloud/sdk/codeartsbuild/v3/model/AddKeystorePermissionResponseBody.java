package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行任务接口请求体
 */
public class AddKeystorePermissionResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private Boolean setting;

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
    @JsonProperty(value = "is_creator")

    private Boolean isCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_absent")

    private Boolean canAbsent;

    public AddKeystorePermissionResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 权限id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AddKeystorePermissionResponseBody withSetting(Boolean setting) {
        this.setting = setting;
        return this;
    }

    /**
     * 编辑权限
     * @return setting
     */
    public Boolean getSetting() {
        return setting;
    }

    public void setSetting(Boolean setting) {
        this.setting = setting;
    }

    public AddKeystorePermissionResponseBody withDelete(Boolean delete) {
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

    public AddKeystorePermissionResponseBody withKeystoreId(String keystoreId) {
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

    public AddKeystorePermissionResponseBody withModify(Boolean modify) {
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

    public AddKeystorePermissionResponseBody withUsage(Boolean usage) {
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

    public AddKeystorePermissionResponseBody withUserName(String userName) {
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

    public AddKeystorePermissionResponseBody withIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
        return this;
    }

    /**
     * 是否是创建者
     * @return isCreator
     */
    public Boolean getIsCreator() {
        return isCreator;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public AddKeystorePermissionResponseBody withCanAbsent(Boolean canAbsent) {
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
        AddKeystorePermissionResponseBody that = (AddKeystorePermissionResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.setting, that.setting)
            && Objects.equals(this.delete, that.delete) && Objects.equals(this.keystoreId, that.keystoreId)
            && Objects.equals(this.modify, that.modify) && Objects.equals(this.usage, that.usage)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.isCreator, that.isCreator)
            && Objects.equals(this.canAbsent, that.canAbsent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, setting, delete, keystoreId, modify, usage, userName, isCreator, canAbsent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddKeystorePermissionResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    isCreator: ").append(toIndentedString(isCreator)).append("\n");
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

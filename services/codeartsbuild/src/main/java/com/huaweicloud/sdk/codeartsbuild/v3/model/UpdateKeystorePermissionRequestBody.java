package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 执行任务接口请求体
 */
public class UpdateKeystorePermissionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_absent")

    private Boolean canAbsent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private Boolean delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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

    public UpdateKeystorePermissionRequestBody withCanAbsent(Boolean canAbsent) {
        this.canAbsent = canAbsent;
        return this;
    }

    /**
     * can_absent
     * @return canAbsent
     */
    public Boolean getCanAbsent() {
        return canAbsent;
    }

    public void setCanAbsent(Boolean canAbsent) {
        this.canAbsent = canAbsent;
    }

    public UpdateKeystorePermissionRequestBody withDelete(Boolean delete) {
        this.delete = delete;
        return this;
    }

    /**
     * delete
     * @return delete
     */
    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public UpdateKeystorePermissionRequestBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UpdateKeystorePermissionRequestBody withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * keystore_id
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public UpdateKeystorePermissionRequestBody withModify(Boolean modify) {
        this.modify = modify;
        return this;
    }

    /**
     * modify
     * @return modify
     */
    public Boolean getModify() {
        return modify;
    }

    public void setModify(Boolean modify) {
        this.modify = modify;
    }

    public UpdateKeystorePermissionRequestBody withUsage(Boolean usage) {
        this.usage = usage;
        return this;
    }

    /**
     * usage
     * @return usage
     */
    public Boolean getUsage() {
        return usage;
    }

    public void setUsage(Boolean usage) {
        this.usage = usage;
    }

    public UpdateKeystorePermissionRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * user_name
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateKeystorePermissionRequestBody that = (UpdateKeystorePermissionRequestBody) obj;
        return Objects.equals(this.canAbsent, that.canAbsent) && Objects.equals(this.delete, that.delete)
            && Objects.equals(this.id, that.id) && Objects.equals(this.keystoreId, that.keystoreId)
            && Objects.equals(this.modify, that.modify) && Objects.equals(this.usage, that.usage)
            && Objects.equals(this.userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canAbsent, delete, id, keystoreId, modify, usage, userName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateKeystorePermissionRequestBody {\n");
        sb.append("    canAbsent: ").append(toIndentedString(canAbsent)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

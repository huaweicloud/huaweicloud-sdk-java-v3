package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 权限
 */
public class ListKeystoreSearchResponseBodyResultPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_id")

    private String keystoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting")

    private Boolean setting;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete")

    private Boolean delete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify")

    private Boolean modify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private Boolean usage;

    public ListKeystoreSearchResponseBodyResultPermission withKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
        return this;
    }

    /**
     * 文件ID
     * @return keystoreId
     */
    public String getKeystoreId() {
        return keystoreId;
    }

    public void setKeystoreId(String keystoreId) {
        this.keystoreId = keystoreId;
    }

    public ListKeystoreSearchResponseBodyResultPermission withSetting(Boolean setting) {
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

    public ListKeystoreSearchResponseBodyResultPermission withDelete(Boolean delete) {
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

    public ListKeystoreSearchResponseBodyResultPermission withModify(Boolean modify) {
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

    public ListKeystoreSearchResponseBodyResultPermission withUsage(Boolean usage) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListKeystoreSearchResponseBodyResultPermission that = (ListKeystoreSearchResponseBodyResultPermission) obj;
        return Objects.equals(this.keystoreId, that.keystoreId) && Objects.equals(this.setting, that.setting)
            && Objects.equals(this.delete, that.delete) && Objects.equals(this.modify, that.modify)
            && Objects.equals(this.usage, that.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystoreId, setting, delete, modify, usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListKeystoreSearchResponseBodyResultPermission {\n");
        sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
        sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
        sb.append("    modify: ").append(toIndentedString(modify)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “联系人”文件夹重定向配置
 */
public class ContactsConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_status")

    private Integer contactsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_redirection_type")

    private Integer contactsRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_storage_path")

    private String contactsStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_relative_path")

    private String contactsRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_exclusive_rights")

    private Integer contactsExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_move_contents")

    private Integer contactsMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_move_content_on_policy_removal")

    private Integer contactsMoveContentOnPolicyRemoval;

    public ContactsConfigurations withContactsStatus(Integer contactsStatus) {
        this.contactsStatus = contactsStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return contactsStatus
     */
    public Integer getContactsStatus() {
        return contactsStatus;
    }

    public void setContactsStatus(Integer contactsStatus) {
        this.contactsStatus = contactsStatus;
    }

    public ContactsConfigurations withContactsRedirectionType(Integer contactsRedirectionType) {
        this.contactsRedirectionType = contactsRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return contactsRedirectionType
     */
    public Integer getContactsRedirectionType() {
        return contactsRedirectionType;
    }

    public void setContactsRedirectionType(Integer contactsRedirectionType) {
        this.contactsRedirectionType = contactsRedirectionType;
    }

    public ContactsConfigurations withContactsStoragePath(String contactsStoragePath) {
        this.contactsStoragePath = contactsStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return contactsStoragePath
     */
    public String getContactsStoragePath() {
        return contactsStoragePath;
    }

    public void setContactsStoragePath(String contactsStoragePath) {
        this.contactsStoragePath = contactsStoragePath;
    }

    public ContactsConfigurations withContactsRelativePath(String contactsRelativePath) {
        this.contactsRelativePath = contactsRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return contactsRelativePath
     */
    public String getContactsRelativePath() {
        return contactsRelativePath;
    }

    public void setContactsRelativePath(String contactsRelativePath) {
        this.contactsRelativePath = contactsRelativePath;
    }

    public ContactsConfigurations withContactsExclusiveRights(Integer contactsExclusiveRights) {
        this.contactsExclusiveRights = contactsExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return contactsExclusiveRights
     */
    public Integer getContactsExclusiveRights() {
        return contactsExclusiveRights;
    }

    public void setContactsExclusiveRights(Integer contactsExclusiveRights) {
        this.contactsExclusiveRights = contactsExclusiveRights;
    }

    public ContactsConfigurations withContactsMoveContents(Integer contactsMoveContents) {
        this.contactsMoveContents = contactsMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return contactsMoveContents
     */
    public Integer getContactsMoveContents() {
        return contactsMoveContents;
    }

    public void setContactsMoveContents(Integer contactsMoveContents) {
        this.contactsMoveContents = contactsMoveContents;
    }

    public ContactsConfigurations withContactsMoveContentOnPolicyRemoval(Integer contactsMoveContentOnPolicyRemoval) {
        this.contactsMoveContentOnPolicyRemoval = contactsMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return contactsMoveContentOnPolicyRemoval
     */
    public Integer getContactsMoveContentOnPolicyRemoval() {
        return contactsMoveContentOnPolicyRemoval;
    }

    public void setContactsMoveContentOnPolicyRemoval(Integer contactsMoveContentOnPolicyRemoval) {
        this.contactsMoveContentOnPolicyRemoval = contactsMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContactsConfigurations that = (ContactsConfigurations) obj;
        return Objects.equals(this.contactsStatus, that.contactsStatus)
            && Objects.equals(this.contactsRedirectionType, that.contactsRedirectionType)
            && Objects.equals(this.contactsStoragePath, that.contactsStoragePath)
            && Objects.equals(this.contactsRelativePath, that.contactsRelativePath)
            && Objects.equals(this.contactsExclusiveRights, that.contactsExclusiveRights)
            && Objects.equals(this.contactsMoveContents, that.contactsMoveContents)
            && Objects.equals(this.contactsMoveContentOnPolicyRemoval, that.contactsMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactsStatus,
            contactsRedirectionType,
            contactsStoragePath,
            contactsRelativePath,
            contactsExclusiveRights,
            contactsMoveContents,
            contactsMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactsConfigurations {\n");
        sb.append("    contactsStatus: ").append(toIndentedString(contactsStatus)).append("\n");
        sb.append("    contactsRedirectionType: ").append(toIndentedString(contactsRedirectionType)).append("\n");
        sb.append("    contactsStoragePath: ").append(toIndentedString(contactsStoragePath)).append("\n");
        sb.append("    contactsRelativePath: ").append(toIndentedString(contactsRelativePath)).append("\n");
        sb.append("    contactsExclusiveRights: ").append(toIndentedString(contactsExclusiveRights)).append("\n");
        sb.append("    contactsMoveContents: ").append(toIndentedString(contactsMoveContents)).append("\n");
        sb.append("    contactsMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(contactsMoveContentOnPolicyRemoval))
            .append("\n");
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

package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色业务配置基本信息。
 */
public class RoleBusinessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_business_id")

    private String roleBusinessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_list")

    private List<RoleKnowledgeLibraryInfo> knowledgeLibraryList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public RoleBusinessInfo withRoleBusinessId(String roleBusinessId) {
        this.roleBusinessId = roleBusinessId;
        return this;
    }

    /**
     * 角色业务配置ID。
     * @return roleBusinessId
     */
    public String getRoleBusinessId() {
        return roleBusinessId;
    }

    public void setRoleBusinessId(String roleBusinessId) {
        this.roleBusinessId = roleBusinessId;
    }

    public RoleBusinessInfo withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public RoleBusinessInfo withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * Get language
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public RoleBusinessInfo withPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * 提示词。
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public RoleBusinessInfo withKnowledgeLibraryList(List<RoleKnowledgeLibraryInfo> knowledgeLibraryList) {
        this.knowledgeLibraryList = knowledgeLibraryList;
        return this;
    }

    public RoleBusinessInfo addKnowledgeLibraryListItem(RoleKnowledgeLibraryInfo knowledgeLibraryListItem) {
        if (this.knowledgeLibraryList == null) {
            this.knowledgeLibraryList = new ArrayList<>();
        }
        this.knowledgeLibraryList.add(knowledgeLibraryListItem);
        return this;
    }

    public RoleBusinessInfo withKnowledgeLibraryList(
        Consumer<List<RoleKnowledgeLibraryInfo>> knowledgeLibraryListSetter) {
        if (this.knowledgeLibraryList == null) {
            this.knowledgeLibraryList = new ArrayList<>();
        }
        knowledgeLibraryListSetter.accept(this.knowledgeLibraryList);
        return this;
    }

    /**
     * 知识库列表
     * @return knowledgeLibraryList
     */
    public List<RoleKnowledgeLibraryInfo> getKnowledgeLibraryList() {
        return knowledgeLibraryList;
    }

    public void setKnowledgeLibraryList(List<RoleKnowledgeLibraryInfo> knowledgeLibraryList) {
        this.knowledgeLibraryList = knowledgeLibraryList;
    }

    public RoleBusinessInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RoleBusinessInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleBusinessInfo that = (RoleBusinessInfo) obj;
        return Objects.equals(this.roleBusinessId, that.roleBusinessId) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.language, that.language) && Objects.equals(this.prompt, that.prompt)
            && Objects.equals(this.knowledgeLibraryList, that.knowledgeLibraryList)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleBusinessId, roleId, language, prompt, knowledgeLibraryList, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleBusinessInfo {\n");
        sb.append("    roleBusinessId: ").append(toIndentedString(roleBusinessId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    knowledgeLibraryList: ").append(toIndentedString(knowledgeLibraryList)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

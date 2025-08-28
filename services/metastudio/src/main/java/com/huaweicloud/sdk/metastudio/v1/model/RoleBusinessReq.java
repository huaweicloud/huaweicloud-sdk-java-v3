package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色业务配置请求。
 */
public class RoleBusinessReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prompt")

    private String prompt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_list")

    private List<RoleKnowledgeLibraryReq> knowledgeLibraryList = null;

    public RoleBusinessReq withLanguage(LanguageEnum language) {
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

    public RoleBusinessReq withPrompt(String prompt) {
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

    public RoleBusinessReq withKnowledgeLibraryList(List<RoleKnowledgeLibraryReq> knowledgeLibraryList) {
        this.knowledgeLibraryList = knowledgeLibraryList;
        return this;
    }

    public RoleBusinessReq addKnowledgeLibraryListItem(RoleKnowledgeLibraryReq knowledgeLibraryListItem) {
        if (this.knowledgeLibraryList == null) {
            this.knowledgeLibraryList = new ArrayList<>();
        }
        this.knowledgeLibraryList.add(knowledgeLibraryListItem);
        return this;
    }

    public RoleBusinessReq withKnowledgeLibraryList(
        Consumer<List<RoleKnowledgeLibraryReq>> knowledgeLibraryListSetter) {
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
    public List<RoleKnowledgeLibraryReq> getKnowledgeLibraryList() {
        return knowledgeLibraryList;
    }

    public void setKnowledgeLibraryList(List<RoleKnowledgeLibraryReq> knowledgeLibraryList) {
        this.knowledgeLibraryList = knowledgeLibraryList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleBusinessReq that = (RoleBusinessReq) obj;
        return Objects.equals(this.language, that.language) && Objects.equals(this.prompt, that.prompt)
            && Objects.equals(this.knowledgeLibraryList, that.knowledgeLibraryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, prompt, knowledgeLibraryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleBusinessReq {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    knowledgeLibraryList: ").append(toIndentedString(knowledgeLibraryList)).append("\n");
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

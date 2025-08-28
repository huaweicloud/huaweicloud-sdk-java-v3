package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 槽位关联的知识库信息。
 */
public class SlotKnowledgeLibraryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private LanguageEnum language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    public SlotKnowledgeLibraryInfo withLanguage(LanguageEnum language) {
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

    public SlotKnowledgeLibraryInfo withKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
        return this;
    }

    /**
     * 知识库ID。
     * @return knowledgeLibraryId
     */
    public String getKnowledgeLibraryId() {
        return knowledgeLibraryId;
    }

    public void setKnowledgeLibraryId(String knowledgeLibraryId) {
        this.knowledgeLibraryId = knowledgeLibraryId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlotKnowledgeLibraryInfo that = (SlotKnowledgeLibraryInfo) obj;
        return Objects.equals(this.language, that.language)
            && Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, knowledgeLibraryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotKnowledgeLibraryInfo {\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
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

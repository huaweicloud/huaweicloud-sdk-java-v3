package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 知识库基础信息。
 */
public class KnowledgeLibraryBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id")

    private String knowledgeLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public KnowledgeLibraryBaseInfo withKnowledgeLibraryId(String knowledgeLibraryId) {
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

    public KnowledgeLibraryBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 知识库名称。
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
        KnowledgeLibraryBaseInfo that = (KnowledgeLibraryBaseInfo) obj;
        return Objects.equals(this.knowledgeLibraryId, that.knowledgeLibraryId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeLibraryId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KnowledgeLibraryBaseInfo {\n");
        sb.append("    knowledgeLibraryId: ").append(toIndentedString(knowledgeLibraryId)).append("\n");
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

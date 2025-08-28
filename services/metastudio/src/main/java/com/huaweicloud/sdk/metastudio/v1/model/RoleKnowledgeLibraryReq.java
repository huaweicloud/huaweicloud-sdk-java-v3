package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色知识库配置请求信息。
 */
public class RoleKnowledgeLibraryReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_type")

    private KnowledgeTypeEnum knowledgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_id_list")

    private List<String> knowledgeLibraryIdList = null;

    public RoleKnowledgeLibraryReq withKnowledgeType(KnowledgeTypeEnum knowledgeType) {
        this.knowledgeType = knowledgeType;
        return this;
    }

    /**
     * Get knowledgeType
     * @return knowledgeType
     */
    public KnowledgeTypeEnum getKnowledgeType() {
        return knowledgeType;
    }

    public void setKnowledgeType(KnowledgeTypeEnum knowledgeType) {
        this.knowledgeType = knowledgeType;
    }

    public RoleKnowledgeLibraryReq withKnowledgeLibraryIdList(List<String> knowledgeLibraryIdList) {
        this.knowledgeLibraryIdList = knowledgeLibraryIdList;
        return this;
    }

    public RoleKnowledgeLibraryReq addKnowledgeLibraryIdListItem(String knowledgeLibraryIdListItem) {
        if (this.knowledgeLibraryIdList == null) {
            this.knowledgeLibraryIdList = new ArrayList<>();
        }
        this.knowledgeLibraryIdList.add(knowledgeLibraryIdListItem);
        return this;
    }

    public RoleKnowledgeLibraryReq withKnowledgeLibraryIdList(Consumer<List<String>> knowledgeLibraryIdListSetter) {
        if (this.knowledgeLibraryIdList == null) {
            this.knowledgeLibraryIdList = new ArrayList<>();
        }
        knowledgeLibraryIdListSetter.accept(this.knowledgeLibraryIdList);
        return this;
    }

    /**
     * 知识库ID列表
     * @return knowledgeLibraryIdList
     */
    public List<String> getKnowledgeLibraryIdList() {
        return knowledgeLibraryIdList;
    }

    public void setKnowledgeLibraryIdList(List<String> knowledgeLibraryIdList) {
        this.knowledgeLibraryIdList = knowledgeLibraryIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleKnowledgeLibraryReq that = (RoleKnowledgeLibraryReq) obj;
        return Objects.equals(this.knowledgeType, that.knowledgeType)
            && Objects.equals(this.knowledgeLibraryIdList, that.knowledgeLibraryIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeType, knowledgeLibraryIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleKnowledgeLibraryReq {\n");
        sb.append("    knowledgeType: ").append(toIndentedString(knowledgeType)).append("\n");
        sb.append("    knowledgeLibraryIdList: ").append(toIndentedString(knowledgeLibraryIdList)).append("\n");
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

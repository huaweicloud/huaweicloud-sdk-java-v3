package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色知识库基本信息。
 */
public class RoleKnowledgeLibraryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_type")

    private KnowledgeTypeEnum knowledgeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_info_list")

    private List<KnowledgeLibraryBaseInfo> knowledgeLibraryInfoList = null;

    public RoleKnowledgeLibraryInfo withKnowledgeType(KnowledgeTypeEnum knowledgeType) {
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

    public RoleKnowledgeLibraryInfo withKnowledgeLibraryInfoList(
        List<KnowledgeLibraryBaseInfo> knowledgeLibraryInfoList) {
        this.knowledgeLibraryInfoList = knowledgeLibraryInfoList;
        return this;
    }

    public RoleKnowledgeLibraryInfo addKnowledgeLibraryInfoListItem(
        KnowledgeLibraryBaseInfo knowledgeLibraryInfoListItem) {
        if (this.knowledgeLibraryInfoList == null) {
            this.knowledgeLibraryInfoList = new ArrayList<>();
        }
        this.knowledgeLibraryInfoList.add(knowledgeLibraryInfoListItem);
        return this;
    }

    public RoleKnowledgeLibraryInfo withKnowledgeLibraryInfoList(
        Consumer<List<KnowledgeLibraryBaseInfo>> knowledgeLibraryInfoListSetter) {
        if (this.knowledgeLibraryInfoList == null) {
            this.knowledgeLibraryInfoList = new ArrayList<>();
        }
        knowledgeLibraryInfoListSetter.accept(this.knowledgeLibraryInfoList);
        return this;
    }

    /**
     * 知识库列表
     * @return knowledgeLibraryInfoList
     */
    public List<KnowledgeLibraryBaseInfo> getKnowledgeLibraryInfoList() {
        return knowledgeLibraryInfoList;
    }

    public void setKnowledgeLibraryInfoList(List<KnowledgeLibraryBaseInfo> knowledgeLibraryInfoList) {
        this.knowledgeLibraryInfoList = knowledgeLibraryInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleKnowledgeLibraryInfo that = (RoleKnowledgeLibraryInfo) obj;
        return Objects.equals(this.knowledgeType, that.knowledgeType)
            && Objects.equals(this.knowledgeLibraryInfoList, that.knowledgeLibraryInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeType, knowledgeLibraryInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleKnowledgeLibraryInfo {\n");
        sb.append("    knowledgeType: ").append(toIndentedString(knowledgeType)).append("\n");
        sb.append("    knowledgeLibraryInfoList: ").append(toIndentedString(knowledgeLibraryInfoList)).append("\n");
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

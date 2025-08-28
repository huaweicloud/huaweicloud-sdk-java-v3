package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 指令槽位信息。
 */
public class InstructionSlotInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_library_list")

    private List<SlotKnowledgeLibraryInfo> knowledgeLibraryList = null;

    public InstructionSlotInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 槽位名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InstructionSlotInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 槽位描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InstructionSlotInfo withKnowledgeLibraryList(List<SlotKnowledgeLibraryInfo> knowledgeLibraryList) {
        this.knowledgeLibraryList = knowledgeLibraryList;
        return this;
    }

    public InstructionSlotInfo addKnowledgeLibraryListItem(SlotKnowledgeLibraryInfo knowledgeLibraryListItem) {
        if (this.knowledgeLibraryList == null) {
            this.knowledgeLibraryList = new ArrayList<>();
        }
        this.knowledgeLibraryList.add(knowledgeLibraryListItem);
        return this;
    }

    public InstructionSlotInfo withKnowledgeLibraryList(
        Consumer<List<SlotKnowledgeLibraryInfo>> knowledgeLibraryListSetter) {
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
    public List<SlotKnowledgeLibraryInfo> getKnowledgeLibraryList() {
        return knowledgeLibraryList;
    }

    public void setKnowledgeLibraryList(List<SlotKnowledgeLibraryInfo> knowledgeLibraryList) {
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
        InstructionSlotInfo that = (InstructionSlotInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.knowledgeLibraryList, that.knowledgeLibraryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, knowledgeLibraryList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstructionSlotInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

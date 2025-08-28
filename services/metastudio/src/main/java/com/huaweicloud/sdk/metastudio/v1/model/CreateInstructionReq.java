package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建指令请求。
 */
public class CreateInstructionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction")

    private String instruction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instruction_library_id")

    private String instructionLibraryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slot_list")

    private List<InstructionSlotInfo> slotList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_words_list")

    private List<InstructionReplyWordsInfo> replyWordsList = null;

    public CreateInstructionReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 指令名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInstructionReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 指令描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateInstructionReq withInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }

    /**
     * 操作指令。
     * @return instruction
     */
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public CreateInstructionReq withInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
        return this;
    }

    /**
     * 指令集ID。
     * @return instructionLibraryId
     */
    public String getInstructionLibraryId() {
        return instructionLibraryId;
    }

    public void setInstructionLibraryId(String instructionLibraryId) {
        this.instructionLibraryId = instructionLibraryId;
    }

    public CreateInstructionReq withSlotList(List<InstructionSlotInfo> slotList) {
        this.slotList = slotList;
        return this;
    }

    public CreateInstructionReq addSlotListItem(InstructionSlotInfo slotListItem) {
        if (this.slotList == null) {
            this.slotList = new ArrayList<>();
        }
        this.slotList.add(slotListItem);
        return this;
    }

    public CreateInstructionReq withSlotList(Consumer<List<InstructionSlotInfo>> slotListSetter) {
        if (this.slotList == null) {
            this.slotList = new ArrayList<>();
        }
        slotListSetter.accept(this.slotList);
        return this;
    }

    /**
     * 槽位列表
     * @return slotList
     */
    public List<InstructionSlotInfo> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<InstructionSlotInfo> slotList) {
        this.slotList = slotList;
    }

    public CreateInstructionReq withReplyWordsList(List<InstructionReplyWordsInfo> replyWordsList) {
        this.replyWordsList = replyWordsList;
        return this;
    }

    public CreateInstructionReq addReplyWordsListItem(InstructionReplyWordsInfo replyWordsListItem) {
        if (this.replyWordsList == null) {
            this.replyWordsList = new ArrayList<>();
        }
        this.replyWordsList.add(replyWordsListItem);
        return this;
    }

    public CreateInstructionReq withReplyWordsList(Consumer<List<InstructionReplyWordsInfo>> replyWordsListSetter) {
        if (this.replyWordsList == null) {
            this.replyWordsList = new ArrayList<>();
        }
        replyWordsListSetter.accept(this.replyWordsList);
        return this;
    }

    /**
     * 指令回复话术列表
     * @return replyWordsList
     */
    public List<InstructionReplyWordsInfo> getReplyWordsList() {
        return replyWordsList;
    }

    public void setReplyWordsList(List<InstructionReplyWordsInfo> replyWordsList) {
        this.replyWordsList = replyWordsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstructionReq that = (CreateInstructionReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instruction, that.instruction)
            && Objects.equals(this.instructionLibraryId, that.instructionLibraryId)
            && Objects.equals(this.slotList, that.slotList) && Objects.equals(this.replyWordsList, that.replyWordsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, instruction, instructionLibraryId, slotList, replyWordsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstructionReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
        sb.append("    instructionLibraryId: ").append(toIndentedString(instructionLibraryId)).append("\n");
        sb.append("    slotList: ").append(toIndentedString(slotList)).append("\n");
        sb.append("    replyWordsList: ").append(toIndentedString(replyWordsList)).append("\n");
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

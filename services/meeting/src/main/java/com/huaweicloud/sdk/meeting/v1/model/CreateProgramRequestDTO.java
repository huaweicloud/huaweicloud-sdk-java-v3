package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节目信息。
 */
public class CreateProgramRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programName")

    private String programName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programItemList")

    private List<ProgramItemRequestBase> programItemList = null;

    public CreateProgramRequestDTO withProgramName(String programName) {
        this.programName = programName;
        return this;
    }

    /**
     * 节目名称。
     * @return programName
     */
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public CreateProgramRequestDTO withProgramItemList(List<ProgramItemRequestBase> programItemList) {
        this.programItemList = programItemList;
        return this;
    }

    public CreateProgramRequestDTO addProgramItemListItem(ProgramItemRequestBase programItemListItem) {
        if (this.programItemList == null) {
            this.programItemList = new ArrayList<>();
        }
        this.programItemList.add(programItemListItem);
        return this;
    }

    public CreateProgramRequestDTO withProgramItemList(Consumer<List<ProgramItemRequestBase>> programItemListSetter) {
        if (this.programItemList == null) {
            this.programItemList = new ArrayList<>();
        }
        programItemListSetter.accept(this.programItemList);
        return this;
    }

    /**
     * 节目素材列表。
     * @return programItemList
     */
    public List<ProgramItemRequestBase> getProgramItemList() {
        return programItemList;
    }

    public void setProgramItemList(List<ProgramItemRequestBase> programItemList) {
        this.programItemList = programItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateProgramRequestDTO that = (CreateProgramRequestDTO) obj;
        return Objects.equals(this.programName, that.programName)
            && Objects.equals(this.programItemList, that.programItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programName, programItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateProgramRequestDTO {\n");
        sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
        sb.append("    programItemList: ").append(toIndentedString(programItemList)).append("\n");
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

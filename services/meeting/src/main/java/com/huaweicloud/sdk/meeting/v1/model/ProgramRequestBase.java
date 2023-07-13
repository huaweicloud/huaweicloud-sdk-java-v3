package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节目基础信息。
 */
public class ProgramRequestBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "programName")

    private String programName;

    public ProgramRequestBase withProgramName(String programName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProgramRequestBase that = (ProgramRequestBase) obj;
        return Objects.equals(this.programName, that.programName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProgramRequestBase {\n");
        sb.append("    programName: ").append(toIndentedString(programName)).append("\n");
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

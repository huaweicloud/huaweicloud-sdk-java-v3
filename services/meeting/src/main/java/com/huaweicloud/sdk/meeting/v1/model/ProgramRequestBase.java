package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 新增/更新节目信息请求
 */
public class ProgramRequestBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="programName")
    
    private String programName;

    public ProgramRequestBase withProgramName(String programName) {
        this.programName = programName;
        return this;
    }

    


    /**
     * 节目名称
     * @return programName
     */
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProgramRequestBase programRequestBase = (ProgramRequestBase) o;
        return Objects.equals(this.programName, programRequestBase.programName);
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


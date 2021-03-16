package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stack_id")
    
    private String stackId;

    public ListProjectTemplatesRequest withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * Get arch
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public ListProjectTemplatesRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    


    /**
     * Get stackId
     * @return stackId
     */
    public String getStackId() {
        return stackId;
    }

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectTemplatesRequest listProjectTemplatesRequest = (ListProjectTemplatesRequest) o;
        return Objects.equals(this.arch, listProjectTemplatesRequest.arch) &&
            Objects.equals(this.stackId, listProjectTemplatesRequest.stackId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(arch, stackId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectTemplatesRequest {\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    stackId: ").append(toIndentedString(stackId)).append("\n");
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


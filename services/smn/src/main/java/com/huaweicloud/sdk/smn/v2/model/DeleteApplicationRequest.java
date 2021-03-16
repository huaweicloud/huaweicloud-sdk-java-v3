package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteApplicationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_urn")
    
    private String applicationUrn;

    public DeleteApplicationRequest withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    


    /**
     * Get applicationUrn
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteApplicationRequest deleteApplicationRequest = (DeleteApplicationRequest) o;
        return Objects.equals(this.applicationUrn, deleteApplicationRequest.applicationUrn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationUrn);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteApplicationRequest {\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
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


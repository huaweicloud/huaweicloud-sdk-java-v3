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
public class CheckNameRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;

    public CheckNameRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * Get displayName
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckNameRequest checkNameRequest = (CheckNameRequest) o;
        return Objects.equals(this.displayName, checkNameRequest.displayName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(displayName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckNameRequest {\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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


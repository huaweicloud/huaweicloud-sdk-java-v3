package com.huaweicloud.sdk.servicestage.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowEnvironmentDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="environment_id")
    
    private String environmentId;

    public ShowEnvironmentDetailRequest withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    


    /**
     * Get environmentId
     * @return environmentId
     */
    public String getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEnvironmentDetailRequest showEnvironmentDetailRequest = (ShowEnvironmentDetailRequest) o;
        return Objects.equals(this.environmentId, showEnvironmentDetailRequest.environmentId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(environmentId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEnvironmentDetailRequest {\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
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


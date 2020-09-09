package com.huaweicloud.sdk.eps.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowApiVersionRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="api_version")
    
    private String apiVersion;

    public ShowApiVersionRequest withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * Get apiVersion
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApiVersionRequest showApiVersionRequest = (ShowApiVersionRequest) o;
        return Objects.equals(this.apiVersion, showApiVersionRequest.apiVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(apiVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApiVersionRequest {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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


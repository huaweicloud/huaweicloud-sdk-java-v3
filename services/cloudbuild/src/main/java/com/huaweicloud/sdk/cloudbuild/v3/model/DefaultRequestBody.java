package com.huaweicloud.sdk.cloudbuild.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DefaultRequestBody
 */
public class DefaultRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_body")
    
    private String requestBody;

    public DefaultRequestBody withRequestBody(String requestBody) {
        this.requestBody = requestBody;
        return this;
    }

    


    /**
     * 请求体
     * @return requestBody
     */
    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DefaultRequestBody defaultRequestBody = (DefaultRequestBody) o;
        return Objects.equals(this.requestBody, defaultRequestBody.requestBody);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestBody);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DefaultRequestBody {\n");
        sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
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


package com.huaweicloud.sdk.aom.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
@JacksonXmlRootElement(localName = "ShowAppRequest")
public class ShowAppRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_id")
    
    @JacksonXmlProperty(localName = "application_id")

    private String applicationId;

    public ShowAppRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    


    /**
     * 应用id
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAppRequest showAppRequest = (ShowAppRequest) o;
        return Objects.equals(this.applicationId, showAppRequest.applicationId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(applicationId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAppRequest {\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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


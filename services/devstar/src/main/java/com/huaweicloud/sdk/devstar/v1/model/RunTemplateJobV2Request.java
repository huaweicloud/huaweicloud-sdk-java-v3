package com.huaweicloud.sdk.devstar.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.devstar.v1.model.TemplateJobInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RunTemplateJobV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Language")
    
    private String xLanguage = "zh-cn";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private TemplateJobInfo body = null;

    public RunTemplateJobV2Request withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    


    /**
     * Get xLanguage
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public RunTemplateJobV2Request withBody(TemplateJobInfo body) {
        this.body = body;
        return this;
    }

    public RunTemplateJobV2Request withBody(Consumer<TemplateJobInfo> bodySetter) {
        if(this.body == null ){
            this.body = new TemplateJobInfo();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TemplateJobInfo getBody() {
        return body;
    }

    public void setBody(TemplateJobInfo body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunTemplateJobV2Request runTemplateJobV2Request = (RunTemplateJobV2Request) o;
        return Objects.equals(this.xLanguage, runTemplateJobV2Request.xLanguage) &&
            Objects.equals(this.body, runTemplateJobV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunTemplateJobV2Request {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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


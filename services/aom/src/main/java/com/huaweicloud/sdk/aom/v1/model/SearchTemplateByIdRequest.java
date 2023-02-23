package com.huaweicloud.sdk.aom.v1.model;






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
@JacksonXmlRootElement(localName = "SearchTemplateByIdRequest")
public class SearchTemplateByIdRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_id")
    
    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="share_type")
    
    @JacksonXmlProperty(localName = "share_type")

    private String shareType;

    public SearchTemplateByIdRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    


    /**
     * 方案id。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    

    public SearchTemplateByIdRequest withShareType(String shareType) {
        this.shareType = shareType;
        return this;
    }

    


    /**
     * 模板共享类型，默认为private。可选public private
     * @return shareType
     */
    public String getShareType() {
        return shareType;
    }

    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchTemplateByIdRequest searchTemplateByIdRequest = (SearchTemplateByIdRequest) o;
        return Objects.equals(this.templateId, searchTemplateByIdRequest.templateId) &&
            Objects.equals(this.shareType, searchTemplateByIdRequest.shareType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateId, shareType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchTemplateByIdRequest {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    shareType: ").append(toIndentedString(shareType)).append("\n");
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


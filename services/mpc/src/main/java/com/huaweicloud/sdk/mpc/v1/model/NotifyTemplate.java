package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NotifyTemplate
 */
public class NotifyTemplate  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_name")
    
    private String templateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_content")
    
    private String templateContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private String protocol;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event")
    
    private Integer event;

    public NotifyTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    


    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public NotifyTemplate withTemplateContent(String templateContent) {
        this.templateContent = templateContent;
        return this;
    }

    


    /**
     * 模板内容
     * @return templateContent
     */
    public String getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(String templateContent) {
        this.templateContent = templateContent;
    }

    public NotifyTemplate withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 协议名称
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public NotifyTemplate withEvent(Integer event) {
        this.event = event;
        return this;
    }

    


    /**
     * 通知消息的事件类型。当前固定为0, 0表示转码完成事件。 
     * minimum: 0
     * maximum: 2
     * @return event
     */
    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotifyTemplate notifyTemplate = (NotifyTemplate) o;
        return Objects.equals(this.templateName, notifyTemplate.templateName) &&
            Objects.equals(this.templateContent, notifyTemplate.templateContent) &&
            Objects.equals(this.protocol, notifyTemplate.protocol) &&
            Objects.equals(this.event, notifyTemplate.event);
    }
    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateContent, protocol, event);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotifyTemplate {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateContent: ").append(toIndentedString(templateContent)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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


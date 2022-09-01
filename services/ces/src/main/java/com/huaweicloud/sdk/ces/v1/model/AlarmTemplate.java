package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建的自定义告警模板详细信息
 */
public class AlarmTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    @JacksonXmlProperty(localName = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_description")

    @JacksonXmlProperty(localName = "template_description")

    private String templateDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    @JacksonXmlProperty(localName = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimension_name")

    @JacksonXmlProperty(localName = "dimension_name")

    private String dimensionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_items")

    @JacksonXmlProperty(localName = "template_items")

    private List<TemplateItem> templateItems = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    @JacksonXmlProperty(localName = "template_id")

    private String templateId;

    public AlarmTemplate withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 自定义告警模板名称，如：alarmTemplate-Test01。
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public AlarmTemplate withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * 自定义告警模板描述。
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public AlarmTemplate withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 自定义告警模板选择的资源类型，即服务命名空间，如：选择弹性云服务器，则命名空间为SYS.ECS，各资源的监控指标名称可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public AlarmTemplate withDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
        return this;
    }

    /**
     * 自定义告警模板选择的资源维度，如：弹性云服务器，则维度为instance_id，各服务资源的指标维度名称可查看：“[服务指标维度](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”。
     * @return dimensionName
     */
    public String getDimensionName() {
        return dimensionName;
    }

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    public AlarmTemplate withTemplateItems(List<TemplateItem> templateItems) {
        this.templateItems = templateItems;
        return this;
    }

    public AlarmTemplate addTemplateItemsItem(TemplateItem templateItemsItem) {
        if (this.templateItems == null) {
            this.templateItems = new ArrayList<>();
        }
        this.templateItems.add(templateItemsItem);
        return this;
    }

    public AlarmTemplate withTemplateItems(Consumer<List<TemplateItem>> templateItemsSetter) {
        if (this.templateItems == null) {
            this.templateItems = new ArrayList<>();
        }
        templateItemsSetter.accept(this.templateItems);
        return this;
    }

    /**
     * 自定义告警模板添加的一组或者多个告警策略。
     * @return templateItems
     */
    public List<TemplateItem> getTemplateItems() {
        return templateItems;
    }

    public void setTemplateItems(List<TemplateItem> templateItems) {
        this.templateItems = templateItems;
    }

    public AlarmTemplate withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 自定义告警模板的ID，如：at1603330892378wkDm77y6B。
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AlarmTemplate alarmTemplate = (AlarmTemplate) o;
        return Objects.equals(this.templateName, alarmTemplate.templateName)
            && Objects.equals(this.templateDescription, alarmTemplate.templateDescription)
            && Objects.equals(this.namespace, alarmTemplate.namespace)
            && Objects.equals(this.dimensionName, alarmTemplate.dimensionName)
            && Objects.equals(this.templateItems, alarmTemplate.templateItems)
            && Objects.equals(this.templateId, alarmTemplate.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateName, templateDescription, namespace, dimensionName, templateItems, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmTemplate {\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    templateDescription: ").append(toIndentedString(templateDescription)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensionName: ").append(toIndentedString(dimensionName)).append("\n");
        sb.append("    templateItems: ").append(toIndentedString(templateItems)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

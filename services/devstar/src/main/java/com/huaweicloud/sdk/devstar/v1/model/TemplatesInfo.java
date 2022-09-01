package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplatesInfo
 */
public class TemplatesInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_ids")

    @JacksonXmlProperty(localName = "template_ids")

    private List<String> templateIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_source")

    @JacksonXmlProperty(localName = "platform_source")

    private Integer platformSource;

    public TemplatesInfo withTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    public TemplatesInfo addTemplateIdsItem(String templateIdsItem) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        this.templateIds.add(templateIdsItem);
        return this;
    }

    public TemplatesInfo withTemplateIds(Consumer<List<String>> templateIdsSetter) {
        if (this.templateIds == null) {
            this.templateIds = new ArrayList<>();
        }
        templateIdsSetter.accept(this.templateIds);
        return this;
    }

    /**
     * 模板ID列表。
     * @return templateIds
     */
    public List<String> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<String> templateIds) {
        this.templateIds = templateIds;
    }

    public TemplatesInfo withPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
        return this;
    }

    /**
     * 平台来源： - 0：codelabs - 1：devstar 
     * minimum: 0
     * maximum: 1
     * @return platformSource
     */
    public Integer getPlatformSource() {
        return platformSource;
    }

    public void setPlatformSource(Integer platformSource) {
        this.platformSource = platformSource;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplatesInfo templatesInfo = (TemplatesInfo) o;
        return Objects.equals(this.templateIds, templatesInfo.templateIds)
            && Objects.equals(this.platformSource, templatesInfo.platformSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateIds, platformSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplatesInfo {\n");
        sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
        sb.append("    platformSource: ").append(toIndentedString(platformSource)).append("\n");
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

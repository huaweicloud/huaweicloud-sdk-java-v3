package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTranscodingsTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    @JacksonXmlProperty(localName = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templates")

    @JacksonXmlProperty(localName = "templates")

    private List<AppQualityInfo> templates = null;

    public ShowTranscodingsTemplateResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的总元素数量
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowTranscodingsTemplateResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 播放域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowTranscodingsTemplateResponse withTemplates(List<AppQualityInfo> templates) {
        this.templates = templates;
        return this;
    }

    public ShowTranscodingsTemplateResponse addTemplatesItem(AppQualityInfo templatesItem) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        this.templates.add(templatesItem);
        return this;
    }

    public ShowTranscodingsTemplateResponse withTemplates(Consumer<List<AppQualityInfo>> templatesSetter) {
        if (this.templates == null) {
            this.templates = new ArrayList<>();
        }
        templatesSetter.accept(this.templates);
        return this;
    }

    /**
     * 转码模板
     * @return templates
     */
    public List<AppQualityInfo> getTemplates() {
        return templates;
    }

    public void setTemplates(List<AppQualityInfo> templates) {
        this.templates = templates;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTranscodingsTemplateResponse showTranscodingsTemplateResponse = (ShowTranscodingsTemplateResponse) o;
        return Objects.equals(this.total, showTranscodingsTemplateResponse.total)
            && Objects.equals(this.domain, showTranscodingsTemplateResponse.domain)
            && Objects.equals(this.templates, showTranscodingsTemplateResponse.templates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, domain, templates);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTranscodingsTemplateResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
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

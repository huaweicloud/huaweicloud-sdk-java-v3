package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 拦截页面配置
 */
public class WafBlockPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_page")

    private WafCustomPage customPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    public WafBlockPage withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 拦截模板名称
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public WafBlockPage withCustomPage(WafCustomPage customPage) {
        this.customPage = customPage;
        return this;
    }

    public WafBlockPage withCustomPage(Consumer<WafCustomPage> customPageSetter) {
        if (this.customPage == null) {
            this.customPage = new WafCustomPage();
            customPageSetter.accept(this.customPage);
        }

        return this;
    }

    /**
     * Get customPage
     * @return customPage
     */
    public WafCustomPage getCustomPage() {
        return customPage;
    }

    public void setCustomPage(WafCustomPage customPage) {
        this.customPage = customPage;
    }

    public WafBlockPage withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * 重定向URL
     * @return redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafBlockPage that = (WafBlockPage) obj;
        return Objects.equals(this.template, that.template) && Objects.equals(this.customPage, that.customPage)
            && Objects.equals(this.redirectUrl, that.redirectUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template, customPage, redirectUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafBlockPage {\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    customPage: ").append(toIndentedString(customPage)).append("\n");
        sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

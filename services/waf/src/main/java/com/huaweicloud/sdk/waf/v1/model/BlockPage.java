package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 告警页面配置参数，用于配置“自定义”或者“重定向”页面
 */
public class BlockPage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_page")

    private CustomPage customPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirect_url")

    private String redirectUrl;

    public BlockPage withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 模板名称，默认页面请输入default，自定义告警页面时请输入custom，重定向请输入redirect
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public BlockPage withCustomPage(CustomPage customPage) {
        this.customPage = customPage;
        return this;
    }

    public BlockPage withCustomPage(Consumer<CustomPage> customPageSetter) {
        if (this.customPage == null) {
            this.customPage = new CustomPage();
            customPageSetter.accept(this.customPage);
        }

        return this;
    }

    /**
     * Get customPage
     * @return customPage
     */
    public CustomPage getCustomPage() {
        return customPage;
    }

    public void setCustomPage(CustomPage customPage) {
        this.customPage = customPage;
    }

    public BlockPage withRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
        return this;
    }

    /**
     * “重定向”页面URL
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
        BlockPage that = (BlockPage) obj;
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
        sb.append("class BlockPage {\n");
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

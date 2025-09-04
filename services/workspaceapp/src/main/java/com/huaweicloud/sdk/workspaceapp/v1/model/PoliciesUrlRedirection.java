package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 配置url重定向。
 */
public class PoliciesUrlRedirection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url_redirection_enable")

    private Boolean urlRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private UrlRedirectionOptions options;

    public PoliciesUrlRedirection withUrlRedirectionEnable(Boolean urlRedirectionEnable) {
        this.urlRedirectionEnable = urlRedirectionEnable;
        return this;
    }

    /**
     * 配置url重定向开关： false: 表示关闭 true: 表示开启
     * @return urlRedirectionEnable
     */
    public Boolean getUrlRedirectionEnable() {
        return urlRedirectionEnable;
    }

    public void setUrlRedirectionEnable(Boolean urlRedirectionEnable) {
        this.urlRedirectionEnable = urlRedirectionEnable;
    }

    public PoliciesUrlRedirection withOptions(UrlRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesUrlRedirection withOptions(Consumer<UrlRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new UrlRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public UrlRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(UrlRedirectionOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesUrlRedirection that = (PoliciesUrlRedirection) obj;
        return Objects.equals(this.urlRedirectionEnable, that.urlRedirectionEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urlRedirectionEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesUrlRedirection {\n");
        sb.append("    urlRedirectionEnable: ").append(toIndentedString(urlRedirectionEnable)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

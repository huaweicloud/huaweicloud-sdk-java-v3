package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：转发策略跨域的配置。  **约束限制**：不涉及
 */
public class CreateCorsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_origin")

    private List<String> allowOrigin = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_methods")

    private List<String> allowMethods = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_headers")

    private List<String> allowHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expose_headers")

    private List<String> exposeHeaders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_credentials")

    private Boolean allowCredentials;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_age")

    private Long maxAge;

    public CreateCorsConfig withAllowOrigin(List<String> allowOrigin) {
        this.allowOrigin = allowOrigin;
        return this;
    }

    public CreateCorsConfig addAllowOriginItem(String allowOriginItem) {
        if (this.allowOrigin == null) {
            this.allowOrigin = new ArrayList<>();
        }
        this.allowOrigin.add(allowOriginItem);
        return this;
    }

    public CreateCorsConfig withAllowOrigin(Consumer<List<String>> allowOriginSetter) {
        if (this.allowOrigin == null) {
            this.allowOrigin = new ArrayList<>();
        }
        allowOriginSetter.accept(this.allowOrigin);
        return this;
    }

    /**
     * **参数解释**：允许的访问来源列表。支持只配置一个元素*，或配置一个或多个值。  **约束限制**： - 单个值必须以http://或者https://开头，后边加一个正确的域名或一级泛域名。（例：http://_*.test.abc.example.com） - 单个值可以不加端口，也可以指定端口，端口范围：1~65535。  **取值范围**：不涉及  **默认取值**：不涉及
     * @return allowOrigin
     */
    public List<String> getAllowOrigin() {
        return allowOrigin;
    }

    public void setAllowOrigin(List<String> allowOrigin) {
        this.allowOrigin = allowOrigin;
    }

    public CreateCorsConfig withAllowMethods(List<String> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }

    public CreateCorsConfig addAllowMethodsItem(String allowMethodsItem) {
        if (this.allowMethods == null) {
            this.allowMethods = new ArrayList<>();
        }
        this.allowMethods.add(allowMethodsItem);
        return this;
    }

    public CreateCorsConfig withAllowMethods(Consumer<List<String>> allowMethodsSetter) {
        if (this.allowMethods == null) {
            this.allowMethods = new ArrayList<>();
        }
        allowMethodsSetter.accept(this.allowMethods);
        return this;
    }

    /**
     * **参数解释**：选择跨域访问时允许的 HTTP 方法。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return allowMethods
     */
    public List<String> getAllowMethods() {
        return allowMethods;
    }

    public void setAllowMethods(List<String> allowMethods) {
        this.allowMethods = allowMethods;
    }

    public CreateCorsConfig withAllowHeaders(List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }

    public CreateCorsConfig addAllowHeadersItem(String allowHeadersItem) {
        if (this.allowHeaders == null) {
            this.allowHeaders = new ArrayList<>();
        }
        this.allowHeaders.add(allowHeadersItem);
        return this;
    }

    public CreateCorsConfig withAllowHeaders(Consumer<List<String>> allowHeadersSetter) {
        if (this.allowHeaders == null) {
            this.allowHeaders = new ArrayList<>();
        }
        allowHeadersSetter.accept(this.allowHeaders);
        return this;
    }

    /**
     * **参数解释**：允许跨域的 Header 列表。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return allowHeaders
     */
    public List<String> getAllowHeaders() {
        return allowHeaders;
    }

    public void setAllowHeaders(List<String> allowHeaders) {
        this.allowHeaders = allowHeaders;
    }

    public CreateCorsConfig withExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    public CreateCorsConfig addExposeHeadersItem(String exposeHeadersItem) {
        if (this.exposeHeaders == null) {
            this.exposeHeaders = new ArrayList<>();
        }
        this.exposeHeaders.add(exposeHeadersItem);
        return this;
    }

    public CreateCorsConfig withExposeHeaders(Consumer<List<String>> exposeHeadersSetter) {
        if (this.exposeHeaders == null) {
            this.exposeHeaders = new ArrayList<>();
        }
        exposeHeadersSetter.accept(this.exposeHeaders);
        return this;
    }

    /**
     * **参数解释**：允许暴露的Header列表。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return exposeHeaders
     */
    public List<String> getExposeHeaders() {
        return exposeHeaders;
    }

    public void setExposeHeaders(List<String> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
    }

    public CreateCorsConfig withAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    /**
     * **参数解释**：是否允许携带凭证信息。  **约束限制**：不涉及  **取值范围**：true 是，false 否。  **默认取值**：不涉及
     * @return allowCredentials
     */
    public Boolean getAllowCredentials() {
        return allowCredentials;
    }

    public void setAllowCredentials(Boolean allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public CreateCorsConfig withMaxAge(Long maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * **参数解释**：预检请求在浏览器的最大缓存时间，单位：秒。  **约束限制**：不涉及  **取值范围**：-1~172800  **默认取值**：不涉及
     * minimum: -1
     * maximum: 172800
     * @return maxAge
     */
    public Long getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(Long maxAge) {
        this.maxAge = maxAge;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCorsConfig that = (CreateCorsConfig) obj;
        return Objects.equals(this.allowOrigin, that.allowOrigin)
            && Objects.equals(this.allowMethods, that.allowMethods)
            && Objects.equals(this.allowHeaders, that.allowHeaders)
            && Objects.equals(this.exposeHeaders, that.exposeHeaders)
            && Objects.equals(this.allowCredentials, that.allowCredentials) && Objects.equals(this.maxAge, that.maxAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowOrigin, allowMethods, allowHeaders, exposeHeaders, allowCredentials, maxAge);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCorsConfig {\n");
        sb.append("    allowOrigin: ").append(toIndentedString(allowOrigin)).append("\n");
        sb.append("    allowMethods: ").append(toIndentedString(allowMethods)).append("\n");
        sb.append("    allowHeaders: ").append(toIndentedString(allowHeaders)).append("\n");
        sb.append("    exposeHeaders: ").append(toIndentedString(exposeHeaders)).append("\n");
        sb.append("    allowCredentials: ").append(toIndentedString(allowCredentials)).append("\n");
        sb.append("    maxAge: ").append(toIndentedString(maxAge)).append("\n");
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

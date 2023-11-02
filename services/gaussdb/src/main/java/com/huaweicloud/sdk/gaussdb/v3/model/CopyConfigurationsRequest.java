package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CopyConfigurationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CopyConfigurationsRequestBody body;

    public CopyConfigurationsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 请求语言类型。默认en-us。 取值范围： - en-us - zh-cn
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public CopyConfigurationsRequest withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 参数组ID。  通过调用[查询参数模板](https://support.huaweicloud.com/api-gaussdbformysql/ListGaussMySqlConfigurations.html)接口获取。  请求响应成功后在响应消息体中包含的“id”的值即为configuration_id值。
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public CopyConfigurationsRequest withBody(CopyConfigurationsRequestBody body) {
        this.body = body;
        return this;
    }

    public CopyConfigurationsRequest withBody(Consumer<CopyConfigurationsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CopyConfigurationsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CopyConfigurationsRequestBody getBody() {
        return body;
    }

    public void setBody(CopyConfigurationsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CopyConfigurationsRequest that = (CopyConfigurationsRequest) obj;
        return Objects.equals(this.xLanguage, that.xLanguage)
            && Objects.equals(this.configurationId, that.configurationId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xLanguage, configurationId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyConfigurationsRequest {\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
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

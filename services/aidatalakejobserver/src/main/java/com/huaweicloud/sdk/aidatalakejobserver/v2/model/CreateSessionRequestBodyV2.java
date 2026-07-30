package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：创建session请求体。 **约束限制**：不涉及。
 */
public class CreateSessionRequestBodyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_context")

    private CatalogContext catalogContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_timeout")

    private Integer waitTimeout;

    public CreateSessionRequestBodyV2 withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：Endpoint名称。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public CreateSessionRequestBodyV2 withCatalogContext(CatalogContext catalogContext) {
        this.catalogContext = catalogContext;
        return this;
    }

    public CreateSessionRequestBodyV2 withCatalogContext(Consumer<CatalogContext> catalogContextSetter) {
        if (this.catalogContext == null) {
            this.catalogContext = new CatalogContext();
            catalogContextSetter.accept(this.catalogContext);
        }

        return this;
    }

    /**
     * Get catalogContext
     * @return catalogContext
     */
    public CatalogContext getCatalogContext() {
        return catalogContext;
    }

    public void setCatalogContext(CatalogContext catalogContext) {
        this.catalogContext = catalogContext;
    }

    public CreateSessionRequestBodyV2 withWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
        return this;
    }

    /**
     * **参数解释**：创建session排队等待时间，单位：秒。 **约束限制**：不涉及。 **取值范围**：300~7200。 **默认取值**：不涉及。
     * minimum: 300
     * maximum: 7200
     * @return waitTimeout
     */
    public Integer getWaitTimeout() {
        return waitTimeout;
    }

    public void setWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSessionRequestBodyV2 that = (CreateSessionRequestBodyV2) obj;
        return Objects.equals(this.endpointName, that.endpointName)
            && Objects.equals(this.catalogContext, that.catalogContext)
            && Objects.equals(this.waitTimeout, that.waitTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointName, catalogContext, waitTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSessionRequestBodyV2 {\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    catalogContext: ").append(toIndentedString(catalogContext)).append("\n");
        sb.append("    waitTimeout: ").append(toIndentedString(waitTimeout)).append("\n");
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

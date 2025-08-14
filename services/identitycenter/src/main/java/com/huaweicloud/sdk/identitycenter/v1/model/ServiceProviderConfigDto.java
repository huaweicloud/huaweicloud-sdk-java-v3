package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务提供商
 */
public class ServiceProviderConfigDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audience")

    private String audience;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_request_signature")

    private Boolean requireRequestSignature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consumers")

    private List<ConsumersDto> consumers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_url")

    private String startUrl;

    public ServiceProviderConfigDto withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    /**
     * SAML受众
     * @return audience
     */
    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }

    public ServiceProviderConfigDto withRequireRequestSignature(Boolean requireRequestSignature) {
        this.requireRequestSignature = requireRequestSignature;
        return this;
    }

    /**
     * 是否需要签名
     * @return requireRequestSignature
     */
    public Boolean getRequireRequestSignature() {
        return requireRequestSignature;
    }

    public void setRequireRequestSignature(Boolean requireRequestSignature) {
        this.requireRequestSignature = requireRequestSignature;
    }

    public ServiceProviderConfigDto withConsumers(List<ConsumersDto> consumers) {
        this.consumers = consumers;
        return this;
    }

    public ServiceProviderConfigDto addConsumersItem(ConsumersDto consumersItem) {
        if (this.consumers == null) {
            this.consumers = new ArrayList<>();
        }
        this.consumers.add(consumersItem);
        return this;
    }

    public ServiceProviderConfigDto withConsumers(Consumer<List<ConsumersDto>> consumersSetter) {
        if (this.consumers == null) {
            this.consumers = new ArrayList<>();
        }
        consumersSetter.accept(this.consumers);
        return this;
    }

    /**
     * SAML响应接收方
     * @return consumers
     */
    public List<ConsumersDto> getConsumers() {
        return consumers;
    }

    public void setConsumers(List<ConsumersDto> consumers) {
        this.consumers = consumers;
    }

    public ServiceProviderConfigDto withStartUrl(String startUrl) {
        this.startUrl = startUrl;
        return this;
    }

    /**
     * 应用程序启动Url
     * @return startUrl
     */
    public String getStartUrl() {
        return startUrl;
    }

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServiceProviderConfigDto that = (ServiceProviderConfigDto) obj;
        return Objects.equals(this.audience, that.audience)
            && Objects.equals(this.requireRequestSignature, that.requireRequestSignature)
            && Objects.equals(this.consumers, that.consumers) && Objects.equals(this.startUrl, that.startUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audience, requireRequestSignature, consumers, startUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceProviderConfigDto {\n");
        sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
        sb.append("    requireRequestSignature: ").append(toIndentedString(requireRequestSignature)).append("\n");
        sb.append("    consumers: ").append(toIndentedString(consumers)).append("\n");
        sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
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

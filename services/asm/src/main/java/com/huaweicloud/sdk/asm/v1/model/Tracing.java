package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Tracing
 */
public class Tracing {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "randomSamplingPercentage")

    private Float randomSamplingPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultProviders")

    private List<String> defaultProviders = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extensionProviders")

    private List<TracingExtensionProvider> extensionProviders = null;

    public Tracing withRandomSamplingPercentage(Float randomSamplingPercentage) {
        this.randomSamplingPercentage = randomSamplingPercentage;
        return this;
    }

    /**
     * tracing采样率
     * @return randomSamplingPercentage
     */
    public Float getRandomSamplingPercentage() {
        return randomSamplingPercentage;
    }

    public void setRandomSamplingPercentage(Float randomSamplingPercentage) {
        this.randomSamplingPercentage = randomSamplingPercentage;
    }

    public Tracing withDefaultProviders(List<String> defaultProviders) {
        this.defaultProviders = defaultProviders;
        return this;
    }

    public Tracing addDefaultProvidersItem(String defaultProvidersItem) {
        if (this.defaultProviders == null) {
            this.defaultProviders = new ArrayList<>();
        }
        this.defaultProviders.add(defaultProvidersItem);
        return this;
    }

    public Tracing withDefaultProviders(Consumer<List<String>> defaultProvidersSetter) {
        if (this.defaultProviders == null) {
            this.defaultProviders = new ArrayList<>();
        }
        defaultProvidersSetter.accept(this.defaultProviders);
        return this;
    }

    /**
     * tracing默认上报的provider名称，必须与extensionProviders中的name字段匹配，或使用ASM预设的provider \"apm-otel\"。 如果使用\"apm-otel\"，需确认当前region已支持APM2.0且网格版本大于1.18。
     * @return defaultProviders
     */
    public List<String> getDefaultProviders() {
        return defaultProviders;
    }

    public void setDefaultProviders(List<String> defaultProviders) {
        this.defaultProviders = defaultProviders;
    }

    public Tracing withExtensionProviders(List<TracingExtensionProvider> extensionProviders) {
        this.extensionProviders = extensionProviders;
        return this;
    }

    public Tracing addExtensionProvidersItem(TracingExtensionProvider extensionProvidersItem) {
        if (this.extensionProviders == null) {
            this.extensionProviders = new ArrayList<>();
        }
        this.extensionProviders.add(extensionProvidersItem);
        return this;
    }

    public Tracing withExtensionProviders(Consumer<List<TracingExtensionProvider>> extensionProvidersSetter) {
        if (this.extensionProviders == null) {
            this.extensionProviders = new ArrayList<>();
        }
        extensionProvidersSetter.accept(this.extensionProviders);
        return this;
    }

    /**
     * 用户自配置provider，目前支持zipkin协议。 如果用户配置zipkin协议的provider，请保证网格版本大于等于1.15。
     * @return extensionProviders
     */
    public List<TracingExtensionProvider> getExtensionProviders() {
        return extensionProviders;
    }

    public void setExtensionProviders(List<TracingExtensionProvider> extensionProviders) {
        this.extensionProviders = extensionProviders;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Tracing that = (Tracing) obj;
        return Objects.equals(this.randomSamplingPercentage, that.randomSamplingPercentage)
            && Objects.equals(this.defaultProviders, that.defaultProviders)
            && Objects.equals(this.extensionProviders, that.extensionProviders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(randomSamplingPercentage, defaultProviders, extensionProviders);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tracing {\n");
        sb.append("    randomSamplingPercentage: ").append(toIndentedString(randomSamplingPercentage)).append("\n");
        sb.append("    defaultProviders: ").append(toIndentedString(defaultProviders)).append("\n");
        sb.append("    extensionProviders: ").append(toIndentedString(extensionProviders)).append("\n");
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

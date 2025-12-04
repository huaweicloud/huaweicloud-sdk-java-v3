package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TracingExtensionProvider
 */
public class TracingExtensionProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zipkin")

    private ZipkinTracingProvider zipkin;

    public TracingExtensionProvider withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * provider实例name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TracingExtensionProvider withZipkin(ZipkinTracingProvider zipkin) {
        this.zipkin = zipkin;
        return this;
    }

    public TracingExtensionProvider withZipkin(Consumer<ZipkinTracingProvider> zipkinSetter) {
        if (this.zipkin == null) {
            this.zipkin = new ZipkinTracingProvider();
            zipkinSetter.accept(this.zipkin);
        }

        return this;
    }

    /**
     * Get zipkin
     * @return zipkin
     */
    public ZipkinTracingProvider getZipkin() {
        return zipkin;
    }

    public void setZipkin(ZipkinTracingProvider zipkin) {
        this.zipkin = zipkin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TracingExtensionProvider that = (TracingExtensionProvider) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.zipkin, that.zipkin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, zipkin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TracingExtensionProvider {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    zipkin: ").append(toIndentedString(zipkin)).append("\n");
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

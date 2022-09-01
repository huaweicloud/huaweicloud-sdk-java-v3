package com.huaweicloud.sdk.vcm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务算法配置
 */
public class ServiceConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    @JacksonXmlProperty(localName = "common")

    private ServiceConfigCommon common;

    public ServiceConfig withCommon(ServiceConfigCommon common) {
        this.common = common;
        return this;
    }

    public ServiceConfig withCommon(Consumer<ServiceConfigCommon> commonSetter) {
        if (this.common == null) {
            this.common = new ServiceConfigCommon();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /**
     * Get common
     * @return common
     */
    public ServiceConfigCommon getCommon() {
        return common;
    }

    public void setCommon(ServiceConfigCommon common) {
        this.common = common;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceConfig serviceConfig = (ServiceConfig) o;
        return Objects.equals(this.common, serviceConfig.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceConfig {\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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

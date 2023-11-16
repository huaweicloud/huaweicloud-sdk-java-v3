package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 治理策略下发范围
 */
public class GovSelector {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment")

    private String environment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    public GovSelector withEnvironment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * 所属环境
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public GovSelector withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 所属应用
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public GovSelector withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * 可选，治理下发到微服务级别
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GovSelector that = (GovSelector) obj;
        return Objects.equals(this.environment, that.environment) && Objects.equals(this.app, that.app)
            && Objects.equals(this.service, that.service);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, app, service);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GovSelector {\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

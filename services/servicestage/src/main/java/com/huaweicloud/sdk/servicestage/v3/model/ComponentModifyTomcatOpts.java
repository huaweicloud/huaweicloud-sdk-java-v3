package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentModifyTomcatOpts
 */
public class ComponentModifyTomcatOpts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_xml")

    private String serverXml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_port")

    private Integer httpPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_path")

    private String contextPath;

    public ComponentModifyTomcatOpts withServerXml(String serverXml) {
        this.serverXml = serverXml;
        return this;
    }

    /**
     * Get serverXml
     * @return serverXml
     */
    public String getServerXml() {
        return serverXml;
    }

    public void setServerXml(String serverXml) {
        this.serverXml = serverXml;
    }

    public ComponentModifyTomcatOpts withHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
        return this;
    }

    /**
     * Get httpPort
     * @return httpPort
     */
    public Integer getHttpPort() {
        return httpPort;
    }

    public void setHttpPort(Integer httpPort) {
        this.httpPort = httpPort;
    }

    public ComponentModifyTomcatOpts withContextPath(String contextPath) {
        this.contextPath = contextPath;
        return this;
    }

    /**
     * Get contextPath
     * @return contextPath
     */
    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentModifyTomcatOpts that = (ComponentModifyTomcatOpts) obj;
        return Objects.equals(this.serverXml, that.serverXml) && Objects.equals(this.httpPort, that.httpPort)
            && Objects.equals(this.contextPath, that.contextPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverXml, httpPort, contextPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentModifyTomcatOpts {\n");
        sb.append("    serverXml: ").append(toIndentedString(serverXml)).append("\n");
        sb.append("    httpPort: ").append(toIndentedString(httpPort)).append("\n");
        sb.append("    contextPath: ").append(toIndentedString(contextPath)).append("\n");
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

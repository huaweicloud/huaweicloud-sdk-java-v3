package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComponentInfoTomcatOpts
 */
public class ComponentInfoTomcatOpts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_xml")

    private String serverXml;

    public ComponentInfoTomcatOpts withServerXml(String serverXml) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComponentInfoTomcatOpts that = (ComponentInfoTomcatOpts) obj;
        return Objects.equals(this.serverXml, that.serverXml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverXml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComponentInfoTomcatOpts {\n");
        sb.append("    serverXml: ").append(toIndentedString(serverXml)).append("\n");
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

package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** header */
public class DebugCaseResqHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Host")

    private String host;

    public DebugCaseResqHeader withConnection(String connection) {
        this.connection = connection;
        return this;
    }

    /** Connection
     * 
     * @return connection */
    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public DebugCaseResqHeader withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /** Content-Type
     * 
     * @return contentType */
    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public DebugCaseResqHeader withHost(String host) {
        this.host = host;
        return this;
    }

    /** Host
     * 
     * @return host */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugCaseResqHeader debugCaseResqHeader = (DebugCaseResqHeader) o;
        return Objects.equals(this.connection, debugCaseResqHeader.connection)
            && Objects.equals(this.contentType, debugCaseResqHeader.contentType)
            && Objects.equals(this.host, debugCaseResqHeader.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, contentType, host);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseResqHeader {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

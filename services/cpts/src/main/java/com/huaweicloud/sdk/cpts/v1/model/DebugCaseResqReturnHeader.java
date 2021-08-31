package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** returnHeader */
public class DebugCaseResqReturnHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Connection")

    private String connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Length")

    private String contentLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Content-Type")

    private String contentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Vary")

    private String vary;

    public DebugCaseResqReturnHeader withConnection(String connection) {
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

    public DebugCaseResqReturnHeader withContentLength(String contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /** Content-Length
     * 
     * @return contentLength */
    public String getContentLength() {
        return contentLength;
    }

    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    public DebugCaseResqReturnHeader withContentType(String contentType) {
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

    public DebugCaseResqReturnHeader withDate(String date) {
        this.date = date;
        return this;
    }

    /** Date
     * 
     * @return date */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public DebugCaseResqReturnHeader withVary(String vary) {
        this.vary = vary;
        return this;
    }

    /** Vary
     * 
     * @return vary */
    public String getVary() {
        return vary;
    }

    public void setVary(String vary) {
        this.vary = vary;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DebugCaseResqReturnHeader debugCaseResqReturnHeader = (DebugCaseResqReturnHeader) o;
        return Objects.equals(this.connection, debugCaseResqReturnHeader.connection)
            && Objects.equals(this.contentLength, debugCaseResqReturnHeader.contentLength)
            && Objects.equals(this.contentType, debugCaseResqReturnHeader.contentType)
            && Objects.equals(this.date, debugCaseResqReturnHeader.date)
            && Objects.equals(this.vary, debugCaseResqReturnHeader.vary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connection, contentLength, contentType, date, vary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DebugCaseResqReturnHeader {\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    contentLength: ").append(toIndentedString(contentLength)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    vary: ").append(toIndentedString(vary)).append("\n");
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

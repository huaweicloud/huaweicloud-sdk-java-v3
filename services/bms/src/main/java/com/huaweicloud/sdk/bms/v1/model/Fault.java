package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * fault字段数据结构说明
 */
public class Fault {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    @JacksonXmlProperty(localName = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    @JacksonXmlProperty(localName = "code")

    private Integer code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    @JacksonXmlProperty(localName = "details")

    private String details;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    @JacksonXmlProperty(localName = "created")

    private OffsetDateTime created;

    public Fault withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 故障信息
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Fault withCode(Integer code) {
        this.code = code;
        return this;
    }

    /**
     * 故障code
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Fault withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * 故障详情
     * @return details
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Fault withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    /**
     * 故障时间。时间戳格式为ISO 8601：YYYY-MM-DDTHH:MM:SSZ，例如：2019-05-22T03:30:52Z
     * @return created
     */
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fault fault = (Fault) o;
        return Objects.equals(this.message, fault.message) && Objects.equals(this.code, fault.code)
            && Objects.equals(this.details, fault.details) && Objects.equals(this.created, fault.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, code, details, created);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Fault {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

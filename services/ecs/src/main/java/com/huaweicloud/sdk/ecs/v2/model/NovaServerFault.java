package com.huaweicloud.sdk.ecs.v2.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class NovaServerFault  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="code")
    
    private Integer code;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private String created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message")
    
    private String message;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="details")
    
    private String details;

    public NovaServerFault withCode(Integer code) {
        this.code = code;
        return this;
    }

    


    /**
     * 错误码。
     * @return code
     */
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public NovaServerFault withCreated(String created) {
        this.created = created;
        return this;
    }

    


    /**
     * 异常出现的时间。
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public NovaServerFault withMessage(String message) {
        this.message = message;
        return this;
    }

    


    /**
     * 异常描述信息。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NovaServerFault withDetails(String details) {
        this.details = details;
        return this;
    }

    


    /**
     * 异常详情信息。
     * @return details
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServerFault novaServerFault = (NovaServerFault) o;
        return Objects.equals(this.code, novaServerFault.code) &&
            Objects.equals(this.created, novaServerFault.created) &&
            Objects.equals(this.message, novaServerFault.message) &&
            Objects.equals(this.details, novaServerFault.details);
    }
    @Override
    public int hashCode() {
        return Objects.hash(code, created, message, details);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServerFault {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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


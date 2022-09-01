package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 创建日志组参数。
 */
public class CreateLogGroupParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    @JacksonXmlProperty(localName = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    @JacksonXmlProperty(localName = "ttl_in_days")

    private Integer ttlInDays;

    public CreateLogGroupParams withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 需要创建的日志组名称。
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public CreateLogGroupParams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间（天），取值范围：1-30。
     * minimum: 1
     * maximum: 30
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateLogGroupParams createLogGroupParams = (CreateLogGroupParams) o;
        return Objects.equals(this.logGroupName, createLogGroupParams.logGroupName)
            && Objects.equals(this.ttlInDays, createLogGroupParams.ttlInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logGroupName, ttlInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateLogGroupParams {\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
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

package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 修改日志组的参数。
 */
public class UpdateLogGroupParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    @JacksonXmlProperty(localName = "ttl_in_days")

    private Integer ttlInDays;

    public UpdateLogGroupParams withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 日志存储时间 天。 取值范围为 [1, 30]
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
        UpdateLogGroupParams updateLogGroupParams = (UpdateLogGroupParams) o;
        return Objects.equals(this.ttlInDays, updateLogGroupParams.ttlInDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttlInDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLogGroupParams {\n");
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

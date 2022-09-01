package com.huaweicloud.sdk.cloudide.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ExpireVo
 */
public class ExpireVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiration")

    @JacksonXmlProperty(localName = "expiration")

    private Long expiration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    @JacksonXmlProperty(localName = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    @JacksonXmlProperty(localName = "interval")

    private Long interval;

    public ExpireVo withExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * 过期时间。UNIX时间戳，单位毫秒。eg:1635905480465
     * minimum: -1
     * maximum: 9999999999999
     * @return expiration
     */
    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public ExpireVo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * CloudIDE实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ExpireVo withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * CloudIDE实例自动休眠时长，单位‘分钟’
     * minimum: -1
     * maximum: 1440
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpireVo expireVo = (ExpireVo) o;
        return Objects.equals(this.expiration, expireVo.expiration)
            && Objects.equals(this.instanceId, expireVo.instanceId) && Objects.equals(this.interval, expireVo.interval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expiration, instanceId, interval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpireVo {\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
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

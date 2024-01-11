package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ConnectionDrain
 */
public class ConnectionDrain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    public ConnectionDrain withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 延迟注销功能开关，默认值：false； true：开启； false：关闭
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public ConnectionDrain withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 延迟注销时间，单位：s； 取值范围：10~4000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionDrain that = (ConnectionDrain) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionDrain {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

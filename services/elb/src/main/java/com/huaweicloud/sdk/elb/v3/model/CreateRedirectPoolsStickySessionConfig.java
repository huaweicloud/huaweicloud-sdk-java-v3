package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释：配置转发策略关联的服务器组之间会话保持。负载均衡器会根据客户端第一个请求生成一个cookie，后续所有包含这个cookie值的请求都会由同一个pool处理。  [约束限制：共享型负载均衡器下的转发策略不支持该字段，传入会报错。](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,srg,fcs,dt)  [不支持该字段，请勿使用。](tag:hcso_dt)  [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class CreateRedirectPoolsStickySessionConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    public CreateRedirectPoolsStickySessionConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 参数解释：转发策略主机组会话保持开启的开关。  默认取值：false，表示关闭主机组会话保持。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreateRedirectPoolsStickySessionConfig withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 参数解释：会话保持的时间。  取值范围：1-1440（分钟）  默认取值：1440  [荷兰region不支持QUIC。](tag:dt)
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
        CreateRedirectPoolsStickySessionConfig that = (CreateRedirectPoolsStickySessionConfig) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.timeout, that.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, timeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRedirectPoolsStickySessionConfig {\n");
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

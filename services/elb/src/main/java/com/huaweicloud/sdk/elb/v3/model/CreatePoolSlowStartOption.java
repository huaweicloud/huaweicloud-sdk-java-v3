package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 参数解释：慢启动信息。开启慢启动后，将会在设定的时间段（duration）内对新添加到后端服务器组的后端服务器进行预热，转发到该服务器的请求数量线性增加。  约束限制：当后端服务器组的协议为HTTP/HTTPS/GRPC时有效，其他协议传入该字段将报错。  [网关型LB，不支持该特性，请勿使用。](tag:hws_eu) [荷兰region不支持该字段，请勿使用。](tag:dt)
 */
public class CreatePoolSlowStartOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public CreatePoolSlowStartOption withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 参数解释：慢启动的开关。  取值范围： - true：开启。 - false：关闭。  默认取值：false。 
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public CreatePoolSlowStartOption withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 参数解释：慢启动的持续时间。  取值范围：30-1200，单位：秒。  默认取值：30。
     * minimum: 30
     * maximum: 1200
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePoolSlowStartOption that = (CreatePoolSlowStartOption) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolSlowStartOption {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

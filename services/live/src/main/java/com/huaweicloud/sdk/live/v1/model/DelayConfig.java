package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DelayConfig
 */
public class DelayConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Integer delay;

    public DelayConfig withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名，默认为live
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public DelayConfig withDelay(Integer delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 延时时间，单位：ms。  包含如下取值： - 2000（低）。 - 4000（中）。 - 6000（高）。
     * @return delay
     */
    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelayConfig that = (DelayConfig) obj;
        return Objects.equals(this.app, that.app) && Objects.equals(this.delay, that.delay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(app, delay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelayConfig {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
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

package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * WebHookEventCfgDto
 */
public class WebHookEventCfgDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private String eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cfgs")

    private String cfgs;

    public WebHookEventCfgDto withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * **参数解释：** 事件类型。 **取值范围：** 最小1个字节，最大255字节
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public WebHookEventCfgDto withCfgs(String cfgs) {
        this.cfgs = cfgs;
        return this;
    }

    /**
     * **参数解释：** 配置信息。 **取值范围：** 最小1个字节，最大255字节
     * @return cfgs
     */
    public String getCfgs() {
        return cfgs;
    }

    public void setCfgs(String cfgs) {
        this.cfgs = cfgs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebHookEventCfgDto that = (WebHookEventCfgDto) obj;
        return Objects.equals(this.eventType, that.eventType) && Objects.equals(this.cfgs, that.cfgs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventType, cfgs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebHookEventCfgDto {\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    cfgs: ").append(toIndentedString(cfgs)).append("\n");
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

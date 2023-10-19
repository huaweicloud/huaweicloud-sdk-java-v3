package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 导航服务请求体。
 */
public class NaviServiceReqPayload {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private NaviServiceReqPayloadFrom from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private NaviServiceReqPayloadTo to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "utm")

    private String utm;

    public NaviServiceReqPayload withFrom(NaviServiceReqPayloadFrom from) {
        this.from = from;
        return this;
    }

    public NaviServiceReqPayload withFrom(Consumer<NaviServiceReqPayloadFrom> fromSetter) {
        if (this.from == null) {
            this.from = new NaviServiceReqPayloadFrom();
            fromSetter.accept(this.from);
        }

        return this;
    }

    /**
     * Get from
     * @return from
     */
    public NaviServiceReqPayloadFrom getFrom() {
        return from;
    }

    public void setFrom(NaviServiceReqPayloadFrom from) {
        this.from = from;
    }

    public NaviServiceReqPayload withTo(NaviServiceReqPayloadTo to) {
        this.to = to;
        return this;
    }

    public NaviServiceReqPayload withTo(Consumer<NaviServiceReqPayloadTo> toSetter) {
        if (this.to == null) {
            this.to = new NaviServiceReqPayloadTo();
            toSetter.accept(this.to);
        }

        return this;
    }

    /**
     * Get to
     * @return to
     */
    public NaviServiceReqPayloadTo getTo() {
        return to;
    }

    public void setTo(NaviServiceReqPayloadTo to) {
        this.to = to;
    }

    public NaviServiceReqPayload withUtm(String utm) {
        this.utm = utm;
        return this;
    }

    /**
     * 地区UTM编码。
     * @return utm
     */
    public String getUtm() {
        return utm;
    }

    public void setUtm(String utm) {
        this.utm = utm;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NaviServiceReqPayload that = (NaviServiceReqPayload) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.utm, that.utm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, utm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NaviServiceReqPayload {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    utm: ").append(toIndentedString(utm)).append("\n");
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

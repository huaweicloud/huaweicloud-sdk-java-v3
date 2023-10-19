package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NaviServiceReq
 */
public class NaviServiceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payload")

    private NaviServiceReqPayload payload;

    public NaviServiceReq withPayload(NaviServiceReqPayload payload) {
        this.payload = payload;
        return this;
    }

    public NaviServiceReq withPayload(Consumer<NaviServiceReqPayload> payloadSetter) {
        if (this.payload == null) {
            this.payload = new NaviServiceReqPayload();
            payloadSetter.accept(this.payload);
        }

        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    public NaviServiceReqPayload getPayload() {
        return payload;
    }

    public void setPayload(NaviServiceReqPayload payload) {
        this.payload = payload;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NaviServiceReq that = (NaviServiceReq) obj;
        return Objects.equals(this.payload, that.payload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NaviServiceReq {\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

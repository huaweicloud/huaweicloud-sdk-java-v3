package com.huaweicloud.sdk.voicecall.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StopCallReq
 */
public class StopCallReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sessionid")

    private String sessionid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signal")

    private String signal;

    public StopCallReq withSessionid(String sessionid) {
        this.sessionid = sessionid;
        return this;
    }

    /**
     * 该参数用于唯一标识一路通话
     * @return sessionid
     */
    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public StopCallReq withSignal(String signal) {
        this.signal = signal;
        return this;
    }

    /**
     * 该参数值指定终止呼叫的方式，目前signal的取值仅固定为“call_stop”，表示主被叫都拆线
     * @return signal
     */
    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopCallReq that = (StopCallReq) obj;
        return Objects.equals(this.sessionid, that.sessionid) && Objects.equals(this.signal, that.signal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionid, signal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopCallReq {\n");
        sb.append("    sessionid: ").append(toIndentedString(sessionid)).append("\n");
        sb.append("    signal: ").append(toIndentedString(signal)).append("\n");
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

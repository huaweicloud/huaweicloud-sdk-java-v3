package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Dpd
 */
public class Dpd {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    /**
     * DPD检测报文格式
     */
    public static final class MsgEnum {

        /**
         * Enum SEQ_HASH_NOTIFY for value: "seq-hash-notify"
         */
        public static final MsgEnum SEQ_HASH_NOTIFY = new MsgEnum("seq-hash-notify");

        /**
         * Enum SEQ_NOTIFY_HASH for value: "seq-notify-hash"
         */
        public static final MsgEnum SEQ_NOTIFY_HASH = new MsgEnum("seq-notify-hash");

        private static final Map<String, MsgEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MsgEnum> createStaticFields() {
            Map<String, MsgEnum> map = new HashMap<>();
            map.put("seq-hash-notify", SEQ_HASH_NOTIFY);
            map.put("seq-notify-hash", SEQ_NOTIFY_HASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MsgEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MsgEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MsgEnum(value));
        }

        public static MsgEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MsgEnum) {
                return this.value.equals(((MsgEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private MsgEnum msg;

    public Dpd withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * DPD检测间隔时长
     * minimum: 10
     * maximum: 3600
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Dpd withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * DPD检测间隔超时时间
     * minimum: 2
     * maximum: 60
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Dpd withMsg(MsgEnum msg) {
        this.msg = msg;
        return this;
    }

    /**
     * DPD检测报文格式
     * @return msg
     */
    public MsgEnum getMsg() {
        return msg;
    }

    public void setMsg(MsgEnum msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Dpd that = (Dpd) obj;
        return Objects.equals(this.interval, that.interval) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, timeout, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Dpd {\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

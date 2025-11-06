package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * NoDataCondition
 */
public class NoDataCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_data_timeframe")

    private Integer noDataTimeframe;

    /**
     * 数据不足时，阈值规则的状态。（当\"notify_no_data\"为true时，该参数必填，当\"notify_no_data\"为false时，该参数为空） - “no_data”：数据不足并发送通知 - “alerting”：告警 - “ok”：正常 - “pre_state”：保持上一个状态
     */
    public static final class NoDataAlertStateEnum {

        /**
         * Enum NO_DATA for value: "no_data"
         */
        public static final NoDataAlertStateEnum NO_DATA = new NoDataAlertStateEnum("no_data");

        /**
         * Enum ALERTING for value: "alerting"
         */
        public static final NoDataAlertStateEnum ALERTING = new NoDataAlertStateEnum("alerting");

        /**
         * Enum OK for value: "ok"
         */
        public static final NoDataAlertStateEnum OK = new NoDataAlertStateEnum("ok");

        /**
         * Enum PRE_STATE for value: "pre_state"
         */
        public static final NoDataAlertStateEnum PRE_STATE = new NoDataAlertStateEnum("pre_state");

        private static final Map<String, NoDataAlertStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NoDataAlertStateEnum> createStaticFields() {
            Map<String, NoDataAlertStateEnum> map = new HashMap<>();
            map.put("no_data", NO_DATA);
            map.put("alerting", ALERTING);
            map.put("ok", OK);
            map.put("pre_state", PRE_STATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NoDataAlertStateEnum(String value) {
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
        public static NoDataAlertStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NoDataAlertStateEnum(value));
        }

        public static NoDataAlertStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NoDataAlertStateEnum) {
                return this.value.equals(((NoDataAlertStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_data_alert_state")

    private NoDataAlertStateEnum noDataAlertState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notify_no_data")

    private Boolean notifyNoData;

    public NoDataCondition withNoDataTimeframe(Integer noDataTimeframe) {
        this.noDataTimeframe = noDataTimeframe;
        return this;
    }

    /**
     * 无数据处理连续周期。取值范围为1~5。（当\"notify_no_data\"为true时，该参数必填，当\"notify_no_data\"为false时，该参数为空）
     * @return noDataTimeframe
     */
    public Integer getNoDataTimeframe() {
        return noDataTimeframe;
    }

    public void setNoDataTimeframe(Integer noDataTimeframe) {
        this.noDataTimeframe = noDataTimeframe;
    }

    public NoDataCondition withNoDataAlertState(NoDataAlertStateEnum noDataAlertState) {
        this.noDataAlertState = noDataAlertState;
        return this;
    }

    /**
     * 数据不足时，阈值规则的状态。（当\"notify_no_data\"为true时，该参数必填，当\"notify_no_data\"为false时，该参数为空） - “no_data”：数据不足并发送通知 - “alerting”：告警 - “ok”：正常 - “pre_state”：保持上一个状态
     * @return noDataAlertState
     */
    public NoDataAlertStateEnum getNoDataAlertState() {
        return noDataAlertState;
    }

    public void setNoDataAlertState(NoDataAlertStateEnum noDataAlertState) {
        this.noDataAlertState = noDataAlertState;
    }

    public NoDataCondition withNotifyNoData(Boolean notifyNoData) {
        this.notifyNoData = notifyNoData;
        return this;
    }

    /**
     * 无数据处理开关。true表示启用无数据处理，false表示关闭无数据处理。
     * @return notifyNoData
     */
    public Boolean getNotifyNoData() {
        return notifyNoData;
    }

    public void setNotifyNoData(Boolean notifyNoData) {
        this.notifyNoData = notifyNoData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NoDataCondition that = (NoDataCondition) obj;
        return Objects.equals(this.noDataTimeframe, that.noDataTimeframe)
            && Objects.equals(this.noDataAlertState, that.noDataAlertState)
            && Objects.equals(this.notifyNoData, that.notifyNoData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noDataTimeframe, noDataAlertState, notifyNoData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NoDataCondition {\n");
        sb.append("    noDataTimeframe: ").append(toIndentedString(noDataTimeframe)).append("\n");
        sb.append("    noDataAlertState: ").append(toIndentedString(noDataAlertState)).append("\n");
        sb.append("    notifyNoData: ").append(toIndentedString(notifyNoData)).append("\n");
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

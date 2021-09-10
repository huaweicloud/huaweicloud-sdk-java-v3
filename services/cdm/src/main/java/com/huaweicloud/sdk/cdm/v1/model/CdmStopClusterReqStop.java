package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 集群启动操作，定义集群启动标识，为空对象 */
public class CdmStopClusterReqStop {

    /** 关机类型： - IMMEDIATELY：立即关机。 - GRACEFULLY：优雅关机。 */
    public static final class StopModeEnum {

        /** Enum IMMEDIATELY for value: "IMMEDIATELY" */
        public static final StopModeEnum IMMEDIATELY = new StopModeEnum("IMMEDIATELY");

        /** Enum GRACEFULLY for value: "GRACEFULLY" */
        public static final StopModeEnum GRACEFULLY = new StopModeEnum("GRACEFULLY");

        private static final Map<String, StopModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StopModeEnum> createStaticFields() {
            Map<String, StopModeEnum> map = new HashMap<>();
            map.put("IMMEDIATELY", IMMEDIATELY);
            map.put("GRACEFULLY", GRACEFULLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StopModeEnum(String value) {
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
        public static StopModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StopModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StopModeEnum(value);
            }
            return result;
        }

        public static StopModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StopModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StopModeEnum) {
                return this.value.equals(((StopModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stopMode")

    private StopModeEnum stopMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delayTime")

    private Integer delayTime;

    public CdmStopClusterReqStop withStopMode(StopModeEnum stopMode) {
        this.stopMode = stopMode;
        return this;
    }

    /** 关机类型： - IMMEDIATELY：立即关机。 - GRACEFULLY：优雅关机。
     * 
     * @return stopMode */
    public StopModeEnum getStopMode() {
        return stopMode;
    }

    public void setStopMode(StopModeEnum stopMode) {
        this.stopMode = stopMode;
    }

    public CdmStopClusterReqStop withDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
        return this;
    }

    /** 关机时延，仅在stopMode为“GRACEFULLY”生效，单位：秒。该值为-1时，表示等待所有作业完成，并停止接受新作业。该值为大于0的任意值表示等待该时长后关机，并停止接受新作业。
     * 
     * @return delayTime */
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CdmStopClusterReqStop cdmStopClusterReqStop = (CdmStopClusterReqStop) o;
        return Objects.equals(this.stopMode, cdmStopClusterReqStop.stopMode)
            && Objects.equals(this.delayTime, cdmStopClusterReqStop.delayTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stopMode, delayTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmStopClusterReqStop {\n");
        sb.append("    stopMode: ").append(toIndentedString(stopMode)).append("\n");
        sb.append("    delayTime: ").append(toIndentedString(delayTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

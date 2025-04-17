package com.huaweicloud.sdk.antiddos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateAntiDDosServiceRequestBody
 */
public class UpdateAntiDDosServiceRequestBody {

    /**
     * 应用类型ID，固定值为0
     */
    public static final class AppTypeIdEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final AppTypeIdEnum NUMBER_0 = new AppTypeIdEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final AppTypeIdEnum NUMBER_1 = new AppTypeIdEnum(1);

        private static final Map<Integer, AppTypeIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, AppTypeIdEnum> createStaticFields() {
            Map<Integer, AppTypeIdEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        AppTypeIdEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AppTypeIdEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppTypeIdEnum(value));
        }

        public static AppTypeIdEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AppTypeIdEnum) {
                return this.value.equals(((AppTypeIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_type_id")

    private AppTypeIdEnum appTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cleaning_access_pos_id")

    private Integer cleaningAccessPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_L7")

    private Boolean enableL7;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_request_pos_id")

    private Integer httpRequestPosId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_pos_id")

    private Integer trafficPosId;

    public UpdateAntiDDosServiceRequestBody withAppTypeId(AppTypeIdEnum appTypeId) {
        this.appTypeId = appTypeId;
        return this;
    }

    /**
     * 应用类型ID，固定值为0
     * @return appTypeId
     */
    public AppTypeIdEnum getAppTypeId() {
        return appTypeId;
    }

    public void setAppTypeId(AppTypeIdEnum appTypeId) {
        this.appTypeId = appTypeId;
    }

    public UpdateAntiDDosServiceRequestBody withCleaningAccessPosId(Integer cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
        return this;
    }

    /**
     * 清洗时访问限制分段ID，取值范围：1：10M;2：30M;3：50M;4：70M;5：100M;6：150M;7：200M;8：250M;9：300M;10：500M;11：800M;88：1000M;99：默认防护。
     * minimum: 1
     * maximum: 99
     * @return cleaningAccessPosId
     */
    public Integer getCleaningAccessPosId() {
        return cleaningAccessPosId;
    }

    public void setCleaningAccessPosId(Integer cleaningAccessPosId) {
        this.cleaningAccessPosId = cleaningAccessPosId;
    }

    public UpdateAntiDDosServiceRequestBody withEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
        return this;
    }

    /**
     * 是否开启L7层防护，固定值为fasle
     * @return enableL7
     */
    public Boolean getEnableL7() {
        return enableL7;
    }

    public void setEnableL7(Boolean enableL7) {
        this.enableL7 = enableL7;
    }

    public UpdateAntiDDosServiceRequestBody withHttpRequestPosId(Integer httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
        return this;
    }

    /**
     * HTTP请求数分段ID，固定值为1
     * minimum: 1
     * maximum: 15
     * @return httpRequestPosId
     */
    public Integer getHttpRequestPosId() {
        return httpRequestPosId;
    }

    public void setHttpRequestPosId(Integer httpRequestPosId) {
        this.httpRequestPosId = httpRequestPosId;
    }

    public UpdateAntiDDosServiceRequestBody withTrafficPosId(Integer trafficPosId) {
        this.trafficPosId = trafficPosId;
        return this;
    }

    /**
     * 流量分段ID，取值范围：1：10M;2：30M;3：50M;4：70M;5：100M;6：150M;7：200M;8：250M;9：300M;10：500M;11：800M;88：1000M;99：默认防护。
     * minimum: 1
     * maximum: 99
     * @return trafficPosId
     */
    public Integer getTrafficPosId() {
        return trafficPosId;
    }

    public void setTrafficPosId(Integer trafficPosId) {
        this.trafficPosId = trafficPosId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAntiDDosServiceRequestBody that = (UpdateAntiDDosServiceRequestBody) obj;
        return Objects.equals(this.appTypeId, that.appTypeId)
            && Objects.equals(this.cleaningAccessPosId, that.cleaningAccessPosId)
            && Objects.equals(this.enableL7, that.enableL7)
            && Objects.equals(this.httpRequestPosId, that.httpRequestPosId)
            && Objects.equals(this.trafficPosId, that.trafficPosId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appTypeId, cleaningAccessPosId, enableL7, httpRequestPosId, trafficPosId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAntiDDosServiceRequestBody {\n");
        sb.append("    appTypeId: ").append(toIndentedString(appTypeId)).append("\n");
        sb.append("    cleaningAccessPosId: ").append(toIndentedString(cleaningAccessPosId)).append("\n");
        sb.append("    enableL7: ").append(toIndentedString(enableL7)).append("\n");
        sb.append("    httpRequestPosId: ").append(toIndentedString(httpRequestPosId)).append("\n");
        sb.append("    trafficPosId: ").append(toIndentedString(trafficPosId)).append("\n");
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

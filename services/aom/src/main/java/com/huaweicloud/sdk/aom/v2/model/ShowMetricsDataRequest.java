package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowMetricsDataRequest {

    /**
     * 用于对查询到的监控数据进行断点插值，默认值为-1。 -1：断点处使用-1进行表示。 0 ：断点处使用0进行表示。 null：断点处使用null进行表示。 average：断点处使用前后邻近的有效数据的平均值进行表示，如果不存在有效数据则使用null进行表示。
     */
    public static final class FillValueEnum {

        /**
         * Enum _1 for value: "-1"
         */
        public static final FillValueEnum _1 = new FillValueEnum("-1");

        /**
         * Enum _0 for value: "0"
         */
        public static final FillValueEnum _0 = new FillValueEnum("0");

        /**
         * Enum NULL for value: "null"
         */
        public static final FillValueEnum NULL = new FillValueEnum("null");

        /**
         * Enum AVERAGE for value: "average"
         */
        public static final FillValueEnum AVERAGE = new FillValueEnum("average");

        private static final Map<String, FillValueEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FillValueEnum> createStaticFields() {
            Map<String, FillValueEnum> map = new HashMap<>();
            map.put("-1", _1);
            map.put("0", _0);
            map.put("null", NULL);
            map.put("average", AVERAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FillValueEnum(String value) {
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
        public static FillValueEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FillValueEnum(value));
        }

        public static FillValueEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FillValueEnum) {
                return this.value.equals(((FillValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fillValue")

    private FillValueEnum fillValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private QueryMetricDataParam body;

    public ShowMetricsDataRequest withFillValue(FillValueEnum fillValue) {
        this.fillValue = fillValue;
        return this;
    }

    /**
     * 用于对查询到的监控数据进行断点插值，默认值为-1。 -1：断点处使用-1进行表示。 0 ：断点处使用0进行表示。 null：断点处使用null进行表示。 average：断点处使用前后邻近的有效数据的平均值进行表示，如果不存在有效数据则使用null进行表示。
     * @return fillValue
     */
    public FillValueEnum getFillValue() {
        return fillValue;
    }

    public void setFillValue(FillValueEnum fillValue) {
        this.fillValue = fillValue;
    }

    public ShowMetricsDataRequest withBody(QueryMetricDataParam body) {
        this.body = body;
        return this;
    }

    public ShowMetricsDataRequest withBody(Consumer<QueryMetricDataParam> bodySetter) {
        if (this.body == null) {
            this.body = new QueryMetricDataParam();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public QueryMetricDataParam getBody() {
        return body;
    }

    public void setBody(QueryMetricDataParam body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMetricsDataRequest that = (ShowMetricsDataRequest) obj;
        return Objects.equals(this.fillValue, that.fillValue) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fillValue, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetricsDataRequest {\n");
        sb.append("    fillValue: ").append(toIndentedString(fillValue)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

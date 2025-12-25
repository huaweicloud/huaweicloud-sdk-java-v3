package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MetricMetaDataDerivedMetrics
 */
public class MetricMetaDataDerivedMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_dimension")

    private Integer metricDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_query_range")

    private Integer maxQueryRange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_start")

    private String dateStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_end")

    private String dateEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date_format")

    private String dateFormat;

    /**
     * 获取指标结果方式，cbsl, api, dsl, sql
     */
    public static final class QueryTypeEnum {

        /**
         * Enum CBSL for value: "cbsl"
         */
        public static final QueryTypeEnum CBSL = new QueryTypeEnum("cbsl");

        /**
         * Enum _API for value: " api"
         */
        public static final QueryTypeEnum _API = new QueryTypeEnum(" api");

        /**
         * Enum _DSL for value: " dsl"
         */
        public static final QueryTypeEnum _DSL = new QueryTypeEnum(" dsl");

        /**
         * Enum _SQL for value: " sql"
         */
        public static final QueryTypeEnum _SQL = new QueryTypeEnum(" sql");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("cbsl", CBSL);
            map.put(" api", _API);
            map.put(" dsl", _DSL);
            map.put(" sql", _SQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QueryTypeEnum(value));
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_function")

    private String queryFunction;

    public MetricMetaDataDerivedMetrics withMetricDimension(Integer metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * 衍生指标结果维度，0维：单个数字，2维：图表或表格，3+维：多标签图表
     * minimum: 0
     * maximum: 5
     * @return metricDimension
     */
    public Integer getMetricDimension() {
        return metricDimension;
    }

    public void setMetricDimension(Integer metricDimension) {
        this.metricDimension = metricDimension;
    }

    public MetricMetaDataDerivedMetrics withMaxQueryRange(Integer maxQueryRange) {
        this.maxQueryRange = maxQueryRange;
        return this;
    }

    /**
     * 指标支持的最大检索范围，单位：天；
     * minimum: 0
     * maximum: 864000
     * @return maxQueryRange
     */
    public Integer getMaxQueryRange() {
        return maxQueryRange;
    }

    public void setMaxQueryRange(Integer maxQueryRange) {
        this.maxQueryRange = maxQueryRange;
    }

    public MetricMetaDataDerivedMetrics withDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    /**
     * 指标查询范围相对起始时间 datemath表达式
     * @return dateStart
     */
    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public MetricMetaDataDerivedMetrics withDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }

    /**
     * 指标查询范围相对截止时间 datemath表达式
     * @return dateEnd
     */
    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public MetricMetaDataDerivedMetrics withDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * 时间格式，epoch_millis;epoch_second;yyyy-MM-dd'T'HH:mm:ss.SSSZ
     * @return dateFormat
     */
    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public MetricMetaDataDerivedMetrics withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * 获取指标结果方式，cbsl, api, dsl, sql
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public MetricMetaDataDerivedMetrics withQueryFunction(String queryFunction) {
        this.queryFunction = queryFunction;
        return this;
    }

    /**
     * 获取指标结果的方法，转义成字符串, 共四种query方式：CBSL、API、DSL、SQL - query_type为`CBSL`时，function传入dataspace_id，pipe_id，query，sort, from, to   样例：     ```     {\\\"dataspace_id\\\":\\\"3939573a-12a0-436f-b0e5-ab2872a1fde9\\\",\\\"pipe_id\\\":\\\"9db9d8a6-d9e6-4b32-990e-40f0afe4655d\\\",\\\"query\\\":\\\"* | select ack_pps, device_type as type\\\",\\\"sort\\\":\\\"desc\\\",\\\"from\\\":${date_from},\\\"to\\\":${date_to}}     ```      转义前：     ```json     {         \"dataspace_id\":\"3939573a-12a0-436f-b0e5-ab2872a1fde9\",         \"pipe_id\":\"9db9d8a6-d9e6-4b32-990e-40f0afe4655d\",         \"query\":\"* | select ack_pps, device_type as type\",         \"sort\":\"desc\",         \"from\": ${date_from},         \"to\": ${date_to}     }     ``` - query_type为`API`时，function传入api method、url、path_params、headers、response_parser（解析API返回值所需，定义label和json_path将返回值解析为二维表格，label为表头，json_path为字段提取路径）   样例：     ```     {\\\"method\\\":\\\"POST\\\",\\\"uri\\\":\\\"/v1/${project_id}/只填写uri/不带域名/xxx\\\",\\\"headers\\\":{\\\"X-Auth-Token\\\":\\\"${project_token}\\\"},\\\"response_parser\\\":{\\\"labels\\\":[\\\"攻击类型\\\",\\\"攻击源\\\",\\\"时间\\\"],\\\"json_path\\\":[\\\"$.data[:].type\\\",\\\"$.data[:].source\\\",\\\"$.data[:].time\\\"]}}     ```      转义前：     ```json     {         \"method\":\"POST\",         \"uri\":\"/v1/${project_id}/只填写uri/不带域名/xxx\",         \"headers\":{             \"X-Auth-Token\": \"${project_token}\"         },         \"response_parser\":{             \"labels\":[                 \"攻击类型\",                 \"攻击源\",                 \"时间\"             ],             \"json_path\":[                 \"$.data[:].type\",                 \"$.data[:].source\",                 \"$.data[:].time\"             ]         }     }     ``` - query_type为`DSL`时，指定index, dsl(转义成字符串), response_parser   样例：     ```     {\\\"index\\\":\\\"index_xxx_*\\\",\\\"dsl\\\":\\\"{\\\\\\\"query\\\\\\\":{\\\\\\\"match_all\\\\\\\":{}}}\\\",\\\"response_parser\\\":{\\\"labels\\\":[\\\"攻击类型\\\",\\\"攻击源\\\",\\\"时间\\\"],\\\"json_path\\\":[\\\"$.data[:].type\\\",\\\"$.data[:].source\\\",\\\"$.data[:].time\\\"]}}     ```      转义前：      ```json     {         \"index\":\"index_xxx_*\",         \"dsl\":\"{\\\"query\\\":{\\\"match_all\\\":{}}}\",         \"response_parser\":{             \"labels\":[                 \"攻击类型\",                 \"攻击源\",                 \"时间\"             ],             \"json_path\":[                 \"$.data[:].type\",                 \"$.data[:].source\",                 \"$.data[:].time\"             ]         }     }     ``` - query_type为`sql`时，指定opendistro sql插件查询json(转义成字符串)   样例：     ```    {\\\"query\\\":\\\"SELECT count(1) as count , msg.DstPort FROM isap_log_nip_ttl* where oct >= TIMESTAMP(\\\\\\\"${date_from}\\\\\\\") and oct <= TIMESTAMP(\\\\\\\"${date_to}\\\\\\\") group by msg.DstPort order by count desc limit 5\\\"}     ```           转义前：      ```json     {         \"query\":\"SELECT count(1) as count , msg.DstPort FROM isap_log_nip_ttl* where oct >= TIMESTAMP(\\\"${date_from}\\\") and oct <= TIMESTAMP(\\\"${date_to}\\\") group by msg.DstPort order by count desc limit 5\"     }     ```
     * @return queryFunction
     */
    public String getQueryFunction() {
        return queryFunction;
    }

    public void setQueryFunction(String queryFunction) {
        this.queryFunction = queryFunction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricMetaDataDerivedMetrics that = (MetricMetaDataDerivedMetrics) obj;
        return Objects.equals(this.metricDimension, that.metricDimension)
            && Objects.equals(this.maxQueryRange, that.maxQueryRange) && Objects.equals(this.dateStart, that.dateStart)
            && Objects.equals(this.dateEnd, that.dateEnd) && Objects.equals(this.dateFormat, that.dateFormat)
            && Objects.equals(this.queryType, that.queryType) && Objects.equals(this.queryFunction, that.queryFunction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricDimension, maxQueryRange, dateStart, dateEnd, dateFormat, queryType, queryFunction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricMetaDataDerivedMetrics {\n");
        sb.append("    metricDimension: ").append(toIndentedString(metricDimension)).append("\n");
        sb.append("    maxQueryRange: ").append(toIndentedString(maxQueryRange)).append("\n");
        sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
        sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
        sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    queryFunction: ").append(toIndentedString(queryFunction)).append("\n");
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

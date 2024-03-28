package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 生成SQL静态流图请求参数
 */
public class CreateFlinkSqlJobGraphRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    private String sqlBody;

    /**
     * Flink版本。当前只支持1.10和1.12。
     */
    public static final class FlinkVersionEnum {

        /**
         * Enum _1_1 for value: "1.1"
         */
        public static final FlinkVersionEnum _1_1 = new FlinkVersionEnum("1.1");

        /**
         * Enum _1_12 for value: "1.12"
         */
        public static final FlinkVersionEnum _1_12 = new FlinkVersionEnum("1.12");

        private static final Map<String, FlinkVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FlinkVersionEnum> createStaticFields() {
            Map<String, FlinkVersionEnum> map = new HashMap<>();
            map.put("1.1", _1_1);
            map.put("1.12", _1_12);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FlinkVersionEnum(String value) {
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
        public static FlinkVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkVersionEnum(value));
        }

        public static FlinkVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FlinkVersionEnum) {
                return this.value.equals(((FlinkVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_version")

    private FlinkVersionEnum flinkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_number")

    private Integer cuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_cu_number")

    private Integer managerCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_cus")

    private Integer tmCus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_slot_num")

    private Integer tmSlotNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_config")

    private String operatorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator")

    private Boolean staticEstimator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    /**
     * 流图类型。当前支持以下两种流图类型。 简化流图：simple_graph 静态流图：job_graph。
     */
    public static final class GraphTypeEnum {

        /**
         * Enum SIMPLE_GRAPH for value: "simple_graph"
         */
        public static final GraphTypeEnum SIMPLE_GRAPH = new GraphTypeEnum("simple_graph");

        /**
         * Enum JOB_GRAPH for value: "job_graph"
         */
        public static final GraphTypeEnum JOB_GRAPH = new GraphTypeEnum("job_graph");

        private static final Map<String, GraphTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, GraphTypeEnum> createStaticFields() {
            Map<String, GraphTypeEnum> map = new HashMap<>();
            map.put("simple_graph", SIMPLE_GRAPH);
            map.put("job_graph", JOB_GRAPH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        GraphTypeEnum(String value) {
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
        public static GraphTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new GraphTypeEnum(value));
        }

        public static GraphTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof GraphTypeEnum) {
                return this.value.equals(((GraphTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_type")

    private GraphTypeEnum graphType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator_config")

    private String staticEstimatorConfig;

    public CreateFlinkSqlJobGraphRequestBody withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * SQL
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public CreateFlinkSqlJobGraphRequestBody withFlinkVersion(FlinkVersionEnum flinkVersion) {
        this.flinkVersion = flinkVersion;
        return this;
    }

    /**
     * Flink版本。当前只支持1.10和1.12。
     * @return flinkVersion
     */
    public FlinkVersionEnum getFlinkVersion() {
        return flinkVersion;
    }

    public void setFlinkVersion(FlinkVersionEnum flinkVersion) {
        this.flinkVersion = flinkVersion;
    }

    public CreateFlinkSqlJobGraphRequestBody withCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
        return this;
    }

    /**
     * CU总数
     * minimum: 2
     * @return cuNumber
     */
    public Integer getCuNumber() {
        return cuNumber;
    }

    public void setCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
    }

    public CreateFlinkSqlJobGraphRequestBody withManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
        return this;
    }

    /**
     * 管理单元CU数量
     * minimum: 1
     * @return managerCuNumber
     */
    public Integer getManagerCuNumber() {
        return managerCuNumber;
    }

    public void setManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
    }

    public CreateFlinkSqlJobGraphRequestBody withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 最大并行度
     * minimum: 1
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public CreateFlinkSqlJobGraphRequestBody withTmCus(Integer tmCus) {
        this.tmCus = tmCus;
        return this;
    }

    /**
     * 单个taskManagerCU数量
     * minimum: 1
     * @return tmCus
     */
    public Integer getTmCus() {
        return tmCus;
    }

    public void setTmCus(Integer tmCus) {
        this.tmCus = tmCus;
    }

    public CreateFlinkSqlJobGraphRequestBody withTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
        return this;
    }

    /**
     * 单个taskManager Slot数量
     * minimum: 1
     * @return tmSlotNum
     */
    public Integer getTmSlotNum() {
        return tmSlotNum;
    }

    public void setTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
    }

    public CreateFlinkSqlJobGraphRequestBody withOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
        return this;
    }

    /**
     * 算子的配置
     * @return operatorConfig
     */
    public String getOperatorConfig() {
        return operatorConfig;
    }

    public void setOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
    }

    public CreateFlinkSqlJobGraphRequestBody withStaticEstimator(Boolean staticEstimator) {
        this.staticEstimator = staticEstimator;
        return this;
    }

    /**
     * 是否静态资源预估
     * @return staticEstimator
     */
    public Boolean getStaticEstimator() {
        return staticEstimator;
    }

    public void setStaticEstimator(Boolean staticEstimator) {
        this.staticEstimator = staticEstimator;
    }

    public CreateFlinkSqlJobGraphRequestBody withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateFlinkSqlJobGraphRequestBody withGraphType(GraphTypeEnum graphType) {
        this.graphType = graphType;
        return this;
    }

    /**
     * 流图类型。当前支持以下两种流图类型。 简化流图：simple_graph 静态流图：job_graph。
     * @return graphType
     */
    public GraphTypeEnum getGraphType() {
        return graphType;
    }

    public void setGraphType(GraphTypeEnum graphType) {
        this.graphType = graphType;
    }

    public CreateFlinkSqlJobGraphRequestBody withStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
        return this;
    }

    /**
     * 每个算子的流量/命中率配置，json格式的字符串。
     * @return staticEstimatorConfig
     */
    public String getStaticEstimatorConfig() {
        return staticEstimatorConfig;
    }

    public void setStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFlinkSqlJobGraphRequestBody that = (CreateFlinkSqlJobGraphRequestBody) obj;
        return Objects.equals(this.sqlBody, that.sqlBody) && Objects.equals(this.flinkVersion, that.flinkVersion)
            && Objects.equals(this.cuNumber, that.cuNumber)
            && Objects.equals(this.managerCuNumber, that.managerCuNumber)
            && Objects.equals(this.parallelNumber, that.parallelNumber) && Objects.equals(this.tmCus, that.tmCus)
            && Objects.equals(this.tmSlotNum, that.tmSlotNum)
            && Objects.equals(this.operatorConfig, that.operatorConfig)
            && Objects.equals(this.staticEstimator, that.staticEstimator) && Objects.equals(this.jobType, that.jobType)
            && Objects.equals(this.graphType, that.graphType)
            && Objects.equals(this.staticEstimatorConfig, that.staticEstimatorConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlBody,
            flinkVersion,
            cuNumber,
            managerCuNumber,
            parallelNumber,
            tmCus,
            tmSlotNum,
            operatorConfig,
            staticEstimator,
            jobType,
            graphType,
            staticEstimatorConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFlinkSqlJobGraphRequestBody {\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    flinkVersion: ").append(toIndentedString(flinkVersion)).append("\n");
        sb.append("    cuNumber: ").append(toIndentedString(cuNumber)).append("\n");
        sb.append("    managerCuNumber: ").append(toIndentedString(managerCuNumber)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    tmCus: ").append(toIndentedString(tmCus)).append("\n");
        sb.append("    tmSlotNum: ").append(toIndentedString(tmSlotNum)).append("\n");
        sb.append("    operatorConfig: ").append(toIndentedString(operatorConfig)).append("\n");
        sb.append("    staticEstimator: ").append(toIndentedString(staticEstimator)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    graphType: ").append(toIndentedString(graphType)).append("\n");
        sb.append("    staticEstimatorConfig: ").append(toIndentedString(staticEstimatorConfig)).append("\n");
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

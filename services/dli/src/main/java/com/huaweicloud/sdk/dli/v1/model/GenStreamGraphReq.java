package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 生成SQL静态流图请求参数
 */
public class GenStreamGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    @JacksonXmlProperty(localName = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_number")

    @JacksonXmlProperty(localName = "cu_number")

    private Integer cuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_cu_number")

    @JacksonXmlProperty(localName = "manager_cu_number")

    private Integer managerCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    @JacksonXmlProperty(localName = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_cus")

    @JacksonXmlProperty(localName = "tm_cus")

    private Integer tmCus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_slot_num")

    @JacksonXmlProperty(localName = "tm_slot_num")

    private Integer tmSlotNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_config")

    @JacksonXmlProperty(localName = "operator_config")

    private String operatorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator")

    @JacksonXmlProperty(localName = "static_estimator")

    private Boolean staticEstimator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_type")

    @JacksonXmlProperty(localName = "graph_type")

    private String graphType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator_config")

    @JacksonXmlProperty(localName = "static_estimator_config")

    private String staticEstimatorConfig;

    public GenStreamGraphReq withSqlBody(String sqlBody) {
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

    public GenStreamGraphReq withCuNumber(Integer cuNumber) {
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

    public GenStreamGraphReq withManagerCuNumber(Integer managerCuNumber) {
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

    public GenStreamGraphReq withParallelNumber(Integer parallelNumber) {
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

    public GenStreamGraphReq withTmCus(Integer tmCus) {
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

    public GenStreamGraphReq withTmSlotNum(Integer tmSlotNum) {
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

    public GenStreamGraphReq withOperatorConfig(String operatorConfig) {
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

    public GenStreamGraphReq withStaticEstimator(Boolean staticEstimator) {
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

    public GenStreamGraphReq withJobType(String jobType) {
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

    public GenStreamGraphReq withGraphType(String graphType) {
        this.graphType = graphType;
        return this;
    }

    /**
     * 流图类型
     * @return graphType
     */
    public String getGraphType() {
        return graphType;
    }

    public void setGraphType(String graphType) {
        this.graphType = graphType;
    }

    public GenStreamGraphReq withStaticEstimatorConfig(String staticEstimatorConfig) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GenStreamGraphReq genStreamGraphReq = (GenStreamGraphReq) o;
        return Objects.equals(this.sqlBody, genStreamGraphReq.sqlBody)
            && Objects.equals(this.cuNumber, genStreamGraphReq.cuNumber)
            && Objects.equals(this.managerCuNumber, genStreamGraphReq.managerCuNumber)
            && Objects.equals(this.parallelNumber, genStreamGraphReq.parallelNumber)
            && Objects.equals(this.tmCus, genStreamGraphReq.tmCus)
            && Objects.equals(this.tmSlotNum, genStreamGraphReq.tmSlotNum)
            && Objects.equals(this.operatorConfig, genStreamGraphReq.operatorConfig)
            && Objects.equals(this.staticEstimator, genStreamGraphReq.staticEstimator)
            && Objects.equals(this.jobType, genStreamGraphReq.jobType)
            && Objects.equals(this.graphType, genStreamGraphReq.graphType)
            && Objects.equals(this.staticEstimatorConfig, genStreamGraphReq.staticEstimatorConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlBody,
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
        sb.append("class GenStreamGraphReq {\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
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

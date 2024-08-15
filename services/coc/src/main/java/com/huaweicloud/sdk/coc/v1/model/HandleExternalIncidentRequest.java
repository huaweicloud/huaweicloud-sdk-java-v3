package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * HandleExternalIncidentRequest
 */
public class HandleExternalIncidentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_num")

    private String incidentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_key")

    private String operateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter")

    private Map<String, Object> parameter = null;

    public HandleExternalIncidentRequest withIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
        return this;
    }

    /**
     * 事件单号
     * @return incidentNum
     */
    public String getIncidentNum() {
        return incidentNum;
    }

    public void setIncidentNum(String incidentNum) {
        this.incidentNum = incidentNum;
    }

    public HandleExternalIncidentRequest withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作人ID
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public HandleExternalIncidentRequest withOperateKey(String operateKey) {
        this.operateKey = operateKey;
        return this;
    }

    /**
     * 操作类型
     * @return operateKey
     */
    public String getOperateKey() {
        return operateKey;
    }

    public void setOperateKey(String operateKey) {
        this.operateKey = operateKey;
    }

    public HandleExternalIncidentRequest withParameter(Map<String, Object> parameter) {
        this.parameter = parameter;
        return this;
    }

    public HandleExternalIncidentRequest putParameterItem(String key, Object parameterItem) {
        if (this.parameter == null) {
            this.parameter = new HashMap<>();
        }
        this.parameter.put(key, parameterItem);
        return this;
    }

    public HandleExternalIncidentRequest withParameter(Consumer<Map<String, Object>> parameterSetter) {
        if (this.parameter == null) {
            this.parameter = new HashMap<>();
        }
        parameterSetter.accept(this.parameter);
        return this;
    }

    /**
     * 入参
     * @return parameter
     */
    public Map<String, Object> getParameter() {
        return parameter;
    }

    public void setParameter(Map<String, Object> parameter) {
        this.parameter = parameter;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HandleExternalIncidentRequest that = (HandleExternalIncidentRequest) obj;
        return Objects.equals(this.incidentNum, that.incidentNum) && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.operateKey, that.operateKey) && Objects.equals(this.parameter, that.parameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(incidentNum, operator, operateKey, parameter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleExternalIncidentRequest {\n");
        sb.append("    incidentNum: ").append(toIndentedString(incidentNum)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operateKey: ").append(toIndentedString(operateKey)).append("\n");
        sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

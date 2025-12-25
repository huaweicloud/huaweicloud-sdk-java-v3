package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditDO
 */
public class AuditDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "module")

    private String module;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userAgent")

    private String userAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operatorNickName")

    private String operatorNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operatorTenantName")

    private String operatorTenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipSource")

    private String ipSource;

    public AuditDO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 操作ID。  **取值范围**： 不涉及。id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuditDO withModule(String module) {
        this.module = module;
        return this;
    }

    /**
     * **参数解释**： 操作模块。  **取值范围**： 不涉及。
     * @return module
     */
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public AuditDO withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * **参数解释**： 操作类型。  **取值范围**： 不涉及。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AuditDO withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * **参数解释**： 操作时间。  **取值范围**： 不涉及。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public AuditDO withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * **参数解释**： 操作信息。  **取值范围**： 不涉及。
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AuditDO withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * **参数解释**： 操作数据。  **取值范围**： 不涉及。
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public AuditDO withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * **参数解释**： 原因。  **取值范围**： 不涉及。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public AuditDO withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * **参数解释**： 操作人客户端类型。  **取值范围**： 不涉及。
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public AuditDO withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * **参数解释**： 操作人。  **取值范围**： 不涉及。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public AuditDO withOperatorNickName(String operatorNickName) {
        this.operatorNickName = operatorNickName;
        return this;
    }

    /**
     * **参数解释**： 操作人名字。  **取值范围**： 不涉及。
     * @return operatorNickName
     */
    public String getOperatorNickName() {
        return operatorNickName;
    }

    public void setOperatorNickName(String operatorNickName) {
        this.operatorNickName = operatorNickName;
    }

    public AuditDO withOperatorTenantName(String operatorTenantName) {
        this.operatorTenantName = operatorTenantName;
        return this;
    }

    /**
     * **参数解释**： 操作人租户名。  **取值范围**： 不涉及。
     * @return operatorTenantName
     */
    public String getOperatorTenantName() {
        return operatorTenantName;
    }

    public void setOperatorTenantName(String operatorTenantName) {
        this.operatorTenantName = operatorTenantName;
    }

    public AuditDO withIpSource(String ipSource) {
        this.ipSource = ipSource;
        return this;
    }

    /**
     * **参数解释**： 操作人IP地址。  **取值范围**： 不涉及。
     * @return ipSource
     */
    public String getIpSource() {
        return ipSource;
    }

    public void setIpSource(String ipSource) {
        this.ipSource = ipSource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditDO that = (AuditDO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.module, that.module)
            && Objects.equals(this.operation, that.operation) && Objects.equals(this.time, that.time)
            && Objects.equals(this.info, that.info) && Objects.equals(this.data, that.data)
            && Objects.equals(this.reason, that.reason) && Objects.equals(this.userAgent, that.userAgent)
            && Objects.equals(this.operator, that.operator)
            && Objects.equals(this.operatorNickName, that.operatorNickName)
            && Objects.equals(this.operatorTenantName, that.operatorTenantName)
            && Objects.equals(this.ipSource, that.ipSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            module,
            operation,
            time,
            info,
            data,
            reason,
            userAgent,
            operator,
            operatorNickName,
            operatorTenantName,
            ipSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditDO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    module: ").append(toIndentedString(module)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operatorNickName: ").append(toIndentedString(operatorNickName)).append("\n");
        sb.append("    operatorTenantName: ").append(toIndentedString(operatorTenantName)).append("\n");
        sb.append("    ipSource: ").append(toIndentedString(ipSource)).append("\n");
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

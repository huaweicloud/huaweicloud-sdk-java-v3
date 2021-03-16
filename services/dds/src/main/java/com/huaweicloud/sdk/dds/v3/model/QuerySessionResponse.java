package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 会话详细信息列表。
 */
public class QuerySessionResponse  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="active")
    
    private Boolean active;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operation")
    
    private String operation;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cost_time")
    
    private String costTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plan_summary")
    
    private String planSummary;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client")
    
    private String client;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    
    private String namespace;

    public QuerySessionResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 会话ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public QuerySessionResponse withActive(Boolean active) {
        this.active = active;
        return this;
    }

    


    /**
     * 当前会话是否活跃。 取值为“true”，表示活跃。 取值为“false”，表示不活跃。
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    

    public QuerySessionResponse withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    


    /**
     * 操作。
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    

    public QuerySessionResponse withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 操作类型。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public QuerySessionResponse withCostTime(String costTime) {
        this.costTime = costTime;
        return this;
    }

    


    /**
     * 运行时间，单位为 ms。
     * @return costTime
     */
    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    

    public QuerySessionResponse withPlanSummary(String planSummary) {
        this.planSummary = planSummary;
        return this;
    }

    


    /**
     * 执行计划描述。
     * @return planSummary
     */
    public String getPlanSummary() {
        return planSummary;
    }

    public void setPlanSummary(String planSummary) {
        this.planSummary = planSummary;
    }

    

    public QuerySessionResponse withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 主机。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public QuerySessionResponse withClient(String client) {
        this.client = client;
        return this;
    }

    


    /**
     * 客户端地址。
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    

    public QuerySessionResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 连接描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public QuerySessionResponse withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 命名空间。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySessionResponse querySessionResponse = (QuerySessionResponse) o;
        return Objects.equals(this.id, querySessionResponse.id) &&
            Objects.equals(this.active, querySessionResponse.active) &&
            Objects.equals(this.operation, querySessionResponse.operation) &&
            Objects.equals(this.type, querySessionResponse.type) &&
            Objects.equals(this.costTime, querySessionResponse.costTime) &&
            Objects.equals(this.planSummary, querySessionResponse.planSummary) &&
            Objects.equals(this.host, querySessionResponse.host) &&
            Objects.equals(this.client, querySessionResponse.client) &&
            Objects.equals(this.description, querySessionResponse.description) &&
            Objects.equals(this.namespace, querySessionResponse.namespace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, active, operation, type, costTime, planSummary, host, client, description, namespace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySessionResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    costTime: ").append(toIndentedString(costTime)).append("\n");
        sb.append("    planSummary: ").append(toIndentedString(planSummary)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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


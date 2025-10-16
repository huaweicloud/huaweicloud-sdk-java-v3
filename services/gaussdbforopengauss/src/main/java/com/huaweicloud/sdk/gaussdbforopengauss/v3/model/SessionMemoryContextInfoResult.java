package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SessionMemoryContextInfoResult
 */
public class SessionMemoryContextInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "context_name")

    private String contextName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Integer amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Double size;

    public SessionMemoryContextInfoResult withContextName(String contextName) {
        this.contextName = contextName;
        return this;
    }

    /**
     * **参数解释**: 内存上下文名称。 **取值范围**: 不涉及。
     * @return contextName
     */
    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    public SessionMemoryContextInfoResult withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    /**
     * **参数解释**: 会话上下文数量。 **取值范围**: 大于等于0。
     * @return amount
     */
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public SessionMemoryContextInfoResult withSize(Double size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**: 会话上下文总大小。 **取值范围**: 大于等于0。
     * @return size
     */
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SessionMemoryContextInfoResult that = (SessionMemoryContextInfoResult) obj;
        return Objects.equals(this.contextName, that.contextName) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.size, that.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contextName, amount, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SessionMemoryContextInfoResult {\n");
        sb.append("    contextName: ").append(toIndentedString(contextName)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EipBypassDto
 */
public class EipBypassDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bypass_operation")

    private Integer bypassOperation;

    public EipBypassDto withBypassOperation(Integer bypassOperation) {
        this.bypassOperation = bypassOperation;
        return this;
    }

    /**
     * 防护操作类型，1表示一键关闭防护，0表示一键恢复防护
     * minimum: 0
     * maximum: 1
     * @return bypassOperation
     */
    public Integer getBypassOperation() {
        return bypassOperation;
    }

    public void setBypassOperation(Integer bypassOperation) {
        this.bypassOperation = bypassOperation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EipBypassDto that = (EipBypassDto) obj;
        return Objects.equals(this.bypassOperation, that.bypassOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bypassOperation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EipBypassDto {\n");
        sb.append("    bypassOperation: ").append(toIndentedString(bypassOperation)).append("\n");
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

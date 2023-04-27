package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 包含根中的一个策略类型和状态信息。
 */
public class PolicyTypeSummaryDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public PolicyTypeSummaryDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 与根关联的策略类型状态。要将指定类型的策略绑定到根或该根中的组织单元或帐号，该策略必须在组织中可用，并在该根已启用。enabled：启用；pending_enable：启用中；disabled：禁用；pending_disable：禁用中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PolicyTypeSummaryDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 策略类型的名称，service_control_policy：服务控制策略；tag_policy：标签策略。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyTypeSummaryDto policyTypeSummaryDto = (PolicyTypeSummaryDto) o;
        return Objects.equals(this.status, policyTypeSummaryDto.status)
            && Objects.equals(this.type, policyTypeSummaryDto.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTypeSummaryDto {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

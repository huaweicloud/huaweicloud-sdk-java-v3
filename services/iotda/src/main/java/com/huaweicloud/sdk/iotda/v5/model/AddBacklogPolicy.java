package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 新增数据流转积压策略请求结构体
 */
public class AddBacklogPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backlog_size")

    private Integer backlogSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backlog_time")

    private Integer backlogTime;

    public AddBacklogPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * **参数说明**：数据流转积压策略名称。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AddBacklogPolicy withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数说明**：用户自定义的数据流转积压策略描述。 **取值范围**：长度不超过256，只允许中文、字母、数字、以及_?'#().,&%@!-等字符的组合。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddBacklogPolicy withBacklogSize(Integer backlogSize) {
        this.backlogSize = backlogSize;
        return this;
    }

    /**
     * **参数说明**：数据积压大小。单位为B（字节），取值范围为0~1073741823的整数，默认为1073741823（即1GB）。当backlog_size为0时，表示不积压。若同时配置了backlog_size和backlog_time两个维度，则以最先达到阈值的维度为准。
     * minimum: 0
     * maximum: 1073741823
     * @return backlogSize
     */
    public Integer getBacklogSize() {
        return backlogSize;
    }

    public void setBacklogSize(Integer backlogSize) {
        this.backlogSize = backlogSize;
    }

    public AddBacklogPolicy withBacklogTime(Integer backlogTime) {
        this.backlogTime = backlogTime;
        return this;
    }

    /**
     * **参数说明**：数据积压时间。单位为s（秒），取值范围为0~86399的整数，默认为86399（即1天）。当backlog_time为0时，表示不积压。若同时配置了backlog_size和backlog_time两个维度，则以最先达到阈值的维度为准。
     * minimum: 0
     * maximum: 86399
     * @return backlogTime
     */
    public Integer getBacklogTime() {
        return backlogTime;
    }

    public void setBacklogTime(Integer backlogTime) {
        this.backlogTime = backlogTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddBacklogPolicy that = (AddBacklogPolicy) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.description, that.description)
            && Objects.equals(this.backlogSize, that.backlogSize) && Objects.equals(this.backlogTime, that.backlogTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, description, backlogSize, backlogTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddBacklogPolicy {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    backlogSize: ").append(toIndentedString(backlogSize)).append("\n");
        sb.append("    backlogTime: ").append(toIndentedString(backlogTime)).append("\n");
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

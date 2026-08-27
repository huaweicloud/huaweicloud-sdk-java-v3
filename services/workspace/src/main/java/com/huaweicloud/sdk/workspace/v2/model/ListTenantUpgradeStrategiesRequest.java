package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTenantUpgradeStrategiesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_accurate_name")

    private Boolean isAccurateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_name")

    private String strategyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_type")

    private Integer strategyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_force_upgrade")

    private Integer isForceUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_priority")

    private Integer strategyPriority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListTenantUpgradeStrategiesRequest withIsAccurateName(Boolean isAccurateName) {
        this.isAccurateName = isAccurateName;
        return this;
    }

    /**
     * 是否精确匹配名称
     * @return isAccurateName
     */
    public Boolean getIsAccurateName() {
        return isAccurateName;
    }

    public void setIsAccurateName(Boolean isAccurateName) {
        this.isAccurateName = isAccurateName;
    }

    public ListTenantUpgradeStrategiesRequest withStrategyName(String strategyName) {
        this.strategyName = strategyName;
        return this;
    }

    /**
     * 策略名称（支持模糊查询）
     * @return strategyName
     */
    public String getStrategyName() {
        return strategyName;
    }

    public void setStrategyName(String strategyName) {
        this.strategyName = strategyName;
    }

    public ListTenantUpgradeStrategiesRequest withStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * 策略类型：0-服务端 1-客户端
     * minimum: 0
     * maximum: 1
     * @return strategyType
     */
    public Integer getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(Integer strategyType) {
        this.strategyType = strategyType;
    }

    public ListTenantUpgradeStrategiesRequest withIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
        return this;
    }

    /**
     * 是否强制升级：0-否 1-是
     * minimum: 0
     * maximum: 1
     * @return isForceUpgrade
     */
    public Integer getIsForceUpgrade() {
        return isForceUpgrade;
    }

    public void setIsForceUpgrade(Integer isForceUpgrade) {
        this.isForceUpgrade = isForceUpgrade;
    }

    public ListTenantUpgradeStrategiesRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 启用状态：0-禁用 1-启用
     * minimum: 0
     * maximum: 1
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListTenantUpgradeStrategiesRequest withStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
        return this;
    }

    /**
     * 协议策略优先级
     * minimum: 1
     * maximum: 200
     * @return strategyPriority
     */
    public Integer getStrategyPriority() {
        return strategyPriority;
    }

    public void setStrategyPriority(Integer strategyPriority) {
        this.strategyPriority = strategyPriority;
    }

    public ListTenantUpgradeStrategiesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，默认0
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTenantUpgradeStrategiesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量，默认10，最大100
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTenantUpgradeStrategiesRequest that = (ListTenantUpgradeStrategiesRequest) obj;
        return Objects.equals(this.isAccurateName, that.isAccurateName)
            && Objects.equals(this.strategyName, that.strategyName)
            && Objects.equals(this.strategyType, that.strategyType)
            && Objects.equals(this.isForceUpgrade, that.isForceUpgrade) && Objects.equals(this.status, that.status)
            && Objects.equals(this.strategyPriority, that.strategyPriority) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(isAccurateName, strategyName, strategyType, isForceUpgrade, status, strategyPriority, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantUpgradeStrategiesRequest {\n");
        sb.append("    isAccurateName: ").append(toIndentedString(isAccurateName)).append("\n");
        sb.append("    strategyName: ").append(toIndentedString(strategyName)).append("\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    isForceUpgrade: ").append(toIndentedString(isForceUpgrade)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    strategyPriority: ").append(toIndentedString(strategyPriority)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

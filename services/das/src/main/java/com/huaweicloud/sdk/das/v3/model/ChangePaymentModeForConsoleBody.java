package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ChangePaymentModeForConsoleBody
 */
public class ChangePaymentModeForConsoleBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id_list")

    private List<String> instanceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_type")

    private String engineType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_mode")

    private Boolean paymentMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_full_sql")

    private Boolean openFullSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_slow_sql")

    private Boolean openSlowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_dead_lock")

    private Boolean openDeadLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_lock_blocking")

    private Boolean openLockBlocking;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_transaction")

    private Boolean openTransaction;

    public ChangePaymentModeForConsoleBody withInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }

    public ChangePaymentModeForConsoleBody addInstanceIdListItem(String instanceIdListItem) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        this.instanceIdList.add(instanceIdListItem);
        return this;
    }

    public ChangePaymentModeForConsoleBody withInstanceIdList(Consumer<List<String>> instanceIdListSetter) {
        if (this.instanceIdList == null) {
            this.instanceIdList = new ArrayList<>();
        }
        instanceIdListSetter.accept(this.instanceIdList);
        return this;
    }

    /**
     * 实例ID列表
     * @return instanceIdList
     */
    public List<String> getInstanceIdList() {
        return instanceIdList;
    }

    public void setInstanceIdList(List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
    }

    public ChangePaymentModeForConsoleBody withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    /**
     * 引擎类型
     * @return engineType
     */
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public ChangePaymentModeForConsoleBody withPaymentMode(Boolean paymentMode) {
        this.paymentMode = paymentMode;
        return this;
    }

    /**
     * true: 设置为付费, false: 设置为免费
     * @return paymentMode
     */
    public Boolean getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(Boolean paymentMode) {
        this.paymentMode = paymentMode;
    }

    public ChangePaymentModeForConsoleBody withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ChangePaymentModeForConsoleBody withOpenFullSql(Boolean openFullSql) {
        this.openFullSql = openFullSql;
        return this;
    }

    /**
     * 是否打开全量SQL
     * @return openFullSql
     */
    public Boolean getOpenFullSql() {
        return openFullSql;
    }

    public void setOpenFullSql(Boolean openFullSql) {
        this.openFullSql = openFullSql;
    }

    public ChangePaymentModeForConsoleBody withOpenSlowSql(Boolean openSlowSql) {
        this.openSlowSql = openSlowSql;
        return this;
    }

    /**
     * 是否打开慢SQL
     * @return openSlowSql
     */
    public Boolean getOpenSlowSql() {
        return openSlowSql;
    }

    public void setOpenSlowSql(Boolean openSlowSql) {
        this.openSlowSql = openSlowSql;
    }

    public ChangePaymentModeForConsoleBody withOpenDeadLock(Boolean openDeadLock) {
        this.openDeadLock = openDeadLock;
        return this;
    }

    /**
     * 是否打开死锁分析
     * @return openDeadLock
     */
    public Boolean getOpenDeadLock() {
        return openDeadLock;
    }

    public void setOpenDeadLock(Boolean openDeadLock) {
        this.openDeadLock = openDeadLock;
    }

    public ChangePaymentModeForConsoleBody withOpenLockBlocking(Boolean openLockBlocking) {
        this.openLockBlocking = openLockBlocking;
        return this;
    }

    /**
     * 是否打开锁阻塞
     * @return openLockBlocking
     */
    public Boolean getOpenLockBlocking() {
        return openLockBlocking;
    }

    public void setOpenLockBlocking(Boolean openLockBlocking) {
        this.openLockBlocking = openLockBlocking;
    }

    public ChangePaymentModeForConsoleBody withOpenTransaction(Boolean openTransaction) {
        this.openTransaction = openTransaction;
        return this;
    }

    /**
     * 是否打开历史事务
     * @return openTransaction
     */
    public Boolean getOpenTransaction() {
        return openTransaction;
    }

    public void setOpenTransaction(Boolean openTransaction) {
        this.openTransaction = openTransaction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangePaymentModeForConsoleBody that = (ChangePaymentModeForConsoleBody) obj;
        return Objects.equals(this.instanceIdList, that.instanceIdList)
            && Objects.equals(this.engineType, that.engineType) && Objects.equals(this.paymentMode, that.paymentMode)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.openFullSql, that.openFullSql) && Objects.equals(this.openSlowSql, that.openSlowSql)
            && Objects.equals(this.openDeadLock, that.openDeadLock)
            && Objects.equals(this.openLockBlocking, that.openLockBlocking)
            && Objects.equals(this.openTransaction, that.openTransaction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceIdList,
            engineType,
            paymentMode,
            resourceType,
            openFullSql,
            openSlowSql,
            openDeadLock,
            openLockBlocking,
            openTransaction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangePaymentModeForConsoleBody {\n");
        sb.append("    instanceIdList: ").append(toIndentedString(instanceIdList)).append("\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    openFullSql: ").append(toIndentedString(openFullSql)).append("\n");
        sb.append("    openSlowSql: ").append(toIndentedString(openSlowSql)).append("\n");
        sb.append("    openDeadLock: ").append(toIndentedString(openDeadLock)).append("\n");
        sb.append("    openLockBlocking: ").append(toIndentedString(openLockBlocking)).append("\n");
        sb.append("    openTransaction: ").append(toIndentedString(openTransaction)).append("\n");
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

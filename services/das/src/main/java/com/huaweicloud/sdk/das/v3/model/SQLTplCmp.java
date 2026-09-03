package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL模板对比
 */
public class SQLTplCmp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_tpl_dto1")

    private TplCmp sqlTplDto1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_tpl_dto2")

    private TplCmp sqlTplDto2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new")

    private Boolean _new;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_increase")

    private Boolean executeTimeIncrease;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_increase")

    private Boolean lockWaitIncrease;

    public SQLTplCmp withSqlTplDto1(TplCmp sqlTplDto1) {
        this.sqlTplDto1 = sqlTplDto1;
        return this;
    }

    public SQLTplCmp withSqlTplDto1(Consumer<TplCmp> sqlTplDto1Setter) {
        if (this.sqlTplDto1 == null) {
            this.sqlTplDto1 = new TplCmp();
            sqlTplDto1Setter.accept(this.sqlTplDto1);
        }

        return this;
    }

    /**
     * Get sqlTplDto1
     * @return sqlTplDto1
     */
    public TplCmp getSqlTplDto1() {
        return sqlTplDto1;
    }

    public void setSqlTplDto1(TplCmp sqlTplDto1) {
        this.sqlTplDto1 = sqlTplDto1;
    }

    public SQLTplCmp withSqlTplDto2(TplCmp sqlTplDto2) {
        this.sqlTplDto2 = sqlTplDto2;
        return this;
    }

    public SQLTplCmp withSqlTplDto2(Consumer<TplCmp> sqlTplDto2Setter) {
        if (this.sqlTplDto2 == null) {
            this.sqlTplDto2 = new TplCmp();
            sqlTplDto2Setter.accept(this.sqlTplDto2);
        }

        return this;
    }

    /**
     * Get sqlTplDto2
     * @return sqlTplDto2
     */
    public TplCmp getSqlTplDto2() {
        return sqlTplDto2;
    }

    public void setSqlTplDto2(TplCmp sqlTplDto2) {
        this.sqlTplDto2 = sqlTplDto2;
    }

    public SQLTplCmp withNew(Boolean _new) {
        this._new = _new;
        return this;
    }

    /**
     * 是否为新增数据
     * @return _new
     */
    public Boolean getNew() {
        return _new;
    }

    public void setNew(Boolean _new) {
        this._new = _new;
    }

    public SQLTplCmp withExecuteTimeIncrease(Boolean executeTimeIncrease) {
        this.executeTimeIncrease = executeTimeIncrease;
        return this;
    }

    /**
     * 是否有执行时间增长
     * @return executeTimeIncrease
     */
    public Boolean getExecuteTimeIncrease() {
        return executeTimeIncrease;
    }

    public void setExecuteTimeIncrease(Boolean executeTimeIncrease) {
        this.executeTimeIncrease = executeTimeIncrease;
    }

    public SQLTplCmp withLockWaitIncrease(Boolean lockWaitIncrease) {
        this.lockWaitIncrease = lockWaitIncrease;
        return this;
    }

    /**
     * 是否有锁等待时间增长
     * @return lockWaitIncrease
     */
    public Boolean getLockWaitIncrease() {
        return lockWaitIncrease;
    }

    public void setLockWaitIncrease(Boolean lockWaitIncrease) {
        this.lockWaitIncrease = lockWaitIncrease;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SQLTplCmp that = (SQLTplCmp) obj;
        return Objects.equals(this.sqlTplDto1, that.sqlTplDto1) && Objects.equals(this.sqlTplDto2, that.sqlTplDto2)
            && Objects.equals(this._new, that._new)
            && Objects.equals(this.executeTimeIncrease, that.executeTimeIncrease)
            && Objects.equals(this.lockWaitIncrease, that.lockWaitIncrease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlTplDto1, sqlTplDto2, _new, executeTimeIncrease, lockWaitIncrease);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SQLTplCmp {\n");
        sb.append("    sqlTplDto1: ").append(toIndentedString(sqlTplDto1)).append("\n");
        sb.append("    sqlTplDto2: ").append(toIndentedString(sqlTplDto2)).append("\n");
        sb.append("    _new: ").append(toIndentedString(_new)).append("\n");
        sb.append("    executeTimeIncrease: ").append(toIndentedString(executeTimeIncrease)).append("\n");
        sb.append("    lockWaitIncrease: ").append(toIndentedString(lockWaitIncrease)).append("\n");
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

package com.huaweicloud.sdk.das.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.InnodbLock;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InnodbTrx
 */
public class InnodbTrx  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_id")
    
    private String trxId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_state")
    
    private String trxState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_started")
    
    private String trxStarted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_wait_started")
    
    private String trxWaitStarted;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_mysql_thread_id")
    
    private String trxMysqlThreadId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_query")
    
    private String trxQuery;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_tables_locked")
    
    private String trxTablesLocked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_rows_locked")
    
    private String trxRowsLocked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_rows_modified")
    
    private String trxRowsModified;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trx_isolation_level")
    
    private String trxIsolationLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="innodb_wait_locks")
    
    private List<InnodbLock> innodbWaitLocks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="innodb_hold_locks")
    
    private List<InnodbLock> innodbHoldLocks = null;
    
    public InnodbTrx withTrxId(String trxId) {
        this.trxId = trxId;
        return this;
    }

    


    /**
     * 事务ID
     * @return trxId
     */
    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    

    public InnodbTrx withTrxState(String trxState) {
        this.trxState = trxState;
        return this;
    }

    


    /**
     * 事务状态
     * @return trxState
     */
    public String getTrxState() {
        return trxState;
    }

    public void setTrxState(String trxState) {
        this.trxState = trxState;
    }

    

    public InnodbTrx withTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
        return this;
    }

    


    /**
     * 事务开始时间
     * @return trxStarted
     */
    public String getTrxStarted() {
        return trxStarted;
    }

    public void setTrxStarted(String trxStarted) {
        this.trxStarted = trxStarted;
    }

    

    public InnodbTrx withTrxWaitStarted(String trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
        return this;
    }

    


    /**
     * 事务等待开始时间
     * @return trxWaitStarted
     */
    public String getTrxWaitStarted() {
        return trxWaitStarted;
    }

    public void setTrxWaitStarted(String trxWaitStarted) {
        this.trxWaitStarted = trxWaitStarted;
    }

    

    public InnodbTrx withTrxMysqlThreadId(String trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
        return this;
    }

    


    /**
     * 会话ID，同ListProcesses接口返回的id。
     * @return trxMysqlThreadId
     */
    public String getTrxMysqlThreadId() {
        return trxMysqlThreadId;
    }

    public void setTrxMysqlThreadId(String trxMysqlThreadId) {
        this.trxMysqlThreadId = trxMysqlThreadId;
    }

    

    public InnodbTrx withTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
        return this;
    }

    


    /**
     * 事务运行的SQL语句
     * @return trxQuery
     */
    public String getTrxQuery() {
        return trxQuery;
    }

    public void setTrxQuery(String trxQuery) {
        this.trxQuery = trxQuery;
    }

    

    public InnodbTrx withTrxTablesLocked(String trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
        return this;
    }

    


    /**
     * 加行锁的表数量
     * @return trxTablesLocked
     */
    public String getTrxTablesLocked() {
        return trxTablesLocked;
    }

    public void setTrxTablesLocked(String trxTablesLocked) {
        this.trxTablesLocked = trxTablesLocked;
    }

    

    public InnodbTrx withTrxRowsLocked(String trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
        return this;
    }

    


    /**
     * 锁定的行数量（近似值）
     * @return trxRowsLocked
     */
    public String getTrxRowsLocked() {
        return trxRowsLocked;
    }

    public void setTrxRowsLocked(String trxRowsLocked) {
        this.trxRowsLocked = trxRowsLocked;
    }

    

    public InnodbTrx withTrxRowsModified(String trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
        return this;
    }

    


    /**
     * 事务插入或者修改的行数
     * @return trxRowsModified
     */
    public String getTrxRowsModified() {
        return trxRowsModified;
    }

    public void setTrxRowsModified(String trxRowsModified) {
        this.trxRowsModified = trxRowsModified;
    }

    

    public InnodbTrx withTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
        return this;
    }

    


    /**
     * 隔离级别
     * @return trxIsolationLevel
     */
    public String getTrxIsolationLevel() {
        return trxIsolationLevel;
    }

    public void setTrxIsolationLevel(String trxIsolationLevel) {
        this.trxIsolationLevel = trxIsolationLevel;
    }

    

    public InnodbTrx withInnodbWaitLocks(List<InnodbLock> innodbWaitLocks) {
        this.innodbWaitLocks = innodbWaitLocks;
        return this;
    }

    
    public InnodbTrx addInnodbWaitLocksItem(InnodbLock innodbWaitLocksItem) {
        if(this.innodbWaitLocks == null) {
            this.innodbWaitLocks = new ArrayList<>();
        }
        this.innodbWaitLocks.add(innodbWaitLocksItem);
        return this;
    }

    public InnodbTrx withInnodbWaitLocks(Consumer<List<InnodbLock>> innodbWaitLocksSetter) {
        if(this.innodbWaitLocks == null) {
            this.innodbWaitLocks = new ArrayList<>();
        }
        innodbWaitLocksSetter.accept(this.innodbWaitLocks);
        return this;
    }

    /**
     * 等待锁信息
     * @return innodbWaitLocks
     */
    public List<InnodbLock> getInnodbWaitLocks() {
        return innodbWaitLocks;
    }

    public void setInnodbWaitLocks(List<InnodbLock> innodbWaitLocks) {
        this.innodbWaitLocks = innodbWaitLocks;
    }

    

    public InnodbTrx withInnodbHoldLocks(List<InnodbLock> innodbHoldLocks) {
        this.innodbHoldLocks = innodbHoldLocks;
        return this;
    }

    
    public InnodbTrx addInnodbHoldLocksItem(InnodbLock innodbHoldLocksItem) {
        if(this.innodbHoldLocks == null) {
            this.innodbHoldLocks = new ArrayList<>();
        }
        this.innodbHoldLocks.add(innodbHoldLocksItem);
        return this;
    }

    public InnodbTrx withInnodbHoldLocks(Consumer<List<InnodbLock>> innodbHoldLocksSetter) {
        if(this.innodbHoldLocks == null) {
            this.innodbHoldLocks = new ArrayList<>();
        }
        innodbHoldLocksSetter.accept(this.innodbHoldLocks);
        return this;
    }

    /**
     * 持有锁信息
     * @return innodbHoldLocks
     */
    public List<InnodbLock> getInnodbHoldLocks() {
        return innodbHoldLocks;
    }

    public void setInnodbHoldLocks(List<InnodbLock> innodbHoldLocks) {
        this.innodbHoldLocks = innodbHoldLocks;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InnodbTrx innodbTrx = (InnodbTrx) o;
        return Objects.equals(this.trxId, innodbTrx.trxId) &&
            Objects.equals(this.trxState, innodbTrx.trxState) &&
            Objects.equals(this.trxStarted, innodbTrx.trxStarted) &&
            Objects.equals(this.trxWaitStarted, innodbTrx.trxWaitStarted) &&
            Objects.equals(this.trxMysqlThreadId, innodbTrx.trxMysqlThreadId) &&
            Objects.equals(this.trxQuery, innodbTrx.trxQuery) &&
            Objects.equals(this.trxTablesLocked, innodbTrx.trxTablesLocked) &&
            Objects.equals(this.trxRowsLocked, innodbTrx.trxRowsLocked) &&
            Objects.equals(this.trxRowsModified, innodbTrx.trxRowsModified) &&
            Objects.equals(this.trxIsolationLevel, innodbTrx.trxIsolationLevel) &&
            Objects.equals(this.innodbWaitLocks, innodbTrx.innodbWaitLocks) &&
            Objects.equals(this.innodbHoldLocks, innodbTrx.innodbHoldLocks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trxId, trxState, trxStarted, trxWaitStarted, trxMysqlThreadId, trxQuery, trxTablesLocked, trxRowsLocked, trxRowsModified, trxIsolationLevel, innodbWaitLocks, innodbHoldLocks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnodbTrx {\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    trxState: ").append(toIndentedString(trxState)).append("\n");
        sb.append("    trxStarted: ").append(toIndentedString(trxStarted)).append("\n");
        sb.append("    trxWaitStarted: ").append(toIndentedString(trxWaitStarted)).append("\n");
        sb.append("    trxMysqlThreadId: ").append(toIndentedString(trxMysqlThreadId)).append("\n");
        sb.append("    trxQuery: ").append(toIndentedString(trxQuery)).append("\n");
        sb.append("    trxTablesLocked: ").append(toIndentedString(trxTablesLocked)).append("\n");
        sb.append("    trxRowsLocked: ").append(toIndentedString(trxRowsLocked)).append("\n");
        sb.append("    trxRowsModified: ").append(toIndentedString(trxRowsModified)).append("\n");
        sb.append("    trxIsolationLevel: ").append(toIndentedString(trxIsolationLevel)).append("\n");
        sb.append("    innodbWaitLocks: ").append(toIndentedString(innodbWaitLocks)).append("\n");
        sb.append("    innodbHoldLocks: ").append(toIndentedString(innodbHoldLocks)).append("\n");
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


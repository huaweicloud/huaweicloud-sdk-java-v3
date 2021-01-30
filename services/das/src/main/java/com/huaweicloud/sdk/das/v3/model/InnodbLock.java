package com.huaweicloud.sdk.das.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * InnodbLock
 */
public class InnodbLock  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_id")
    
    private String lockId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_trx_id")
    
    private String lockTrxId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_mode")
    
    private String lockMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_type")
    
    private String lockType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_table")
    
    private String lockTable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_index")
    
    private String lockIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_space")
    
    private String lockSpace;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_page")
    
    private String lockPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_rec")
    
    private String lockRec;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lock_data")
    
    private String lockData;

    public InnodbLock withLockId(String lockId) {
        this.lockId = lockId;
        return this;
    }

    


    /**
     * 锁ID
     * @return lockId
     */
    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public InnodbLock withLockTrxId(String lockTrxId) {
        this.lockTrxId = lockTrxId;
        return this;
    }

    


    /**
     * 事务ID
     * @return lockTrxId
     */
    public String getLockTrxId() {
        return lockTrxId;
    }

    public void setLockTrxId(String lockTrxId) {
        this.lockTrxId = lockTrxId;
    }

    public InnodbLock withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    


    /**
     * 锁模式，取值为S[,GAP], X[,GAP], IS[,GAP], IX[,GAP], AUTO_INC, and UNKNOWN。
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public InnodbLock withLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }

    


    /**
     * 锁类型，取值为RECORD或TABLE。RECORD为行锁, TABLE为表锁
     * @return lockType
     */
    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public InnodbLock withLockTable(String lockTable) {
        this.lockTable = lockTable;
        return this;
    }

    


    /**
     * 加锁的表
     * @return lockTable
     */
    public String getLockTable() {
        return lockTable;
    }

    public void setLockTable(String lockTable) {
        this.lockTable = lockTable;
    }

    public InnodbLock withLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
        return this;
    }

    


    /**
     * 如果是lock_type='RECORD' 行级锁 ,为锁住的索引，如果是表锁为null
     * @return lockIndex
     */
    public String getLockIndex() {
        return lockIndex;
    }

    public void setLockIndex(String lockIndex) {
        this.lockIndex = lockIndex;
    }

    public InnodbLock withLockSpace(String lockSpace) {
        this.lockSpace = lockSpace;
        return this;
    }

    


    /**
     * 如果是lock_type='RECORD' 行级锁 ,为锁住的索引，如果是表锁为null
     * @return lockSpace
     */
    public String getLockSpace() {
        return lockSpace;
    }

    public void setLockSpace(String lockSpace) {
        this.lockSpace = lockSpace;
    }

    public InnodbLock withLockPage(String lockPage) {
        this.lockPage = lockPage;
        return this;
    }

    


    /**
     * 如果是lock_type='RECORD' 行级锁 ,为锁住的页号，如果是表锁为null
     * @return lockPage
     */
    public String getLockPage() {
        return lockPage;
    }

    public void setLockPage(String lockPage) {
        this.lockPage = lockPage;
    }

    public InnodbLock withLockRec(String lockRec) {
        this.lockRec = lockRec;
        return this;
    }

    


    /**
     * 如果是lock_type='RECORD' 行级锁 ,为锁住的堆号，如果是表锁为null
     * @return lockRec
     */
    public String getLockRec() {
        return lockRec;
    }

    public void setLockRec(String lockRec) {
        this.lockRec = lockRec;
    }

    public InnodbLock withLockData(String lockData) {
        this.lockData = lockData;
        return this;
    }

    


    /**
     * 事务锁住的主键值，若是表锁，则该值为null
     * @return lockData
     */
    public String getLockData() {
        return lockData;
    }

    public void setLockData(String lockData) {
        this.lockData = lockData;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InnodbLock innodbLock = (InnodbLock) o;
        return Objects.equals(this.lockId, innodbLock.lockId) &&
            Objects.equals(this.lockTrxId, innodbLock.lockTrxId) &&
            Objects.equals(this.lockMode, innodbLock.lockMode) &&
            Objects.equals(this.lockType, innodbLock.lockType) &&
            Objects.equals(this.lockTable, innodbLock.lockTable) &&
            Objects.equals(this.lockIndex, innodbLock.lockIndex) &&
            Objects.equals(this.lockSpace, innodbLock.lockSpace) &&
            Objects.equals(this.lockPage, innodbLock.lockPage) &&
            Objects.equals(this.lockRec, innodbLock.lockRec) &&
            Objects.equals(this.lockData, innodbLock.lockData);
    }
    @Override
    public int hashCode() {
        return Objects.hash(lockId, lockTrxId, lockMode, lockType, lockTable, lockIndex, lockSpace, lockPage, lockRec, lockData);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InnodbLock {\n");
        sb.append("    lockId: ").append(toIndentedString(lockId)).append("\n");
        sb.append("    lockTrxId: ").append(toIndentedString(lockTrxId)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    lockTable: ").append(toIndentedString(lockTable)).append("\n");
        sb.append("    lockIndex: ").append(toIndentedString(lockIndex)).append("\n");
        sb.append("    lockSpace: ").append(toIndentedString(lockSpace)).append("\n");
        sb.append("    lockPage: ").append(toIndentedString(lockPage)).append("\n");
        sb.append("    lockRec: ").append(toIndentedString(lockRec)).append("\n");
        sb.append("    lockData: ").append(toIndentedString(lockData)).append("\n");
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


package com.huaweicloud.sdk.das.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.das.v3.model.InnodbLockWaits;
import com.huaweicloud.sdk.das.v3.model.InnodbTrx;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListInnodbLocksResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="innodb_trx")
    
    private List<InnodbTrx> innodbTrx = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="innodb_lock_waits")
    
    private List<InnodbLockWaits> innodbLockWaits = null;
    
    public ListInnodbLocksResponse withInnodbTrx(List<InnodbTrx> innodbTrx) {
        this.innodbTrx = innodbTrx;
        return this;
    }

    
    public ListInnodbLocksResponse addInnodbTrxItem(InnodbTrx innodbTrxItem) {
        if(this.innodbTrx == null) {
            this.innodbTrx = new ArrayList<>();
        }
        this.innodbTrx.add(innodbTrxItem);
        return this;
    }

    public ListInnodbLocksResponse withInnodbTrx(Consumer<List<InnodbTrx>> innodbTrxSetter) {
        if(this.innodbTrx == null) {
            this.innodbTrx = new ArrayList<>();
        }
        innodbTrxSetter.accept(this.innodbTrx);
        return this;
    }

    /**
     * 当前持有或等待锁的事务信息
     * @return innodbTrx
     */
    public List<InnodbTrx> getInnodbTrx() {
        return innodbTrx;
    }

    public void setInnodbTrx(List<InnodbTrx> innodbTrx) {
        this.innodbTrx = innodbTrx;
    }

    

    public ListInnodbLocksResponse withInnodbLockWaits(List<InnodbLockWaits> innodbLockWaits) {
        this.innodbLockWaits = innodbLockWaits;
        return this;
    }

    
    public ListInnodbLocksResponse addInnodbLockWaitsItem(InnodbLockWaits innodbLockWaitsItem) {
        if(this.innodbLockWaits == null) {
            this.innodbLockWaits = new ArrayList<>();
        }
        this.innodbLockWaits.add(innodbLockWaitsItem);
        return this;
    }

    public ListInnodbLocksResponse withInnodbLockWaits(Consumer<List<InnodbLockWaits>> innodbLockWaitsSetter) {
        if(this.innodbLockWaits == null) {
            this.innodbLockWaits = new ArrayList<>();
        }
        innodbLockWaitsSetter.accept(this.innodbLockWaits);
        return this;
    }

    /**
     * 每个事务请求的锁以及阻塞该请求的锁的对应关系
     * @return innodbLockWaits
     */
    public List<InnodbLockWaits> getInnodbLockWaits() {
        return innodbLockWaits;
    }

    public void setInnodbLockWaits(List<InnodbLockWaits> innodbLockWaits) {
        this.innodbLockWaits = innodbLockWaits;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInnodbLocksResponse listInnodbLocksResponse = (ListInnodbLocksResponse) o;
        return Objects.equals(this.innodbTrx, listInnodbLocksResponse.innodbTrx) &&
            Objects.equals(this.innodbLockWaits, listInnodbLocksResponse.innodbLockWaits);
    }
    @Override
    public int hashCode() {
        return Objects.hash(innodbTrx, innodbLockWaits);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInnodbLocksResponse {\n");
        sb.append("    innodbTrx: ").append(toIndentedString(innodbTrx)).append("\n");
        sb.append("    innodbLockWaits: ").append(toIndentedString(innodbLockWaits)).append("\n");
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


package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.Auditlog;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAuditlogsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="auditlogs")
    
    private Auditlog auditlogs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    private Integer totalRecord;

    public ListAuditlogsResponse withAuditlogs(Auditlog auditlogs) {
        this.auditlogs = auditlogs;
        return this;
    }

    public ListAuditlogsResponse withAuditlogs(Consumer<Auditlog> auditlogsSetter) {
        if(this.auditlogs == null ){
            this.auditlogs = new Auditlog();
            auditlogsSetter.accept(this.auditlogs);
        }
        
        return this;
    }


    /**
     * Get auditlogs
     * @return auditlogs
     */
    public Auditlog getAuditlogs() {
        return auditlogs;
    }

    public void setAuditlogs(Auditlog auditlogs) {
        this.auditlogs = auditlogs;
    }

    

    public ListAuditlogsResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAuditlogsResponse listAuditlogsResponse = (ListAuditlogsResponse) o;
        return Objects.equals(this.auditlogs, listAuditlogsResponse.auditlogs) &&
            Objects.equals(this.totalRecord, listAuditlogsResponse.totalRecord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(auditlogs, totalRecord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAuditlogsResponse {\n");
        sb.append("    auditlogs: ").append(toIndentedString(auditlogs)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
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


package com.huaweicloud.sdk.projectman.v4.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.IssueRecordV4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListIssueRecordsV4Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_time")
    
    private String createdTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<IssueRecordV4> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListIssueRecordsV4Response withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 操作记录id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ListIssueRecordsV4Response withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ListIssueRecordsV4Response withRecords(List<IssueRecordV4> records) {
        this.records = records;
        return this;
    }

    
    public ListIssueRecordsV4Response addRecordsItem(IssueRecordV4 recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListIssueRecordsV4Response withRecords(Consumer<List<IssueRecordV4>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * Get records
     * @return records
     */
    public List<IssueRecordV4> getRecords() {
        return records;
    }

    public void setRecords(List<IssueRecordV4> records) {
        this.records = records;
    }

    public ListIssueRecordsV4Response withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 操作记录总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListIssueRecordsV4Response listIssueRecordsV4Response = (ListIssueRecordsV4Response) o;
        return Objects.equals(this.id, listIssueRecordsV4Response.id) &&
            Objects.equals(this.createdTime, listIssueRecordsV4Response.createdTime) &&
            Objects.equals(this.records, listIssueRecordsV4Response.records) &&
            Objects.equals(this.total, listIssueRecordsV4Response.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, createdTime, records, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListIssueRecordsV4Response {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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


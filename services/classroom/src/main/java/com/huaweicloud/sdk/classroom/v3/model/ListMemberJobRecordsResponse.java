package com.huaweicloud.sdk.classroom.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.classroom.v3.model.JobRecords;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListMemberJobRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="records")
    
    private List<JobRecords> records = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;

    public ListMemberJobRecordsResponse withRecords(List<JobRecords> records) {
        this.records = records;
        return this;
    }

    
    public ListMemberJobRecordsResponse addRecordsItem(JobRecords recordsItem) {
        if (this.records == null) {
            this.records = new ArrayList<>();
        }
        this.records.add(recordsItem);
        return this;
    }

    public ListMemberJobRecordsResponse withRecords(Consumer<List<JobRecords>> recordsSetter) {
        if(this.records == null ){
            this.records = new ArrayList<>();
        }
        recordsSetter.accept(this.records);
        return this;
    }

    /**
     * 习题提交列表信息
     * @return records
     */
    public List<JobRecords> getRecords() {
        return records;
    }

    public void setRecords(List<JobRecords> records) {
        this.records = records;
    }

    public ListMemberJobRecordsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 习题提交总次数
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
        ListMemberJobRecordsResponse listMemberJobRecordsResponse = (ListMemberJobRecordsResponse) o;
        return Objects.equals(this.records, listMemberJobRecordsResponse.records) &&
            Objects.equals(this.total, listMemberJobRecordsResponse.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(records, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMemberJobRecordsResponse {\n");
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


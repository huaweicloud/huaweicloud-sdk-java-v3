package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlErrorLogList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlErrorLogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_log_list")
    
    
    private List<MysqlErrorLogList> errorLogList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    
    private Integer totalRecord;

    public ListGaussMySqlErrorLogResponse withErrorLogList(List<MysqlErrorLogList> errorLogList) {
        this.errorLogList = errorLogList;
        return this;
    }

    
    public ListGaussMySqlErrorLogResponse addErrorLogListItem(MysqlErrorLogList errorLogListItem) {
        if(this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        this.errorLogList.add(errorLogListItem);
        return this;
    }

    public ListGaussMySqlErrorLogResponse withErrorLogList(Consumer<List<MysqlErrorLogList>> errorLogListSetter) {
        if(this.errorLogList == null) {
            this.errorLogList = new ArrayList<>();
        }
        errorLogListSetter.accept(this.errorLogList);
        return this;
    }

    /**
     * 错误日志具体信息。
     * @return errorLogList
     */
    public List<MysqlErrorLogList> getErrorLogList() {
        return errorLogList;
    }

    public void setErrorLogList(List<MysqlErrorLogList> errorLogList) {
        this.errorLogList = errorLogList;
    }

    

    public ListGaussMySqlErrorLogResponse withTotalRecord(Integer totalRecord) {
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
        ListGaussMySqlErrorLogResponse listGaussMySqlErrorLogResponse = (ListGaussMySqlErrorLogResponse) o;
        return Objects.equals(this.errorLogList, listGaussMySqlErrorLogResponse.errorLogList) &&
            Objects.equals(this.totalRecord, listGaussMySqlErrorLogResponse.totalRecord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorLogList, totalRecord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlErrorLogResponse {\n");
        sb.append("    errorLogList: ").append(toIndentedString(errorLogList)).append("\n");
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


package com.huaweicloud.sdk.dds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.DownloadSlowlogResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class DownloadSlowlogResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<DownloadSlowlogResult> list = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_record")
    
    private String totalRecord;

    public DownloadSlowlogResponse withList(List<DownloadSlowlogResult> list) {
        this.list = list;
        return this;
    }

    
    public DownloadSlowlogResponse addListItem(DownloadSlowlogResult listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public DownloadSlowlogResponse withList(Consumer<List<DownloadSlowlogResult>> listSetter) {
        if(this.list == null ){
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 具体信息。
     * @return list
     */
    public List<DownloadSlowlogResult> getList() {
        return list;
    }

    public void setList(List<DownloadSlowlogResult> list) {
        this.list = list;
    }

    public DownloadSlowlogResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 查询状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DownloadSlowlogResponse withTotalRecord(String totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalRecord
     */
    public String getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(String totalRecord) {
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
        DownloadSlowlogResponse downloadSlowlogResponse = (DownloadSlowlogResponse) o;
        return Objects.equals(this.list, downloadSlowlogResponse.list) &&
            Objects.equals(this.status, downloadSlowlogResponse.status) &&
            Objects.equals(this.totalRecord, downloadSlowlogResponse.totalRecord);
    }
    @Override
    public int hashCode() {
        return Objects.hash(list, status, totalRecord);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DownloadSlowlogResponse {\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


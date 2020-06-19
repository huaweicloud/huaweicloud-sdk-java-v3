package com.huaweicloud.sdk.dcs.v2.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.InstanceRestoreInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRestoreRecordsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="restore_record_response")
    
    private List<InstanceRestoreInfo> restoreRecordResponse = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_num")
    
    private Integer totalNum;

    public ListRestoreRecordsResponse withRestoreRecordResponse(List<InstanceRestoreInfo> restoreRecordResponse) {
        this.restoreRecordResponse = restoreRecordResponse;
        return this;
    }

    
    public ListRestoreRecordsResponse addRestoreRecordResponseItem(InstanceRestoreInfo restoreRecordResponseItem) {
        if (this.restoreRecordResponse == null) {
            this.restoreRecordResponse = new ArrayList<>();
        }
        this.restoreRecordResponse.add(restoreRecordResponseItem);
        return this;
    }

    public ListRestoreRecordsResponse withRestoreRecordResponse(Consumer<List<InstanceRestoreInfo>> restoreRecordResponseSetter) {
        if(this.restoreRecordResponse == null ){
            this.restoreRecordResponse = new ArrayList<>();
        }
        restoreRecordResponseSetter.accept(this.restoreRecordResponse);
        return this;
    }

    /**
     * 实例恢复记录的详情数组。
     * @return restoreRecordResponse
     */
    public List<InstanceRestoreInfo> getRestoreRecordResponse() {
        return restoreRecordResponse;
    }

    public void setRestoreRecordResponse(List<InstanceRestoreInfo> restoreRecordResponse) {
        this.restoreRecordResponse = restoreRecordResponse;
    }

    public ListRestoreRecordsResponse withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    


    /**
     * 返回记录数。
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRestoreRecordsResponse listRestoreRecordsResponse = (ListRestoreRecordsResponse) o;
        return Objects.equals(this.restoreRecordResponse, listRestoreRecordsResponse.restoreRecordResponse) &&
            Objects.equals(this.totalNum, listRestoreRecordsResponse.totalNum);
    }
    @Override
    public int hashCode() {
        return Objects.hash(restoreRecordResponse, totalNum);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRestoreRecordsResponse {\n");
        sb.append("    restoreRecordResponse: ").append(toIndentedString(restoreRecordResponse)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
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


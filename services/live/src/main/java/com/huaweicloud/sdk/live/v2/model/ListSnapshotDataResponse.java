package com.huaweicloud.sdk.live.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v2.model.SnapshotData;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSnapshotDataResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot_list")
    
    private List<SnapshotData> snapshotList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Long total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    
    private String xRequestId;

    public ListSnapshotDataResponse withSnapshotList(List<SnapshotData> snapshotList) {
        this.snapshotList = snapshotList;
        return this;
    }

    
    public ListSnapshotDataResponse addSnapshotListItem(SnapshotData snapshotListItem) {
        if (this.snapshotList == null) {
            this.snapshotList = new ArrayList<>();
        }
        this.snapshotList.add(snapshotListItem);
        return this;
    }

    public ListSnapshotDataResponse withSnapshotList(Consumer<List<SnapshotData>> snapshotListSetter) {
        if(this.snapshotList == null ){
            this.snapshotList = new ArrayList<>();
        }
        snapshotListSetter.accept(this.snapshotList);
        return this;
    }

    /**
     * 采样数据列表。 
     * @return snapshotList
     */
    public List<SnapshotData> getSnapshotList() {
        return snapshotList;
    }

    public void setSnapshotList(List<SnapshotData> snapshotList) {
        this.snapshotList = snapshotList;
    }

    public ListSnapshotDataResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    


    /**
     * 指定时间区间内截图数量总和
     * minimum: 0
     * maximum: -1
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListSnapshotDataResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotDataResponse listSnapshotDataResponse = (ListSnapshotDataResponse) o;
        return Objects.equals(this.snapshotList, listSnapshotDataResponse.snapshotList) &&
            Objects.equals(this.total, listSnapshotDataResponse.total) &&
            Objects.equals(this.xRequestId, listSnapshotDataResponse.xRequestId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshotList, total, xRequestId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotDataResponse {\n");
        sb.append("    snapshotList: ").append(toIndentedString(snapshotList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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


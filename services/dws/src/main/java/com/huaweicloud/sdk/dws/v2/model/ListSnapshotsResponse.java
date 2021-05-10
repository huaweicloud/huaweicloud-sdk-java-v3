package com.huaweicloud.sdk.dws.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.Snapshots;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSnapshotsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots")
    
    private List<Snapshots> snapshots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;

    public ListSnapshotsResponse withSnapshots(List<Snapshots> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    
    public ListSnapshotsResponse addSnapshotsItem(Snapshots snapshotsItem) {
        if(this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListSnapshotsResponse withSnapshots(Consumer<List<Snapshots>> snapshotsSetter) {
        if(this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * 快照对象列表
     * @return snapshots
     */
    public List<Snapshots> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<Snapshots> snapshots) {
        this.snapshots = snapshots;
    }

    

    public ListSnapshotsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 快照对象列表总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotsResponse listSnapshotsResponse = (ListSnapshotsResponse) o;
        return Objects.equals(this.snapshots, listSnapshotsResponse.snapshots) &&
            Objects.equals(this.count, listSnapshotsResponse.count);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshots, count);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsResponse {\n");
        sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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


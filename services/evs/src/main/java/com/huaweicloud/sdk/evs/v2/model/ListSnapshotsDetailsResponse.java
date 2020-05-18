package com.huaweicloud.sdk.evs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.Link;
import com.huaweicloud.sdk.evs.v2.model.SnapshotList;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListSnapshotsDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots")
    
    private List<SnapshotList> snapshots = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshots_links")
    
    private List<Link> snapshotsLinks = null;
    
    public ListSnapshotsDetailsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 快照的总数量，不受limi参数的影响。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListSnapshotsDetailsResponse withSnapshots(List<SnapshotList> snapshots) {
        this.snapshots = snapshots;
        return this;
    }

    
    public ListSnapshotsDetailsResponse addSnapshotsItem(SnapshotList snapshotsItem) {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList<>();
        }
        this.snapshots.add(snapshotsItem);
        return this;
    }

    public ListSnapshotsDetailsResponse withSnapshots(Consumer<List<SnapshotList>> snapshotsSetter) {
        if(this.snapshots == null ){
            this.snapshots = new ArrayList<>();
        }
        snapshotsSetter.accept(this.snapshots);
        return this;
    }

    /**
     * 快照信息。
     * @return snapshots
     */
    public List<SnapshotList> getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(List<SnapshotList> snapshots) {
        this.snapshots = snapshots;
    }

    public ListSnapshotsDetailsResponse withSnapshotsLinks(List<Link> snapshotsLinks) {
        this.snapshotsLinks = snapshotsLinks;
        return this;
    }

    
    public ListSnapshotsDetailsResponse addSnapshotsLinksItem(Link snapshotsLinksItem) {
        if (this.snapshotsLinks == null) {
            this.snapshotsLinks = new ArrayList<>();
        }
        this.snapshotsLinks.add(snapshotsLinksItem);
        return this;
    }

    public ListSnapshotsDetailsResponse withSnapshotsLinks(Consumer<List<Link>> snapshotsLinksSetter) {
        if(this.snapshotsLinks == null ){
            this.snapshotsLinks = new ArrayList<>();
        }
        snapshotsLinksSetter.accept(this.snapshotsLinks);
        return this;
    }

    /**
     * 云硬盘快照列表查询位置标记。当查询时指定limit时会返回该字段，返回该字段表示本次查询只查出了部分云硬盘快照信息。
     * @return snapshotsLinks
     */
    public List<Link> getSnapshotsLinks() {
        return snapshotsLinks;
    }

    public void setSnapshotsLinks(List<Link> snapshotsLinks) {
        this.snapshotsLinks = snapshotsLinks;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSnapshotsDetailsResponse listSnapshotsDetailsResponse = (ListSnapshotsDetailsResponse) o;
        return Objects.equals(this.count, listSnapshotsDetailsResponse.count) &&
            Objects.equals(this.snapshots, listSnapshotsDetailsResponse.snapshots) &&
            Objects.equals(this.snapshotsLinks, listSnapshotsDetailsResponse.snapshotsLinks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, snapshots, snapshotsLinks);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSnapshotsDetailsResponse {\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    snapshots: ").append(toIndentedString(snapshots)).append("\n");
            sb.append("    snapshotsLinks: ").append(toIndentedString(snapshotsLinks)).append("\n");
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


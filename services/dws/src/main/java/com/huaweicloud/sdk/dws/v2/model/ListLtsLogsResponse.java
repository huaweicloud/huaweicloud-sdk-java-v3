package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLtsLogsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_status")

    private String accessStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lts_access_list")

    private List<LtslogInfo> ltsAccessList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListLtsLogsResponse withAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
        return this;
    }

    /**
     * **参数解释**： 日志开启状态。 **取值范围**： 不涉及。
     * @return accessStatus
     */
    public String getAccessStatus() {
        return accessStatus;
    }

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    public ListLtsLogsResponse withLtsAccessList(List<LtslogInfo> ltsAccessList) {
        this.ltsAccessList = ltsAccessList;
        return this;
    }

    public ListLtsLogsResponse addLtsAccessListItem(LtslogInfo ltsAccessListItem) {
        if (this.ltsAccessList == null) {
            this.ltsAccessList = new ArrayList<>();
        }
        this.ltsAccessList.add(ltsAccessListItem);
        return this;
    }

    public ListLtsLogsResponse withLtsAccessList(Consumer<List<LtslogInfo>> ltsAccessListSetter) {
        if (this.ltsAccessList == null) {
            this.ltsAccessList = new ArrayList<>();
        }
        ltsAccessListSetter.accept(this.ltsAccessList);
        return this;
    }

    /**
     * **参数解释**： LTS日志列表。 **取值范围**： 不涉及。
     * @return ltsAccessList
     */
    public List<LtslogInfo> getLtsAccessList() {
        return ltsAccessList;
    }

    public void setLtsAccessList(List<LtslogInfo> ltsAccessList) {
        this.ltsAccessList = ltsAccessList;
    }

    public ListLtsLogsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 总数量。 **取值范围**： 大于等于0。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLtsLogsResponse that = (ListLtsLogsResponse) obj;
        return Objects.equals(this.accessStatus, that.accessStatus)
            && Objects.equals(this.ltsAccessList, that.ltsAccessList) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessStatus, ltsAccessList, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsLogsResponse {\n");
        sb.append("    accessStatus: ").append(toIndentedString(accessStatus)).append("\n");
        sb.append("    ltsAccessList: ").append(toIndentedString(ltsAccessList)).append("\n");
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

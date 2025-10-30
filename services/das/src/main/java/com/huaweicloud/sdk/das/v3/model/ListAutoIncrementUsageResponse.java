package com.huaweicloud.sdk.das.v3.model;

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
public class ListAutoIncrementUsageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_increment_usage_list")

    private List<AutoIncrementUsageRespAutoIncrementUsageList> autoIncrementUsageList = null;

    public ListAutoIncrementUsageResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务执行状态。 取值：  值为“Running”，表示任务正在执行。  值为“Completed”，表示任务执行成功。  值为“Failed”，表示任务执行失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListAutoIncrementUsageResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListAutoIncrementUsageResponse withAutoIncrementUsageList(
        List<AutoIncrementUsageRespAutoIncrementUsageList> autoIncrementUsageList) {
        this.autoIncrementUsageList = autoIncrementUsageList;
        return this;
    }

    public ListAutoIncrementUsageResponse addAutoIncrementUsageListItem(
        AutoIncrementUsageRespAutoIncrementUsageList autoIncrementUsageListItem) {
        if (this.autoIncrementUsageList == null) {
            this.autoIncrementUsageList = new ArrayList<>();
        }
        this.autoIncrementUsageList.add(autoIncrementUsageListItem);
        return this;
    }

    public ListAutoIncrementUsageResponse withAutoIncrementUsageList(
        Consumer<List<AutoIncrementUsageRespAutoIncrementUsageList>> autoIncrementUsageListSetter) {
        if (this.autoIncrementUsageList == null) {
            this.autoIncrementUsageList = new ArrayList<>();
        }
        autoIncrementUsageListSetter.accept(this.autoIncrementUsageList);
        return this;
    }

    /**
     * 自增 ID 使用数据列表。
     * @return autoIncrementUsageList
     */
    public List<AutoIncrementUsageRespAutoIncrementUsageList> getAutoIncrementUsageList() {
        return autoIncrementUsageList;
    }

    public void setAutoIncrementUsageList(List<AutoIncrementUsageRespAutoIncrementUsageList> autoIncrementUsageList) {
        this.autoIncrementUsageList = autoIncrementUsageList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAutoIncrementUsageResponse that = (ListAutoIncrementUsageResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.total, that.total)
            && Objects.equals(this.autoIncrementUsageList, that.autoIncrementUsageList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, total, autoIncrementUsageList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAutoIncrementUsageResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    autoIncrementUsageList: ").append(toIndentedString(autoIncrementUsageList)).append("\n");
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

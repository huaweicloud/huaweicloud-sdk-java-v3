package com.huaweicloud.sdk.antiddos.v2.model;

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
public class ListDDosStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddosStatus")

    private List<DDosStatus> ddosStatus = null;

    public ListDDosStatusResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 弹性IP总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDDosStatusResponse withDdosStatus(List<DDosStatus> ddosStatus) {
        this.ddosStatus = ddosStatus;
        return this;
    }

    public ListDDosStatusResponse addDdosStatusItem(DDosStatus ddosStatusItem) {
        if (this.ddosStatus == null) {
            this.ddosStatus = new ArrayList<>();
        }
        this.ddosStatus.add(ddosStatusItem);
        return this;
    }

    public ListDDosStatusResponse withDdosStatus(Consumer<List<DDosStatus>> ddosStatusSetter) {
        if (this.ddosStatus == null) {
            this.ddosStatus = new ArrayList<>();
        }
        ddosStatusSetter.accept(this.ddosStatus);
        return this;
    }

    /**
     * 防护状态列表
     * @return ddosStatus
     */
    public List<DDosStatus> getDdosStatus() {
        return ddosStatus;
    }

    public void setDdosStatus(List<DDosStatus> ddosStatus) {
        this.ddosStatus = ddosStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDDosStatusResponse that = (ListDDosStatusResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.ddosStatus, that.ddosStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, ddosStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDDosStatusResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    ddosStatus: ").append(toIndentedString(ddosStatus)).append("\n");
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

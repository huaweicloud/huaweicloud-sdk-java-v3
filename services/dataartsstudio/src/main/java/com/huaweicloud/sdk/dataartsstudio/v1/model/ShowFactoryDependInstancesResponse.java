package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowFactoryDependInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_instances_info")

    private List<ShowFactoryDependInstancesRespDependInstancesInfo> dependInstancesInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ShowFactoryDependInstancesResponse withDependInstancesInfo(
        List<ShowFactoryDependInstancesRespDependInstancesInfo> dependInstancesInfo) {
        this.dependInstancesInfo = dependInstancesInfo;
        return this;
    }

    public ShowFactoryDependInstancesResponse addDependInstancesInfoItem(
        ShowFactoryDependInstancesRespDependInstancesInfo dependInstancesInfoItem) {
        if (this.dependInstancesInfo == null) {
            this.dependInstancesInfo = new ArrayList<>();
        }
        this.dependInstancesInfo.add(dependInstancesInfoItem);
        return this;
    }

    public ShowFactoryDependInstancesResponse withDependInstancesInfo(
        Consumer<List<ShowFactoryDependInstancesRespDependInstancesInfo>> dependInstancesInfoSetter) {
        if (this.dependInstancesInfo == null) {
            this.dependInstancesInfo = new ArrayList<>();
        }
        dependInstancesInfoSetter.accept(this.dependInstancesInfo);
        return this;
    }

    /**
     * 实例详情。
     * @return dependInstancesInfo
     */
    public List<ShowFactoryDependInstancesRespDependInstancesInfo> getDependInstancesInfo() {
        return dependInstancesInfo;
    }

    public void setDependInstancesInfo(List<ShowFactoryDependInstancesRespDependInstancesInfo> dependInstancesInfo) {
        this.dependInstancesInfo = dependInstancesInfo;
    }

    public ShowFactoryDependInstancesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 返回的实例总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryDependInstancesResponse that = (ShowFactoryDependInstancesResponse) obj;
        return Objects.equals(this.dependInstancesInfo, that.dependInstancesInfo)
            && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dependInstancesInfo, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryDependInstancesResponse {\n");
        sb.append("    dependInstancesInfo: ").append(toIndentedString(dependInstancesInfo)).append("\n");
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

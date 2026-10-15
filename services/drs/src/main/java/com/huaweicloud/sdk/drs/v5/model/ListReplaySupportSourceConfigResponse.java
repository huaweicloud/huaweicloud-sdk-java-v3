package com.huaweicloud.sdk.drs.v5.model;

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
public class ListReplaySupportSourceConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_list")

    private List<ReplaySourceConfigResp> configList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListReplaySupportSourceConfigResponse withConfigList(List<ReplaySourceConfigResp> configList) {
        this.configList = configList;
        return this;
    }

    public ListReplaySupportSourceConfigResponse addConfigListItem(ReplaySourceConfigResp configListItem) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        this.configList.add(configListItem);
        return this;
    }

    public ListReplaySupportSourceConfigResponse withConfigList(
        Consumer<List<ReplaySourceConfigResp>> configListSetter) {
        if (this.configList == null) {
            this.configList = new ArrayList<>();
        }
        configListSetter.accept(this.configList);
        return this;
    }

    /**
     * 流量回放源数据配置信息
     * @return configList
     */
    public List<ReplaySourceConfigResp> getConfigList() {
        return configList;
    }

    public void setConfigList(List<ReplaySourceConfigResp> configList) {
        this.configList = configList;
    }

    public ListReplaySupportSourceConfigResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReplaySupportSourceConfigResponse that = (ListReplaySupportSourceConfigResponse) obj;
        return Objects.equals(this.configList, that.configList) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configList, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReplaySupportSourceConfigResponse {\n");
        sb.append("    configList: ").append(toIndentedString(configList)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

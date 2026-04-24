package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListScreenRecordsTrafficLimitConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configs")

    private List<ScreenRecordsConfigResultReqConfigs> configs = null;

    public ListScreenRecordsTrafficLimitConfigResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListScreenRecordsTrafficLimitConfigResponse withConfigs(List<ScreenRecordsConfigResultReqConfigs> configs) {
        this.configs = configs;
        return this;
    }

    public ListScreenRecordsTrafficLimitConfigResponse addConfigsItem(ScreenRecordsConfigResultReqConfigs configsItem) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        this.configs.add(configsItem);
        return this;
    }

    public ListScreenRecordsTrafficLimitConfigResponse withConfigs(
        Consumer<List<ScreenRecordsConfigResultReqConfigs>> configsSetter) {
        if (this.configs == null) {
            this.configs = new ArrayList<>();
        }
        configsSetter.accept(this.configs);
        return this;
    }

    /**
     * 录屏记录。
     * @return configs
     */
    public List<ScreenRecordsConfigResultReqConfigs> getConfigs() {
        return configs;
    }

    public void setConfigs(List<ScreenRecordsConfigResultReqConfigs> configs) {
        this.configs = configs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScreenRecordsTrafficLimitConfigResponse that = (ListScreenRecordsTrafficLimitConfigResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.configs, that.configs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, configs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScreenRecordsTrafficLimitConfigResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    configs: ").append(toIndentedString(configs)).append("\n");
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

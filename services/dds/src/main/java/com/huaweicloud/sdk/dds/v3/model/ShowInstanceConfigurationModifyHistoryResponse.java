package com.huaweicloud.sdk.dds.v3.model;

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
public class ShowInstanceConfigurationModifyHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "histories")

    private List<ConfigurationModifyHistoryInfo> histories = null;

    public ShowInstanceConfigurationModifyHistoryResponse withHistories(
        List<ConfigurationModifyHistoryInfo> histories) {
        this.histories = histories;
        return this;
    }

    public ShowInstanceConfigurationModifyHistoryResponse addHistoriesItem(
        ConfigurationModifyHistoryInfo historiesItem) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ShowInstanceConfigurationModifyHistoryResponse withHistories(
        Consumer<List<ConfigurationModifyHistoryInfo>> historiesSetter) {
        if (this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 实例参数的修改历史列表。
     * @return histories
     */
    public List<ConfigurationModifyHistoryInfo> getHistories() {
        return histories;
    }

    public void setHistories(List<ConfigurationModifyHistoryInfo> histories) {
        this.histories = histories;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceConfigurationModifyHistoryResponse that = (ShowInstanceConfigurationModifyHistoryResponse) obj;
        return Objects.equals(this.histories, that.histories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(histories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceConfigurationModifyHistoryResponse {\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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

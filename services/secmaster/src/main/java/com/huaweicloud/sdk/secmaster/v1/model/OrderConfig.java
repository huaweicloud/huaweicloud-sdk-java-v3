package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订单配置项
 */
public class OrderConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_list")

    private List<UsageThreshold> thresholdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_config")

    private AlertConfig alertConfig;

    public OrderConfig withThresholdList(List<UsageThreshold> thresholdList) {
        this.thresholdList = thresholdList;
        return this;
    }

    public OrderConfig addThresholdListItem(UsageThreshold thresholdListItem) {
        if (this.thresholdList == null) {
            this.thresholdList = new ArrayList<>();
        }
        this.thresholdList.add(thresholdListItem);
        return this;
    }

    public OrderConfig withThresholdList(Consumer<List<UsageThreshold>> thresholdListSetter) {
        if (this.thresholdList == null) {
            this.thresholdList = new ArrayList<>();
        }
        thresholdListSetter.accept(this.thresholdList);
        return this;
    }

    /**
     * 阈值列表
     * @return thresholdList
     */
    public List<UsageThreshold> getThresholdList() {
        return thresholdList;
    }

    public void setThresholdList(List<UsageThreshold> thresholdList) {
        this.thresholdList = thresholdList;
    }

    public OrderConfig withAlertConfig(AlertConfig alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }

    public OrderConfig withAlertConfig(Consumer<AlertConfig> alertConfigSetter) {
        if (this.alertConfig == null) {
            this.alertConfig = new AlertConfig();
            alertConfigSetter.accept(this.alertConfig);
        }

        return this;
    }

    /**
     * Get alertConfig
     * @return alertConfig
     */
    public AlertConfig getAlertConfig() {
        return alertConfig;
    }

    public void setAlertConfig(AlertConfig alertConfig) {
        this.alertConfig = alertConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderConfig that = (OrderConfig) obj;
        return Objects.equals(this.thresholdList, that.thresholdList)
            && Objects.equals(this.alertConfig, that.alertConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thresholdList, alertConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderConfig {\n");
        sb.append("    thresholdList: ").append(toIndentedString(thresholdList)).append("\n");
        sb.append("    alertConfig: ").append(toIndentedString(alertConfig)).append("\n");
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

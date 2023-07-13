package com.huaweicloud.sdk.aom.v2.model;

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
public class ListAlarmRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholds")

    private List<QueryAlarmResult> thresholds = null;

    public ListAlarmRuleResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListAlarmRuleResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new MetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaData metaData) {
        this.metaData = metaData;
    }

    public ListAlarmRuleResponse withThresholds(List<QueryAlarmResult> thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public ListAlarmRuleResponse addThresholdsItem(QueryAlarmResult thresholdsItem) {
        if (this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        this.thresholds.add(thresholdsItem);
        return this;
    }

    public ListAlarmRuleResponse withThresholds(Consumer<List<QueryAlarmResult>> thresholdsSetter) {
        if (this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        thresholdsSetter.accept(this.thresholds);
        return this;
    }

    /**
     * Get thresholds
     * @return thresholds
     */
    public List<QueryAlarmResult> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<QueryAlarmResult> thresholds) {
        this.thresholds = thresholds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmRuleResponse that = (ListAlarmRuleResponse) obj;
        return Objects.equals(this.metaData, that.metaData) && Objects.equals(this.thresholds, that.thresholds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metaData, thresholds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmRuleResponse {\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
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

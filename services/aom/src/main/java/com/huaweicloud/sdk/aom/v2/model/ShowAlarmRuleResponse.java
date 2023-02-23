package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetaData;
import com.huaweicloud.sdk.aom.v2.model.QueryAlarmResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
@JacksonXmlRootElement(localName = "ShowAlarmRuleResponse")
public class ShowAlarmRuleResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="meta_data")
    
    @JacksonXmlProperty(localName = "meta_data")

    private MetaData metaData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="thresholds")
    
    @JacksonXmlProperty(localName = "thresholds")
    private List<QueryAlarmResult> thresholds = null;
    
    public ShowAlarmRuleResponse withMetaData(MetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ShowAlarmRuleResponse withMetaData(Consumer<MetaData> metaDataSetter) {
        if(this.metaData == null ){
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

    

    public ShowAlarmRuleResponse withThresholds(List<QueryAlarmResult> thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    
    public ShowAlarmRuleResponse addThresholdsItem(QueryAlarmResult thresholdsItem) {
        if(this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        this.thresholds.add(thresholdsItem);
        return this;
    }

    public ShowAlarmRuleResponse withThresholds(Consumer<List<QueryAlarmResult>> thresholdsSetter) {
        if(this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        thresholdsSetter.accept(this.thresholds);
        return this;
    }

    /**
     * 阈值规则列表。
     * @return thresholds
     */
    public List<QueryAlarmResult> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<QueryAlarmResult> thresholds) {
        this.thresholds = thresholds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAlarmRuleResponse showAlarmRuleResponse = (ShowAlarmRuleResponse) o;
        return Objects.equals(this.metaData, showAlarmRuleResponse.metaData) &&
            Objects.equals(this.thresholds, showAlarmRuleResponse.thresholds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(metaData, thresholds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlarmRuleResponse {\n");
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


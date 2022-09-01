package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.MetricDataPoints;
import com.huaweicloud.sdk.aom.v2.model.QuerySample;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询结果详细。
 */
public class SampleDataValue  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sample")
    
    @JacksonXmlProperty(localName = "sample")
    
    private QuerySample sample;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_points")
    
    @JacksonXmlProperty(localName = "data_points")
    
    private List<MetricDataPoints> dataPoints = null;
    
    public SampleDataValue withSample(QuerySample sample) {
        this.sample = sample;
        return this;
    }

    public SampleDataValue withSample(Consumer<QuerySample> sampleSetter) {
        if(this.sample == null ){
            this.sample = new QuerySample();
            sampleSetter.accept(this.sample);
        }
        
        return this;
    }


    /**
     * Get sample
     * @return sample
     */
    public QuerySample getSample() {
        return sample;
    }

    public void setSample(QuerySample sample) {
        this.sample = sample;
    }

    

    public SampleDataValue withDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
        return this;
    }

    
    public SampleDataValue addDataPointsItem(MetricDataPoints dataPointsItem) {
        if(this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        this.dataPoints.add(dataPointsItem);
        return this;
    }

    public SampleDataValue withDataPoints(Consumer<List<MetricDataPoints>> dataPointsSetter) {
        if(this.dataPoints == null) {
            this.dataPoints = new ArrayList<>();
        }
        dataPointsSetter.accept(this.dataPoints);
        return this;
    }

    /**
     * 时序数据。
     * @return dataPoints
     */
    public List<MetricDataPoints> getDataPoints() {
        return dataPoints;
    }

    public void setDataPoints(List<MetricDataPoints> dataPoints) {
        this.dataPoints = dataPoints;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SampleDataValue sampleDataValue = (SampleDataValue) o;
        return Objects.equals(this.sample, sampleDataValue.sample) &&
            Objects.equals(this.dataPoints, sampleDataValue.dataPoints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sample, dataPoints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SampleDataValue {\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    dataPoints: ").append(toIndentedString(dataPoints)).append("\n");
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


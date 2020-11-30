package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实时码率
 */
public class V2BitrateInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domain")
    
    private String publishDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data_list")
    
    private List<Long> dataList = null;
    
    public V2BitrateInfo withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    


    /**
     * 域名。
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public V2BitrateInfo withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * 应用名称。
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public V2BitrateInfo withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * 流名。
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public V2BitrateInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 采样开始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public V2BitrateInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 采样结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public V2BitrateInfo withDataList(List<Long> dataList) {
        this.dataList = dataList;
        return this;
    }

    
    public V2BitrateInfo addDataListItem(Long dataListItem) {
        if (this.dataList == null) {
            this.dataList = new ArrayList<>();
        }
        this.dataList.add(dataListItem);
        return this;
    }

    public V2BitrateInfo withDataList(Consumer<List<Long>> dataListSetter) {
        if(this.dataList == null ){
            this.dataList = new ArrayList<>();
        }
        dataListSetter.accept(this.dataList);
        return this;
    }

    /**
     * 数据
     * @return dataList
     */
    public List<Long> getDataList() {
        return dataList;
    }

    public void setDataList(List<Long> dataList) {
        this.dataList = dataList;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        V2BitrateInfo v2BitrateInfo = (V2BitrateInfo) o;
        return Objects.equals(this.publishDomain, v2BitrateInfo.publishDomain) &&
            Objects.equals(this.app, v2BitrateInfo.app) &&
            Objects.equals(this.stream, v2BitrateInfo.stream) &&
            Objects.equals(this.startTime, v2BitrateInfo.startTime) &&
            Objects.equals(this.endTime, v2BitrateInfo.endTime) &&
            Objects.equals(this.dataList, v2BitrateInfo.dataList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(publishDomain, app, stream, startTime, endTime, dataList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2BitrateInfo {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    dataList: ").append(toIndentedString(dataList)).append("\n");
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


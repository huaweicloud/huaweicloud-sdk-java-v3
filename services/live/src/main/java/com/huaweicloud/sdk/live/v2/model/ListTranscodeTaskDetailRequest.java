package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListTranscodeTaskDetailRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name_list")

    private List<String> streamNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public ListTranscodeTaskDetailRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名。 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ListTranscodeTaskDetailRequest withStreamNameList(List<String> streamNameList) {
        this.streamNameList = streamNameList;
        return this;
    }

    public ListTranscodeTaskDetailRequest addStreamNameListItem(String streamNameListItem) {
        if (this.streamNameList == null) {
            this.streamNameList = new ArrayList<>();
        }
        this.streamNameList.add(streamNameListItem);
        return this;
    }

    public ListTranscodeTaskDetailRequest withStreamNameList(Consumer<List<String>> streamNameListSetter) {
        if (this.streamNameList == null) {
            this.streamNameList = new ArrayList<>();
        }
        streamNameListSetter.accept(this.streamNameList);
        return this;
    }

    /**
     * 流名列表，以逗号分隔，最多支持查询100个流名。 如果不传入流名，则查询域名下所有转码流的数据。 
     * @return streamNameList
     */
    public List<String> getStreamNameList() {
        return streamNameList;
    }

    public void setStreamNameList(List<String> streamNameList) {
        this.streamNameList = streamNameList;
    }

    public ListTranscodeTaskDetailRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 起始时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期14天。  若参数为空，默认查询1天数据。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTranscodeTaskDetailRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间。日期格式按照ISO8601表示法，并使用UTC时间。  格式为：YYYY-MM-DDThh:mm:ssZ。最大查询跨度1天，最大查询周期14天。  若参数为空，默认为当前时间。结束时间需大于起始时间。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTranscodeTaskDetailRequest that = (ListTranscodeTaskDetailRequest) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.streamNameList, that.streamNameList)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, streamNameList, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTranscodeTaskDetailRequest {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    streamNameList: ").append(toIndentedString(streamNameList)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

package com.huaweicloud.sdk.dis.v2.model;

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
public class ListStreamsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_number")

    private Long totalNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_names")

    private List<String> streamNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_more_streams")

    private Boolean hasMoreStreams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_info_list")

    private List<StreamInfo> streamInfoList = null;

    public ListStreamsResponse withTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }

    /**
     * 当前租户所有通道数量。
     * @return totalNumber
     */
    public Long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public ListStreamsResponse withStreamNames(List<String> streamNames) {
        this.streamNames = streamNames;
        return this;
    }

    public ListStreamsResponse addStreamNamesItem(String streamNamesItem) {
        if (this.streamNames == null) {
            this.streamNames = new ArrayList<>();
        }
        this.streamNames.add(streamNamesItem);
        return this;
    }

    public ListStreamsResponse withStreamNames(Consumer<List<String>> streamNamesSetter) {
        if (this.streamNames == null) {
            this.streamNames = new ArrayList<>();
        }
        streamNamesSetter.accept(this.streamNames);
        return this;
    }

    /**
     * 满足当前请求条件的通道名称的列表。
     * @return streamNames
     */
    public List<String> getStreamNames() {
        return streamNames;
    }

    public void setStreamNames(List<String> streamNames) {
        this.streamNames = streamNames;
    }

    public ListStreamsResponse withHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
        return this;
    }

    /**
     * 是否还有更多满足条件的通道。  - true：是 - false：否
     * @return hasMoreStreams
     */
    public Boolean getHasMoreStreams() {
        return hasMoreStreams;
    }

    public void setHasMoreStreams(Boolean hasMoreStreams) {
        this.hasMoreStreams = hasMoreStreams;
    }

    public ListStreamsResponse withStreamInfoList(List<StreamInfo> streamInfoList) {
        this.streamInfoList = streamInfoList;
        return this;
    }

    public ListStreamsResponse addStreamInfoListItem(StreamInfo streamInfoListItem) {
        if (this.streamInfoList == null) {
            this.streamInfoList = new ArrayList<>();
        }
        this.streamInfoList.add(streamInfoListItem);
        return this;
    }

    public ListStreamsResponse withStreamInfoList(Consumer<List<StreamInfo>> streamInfoListSetter) {
        if (this.streamInfoList == null) {
            this.streamInfoList = new ArrayList<>();
        }
        streamInfoListSetter.accept(this.streamInfoList);
        return this;
    }

    /**
     * 通道列表详情。
     * @return streamInfoList
     */
    public List<StreamInfo> getStreamInfoList() {
        return streamInfoList;
    }

    public void setStreamInfoList(List<StreamInfo> streamInfoList) {
        this.streamInfoList = streamInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStreamsResponse that = (ListStreamsResponse) obj;
        return Objects.equals(this.totalNumber, that.totalNumber) && Objects.equals(this.streamNames, that.streamNames)
            && Objects.equals(this.hasMoreStreams, that.hasMoreStreams)
            && Objects.equals(this.streamInfoList, that.streamInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalNumber, streamNames, hasMoreStreams, streamInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStreamsResponse {\n");
        sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
        sb.append("    streamNames: ").append(toIndentedString(streamNames)).append("\n");
        sb.append("    hasMoreStreams: ").append(toIndentedString(hasMoreStreams)).append("\n");
        sb.append("    streamInfoList: ").append(toIndentedString(streamInfoList)).append("\n");
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

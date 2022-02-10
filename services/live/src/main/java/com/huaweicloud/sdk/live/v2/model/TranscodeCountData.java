package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** TranscodeCountData */
public class TranscodeCountData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_list")

    private List<TranscodeSpecCount> specList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public TranscodeCountData withSpecList(List<TranscodeSpecCount> specList) {
        this.specList = specList;
        return this;
    }

    public TranscodeCountData addSpecListItem(TranscodeSpecCount specListItem) {
        if (this.specList == null) {
            this.specList = new ArrayList<>();
        }
        this.specList.add(specListItem);
        return this;
    }

    public TranscodeCountData withSpecList(Consumer<List<TranscodeSpecCount>> specListSetter) {
        if (this.specList == null) {
            this.specList = new ArrayList<>();
        }
        specListSetter.accept(this.specList);
        return this;
    }

    /** 每个采样时间中的转码任务数信息。
     * 
     * @return specList */
    public List<TranscodeSpecCount> getSpecList() {
        return specList;
    }

    public void setSpecList(List<TranscodeSpecCount> specList) {
        this.specList = specList;
    }

    public TranscodeCountData withTime(String time) {
        this.time = time;
        return this;
    }

    /** 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ 。
     * 
     * @return time */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TranscodeCountData transcodeCountData = (TranscodeCountData) o;
        return Objects.equals(this.specList, transcodeCountData.specList)
            && Objects.equals(this.time, transcodeCountData.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specList, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeCountData {\n");
        sb.append("    specList: ").append(toIndentedString(specList)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

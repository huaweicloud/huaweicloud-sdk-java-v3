package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** TranscodeData */
public class TranscodeData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_list")

    private List<TranscodeSpec> specList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public TranscodeData withSpecList(List<TranscodeSpec> specList) {
        this.specList = specList;
        return this;
    }

    public TranscodeData addSpecListItem(TranscodeSpec specListItem) {
        if (this.specList == null) {
            this.specList = new ArrayList<>();
        }
        this.specList.add(specListItem);
        return this;
    }

    public TranscodeData withSpecList(Consumer<List<TranscodeSpec>> specListSetter) {
        if (this.specList == null) {
            this.specList = new ArrayList<>();
        }
        specListSetter.accept(this.specList);
        return this;
    }

    /** 每个采样时间中的转码时长信息。
     * 
     * @return specList */
    public List<TranscodeSpec> getSpecList() {
        return specList;
    }

    public void setSpecList(List<TranscodeSpec> specList) {
        this.specList = specList;
    }

    public TranscodeData withTime(String time) {
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
        TranscodeData transcodeData = (TranscodeData) o;
        return Objects.equals(this.specList, transcodeData.specList) && Objects.equals(this.time, transcodeData.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specList, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeData {\n");
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

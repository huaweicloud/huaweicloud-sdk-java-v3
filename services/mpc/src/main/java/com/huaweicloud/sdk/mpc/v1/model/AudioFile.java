package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** AudioFile */
public class AudioFile {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracks_info")

    private List<TracksInfo> tracksInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private ObsObjInfo input;

    public AudioFile withTracksInfo(List<TracksInfo> tracksInfo) {
        this.tracksInfo = tracksInfo;
        return this;
    }

    public AudioFile addTracksInfoItem(TracksInfo tracksInfoItem) {
        if (this.tracksInfo == null) {
            this.tracksInfo = new ArrayList<>();
        }
        this.tracksInfo.add(tracksInfoItem);
        return this;
    }

    public AudioFile withTracksInfo(Consumer<List<TracksInfo>> tracksInfoSetter) {
        if (this.tracksInfo == null) {
            this.tracksInfo = new ArrayList<>();
        }
        tracksInfoSetter.accept(this.tracksInfo);
        return this;
    }

    /** 音轨信息
     * 
     * @return tracksInfo */
    public List<TracksInfo> getTracksInfo() {
        return tracksInfo;
    }

    public void setTracksInfo(List<TracksInfo> tracksInfo) {
        this.tracksInfo = tracksInfo;
    }

    public AudioFile withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public AudioFile withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /** Get input
     * 
     * @return input */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioFile audioFile = (AudioFile) o;
        return Objects.equals(this.tracksInfo, audioFile.tracksInfo) && Objects.equals(this.input, audioFile.input);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracksInfo, input);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioFile {\n");
        sb.append("    tracksInfo: ").append(toIndentedString(tracksInfo)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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

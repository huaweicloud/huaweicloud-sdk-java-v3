package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** MultiAudio */
public class MultiAudio {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracks_info")

    private List<TracksInfo> tracksInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_files")

    private List<AudioFile> audioFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_language")

    private String defaultLanguage;

    public MultiAudio withTracksInfo(List<TracksInfo> tracksInfo) {
        this.tracksInfo = tracksInfo;
        return this;
    }

    public MultiAudio addTracksInfoItem(TracksInfo tracksInfoItem) {
        if (this.tracksInfo == null) {
            this.tracksInfo = new ArrayList<>();
        }
        this.tracksInfo.add(tracksInfoItem);
        return this;
    }

    public MultiAudio withTracksInfo(Consumer<List<TracksInfo>> tracksInfoSetter) {
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

    public MultiAudio withAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
        return this;
    }

    public MultiAudio addAudioFilesItem(AudioFile audioFilesItem) {
        if (this.audioFiles == null) {
            this.audioFiles = new ArrayList<>();
        }
        this.audioFiles.add(audioFilesItem);
        return this;
    }

    public MultiAudio withAudioFiles(Consumer<List<AudioFile>> audioFilesSetter) {
        if (this.audioFiles == null) {
            this.audioFiles = new ArrayList<>();
        }
        audioFilesSetter.accept(this.audioFiles);
        return this;
    }

    /** 音频文件
     * 
     * @return audioFiles */
    public List<AudioFile> getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(List<AudioFile> audioFiles) {
        this.audioFiles = audioFiles;
    }

    public MultiAudio withDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
        return this;
    }

    /** 默认语言
     * 
     * @return defaultLanguage */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiAudio multiAudio = (MultiAudio) o;
        return Objects.equals(this.tracksInfo, multiAudio.tracksInfo)
            && Objects.equals(this.audioFiles, multiAudio.audioFiles)
            && Objects.equals(this.defaultLanguage, multiAudio.defaultLanguage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracksInfo, audioFiles, defaultLanguage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiAudio {\n");
        sb.append("    tracksInfo: ").append(toIndentedString(tracksInfo)).append("\n");
        sb.append("    audioFiles: ").append(toIndentedString(audioFiles)).append("\n");
        sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
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

package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TranscodeDetail
 */
public class TranscodeDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multitask_info")

    private List<MultiTaskInfo> multitaskInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_file")

    private SourceInfo inputFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replace_sub_index")

    private List<String> replaceSubIndex = null;

    public TranscodeDetail withMultitaskInfo(List<MultiTaskInfo> multitaskInfo) {
        this.multitaskInfo = multitaskInfo;
        return this;
    }

    public TranscodeDetail addMultitaskInfoItem(MultiTaskInfo multitaskInfoItem) {
        if (this.multitaskInfo == null) {
            this.multitaskInfo = new ArrayList<>();
        }
        this.multitaskInfo.add(multitaskInfoItem);
        return this;
    }

    public TranscodeDetail withMultitaskInfo(Consumer<List<MultiTaskInfo>> multitaskInfoSetter) {
        if (this.multitaskInfo == null) {
            this.multitaskInfo = new ArrayList<>();
        }
        multitaskInfoSetter.accept(this.multitaskInfo);
        return this;
    }

    /**
     * 一进多出情况下部分转码失败的情况。 
     * @return multitaskInfo
     */
    public List<MultiTaskInfo> getMultitaskInfo() {
        return multitaskInfo;
    }

    public void setMultitaskInfo(List<MultiTaskInfo> multitaskInfo) {
        this.multitaskInfo = multitaskInfo;
    }

    public TranscodeDetail withInputFile(SourceInfo inputFile) {
        this.inputFile = inputFile;
        return this;
    }

    public TranscodeDetail withInputFile(Consumer<SourceInfo> inputFileSetter) {
        if (this.inputFile == null) {
            this.inputFile = new SourceInfo();
            inputFileSetter.accept(this.inputFile);
        }

        return this;
    }

    /**
     * Get inputFile
     * @return inputFile
     */
    public SourceInfo getInputFile() {
        return inputFile;
    }

    public void setInputFile(SourceInfo inputFile) {
        this.inputFile = inputFile;
    }

    public TranscodeDetail withReplaceSubIndex(List<String> replaceSubIndex) {
        this.replaceSubIndex = replaceSubIndex;
        return this;
    }

    public TranscodeDetail addReplaceSubIndexItem(String replaceSubIndexItem) {
        if (this.replaceSubIndex == null) {
            this.replaceSubIndex = new ArrayList<>();
        }
        this.replaceSubIndex.add(replaceSubIndexItem);
        return this;
    }

    public TranscodeDetail withReplaceSubIndex(Consumer<List<String>> replaceSubIndexSetter) {
        if (this.replaceSubIndex == null) {
            this.replaceSubIndex = new ArrayList<>();
        }
        replaceSubIndexSetter.accept(this.replaceSubIndex);
        return this;
    }

    /**
     * 被替换的子索引文件 
     * @return replaceSubIndex
     */
    public List<String> getReplaceSubIndex() {
        return replaceSubIndex;
    }

    public void setReplaceSubIndex(List<String> replaceSubIndex) {
        this.replaceSubIndex = replaceSubIndex;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TranscodeDetail that = (TranscodeDetail) obj;
        return Objects.equals(this.multitaskInfo, that.multitaskInfo) && Objects.equals(this.inputFile, that.inputFile)
            && Objects.equals(this.replaceSubIndex, that.replaceSubIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multitaskInfo, inputFile, replaceSubIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscodeDetail {\n");
        sb.append("    multitaskInfo: ").append(toIndentedString(multitaskInfo)).append("\n");
        sb.append("    inputFile: ").append(toIndentedString(inputFile)).append("\n");
        sb.append("    replaceSubIndex: ").append(toIndentedString(replaceSubIndex)).append("\n");
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

package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Subtitle
 */
public class Subtitle {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    @JacksonXmlProperty(localName = "input")

    private ObsObjInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inputs")

    @JacksonXmlProperty(localName = "inputs")

    private List<MulInputFileInfo> inputs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_type")

    @JacksonXmlProperty(localName = "subtitle_type")

    private Integer subtitleType;

    public Subtitle withInput(ObsObjInfo input) {
        this.input = input;
        return this;
    }

    public Subtitle withInput(Consumer<ObsObjInfo> inputSetter) {
        if (this.input == null) {
            this.input = new ObsObjInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public ObsObjInfo getInput() {
        return input;
    }

    public void setInput(ObsObjInfo input) {
        this.input = input;
    }

    public Subtitle withInputs(List<MulInputFileInfo> inputs) {
        this.inputs = inputs;
        return this;
    }

    public Subtitle addInputsItem(MulInputFileInfo inputsItem) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        this.inputs.add(inputsItem);
        return this;
    }

    public Subtitle withInputs(Consumer<List<MulInputFileInfo>> inputsSetter) {
        if (this.inputs == null) {
            this.inputs = new ArrayList<>();
        }
        inputsSetter.accept(this.inputs);
        return this;
    }

    /**
     * 多字幕文件地址。 
     * @return inputs
     */
    public List<MulInputFileInfo> getInputs() {
        return inputs;
    }

    public void setInputs(List<MulInputFileInfo> inputs) {
        this.inputs = inputs;
    }

    public Subtitle withSubtitleType(Integer subtitleType) {
        this.subtitleType = subtitleType;
        return this;
    }

    /**
     * 字幕类型。取值如下：  - 0，表示不输出字幕 - 1，表示外部字幕文件嵌入视频流 - 2，表示输出WebVTT格式字幕 
     * minimum: 0
     * maximum: 3
     * @return subtitleType
     */
    public Integer getSubtitleType() {
        return subtitleType;
    }

    public void setSubtitleType(Integer subtitleType) {
        this.subtitleType = subtitleType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Subtitle subtitle = (Subtitle) o;
        return Objects.equals(this.input, subtitle.input) && Objects.equals(this.inputs, subtitle.inputs)
            && Objects.equals(this.subtitleType, subtitle.subtitleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(input, inputs, subtitleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Subtitle {\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
        sb.append("    subtitleType: ").append(toIndentedString(subtitleType)).append("\n");
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

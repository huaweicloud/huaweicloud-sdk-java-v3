package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 返回的音频审核结果列表，porn为涉黄场景审核结果； 当前仅支持porn场景。 
 */
public class RunModerationAudioResponseBodyResultDetailAudio {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "porn")

    @JacksonXmlProperty(localName = "porn")

    private List<PornModerationResultDetail> porn = null;

    public RunModerationAudioResponseBodyResultDetailAudio withPorn(List<PornModerationResultDetail> porn) {
        this.porn = porn;
        return this;
    }

    public RunModerationAudioResponseBodyResultDetailAudio addPornItem(PornModerationResultDetail pornItem) {
        if (this.porn == null) {
            this.porn = new ArrayList<>();
        }
        this.porn.add(pornItem);
        return this;
    }

    public RunModerationAudioResponseBodyResultDetailAudio withPorn(
        Consumer<List<PornModerationResultDetail>> pornSetter) {
        if (this.porn == null) {
            this.porn = new ArrayList<>();
        }
        pornSetter.accept(this.porn);
        return this;
    }

    /**
     * 涉黄场景审核结果
     * @return porn
     */
    public List<PornModerationResultDetail> getPorn() {
        return porn;
    }

    public void setPorn(List<PornModerationResultDetail> porn) {
        this.porn = porn;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunModerationAudioResponseBodyResultDetailAudio runModerationAudioResponseBodyResultDetailAudio =
            (RunModerationAudioResponseBodyResultDetailAudio) o;
        return Objects.equals(this.porn, runModerationAudioResponseBodyResultDetailAudio.porn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(porn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModerationAudioResponseBodyResultDetailAudio {\n");
        sb.append("    porn: ").append(toIndentedString(porn)).append("\n");
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

package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCesInstanceRspBodyInstances
 */
public class ListCesInstanceRspBodyInstances {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medialive_mpc")

    private ListCesInstanceRspBodyMedialiveMpc medialiveMpc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline")

    private ListCesInstanceRspBodyPipeline pipeline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private ListCesInstanceRspBodyAudio audio;

    public ListCesInstanceRspBodyInstances withMedialiveMpc(ListCesInstanceRspBodyMedialiveMpc medialiveMpc) {
        this.medialiveMpc = medialiveMpc;
        return this;
    }

    public ListCesInstanceRspBodyInstances withMedialiveMpc(
        Consumer<ListCesInstanceRspBodyMedialiveMpc> medialiveMpcSetter) {
        if (this.medialiveMpc == null) {
            this.medialiveMpc = new ListCesInstanceRspBodyMedialiveMpc();
            medialiveMpcSetter.accept(this.medialiveMpc);
        }

        return this;
    }

    /**
     * Get medialiveMpc
     * @return medialiveMpc
     */
    public ListCesInstanceRspBodyMedialiveMpc getMedialiveMpc() {
        return medialiveMpc;
    }

    public void setMedialiveMpc(ListCesInstanceRspBodyMedialiveMpc medialiveMpc) {
        this.medialiveMpc = medialiveMpc;
    }

    public ListCesInstanceRspBodyInstances withPipeline(ListCesInstanceRspBodyPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    public ListCesInstanceRspBodyInstances withPipeline(Consumer<ListCesInstanceRspBodyPipeline> pipelineSetter) {
        if (this.pipeline == null) {
            this.pipeline = new ListCesInstanceRspBodyPipeline();
            pipelineSetter.accept(this.pipeline);
        }

        return this;
    }

    /**
     * Get pipeline
     * @return pipeline
     */
    public ListCesInstanceRspBodyPipeline getPipeline() {
        return pipeline;
    }

    public void setPipeline(ListCesInstanceRspBodyPipeline pipeline) {
        this.pipeline = pipeline;
    }

    public ListCesInstanceRspBodyInstances withAudio(ListCesInstanceRspBodyAudio audio) {
        this.audio = audio;
        return this;
    }

    public ListCesInstanceRspBodyInstances withAudio(Consumer<ListCesInstanceRspBodyAudio> audioSetter) {
        if (this.audio == null) {
            this.audio = new ListCesInstanceRspBodyAudio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public ListCesInstanceRspBodyAudio getAudio() {
        return audio;
    }

    public void setAudio(ListCesInstanceRspBodyAudio audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCesInstanceRspBodyInstances that = (ListCesInstanceRspBodyInstances) obj;
        return Objects.equals(this.medialiveMpc, that.medialiveMpc) && Objects.equals(this.pipeline, that.pipeline)
            && Objects.equals(this.audio, that.audio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medialiveMpc, pipeline, audio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCesInstanceRspBodyInstances {\n");
        sb.append("    medialiveMpc: ").append(toIndentedString(medialiveMpc)).append("\n");
        sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

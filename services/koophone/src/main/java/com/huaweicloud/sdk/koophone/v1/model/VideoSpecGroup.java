package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视频规格组
 */
public class VideoSpecGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_540P")

    private VideoSpec definition540P;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_720P")

    private VideoSpec definition720P;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition_1080P")

    private VideoSpec definition1080P;

    public VideoSpecGroup withDefinition540P(VideoSpec definition540P) {
        this.definition540P = definition540P;
        return this;
    }

    public VideoSpecGroup withDefinition540P(Consumer<VideoSpec> definition540PSetter) {
        if (this.definition540P == null) {
            this.definition540P = new VideoSpec();
            definition540PSetter.accept(this.definition540P);
        }

        return this;
    }

    /**
     * Get definition540P
     * @return definition540P
     */
    public VideoSpec getDefinition540P() {
        return definition540P;
    }

    public void setDefinition540P(VideoSpec definition540P) {
        this.definition540P = definition540P;
    }

    public VideoSpecGroup withDefinition720P(VideoSpec definition720P) {
        this.definition720P = definition720P;
        return this;
    }

    public VideoSpecGroup withDefinition720P(Consumer<VideoSpec> definition720PSetter) {
        if (this.definition720P == null) {
            this.definition720P = new VideoSpec();
            definition720PSetter.accept(this.definition720P);
        }

        return this;
    }

    /**
     * Get definition720P
     * @return definition720P
     */
    public VideoSpec getDefinition720P() {
        return definition720P;
    }

    public void setDefinition720P(VideoSpec definition720P) {
        this.definition720P = definition720P;
    }

    public VideoSpecGroup withDefinition1080P(VideoSpec definition1080P) {
        this.definition1080P = definition1080P;
        return this;
    }

    public VideoSpecGroup withDefinition1080P(Consumer<VideoSpec> definition1080PSetter) {
        if (this.definition1080P == null) {
            this.definition1080P = new VideoSpec();
            definition1080PSetter.accept(this.definition1080P);
        }

        return this;
    }

    /**
     * Get definition1080P
     * @return definition1080P
     */
    public VideoSpec getDefinition1080P() {
        return definition1080P;
    }

    public void setDefinition1080P(VideoSpec definition1080P) {
        this.definition1080P = definition1080P;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoSpecGroup that = (VideoSpecGroup) obj;
        return Objects.equals(this.definition540P, that.definition540P)
            && Objects.equals(this.definition720P, that.definition720P)
            && Objects.equals(this.definition1080P, that.definition1080P);
    }

    @Override
    public int hashCode() {
        return Objects.hash(definition540P, definition720P, definition1080P);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSpecGroup {\n");
        sb.append("    definition540P: ").append(toIndentedString(definition540P)).append("\n");
        sb.append("    definition720P: ").append(toIndentedString(definition720P)).append("\n");
        sb.append("    definition1080P: ").append(toIndentedString(definition1080P)).append("\n");
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

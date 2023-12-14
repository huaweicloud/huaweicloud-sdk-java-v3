package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 传译员信息
 */
public class RestSetAttendeeLanChannelBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantIDs")

    private List<String> participantIDs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listenLanChannel")

    private String listenLanChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speakLanChannel")

    private String speakLanChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeOriginalVoice")

    private Integer includeOriginalVoice;

    public RestSetAttendeeLanChannelBody withParticipantIDs(List<String> participantIDs) {
        this.participantIDs = participantIDs;
        return this;
    }

    public RestSetAttendeeLanChannelBody addParticipantIDsItem(String participantIDsItem) {
        if (this.participantIDs == null) {
            this.participantIDs = new ArrayList<>();
        }
        this.participantIDs.add(participantIDsItem);
        return this;
    }

    public RestSetAttendeeLanChannelBody withParticipantIDs(Consumer<List<String>> participantIDsSetter) {
        if (this.participantIDs == null) {
            this.participantIDs = new ArrayList<>();
        }
        participantIDsSetter.accept(this.participantIDs);
        return this;
    }

    /**
     * 会场标识列表。
     * @return participantIDs
     */
    public List<String> getParticipantIDs() {
        return participantIDs;
    }

    public void setParticipantIDs(List<String> participantIDs) {
        this.participantIDs = participantIDs;
    }

    public RestSetAttendeeLanChannelBody withListenLanChannel(String listenLanChannel) {
        this.listenLanChannel = listenLanChannel;
        return this;
    }

    /**
     * 与会者收听的语言频道，普通与会者听与说一致。
     * @return listenLanChannel
     */
    public String getListenLanChannel() {
        return listenLanChannel;
    }

    public void setListenLanChannel(String listenLanChannel) {
        this.listenLanChannel = listenLanChannel;
    }

    public RestSetAttendeeLanChannelBody withSpeakLanChannel(String speakLanChannel) {
        this.speakLanChannel = speakLanChannel;
        return this;
    }

    /**
     * 与会者发言的语言频道，普通与会者听与说一致。
     * @return speakLanChannel
     */
    public String getSpeakLanChannel() {
        return speakLanChannel;
    }

    public void setSpeakLanChannel(String speakLanChannel) {
        this.speakLanChannel = speakLanChannel;
    }

    public RestSetAttendeeLanChannelBody withIncludeOriginalVoice(Integer includeOriginalVoice) {
        this.includeOriginalVoice = includeOriginalVoice;
        return this;
    }

    /**
     * 是否包含原声，0：不包含，1：包含。
     * minimum: 0
     * maximum: 1
     * @return includeOriginalVoice
     */
    public Integer getIncludeOriginalVoice() {
        return includeOriginalVoice;
    }

    public void setIncludeOriginalVoice(Integer includeOriginalVoice) {
        this.includeOriginalVoice = includeOriginalVoice;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestSetAttendeeLanChannelBody that = (RestSetAttendeeLanChannelBody) obj;
        return Objects.equals(this.participantIDs, that.participantIDs)
            && Objects.equals(this.listenLanChannel, that.listenLanChannel)
            && Objects.equals(this.speakLanChannel, that.speakLanChannel)
            && Objects.equals(this.includeOriginalVoice, that.includeOriginalVoice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantIDs, listenLanChannel, speakLanChannel, includeOriginalVoice);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestSetAttendeeLanChannelBody {\n");
        sb.append("    participantIDs: ").append(toIndentedString(participantIDs)).append("\n");
        sb.append("    listenLanChannel: ").append(toIndentedString(listenLanChannel)).append("\n");
        sb.append("    speakLanChannel: ").append(toIndentedString(speakLanChannel)).append("\n");
        sb.append("    includeOriginalVoice: ").append(toIndentedString(includeOriginalVoice)).append("\n");
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

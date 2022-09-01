package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMeetingDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceData")

    @JacksonXmlProperty(localName = "conferenceData")

    private ConferenceInfo conferenceData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    @JacksonXmlProperty(localName = "data")

    private PageParticipant data;

    public ShowMeetingDetailResponse withConferenceData(ConferenceInfo conferenceData) {
        this.conferenceData = conferenceData;
        return this;
    }

    public ShowMeetingDetailResponse withConferenceData(Consumer<ConferenceInfo> conferenceDataSetter) {
        if (this.conferenceData == null) {
            this.conferenceData = new ConferenceInfo();
            conferenceDataSetter.accept(this.conferenceData);
        }

        return this;
    }

    /**
     * Get conferenceData
     * @return conferenceData
     */
    public ConferenceInfo getConferenceData() {
        return conferenceData;
    }

    public void setConferenceData(ConferenceInfo conferenceData) {
        this.conferenceData = conferenceData;
    }

    public ShowMeetingDetailResponse withData(PageParticipant data) {
        this.data = data;
        return this;
    }

    public ShowMeetingDetailResponse withData(Consumer<PageParticipant> dataSetter) {
        if (this.data == null) {
            this.data = new PageParticipant();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /**
     * Get data
     * @return data
     */
    public PageParticipant getData() {
        return data;
    }

    public void setData(PageParticipant data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMeetingDetailResponse showMeetingDetailResponse = (ShowMeetingDetailResponse) o;
        return Objects.equals(this.conferenceData, showMeetingDetailResponse.conferenceData)
            && Objects.equals(this.data, showMeetingDetailResponse.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceData, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMeetingDetailResponse {\n");
        sb.append("    conferenceData: ").append(toIndentedString(conferenceData)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

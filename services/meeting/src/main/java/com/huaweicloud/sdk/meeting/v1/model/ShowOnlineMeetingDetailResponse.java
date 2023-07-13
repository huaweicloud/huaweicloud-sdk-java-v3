package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowOnlineMeetingDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceData")

    private ConferenceInfo conferenceData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private PageParticipant data;

    public ShowOnlineMeetingDetailResponse withConferenceData(ConferenceInfo conferenceData) {
        this.conferenceData = conferenceData;
        return this;
    }

    public ShowOnlineMeetingDetailResponse withConferenceData(Consumer<ConferenceInfo> conferenceDataSetter) {
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

    public ShowOnlineMeetingDetailResponse withData(PageParticipant data) {
        this.data = data;
        return this;
    }

    public ShowOnlineMeetingDetailResponse withData(Consumer<PageParticipant> dataSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOnlineMeetingDetailResponse that = (ShowOnlineMeetingDetailResponse) obj;
        return Objects.equals(this.conferenceData, that.conferenceData) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceData, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOnlineMeetingDetailResponse {\n");
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

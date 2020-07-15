package com.huaweicloud.sdk.meeting.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.ConferenceInfo;
import com.huaweicloud.sdk.meeting.v1.model.PageParticipant;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowHisMeetingDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceData")
    
    private ConferenceInfo conferenceData = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    private PageParticipant data = null;

    public ShowHisMeetingDetailResponse withConferenceData(ConferenceInfo conferenceData) {
        this.conferenceData = conferenceData;
        return this;
    }

    public ShowHisMeetingDetailResponse withConferenceData(Consumer<ConferenceInfo> conferenceDataSetter) {
        if(this.conferenceData == null ){
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

    public ShowHisMeetingDetailResponse withData(PageParticipant data) {
        this.data = data;
        return this;
    }

    public ShowHisMeetingDetailResponse withData(Consumer<PageParticipant> dataSetter) {
        if(this.data == null ){
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
        ShowHisMeetingDetailResponse showHisMeetingDetailResponse = (ShowHisMeetingDetailResponse) o;
        return Objects.equals(this.conferenceData, showHisMeetingDetailResponse.conferenceData) &&
            Objects.equals(this.data, showHisMeetingDetailResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceData, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHisMeetingDetailResponse {\n");
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


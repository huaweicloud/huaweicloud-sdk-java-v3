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
public class SearchQosParticipantDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private QosParticipantInfo user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qos")

    @JacksonXmlProperty(localName = "qos")

    private QosInfo qos;

    public SearchQosParticipantDetailResponse withUser(QosParticipantInfo user) {
        this.user = user;
        return this;
    }

    public SearchQosParticipantDetailResponse withUser(Consumer<QosParticipantInfo> userSetter) {
        if (this.user == null) {
            this.user = new QosParticipantInfo();
            userSetter.accept(this.user);
        }

        return this;
    }

    /**
     * Get user
     * @return user
     */
    public QosParticipantInfo getUser() {
        return user;
    }

    public void setUser(QosParticipantInfo user) {
        this.user = user;
    }

    public SearchQosParticipantDetailResponse withQos(QosInfo qos) {
        this.qos = qos;
        return this;
    }

    public SearchQosParticipantDetailResponse withQos(Consumer<QosInfo> qosSetter) {
        if (this.qos == null) {
            this.qos = new QosInfo();
            qosSetter.accept(this.qos);
        }

        return this;
    }

    /**
     * Get qos
     * @return qos
     */
    public QosInfo getQos() {
        return qos;
    }

    public void setQos(QosInfo qos) {
        this.qos = qos;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchQosParticipantDetailResponse searchQosParticipantDetailResponse = (SearchQosParticipantDetailResponse) o;
        return Objects.equals(this.user, searchQosParticipantDetailResponse.user)
            && Objects.equals(this.qos, searchQosParticipantDetailResponse.qos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, qos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchQosParticipantDetailResponse {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    qos: ").append(toIndentedString(qos)).append("\n");
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

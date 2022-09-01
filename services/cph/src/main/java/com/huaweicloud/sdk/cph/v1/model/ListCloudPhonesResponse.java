package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListCloudPhonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phones")

    @JacksonXmlProperty(localName = "phones")

    private List<Object> phones = null;

    public ListCloudPhonesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudPhonesResponse withPhones(List<Object> phones) {
        this.phones = phones;
        return this;
    }

    public ListCloudPhonesResponse addPhonesItem(Object phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public ListCloudPhonesResponse withPhones(Consumer<List<Object>> phonesSetter) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        phonesSetter.accept(this.phones);
        return this;
    }

    /**
     * 云手机信息
     * @return phones
     */
    public List<Object> getPhones() {
        return phones;
    }

    public void setPhones(List<Object> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCloudPhonesResponse listCloudPhonesResponse = (ListCloudPhonesResponse) o;
        return Objects.equals(this.requestId, listCloudPhonesResponse.requestId)
            && Objects.equals(this.phones, listCloudPhonesResponse.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, phones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhonesResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    phones: ").append(toIndentedString(phones)).append("\n");
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

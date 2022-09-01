package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAddressGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_group_id")

    @JacksonXmlProperty(localName = "address_group_id")

    private String addressGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateAddressGroupRequestBody body;

    public UpdateAddressGroupRequest withAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
        return this;
    }

    /**
     * 地址组的唯一标识
     * @return addressGroupId
     */
    public String getAddressGroupId() {
        return addressGroupId;
    }

    public void setAddressGroupId(String addressGroupId) {
        this.addressGroupId = addressGroupId;
    }

    public UpdateAddressGroupRequest withBody(UpdateAddressGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateAddressGroupRequest withBody(Consumer<UpdateAddressGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAddressGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAddressGroupRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateAddressGroupRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateAddressGroupRequest updateAddressGroupRequest = (UpdateAddressGroupRequest) o;
        return Objects.equals(this.addressGroupId, updateAddressGroupRequest.addressGroupId)
            && Objects.equals(this.body, updateAddressGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAddressGroupRequest {\n");
        sb.append("    addressGroupId: ").append(toIndentedString(addressGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateAddressSetInfoUsingPutRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_id")

    private String setId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateAddressSetDto body;

    public UpdateAddressSetInfoUsingPutRequest withSetId(String setId) {
        this.setId = setId;
        return this;
    }

    /**
     * 地址组id
     * @return setId
     */
    public String getSetId() {
        return setId;
    }

    public void setSetId(String setId) {
        this.setId = setId;
    }

    public UpdateAddressSetInfoUsingPutRequest withBody(UpdateAddressSetDto body) {
        this.body = body;
        return this;
    }

    public UpdateAddressSetInfoUsingPutRequest withBody(Consumer<UpdateAddressSetDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateAddressSetDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateAddressSetDto getBody() {
        return body;
    }

    public void setBody(UpdateAddressSetDto body) {
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
        UpdateAddressSetInfoUsingPutRequest updateAddressSetInfoUsingPutRequest =
            (UpdateAddressSetInfoUsingPutRequest) o;
        return Objects.equals(this.setId, updateAddressSetInfoUsingPutRequest.setId)
            && Objects.equals(this.body, updateAddressSetInfoUsingPutRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAddressSetInfoUsingPutRequest {\n");
        sb.append("    setId: ").append(toIndentedString(setId)).append("\n");
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

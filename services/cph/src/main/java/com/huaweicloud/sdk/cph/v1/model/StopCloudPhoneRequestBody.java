package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * StopCloudPhoneRequestBody
 */
public class StopCloudPhoneRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ids")

    @JacksonXmlProperty(localName = "phone_ids")

    private List<String> phoneIds = null;

    public StopCloudPhoneRequestBody withPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
        return this;
    }

    public StopCloudPhoneRequestBody addPhoneIdsItem(String phoneIdsItem) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        this.phoneIds.add(phoneIdsItem);
        return this;
    }

    public StopCloudPhoneRequestBody withPhoneIds(Consumer<List<String>> phoneIdsSetter) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        phoneIdsSetter.accept(this.phoneIds);
        return this;
    }

    /**
     * 云手机id列表
     * @return phoneIds
     */
    public List<String> getPhoneIds() {
        return phoneIds;
    }

    public void setPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopCloudPhoneRequestBody stopCloudPhoneRequestBody = (StopCloudPhoneRequestBody) o;
        return Objects.equals(this.phoneIds, stopCloudPhoneRequestBody.phoneIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopCloudPhoneRequestBody {\n");
        sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
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

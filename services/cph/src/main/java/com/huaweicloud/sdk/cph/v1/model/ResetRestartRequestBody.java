package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResetRestartRequestBody
 */
public class ResetRestartRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    @JacksonXmlProperty(localName = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phones")

    @JacksonXmlProperty(localName = "phones")

    private List<ResetRestartRequestBodyPhones> phones = null;

    public ResetRestartRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 云手机镜像
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ResetRestartRequestBody withPhones(List<ResetRestartRequestBodyPhones> phones) {
        this.phones = phones;
        return this;
    }

    public ResetRestartRequestBody addPhonesItem(ResetRestartRequestBodyPhones phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public ResetRestartRequestBody withPhones(Consumer<List<ResetRestartRequestBodyPhones>> phonesSetter) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        phonesSetter.accept(this.phones);
        return this;
    }

    /**
     * 云手机列表
     * @return phones
     */
    public List<ResetRestartRequestBodyPhones> getPhones() {
        return phones;
    }

    public void setPhones(List<ResetRestartRequestBodyPhones> phones) {
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
        ResetRestartRequestBody resetRestartRequestBody = (ResetRestartRequestBody) o;
        return Objects.equals(this.imageId, resetRestartRequestBody.imageId)
            && Objects.equals(this.phones, resetRestartRequestBody.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, phones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetRestartRequestBody {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

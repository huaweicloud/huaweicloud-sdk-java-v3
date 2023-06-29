package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 重启云手机请求体。
 */
public class RestartCloudPhoneRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phones")

    private List<PhoneProperty> phones = null;

    public RestartCloudPhoneRequestBody withImageId(String imageId) {
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

    public RestartCloudPhoneRequestBody withPhones(List<PhoneProperty> phones) {
        this.phones = phones;
        return this;
    }

    public RestartCloudPhoneRequestBody addPhonesItem(PhoneProperty phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public RestartCloudPhoneRequestBody withPhones(Consumer<List<PhoneProperty>> phonesSetter) {
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
    public List<PhoneProperty> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneProperty> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestartCloudPhoneRequestBody that = (RestartCloudPhoneRequestBody) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.phones, that.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, phones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestartCloudPhoneRequestBody {\n");
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

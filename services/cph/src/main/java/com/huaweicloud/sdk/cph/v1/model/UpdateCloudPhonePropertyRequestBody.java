package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新云手机属性请求体。
 */
public class UpdateCloudPhonePropertyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phones")

    private List<PropertyToUpdate> phones = null;

    public UpdateCloudPhonePropertyRequestBody withPhones(List<PropertyToUpdate> phones) {
        this.phones = phones;
        return this;
    }

    public UpdateCloudPhonePropertyRequestBody addPhonesItem(PropertyToUpdate phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public UpdateCloudPhonePropertyRequestBody withPhones(Consumer<List<PropertyToUpdate>> phonesSetter) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        phonesSetter.accept(this.phones);
        return this;
    }

    /**
     * 手机列表。
     * @return phones
     */
    public List<PropertyToUpdate> getPhones() {
        return phones;
    }

    public void setPhones(List<PropertyToUpdate> phones) {
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
        UpdateCloudPhonePropertyRequestBody that = (UpdateCloudPhonePropertyRequestBody) obj;
        return Objects.equals(this.phones, that.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCloudPhonePropertyRequestBody {\n");
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

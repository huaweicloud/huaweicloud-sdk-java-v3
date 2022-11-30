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

    private List<Property> phones = null;

    public UpdateCloudPhonePropertyRequestBody withPhones(List<Property> phones) {
        this.phones = phones;
        return this;
    }

    public UpdateCloudPhonePropertyRequestBody addPhonesItem(Property phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public UpdateCloudPhonePropertyRequestBody withPhones(Consumer<List<Property>> phonesSetter) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        phonesSetter.accept(this.phones);
        return this;
    }

    /**
     * 手机列表
     * @return phones
     */
    public List<Property> getPhones() {
        return phones;
    }

    public void setPhones(List<Property> phones) {
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
        UpdateCloudPhonePropertyRequestBody updateCloudPhonePropertyRequestBody =
            (UpdateCloudPhonePropertyRequestBody) o;
        return Objects.equals(this.phones, updateCloudPhonePropertyRequestBody.phones);
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

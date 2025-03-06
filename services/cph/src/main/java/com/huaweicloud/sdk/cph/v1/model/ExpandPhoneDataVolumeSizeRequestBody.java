package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 扩容云手机数据盘大小请求体。
 */
public class ExpandPhoneDataVolumeSizeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phones")

    private List<PhoneDataVolumeSize> phones = null;

    public ExpandPhoneDataVolumeSizeRequestBody withPhones(List<PhoneDataVolumeSize> phones) {
        this.phones = phones;
        return this;
    }

    public ExpandPhoneDataVolumeSizeRequestBody addPhonesItem(PhoneDataVolumeSize phonesItem) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        this.phones.add(phonesItem);
        return this;
    }

    public ExpandPhoneDataVolumeSizeRequestBody withPhones(Consumer<List<PhoneDataVolumeSize>> phonesSetter) {
        if (this.phones == null) {
            this.phones = new ArrayList<>();
        }
        phonesSetter.accept(this.phones);
        return this;
    }

    /**
     * 云手机列表。
     * @return phones
     */
    public List<PhoneDataVolumeSize> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneDataVolumeSize> phones) {
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
        ExpandPhoneDataVolumeSizeRequestBody that = (ExpandPhoneDataVolumeSizeRequestBody) obj;
        return Objects.equals(this.phones, that.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phones);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandPhoneDataVolumeSizeRequestBody {\n");
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

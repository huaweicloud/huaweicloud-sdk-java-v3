package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PhoneDataVolumeSize
 */
public class PhoneDataVolumeSize {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_size")

    private Integer newSize;

    public PhoneDataVolumeSize withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机id
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public PhoneDataVolumeSize withNewSize(Integer newSize) {
        this.newSize = newSize;
        return this;
    }

    /**
     * 扩容后的手机数据盘大小，单位为GiB。扩容的大小必须大于等于原有容量且小于最大容量。 最大容量：32768GiB
     * minimum: 0
     * maximum: 32768
     * @return newSize
     */
    public Integer getNewSize() {
        return newSize;
    }

    public void setNewSize(Integer newSize) {
        this.newSize = newSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PhoneDataVolumeSize that = (PhoneDataVolumeSize) obj;
        return Objects.equals(this.phoneId, that.phoneId) && Objects.equals(this.newSize, that.newSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneId, newSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PhoneDataVolumeSize {\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    newSize: ").append(toIndentedString(newSize)).append("\n");
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

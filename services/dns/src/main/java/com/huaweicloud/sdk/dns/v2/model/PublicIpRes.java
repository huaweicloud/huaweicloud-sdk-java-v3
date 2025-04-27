package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PublicIpRes
 */
public class PublicIpRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    public PublicIpRes withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 弹性公网IP（EIP）所属的区域。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PublicIpRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网IP（EIP）的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PublicIpRes withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 弹性公网IP（EIP）。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PublicIpRes that = (PublicIpRes) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.id, that.id)
            && Objects.equals(this.address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, id, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIpRes {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

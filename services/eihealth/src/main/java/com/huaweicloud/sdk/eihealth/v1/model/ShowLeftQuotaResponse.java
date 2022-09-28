package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowLeftQuotaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quantity")

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private Integer ram;

    public ShowLeftQuotaResponse withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 剩余服务器数
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ShowLeftQuotaResponse withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 剩余CPU
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ShowLeftQuotaResponse withRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    /**
     * 剩余内存
     * @return ram
     */
    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLeftQuotaResponse showLeftQuotaResponse = (ShowLeftQuotaResponse) o;
        return Objects.equals(this.quantity, showLeftQuotaResponse.quantity)
            && Objects.equals(this.cpu, showLeftQuotaResponse.cpu)
            && Objects.equals(this.ram, showLeftQuotaResponse.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, cpu, ram);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLeftQuotaResponse {\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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

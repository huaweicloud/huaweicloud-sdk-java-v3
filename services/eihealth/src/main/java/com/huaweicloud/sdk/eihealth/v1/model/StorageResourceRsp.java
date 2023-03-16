package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StorageResourceRsp
 */
public class StorageResourceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecDto spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public StorageResourceRsp withSpec(SpecDto spec) {
        this.spec = spec;
        return this;
    }

    public StorageResourceRsp withSpec(Consumer<SpecDto> specSetter) {
        if (this.spec == null) {
            this.spec = new SpecDto();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SpecDto getSpec() {
        return spec;
    }

    public void setSpec(SpecDto spec) {
        this.spec = spec;
    }

    public StorageResourceRsp withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 使用量
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public StorageResourceRsp withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public StorageResourceRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 购买时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StorageResourceRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StorageResourceRsp storageResourceRsp = (StorageResourceRsp) o;
        return Objects.equals(this.spec, storageResourceRsp.spec) && Objects.equals(this.size, storageResourceRsp.size)
            && Objects.equals(this.chargeMode, storageResourceRsp.chargeMode)
            && Objects.equals(this.createTime, storageResourceRsp.createTime)
            && Objects.equals(this.status, storageResourceRsp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, size, chargeMode, createTime, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StorageResourceRsp {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

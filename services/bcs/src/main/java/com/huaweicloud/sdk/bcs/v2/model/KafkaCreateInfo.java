package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * kafka实例创建信息
 */
public class KafkaCreateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private String spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private Long storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az")

    private String az;

    public KafkaCreateInfo withSpec(String spec) {
        this.spec = spec;
        return this;
    }

    /**
     * kafka实例规格，可选：mini：基准带宽100MB/s，small：基准带宽300MB/s，middle：基准带宽600MB/s，high：基准带宽1200MB/s
     * @return spec
     */
    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public KafkaCreateInfo withStorage(Long storage) {
        this.storage = storage;
        return this;
    }

    /**
     * 存储空间(单位：GB），至多9000，mini版至少300，small至少1200，middle至少2400，high至少4800
     * @return storage
     */
    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public KafkaCreateInfo withAz(String az) {
        this.az = az;
        return this;
    }

    /**
     * kafka实例可用区
     * @return az
     */
    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaCreateInfo that = (KafkaCreateInfo) obj;
        return Objects.equals(this.spec, that.spec) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.az, that.az);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec, storage, az);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaCreateInfo {\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    az: ").append(toIndentedString(az)).append("\n");
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

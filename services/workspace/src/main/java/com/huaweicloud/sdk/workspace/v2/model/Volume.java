package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 磁盘。
 */
public class Volume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Integer iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throughput")

    private Integer throughput;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kms_id")

    private String kmsId;

    public Volume withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 桌面数据盘对应的磁盘类型，需要与系统所提供的磁盘类型相匹配。  -SAS：高IO。 -SSD：超高IO。 -GPSSD：通用型SSD。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Volume withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘容量，单位GB。系统盘大小范围[80-32760]，数据盘范围[10-32760]，大小为10的倍数。
     * minimum: 10
     * maximum: 32760
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Volume withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * iops，云硬盘每秒进行读写的操作次数。
     * minimum: 0
     * maximum: 16380000
     * @return iops
     */
    public Integer getIops() {
        return iops;
    }

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    public Volume withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * 吞吐量，云硬盘每秒成功传送的数据量，即读取和写入的数据量。
     * minimum: 0
     * maximum: 4095000
     * @return throughput
     */
    public Integer getThroughput() {
        return throughput;
    }

    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    public Volume withKmsId(String kmsId) {
        this.kmsId = kmsId;
        return this;
    }

    /**
     * kms密钥id，对创建的磁盘进行加密。
     * @return kmsId
     */
    public String getKmsId() {
        return kmsId;
    }

    public void setKmsId(String kmsId) {
        this.kmsId = kmsId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Volume that = (Volume) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.size, that.size)
            && Objects.equals(this.iops, that.iops) && Objects.equals(this.throughput, that.throughput)
            && Objects.equals(this.kmsId, that.kmsId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, size, iops, throughput, kmsId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Volume {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    throughput: ").append(toIndentedString(throughput)).append("\n");
        sb.append("    kmsId: ").append(toIndentedString(kmsId)).append("\n");
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

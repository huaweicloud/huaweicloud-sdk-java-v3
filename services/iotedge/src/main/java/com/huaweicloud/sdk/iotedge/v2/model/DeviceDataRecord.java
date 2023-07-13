package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 设备上报数据打印开关
 */
public class DeviceDataRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_quota")

    private Integer diskQuota;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "age")

    private Integer age;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public DeviceDataRecord withDiskQuota(Integer diskQuota) {
        this.diskQuota = diskQuota;
        return this;
    }

    /**
     * 磁盘配额，单位MB，参考值，只能保证在这个值左右
     * minimum: 512
     * maximum: 10240
     * @return diskQuota
     */
    public Integer getDiskQuota() {
        return diskQuota;
    }

    public void setDiskQuota(Integer diskQuota) {
        this.diskQuota = diskQuota;
    }

    public DeviceDataRecord withAge(Integer age) {
        this.age = age;
        return this;
    }

    /**
     * 老化时间，日志压缩文件名时间戳老于这个时间就会发生老化删除
     * minimum: 1
     * maximum: 7
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public DeviceDataRecord withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 配置开关，true启用数据打印，false不启用数据打印
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeviceDataRecord that = (DeviceDataRecord) obj;
        return Objects.equals(this.diskQuota, that.diskQuota) && Objects.equals(this.age, that.age)
            && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diskQuota, age, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeviceDataRecord {\n");
        sb.append("    diskQuota: ").append(toIndentedString(diskQuota)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

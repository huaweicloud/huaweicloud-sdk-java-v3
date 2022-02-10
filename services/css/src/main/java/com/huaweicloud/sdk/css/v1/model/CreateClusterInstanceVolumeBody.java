package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** volume信息。当flavorRef选择的是本地盘规格时不需要填写，本地盘规格可以通过获取实例规格列表接口获取。目前支持的本地盘规格有： - ess.spec-i3small - ess.spec-i3medium -
 * ess.spec-i3.8xlarge.8 - ess.spec-ds.xlarge.8 - ess.spec-ds.2xlarge.8 - ess.spec-ds.4xlarge.8 */
public class CreateClusterInstanceVolumeBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_type")

    private String volumeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    public CreateClusterInstanceVolumeBody withVolumeType(String volumeType) {
        this.volumeType = volumeType;
        return this;
    }

    /** 卷类型。 - COMMON：普通I/O。 - HIGH：高I/O。 - ULTRAHIGH：超高I/O。
     * 
     * @return volumeType */
    public String getVolumeType() {
        return volumeType;
    }

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    public CreateClusterInstanceVolumeBody withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 卷大小，必须为4和10的倍数。 单位：GB。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterInstanceVolumeBody createClusterInstanceVolumeBody = (CreateClusterInstanceVolumeBody) o;
        return Objects.equals(this.volumeType, createClusterInstanceVolumeBody.volumeType)
            && Objects.equals(this.size, createClusterInstanceVolumeBody.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volumeType, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterInstanceVolumeBody {\n");
        sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

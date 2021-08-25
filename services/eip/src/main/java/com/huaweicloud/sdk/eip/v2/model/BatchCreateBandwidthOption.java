package com.huaweicloud.sdk.eip.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 带宽对象 */
public class BatchCreateBandwidthOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public BatchCreateBandwidthOption withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 取值范围：正整数 功能说明：批创的共享带宽的个数 说明： 如果传入的参数为小数（如 2.2）或者字符类型（如“2”），会自动强制转换为整数。 minimum: 1
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BatchCreateBandwidthOption withName(String name) {
        this.name = name;
        return this;
    }

    /** 取值范围：1-64，支持数字、字母、中文、_(下划线)、-（中划线）、.（点） 功能说明：带宽名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateBandwidthOption withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 功能说明：带宽大小。共享带宽的大小有最小值限制，默认为2M，可能因局点不同而不同。 取值范围：默认5Mbit/s~2000Mbit/s（具体范围以各区域配置为准，请参见控制台对应页面显示）。
     * 注意：调整带宽时的最小单位会根据带宽范围不同存在差异。 小于等于300Mbit/s：默认最小单位为1Mbit/s。 300Mbit/s~1000Mbit/s：默认最小单位为50Mbit/s。
     * 大于1000Mbit/s：默认最小单位为500Mbit/s。
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public BatchCreateBandwidthOption withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /** 功能说明：表示中心站点资源或者边缘站点资源，对接了边缘站点的区域需传此字段 取值范围： center、边缘站点名称 上线区域：华北-乌兰察布一，华南-广州 约束：共享带宽只能插入与该字段相同的publicip
     * 
     * @return publicBorderGroup */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchCreateBandwidthOption batchCreateBandwidthOption = (BatchCreateBandwidthOption) o;
        return Objects.equals(this.count, batchCreateBandwidthOption.count)
            && Objects.equals(this.name, batchCreateBandwidthOption.name)
            && Objects.equals(this.size, batchCreateBandwidthOption.size)
            && Objects.equals(this.publicBorderGroup, batchCreateBandwidthOption.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, name, size, publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateBandwidthOption {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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

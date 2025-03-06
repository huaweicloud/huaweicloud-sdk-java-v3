package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户自定义的弹性公网IP结构体。 配置云手机裸服务器的弹性IP信息的方式， 自动分配，需要指定新创建弹性IP的信息； 使用已有，需要指定已经购买的EIP ID。
 */
public class CreateCloudPhoneSingleServerRequestBodyPublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width")

    private CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth bandWidth;

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 指定已有的EIP进行云手机裸服务器创建，当前只支持传入一个已有的EIP ID。指定EIP后public_ip结构体中count字段和type字段不生效。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP的类型。 例如： 5_telcom：电信 5_union：联通 5_bgp：全动态BGP 5_sbgp：静态BGP
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Eip数量。默认为0。取值范围为【0,1】
     * minimum: 0
     * maximum: 1
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withBandWidth(
        CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBodyPublicIp withBandWidth(
        Consumer<CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(CreateCloudPhoneSingleServerRequestBodyPublicIpBandWidth bandWidth) {
        this.bandWidth = bandWidth;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudPhoneSingleServerRequestBodyPublicIp that = (CreateCloudPhoneSingleServerRequestBodyPublicIp) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.type, that.type)
            && Objects.equals(this.count, that.count) && Objects.equals(this.bandWidth, that.bandWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, type, count, bandWidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneSingleServerRequestBodyPublicIp {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
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

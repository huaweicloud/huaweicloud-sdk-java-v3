package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户自定义的弹性公网IP结构体。  配置云服务器的弹性IP信息的方式，  自动分配，需要指定新创建弹性IP的信息； 使用已有，需要指定已经购买的EIP ID。
 */
public class ChangeCloudPhoneServerRequestBodyPublicIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private CreateNet2CloudPhoneServerRequestBodyPublicIpEip eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ChangeCloudPhoneServerRequestBodyPublicIp withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public ChangeCloudPhoneServerRequestBodyPublicIp addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ChangeCloudPhoneServerRequestBodyPublicIp withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * 指定已有的EIP进行服务器创建，当前只支持传入一个已有的EIP ID。
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public ChangeCloudPhoneServerRequestBodyPublicIp withEip(CreateNet2CloudPhoneServerRequestBodyPublicIpEip eip) {
        this.eip = eip;
        return this;
    }

    public ChangeCloudPhoneServerRequestBodyPublicIp withEip(
        Consumer<CreateNet2CloudPhoneServerRequestBodyPublicIpEip> eipSetter) {
        if (this.eip == null) {
            this.eip = new CreateNet2CloudPhoneServerRequestBodyPublicIpEip();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public CreateNet2CloudPhoneServerRequestBodyPublicIpEip getEip() {
        return eip;
    }

    public void setEip(CreateNet2CloudPhoneServerRequestBodyPublicIpEip eip) {
        this.eip = eip;
    }

    public ChangeCloudPhoneServerRequestBodyPublicIp withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Eip数量。默认为1，不需要Eip可设置为0，取值范围为0到手机IP数。
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeCloudPhoneServerRequestBodyPublicIp that = (ChangeCloudPhoneServerRequestBodyPublicIp) obj;
        return Objects.equals(this.ids, that.ids) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, eip, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeCloudPhoneServerRequestBodyPublicIp {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

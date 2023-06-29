package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 通道号绑定服务号请求体。
 */
public class LockPortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_id")

    private String pubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign")

    private List<String> sign = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ext_port_id")

    private String extPortId;

    public LockPortRequestBody withPubId(String pubId) {
        this.pubId = pubId;
        return this;
    }

    /**
     * 服务号ID。
     * @return pubId
     */
    public String getPubId() {
        return pubId;
    }

    public void setPubId(String pubId) {
        this.pubId = pubId;
    }

    public LockPortRequestBody withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。 - port_type=5时，长度必须为5 - port_type=1或3，长度在21位内 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public LockPortRequestBody withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 通道号绑定/解绑的province字段取值范围如下： 全国、河北省、山西省、辽宁省、吉林省、黑龙江省、江苏省、浙江省、安徽省、福建省、江西省、山东省、河南省、湖北省、湖南省、广东省、海南省、四川省、贵州省、云南省、陕西省、甘肃省、青海省、台湾省、内蒙古自治区、广西壮族自治区、西藏自治区、宁夏回族自治区、新疆维吾尔自治区、北京市、天津市、上海市、重庆市、香港特别行政区、澳门特别行政区。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public LockPortRequestBody withSign(List<String> sign) {
        this.sign = sign;
        return this;
    }

    public LockPortRequestBody addSignItem(String signItem) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        this.sign.add(signItem);
        return this;
    }

    public LockPortRequestBody withSign(Consumer<List<String>> signSetter) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        signSetter.accept(this.sign);
        return this;
    }

    /**
     * 绑定签名，必须是该端口号签名的子集。单个签名长度为2-18。
     * @return sign
     */
    public List<String> getSign() {
        return sign;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }

    public LockPortRequestBody withExtPortId(String extPortId) {
        this.extPortId = extPortId;
        return this;
    }

    /**
     * 关联通道号ID，取通道号列表返回的ID。
     * @return extPortId
     */
    public String getExtPortId() {
        return extPortId;
    }

    public void setExtPortId(String extPortId) {
        this.extPortId = extPortId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LockPortRequestBody that = (LockPortRequestBody) obj;
        return Objects.equals(this.pubId, that.pubId) && Objects.equals(this.port, that.port)
            && Objects.equals(this.province, that.province) && Objects.equals(this.sign, that.sign)
            && Objects.equals(this.extPortId, that.extPortId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pubId, port, province, sign, extPortId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockPortRequestBody {\n");
        sb.append("    pubId: ").append(toIndentedString(pubId)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
        sb.append("    extPortId: ").append(toIndentedString(extPortId)).append("\n");
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

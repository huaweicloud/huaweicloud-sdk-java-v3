package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SkuSpecBaseResponsePoolInfoAosp
 */
public class SkuSpecBaseResponsePoolInfoAosp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resPoolId")

    private String resPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private String network;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public SkuSpecBaseResponsePoolInfoAosp withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * aosp版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SkuSpecBaseResponsePoolInfoAosp withResPoolId(String resPoolId) {
        this.resPoolId = resPoolId;
        return this;
    }

    /**
     * 资源池id
     * @return resPoolId
     */
    public String getResPoolId() {
        return resPoolId;
    }

    public void setResPoolId(String resPoolId) {
        this.resPoolId = resPoolId;
    }

    public SkuSpecBaseResponsePoolInfoAosp withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * sku表该数据主键id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SkuSpecBaseResponsePoolInfoAosp withNetwork(String network) {
        this.network = network;
        return this;
    }

    /**
     * 网络类型。取值：EIP, ADN
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public SkuSpecBaseResponsePoolInfoAosp withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启。取值：true, fasle
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SkuSpecBaseResponsePoolInfoAosp that = (SkuSpecBaseResponsePoolInfoAosp) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.resPoolId, that.resPoolId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.network, that.network)
            && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, resPoolId, id, network, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuSpecBaseResponsePoolInfoAosp {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    resPoolId: ").append(toIndentedString(resPoolId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

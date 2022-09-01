package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateNet2CloudPhoneServerRequestBody
 */
public class CreateNet2CloudPhoneServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    @JacksonXmlProperty(localName = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    @JacksonXmlProperty(localName = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    @JacksonXmlProperty(localName = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    @JacksonXmlProperty(localName = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    @JacksonXmlProperty(localName = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "br_cidr")

    @JacksonXmlProperty(localName = "br_cidr")

    private String brCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    @JacksonXmlProperty(localName = "ports")

    private List<CreateNet2CloudPhoneServerRequestBodyPorts> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    @JacksonXmlProperty(localName = "extend_param")

    private CreateNet2CloudPhoneServerRequestBodyExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_vpc_id")

    @JacksonXmlProperty(localName = "tenant_vpc_id")

    private String tenantVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    @JacksonXmlProperty(localName = "nics")

    private List<CreateNet2CloudPhoneServerRequestBodyNics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    @JacksonXmlProperty(localName = "public_ip")

    private CreateNet2CloudPhoneServerRequestBodyPublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width")

    @JacksonXmlProperty(localName = "band_width")

    private CreateNet2CloudPhoneServerRequestBodyBandWidth bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    @JacksonXmlProperty(localName = "availability_zone")

    private String availabilityZone;

    public CreateNet2CloudPhoneServerRequestBody withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称  不超过60个字符，只支持英文字母、数字、汉字、下划线和中划线。  批量购买会在服务器名称后自动添加序号，比如设置此参数为server-1，那么创建的云手机服务器名称会自动按序增加数字后缀，比如为server-1-0001
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public CreateNet2CloudPhoneServerRequestBody withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机服务器规格，不超过64个字节
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public CreateNet2CloudPhoneServerRequestBody withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 云手机规格，不超过64个字节
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public CreateNet2CloudPhoneServerRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 云手机镜像ID，不超过32个字节
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public CreateNet2CloudPhoneServerRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买的云手机服务器个数，最多可购买10台
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateNet2CloudPhoneServerRequestBody withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 密钥对名称，不超过64个字节，用于云手机ADB登录
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public CreateNet2CloudPhoneServerRequestBody withBrCidr(String brCidr) {
        this.brCidr = brCidr;
        return this;
    }

    /**
     * Get brCidr
     * @return brCidr
     */
    public String getBrCidr() {
        return brCidr;
    }

    public void setBrCidr(String brCidr) {
        this.brCidr = brCidr;
    }

    public CreateNet2CloudPhoneServerRequestBody withPorts(List<CreateNet2CloudPhoneServerRequestBodyPorts> ports) {
        this.ports = ports;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody addPortsItem(CreateNet2CloudPhoneServerRequestBodyPorts portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withPorts(
        Consumer<List<CreateNet2CloudPhoneServerRequestBodyPorts>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 云手机启用的应用端口，云手机服务会做端口转发
     * @return ports
     */
    public List<CreateNet2CloudPhoneServerRequestBodyPorts> getPorts() {
        return ports;
    }

    public void setPorts(List<CreateNet2CloudPhoneServerRequestBodyPorts> ports) {
        this.ports = ports;
    }

    public CreateNet2CloudPhoneServerRequestBody withExtendParam(
        CreateNet2CloudPhoneServerRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withExtendParam(
        Consumer<CreateNet2CloudPhoneServerRequestBodyExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new CreateNet2CloudPhoneServerRequestBodyExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public CreateNet2CloudPhoneServerRequestBodyExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreateNet2CloudPhoneServerRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public CreateNet2CloudPhoneServerRequestBody withTenantVpcId(String tenantVpcId) {
        this.tenantVpcId = tenantVpcId;
        return this;
    }

    /**
     * 租户自定义的VPC ID，为待创建的云服务器所属的虚拟私有云（简称VPC），需要指定已创建VPC的ID，UUID格式
     * @return tenantVpcId
     */
    public String getTenantVpcId() {
        return tenantVpcId;
    }

    public void setTenantVpcId(String tenantVpcId) {
        this.tenantVpcId = tenantVpcId;
    }

    public CreateNet2CloudPhoneServerRequestBody withNics(List<CreateNet2CloudPhoneServerRequestBodyNics> nics) {
        this.nics = nics;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody addNicsItem(CreateNet2CloudPhoneServerRequestBodyNics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withNics(
        Consumer<List<CreateNet2CloudPhoneServerRequestBodyNics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 租户自定义的网卡的结构体，为待创建的云服务器的网卡信息
     * @return nics
     */
    public List<CreateNet2CloudPhoneServerRequestBodyNics> getNics() {
        return nics;
    }

    public void setNics(List<CreateNet2CloudPhoneServerRequestBodyNics> nics) {
        this.nics = nics;
    }

    public CreateNet2CloudPhoneServerRequestBody withPublicIp(CreateNet2CloudPhoneServerRequestBodyPublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withPublicIp(
        Consumer<CreateNet2CloudPhoneServerRequestBodyPublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new CreateNet2CloudPhoneServerRequestBodyPublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public CreateNet2CloudPhoneServerRequestBodyPublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(CreateNet2CloudPhoneServerRequestBodyPublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public CreateNet2CloudPhoneServerRequestBody withBandWidth(
        CreateNet2CloudPhoneServerRequestBodyBandWidth bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withBandWidth(
        Consumer<CreateNet2CloudPhoneServerRequestBodyBandWidth> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new CreateNet2CloudPhoneServerRequestBodyBandWidth();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public CreateNet2CloudPhoneServerRequestBodyBandWidth getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(CreateNet2CloudPhoneServerRequestBodyBandWidth bandWidth) {
        this.bandWidth = bandWidth;
    }

    public CreateNet2CloudPhoneServerRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 待创建云服务器所在的可用区，需要指定可用区（AZ）的名称
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBody createNet2CloudPhoneServerRequestBody =
            (CreateNet2CloudPhoneServerRequestBody) o;
        return Objects.equals(this.serverName, createNet2CloudPhoneServerRequestBody.serverName)
            && Objects.equals(this.serverModelName, createNet2CloudPhoneServerRequestBody.serverModelName)
            && Objects.equals(this.phoneModelName, createNet2CloudPhoneServerRequestBody.phoneModelName)
            && Objects.equals(this.imageId, createNet2CloudPhoneServerRequestBody.imageId)
            && Objects.equals(this.count, createNet2CloudPhoneServerRequestBody.count)
            && Objects.equals(this.keypairName, createNet2CloudPhoneServerRequestBody.keypairName)
            && Objects.equals(this.brCidr, createNet2CloudPhoneServerRequestBody.brCidr)
            && Objects.equals(this.ports, createNet2CloudPhoneServerRequestBody.ports)
            && Objects.equals(this.extendParam, createNet2CloudPhoneServerRequestBody.extendParam)
            && Objects.equals(this.tenantVpcId, createNet2CloudPhoneServerRequestBody.tenantVpcId)
            && Objects.equals(this.nics, createNet2CloudPhoneServerRequestBody.nics)
            && Objects.equals(this.publicIp, createNet2CloudPhoneServerRequestBody.publicIp)
            && Objects.equals(this.bandWidth, createNet2CloudPhoneServerRequestBody.bandWidth)
            && Objects.equals(this.availabilityZone, createNet2CloudPhoneServerRequestBody.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName,
            serverModelName,
            phoneModelName,
            imageId,
            count,
            keypairName,
            brCidr,
            ports,
            extendParam,
            tenantVpcId,
            nics,
            publicIp,
            bandWidth,
            availabilityZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNet2CloudPhoneServerRequestBody {\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    brCidr: ").append(toIndentedString(brCidr)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    tenantVpcId: ").append(toIndentedString(tenantVpcId)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
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

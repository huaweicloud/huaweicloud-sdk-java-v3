package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

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

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<Port> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private CreateNet2CloudPhoneServerRequestBodyExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_vpc_id")

    private String tenantVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private CreateNet2CloudPhoneServerRequestBodyPublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_width")

    private CreateNet2CloudPhoneServerRequestBodyBandWidth bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    public CreateNet2CloudPhoneServerRequestBody withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称，  不超过60个字符，只支持英文字母、数字、汉字、下划线和中划线。  批量购买会在服务器名称后自动添加序号，比如设置此参数为server-1，那么创建的云手机服务器名称会自动按序增加数字后缀，比如为server-1-0001。
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
     * 云手机服务器规格，不超过64个字节。
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
     * 云手机规格，不超过64个字节。
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
     * 云手机镜像ID，不超过32个字节。
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
     * 购买的云手机服务器个数，最多可购买10台。
     * minimum: 0
     * maximum: 1024
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
     * 密钥对名称，不超过64个字节，用于云手机ADB登录。
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public CreateNet2CloudPhoneServerRequestBody withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody addPortsItem(Port portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withPorts(Consumer<List<Port>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * 云手机启用的应用端口，云手机服务会做端口转发。
     * @return ports
     */
    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
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
     * 租户自定义的VPC ID，为待创建的云服务器所属的虚拟私有云（简称VPC），需要指定已创建VPC的ID，UUID格式。
     * @return tenantVpcId
     */
    public String getTenantVpcId() {
        return tenantVpcId;
    }

    public void setTenantVpcId(String tenantVpcId) {
        this.tenantVpcId = tenantVpcId;
    }

    public CreateNet2CloudPhoneServerRequestBody withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateNet2CloudPhoneServerRequestBody withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 租户自定义的网卡的结构体，为待创建的云服务器的网卡信息。
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
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
     * 待创建云服务器所在的可用区，需要指定可用区（AZ）的名称。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNet2CloudPhoneServerRequestBody that = (CreateNet2CloudPhoneServerRequestBody) obj;
        return Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverModelName, that.serverModelName)
            && Objects.equals(this.phoneModelName, that.phoneModelName) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.count, that.count) && Objects.equals(this.keypairName, that.keypairName)
            && Objects.equals(this.ports, that.ports) && Objects.equals(this.extendParam, that.extendParam)
            && Objects.equals(this.tenantVpcId, that.tenantVpcId) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.bandWidth, that.bandWidth)
            && Objects.equals(this.availabilityZone, that.availabilityZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName,
            serverModelName,
            phoneModelName,
            imageId,
            count,
            keypairName,
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

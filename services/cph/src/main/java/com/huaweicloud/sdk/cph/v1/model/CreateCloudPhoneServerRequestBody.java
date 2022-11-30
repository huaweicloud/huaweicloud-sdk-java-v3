package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCloudPhoneServerRequestBody
 */
public class CreateCloudPhoneServerRequestBody {

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
    @JsonProperty(value = "band_width")

    private CreateCloudPhoneServerRequestBodyBandWidth bandWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_param")

    private CreateCloudPhoneServerRequestBodyExtendParam extendParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnc_enable")

    private String vncEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    public CreateCloudPhoneServerRequestBody withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称 不超过60个字符，只支持英文字母、数字、汉字、下划线和中划线。 批量购买会在服务器名称后自动添加序号，比如设置此参数为server-1，那么创建的云手机服务器名称会自动按序增加数字后缀，比如为server-1-0001
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public CreateCloudPhoneServerRequestBody withServerModelName(String serverModelName) {
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

    public CreateCloudPhoneServerRequestBody withPhoneModelName(String phoneModelName) {
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

    public CreateCloudPhoneServerRequestBody withImageId(String imageId) {
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

    public CreateCloudPhoneServerRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买的云手机服务器个数，最多可购买10台
     * minimum: 0
     * maximum: 64
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CreateCloudPhoneServerRequestBody withKeypairName(String keypairName) {
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

    public CreateCloudPhoneServerRequestBody withPorts(List<Port> ports) {
        this.ports = ports;
        return this;
    }

    public CreateCloudPhoneServerRequestBody addPortsItem(Port portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public CreateCloudPhoneServerRequestBody withPorts(Consumer<List<Port>> portsSetter) {
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
    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    public CreateCloudPhoneServerRequestBody withBandWidth(CreateCloudPhoneServerRequestBodyBandWidth bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public CreateCloudPhoneServerRequestBody withBandWidth(
        Consumer<CreateCloudPhoneServerRequestBodyBandWidth> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new CreateCloudPhoneServerRequestBodyBandWidth();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public CreateCloudPhoneServerRequestBodyBandWidth getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(CreateCloudPhoneServerRequestBodyBandWidth bandWidth) {
        this.bandWidth = bandWidth;
    }

    public CreateCloudPhoneServerRequestBody withExtendParam(CreateCloudPhoneServerRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
        return this;
    }

    public CreateCloudPhoneServerRequestBody withExtendParam(
        Consumer<CreateCloudPhoneServerRequestBodyExtendParam> extendParamSetter) {
        if (this.extendParam == null) {
            this.extendParam = new CreateCloudPhoneServerRequestBodyExtendParam();
            extendParamSetter.accept(this.extendParam);
        }

        return this;
    }

    /**
     * Get extendParam
     * @return extendParam
     */
    public CreateCloudPhoneServerRequestBodyExtendParam getExtendParam() {
        return extendParam;
    }

    public void setExtendParam(CreateCloudPhoneServerRequestBodyExtendParam extendParam) {
        this.extendParam = extendParam;
    }

    public CreateCloudPhoneServerRequestBody withVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
        return this;
    }

    /**
     * (已废弃)是否开启VNC方式登录云手机。 - 为\"true\"时开启（忽略大小写）。 - 为其他，则不开启
     * @return vncEnable
     */
    public String getVncEnable() {
        return vncEnable;
    }

    public void setVncEnable(String vncEnable) {
        this.vncEnable = vncEnable;
    }

    public CreateCloudPhoneServerRequestBody withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 服务器的子网信息，第一次购买系统会自动创建172.31.0.0/16的子网。需要自定义子网的客户，需要全部通过API购买，设置的子网，必须是子网的格式且和已有子网不能重叠
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCloudPhoneServerRequestBody createCloudPhoneServerRequestBody = (CreateCloudPhoneServerRequestBody) o;
        return Objects.equals(this.serverName, createCloudPhoneServerRequestBody.serverName)
            && Objects.equals(this.serverModelName, createCloudPhoneServerRequestBody.serverModelName)
            && Objects.equals(this.phoneModelName, createCloudPhoneServerRequestBody.phoneModelName)
            && Objects.equals(this.imageId, createCloudPhoneServerRequestBody.imageId)
            && Objects.equals(this.count, createCloudPhoneServerRequestBody.count)
            && Objects.equals(this.keypairName, createCloudPhoneServerRequestBody.keypairName)
            && Objects.equals(this.ports, createCloudPhoneServerRequestBody.ports)
            && Objects.equals(this.bandWidth, createCloudPhoneServerRequestBody.bandWidth)
            && Objects.equals(this.extendParam, createCloudPhoneServerRequestBody.extendParam)
            && Objects.equals(this.vncEnable, createCloudPhoneServerRequestBody.vncEnable)
            && Objects.equals(this.subnetCidr, createCloudPhoneServerRequestBody.subnetCidr);
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
            bandWidth,
            extendParam,
            vncEnable,
            subnetCidr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneServerRequestBody {\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
        sb.append("    extendParam: ").append(toIndentedString(extendParam)).append("\n");
        sb.append("    vncEnable: ").append(toIndentedString(vncEnable)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
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

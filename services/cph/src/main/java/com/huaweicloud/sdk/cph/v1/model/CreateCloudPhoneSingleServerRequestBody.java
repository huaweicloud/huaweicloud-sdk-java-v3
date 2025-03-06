package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建云手机裸服务器请求体
 */
public class CreateCloudPhoneSingleServerRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_param")

    private CreateCloudPhoneSingleServerRequestBodyOrderParam orderParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<NicForSingleServer> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private CreateCloudPhoneSingleServerRequestBodyPublicIp publicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume")

    private CreateCloudPhoneSingleServerRequestBodyDataVolume dataVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    public CreateCloudPhoneSingleServerRequestBody withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机裸服务器名称，不超过60个字符，只支持英文字母、数字、汉字、下划线和中划线。批量购买会在云手机裸服务器名称后自动添加序号，比如设置此参数为server-1，那么创建的云手机裸服务器名称会自动按序增加数字后缀，比如为server-1-0001。
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public CreateCloudPhoneSingleServerRequestBody withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机裸服务器规格名称。
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public CreateCloudPhoneSingleServerRequestBody withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 购买的云手机裸服务器个数，最多可购买10台。
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

    public CreateCloudPhoneSingleServerRequestBody withOrderParam(
        CreateCloudPhoneSingleServerRequestBodyOrderParam orderParam) {
        this.orderParam = orderParam;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBody withOrderParam(
        Consumer<CreateCloudPhoneSingleServerRequestBodyOrderParam> orderParamSetter) {
        if (this.orderParam == null) {
            this.orderParam = new CreateCloudPhoneSingleServerRequestBodyOrderParam();
            orderParamSetter.accept(this.orderParam);
        }

        return this;
    }

    /**
     * Get orderParam
     * @return orderParam
     */
    public CreateCloudPhoneSingleServerRequestBodyOrderParam getOrderParam() {
        return orderParam;
    }

    public void setOrderParam(CreateCloudPhoneSingleServerRequestBodyOrderParam orderParam) {
        this.orderParam = orderParam;
    }

    public CreateCloudPhoneSingleServerRequestBody withNics(List<NicForSingleServer> nics) {
        this.nics = nics;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBody addNicsItem(NicForSingleServer nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBody withNics(Consumer<List<NicForSingleServer>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 租户自定义的网卡的结构体，为待创建的云手机裸服务器的网卡信息。
     * @return nics
     */
    public List<NicForSingleServer> getNics() {
        return nics;
    }

    public void setNics(List<NicForSingleServer> nics) {
        this.nics = nics;
    }

    public CreateCloudPhoneSingleServerRequestBody withPublicIp(
        CreateCloudPhoneSingleServerRequestBodyPublicIp publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBody withPublicIp(
        Consumer<CreateCloudPhoneSingleServerRequestBodyPublicIp> publicIpSetter) {
        if (this.publicIp == null) {
            this.publicIp = new CreateCloudPhoneSingleServerRequestBodyPublicIp();
            publicIpSetter.accept(this.publicIp);
        }

        return this;
    }

    /**
     * Get publicIp
     * @return publicIp
     */
    public CreateCloudPhoneSingleServerRequestBodyPublicIp getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(CreateCloudPhoneSingleServerRequestBodyPublicIp publicIp) {
        this.publicIp = publicIp;
    }

    public CreateCloudPhoneSingleServerRequestBody withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 待创建云手机裸服务器所在的可用区（AZ）的名称。如上海一可用区1为cn-east-3a。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public CreateCloudPhoneSingleServerRequestBody withDataVolume(
        CreateCloudPhoneSingleServerRequestBodyDataVolume dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public CreateCloudPhoneSingleServerRequestBody withDataVolume(
        Consumer<CreateCloudPhoneSingleServerRequestBodyDataVolume> dataVolumeSetter) {
        if (this.dataVolume == null) {
            this.dataVolume = new CreateCloudPhoneSingleServerRequestBodyDataVolume();
            dataVolumeSetter.accept(this.dataVolume);
        }

        return this;
    }

    /**
     * Get dataVolume
     * @return dataVolume
     */
    public CreateCloudPhoneSingleServerRequestBodyDataVolume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(CreateCloudPhoneSingleServerRequestBodyDataVolume dataVolume) {
        this.dataVolume = dataVolume;
    }

    public CreateCloudPhoneSingleServerRequestBody withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 指定登录云手机裸服务器已有密钥的名称。
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public CreateCloudPhoneSingleServerRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 该字段不传（或传为字符串“0”），则将资源绑定给默认企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateCloudPhoneSingleServerRequestBody withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 云手机裸服务器镜像ID，不超过36个字节。未指定时使用默认云手机裸服务器镜像。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCloudPhoneSingleServerRequestBody that = (CreateCloudPhoneSingleServerRequestBody) obj;
        return Objects.equals(this.serverName, that.serverName)
            && Objects.equals(this.serverModelName, that.serverModelName) && Objects.equals(this.count, that.count)
            && Objects.equals(this.orderParam, that.orderParam) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.publicIp, that.publicIp)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.dataVolume, that.dataVolume) && Objects.equals(this.keypairName, that.keypairName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.imageId, that.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName,
            serverModelName,
            count,
            orderParam,
            nics,
            publicIp,
            availabilityZone,
            dataVolume,
            keypairName,
            enterpriseProjectId,
            imageId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCloudPhoneSingleServerRequestBody {\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    orderParam: ").append(toIndentedString(orderParam)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    dataVolume: ").append(toIndentedString(dataVolume)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级包在OBS的位置
 */
public class ObsLocation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket_name")

    private String bucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_key")

    private String objectKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign_method")

    private String signMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign")

    private String sign;

    public ObsLocation withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * **参数说明**：OBS所在区域。您可以从[[地区和终端节点](https://developer.huaweicloud.com/endpoint?OBS)](tag:hws)[[地区和终端节点](https://developer.huaweicloud.com/intl/zh-cn/endpoint?OBS)](tag:hws_hk)中查询服务的终端节点。 **取值范围**：长度不超过256，只允许字母、数字、连接符（-）的组合。
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ObsLocation withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * **参数说明**：OBS桶名称。 **取值范围**：长度最小为3，最大为63，只允许小写字母、数字、连接符（-）、英文点（.）的组合。
     * @return bucketName
     */
    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ObsLocation withObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }

    /**
     * **参数说明**：OBS对象名称(包含文件夹路径)。 **取值范围**：长度不超过1024。
     * @return objectKey
     */
    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public ObsLocation withSignMethod(String signMethod) {
        this.signMethod = signMethod;
        return this;
    }

    /**
     * **参数说明**： **取值范围**：只支持SHA256,不携带默认为SHA256。
     * @return signMethod
     */
    public String getSignMethod() {
        return signMethod;
    }

    public void setSignMethod(String signMethod) {
        this.signMethod = signMethod;
    }

    public ObsLocation withSign(String sign) {
        this.sign = sign;
        return this;
    }

    /**
     * **参数说明**：SHA256算法计算出的升级包签名值。添加该升级包完成，并创建升级任务后，物联网平台向设备下发升级通知时，会下发该签名给设备。 **取值范围**：长度为64，只允许大小写字母a到f、数字的组合。
     * @return sign
     */
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsLocation that = (ObsLocation) obj;
        return Objects.equals(this.regionName, that.regionName) && Objects.equals(this.bucketName, that.bucketName)
            && Objects.equals(this.objectKey, that.objectKey) && Objects.equals(this.signMethod, that.signMethod)
            && Objects.equals(this.sign, that.sign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, bucketName, objectKey, signMethod, sign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsLocation {\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    bucketName: ").append(toIndentedString(bucketName)).append("\n");
        sb.append("    objectKey: ").append(toIndentedString(objectKey)).append("\n");
        sb.append("    signMethod: ").append(toIndentedString(signMethod)).append("\n");
        sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
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

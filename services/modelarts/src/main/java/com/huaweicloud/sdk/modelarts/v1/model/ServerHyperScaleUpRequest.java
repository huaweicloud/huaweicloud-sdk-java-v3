package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerHyperScaleUpRequest
 */
public class ServerHyperScaleUpRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_volume")

    private EvsVolume rootVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volume")

    private ServerDataVolume dataVolume;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userdata")

    private String userdata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_pair_name")

    private String keyPairName;

    public ServerHyperScaleUpRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：服务器规格名称。 **约束限制**：不涉及。 **取值范围**：长度为1至128个字符，只能包含字母和数字及点。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public ServerHyperScaleUpRequest withRootVolume(EvsVolume rootVolume) {
        this.rootVolume = rootVolume;
        return this;
    }

    public ServerHyperScaleUpRequest withRootVolume(Consumer<EvsVolume> rootVolumeSetter) {
        if (this.rootVolume == null) {
            this.rootVolume = new EvsVolume();
            rootVolumeSetter.accept(this.rootVolume);
        }

        return this;
    }

    /**
     * Get rootVolume
     * @return rootVolume
     */
    public EvsVolume getRootVolume() {
        return rootVolume;
    }

    public void setRootVolume(EvsVolume rootVolume) {
        this.rootVolume = rootVolume;
    }

    public ServerHyperScaleUpRequest withDataVolume(ServerDataVolume dataVolume) {
        this.dataVolume = dataVolume;
        return this;
    }

    public ServerHyperScaleUpRequest withDataVolume(Consumer<ServerDataVolume> dataVolumeSetter) {
        if (this.dataVolume == null) {
            this.dataVolume = new ServerDataVolume();
            dataVolumeSetter.accept(this.dataVolume);
        }

        return this;
    }

    /**
     * Get dataVolume
     * @return dataVolume
     */
    public ServerDataVolume getDataVolume() {
        return dataVolume;
    }

    public void setDataVolume(ServerDataVolume dataVolume) {
        this.dataVolume = dataVolume;
    }

    public ServerHyperScaleUpRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：服务器镜像ID。 **约束限制**：不涉及。 **取值范围**：长度为36个字符，符合UUID格式。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ServerHyperScaleUpRequest withUserdata(String userdata) {
        this.userdata = userdata;
        return this;
    }

    /**
     * **参数解释**： 创建云服务器过程中待注入实例自定义数据。支持注入文本、文本文件。 示例： base64编码前： * Linux服务器： ```bash #!/bin/bash echo user_test > /home/user.txt ``` base64编码后： * Linux服务器： ```bash IyEvYmluL2Jhc2gKZWNobyB1c2VyX3Rlc3QgPiAvaG9tZS91c2VyLnR4dA== ``` 了解更多实例自定义数据注入请参考[[用户数据注入](https://support.huaweicloud.com/usermanual-ecs/zh-cn_topic_0032380449.html)](tag:hc)[[用户数据注入](https://support.huaweicloud.com/intl/zh-cn/usermanual-ecs/zh-cn_topic_0032380449.html)][ECS服务“通过实例自定义数据配置ECS实例”章节](tag:fcs,hcso)。 用户需明确user_data的使用效果，可能产生的影响和风险由用户自行承担。 **约束限制**： - user_data的值为base64编码之后的内容。 - 注入内容（编码之前的内容）最大长度为32K。  **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return userdata
     */
    public String getUserdata() {
        return userdata;
    }

    public void setUserdata(String userdata) {
        this.userdata = userdata;
    }

    public ServerHyperScaleUpRequest withKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }

    /**
     * **参数解释**：服务器登录密钥对名称。admin_pass和key_pair_name必须二选一。注意超节点扩容仅支持使用密钥对创建。 **约束限制**：admin_pass和key_pair_name不能同时存在。 **取值范围**：长度为1至64个字符，只能包含字母、数字、中划线、下划线和点。 **默认取值**：不涉及。
     * @return keyPairName
     */
    public String getKeyPairName() {
        return keyPairName;
    }

    public void setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerHyperScaleUpRequest that = (ServerHyperScaleUpRequest) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.rootVolume, that.rootVolume)
            && Objects.equals(this.dataVolume, that.dataVolume) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.userdata, that.userdata) && Objects.equals(this.keyPairName, that.keyPairName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, rootVolume, dataVolume, imageId, userdata, keyPairName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerHyperScaleUpRequest {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
        sb.append("    dataVolume: ").append(toIndentedString(dataVolume)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
        sb.append("    keyPairName: ").append(toIndentedString(keyPairName)).append("\n");
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

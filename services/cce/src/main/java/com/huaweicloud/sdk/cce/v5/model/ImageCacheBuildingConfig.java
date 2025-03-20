package com.huaweicloud.sdk.cce.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 镜像缓存构建配置信息。
 */
public class ImageCacheBuildingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private String cluster;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_pull_secrets")

    private List<String> imagePullSecrets = null;

    public ImageCacheBuildingConfig withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * **参数解释：** 构建镜像缓存所启动的临时Pod所在的Autopilot集群的UID。 **约束限制：** 要求使用的Autopilot集群版本为v1.28.8-r0或v1.31.4-r0以上版本。 **取值范围：** 不涉及 **默认取值：** 不涉及 
     * @return cluster
     */
    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public ImageCacheBuildingConfig withImagePullSecrets(List<String> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    public ImageCacheBuildingConfig addImagePullSecretsItem(String imagePullSecretsItem) {
        if (this.imagePullSecrets == null) {
            this.imagePullSecrets = new ArrayList<>();
        }
        this.imagePullSecrets.add(imagePullSecretsItem);
        return this;
    }

    public ImageCacheBuildingConfig withImagePullSecrets(Consumer<List<String>> imagePullSecretsSetter) {
        if (this.imagePullSecrets == null) {
            this.imagePullSecrets = new ArrayList<>();
        }
        imagePullSecretsSetter.accept(this.imagePullSecrets);
        return this;
    }

    /**
     * 下载所需缓存镜像的访问凭证列表，不填写或无有效凭证时仅支持下载公共镜像。
     * @return imagePullSecrets
     */
    public List<String> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(List<String> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageCacheBuildingConfig that = (ImageCacheBuildingConfig) obj;
        return Objects.equals(this.cluster, that.cluster)
            && Objects.equals(this.imagePullSecrets, that.imagePullSecrets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster, imagePullSecrets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageCacheBuildingConfig {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
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

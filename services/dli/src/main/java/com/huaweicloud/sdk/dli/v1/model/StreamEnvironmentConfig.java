package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 流作业的上下文配置。
 */
public class StreamEnvironmentConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_urn")

    private String executionAgencyUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_feature")

    private String imageFeature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_uri")

    private String imageUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    public StreamEnvironmentConfig withExecutionAgencyUrn(String executionAgencyUrn) {
        this.executionAgencyUrn = executionAgencyUrn;
        return this;
    }

    /**
     * 自定义委托名，定义作业级访问权限。
     * @return executionAgencyUrn
     */
    public String getExecutionAgencyUrn() {
        return executionAgencyUrn;
    }

    public void setExecutionAgencyUrn(String executionAgencyUrn) {
        this.executionAgencyUrn = executionAgencyUrn;
    }

    public StreamEnvironmentConfig withImageFeature(String imageFeature) {
        this.imageFeature = imageFeature;
        return this;
    }

    /**
     * 表示用户作业使用的镜像类型。basic：表示使用 DLI 提供的基础镜像； custom：表示使用用户自定义的镜像。
     * @return imageFeature
     */
    public String getImageFeature() {
        return imageFeature;
    }

    public void setImageFeature(String imageFeature) {
        this.imageFeature = imageFeature;
    }

    public StreamEnvironmentConfig withImageUri(String imageUri) {
        this.imageUri = imageUri;
        return this;
    }

    /**
     * 自定义镜像。当前只支持 SWR，格式为：组织名/镜像名:镜像版本。当用户设置“image_feature”为“custom”时，该参数生效。用户可通过与“image_feature”参数配合使用，指定作业运行使用自定义的镜像。关于如何使用自定义镜像，请参考《数据湖探索用户指南》。
     * @return imageUri
     */
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public StreamEnvironmentConfig withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。长度限制：1-128个字符。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamEnvironmentConfig that = (StreamEnvironmentConfig) obj;
        return Objects.equals(this.executionAgencyUrn, that.executionAgencyUrn)
            && Objects.equals(this.imageFeature, that.imageFeature) && Objects.equals(this.imageUri, that.imageUri)
            && Objects.equals(this.queueName, that.queueName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executionAgencyUrn, imageFeature, imageUri, queueName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamEnvironmentConfig {\n");
        sb.append("    executionAgencyUrn: ").append(toIndentedString(executionAgencyUrn)).append("\n");
        sb.append("    imageFeature: ").append(toIndentedString(imageFeature)).append("\n");
        sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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

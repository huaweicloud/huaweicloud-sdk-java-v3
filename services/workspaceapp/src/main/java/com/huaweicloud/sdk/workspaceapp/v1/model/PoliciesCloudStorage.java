package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云存储配置。
 */
public class PoliciesCloudStorage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_storage_enable")

    private Boolean cloudStorageEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private CloudStorageOptions options;

    public PoliciesCloudStorage withCloudStorageEnable(Boolean cloudStorageEnable) {
        this.cloudStorageEnable = cloudStorageEnable;
        return this;
    }

    /**
     * 云存储配置开关： false: 表示关闭 true: 表示开启
     * @return cloudStorageEnable
     */
    public Boolean getCloudStorageEnable() {
        return cloudStorageEnable;
    }

    public void setCloudStorageEnable(Boolean cloudStorageEnable) {
        this.cloudStorageEnable = cloudStorageEnable;
    }

    public PoliciesCloudStorage withOptions(CloudStorageOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesCloudStorage withOptions(Consumer<CloudStorageOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new CloudStorageOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public CloudStorageOptions getOptions() {
        return options;
    }

    public void setOptions(CloudStorageOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesCloudStorage that = (PoliciesCloudStorage) obj;
        return Objects.equals(this.cloudStorageEnable, that.cloudStorageEnable)
            && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cloudStorageEnable, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesCloudStorage {\n");
        sb.append("    cloudStorageEnable: ").append(toIndentedString(cloudStorageEnable)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

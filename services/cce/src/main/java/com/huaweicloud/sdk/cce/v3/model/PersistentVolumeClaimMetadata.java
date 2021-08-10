package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** metadata是集群对象的元数据定义，是集合类的元素类型，包含一组由不同名称定义的属性。 */
public class PersistentVolumeClaimMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private String labels;

    public PersistentVolumeClaimMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /** PersistentVolumeClaim名称，可以包含小写字母、数字、连字符和点，开头和结尾必须是字母或数字，最长253个字符，同一namespace下name不能重复。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersistentVolumeClaimMetadata withLabels(String labels) {
        this.labels = labels;
        return this;
    }

    /** PersistentVolumeClaim标签，key/value对格式。 -
     * Key：必须以字母或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符；另外可以使用DNS子域作为前缀，例如example.com/my-key， DNS子域最长253个字符。 -
     * Value：可以为空或者非空字符串，非空字符串必须以字符或数字开头，可以包含字母、数字、连字符、下划线和点，最长63个字符。
     * 
     * @return labels */
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistentVolumeClaimMetadata persistentVolumeClaimMetadata = (PersistentVolumeClaimMetadata) o;
        return Objects.equals(this.name, persistentVolumeClaimMetadata.name)
            && Objects.equals(this.labels, persistentVolumeClaimMetadata.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistentVolumeClaimMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

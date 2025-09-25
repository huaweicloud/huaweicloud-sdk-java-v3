package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建药物作业基本信息
 */
public class CreateDrugJobBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upstream_job_info")

    private String upstreamJobInfo;

    public CreateDrugJobBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称，取值范围：[5,64]，允许大小写字母、数字、空格、下划线(_)和中划线(-),只能以数字或字母开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDrugJobBasicInfo withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CreateDrugJobBasicInfo addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateDrugJobBasicInfo withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签，取值范围[0,5]，单个标签最大长度32字符，支持中文、字母、数字、空格、下划线和中划线，且不能以空格开头或者结尾。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public CreateDrugJobBasicInfo withUpstreamJobInfo(String upstreamJobInfo) {
        this.upstreamJobInfo = upstreamJobInfo;
        return this;
    }

    /**
     * **参数解释**： 上游作业信息。 **约束限制**： 不涉及 **取值范围**： 长度为[1-10240]个字符。 **默认取值**： 不涉及 
     * @return upstreamJobInfo
     */
    public String getUpstreamJobInfo() {
        return upstreamJobInfo;
    }

    public void setUpstreamJobInfo(String upstreamJobInfo) {
        this.upstreamJobInfo = upstreamJobInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateDrugJobBasicInfo that = (CreateDrugJobBasicInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.upstreamJobInfo, that.upstreamJobInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, labels, upstreamJobInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDrugJobBasicInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    upstreamJobInfo: ").append(toIndentedString(upstreamJobInfo)).append("\n");
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

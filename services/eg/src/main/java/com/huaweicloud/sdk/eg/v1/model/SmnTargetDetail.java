package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 订阅的SMN事件目标参数列表，该字段序列化后总长度不超过1024字节
 */
public class SmnTargetDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_transform")

    private SmnTargetDetailSubjectTransform subjectTransform;

    public SmnTargetDetail withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 主题urn
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SmnTargetDetail withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * 委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public SmnTargetDetail withSubjectTransform(SmnTargetDetailSubjectTransform subjectTransform) {
        this.subjectTransform = subjectTransform;
        return this;
    }

    public SmnTargetDetail withSubjectTransform(Consumer<SmnTargetDetailSubjectTransform> subjectTransformSetter) {
        if (this.subjectTransform == null) {
            this.subjectTransform = new SmnTargetDetailSubjectTransform();
            subjectTransformSetter.accept(this.subjectTransform);
        }

        return this;
    }

    /**
     * Get subjectTransform
     * @return subjectTransform
     */
    public SmnTargetDetailSubjectTransform getSubjectTransform() {
        return subjectTransform;
    }

    public void setSubjectTransform(SmnTargetDetailSubjectTransform subjectTransform) {
        this.subjectTransform = subjectTransform;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmnTargetDetail that = (SmnTargetDetail) obj;
        return Objects.equals(this.urn, that.urn) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.subjectTransform, that.subjectTransform);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urn, agencyName, subjectTransform);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmnTargetDetail {\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    subjectTransform: ").append(toIndentedString(subjectTransform)).append("\n");
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

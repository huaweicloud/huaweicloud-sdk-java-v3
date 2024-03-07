package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问预览配置。
 */
public class ModelConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_agency")

    private IAMAgency iamAgency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private OBSBucket obsBucket;

    public ModelConfiguration withIamAgency(IAMAgency iamAgency) {
        this.iamAgency = iamAgency;
        return this;
    }

    public ModelConfiguration withIamAgency(Consumer<IAMAgency> iamAgencySetter) {
        if (this.iamAgency == null) {
            this.iamAgency = new IAMAgency();
            iamAgencySetter.accept(this.iamAgency);
        }

        return this;
    }

    /**
     * Get iamAgency
     * @return iamAgency
     */
    public IAMAgency getIamAgency() {
        return iamAgency;
    }

    public void setIamAgency(IAMAgency iamAgency) {
        this.iamAgency = iamAgency;
    }

    public ModelConfiguration withObsBucket(OBSBucket obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    public ModelConfiguration withObsBucket(Consumer<OBSBucket> obsBucketSetter) {
        if (this.obsBucket == null) {
            this.obsBucket = new OBSBucket();
            obsBucketSetter.accept(this.obsBucket);
        }

        return this;
    }

    /**
     * Get obsBucket
     * @return obsBucket
     */
    public OBSBucket getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(OBSBucket obsBucket) {
        this.obsBucket = obsBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelConfiguration that = (ModelConfiguration) obj;
        return Objects.equals(this.iamAgency, that.iamAgency) && Objects.equals(this.obsBucket, that.obsBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamAgency, obsBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelConfiguration {\n");
        sb.append("    iamAgency: ").append(toIndentedString(iamAgency)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
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

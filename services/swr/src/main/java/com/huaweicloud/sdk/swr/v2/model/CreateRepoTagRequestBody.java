package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateRepoTagRequestBody
 */
public class CreateRepoTagRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_tag")

    private String sourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_tag")

    private String destinationTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    public CreateRepoTagRequestBody withSourceTag(String sourceTag) {
        this.sourceTag = sourceTag;
        return this;
    }

    /**
     * 源镜像版本名称
     * @return sourceTag
     */
    public String getSourceTag() {
        return sourceTag;
    }

    public void setSourceTag(String sourceTag) {
        this.sourceTag = sourceTag;
    }

    public CreateRepoTagRequestBody withDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
        return this;
    }

    /**
     * 目标镜像版本名称
     * @return destinationTag
     */
    public String getDestinationTag() {
        return destinationTag;
    }

    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public CreateRepoTagRequestBody withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRepoTagRequestBody that = (CreateRepoTagRequestBody) obj;
        return Objects.equals(this.sourceTag, that.sourceTag)
            && Objects.equals(this.destinationTag, that.destinationTag) && Objects.equals(this.override, that.override);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceTag, destinationTag, override);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepoTagRequestBody {\n");
        sb.append("    sourceTag: ").append(toIndentedString(sourceTag)).append("\n");
        sb.append("    destinationTag: ").append(toIndentedString(destinationTag)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
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

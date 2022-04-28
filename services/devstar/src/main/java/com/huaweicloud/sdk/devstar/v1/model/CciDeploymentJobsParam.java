package com.huaweicloud.sdk.devstar.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CciDeploymentJobsParam
 */
public class CciDeploymentJobsParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    public CciDeploymentJobsParam withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 软件包或者镜像地址
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CciDeploymentJobsParam cciDeploymentJobsParam = (CciDeploymentJobsParam) o;
        return Objects.equals(this.image, cciDeploymentJobsParam.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CciDeploymentJobsParam {\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

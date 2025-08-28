package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 白名单规则为“specific_image_types”时，指定的镜像类型信息
 */
public class ImageWhiteListDetailResponseInfoQueryInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_type")

    private String imageType;

    public ImageWhiteListDetailResponseInfoQueryInfo withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * **参数解释**： 镜像类型（多个类型用逗号间隔） **取值范围**： - private_image：SWR私有镜像仓库。 - shared_image：SWR共享镜像仓库。 - instance_image：SWR企业仓库。 - harbor：harbor仓库。 - jfrog：jfrog仓库。 
     * @return imageType
     */
    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageWhiteListDetailResponseInfoQueryInfo that = (ImageWhiteListDetailResponseInfoQueryInfo) obj;
        return Objects.equals(this.imageType, that.imageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageWhiteListDetailResponseInfoQueryInfo {\n");
        sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
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

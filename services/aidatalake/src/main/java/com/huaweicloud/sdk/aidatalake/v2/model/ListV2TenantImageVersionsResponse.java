package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListV2TenantImageVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_versions")

    private List<V2ImageVersionInfo> imageVersions = null;

    public ListV2TenantImageVersionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：自定义镜像版本总记录数。 **取值范围**：最小值为0，最大值为100000。 
     * minimum: 0
     * maximum: 100000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListV2TenantImageVersionsResponse withImageVersions(List<V2ImageVersionInfo> imageVersions) {
        this.imageVersions = imageVersions;
        return this;
    }

    public ListV2TenantImageVersionsResponse addImageVersionsItem(V2ImageVersionInfo imageVersionsItem) {
        if (this.imageVersions == null) {
            this.imageVersions = new ArrayList<>();
        }
        this.imageVersions.add(imageVersionsItem);
        return this;
    }

    public ListV2TenantImageVersionsResponse withImageVersions(Consumer<List<V2ImageVersionInfo>> imageVersionsSetter) {
        if (this.imageVersions == null) {
            this.imageVersions = new ArrayList<>();
        }
        imageVersionsSetter.accept(this.imageVersions);
        return this;
    }

    /**
     * **参数解释**：镜像版本列表，每个元素为一个V2ImageVersionInfo对象，包含镜像版本ID、镜像版本、镜像分类、镜像架构、状态等信息。 
     * @return imageVersions
     */
    public List<V2ImageVersionInfo> getImageVersions() {
        return imageVersions;
    }

    public void setImageVersions(List<V2ImageVersionInfo> imageVersions) {
        this.imageVersions = imageVersions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListV2TenantImageVersionsResponse that = (ListV2TenantImageVersionsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.imageVersions, that.imageVersions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, imageVersions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListV2TenantImageVersionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    imageVersions: ").append(toIndentedString(imageVersions)).append("\n");
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

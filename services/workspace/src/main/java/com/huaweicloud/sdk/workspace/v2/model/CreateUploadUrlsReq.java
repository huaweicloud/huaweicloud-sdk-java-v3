package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取 OBS 预签名上传地址请求。
 */
public class CreateUploadUrlsReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slug")

    private String slug;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "regions")

    private List<String> regions = null;

    public CreateUploadUrlsReq withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * 技能slug（用于构建 OBS 路径）。
     * @return slug
     */
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public CreateUploadUrlsReq withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号（用于构建 OBS 路径）。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public CreateUploadUrlsReq withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 包文件名。
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public CreateUploadUrlsReq withRegions(List<String> regions) {
        this.regions = regions;
        return this;
    }

    public CreateUploadUrlsReq addRegionsItem(String regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    public CreateUploadUrlsReq withRegions(Consumer<List<String>> regionsSetter) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        regionsSetter.accept(this.regions);
        return this;
    }

    /**
     * 目标 region 列表。
     * @return regions
     */
    public List<String> getRegions() {
        return regions;
    }

    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUploadUrlsReq that = (CreateUploadUrlsReq) obj;
        return Objects.equals(this.slug, that.slug) && Objects.equals(this.version, that.version)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slug, version, packageName, regions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUploadUrlsReq {\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

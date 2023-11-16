package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class OutPutInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_info")

    private OutPutResult packageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_infos")

    private Map<String, OutPutResult> packageInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_infos")

    private Map<String, OutPutResult> imageInfos = null;

    public OutPutInfoResult withPackageInfo(OutPutResult packageInfo) {
        this.packageInfo = packageInfo;
        return this;
    }

    public OutPutInfoResult withPackageInfo(Consumer<OutPutResult> packageInfoSetter) {
        if (this.packageInfo == null) {
            this.packageInfo = new OutPutResult();
            packageInfoSetter.accept(this.packageInfo);
        }

        return this;
    }

    /**
     * Get packageInfo
     * @return packageInfo
     */
    public OutPutResult getPackageInfo() {
        return packageInfo;
    }

    public void setPackageInfo(OutPutResult packageInfo) {
        this.packageInfo = packageInfo;
    }

    public OutPutInfoResult withPackageInfos(Map<String, OutPutResult> packageInfos) {
        this.packageInfos = packageInfos;
        return this;
    }

    public OutPutInfoResult putPackageInfosItem(String key, OutPutResult packageInfosItem) {
        if (this.packageInfos == null) {
            this.packageInfos = new HashMap<>();
        }
        this.packageInfos.put(key, packageInfosItem);
        return this;
    }

    public OutPutInfoResult withPackageInfos(Consumer<Map<String, OutPutResult>> packageInfosSetter) {
        if (this.packageInfos == null) {
            this.packageInfos = new HashMap<>();
        }
        packageInfosSetter.accept(this.packageInfos);
        return this;
    }

    /**
     * 二方包信息
     * @return packageInfos
     */
    public Map<String, OutPutResult> getPackageInfos() {
        return packageInfos;
    }

    public void setPackageInfos(Map<String, OutPutResult> packageInfos) {
        this.packageInfos = packageInfos;
    }

    public OutPutInfoResult withImageInfos(Map<String, OutPutResult> imageInfos) {
        this.imageInfos = imageInfos;
        return this;
    }

    public OutPutInfoResult putImageInfosItem(String key, OutPutResult imageInfosItem) {
        if (this.imageInfos == null) {
            this.imageInfos = new HashMap<>();
        }
        this.imageInfos.put(key, imageInfosItem);
        return this;
    }

    public OutPutInfoResult withImageInfos(Consumer<Map<String, OutPutResult>> imageInfosSetter) {
        if (this.imageInfos == null) {
            this.imageInfos = new HashMap<>();
        }
        imageInfosSetter.accept(this.imageInfos);
        return this;
    }

    /**
     * 镜像包信息
     * @return imageInfos
     */
    public Map<String, OutPutResult> getImageInfos() {
        return imageInfos;
    }

    public void setImageInfos(Map<String, OutPutResult> imageInfos) {
        this.imageInfos = imageInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutPutInfoResult that = (OutPutInfoResult) obj;
        return Objects.equals(this.packageInfo, that.packageInfo)
            && Objects.equals(this.packageInfos, that.packageInfos) && Objects.equals(this.imageInfos, that.imageInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageInfo, packageInfos, imageInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutPutInfoResult {\n");
        sb.append("    packageInfo: ").append(toIndentedString(packageInfo)).append("\n");
        sb.append("    packageInfos: ").append(toIndentedString(packageInfos)).append("\n");
        sb.append("    imageInfos: ").append(toIndentedString(imageInfos)).append("\n");
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

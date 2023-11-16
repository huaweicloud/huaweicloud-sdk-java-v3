package com.huaweicloud.sdk.aad.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略响应
 */
public class PolicyResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_id")

    private String packageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_threshold")

    private Integer cleanThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_protected_ip")

    private Integer numProtectedIp;

    public PolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PolicyResponse withPackageId(String packageId) {
        this.packageId = packageId;
        return this;
    }

    /**
     * 防护包id
     * @return packageId
     */
    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public PolicyResponse withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * 防护包名
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public PolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PolicyResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 所属region的id
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public PolicyResponse withCleanThreshold(Integer cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
        return this;
    }

    /**
     * 清洗阈值
     * minimum: 100
     * maximum: 1000
     * @return cleanThreshold
     */
    public Integer getCleanThreshold() {
        return cleanThreshold;
    }

    public void setCleanThreshold(Integer cleanThreshold) {
        this.cleanThreshold = cleanThreshold;
    }

    public PolicyResponse withNumProtectedIp(Integer numProtectedIp) {
        this.numProtectedIp = numProtectedIp;
        return this;
    }

    /**
     * 防护ip数
     * minimum: 0
     * maximum: 2147483647
     * @return numProtectedIp
     */
    public Integer getNumProtectedIp() {
        return numProtectedIp;
    }

    public void setNumProtectedIp(Integer numProtectedIp) {
        this.numProtectedIp = numProtectedIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyResponse that = (PolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.packageId, that.packageId)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.region, that.region)
            && Objects.equals(this.cleanThreshold, that.cleanThreshold)
            && Objects.equals(this.numProtectedIp, that.numProtectedIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, packageId, packageName, name, description, region, cleanThreshold, numProtectedIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    cleanThreshold: ").append(toIndentedString(cleanThreshold)).append("\n");
        sb.append("    numProtectedIp: ").append(toIndentedString(numProtectedIp)).append("\n");
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

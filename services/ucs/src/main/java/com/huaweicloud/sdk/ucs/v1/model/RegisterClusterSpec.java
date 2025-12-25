package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群spec信息。
 */
public class RegisterClusterSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterGroupID")

    private String clusterGroupID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "city")

    private String city;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manageType")

    private String manageType;

    public RegisterClusterSpec withClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
        return this;
    }

    /**
     * 容器舰队ID信息。
     * @return clusterGroupID
     */
    public String getClusterGroupID() {
        return clusterGroupID;
    }

    public void setClusterGroupID(String clusterGroupID) {
        this.clusterGroupID = clusterGroupID;
    }

    public RegisterClusterSpec withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 集群类别，填写需要与provider和type对应，具体请参见[集群类别与类型说明](ucs_api_0024.xml)。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public RegisterClusterSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 集群类型，填写需要与category和provider对应，具体请参见[集群类别与类型说明](ucs_api_0024.xml)。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RegisterClusterSpec withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 供应商，填写需要与category和type对应，具体请参见[集群类别与类型说明](ucs_api_0024.xml)。 
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public RegisterClusterSpec withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 所在国家代码，具体代码请参见[国家码](ucs_api_0022.xml)。
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public RegisterClusterSpec withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 所在城市代码，具体代码请参见[城市码](ucs_api_0023.xml)。仅支持中国城市，其他国家无需填写。
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public RegisterClusterSpec withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 地域信息。仅在CCE导入集群注册时使用。可通过[获取未注册到UCS的CCE集群](ListManagedClusters.xml)接口的region字段获取。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RegisterClusterSpec withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * 项目ID信息。仅在CCE导入集群注册时使用。可通过[获取未注册到UCS的CCE集群](ListManagedClusters.xml)接口的projectID字段获取。
     * @return projectID
     */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public RegisterClusterSpec withManageType(String manageType) {
        this.manageType = manageType;
        return this;
    }

    /**
     * 集群管理类型信息。 取值如下： - grouped：在舰队中纳管的集群 - discrete：未加入舰队的集群
     * @return manageType
     */
    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterClusterSpec that = (RegisterClusterSpec) obj;
        return Objects.equals(this.clusterGroupID, that.clusterGroupID) && Objects.equals(this.category, that.category)
            && Objects.equals(this.type, that.type) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.country, that.country) && Objects.equals(this.city, that.city)
            && Objects.equals(this.region, that.region) && Objects.equals(this.projectID, that.projectID)
            && Objects.equals(this.manageType, that.manageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterGroupID, category, type, provider, country, city, region, projectID, manageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterClusterSpec {\n");
        sb.append("    clusterGroupID: ").append(toIndentedString(clusterGroupID)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    manageType: ").append(toIndentedString(manageType)).append("\n");
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

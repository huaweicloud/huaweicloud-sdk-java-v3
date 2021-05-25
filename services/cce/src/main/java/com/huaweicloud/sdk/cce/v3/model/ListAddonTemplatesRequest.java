package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListAddonTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addon_template_name")
    
    private String addonTemplateName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_update_addon_version")
    
    private String baseUpdateAddonVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="newest")
    
    private String newest;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    
    private String version;

    public ListAddonTemplatesRequest withAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
        return this;
    }

    


    /**
     * 指定的模板名称，不填写则查询列表。
     * @return addonTemplateName
     */
    public String getAddonTemplateName() {
        return addonTemplateName;
    }

    public void setAddonTemplateName(String addonTemplateName) {
        this.addonTemplateName = addonTemplateName;
    }

    

    public ListAddonTemplatesRequest withBaseUpdateAddonVersion(String baseUpdateAddonVersion) {
        this.baseUpdateAddonVersion = baseUpdateAddonVersion;
        return this;
    }

    


    /**
     * 含义：可接受的最低升级版本  属性：隐藏参数
     * @return baseUpdateAddonVersion
     */
    public String getBaseUpdateAddonVersion() {
        return baseUpdateAddonVersion;
    }

    public void setBaseUpdateAddonVersion(String baseUpdateAddonVersion) {
        this.baseUpdateAddonVersion = baseUpdateAddonVersion;
    }

    

    public ListAddonTemplatesRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 含义：查询的集群  属性：隐藏参数
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public ListAddonTemplatesRequest withNewest(String newest) {
        this.newest = newest;
        return this;
    }

    


    /**
     * 含义：是否获取最新插件  属性：隐藏参数
     * @return newest
     */
    public String getNewest() {
        return newest;
    }

    public void setNewest(String newest) {
        this.newest = newest;
    }

    

    public ListAddonTemplatesRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 含义：筛选的插件版本  属性：隐藏参数
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAddonTemplatesRequest listAddonTemplatesRequest = (ListAddonTemplatesRequest) o;
        return Objects.equals(this.addonTemplateName, listAddonTemplatesRequest.addonTemplateName) &&
            Objects.equals(this.baseUpdateAddonVersion, listAddonTemplatesRequest.baseUpdateAddonVersion) &&
            Objects.equals(this.clusterId, listAddonTemplatesRequest.clusterId) &&
            Objects.equals(this.newest, listAddonTemplatesRequest.newest) &&
            Objects.equals(this.version, listAddonTemplatesRequest.version);
    }
    @Override
    public int hashCode() {
        return Objects.hash(addonTemplateName, baseUpdateAddonVersion, clusterId, newest, version);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAddonTemplatesRequest {\n");
        sb.append("    addonTemplateName: ").append(toIndentedString(addonTemplateName)).append("\n");
        sb.append("    baseUpdateAddonVersion: ").append(toIndentedString(baseUpdateAddonVersion)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    newest: ").append(toIndentedString(newest)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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


package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneListPermissionsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page")
    
    private Integer page;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="per_page")
    
    private Integer perPage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permission_type")
    
    private String permissionType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="display_name")
    
    private String displayName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="catalog")
    
    private String catalog;

    public KeystoneListPermissionsRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 系统内部呈现的权限名称。如云目录服务CCS普通用户权限CCS User的name为ccs_user。 建议您传参display_name，不传name参数。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public KeystoneListPermissionsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 账号ID，获取方式请参见：[获取账号ID](https://support.huaweicloud.com/api-iam/iam_17_0002.html)。 > - 如果填写此参数，则返回账号下所有自定义策略。 > - 如果不填写此参数，则返回所有系统权限（包含系统策略和系统角色）。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public KeystoneListPermissionsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    


    /**
     * 分页查询时数据的页数，查询值最小为1。需要与per_page同时存在。传入domain_id参数查询自定义策略时，可配套使用。
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    

    public KeystoneListPermissionsRequest withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    


    /**
     * 分页查询时每页的数据个数，取值范围为[1,300]，默认值为300。需要与page同时存在。不传page和per_page参数时，每页最多返回300个权限。
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    

    public KeystoneListPermissionsRequest withPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    


    /**
     * 区分系统权限类型的参数。当domain_id参数为空时生效。 > - policy：返回系统策略。 > - role：返回系统角色。
     * @return permissionType
     */
    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    

    public KeystoneListPermissionsRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    


    /**
     * 过滤权限名称。如传参为Administrator，则返回满足条件的所有管理员权限。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    

    public KeystoneListPermissionsRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 过滤权限的显示模式。取值范围：domain,project,all。type为domain时，返回type=AA或AX的权限；type为project时，返回type=AA或XA的权限；type为all时返回type为AA、AX、XA的权限。 > - AX表示在domain层显示。 > - XA表示在project层显示。 > - AA表示在domain和project层均显示。 > - XX表示在domain和project层均不显示。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public KeystoneListPermissionsRequest withCatalog(String catalog) {
        this.catalog = catalog;
        return this;
    }

    


    /**
     * 权限所在目录。catalog值精确匹配策略的catalog字段(可以过滤服务的策略、或者自定义策略)。
     * @return catalog
     */
    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneListPermissionsRequest keystoneListPermissionsRequest = (KeystoneListPermissionsRequest) o;
        return Objects.equals(this.name, keystoneListPermissionsRequest.name) &&
            Objects.equals(this.domainId, keystoneListPermissionsRequest.domainId) &&
            Objects.equals(this.page, keystoneListPermissionsRequest.page) &&
            Objects.equals(this.perPage, keystoneListPermissionsRequest.perPage) &&
            Objects.equals(this.permissionType, keystoneListPermissionsRequest.permissionType) &&
            Objects.equals(this.displayName, keystoneListPermissionsRequest.displayName) &&
            Objects.equals(this.type, keystoneListPermissionsRequest.type) &&
            Objects.equals(this.catalog, keystoneListPermissionsRequest.catalog);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, domainId, page, perPage, permissionType, displayName, type, catalog);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneListPermissionsRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    catalog: ").append(toIndentedString(catalog)).append("\n");
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


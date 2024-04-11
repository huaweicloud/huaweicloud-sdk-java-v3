package com.huaweicloud.sdk.drs.v5.model;

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
public class ListsAgencyPermissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common_permissions")

    private List<String> commonPermissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_permissions")

    private List<String> enginePermissions = null;

    public ListsAgencyPermissionsResponse withCommonPermissions(List<String> commonPermissions) {
        this.commonPermissions = commonPermissions;
        return this;
    }

    public ListsAgencyPermissionsResponse addCommonPermissionsItem(String commonPermissionsItem) {
        if (this.commonPermissions == null) {
            this.commonPermissions = new ArrayList<>();
        }
        this.commonPermissions.add(commonPermissionsItem);
        return this;
    }

    public ListsAgencyPermissionsResponse withCommonPermissions(Consumer<List<String>> commonPermissionsSetter) {
        if (this.commonPermissions == null) {
            this.commonPermissions = new ArrayList<>();
        }
        commonPermissionsSetter.accept(this.commonPermissions);
        return this;
    }

    /**
     * - DRS FullAccess 数据复制服务所有权限
     * @return commonPermissions
     */
    public List<String> getCommonPermissions() {
        return commonPermissions;
    }

    public void setCommonPermissions(List<String> commonPermissions) {
        this.commonPermissions = commonPermissions;
    }

    public ListsAgencyPermissionsResponse withEnginePermissions(List<String> enginePermissions) {
        this.enginePermissions = enginePermissions;
        return this;
    }

    public ListsAgencyPermissionsResponse addEnginePermissionsItem(String enginePermissionsItem) {
        if (this.enginePermissions == null) {
            this.enginePermissions = new ArrayList<>();
        }
        this.enginePermissions.add(enginePermissionsItem);
        return this;
    }

    public ListsAgencyPermissionsResponse withEnginePermissions(Consumer<List<String>> enginePermissionsSetter) {
        if (this.enginePermissions == null) {
            this.enginePermissions = new ArrayList<>();
        }
        enginePermissionsSetter.accept(this.enginePermissions);
        return this;
    }

    /**
     * -  GaussDB ReadOnlyAccess 云数据库 GaussDB服务的只读访问权限 -  GeminiDB ReadOnlyAccess 分布式多模NoSQL数据库服务只读权限 -  GaussDBforMSQLReadOnlyAccess 云数据库HUAWEIGaussDBforMSQL服务的只读访问权限 -  DWS ReadOnlyAccess 数据仓库服务只读权限 -  DDM ReadOnlyAccess 分布式数据库中间件服务只读权限 -  DDS ReadOnlyPolicy 文档数据库服务资源只读权限 -  RDS ReadOnlyAccess 关系型数据库服务资源只读权限 -  MRS ReadOnlyAccess MapReduce服务只读权限,包括集群查询操作,基础服务弹性云服务器、裸金属服务器、云硬盘、虚拟私有云只读权限
     * @return enginePermissions
     */
    public List<String> getEnginePermissions() {
        return enginePermissions;
    }

    public void setEnginePermissions(List<String> enginePermissions) {
        this.enginePermissions = enginePermissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListsAgencyPermissionsResponse that = (ListsAgencyPermissionsResponse) obj;
        return Objects.equals(this.commonPermissions, that.commonPermissions)
            && Objects.equals(this.enginePermissions, that.enginePermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commonPermissions, enginePermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListsAgencyPermissionsResponse {\n");
        sb.append("    commonPermissions: ").append(toIndentedString(commonPermissions)).append("\n");
        sb.append("    enginePermissions: ").append(toIndentedString(enginePermissions)).append("\n");
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

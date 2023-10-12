package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdministrationAgencyNamePrimitiveTypeHolder
 */
public class AdministrationAgencyNamePrimitiveTypeHolder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "administration_agency_name")

    private String administrationAgencyName;

    public AdministrationAgencyNamePrimitiveTypeHolder withAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
        return this;
    }

    /**
     * 管理委托名称  资源编排服务使用该委托获取成员账号委托给管理账号的权限  当用户定义SELF_MANAGED权限类型时，administration_agency_name和administration_agency_urn 必须有且只有一个存在。  推荐用户在使用v5委托时给与administration_agency_urn，administration_agency_name只支持接收v3委托名称，若给与了v5委托名称，则会在部署模板时失败。  当用户使用SERVICE_MANAGED权限类型时，指定该参数将报错400。
     * @return administrationAgencyName
     */
    public String getAdministrationAgencyName() {
        return administrationAgencyName;
    }

    public void setAdministrationAgencyName(String administrationAgencyName) {
        this.administrationAgencyName = administrationAgencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdministrationAgencyNamePrimitiveTypeHolder that = (AdministrationAgencyNamePrimitiveTypeHolder) obj;
        return Objects.equals(this.administrationAgencyName, that.administrationAgencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administrationAgencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdministrationAgencyNamePrimitiveTypeHolder {\n");
        sb.append("    administrationAgencyName: ").append(toIndentedString(administrationAgencyName)).append("\n");
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

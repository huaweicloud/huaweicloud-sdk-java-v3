package com.huaweicloud.sdk.eihealth.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 模型供应商修改请求体。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
 */
public class UpdateModelVendorReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info")

    private VendorAuthInfo authInfo;

    public UpdateModelVendorReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模型供应商名称。 **约束限制**： 不涉及 **取值范围**： 支持中英文、数字、下划线、中划线、空格，长度2-64。 **默认取值**： 不涉及 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateModelVendorReq withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * **参数解释**： 模型供应商英文名称。 **约束限制**： 不涉及 **取值范围**： 支持英文、数字、下划线、中划线、空格，长度2-64。 **默认取值**： 不涉及 
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public UpdateModelVendorReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模型供应商描述。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateModelVendorReq withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * **参数解释**： 鉴权类型。 **约束限制**： 不涉及 **取值范围**： * api_key：API Key **默认取值**： 不涉及 
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public UpdateModelVendorReq withAuthInfo(VendorAuthInfo authInfo) {
        this.authInfo = authInfo;
        return this;
    }

    public UpdateModelVendorReq withAuthInfo(Consumer<VendorAuthInfo> authInfoSetter) {
        if (this.authInfo == null) {
            this.authInfo = new VendorAuthInfo();
            authInfoSetter.accept(this.authInfo);
        }

        return this;
    }

    /**
     * Get authInfo
     * @return authInfo
     */
    public VendorAuthInfo getAuthInfo() {
        return authInfo;
    }

    public void setAuthInfo(VendorAuthInfo authInfo) {
        this.authInfo = authInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateModelVendorReq that = (UpdateModelVendorReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.description, that.description) && Objects.equals(this.authType, that.authType)
            && Objects.equals(this.authInfo, that.authInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameEn, description, authType, authInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateModelVendorReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
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

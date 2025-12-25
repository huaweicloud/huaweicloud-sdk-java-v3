package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网站
 */
public class Website {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_domain")

    private String mainDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_status")

    private String protectedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_public")

    private Boolean isPublic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_server")

    private List<String> nameServer = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_properties")

    private WebsiteExtendProperties extendProperties;

    public Website withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 网站url
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Website withMainDomain(String mainDomain) {
        this.mainDomain = mainDomain;
        return this;
    }

    /**
     * 主域名
     * @return mainDomain
     */
    public String getMainDomain() {
        return mainDomain;
    }

    public void setMainDomain(String mainDomain) {
        this.mainDomain = mainDomain;
    }

    public Website withProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * WAF开启状态：OPEN | CLOSE
     * @return protectedStatus
     */
    public String getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public Website withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * 外网或内网 true：外网 false: 内网
     * @return isPublic
     */
    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Website withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 网站备注
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Website withNameServer(List<String> nameServer) {
        this.nameServer = nameServer;
        return this;
    }

    public Website addNameServerItem(String nameServerItem) {
        if (this.nameServer == null) {
            this.nameServer = new ArrayList<>();
        }
        this.nameServer.add(nameServerItem);
        return this;
    }

    public Website withNameServer(Consumer<List<String>> nameServerSetter) {
        if (this.nameServer == null) {
            this.nameServer = new ArrayList<>();
        }
        nameServerSetter.accept(this.nameServer);
        return this;
    }

    /**
     * 网站服务器列表
     * @return nameServer
     */
    public List<String> getNameServer() {
        return nameServer;
    }

    public void setNameServer(List<String> nameServer) {
        this.nameServer = nameServer;
    }

    public Website withExtendProperties(WebsiteExtendProperties extendProperties) {
        this.extendProperties = extendProperties;
        return this;
    }

    public Website withExtendProperties(Consumer<WebsiteExtendProperties> extendPropertiesSetter) {
        if (this.extendProperties == null) {
            this.extendProperties = new WebsiteExtendProperties();
            extendPropertiesSetter.accept(this.extendProperties);
        }

        return this;
    }

    /**
     * Get extendProperties
     * @return extendProperties
     */
    public WebsiteExtendProperties getExtendProperties() {
        return extendProperties;
    }

    public void setExtendProperties(WebsiteExtendProperties extendProperties) {
        this.extendProperties = extendProperties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Website that = (Website) obj;
        return Objects.equals(this.value, that.value) && Objects.equals(this.mainDomain, that.mainDomain)
            && Objects.equals(this.protectedStatus, that.protectedStatus)
            && Objects.equals(this.isPublic, that.isPublic) && Objects.equals(this.remark, that.remark)
            && Objects.equals(this.nameServer, that.nameServer)
            && Objects.equals(this.extendProperties, that.extendProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, mainDomain, protectedStatus, isPublic, remark, nameServer, extendProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Website {\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    mainDomain: ").append(toIndentedString(mainDomain)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
        sb.append("    nameServer: ").append(toIndentedString(nameServer)).append("\n");
        sb.append("    extendProperties: ").append(toIndentedString(extendProperties)).append("\n");
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

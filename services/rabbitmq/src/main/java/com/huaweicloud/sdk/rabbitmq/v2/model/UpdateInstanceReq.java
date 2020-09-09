package com.huaweicloud.sdk.rabbitmq.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UpdateInstanceReq
 */
public class UpdateInstanceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_begin")
    
    private String maintainBegin;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="maintain_end")
    
    private String maintainEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private String securityGroupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_publicip")
    
    private Boolean enablePublicip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_id")
    
    private String publicipId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public UpdateInstanceReq withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 实例名称。  由英文字符开头，只能由英文字母、数字、中划线组成，长度为4~64的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateInstanceReq withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 实例的描述信息。  长度不超过1024的字符串。 > \\与\"在json报文中属于特殊字符，如果参数值中需要显示\\或者\"字符，请在字符前增加转义字符\\，比如\\\\或者\\\"。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateInstanceReq withMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
        return this;
    }

    


    /**
     * 维护时间窗开始时间，格式为HH:mm:ss。   - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-rabbitmq/ShowMaintainWindows.html)。   - 开始时间必须为22:00:00、02:00:00、06:00:00、10:00:00、14:00:00和18:00:00。   - 该参数不能单独为空，若该值为空，则结束时间也为空。系统分配一个默认开始时间02:00:00。
     * @return maintainBegin
     */
    public String getMaintainBegin() {
        return maintainBegin;
    }

    public void setMaintainBegin(String maintainBegin) {
        this.maintainBegin = maintainBegin;
    }

    public UpdateInstanceReq withMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
        return this;
    }

    


    /**
     * 维护时间窗结束时间，格式为HH:mm:ss。   - 维护时间窗开始和结束时间必须为指定的时间段，可参考[查询维护时间窗时间段](https://support.huaweicloud.com/api-rabbitmq/ShowMaintainWindows.html)。   - 结束时间在开始时间基础上加四个小时，即当开始时间为22:00:00时，结束时间为02:00:00。   - 该参数不能单独为空，若该值为空，则开始时间也为空。系统分配一个默认结束时间06:00:00。
     * @return maintainEnd
     */
    public String getMaintainEnd() {
        return maintainEnd;
    }

    public void setMaintainEnd(String maintainEnd) {
        this.maintainEnd = maintainEnd;
    }

    public UpdateInstanceReq withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    


    /**
     * 安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public UpdateInstanceReq withEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
        return this;
    }

    


    /**
     * RabbitMQ实例是否开启公网访问功能。   - true：开启   - false：不开启
     * @return enablePublicip
     */
    public Boolean getEnablePublicip() {
        return enablePublicip;
    }

    public void setEnablePublicip(Boolean enablePublicip) {
        this.enablePublicip = enablePublicip;
    }

    public UpdateInstanceReq withPublicipId(String publicipId) {
        this.publicipId = publicipId;
        return this;
    }

    


    /**
     * RabbitMQ实例绑定的弹性IP地址的id。  如果开启了公网访问功能（即enable_publicip为true），该字段为必选。  获取方法：   - 方法1：登录弹性公网IP和带宽的控制台界面，在弹性公网IP的详情页面查的基本信息栏找ID。   - 方法2：通过弹性公网IP的API接口查询，具体操作可参考[查询公网IP ID](https://support.huaweicloud.com/api-eip/eip_api_0003.html)。
     * @return publicipId
     */
    public String getPublicipId() {
        return publicipId;
    }

    public void setPublicipId(String publicipId) {
        this.publicipId = publicipId;
    }

    public UpdateInstanceReq withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateInstanceReq updateInstanceReq = (UpdateInstanceReq) o;
        return Objects.equals(this.name, updateInstanceReq.name) &&
            Objects.equals(this.description, updateInstanceReq.description) &&
            Objects.equals(this.maintainBegin, updateInstanceReq.maintainBegin) &&
            Objects.equals(this.maintainEnd, updateInstanceReq.maintainEnd) &&
            Objects.equals(this.securityGroupId, updateInstanceReq.securityGroupId) &&
            Objects.equals(this.enablePublicip, updateInstanceReq.enablePublicip) &&
            Objects.equals(this.publicipId, updateInstanceReq.publicipId) &&
            Objects.equals(this.enterpriseProjectId, updateInstanceReq.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, description, maintainBegin, maintainEnd, securityGroupId, enablePublicip, publicipId, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    maintainBegin: ").append(toIndentedString(maintainBegin)).append("\n");
        sb.append("    maintainEnd: ").append(toIndentedString(maintainEnd)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    enablePublicip: ").append(toIndentedString(enablePublicip)).append("\n");
        sb.append("    publicipId: ").append(toIndentedString(publicipId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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


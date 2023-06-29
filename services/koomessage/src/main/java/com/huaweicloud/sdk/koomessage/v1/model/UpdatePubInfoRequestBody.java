package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新服务号请求体。
 */
public class UpdatePubInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_reason")

    private String changeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_img")

    private String logoImg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_files")

    private List<String> authorizationFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_name")

    private String pubName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_abstract")

    private String pubAbstract;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pub_remark")

    private String pubRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_get_port")

    private Integer autoGetPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signs_for_auto_get_port")

    private List<String> signsForAutoGetPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "industry")

    private Integer industry;

    public UpdatePubInfoRequestBody withChangeReason(String changeReason) {
        this.changeReason = changeReason;
        return this;
    }

    /**
     * 更新原因。
     * @return changeReason
     */
    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public UpdatePubInfoRequestBody withLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }

    /**
     * 服务号LOGO图片资源ID。  > 通过上传智能信息服务号图片资源接口上传LOGO图片后获得的图片resource_id。图片要求大于等于240*240且比例相同。 
     * @return logoImg
     */
    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public UpdatePubInfoRequestBody withAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
        return this;
    }

    public UpdatePubInfoRequestBody addAuthorizationFilesItem(String authorizationFilesItem) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        this.authorizationFiles.add(authorizationFilesItem);
        return this;
    }

    public UpdatePubInfoRequestBody withAuthorizationFiles(Consumer<List<String>> authorizationFilesSetter) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        authorizationFilesSetter.accept(this.authorizationFiles);
        return this;
    }

    /**
     * 授权证明图片资源ID，最多支持6张。
     * @return authorizationFiles
     */
    public List<String> getAuthorizationFiles() {
        return authorizationFiles;
    }

    public void setAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
    }

    public UpdatePubInfoRequestBody withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public UpdatePubInfoRequestBody withPubAbstract(String pubAbstract) {
        this.pubAbstract = pubAbstract;
        return this;
    }

    /**
     * 服务号简介。
     * @return pubAbstract
     */
    public String getPubAbstract() {
        return pubAbstract;
    }

    public void setPubAbstract(String pubAbstract) {
        this.pubAbstract = pubAbstract;
    }

    public UpdatePubInfoRequestBody withPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
        return this;
    }

    /**
     * 服务号摘要。
     * @return pubRemark
     */
    public String getPubRemark() {
        return pubRemark;
    }

    public void setPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
    }

    public UpdatePubInfoRequestBody withAutoGetPort(Integer autoGetPort) {
        this.autoGetPort = autoGetPort;
        return this;
    }

    /**
     * 自动获取端口。
     * minimum: 0
     * maximum: 1
     * @return autoGetPort
     */
    public Integer getAutoGetPort() {
        return autoGetPort;
    }

    public void setAutoGetPort(Integer autoGetPort) {
        this.autoGetPort = autoGetPort;
    }

    public UpdatePubInfoRequestBody withSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
        return this;
    }

    public UpdatePubInfoRequestBody addSignsForAutoGetPortItem(String signsForAutoGetPortItem) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        this.signsForAutoGetPort.add(signsForAutoGetPortItem);
        return this;
    }

    public UpdatePubInfoRequestBody withSignsForAutoGetPort(Consumer<List<String>> signsForAutoGetPortSetter) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        signsForAutoGetPortSetter.accept(this.signsForAutoGetPort);
        return this;
    }

    /**
     * 自动收集端口使用的签名列表。  > auto_get_port为1时，该字段为必填，每个签名长度须为2-18个字符，每个服务号签名不可以重复。 
     * @return signsForAutoGetPort
     */
    public List<String> getSignsForAutoGetPort() {
        return signsForAutoGetPort;
    }

    public void setSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
    }

    public UpdatePubInfoRequestBody withIndustry(Integer industry) {
        this.industry = industry;
        return this;
    }

    /**
     * 从事行业，默认取服务号所属商家的行业分类。 - 1：金融理财 - 2：社交通讯 - 3：影音娱乐 - 4：旅游出行 - 5：购物 - 6：本地生活 - 7：运动健康 - 8：教育培训 - 9：新闻阅读 - 10：运营商  - 11：其他 
     * minimum: 1
     * maximum: 11
     * @return industry
     */
    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdatePubInfoRequestBody that = (UpdatePubInfoRequestBody) obj;
        return Objects.equals(this.changeReason, that.changeReason) && Objects.equals(this.logoImg, that.logoImg)
            && Objects.equals(this.authorizationFiles, that.authorizationFiles)
            && Objects.equals(this.pubName, that.pubName) && Objects.equals(this.pubAbstract, that.pubAbstract)
            && Objects.equals(this.pubRemark, that.pubRemark) && Objects.equals(this.autoGetPort, that.autoGetPort)
            && Objects.equals(this.signsForAutoGetPort, that.signsForAutoGetPort)
            && Objects.equals(this.industry, that.industry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeReason,
            logoImg,
            authorizationFiles,
            pubName,
            pubAbstract,
            pubRemark,
            autoGetPort,
            signsForAutoGetPort,
            industry);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePubInfoRequestBody {\n");
        sb.append("    changeReason: ").append(toIndentedString(changeReason)).append("\n");
        sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
        sb.append("    authorizationFiles: ").append(toIndentedString(authorizationFiles)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    pubAbstract: ").append(toIndentedString(pubAbstract)).append("\n");
        sb.append("    pubRemark: ").append(toIndentedString(pubRemark)).append("\n");
        sb.append("    autoGetPort: ").append(toIndentedString(autoGetPort)).append("\n");
        sb.append("    signsForAutoGetPort: ").append(toIndentedString(signsForAutoGetPort)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
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

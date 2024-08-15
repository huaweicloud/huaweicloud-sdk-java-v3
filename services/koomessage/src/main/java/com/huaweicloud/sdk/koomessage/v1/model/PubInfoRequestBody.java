package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PubRequestBody
 */
public class PubInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_img")

    private String logoImg;

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
    @JsonProperty(value = "areas_for_auto_get_port")

    private List<String> areasForAutoGetPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "industry")

    private Integer industry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_files")

    private List<String> authorizationFiles = null;

    public PubInfoRequestBody withLogoImg(String logoImg) {
        this.logoImg = logoImg;
        return this;
    }

    /**
     * 服务号LOGO图片ID。  > 通过上传智能信息服务号图片资源接口上传LOGO图片后获得的图片resource_id。图片要求大于等于240*240且比例相同。 
     * @return logoImg
     */
    public String getLogoImg() {
        return logoImg;
    }

    public void setLogoImg(String logoImg) {
        this.logoImg = logoImg;
    }

    public PubInfoRequestBody withPubName(String pubName) {
        this.pubName = pubName;
        return this;
    }

    /**
     * 服务号名称。  > 同一个企业下可以相同，不同企业下不能重复。 
     * @return pubName
     */
    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public PubInfoRequestBody withPubAbstract(String pubAbstract) {
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

    public PubInfoRequestBody withPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
        return this;
    }

    /**
     * 服务号备注。  > 同一个企业下，服务号名称相同时该项必须不同。 
     * @return pubRemark
     */
    public String getPubRemark() {
        return pubRemark;
    }

    public void setPubRemark(String pubRemark) {
        this.pubRemark = pubRemark;
    }

    public PubInfoRequestBody withAutoGetPort(Integer autoGetPort) {
        this.autoGetPort = autoGetPort;
        return this;
    }

    /**
     * 是否授权系统自动收集端口。   - 0：否 - 1：是 
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

    public PubInfoRequestBody withSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
        return this;
    }

    public PubInfoRequestBody addSignsForAutoGetPortItem(String signsForAutoGetPortItem) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        this.signsForAutoGetPort.add(signsForAutoGetPortItem);
        return this;
    }

    public PubInfoRequestBody withSignsForAutoGetPort(Consumer<List<String>> signsForAutoGetPortSetter) {
        if (this.signsForAutoGetPort == null) {
            this.signsForAutoGetPort = new ArrayList<>();
        }
        signsForAutoGetPortSetter.accept(this.signsForAutoGetPort);
        return this;
    }

    /**
     * 自动收集端口使用的签名列表。  > auto_get_port为1时，该字段为必填，每个签名长度为2-18个字符，每个服务号签名不可以重复。 
     * @return signsForAutoGetPort
     */
    public List<String> getSignsForAutoGetPort() {
        return signsForAutoGetPort;
    }

    public void setSignsForAutoGetPort(List<String> signsForAutoGetPort) {
        this.signsForAutoGetPort = signsForAutoGetPort;
    }

    public PubInfoRequestBody withAreasForAutoGetPort(List<String> areasForAutoGetPort) {
        this.areasForAutoGetPort = areasForAutoGetPort;
        return this;
    }

    public PubInfoRequestBody addAreasForAutoGetPortItem(String areasForAutoGetPortItem) {
        if (this.areasForAutoGetPort == null) {
            this.areasForAutoGetPort = new ArrayList<>();
        }
        this.areasForAutoGetPort.add(areasForAutoGetPortItem);
        return this;
    }

    public PubInfoRequestBody withAreasForAutoGetPort(Consumer<List<String>> areasForAutoGetPortSetter) {
        if (this.areasForAutoGetPort == null) {
            this.areasForAutoGetPort = new ArrayList<>();
        }
        areasForAutoGetPortSetter.accept(this.areasForAutoGetPort);
        return this;
    }

    /**
     * 自动收集端口生效的地区列表。地区取值见《地区名称列表》。  > auto_get_port为1时，该字段有效。不填则默认全国，不允许传入重叠地区。 
     * @return areasForAutoGetPort
     */
    public List<String> getAreasForAutoGetPort() {
        return areasForAutoGetPort;
    }

    public void setAreasForAutoGetPort(List<String> areasForAutoGetPort) {
        this.areasForAutoGetPort = areasForAutoGetPort;
    }

    public PubInfoRequestBody withIndustry(Integer industry) {
        this.industry = industry;
        return this;
    }

    /**
     * 从事行业，默认取服务号所属商家的行业分类。  - 1：金融理财  - 2：社交通讯  - 3：影音娱乐  - 4：旅游出行  - 5：购物  - 6：本地生活  - 7：运动健康  - 8：教育培训  - 9：新闻阅读  - 10：运营商  - 11：其他 
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

    public PubInfoRequestBody withAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
        return this;
    }

    public PubInfoRequestBody addAuthorizationFilesItem(String authorizationFilesItem) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        this.authorizationFiles.add(authorizationFilesItem);
        return this;
    }

    public PubInfoRequestBody withAuthorizationFiles(Consumer<List<String>> authorizationFilesSetter) {
        if (this.authorizationFiles == null) {
            this.authorizationFiles = new ArrayList<>();
        }
        authorizationFilesSetter.accept(this.authorizationFiles);
        return this;
    }

    /**
     * 授权证明图片ID，支持jpg、bmp、png和jpeg格式，全部图片总大小不超过4M，最多支持6张。  > 参数值为上传智能信息服务号图片资源API返回的resource_id。 
     * @return authorizationFiles
     */
    public List<String> getAuthorizationFiles() {
        return authorizationFiles;
    }

    public void setAuthorizationFiles(List<String> authorizationFiles) {
        this.authorizationFiles = authorizationFiles;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PubInfoRequestBody that = (PubInfoRequestBody) obj;
        return Objects.equals(this.logoImg, that.logoImg) && Objects.equals(this.pubName, that.pubName)
            && Objects.equals(this.pubAbstract, that.pubAbstract) && Objects.equals(this.pubRemark, that.pubRemark)
            && Objects.equals(this.autoGetPort, that.autoGetPort)
            && Objects.equals(this.signsForAutoGetPort, that.signsForAutoGetPort)
            && Objects.equals(this.areasForAutoGetPort, that.areasForAutoGetPort)
            && Objects.equals(this.industry, that.industry)
            && Objects.equals(this.authorizationFiles, that.authorizationFiles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logoImg,
            pubName,
            pubAbstract,
            pubRemark,
            autoGetPort,
            signsForAutoGetPort,
            areasForAutoGetPort,
            industry,
            authorizationFiles);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PubInfoRequestBody {\n");
        sb.append("    logoImg: ").append(toIndentedString(logoImg)).append("\n");
        sb.append("    pubName: ").append(toIndentedString(pubName)).append("\n");
        sb.append("    pubAbstract: ").append(toIndentedString(pubAbstract)).append("\n");
        sb.append("    pubRemark: ").append(toIndentedString(pubRemark)).append("\n");
        sb.append("    autoGetPort: ").append(toIndentedString(autoGetPort)).append("\n");
        sb.append("    signsForAutoGetPort: ").append(toIndentedString(signsForAutoGetPort)).append("\n");
        sb.append("    areasForAutoGetPort: ").append(toIndentedString(areasForAutoGetPort)).append("\n");
        sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
        sb.append("    authorizationFiles: ").append(toIndentedString(authorizationFiles)).append("\n");
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
